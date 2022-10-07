import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    private String name;
    private int PIN;
    private List<String> tasks = new ArrayList<String>();
    private String task;

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
        System.out.print("Task: ");
        String answer = in.nextLine();
        tasks.add(answer);
    }

    public void removeTask(){ //Make this method work
        Scanner in = new Scanner(System.in);
        System.out.println("Which task do you want to remove?(Task count starts form 0)");
        int taskNumber = in.nextInt();
        tasks.remove(taskNumber);
    }

    public void seeList(){
        try(Scanner in = new Scanner(new File("ListTask.txt"))){
            String line = null;
            while(in.hasNext()){
                System.out.println(in.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveTask(){
        try(PrintWriter pw = new PrintWriter(new FileWriter("ListTask.txt", true))){
            for(String task : tasks){
                pw.write(task);
                pw.println();
            }
        }catch(Exception e){
            System.out.println("There is an error!");
        }
    }
}
