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
	JFrame frame= new JFrame("Guest List");
	JPanel panel = new JPanel();
	JButton button = new JButton("Add Name");
	JButton button2 = new JButton("View Names");
	static ArrayList<String> guests= new ArrayList<String>();

	public static void main(String[] args) {
		new _02_GuestBook().createUI();
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
	button.addActionListener(this);
	button2.addActionListener(this);
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button) {
		String name=JOptionPane.showInputDialog(null, "Enter a name");
		guests.add(name);
		for (int i = 0; i < guests.size(); i++) {
		String s=guests.get(i);
		JOptionPane.showMessageDialog(null, "Guest #"+ i +" "+ s);
		}
		}
	else if(e.getSource()==button2) {
		for (int i = 0; i < guests.size(); i++) {
			String s= guests.get(i);
			JOptionPane.showMessageDialog(null, "Guest #"+ i + " "+ s);
				
			}
	}
	}
	
}

