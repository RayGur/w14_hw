package pa;

public class Car5_2 {
    private int num;
    private double gas;

    public Car5_2(){
        num = 0;
        gas = 0.0;
        System.out.println("Made a car");
    }

    public void setCar(int n, double g){
        num = n;
        gas = g;
        System.out.println("Set number to " + num + ", gas to " + gas);
    }

    public void show(){
        System.out.println("Car number: " + num + ", gas: " + gas);
    }
}
