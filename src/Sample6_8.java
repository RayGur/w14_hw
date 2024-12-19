public class Sample6_8 {
    public static void main(String[] args){
        Company comp = new Company();
        Driver no1 = new Driver(comp);
        no1.start();

        Driver no2 = new Driver(comp);
        no2.start();
    }
}
class Company2{
    private int sum = 0;
    public synchronized void add(int a){
        System.out.println("sum now is " + sum);
        System.out.println("adding " + a);
        sum += a;
        System.out.println("sum now is " + sum);
    }
}

class Driver2 extends Thread{
    private Company2 comp;
    public Driver2(Company2 comp){
        this.comp = comp;
    }
    public void run(){
        for(int i = 0; i < 3; i++);{
            comp.add(50);
        }
    }
}