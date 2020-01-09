package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name="TestSteuerung")
public class TestSteuerung extends OpMode {
    public DcMotor dcMotor1, dcMotor2, dcMotor3,dcMotor4;

    @Override
    public void init() {
        dcMotor1 = hardwareMap.get(DcMotor.class, "dcMotor1");
        dcMotor2 = hardwareMap.get(DcMotor.class, "dcMotor2");
        dcMotor3 = hardwareMap.get(DcMotor.class, "dcMotor3");
        dcMotor4 = hardwareMap.get(DcMotor.class, "dcMotor4");

        dcMotor1.setDirection(DcMotorSimple.Direction.FORWARD);
        dcMotor2.setDirection(DcMotorSimple.Direction.REVERSE);
        dcMotor3.setDirection(DcMotorSimple.Direction.REVERSE);
        dcMotor4.setDirection(DcMotorSimple.Direction.FORWARD);
    }

    @Override
    public void loop() {
        if      (gamepad1.dpad_up == true) {
                    dcMotor1.setPower(0.5);
                    dcMotor3.setPower(0.5-gamepad1.right_trigger/4);
                    dcMotor2.setPower(0);
                    dcMotor4.setPower(0);
        }
        else if (gamepad1.dpad_down == true) {
                    dcMotor1.setPower(-0.5-gamepad1.left_trigger/4);
                    dcMotor3.setPower(-0.5);
                    dcMotor2.setPower(0);
                    dcMotor4.setPower(0);
        }
        else if (gamepad1.dpad_left == true) {
                    dcMotor1.setPower(0);
                    dcMotor3.setPower(0);
                    dcMotor2.setPower(0.5-gamepad1.left_trigger/4);
                    dcMotor4.setPower(0.5);
        }
        else if (gamepad1.dpad_right == true) {
                    dcMotor1.setPower(0);
                    dcMotor3.setPower(0);
                    dcMotor2.setPower(-0.5);
                    dcMotor4.setPower(-0.5-gamepad1.right_trigger/4);
        }
        else if (gamepad1.right_trigger > 0){
                    dcMotor1.setPower(gamepad1.right_trigger/2);
                    dcMotor3.setPower(-gamepad1.right_trigger/2);
                    dcMotor2.setPower(gamepad1.right_trigger/2);
                    dcMotor4.setPower(-gamepad1.right_trigger/2);
        }
        else if (gamepad1.left_trigger > 0){
                    dcMotor1.setPower(-gamepad1.left_trigger/2);
                    dcMotor3.setPower(gamepad1.left_trigger/2);
                    dcMotor2.setPower(-gamepad1.left_trigger/2);
                    dcMotor4.setPower(gamepad1.left_trigger/2);
        }
        else {
                    dcMotor1.setPower(0);
                    dcMotor3.setPower(0);
                    dcMotor2.setPower(0);
                    dcMotor4.setPower(0);
        }
        telemetry.addData("dcMotor1", dcMotor1.getPower());
        telemetry.addData("dcMotor2", dcMotor2.getPower());
        telemetry.addData("dcMotor3", dcMotor3.getPower());
        telemetry.addData("dcMotor4", dcMotor4.getPower());
        telemetry.addData("left_trigger", gamepad1.left_trigger);
        telemetry.addData("right_trigger", gamepad1.right_trigger);

        }
    }