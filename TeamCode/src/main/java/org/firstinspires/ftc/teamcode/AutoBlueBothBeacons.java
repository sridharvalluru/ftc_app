/*

FALTECH 7079
FOUR POINTS MIDDLE SCHOOL

AUTONOMOUS CLASS NAMING NOMENCLATURE:
    OpMode Type: {Auto|Telop}
    Alliance color: {R|B} // Red or Blue
    Starting Position: {CS|M|MS} // Corner Side or Middle or Mountain Side
    Scoring strategy: {guys|none|beacon}
    End location: {PZ|SZ} // Parking Zone or Safety Zone

DESCRIPTION:
    Autonomous program for Blue alliance, starting in Corner Side, scoring the climbers in the box,
    and finishing in the Parking Zone.
TARGET SCORE:
45

 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.faltech.FaltechRobot;

/**
 * A simple example of a linear op mode that will approach an IR beacon
 */
public class AutoBlueBothBeacons extends LinearOpMode {

    private FaltechRobot robot;

    @Override
    public void runOpMode() throws InterruptedException {
        robot = new FaltechRobot(this);
        // wait for the start button to be pressed
        waitForStart();
/* This is a Autonomous for blue alliance,
It goes from the corner to drop off the climbers
into the shelter. Then it ends in the Floor Goal.
 */
        //Auto Start
     robot.driveTrain.GoInches(12, .5, 6);
        robot.driveTrain.PivotTurn(-35, .1, false, 5);
        robot.driveTrain.GoInches(75, .5, 5);
        robot.driveTrain.PivotTurn(-30, .1, true, 5);
        robot.driveTrain.GoColor ("white", 0.5, 6);
        robot.driveTrain.GoInches(4, .5, 6);
        Thread.sleep(1000);
        String BeaconColor = robot.driveTrain.GetBeaconColor();
        if (
                BeaconColor.equals("blue")
                ) {}
        else {
            robot.driveTrain.GoInches(5, .5, 15);
        }


 //       robot.driveTrain.GoInches(60, .5, 15);
 //       robot.driveTrain.PivotTurn(-45, .5, 3);
 ////       robot.driveTrain.GoInches(6, -.5, 5);
       /* robot.arms.elevator.UpDegrees(30);
        robot.arms.hopper.goRight(4000);
        robot.arms.hopper.goLeft(4000);
        robot.arms.elevator.UpDegrees(0);
        robot.driveTrain.GoInches(34, -.5, 5);
*/

    }
}