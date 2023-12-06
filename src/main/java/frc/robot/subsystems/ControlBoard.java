package frc.robot.subsystems;
import edu.wpi.first.wpilibj.XboxController;

public class ControlBoard {
    public static final XboxController control1 = new XboxController(0);
    public static final XboxController control2 = new XboxController(1);
//Chasis
    double con1LStickX = control1.getRawAxis(0);
    double con1LStickY = control1.getRawAxis(1);

    public boolean Bbutton = control2.getBButton();
    public boolean xbutton = control2.getXButton();

   //*  boolean con2RBumper = control2.getRawButton(6);
    //boolean con2AButton = control2.getRawButton(1);
    //boolean con2XButton = control2.getRawButton(3);
    //boolean con2BButton = control2.getRawButton(2);
    //double con2RTrigger = control2.getRawAxis(3);
    //double con2LTrigger = control2.getRawAxis(2); //

}
