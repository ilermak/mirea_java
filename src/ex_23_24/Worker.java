package ex_23_24;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    Gson gson = new Gson();
    String taskUrl = "http://80.87.199.76:3000/tasks";
    String repUrl = "http://80.87.199.76:3000/reports";
    String name = "Ermakov";
    HttpClient httpClient = HttpClient.newHttpClient();
    List<JsonObject> tasks = new ArrayList<>();

    String path = "src\\ex_23_24\\db.json";
    File file = new File(path);
    Writer pw;
    FileReader fr;
    JsonReader jr;
    List<Integer> ids;

    public Worker() {
        try {
            pw = new FileWriter(file,true);
            fr = new FileReader(file);
            jr = new JsonReader(fr);
            if(fr.read()==-1){
                pw.write("[]");
                pw.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        Type type = new TypeToken<List<Integer>>(){}.getType();
        ids = gson.fromJson(jr,type);
    }

    public void getTasks() {
        tasks.clear();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(taskUrl))
                .build();
        HttpResponse<String> response = null;
        try {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        JsonArray tsk = gson.fromJson(response.body(), JsonArray.class);
        for (JsonElement ob:tsk)
            tasks.add(ob.getAsJsonObject());
    }

    public double compute(String exp){
        int a,b;
        String sign;
        exp = exp.replace(" ","");
        String token1 = "(?<=\\d)(?=\\D)|(?<=\\D)(?=\\D)|(?<=\\d\\D)(?=\\d)";
        String number = "\\d+(?:\\.\\d+(?:(?:E|e)-?\\d+)?)?";
        String[] split = exp.split(token1);
        a = Integer.parseInt(split[0]);
        b = Integer.parseInt(split[2]);
        sign = split[1];
        switch (sign){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return Math.ceil(((double) a/b)/100)*100;
        }
        return 0;
    }

    public void doTasks(){

        for (JsonObject task:tasks) {
            if(!ids.contains(task.get("id").getAsInt())) {
                System.out.println(task.get("taskDescription")+" performed.");
                double taskRes = compute(task.get("expression").getAsString());
                sendReport(task.get("id").getAsInt(),taskRes);
                ids.add(task.get("id").getAsInt());

                try(FileWriter pw = new FileWriter(path);) {
                    pw.write("[");
                    pw.write(gson.toJson(ids));
                    pw.write("]");
                    pw.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void sendReport(int taskId, double res){

        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(gson.toJson(new Report(0,taskId,name,res))))
                .uri(URI.create(repUrl))
                .setHeader("Content-Type", "application/json")
                .build();
        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}