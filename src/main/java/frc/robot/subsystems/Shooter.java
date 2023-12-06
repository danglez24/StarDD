package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.ControlType;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {
    
    //---------------características-----------------//
    //Hardware
    TalonSRX motorHopper;
    CANSparkMax motorShooter;

     
    

    //variables de logica//
    double shooterspeed;
    double hopperspeed; 

    

    
    //---------------características-----------------//
    //constructor//
    public Shooter(){
        motorShooter= new CANSparkMax(Constants.MotorShoot, MotorType.kBrushless);
        shooterspeed = 0;
    
    }
    //-------------funciones------------------------//
    public void activarShooter(Boolean getAButton){
       if(getAButton == true){
        motorShooter.set(0.8);
      }else{
          motorShooter.set(0.0);
      }
    }
}
   



