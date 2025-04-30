package hust.soict.hedspi.aims.screen.manager;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.store.Store;

public class AddBookToStoreScreen extends JFrame{
	private Book Book;
	private Store store;
	private JTextField in_title;
	private JTextField in_category;
	private JTextField in_cost;
	public AddBookToStoreScreen (Store store) {
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		JPanel input = new JPanel(new GridLayout(5, 5));
		this.store = store;
		
		JLabel title = new JLabel("Title:");
		input.add(title);
		in_title = new JTextField();
		input.add(in_title);
		
		JLabel category = new JLabel("Category:");
		input.add(category);
		in_category = new JTextField(20);
		input.add(in_category);
		
		JLabel cost = new JLabel("Cost:");
		input.add(cost);
		in_cost = new JTextField();
		input.add(in_cost);
		
		JButton add = new JButton("Add new Book");
		add.addActionListener(new AddNewBook());
		input.add(add);
		cp.add(input);
		
		setTitle("Add Book"); 
		setSize(500, 500); 
		setLocationRelativeTo(null); 
		setVisible(true); 
	}
	
	public class AddNewBook implements ActionListener {
	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	Book Book = new Book();
	    	Book.setTitle(in_title.getText());
	    	Book.setCategory(in_category.getText());
	        try {
	        	Book.setCost(Float.parseFloat(in_cost.getText()));
	        } catch (NumberFormatException ex) {
	            System.out.println("Chi phí không hợp lệ!");
	            return;
	        }

	        store.addMedia(Book);
	    }
	}

}
