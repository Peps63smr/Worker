@FunctionalInterface
interface OnTaskDoneListener {
    void onDone(String result);
}

@FunctionalInterface
interface OnTaskErrorListener {
    void onError(String error);
}

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public void Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public void errorWorker(OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void start() {
        // Моделируем выполнение работы
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Task " + i + " ended with an error");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}