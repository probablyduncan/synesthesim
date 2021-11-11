package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {

	//this points a the index, a keycode, to an int between 0 and 35
	//which can be used to identify a Character
	private int[] keyList;
	private boolean firstKey;

	public KeyManager() {
		firstKey = false;
		
		keyList = new int[100];
		for(int i = 0; i < 10; i++) keyList[i+48] = i;
		for(int i = 0; i < 26; i++) keyList[i+65] = i+11;
	}
	
	public boolean firstKey() {
		return firstKey;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(keyList[e.getKeyCode()]);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

}
