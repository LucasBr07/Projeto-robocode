package cansados;
import robocode.*;
import java.awt.Color;
import static robocode.util.Utils.normalRelativeAngleDegrees;
import robocode.ScannedRobotEvent;
//import java.awt.Color;
// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Augusto - a robot by (your name here)
 */
public class Augusto extends AdvancedRobot
{
	/**
	 * run: Augusto's default behavior
	 */
	public void run() {
	setBodyColor(Color.black);
		setGunColor(Color.blue);
		setRadarColor(Color.blue);
		setBulletColor(Color.black);
		setScanColor(Color.white);
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		
		
		
		while(true) {
			setAhead(100);
			turnRight(10);
			
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
public void onScannedRobot(ScannedRobotEvent e) {

	double absoluteBearing = getHeadingRadians() + e.getBearingRadians();
	setTurnGunRightRadians(
    robocode.util.Utils.normalRelativeAngle(absoluteBearing - 
    getGunHeadingRadians()));
	fire(15);
		
	}
	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		setTurnRight(90);
		setBack(50);

	
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		setBack(20);
		setTurnRight(90);
		
	}	
}