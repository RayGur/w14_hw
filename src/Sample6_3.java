public class Sample6_3 {
    public static void main(String[] args) {
        Car3 car = new Car3("car1");
        car.start();

        for(int i = 0; i < 5; i++){
            System.out.println("working on main()");
        }
    }
}

class Car3 extends Thread{
    private String name;

    public Car3(String nm){
        name = nm;
    }
    public void run(){
        for(int i = 0; i < 5; i++){
            try{
                sleep(1000);
                System.out.println("working on " + name);
            }catch(InterruptedException e){

            }
        }
    }
}