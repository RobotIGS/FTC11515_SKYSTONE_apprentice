package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "test")
public class test extends OpMode {
    DcMotor motor = null;
    Servo servo = null;


    @Override
    public void init() {
        this.motor = hardwareMap.get(DcMotor.class,"motor");
        this.motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        this.motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);


        this.servo = hardwareMap.get(Servo.class,"servo");
    }

    @Override
    public void loop() {
        if(this.servo.getPosition() == 0)
            this.servo.setPosition(1);
        else
            this.servo.setPosition(0);
        this.motor.setPower(1);
        telemetry.addData("test",motor.getPower());
        telemetry.addData("t",servo.getPosition());
        telemetry.update();



    }
}


