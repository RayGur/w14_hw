public class Sample5_3 {
    public static void main(String[] args) {
        try{
            int[] test = new int[5];

            System.out.println("before assign");

            test[10] = 93;

            System.out.println("after assign");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("out of bound");
        }finally {
            System.out.println("must run");
        }
        System.out.println("program finished");
    }
}
