/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author FIRST
 */
public class Flapper extends Subsystem {
    Solenoid flap;
    boolean flapActive = false;

    public Flapper(){
        flap = RobotMap.flapper;
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    }
    public void flap (){
        flapActive = !flapActive;
        flap.set(flapActive);
        //System.out.println("flap Right");
    }
    public void reset(){
        flap.set(true);
        flapActive = true;
    }
}