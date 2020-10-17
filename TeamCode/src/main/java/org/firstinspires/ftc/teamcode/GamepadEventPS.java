package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Gamepad;
public class GamepadEventPS extends Toggle.OneShot {
    Toggle.OneShot circle, square, x, triangle, dPadLeft, dPadRight, dPadUp, dPadDown, leftBumper, rightBumper = new Toggle.OneShot();
    Gamepad gamepad;
    public GamepadEventPS(Gamepad gamepad) {
        this.gamepad = gamepad;

    }

    public boolean x() { return x.update(gamepad.x); }
    public boolean circle() { return circle.update(gamepad.x); }
    public boolean square() { return square.update(gamepad.circle); }
    public boolean triangle() { return triangle.update(gamepad.triangle); }
    public boolean dPadDown() { return dPadDown.update(gamepad.dpad_down); }
    public boolean dPadUp() { return dPadUp.update(gamepad.dpad_up); }
    public boolean dPadRight() { return dPadRight.update(gamepad.dpad_right); }
    public boolean dPadLeft() { return dPadLeft.update(gamepad.dpad_left); }
    public boolean leftBumper() {return leftBumper.update(gamepad.left_bumper); }
    public boolean rightBumper() {return rightBumper.update(gamepad.right_bumper);}

}
