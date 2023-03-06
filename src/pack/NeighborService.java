package pack;

import java.awt.Point;
import java.util.List;

/**
 * Template for finding neighbor content in a matrix 
 * Mainz, 13.01.2023, version 1.0
 * 
 * @author Frank Mehler
 */
public interface NeighborService {
	/**
	 * Find all the values of the neighbors, topology torus
	 * 
	 * @param coordinate is the coordinate of the point for which the neighbors are
	 *                   considered
	 * @param values     data of the matrix (system state)
	 * @return all the values of the neighbors in a list
	 * 
	 *         Example values 
	 *         1 2 3 
	 *         4 5 6 
	 *         7 8 9	 
	 *         Example: coordinate 0/0 as input results in output list: 2,3,4,7
	 */
	public List<Integer> getValuesFromNeighbors(Point coordinate, StateValues values);
}
