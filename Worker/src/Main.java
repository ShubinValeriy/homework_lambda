public class Main {
    public static void main(String[] args) {
        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener errorListener = () -> System.out.println("WARNING!!! Task in not done!");
        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }
}
