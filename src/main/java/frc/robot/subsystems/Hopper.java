package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.ControlType;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Hopper extends SubsystemBase {
    
    //---------------características-----------------//
    //Hardware
    TalonSRX motorHopper;
    

     
    

    //variables de logica
    
    double hopperspeed; 

    

    
    //---------------características-----------------//
    //constructor//
    public Hopper(){
        motorHopper= new TalonSRX(5);
        hopperspeed = 0;
    
    }
    //-------------funciones------------------------//
    public void activarShooter(Boolean getAButton){
       if(getAButton == true){
        motorHopper.set(ControlMode.PercentOutput, -0.8);
      }else{
        motorHopper.set(ControlMode.PercentOutput, 0.0);
      }
    }
}
   

    //-------------funciones------------------------//

