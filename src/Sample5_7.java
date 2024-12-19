import java.io.*;

public class Sample5_7 {
    public static void main(String[] args)throws IOException{
        try{
            FileWriter fw = new FileWriter("test3.txt");
            PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

            pw.println("long time ago");
            pw.println("a little girl");

            pw.close();

            System.out.println("finished writing");
        }catch(IOException e){
            System.out.println("input error");
        }
    }
}
