public class Sample5_5 {
    public static void main(String[] args) throws CarException {
        Car5 car5 = new Car5();

        car5.setCar(5, -33.5);

        car5.showCar();
    }
}


//public class Sample5_5 {
//    public static void main(String[] args) {
//        Car5 car5 = new Car5();
//        try {
//            car5.setCar(5, -33.5);
//        } catch (CarException e) {
//            System.out.println("got a problem:" + e);
//        }
//        car5.showCar();
//    }
//}

class CarException extends Exception{
}

class Car5{
    private int num;
    private double gas;

    Car5(){
        num = 0;
        gas = 0.0;
        System.out.println("made a Car");
    }

    public void setCar(int n, double g) throws CarException {
        if (g < 0){
            CarException e = new CarException();
            throw e;
        }else{
            num = n;
            gas = g;
            System.out.println("set car num to " + num + ", gas to " + gas);
        }
    }

    public void showCar(){
        System.out.println("num = " + num + ", gas = " + gas);
    }
}
