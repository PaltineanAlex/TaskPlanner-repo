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
}
