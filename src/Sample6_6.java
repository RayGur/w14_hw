public class Sample6_6 {
    public static void main(String[] args) {
        Car6 car1 = new Car6("car1");
        Thread thread1 = new Thread(car1);
        thread1.start();

        for(int i = 0; i < 6; i++){
            System.out.println("working on main");
        }
    }
}

class Car6 implements Runnable{
    private String name;

    public Car6(String nm){
        name = nm;
    }
    public void run(){
        for(int i = 0; i < 6; i++){
            System.out.println("working on " + name);
        }
    }
}