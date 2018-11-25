package strings_and_dialogs;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
	JOptionPane.showInputDialog("What is your favorite color?");
	JOptionPane.showMessageDialog(null, "OMG! That's my favorite color to!");
Robot bobby = new Robot();
bobby.penDown();
bobby.setSpeed(70);
bobby.move(300);
bobby.turn(120);
bobby.move(300);
bobby.turn(120);
bobby.move(300);
}
}
