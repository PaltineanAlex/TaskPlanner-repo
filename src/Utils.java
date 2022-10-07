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
                1. Add task
                2. Remove task
                3. See TaskList
                4. Exit application""");
    }

    public void greeting(String name){
        System.out.printf("Hello, %s. I hope you're having a great day so far!%n", name);
    }
}
