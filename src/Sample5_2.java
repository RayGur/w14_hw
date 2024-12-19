public class Sample5_2 {
    public static void main(String[] args) {
        try{
            int[] test = new int[5];

            System.out.println("before assign");

            test[10] = 89;
            System.out.println("after assign");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("out of bounds");
        }
        System.out.println("program finished");
    }
}
