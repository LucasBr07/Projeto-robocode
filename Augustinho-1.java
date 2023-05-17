package cansados;
import robocode.*;
import robocode.ScannedRobotEvent;
import static robocode.util.Utils.normalRelativeAngleDegrees;
import java.awt.*;

public class Augustinho extends AdvancedRobot
{
static int cantos=0;
	public void run() {
	setBodyColor(Color.black);
		setGunColor(Color.blue);
		setRadarColor(Color.blue);
		setBulletColor(Color.black);
		setScanColor(Color.white);
	
		while(true) {
		
		turnRight(normalRelativeAngleDegrees(cantos - getHeading()));
		   setAdjustGunForRobotTurn(true);
		   ahead(5000);
		   turnLeft(90);
		   setTurnGunLeft(180);
		   ahead(5000);
		   turnLeft(90);
		   ahead(5000);
		   turnLeft(90);
		   ahead(5000);

		   
		}
	}


	public void onScannedRobot(ScannedRobotEvent e) {
		 double absoluteBearing = getHeadingRadians() + e.getBearingRadians();
		 setTurnGunRightRadians(
   		 robocode.util.Utils.normalRelativeAngle(absoluteBearing - 
       	 getGunHeadingRadians()));
		 fire(15);

	}}
