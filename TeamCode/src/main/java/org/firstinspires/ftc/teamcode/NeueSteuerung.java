package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="NeueSteureung")
public class NeueSteuerung extends OpMode {
    public DcMotor dcMotor1, dcMotor2, dcMotor3,dcMotor4;
    public boolean Greifer = false;
    public Servo Servo1, Servo2;

    @Override
    public void init() {
        dcMotor1 = hardwareMap.get(DcMotor.class, "dcMotor1");
        dcMotor2 = hardwareMap.get(DcMotor.class, "dcMotor2");
        dcMotor3 = hardwareMap.get(DcMotor.class, "dcMotor3");
        dcMotor4 = hardwareMap.get(DcMotor.class, "dcMotor4");

        Servo1   = hardwareMap.get(Servo.class, "Servo1");
        Servo2   = hardwareMap.get(Servo.class,  "Servo2");

        dcMotor1.setDirection(DcMotorSimple.Direction.FORWARD);
        dcMotor2.setDirection(DcMotorSimple.Direction.REVERSE);
        dcMotor3.setDirection(DcMotorSimple.Direction.FORWARD);
        dcMotor4.setDirection(DcMotorSimple.Direction.REVERSE);
}

@Override
public void loop(){
         if (gamepad1.dpad_up==true){
            dcMotor1.setPower(1);
            dcMotor2.setPower(1);
            dcMotor3.setPower(1);
            dcMotor4.setPower(1);
            }
    else if (gamepad1.dpad_down==true){
            dcMotor1.setPower(-1);
            dcMotor2.setPower(-1);
            dcMotor3.setPower(-1);
            dcMotor4.setPower(-1);
            }
    else if (gamepad1.dpad_right==true){
            dcMotor1.setPower(1);
            dcMotor2.setPower(-1);
            dcMotor3.setPower(1);
            dcMotor4.setPower(-1);
            }
    else if (gamepad1.dpad_left==true){
            dcMotor1.setPower(-1);
            dcMotor2.setPower(1);
            dcMotor3.setPower(-1);
            dcMotor4.setPower(1);
            }
    else if (gamepad1.right_trigger>0){
            dcMotor1.setPower(gamepad1.right_trigger);
            dcMotor2.setPower(gamepad1.right_trigger/2);
            dcMotor3.setPower(gamepad1.right_trigger);
            dcMotor4.setPower(gamepad1.right_trigger/2);
            }
    else if (gamepad1.left_trigger>0){
            dcMotor1.setPower(gamepad1.left_trigger/2);
            dcMotor2.setPower(gamepad1.left_trigger);
            dcMotor3.setPower(gamepad1.left_trigger/2);
            dcMotor4.setPower(gamepad1.left_trigger);
         }
    else if (gamepad1.left_bumper = true){
             telemetry.addData("2",1);
             telemetry.update();
            if (Greifer = false){
                Servo1.setPosition(1);
                Servo2.setPosition(0);
                Greifer = true;
            }
            else if (Greifer = true){
                Servo1.setPosition(0);
                Servo2.setPosition(1);
                Greifer = false;
            }
    }
    else {
             dcMotor1.setPower(0);
             dcMotor2.setPower(0);
             dcMotor3.setPower(0);
             dcMotor4.setPower(0);
             telemetry.addData("1",1);
             telemetry.update();
         }
    telemetry.addData("dcMotor1", dcMotor1.getPower());
    telemetry.addData("dcMotor2", dcMotor2.getPower());
    telemetry.addData("dcMotor3", dcMotor3.getPower());
    telemetry.addData("dcMotor4", dcMotor4.getPower());
    telemetry.addData("Leftbumper", gamepad1.left_bumper);
}
}
