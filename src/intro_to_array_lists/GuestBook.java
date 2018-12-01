package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Add Name");
	JButton button1 = new JButton("View Names");
	static ArrayList<String> names = new ArrayList<String>();
	public static void main(String[] args) {
		GuestBook Gui = new GuestBook();
		Gui.makeGui();
	}

	public void makeGui() {
		frame.add(panel);
		panel.add(button);
		panel.add(button1);
		frame.setVisible(true);
		frame.pack();
		button.addActionListener(this);
		button1.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == button) {
			String namer = JOptionPane.showInputDialog("Please add in a name");
			names.add("Guest #1: " + namer);
		}
		if (buttonPressed == button) {
			String namer = JOptionPane.showInputDialog("Please add in a name");
			names.add("Guest #2: " + namer);
		}
		if (buttonPressed == button) {
			String namer = JOptionPane.showInputDialog("Please add in a name");
			names.add("Guest #3: " + namer);
		}
		if (buttonPressed == button) {
			String namer = JOptionPane.showInputDialog("Please add in a name");
			names.add("Guest #4: " + namer);
		}
		if (buttonPressed == button1) {
			for (int i = 0; i < names.size(); i++) {
				JOptionPane.showMessageDialog(null, names.get(i));
			}

		}
	}
}

/*
 * Create a GUI with two buttons. One button reads "Add Name" and the other
 * button reads "View Names". When the add name button is clicked, display an
 * input dialog that asks the user to enter a name. Add that name to an
 * ArrayList. When the "View Names" button is clicked, display a message dialog
 * that displays all the names added to the list. Format the list as follows:
 * Guest #1: Bob Banders Guest #2: Sandy Summers Guest #3: Greg Ganders Guest
 * #4: Donny Doners
 */
