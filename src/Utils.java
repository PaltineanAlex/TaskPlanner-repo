import java.util.Scanner;

public class Utils {
    public void loginUser(){
        Scanner in = new Scanner(System.in);
        System.out.print("Username: ");
        String username = in.nextLine();
        System.out.print("Password: ");
        int passw = in.nextInt();
    }

    public void optionPrompt(){
        System.out.println("""
                What action do you want to do?
                1. Add task
                2. Remove task
                3. Delete task""");
    }
}
