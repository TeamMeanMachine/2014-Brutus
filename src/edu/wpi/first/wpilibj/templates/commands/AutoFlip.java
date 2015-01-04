/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author Shawn
 */
public class AutoFlip extends CommandGroup {
    
    public AutoFlip() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        addSequential(new DriveTimeCommand(.75, 0.0, 3.0));
        addParallel(new DriveTimeCommand(-0.5, 0.0, 1.0));
        addSequential(new Flip());
    }
}
