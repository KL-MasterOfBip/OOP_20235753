package hust.soict.hedspi.aims.screen.manager;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.store.Store;

public class ViewStore extends JFrame{
	
	public ViewStore (Store store) {
		JTextArea items = new JTextArea();
		items.setEditable(false);
		for (Media tmp : store.getItemsInStore()) {
			items.append(tmp.toString() + "\n");
		}
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(items);
		
		setTitle("View Store"); 
		setSize(500, 500); 
		setLocationRelativeTo(null); 
		setVisible(true); 
	}
}
