package Glava2;

public class Produser implements Runnable {
    Area area;
    Thread q;

    Produser(Area area){
        this.area=area;
        q=new Thread(this);
        q.start();
    }

    public void run(){
        while(area.perem2!=7){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            area.put();
        }
    }
}
