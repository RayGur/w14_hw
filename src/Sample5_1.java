public class Sample5_1 {
    public static void main(String[] args) {
        int[] test =  new int[5];

        System.out.println("set value of test");

        test[10] = 80; //10 is out of range of 5
        System.out.println("set 80 at test[10]");
        System.out.println("program finished");
    }
}
