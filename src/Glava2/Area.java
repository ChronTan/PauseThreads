package Glava2;

public class Area {

    int count;
    int perem1=0;
    int perem2=0;


    public synchronized void get(){
        if(perem1>4 && perem2!=7){
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("error");
            }
        }else{
            System.out.println("perem1= "+ perem1);
            perem1++;
        }
        if(perem1==4)
        notify();

    }


    public synchronized void put(){
        if(perem2==0 && perem1<4){
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("error");
            }
        }else{
            System.out.println("perem2= " + perem2);
            perem2++;
        }
        if(perem2==7)
            notifyAll();

    }



}


