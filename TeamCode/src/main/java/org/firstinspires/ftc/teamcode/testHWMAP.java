package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp(name="testHWMAP")
public class testHWMAP extends OpMode {
    public HardwaremapTest hwmap;

    @Override
    public void init() {
        hwmap = new HardwaremapTest(hardwareMap);
    }

    @Override
    public void loop() {
        hwmap.motor.setPower(1);
        if(hwmap.servo.getPosition() == 0)
            hwmap.servo.setPosition(1);
        else
            hwmap.servo.setPosition(0);
        telemetry.addData("t",hwmap.motor.getPower());
        telemetry.addData("test",hwmap.servo.getPosition());
        telemetry.update();

    }
}
