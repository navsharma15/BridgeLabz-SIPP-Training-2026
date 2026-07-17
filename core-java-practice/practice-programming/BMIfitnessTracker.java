import java.util.*;

public class BMIfitnessTracker{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you height in m:- ");
        double height = sc.nextDouble();

        System.out.println("Enter you weight in kg:- ");
        double weight = sc.nextDouble();

        double BMI = weight / (height*height);

        System.out.println("BMI is "+BMI);

        if(BMI < 18.5){
            System.out.println("Underweight");
        }else if(BMI < 25){
            System.out.println("Normal");
        }else{
            System.out.println("Overweight");
        }
    }
}