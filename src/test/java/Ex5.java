import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Input the 1st number");
    int number1 = myObj.nextInt();
    System.out.println("Input the 2nd number:");
    int number2 = myObj.nextInt();
    System.out.println("Input the 3rd number:");
    int number3 = myObj.nextInt();
    //Var 1
    System.out.println(Math.max(number1, Math.max(number2, number3)));
    //Var 2
    if(number1>number2 && number1>number3){
            System.out.println("The greatest number is " + number1);
        }
        else if (number2>number3){
            System.out.println("The greatest number is " + number2);
        }else {
        System.out.println("The greatest number is " + number3);
    }
    }
}
