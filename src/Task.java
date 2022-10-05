import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {
    private List<String> task = new ArrayList<String>();
    private static int taskCounter = 0;

    public void createTask(){
        System.out.println("Do you want to create a new task? (y/n)");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        while(!answer.equals("n")){
            System.out.printf("Task %d: ", taskCounter);
            task.add(in.nextLine());
            taskCounter++;
            System.out.println("Do you want to create a new task? (y/n)");
            Scanner input = new Scanner(System.in);
            answer = in.nextLine();
        }
    }

    public void removeTask(){
        System.out.println("Do you want to remove a task? (y/n)");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        while(!answer.equals("n")){
            System.out.println("Which task do you want to remove?");
            int taskNumber = in.nextInt();
            task.remove(taskNumber);
            System.out.println("Do you want to remove a task? (y/n)");
            in = new Scanner(System.in);
            answer = in.nextLine();
        }
    }

    public void checkTask(){
        System.out.println("Do you finish a task? (y/n)");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        while(!answer.equals("n")){
            System.out.println("Which task do you want to mark as done?");
            int taskNumber = in.nextInt();
            task.add(taskNumber, " Done!");
            System.out.println("Do you want to remove a task? (y/n)");
            in = new Scanner(System.in);
            answer = in.nextLine();
        }
    }

    public void saveTask(String name){
        try(FileWriter fr = new FileWriter("TaskList" + name)){

        }catch(IOException e){
            System.out.println("The file couldn't be found!");

        }
    }

    public void printTaskList(){
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
    }
}
