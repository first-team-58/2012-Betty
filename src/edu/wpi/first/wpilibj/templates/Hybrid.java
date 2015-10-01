/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

/**
 *
 * @author Team 58
 */
public class Hybrid {
public static Command autonomousCommand;
public static  SendableChooser autoChooser;
    private static Timer timer = new Timer();

    private static DigitalInput auto1 = new DigitalInput(4),
                                auto2 = new DigitalInput(5),
                                auto4 = new DigitalInput(6);
    
    private static int program = 1;
    public static void Init() {
    }

    public static void Reinit() {
        timer.stop();
        timer.reset();
        timer.start();
    }

    public static void DoHybrid() {
        //int prog = (auto1.get()?0:1) + (auto2.get()?0:2) + (auto4.get()?0:4);
        switch(program){
            default:
                DoNothing();
                break;
            case 1:
                DoStraightScoreHybrid();
                break;
            case 2:
                DoLeftScoreHybrid();
                break;
            case 3:
                DoRightScoreHybrid();
                break;
            case 4:
                DoCoopertitionBridgeHybrid();                
                break;
        }
    }
    private static void DoNothing(){
        
    }
    public static void DoLeftScoreHybrid() {
        /**
        double time = timer.get();
        Arm.RunArmUp();
        if (time >= 0.0 && time < .5) {
            Drive.DoManualDrive(0, .3, 0);
        } else if (time >= 0.5 && time < 6) {
            Drive.DoManualDrive(80, .8, 0);
        } else if (time >= 6 && time < 10) {
            Drive.DoManualDrive(180, .5, 0);
        } else {
            Drive.DoManualDrive(0, 0, 0);
        }
        Arm.EjectBalls(time >= 11 && time < 14);
   */
        System.out.println(1);
   }

    public static void DoRightScoreHybrid() {
        /**
        double time = timer.get();
        Arm.RunArmUp();
        if (time >= 0.0 && time < .5) {
            Drive.DoManualDrive(0, .3, 0);
        } else if (time >= 0.5 && time < 6) {
            Drive.DoManualDrive(-85, .8, 0.0);
        } else if (time >= 6 && time < 10) {
            Drive.DoManualDrive(180, .5, 0);
        } else {
            Drive.DoManualDrive(0, 0, 0);
        }
        Arm.EjectBalls(time >= 11 && time < 14);
   */
   System.out.println(2);    
    
    }

    public static void DoStraightScoreHybrid() {
        System.out.println(3);
       /**
        double time = timer.get();
        Arm.RunArmUp();
        if (time >= 0.0 && time < 3.0) {
            Drive.DoManualDrive(180, .3, 0);
        }
        Arm.EjectBalls(time >= 11 && time < 14);
        */ 
    }

    public static void DoCoopertitionBridgeHybrid() {
        System.out.println(3);
        /**
        double time = timer.get();
        Arm.RunBridgeArm(time < 4);
        if (time >= 0.0 && time < 2) {
            Drive.DoManualDrive(180, .3, 0);
        }
        else if (time > 4 && time < 8) {
            Drive.DoManualDrive(0, .3, 0);
        }else {
            Drive.DoManualDrive(180, 0, 0);
        }
        */
    }
    public static void autoChoose() {
        try{
            program = ((Integer)Team582012Robot.autoChooser.getSelected()).intValue();
        }
       catch(Exception e){}
    }
    
}
