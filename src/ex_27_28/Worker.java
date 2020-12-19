package ex_27_28;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class Worker {
    private static HttpClient client = HttpClient.newHttpClient();
    private static Gson gson = new Gson();
    private final static String path = "http://gitlessons2020.rtuitlab.ru:3000/reflectionTasks";

    @TypeOperation(name = "sum")
    public void sum(Data data) {
        int s = 0;
        for (int i : data.getNumbers()) {
            s += i;
        }
        System.out.println("Сумма: " + s);
    }

    @TypeOperation(name = "print")
    public void printWords(Data data) {
        System.out.print("Результат: ");
        for (String w : data.getWords()) {
            if (data.getWords().indexOf(w) != data.getWords().size() - 1)
                System.out.print(w  + data.getDelimeter());
            else
                System.out.print(w);
        }
    }

    public List<ReflectionTask> getTasks() {
        List<ReflectionTask> tasks = null;
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(path))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            tasks = gson.fromJson(response.body(), new TypeToken<List<ReflectionTask>>() {
            }.getType());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return tasks;
    }
}