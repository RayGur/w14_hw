public class Sample6_5 {
    public static void main(String[] args) {
        Car55 car1 = new Car55("car1");
        car1.start();

        try{
            car1.join();
        }
        catch(InterruptedException e){
        }
        System.out.println("finished worknig on main()");
    }
}

class Car55 extends Thread{
    private String name;

    public Car55(String nm){
        name = nm;
    }
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("working on " + name);
        }
    }
}