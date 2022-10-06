import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User u1 = new User("Ana", 1234);
        User u2 = new User("Alex", 2468);
        Utils util = new Utils();

        Scanner in = new Scanner(System.in);

        util.startText();
        System.out.println("Which user are you?");
        String name = in.nextLine();
        switch (name){
            case "Ana" ->{
                util.greeting(u1.getName());
                util.optionPrompt();
                int option = in.nextInt();
                while(option != 5){
                    switch (option){
                        case 1 -> u1.createTask();
                        case 2 -> u1.removeTask();
                        case 3 -> u1.checkTask();
                        case 4 -> u1.seeList();
                    }
                    util.optionPrompt();
                    option = in.nextInt();
                }
            }
            case "Alex" ->{
                util.greeting(u2.getName());
                util.optionPrompt();
                int option = in.nextInt();
                while(option != 5){
                    switch (option){
                        case 1 -> u2.createTask();
                        case 2 -> u2.removeTask();
                        case 3 -> u2.checkTask();
                        case 4 -> u2.seeList();
                    }
                    util.optionPrompt();
                    option = in.nextInt();
                }
            }
        }
    }
}