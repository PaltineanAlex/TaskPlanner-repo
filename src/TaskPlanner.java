import java.util.ArrayList;

public class TaskPlanner {
    private ArrayList<Task> taskList = new ArrayList<>();

    public void printTaskList(){
        System.out.println("You have " + taskList.size() + " tasks in your list.");
        int i = 0;
        for(Task task : taskList){
            System.out.println((i+1) +". " + task.getTaskName() + ". Is task done? " + task.getIsDone());
            i++;
        }
    }

    public boolean addTask(Task task){
        if(findTask(task.getTaskName()) >= 0){
            System.out.println("The task has been already added!");
            return false;
        }
        taskList.add(task);
        System.out.println("Task added successfully.");
        return true;
    }

    public boolean modifyTask(Task oldTask, Task newTask){
        if(findTask(oldTask.getTaskName()) < 0){
            System.out.println("The task that you are trying to modify doesn't exist.");
            return false;
        }
        taskList.set(findTask(oldTask), newTask);
        System.out.println("Task modified successfully.");
        return true;
    }

    public boolean removeTask(Task task){
        if(findTask(task.getTaskName()) < 0){
            System.out.println("THe task that you are trying to remove doesn't exist.");
            return false;
        }

        taskList.remove(task);
        System.out.println("Task removed successfully.");
        return true;
    }

    public boolean isDone(Task undoneTask, Task doneTask){
        if(findTask(undoneTask.getTaskName()) < 0){
            System.out.println("The task that you are looking fore doesn't exist.");
            return false;
        }

        taskList.set(findTask(undoneTask), doneTask);
        System.out.println("Task marked as done successfully.");
        return true;
    }

    private int findTask(Task task){
        return taskList.indexOf(task);
    }

    private int findTask(String taskName){
        for(int i = 0; i < taskList.size(); i++){
            Task task = taskList.get(i);
            if(task.getTaskName().equals(taskName)){
                return i;
            }
        }
        return -1;
    }

    public Task queryTask(String taskName){
        if(findTask(taskName) >= 0){
            return taskList.get(findTask(taskName));
        }
        return null;
    }
}
