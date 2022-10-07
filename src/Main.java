import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User u1 = new User("Alex", 1234);
        Utils util = new Utils();

        Scanner in = new Scanner(System.in);

        util.startText();
        util.greeting(u1.getName());
        util.optionPrompt();
        int option = in.nextInt();
        while (option != 4) {
            switch (option) {
                case 1 -> u1.createTask();
                case 2 -> u1.removeTask();
                case 3 -> u1.seeList();
            }
            util.optionPrompt();
            option = in.nextInt();
        }
        u1.saveTask();
    }
}