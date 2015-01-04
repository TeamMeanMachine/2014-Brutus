package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Jaguar;
//import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    
    public static SpeedController leftFront;
    public static SpeedController leftBack;
    public static Solenoid leftDriveSolenoid;
    public static SpeedController rightFront;
    public static SpeedController rightBack;
    public static Solenoid shiftSolenoid;
    public static RobotDrive drive;
    public static CompressorControl compressor1;
    public static SpeedController flipper;
    public static DigitalInput lowerFlipLimit;
    public static DigitalInput upperFlipLimit;
    public static Solenoid flapper;
    
    public static void  init() {
        // init components
        
        leftFront = new Talon(4);
        leftBack = new Talon(3);
        rightFront = new Talon(2);
        rightBack = new Talon(1);
        shiftSolenoid = new Solenoid(2);
        flipper = new Jaguar(5);
        flapper = new Solenoid(1);
        
        lowerFlipLimit = new DigitalInput(1);
        upperFlipLimit = new DigitalInput(2);
        
        drive = new RobotDrive(leftFront, leftBack, rightFront, rightBack);
        
        compressor1 = new CompressorControl(2, 3);
        
        
        
    }
}
