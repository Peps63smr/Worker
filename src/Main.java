public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();

        worker.Worker(result -> {
            System.out.println(result);
        });

        worker.errorWorker(error -> {
            System.err.println("Error: " + error);
        });

        worker.start();
    }
}