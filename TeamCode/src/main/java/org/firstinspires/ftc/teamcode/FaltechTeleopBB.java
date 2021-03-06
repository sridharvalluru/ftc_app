
/*
FALTECH 7079
FOUR POINTS MIDDLE SCHOOL
Thanks to Brendan Hollaway, from 6209 Venom
 */
package edu.fpms.faltech;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * TeleOp Mode
 * <p/>
 * Enables control of the robot via the gamepad
 */
public class FaltechTeleopBB extends OpMode {

	//Motors
	DcMotor MtrsLeft;
	DcMotor MtrsRight;
	//Motor Power Settings
	float MtrsLeftPower;
	float MtrsRightPower;

	public FaltechTeleopBB() {


	}

	/*
     * Code to run when the op mode is first enabled goes here
     *
     * @see com.qualcomm.robotcore.eventloop.opmode.OpMode#start()
     */
	@Override
	public void init() {
		MtrsLeft = hardwareMap.dcMotor.get("MtrsLeft");
		MtrsRight = hardwareMap.dcMotor.get("MtrsRight");


	}


	/*
     * This method will be called repeatedly in a loop
     *
     * @see com.qualcomm.robotcore.eventloop.opmode.OpMode#run()
     */
	@Override
	public void loop() {
		float right_y = gamepad1.right_stick_y;
		float left_y = gamepad1.left_stick_y	;
        this.telemetry.addData("left_motor", left_y);
        this.telemetry.addData("right_motor", right_y);

		MtrsLeft.setPower(left_y);
		MtrsRight.setPower(-right_y);
		//Drive Train

				}

	/*
     * Code to run when the op mode is first disabled goes here
     *
     * @see com.qualcomm.robotcore.eventloop.opmode.OpMode#stop()
     */
	@Override
	public void stop() {

	}

}





















































































































