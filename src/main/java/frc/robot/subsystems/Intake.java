package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.robot.subsystems.ControlBoard;
import frc.robot.Constants;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    
    //---------------características-----------------//
    //Hardware
    TalonSRX motorIntake1;

    //variables de logica
    double intakeSpeed;
    
    
    //---------------características-----------------//
    
    //constructor
    public Intake(){
        motorIntake1 =  new TalonSRX(0);
    }

    //-------------funciones------------------------//
    public void activarHopper(boolean con2AButton){
        motorIntake1.set(ControlMode.PercentOutput, 1);
    }

    //-------------funciones------------------------//
}
