package ex_23_24;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker();
        while (true) {
            worker.getTasks();
            worker.doTasks();

            try {
                Thread.sleep((long) ((Math.random()*1000)+1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
