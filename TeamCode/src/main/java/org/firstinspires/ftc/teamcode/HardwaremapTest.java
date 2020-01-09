package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class HardwaremapTest{
    private HardwareMap hwmap;
    public DcMotor motor;
    public Servo servo;



    public HardwaremapTest(HardwareMap hwmp){
        this.hwmap = hwmp;
        this.motor = hwmap.get(DcMotor.class,"motor");
        this.servo = hwmp.get(Servo.class, "servo");



        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);


    }



}
