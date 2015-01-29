
package org.usfirst.frc.team4685.robot;

import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
	
	RobotDrive myRobot;
	Joystick stick;
	Gyro gyro;
	static final double Kp=0.03;
	
	
	
	
    public void robotInit() {
    	
    	myRobot = new RobotDrive(0,1); /*RobotDrive(final int leftMotorChannel, final int rightMotorChannel ) */
    	stick = new Joystick(0); 
    	gyro = new Gyro(1);
    	
    	

    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	
    	//myRobot.drive(-0.5, 0.0);
    	/*double angle=gyro.getAngle();
    	System.out.println("angle="+angle);
    	myRobot.arcadeDrive(-1.0, -angle*Kp);
    	Timer.delay(0.01);
    	*/ 

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	
    	 myRobot.arcadeDrive(stick);
        
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
    
    public void teleopInit(){
    	
    	
    	
    	
    }
    
    public void autonomousInit(){
    	
    	double angle=gyro.getAngle();
    	
    }
    
    public void disabledInit(){}
    
    public void disabledPeriodic(){}
    
    public void testInit(){}
    
    
    
    
}
