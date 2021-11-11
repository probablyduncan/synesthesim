package main;

public class Synesthesim implements Runnable{

	private int width, height;	//width and height of window
	private boolean running;	//has the program started?
	private KeyManager km;
	private Display display;
	private Thread thread;
	
	public Synesthesim(int w, int h) {
		width = w; height = h;
		running = false;
	}
	
	public void start() {
		if(running) return;
		running = true;
		thread = new Thread();
		thread.start();
	}
	
	public void init() {
		km = new KeyManager();
		display = new Display("Synesthesim", width, height);
		display.getFrame().addKeyListener(km);
	}
	
	public void run() {

		try {
			this.init();
			
			int fps = 30;
			double timePerTick = 1000000 / fps;
			int delta = 0;
			long now;
			long lastTime = System.nanoTime();
			
			while(running) {
				
				now = System.nanoTime();
				delta += (now - lastTime) / timePerTick;
				lastTime = now;
				
				if(delta >= 1 ) {
					this.tick();
					this.render();
					delta --;
				}
			}
			
		} catch(Exception e) {}
		
	}

	private void tick() {
		// TODO Auto-generated method stub
		
	}

	private void render() {
		// TODO Auto-generated method stub
		
	}
	
}
