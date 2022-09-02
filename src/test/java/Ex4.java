import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Enter the number of minute you want to convert");

        int minutes = Obj.nextInt();
        System.out.println("Number of minutes " + minutes);
        int days = minutes/1440;
        int years = days/365;
        int leftdays = days % 365;
        System.out.println(years + "years" + leftdays + "days");

    }
}
