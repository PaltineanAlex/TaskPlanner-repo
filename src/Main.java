import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    private static final TaskPlanner tasks = new TaskPlanner();
    private static final Utils utils = new Utils();

    public static void main(String[] args) {
        boolean wantToQuit = false;
        int option;

        utils.startText();
        utils.optionPrompt();

        while (!wantToQuit) {
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 0 -> utils.optionPrompt();
                case 1 -> tasks.printTaskList();
                case 2 -> addTask();
                case 3 -> modifyTask();
                case 4 -> removeTask();
                case 5 -> findTask();
                //case 6 -> isDone();
                case 7 -> wantToQuit = true;
            }
        }
    }

    public static void addTask() {
        System.out.println("Enter the name of the task that you want to add: ");
        String name = input.nextLine();
        System.out.println("Enter a short description: ");
        String taskDescription = input.nextLine();
        Task newTask = new Task(name, taskDescription);
        tasks.addTask(newTask);
    }

    public static void modifyTask(){
        System.out.println("Enter the task name that you want to modify.");
        String name = input.nextLine();
        Task existingTask = tasks.queryTask(name);
        if(existingTask == null){
            System.out.println("Task not found.");
            return;
        }

        System.out.println("Enter the task name: ");
        String newTaskName = input.nextLine();
        System.out.println("Enter a short description: ");
        String newTaskDescription = input.nextLine();
        Task modifiedTask = new Task(newTaskName, newTaskDescription);
        tasks.modifyTask(existingTask, modifiedTask);
    }

    public static void removeTask(){
        System.out.println("Enter the task name: ");
        String name = input.nextLine();
        Task existingTask = tasks.queryTask(name);
        if(existingTask == null){
            System.out.println("Task not found.");
            return;
        }
        tasks.removeTask(existingTask);
    }

    public static void findTask(){
        System.out.println("Enter the name of the task you're searching for: ");
        String name = input.nextLine();
        Task existingTask = tasks.queryTask(name);
        if(existingTask == null){
            System.out.println("Task not found in list.");
            return;
        }
        System.out.println("The task: " + existingTask.getTaskName() + " has been found with the description: " + existingTask.getTaskDescription());
    }



}