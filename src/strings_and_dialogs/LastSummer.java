package strings_and_dialogs;

import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
String name;
	name = JOptionPane.showInputDialog("What is your name?")	;
JOptionPane.showMessageDialog(null, "I  know that you went out of your house last summer, " + name);
}
}
