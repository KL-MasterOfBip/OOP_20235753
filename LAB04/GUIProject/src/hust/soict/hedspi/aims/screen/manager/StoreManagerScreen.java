package hust.soict.hedspi.aims.screen.manager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.store.Store;

public class StoreManagerScreen extends JFrame{
	private Store store;
	private int numOfproducts;
	JPanel createNorth() { 
		JPanel north = new JPanel(); 
		north.setLayout(new BoxLayout (north, BoxLayout.Y_AXIS)); 
		north.add(createMenuBar()); 
		north.add(createHeader()); 
		return north; 
	}
	
	JMenuBar createMenuBar() { 
		// Tạo một menu có tên Options
		JMenu menu = new JMenu("Options"); 
		
		// Một thành phần con của menu là View store
		menu.add(new JMenuItem("View store")); 
		
			// Thêm hành động cho View store
			MenuItemsListener mil = new MenuItemsListener();
			menu.getItem(0).addActionListener(mil);
			
		JMenu smUpdateStore = new JMenu("Update Store"); 
		smUpdateStore.add(new JMenuItem("Add Book")); 
		smUpdateStore.add(new JMenuItem("Add CD")); 
		smUpdateStore.add(new JMenuItem("Add DVD")); 
		menu.add(smUpdateStore);
			
			// Thêm hành động cho các lựa chọn trong Update Store
			for (int i = 0;i < smUpdateStore.getItemCount();i ++) {
				smUpdateStore.getItem(i).addActionListener(mil);
			}
		
		JMenuBar menuBar = new JMenuBar(); 
		menuBar.setLayout(new FlowLayout (FlowLayout.LEFT)); 
		menuBar.add(menu); 
		
		// Gán hành động cho từng thành phần 
		return menuBar; 
	}
	
	JPanel createHeader() { 
		JPanel header = new JPanel(); 
		header.setLayout(new BoxLayout (header, BoxLayout.X_AXIS)); 
		
		JLabel title = new JLabel("AIMS"); 
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50)); 
		title.setForeground (Color.CYAN); 
		
		header.add(Box.createRigidArea (new Dimension (10, 10))); 
		header.add(title); 
		header.add(Box.createHorizontalGlue()); 
		header.add(Box.createRigidArea (new Dimension (10, 10))); 
		return header; 
	} 
	
	JPanel createCenter() { 
		JPanel center = new JPanel(); 
		center.setLayout(new GridLayout (3, 3, 2, 2)); 
		ArrayList<Media> mediaInStore = store.getItemsInStore(); 
		for (int i = 0; i < this.numOfproducts; i++) { 
			MediaStore cell = new MediaStore (mediaInStore.get(i)); 
			center.add(cell); 
		} 
		return center; 
	}
	
	public Store getStore () {
		return this.store;
	}
	
	public StoreManagerScreen (Store store) {
		this.store = store;
		this.numOfproducts = store.getItemsInStore().size();
		
		Container cp = getContentPane(); 
		cp.setLayout(new BorderLayout()); 
		cp.add(createNorth(), BorderLayout.NORTH); 
		cp.add(createCenter(), BorderLayout.CENTER);
		
		setTitle("Store"); 
		setSize(1024, 768); 
		setLocationRelativeTo(null); 
		setVisible(true); 
	}
	
	public static void main (String[] args) {
		Store Khanh = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc ("The Lion King", "Animation", "Roger Allers", 87, 19.95f); 
		Khanh.addMedia(dvd1);
		Khanh.addMedia(new DigitalVideoDisc ("The Lion King", "Animation", "Roger Allers", 87, 19.95f));
		new StoreManagerScreen(Khanh);
	}
	
	public class MenuItemsListener implements ActionListener{
		@Override
		public void actionPerformed (ActionEvent e) {
			String command = e.getActionCommand();
			if (command == "View store") {
				new ViewStore(getStore());
			}
			else if (command == "Add Book") {
				new AddBookToStoreScreen(getStore());
				}
				else if (command == "Add CD") {
					new AddCompactDiscToStoreScreen(getStore());
				}
				else if (command == "Add DVD") {
					new AddDigitalVideoDiscToStoreScreen(getStore());
				}
		}
	}
}
