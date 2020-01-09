package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;



@TeleOp(name="servo")
public class test5 extends OpMode
{
    Servo servomotor1;

    @Override
    public void init() {
        servomotor1 = hardwareMap.get(Servo.class, "servomotor1");

    }

    @Override
    public void loop() {
        servomotor1.setPosition(gamepad1.right_trigger);
        if(gamepad1.right_trigger >= 0 && gamepad1.right_trigger <= 1 ){
            servomotor1.setPosition(gamepad1.right_trigger);
        }if(gamepad1.right_trigger >= 0 && gamepad1.right_trigger <= 1){
            telemetry.addData("servoPos",servomotor1.getPosition());
            telemetry.addData("RightTriggerPos",gamepad1.right_trigger);
            telemetry.update();
        }

    }
}
