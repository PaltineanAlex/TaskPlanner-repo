public class Main {
    public static void main(String[] args) {

        User u1 = new User("Ana", 1234);
        User u2 = new User("Alex", 2468);
        Task task = new Task();

        u1.greetingUser(u1.getName());
        task.createTask();
    }
}