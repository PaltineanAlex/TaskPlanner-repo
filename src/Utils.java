import java.util.Scanner;

public class Utils {
    public void startText() {
        System.out.println("""
                ==============================
                ==========Task-Planner========
                ==============================""");
    }
    public void optionPrompt(){
        System.out.println("""
                What action do you want to do?
                0. Print the option menu
                1. Print Task list
                2. Add task
                3. Remove task
                4. Exit application
                """);
    }
}
