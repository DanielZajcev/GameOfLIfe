package pack;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class NeighborVonNeumann implements NeighborService {
	
	private final int MAX_NEIGHBORS = 4;
	
	@Override
	public List<Integer> getValuesFromNeighbors(Point coordinate, StateValues values) {
		ArrayList<Integer> neighbourValues = new ArrayList<>();	
		if(coordinate.x + 1 <= values.size)
		{
			neighbourValues.add(values.getValue(coordinate.x + 1, coordinate.y));
		}
		else
		{
			neighbourValues.add(0);
		}
		
		if(coordinate.x - 1 >= 0)
		{
			neighbourValues.add(values.getValue(coordinate.x - 1, coordinate.y));
		}
		else
		{
			neighbourValues.add(0);
		}
		
		if(coordinate.y + 1 <= values.size)
		{
			neighbourValues.add(values.getValue(coordinate.x, coordinate.y + 1));
		}
		else
		{
			neighbourValues.add(0);
		}
		
		if(coordinate.y - 1 >= 0)
		{
			neighbourValues.add(values.getValue(coordinate.x, coordinate.y - 1));
		}
		else
		{
			neighbourValues.add(0);
		}
		
		return neighbourValues;
	}

}
