public class Task {
    private static int taskCounter = 0;

    static {
        taskCounter++;
    }

    private String description;
    private boolean done;

    public Task(String description, boolean done) {
        this.description = description;
        this.done = done;
    }
    public Task(String description) {
        this.description = description;
        this.done = false;
    }
    public static int getTaskCount() {
        return taskCounter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
