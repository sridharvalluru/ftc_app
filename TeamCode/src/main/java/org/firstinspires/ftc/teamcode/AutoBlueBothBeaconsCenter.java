/*
FALTECH 7079
FOUR POINTS MIDDLE SCHOOL
 */

package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.faltech.FaltechRobot;

@Autonomous(name = "Blue_Both_Beacons_Center", group = "7079")
public class AutoBlueBothBeaconsCenter extends LinearOpMode {
    private FaltechRobot FTrobot;
    PurpleBotHardware robot = new PurpleBotHardware();
    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap);
        FTrobot = new FaltechRobot(this, robot);

        FTrobot.driveTrain.SuperAuto("blue", false, 2, true);

    }
}