package cansados;
import robocode.*;
import robocode.ScannedRobotEvent;
import java.awt.*;

public class AugustinhoCarrara extends AdvancedRobot
{
	int turnDirection=1;
	public void run() {
	setBodyColor(Color.black);
		setGunColor(Color.blue);
		setRadarColor(Color.blue);
		setBulletColor(Color.black);
		setScanColor(Color.white);
		while(true) {
		   setAhead(100);
		   turnRight(100 * turnDirection);
		   scan();
		}
	}


	public void onScannedRobot(ScannedRobotEvent e) {
	    fire(30);
		if(e.getBearing() >= 0) {
		turnDirection = 1;
		}else{
		turnDirection = -1;
		}
		turnRight(e.getBearing());
		ahead(e.getDistance() + 10);
		scan();
	}


	public void onHitByBullet(HitByBulletEvent e) {
	back(100);
	setTurnRight(100);
	ahead(100);
	}
	
	public void onHitWall(HitWallEvent e) {
		back(20);
		setTurnRight(100);
	}	
	
	public void onHitRobot(HitRobotEvent e){
		turnRight(e.getBearing());
	}
}