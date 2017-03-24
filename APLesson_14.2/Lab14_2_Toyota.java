import java.util.ArrayList;
import java.util.Arrays;

public class Lab14_2_Toyota extends Lab14_2_Car
{
	private double xcoor;
	private double ycoor;
	
	public Lab14_2_Toyota(String s)
	{
		super();
	
		ArrayList<String> position = new ArrayList<>(Arrays.asList(s.split(", ")));
		Double sX = Double.parseDouble(position.get(0));
		Double sY = Double.parseDouble(position.get(1));
		move(sX, sY);
	}
}