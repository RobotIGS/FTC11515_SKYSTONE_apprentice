package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name = "testing")
public class testing extends LinearOpMode {
    DcMotor motor = null;
    Servo servo = null;


    @Override
    public void runOpMode() throws InterruptedException {
        super.msStuckDetectLoop = 999999999;


        this.motor = hardwareMap.get(DcMotor.class,"motor");
        this.motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        this.motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);


        this.servo = hardwareMap.get(Servo.class,"servo");

        waitForStart();

        while(true) {
            if (this.servo.getPosition() == 0)
                this.servo.setPosition(1);
            else
                this.servo.setPosition(0);
            this.motor.setPower(1);
            telemetry.addData("test", motor.getPower());
            telemetry.addData("t", servo.getPosition());
            telemetry.update();
        }


    }
}


