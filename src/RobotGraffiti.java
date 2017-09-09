import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot p = new Robot();
	p.setRandomPenColor();
	p.setSpeed(50);
	p.penDown();
	p.move(250);
	p.turn(90);
	
	for (int i = 0; i < 180; i++) {
	p.setRandomPenColor();
	p.move(1);
	p.turn(1);
	}
	//p.setAngle(270);
	//p.move(35);
	p.hide();
}
}
