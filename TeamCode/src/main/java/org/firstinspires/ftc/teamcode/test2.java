package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


public class test2 extends OpMode{
    DcMotor motor;

    @Override
    public void init() {
        motor = hardwareMap.get(DcMotor.class,"moin");
    }

    @Override
    public void loop(){
        if(gamepad1.a == true){
            motor.setPower(0.3);
        }
        if(gamepad1.b == true){
            motor.setPower(0.0);
        }
        telemetry.addData("test",motor.getPower());
        telemetry.update();
    }
}
