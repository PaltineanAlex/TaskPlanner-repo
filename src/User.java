public class User {
    private String name;
    private int PIN;

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

    public void greetingUser(String name){
        System.out.println("Hello, " + name + "!");
    }

}
