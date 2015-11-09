import java.util.*;

public class RobotG{

	protected Position position;
	protected Direction direction;

	public RobotG() {
		position = new Position();
		direction = Direction.Est;
	}
	
	public RobotG(Position pos, Direction dir) {
		position = new Position(pos);
		direction = dir;
	}
	
	public void tourne(){

		if(direction == Direction.Nord)  direction = Direction.Est;
		if(direction == Direction.Est)  direction = Direction.Sud;
		if(direction == Direction.Sud)  direction = Direction.Ouest;
		if(direction == Direction.Ouest) direction = Direction.Nord;
	}
}
