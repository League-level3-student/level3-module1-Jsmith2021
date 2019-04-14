package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener{
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame= new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Add Name");
	JButton button2 = new JButton("View Names");
	
	public static void main(String[] args) {
		new _02_GuestBook().createUI();
		ArrayList<String> guests= new ArrayList<String>();
		guests.add("Bob Banders");
		guests.add("Sandy Summers");
		guests.add("Greg Ganders");
		guests.add("Donny Doners");
	}
	
public void createUI() {
	frame.add(panel);
	frame.setVisible(true);
	frame.pack();
	panel.add(button);
	panel.add(button2);
}



@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button) {
	String names=JOptionPane.showInputDialog("Enter a name");
		}
	}
	
}

