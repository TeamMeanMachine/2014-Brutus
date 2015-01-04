/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.Flip;

/**
 *
 * @author programming
 */
public class Flipper extends Subsystem{
    
    SpeedController flipper;
    DigitalInput low;
    DigitalInput high;
    
    
    public Flipper(){
        flipper = RobotMap.flipper;
        low = RobotMap.lowerFlipLimit;
        high = RobotMap.upperFlipLimit;
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new Flip());
        // Set the default command for a subsystem here.
    }
    
    public void flip(double power){
//        System.out.println("High: " + high.get());
//        System.out.println("Low: " + low.get());
        if (!high.get() && power > 0.2){
            System.out.println("flip: " + power);
            flipper.set(-power);
        }
        else if(!low.get() && power < -0.2){
            System.out.println("flip: " + power);
            flipper.set(-power);
        }
        else{   
            //System.out.println("FLIP: Limit");
            flipper.set(0); //CHANGE
        }
        //System.out.println("It be flippin in the subclass (calling command)");
    }
}
