package Glava1;

public class Logic {

    public void count(String name){
        for(int i=0;i<10;i++){
            System.out.println(name+ " "+i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("error");
            }
        }
    }
}
