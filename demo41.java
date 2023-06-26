class A extends Thread{
    public void run(){
        try {
            for(int i=0;i<=50;i++){
                if(Thread.currentThread().getName().equals("BMW")){
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
                if(Thread.currentThread().getName().equals("Mercedes")){
                    System.out.println("    "+Thread.currentThread().getName()+":"+i);
                }
                if(Thread.currentThread().getName().equals("Maruti")){
                    System.out.println("        "+Thread.currentThread().getName()+":"+i);
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

public class demo41 {
    public static void main(String[] args) {
        A a= new A();
        Thread t1=new Thread(a);
        Thread t2=new Thread(a);
        Thread t3=new Thread(a);
        t1.start();
        t2.start();
        t3.start();
        t1.setName("BMW");
        t1.setName("Mercedes");
        t1.setName("Maruti");
        for(int k=0; k<=50; k++){
            try{
                System.out.println(Thread.sleep(1000));
                if(k==10){
                    t1.suspend();
                }
                if(k==20){
                    t1.suspend();
                }
                if(k==30){
                    t1.resume();
                }
                if(k==25){
                    t1.stop();
                }
                if(k==40){
                    t1.resume();
                }
            }
            catch(Exception e){

            }
        }
    }
}