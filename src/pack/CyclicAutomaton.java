package pack;

public class CyclicAutomaton {
	
	public StateValues currentStateValues;
	public StateValues nextStateValues;
	Render render;
	NeighborService neighbourservice;
	
	final int MAX_ITERATIONS = 10 * StateValues.size;
	
	public void simulate() {
		for (int t = 1; t < MAX_ITERATIONS; t++) {
			render.repaint(); // show the current values
			pauseBetweenIterations(); // Thread.sleep(pauseInMs);
			calculateNextGeneration();
		}
	}
	
	private void pauseBetweenIterations() {
		try {
			Thread.sleep(MAX_ITERATIONS);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}
