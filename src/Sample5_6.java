import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Sample5_6 {
    public static void main(String[] args)throws IOException {
        System.out.println("input a string");
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str = br.readLine();

            System.out.println("input is :" + str);
        }catch(IOException e){
            System.out.println("input error");
        }
    }
}
