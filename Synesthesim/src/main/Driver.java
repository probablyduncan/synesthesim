package main;

public class Driver {
	
	private static final int WIDTH = 860;
	private static final int HEIGHT = 640;

	public static void main(String[] args) {
		
		Synesthesim syn = new Synesthesim(WIDTH, HEIGHT);
		syn.start();
		
	}
	
}
