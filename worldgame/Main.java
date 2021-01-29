package worldgame;

public class Main {

	public static void main(String[] args) {
		WindowMan.init();
		while(true) {
			System.out.println(FrameLog.fps());
			WindowMan.graphics().drawLine(0, 0, 100, 100);
			WindowMan.frame();
			FrameLog.cap(512);
			FrameLog.next();
		}
	}

}
