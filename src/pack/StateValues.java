package pack;

import java.util.ArrayList;
import java.util.Random;

public class StateValues {
	public ArrayList<ArrayList<Integer>> cellStatus = new ArrayList<>(100);
	
	static int size = 100;
	
	private int cellStatusMax = 9;
	
	public StateValues() {
		Random randomNumber = new Random(); 
		
		for(int i = 0; i < 100; i++) {
			cellStatus.add(new ArrayList());
			
			for(int j = 0; j < 100; j++) {
				cellStatus.get(i).add(randomNumber.nextInt(cellStatusMax + 1));
			}
		}
		System.out.println(getValue(5,5));
	}

	public void setValue(int row, int column, Integer newValue) {
		cellStatus.get(row).add(column, newValue);
	}
	
	public Integer getValue(int row, int column) {
		Integer value = cellStatus.get(row).get(column);
		return value;
	}
	
	public int getCellStatusMax() {
		return cellStatusMax;
	}

	public void setCellStatusMax(int cellStatusMax) {
		this.cellStatusMax = cellStatusMax;
	}
	
	public int getSize() {
		return this.size;
	}
	
}
