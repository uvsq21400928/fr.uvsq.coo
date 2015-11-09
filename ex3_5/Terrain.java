import java.util.*;

public class Terrain{
	
	private ArrayList<RobotG> listRobo;

	public Terrain(){
	listRobo = new ArrayList<RobotG>();
	}
	
	public void avancerTous()
	{
		for(int i = 0; i < listRobo.size(); i++)
			listRobo.get(i).avance();
	}

}
