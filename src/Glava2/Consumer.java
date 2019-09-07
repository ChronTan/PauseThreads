package Glava2;

public class Consumer implements Runnable{
    Area area;
    int b=0;
    Thread q;

    Consumer(Area area){
        this.area=area;
        q=new Thread(this);
        q.start();
    }

    public void run(){
        while(area.perem1!=7){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            area.get();
        }
    }
}
