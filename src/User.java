import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    private String name;
    private int PIN;
    private List<Task> tasks = new ArrayList<>();

    public User(String name, int PIN){
        this.name = name;
        this.PIN = PIN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public void createTask(){
        Scanner in = new Scanner(System.in);
        System.out.printf("Task %d: ", Task.getTaskCount());
        tasks.add(new Task(in.nextLine()));
    }

    public void removeTask(){
        Scanner in = new Scanner(System.in);
        System.out.println("Which task do you want to remove?");
        int taskNumber = in.nextInt();
        tasks.remove(taskNumber);
    }

    public void checkTask(){
        Scanner in = new Scanner(System.in);
        System.out.println("Which task do you want to mark as done?");
        int taskNumber = in.nextInt();
        //TO DO this method
    }

    public void seeList(){ //Need to check if it actually works
        for(Task task: tasks){
            System.out.println(task);
        }
    }

    public void saveTask(String name){
        String text = "";
        try(FileWriter fw = new FileWriter("TaskList" + name)){
            //TO DO saveTasks method
        }catch(IOException e){
            System.out.println("I have no idea.");
        }
    }

}
