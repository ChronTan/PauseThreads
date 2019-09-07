package Glava1;

public class Threads implements Runnable{

    Logic logic;
    String name;
    Thread q;

    Threads(Logic logic, String name){
        this.logic=logic;
        this.name=name;
        q=new Thread(this);
        q.start();
    }

    public void run(){
        synchronized (logic){
            logic.count(name);
        }
    }
}
