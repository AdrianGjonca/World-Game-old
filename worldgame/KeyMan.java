package worldgame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyMan implements KeyListener{
	public static boolean W = false;
	public static boolean A = false;
	public static boolean S = false;
	public static boolean D = false;
	
	public static long lastTime = System.currentTimeMillis();
	public void keyPressed(KeyEvent arg0) {
		switch((arg0.getKeyChar() + "").toUpperCase()) {
		  case "W": W = true; break;
		  case "S": S = true;break;
		  case "A": A = true; break;
		  case "D": D = true;break;
		}
		lastTime = System.currentTimeMillis();
	}

	public void keyReleased(KeyEvent arg0) {
		switch((arg0.getKeyChar() + "").toUpperCase()) {
		  case "W": W = false; break;
		  case "S": S = false;break;
		  case "A": A = false; break;
		  case "D": D = false;break;
		}
	}

	public void keyTyped(KeyEvent arg0) {
		
	}
	
	public static void check() {
		
	}
}
