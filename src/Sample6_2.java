public class Sample6_2 {
    public static void main(String[] args) {
        Car2 car1 = new Car2("car1");
        car1.start();

        Car2 car2 = new Car2("car2");
        car2.start();

        for(int i = 0; i < 5; i++){
            System.out.println("working on main()");
        }
    }
}

class Car2 extends Thread{
    private String name;

    public Car2(String nm){
        name = nm;
    }
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("working on " + name);
        }
    }
}