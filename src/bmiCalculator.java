import java.util.Scanner;

public class bmiCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		      Scanner sc = new Scanner(System.in);
		      System.out.print("Input weight in kilogram: ");
		      double weight = sc.nextDouble();
		      System.out.print("\nInput height in meters: ");
		      double height = sc.nextDouble();
		      double BMI = weight / (height * height);
		      System.out.print("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2" + " ");
		      
		      if (BMI < 18.5) {
		    	  System.out.println("\nUnderweight");
		      }else if (BMI <= 24.9) {
		    	  System.out.println("\nNormal/Healthy");
		      }else if (BMI <= 29.9) {
		    	  System.out.println("\nOverweight");
		      }else if (BMI <= 39.9) {
		    	  System.out.println("\nObese");
		      }else {
		    	  System.out.println("\nMorbidly Obese");
		      }
		   }
		}
		
