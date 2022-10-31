public class Task {
    private String taskName;
    private String taskDescription;

    private String isDone;

    public Task(String taskName, String taskDescription, String isDone) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.isDone = isDone;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public String getIsDone() {
        return isDone;
    }
}
