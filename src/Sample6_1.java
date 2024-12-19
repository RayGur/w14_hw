public class Sample6_1 {
    public static void main(String[] args) {
        Car car = new Car("car1");
        car.start();

        for(int i = 0; i < 5; i++){
            System.out.println("working on main()");
        }
    }
}

class Car extends Thread{
    private String name;

    public Car(String nm){
        name = nm;
    }
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("working on " + name);
        }
    }
}
