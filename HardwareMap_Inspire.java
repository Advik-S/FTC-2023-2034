package org.firstinspires.ftc.teamcode;


/* Copyright (c) 2017 FIRST. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted (subject to the limitations in the disclaimer below) provided that
 * the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list
 * of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this
 * list of conditions and the following disclaimer in the documentation and/or
 * other materials provided with the distribution.
 *
 * Neither the name of FIRST nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
 * LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;


public class HardwareMap_Inspire {
    /**
     * This is NOT an opmode.
     * <p>
     * This class can be used to define all the specific hardware for a single robot.
     * In this case that robot is a Pushbot.
     * See PushbotTeleopTank_Iterative and others classes starting with "Pushbot" for usage examples.
     * <p>
     * This hardware class assumes the following device names have been configured on the robot:
     * Note:  All names are lower case and some have single spaces between words.
     * <p>
     * Motor channel:  Left  drive motor:        "left_drive"
     * Motor channel:  Right drive motor:        "right_drive"
     * Motor channel:  Manipulator drive motor:  "left_arm"
     * Servo channel:  Servo to open left claw:  "left_hand"
     * Servo channel:  Servo to open right claw: "right_hand"
     */
    //public class Hardware_map {
    /* Public OpMode members. */
    public DcMotor leftFront = null;
    public DcMotor leftBack = null;
    public DcMotor rightFront = null;
    public DcMotor rightBack = null;
    public DcMotor extension = null;

    public DcMotor Intake = null;

    public DcMotor intake = null;
    public Servo left_claw = null;
    public Servo right_claw = null;
    public Servo flipper = null;

    /* local OpMode members. */
    HardwareMap hwMap = null;
    private ElapsedTime period = new ElapsedTime();

    /* Constructor */
    //  public Hardware_map() {
//
    //          }

    /* Initialize standard Hardware interfaces */
    public void init(HardwareMap ahwMap) {
        // Save reference to Hardware map
        hwMap = ahwMap;
        // Define and Initialize Motors
        leftFront = hwMap.get(DcMotor.class, "frontLeft");
        leftBack = hwMap.get(DcMotor.class, "backLeft");
        rightFront = hwMap.get(DcMotor.class, "frontRight");
        rightBack = hwMap.get(DcMotor.class, "backRight");
        Intake = hwMap.get(DcMotor.class, "Intake");
        extension = hwMap.get(DcMotor.class, "extension");
        flipper = hwMap.get(Servo.class, "flipper");
        right_claw = hwMap.get(Servo.class, "rightClaw");
        left_claw = hwMap.get(Servo.class, "leftClaw");

       /*
        leftFront.setDirection(DcMotor.Direction.FORWARD); // Set to REVERSE if using AndyMark motors
        leftBack.setDirection(DcMotor.Direction.FORWARD);
        rightFront.setDirection(DcMotor.Direction.FORWARD);// Set to FORWARD if using AndyMark motors
        rightBack.setDirection(DcMotor.Direction.FORWARD);
       */
    }
}
//}
