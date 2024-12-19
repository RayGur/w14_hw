import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Task2_1 {

        public static void main(String[] args) {
            // 寫入檔案
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"))) {
                writer.write("這是第一行\n");
                writer.write("這是第二行\n");
                writer.write("這是第三行");
                System.out.println("檔案寫入完成");
            } catch (IOException e) {
                System.out.println("寫入檔案時發生錯誤: " + e.getMessage());
            }

            // 讀取檔案
            try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
                String line;
                System.out.println("\n讀取檔案內容:");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("讀取檔案時發生錯誤: " + e.getMessage());
            }

    }
}
