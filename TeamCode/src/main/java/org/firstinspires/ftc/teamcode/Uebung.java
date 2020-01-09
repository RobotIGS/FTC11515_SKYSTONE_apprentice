package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp(name = "uebung")
public class Uebung extends OpMode{
    DcMotor motor;


    @Override
    public void init() {
        motor = hardwareMap.get(DcMotor.class,"Motor 1");
    }

    @Override
    public void loop() {
        if(gamepad1.a){
            motor.setPower(0.5);}
        else
            motor.setPower(0);
        telemetry.addData("test:", motor.getPower());
        telemetry.update();

    }
}
