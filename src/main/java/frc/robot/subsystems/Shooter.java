package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {
    
    //---------------características-----------------//
    //Hardware
    TalonSRX 
     
    

    //variables de logica
    double ShooterSpeed;
    
    
    //---------------características-----------------//
    
    //constructor
    public Shooter(){
        motorshooter = new CANSparkMax(Constants.Motor2, )
        motorhopper = new 

    //-------------funciones------------------------//
    public void activarIntake(/*argumentos de la funcion*/){
        intakeSpeed=-0.8;
        motorIntake1.set(ControlMode.PercentOutput, -0.8);
    }

    //-------------funciones------------------------//
}
