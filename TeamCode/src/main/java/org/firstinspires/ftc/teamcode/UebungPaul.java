package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="CoolerTest")
public class UebungPaul extends OpMode {
    public Servo servo1;



    @Override
    public void init() {
        servo1 = hardwareMap.get(Servo.class, "servo1");
    }

    @Override
    public void loop() {
        if (gamepad1.a) {

            servo1.setPosition(servo1.getPosition()+0.1);
            while (System.currentTimeMillis()%500 != 0){}
        }
        else {
            if (gamepad1.y){
                servo1.setPosition(servo1.getPosition()-0.1);
                while (gamepad1.y){}
            }
        }
        telemetry.addData("TestPaul" , servo1.getPosition());
        telemetry.update();

    }
}