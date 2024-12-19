import java.util.ArrayList;
import java.util.Collections;

public class Task2_3 {
    public static void main(String[] args) {
        // 創建 ArrayList 來存儲學生姓名
        ArrayList<String> students = new ArrayList<>();

        // 新增學生
        students.add("張三");
        students.add("李四");
        students.add("王五");
        students.add("趙六");

        // 印出原始清單
        System.out.println("原始學生清單:");
        printList(students);

        // 排序清單
        Collections.sort(students);
        System.out.println("\n排序後的學生清單:");
        printList(students);

        // 移除一個學生
        students.remove("李四");
        System.out.println("\n移除李四後的清單:");
        printList(students);

        // 檢查是否包含特定學生
        String searchName = "王五";
        System.out.println("\n清單中" +
                (students.contains(searchName) ? "包含" : "不包含") +
                " " + searchName);

        // 獲取清單大小
        System.out.println("\n目前共有 " + students.size() + " 位學生");
    }

    private static void printList(ArrayList<String> list) {
        for (String student : list) {
            System.out.println(student);
        }
    }
}