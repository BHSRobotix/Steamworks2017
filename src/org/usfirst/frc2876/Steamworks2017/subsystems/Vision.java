// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2876.Steamworks2017.subsystems;

import org.usfirst.frc2876.Steamworks2017.RobotMap;

import org.usfirst.frc2876.Steamworks2017.commands.*;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;



/**
 *
 */
public class Vision extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	
	 
	public PixyI2C pixy;
	public PixyPacket[] packet = new PixyPacket[7];
	public Vision(){
		pixy = new PixyI2C();
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    	
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    public void testPixy(){
    	for(int i = 0; i < packet.length; i++)
    		packet[i] = null;
    	SmartDashboard.putString("Pixy hello", "working");
    	for(int i = 1; i < 8; i++) {   		
	    	try {
				packet[i - 1] = pixy.readPacket(i);
			} catch (PixyException e) {
				SmartDashboard.putString("Pixy Error: " + i, "exception");
			}
	    	if(packet[i - 1] == null){
	    		SmartDashboard.putString("Pixy Error: " + i, "True");
	    		continue;
	    	}
	    	SmartDashboard.putNumber("Pixy X Value: " + i, packet[i - 1].X);
	    	SmartDashboard.putNumber("Pixy Y Value: " + i, packet[i - 1].Y);
	    	SmartDashboard.putNumber("Pixy Width Value: " + i, packet[i - 1].Width);
	    	SmartDashboard.putNumber("Pixy Height Value: " + i, packet[i - 1].Height);
	    	SmartDashboard.putString("Pixy Error: " + i, "False");
    	}
    	
    }
}

