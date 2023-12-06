package frc.robot;
import edu.wpi.first.wpilibj.XboxController;

public final class Constants {

  //tiempo que tiene la roborio como loop
  public static final double kLooperDt = 0.02;
  
  //---------------------controles-----------------------//

  //Puertos donde conectamos los controles
  public static final int kChassisPort = 0;
  public static final int kMecanismPort = 1;
  //Tolerancia del stick
  public static final double kStickTolerance = 0.15;

  //---------------------chasis--------------------------//
  public static final int MotorFR = 1;
  public static final int MotorBR = 2;
  public static final int MotorFL= 3;
  public static final int MotorBL= 4;
  //---------------------Hopper--------------------------//
  public static final int MotorHop = 5;
  //---------------------Shooter--------------------------//
  public static final int MotorShoot = 10;
  //---------------------Shooter--------------------------//
  public static final int MotorIntake1 = ;
  public static final int MotorIntake2 = ;
}
