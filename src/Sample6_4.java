public class Sample6_4 {
    public static void main(String[] args) {
        Car4 car = new Car4("car1");
        car.start();
        try{
            for(int i = 0; i < 5; i++){
                Thread.sleep(1000);
                System.out.println("working on main()");
            }
        }catch(InterruptedException e){
        }
    }
}

class Car4 extends Thread{
    private String name;

    public Car4(String nm){
        name = nm;
    }
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("working on " + name);
        }
    }
}