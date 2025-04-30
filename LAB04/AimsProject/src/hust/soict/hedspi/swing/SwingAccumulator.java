package hust.soict.hedspi.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingAccumulator extends JFrame {
    private JTextField tfInput;
    private JTextField tfOutput;
    private int sum = 0; // Accumulated sum, init to 0

    // Constructor to setup the GUI components and event handlers
    public SwingAccumulator() {
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(2, 2)); // Đặt dòng và cột cho giao diện hiển thị, ở đây thì ta chỉ cần đặt là 1, 2 dòng vì 2 đối tượng là "Nhập số nguyên", "Kết quả đầu ra"

        cp.add(new JLabel("Nhập một số nguyên: "));
        tfInput = new JTextField(10);
        cp.add(tfInput);
        tfInput.addActionListener(new TFInputListener());

        cp.add(new JLabel("Tổng cộng dồn là: "));
        tfOutput = new JTextField(10);
        tfOutput.setEditable(false); // Cho phép thay đổi số bên dưới hay không? Nếu có thể = true, ngược lại = false
        cp.add(tfOutput);	

        // Điều chỉnh giao diện
        setTitle("Phép tổng cộng dồn"); // Tiêu đề của ứng dụng VD: "Swing Accumulator"
        setSize(350, 120); // Kích cỡ giao diện ban đầu
        setVisible(true); // Cho phép hiển thị giao diện vừa cài không
    }

    public static void main(String[] args) {
        new SwingAccumulator();
    }

    private class TFInputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            int numberIn = Integer.parseInt(tfInput.getText());
            sum += numberIn;
            tfInput.setText("");
            tfOutput.setText(sum + "");
        }
    }
}
