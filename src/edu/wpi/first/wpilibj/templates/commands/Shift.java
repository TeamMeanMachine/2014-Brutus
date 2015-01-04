/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.RobotTemplate;

/**
 *
 * @author Shawn
 */
public class Shift extends CommandBase {
    Solenoid shift;
    boolean active = false;
    
     public Shift() {
     //   requires(RobotTemplate.drive);
         shift = RobotMap.shiftSolenoid;
    }
    public void initialize(){
        
    }
    public void execute(){
        shift.set(!active);
        active = !active;
     //   flipes.flip(OI.coStick.getAxis(Joystick.AxisType.kZ));
        //System.out.println("It be flippin in the command (executing)");
    }
    public void end (){
     //   flipes.flip(0);
    }
    public void interrupted(){
    //    flipes.flip(0);
        shift.set(true);
        active = true;
    }
    public boolean isFinished(){
        return true;
    }
}
