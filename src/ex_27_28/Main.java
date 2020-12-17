package ex_27_28;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String path = "http://gitlessons2020.rtuitlab.ru:3000/reflectionTasks";
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(path))
                .build();
        HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        Gson gson = new Gson();
        Type taskType = new TypeToken<ArrayList<Tasks>>(){}.getType();
        List<Tasks> tasks = gson.fromJson(httpResponse.body(), taskType);

        Class<Methods> methodsClass = Methods.class;
        Class<Data> dataClass = Data.class;
        Methods methods = new Methods();
        for(Tasks task: tasks)
        {
            methodsClass.getDeclaredMethod(task.getType(),dataClass).invoke(methods,task.getData());
        }
    }
}
