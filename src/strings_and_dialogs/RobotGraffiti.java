package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot bobby = new Robot();
bobby.penDown();
bobby.setSpeed(10);
bobby.move(100);
bobby.turn(135);
bobby.move(60);
	bobby.turn(-90);
	bobby.move(60);
	bobby.turn(140);
	bobby.move(100);
	bobby.penUp();
	bobby.turn(-90);
	bobby.move(50);
	bobby.penDown();
	bobby.turn(-90);
	bobby.move(100);
	bobby.turn(145);
	bobby.move(100);
	bobby.turn(180);
	bobby.move(50);
	bobby.turn(-90);
	bobby.move(40);
	bobby.penUp();
	bobby.turn(-90);
	bobby.move(50);
	bobby.turn(90);
	bobby.move(100);
	}
}
