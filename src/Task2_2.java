import java.awt.*;
import java.awt.event.*;

public class Task2_2 extends Frame {
    private TextField num1, num2, result;
    private Button addButton;
    private Label resultLabel;

    public Task2_2() {
        setLayout(new FlowLayout());
        setTitle("簡單計算機");

        // 創建元件
        num1 = new TextField(10);
        num2 = new TextField(10);
        result = new TextField(10);
        addButton = new Button("+");
        resultLabel = new Label("= ");
        result.setEditable(false);

        // 加入元件
        add(num1);
        add(addButton);
        add(num2);
        add(resultLabel);
        add(result);

        // 註冊事件處理
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(num1.getText().trim());
                    double n2 = Double.parseDouble(num2.getText().trim());
                    double sum = n1 + n2;
                    // 如果結果是整數，則不顯示小數點
                    if (sum == (int)sum) {
                        result.setText(String.valueOf((int)sum));
                    } else {
                        result.setText(String.format("%.1f", sum));
                    }
                } catch (NumberFormatException ex) {
                    result.setText("錯誤");
                }
            }
        });

        // 視窗關閉事件
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        // 設定視窗大小和位置
        setSize(300, 100);
        setResizable(false);
        setLocationRelativeTo(null); // 視窗置中
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task2_2();
    }
}