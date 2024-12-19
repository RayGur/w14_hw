public class Sample6_7 {
    public static void main(String[] args) {
        Company comp = new Company();
        Driver no1 = new Driver(comp);
        no1.start();

        Driver no2 = new Driver(comp);
        no2.start();
    }
}
class Company{
    private int sum = 0;
    public void add(int a){
        int tmp = sum;
        System.out.println("sum now is " + tmp);
        System.out.println("adding " + a);

        tmp = tmp + a;
        System.out.println("sum now is " + tmp);
        sum = tmp;
    }
}
class Driver extends Thread{
    private Company comp;
    public Driver(Company c){
        this.comp = c;
    }
    public void run(){
        for(int i = 0; i < 3; i++);{
            comp.add(50);
        }
    }
}