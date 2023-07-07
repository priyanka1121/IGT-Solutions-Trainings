class A extends Thread{
    public void run(){
        try{
            for(int i=0; i<=10;i++){
                System.out.println("I :"+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){

 

        }
    }
}

 

class X extends Thread{
    public void run(){
        try{
            for(int j=0; j<=10;j++){
                System.out.println("\t\tJ :"+j);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){

 

        }
    }
}

 

class P extends Thread{
    public void run(){
        try{
            for(int k=0; k<=10;k++){
                System.out.println("\t\t\t\tK :"+k);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){

 

        }
    }
}

 

class Multi{
    public static void main(String args[]){
        A a = new A();
        P p = new P();
        X x = new X();
        a.start();
        p.start();
        x.start();
    }
}