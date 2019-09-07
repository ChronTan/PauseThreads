package Glava1;

public class Main {

    public static void main(String[] args) {
        Logic logic=new Logic();
        Threads t1=new Threads(logic, "First");
        Threads t2=new Threads(logic, "First");
    }
}
