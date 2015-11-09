import java.util.*;

public class Robot extends RobotG{

	public Robot() {}
	public void avancer() {
		if(direction == Direction.Nord) position.y++; 
		if(direction == Direction.Est)  position.x++; 
		if(direction == Direction.Sud)  position.y--; 
		if(direction == Direction.Ouest)  position.x--; 
	}
}
