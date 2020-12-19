package ex_27_28;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Worker worker = new Worker();
        Class<? extends Worker> aClass = worker.getClass();

        List<Method> methods = Arrays.stream(aClass.getDeclaredMethods())
                .filter(a -> Arrays.stream(a.getAnnotations())
                        .anyMatch(b -> b instanceof TypeOperation)).collect(Collectors.toList());

        List<ReflectionTask> tasks = worker.getTasks();
        TypeOperation operation;

        for (ReflectionTask task : tasks) {
            for (Method method : methods) {

                operation = method.getAnnotation(TypeOperation.class);
                if (task.getType().equals(operation.name())) {
                    try {
                        method.invoke(worker, task.getData());
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
