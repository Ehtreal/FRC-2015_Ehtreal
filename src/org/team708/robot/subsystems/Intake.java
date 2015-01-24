package org.team708.robot.subsystems;

import org.team708.robot.commands.JoystickDrive;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {
    //Motors and stuff
    CANTalon intakeTalon1 = new CANTalon(17);
    CANTalon intakeTalon2 = new CANTalon(18);
    
    //Joystick drive
    public void initDefaultCommand() {
        setDefaultCommand(new JoystickDrive());
    
    	// Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    //Direction of motor rotation
    public void intakeControl(double move){
    	intakeTalon1.set(move);
    	intakeTalon2.set(-move);
    }
}

