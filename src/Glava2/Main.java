package Glava2;

public class Main {

    public static void main(String[] args) {
        Area area=new Area();
        Produser produser=new Produser(area);
        Consumer consumer=new Consumer(area);
        Thread t1=new Thread(produser);
        Thread t2=new Thread(consumer);
    }
}
