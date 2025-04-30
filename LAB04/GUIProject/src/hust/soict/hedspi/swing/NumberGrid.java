package hust.soict.hedspi.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberGrid extends JFrame{
	private JButton[] btnNumbers = new JButton[10]; // Các nút bấm 0 - 9
	private JButton btnDelete, btnReset; // Các nút bấm xóa, reset	
	private JTextField tfDisplay; // Trường, khu vực hiển thị hoặc nhập Text
	
	public NumberGrid() {
		
		tfDisplay = new JTextField();
		tfDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		tfDisplay.setEditable(false);
		
		JPanel panelButtons = new JPanel (new GridLayout(4, 3));
		addButtons(panelButtons); // Thêm các nút vào trong cái máy tính
		
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(tfDisplay, BorderLayout.NORTH);
		cp.add(panelButtons, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Máy bấm số");
		setSize(200, 200);
		setVisible(true);
		
	}
	
	void addButtons (JPanel panelButtons) { // Thêm các nút
		ButtonListener btnListener = new ButtonListener();
		for (int i = 1;i <= 9;i ++) {
			btnNumbers[i] = new JButton("" + i);
			panelButtons.add(btnNumbers[i]);
			btnNumbers[i].addActionListener(btnListener); // Hành động của người nhập
		}
		
		btnDelete = new JButton("DEL");
		panelButtons.add(btnDelete);
		btnDelete.addActionListener(btnListener); 
		
		btnNumbers[0] = new JButton("" + 0);
		panelButtons.add(btnNumbers[0]);
		btnNumbers[0].addActionListener(btnListener);
		
		btnReset = new JButton("C");
		panelButtons.add(btnReset);
		btnReset.addActionListener(btnListener);
	}
	
	public static void main (String[] args) {
		new NumberGrid();
	}
	
	public class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed (ActionEvent e) {
			String button = e.getActionCommand();
			if (button.charAt(0) >= '0' && button.charAt(0) <= '9') {
				tfDisplay.setText(tfDisplay.getText() + button);
			}
			else if (button.equals("DEL")) {
				String tmp = tfDisplay.getText();
				if (tmp.length() != 0) {
					tmp = tmp.substring(0, tmp.length() - 1); // Lấy xâu nhỏ hơn
					tfDisplay.setText(tmp);
				}
			}
			else {
				tfDisplay.setText("");
			}
		}
		
	}
}
