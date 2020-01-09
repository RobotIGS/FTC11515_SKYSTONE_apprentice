package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;


@TeleOp(name="TestK")
public class TestK extends OpMode {
    DcMotor motor;
    Servo servo;

    @Override
    public void init() {
        motor = hardwareMap.get(DcMotor.class,"motor");
        servo = hardwareMap.get(Servo.class, "servo");
    }

    @Override
    public void loop() {
        if(gamepad1.a)
            motor.setPower(1);
        else
            motor.setPower(0);

        if(gamepad1.b)
            servo.setPosition(0.5);
        else
            servo.setPosition(0);
    }
}
