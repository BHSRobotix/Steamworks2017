// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc2876.Steamworks2017.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc2876.Steamworks2017.Robot;

/**
 *
 */
public class DriveControlSimple extends Command {

	double leftY;
	double rightX;

	public DriveControlSimple() {

		requires(Robot.driveTrain);

	}

	// Called just before this Command runs the first time
	protected void initialize() {
		Robot.driveTrain.setVelocityMode();

	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
//		if (!Robot.driveTrain.toggleInverseDrive()) {
			// Forward is Intake
			leftY = Robot.oi.getLeftY();
//		} else {
//			// Forward is Gear
//			leftY = Robot.oi.getLeftY() * -1;
//		}

		rightX = Robot.oi.getRightX();
		Robot.driveTrain.setVelocityArcadeJoysticksGain(leftY, rightX);
		// Robot.driveTrain.myRobot.arcadeDrive(leftY, rightX, false);

	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
