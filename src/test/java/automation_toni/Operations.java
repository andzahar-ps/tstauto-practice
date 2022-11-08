package automation_toni;

import org.testng.annotations.Test;

public class Operations {

    @Test
    public void Math(){
        int a =-5 + 8 * 6;
        int b =(55+9) % 9;
        int c =20 + -3 * 5 / 8;
        int d =5 + 15 / 3 * 2 - 8 % 3;

        System.out.println("results:"+"\n"+a+"\n"+b+"\n"+c+"\n"+d); //displays each result on a new line while using \n

    }
    @Test
    public void FromMinutesToYearsAndDays(){

        int min = 3456789; //this amount of minutes needs to be transformed to reflect how many years and days are there
        int years =min/(365*24*60); //calculates the amount of years
        int days = min % (365*24*60)/(24*60); //calculates the remaining days

        System.out.println(min+" minutes = "+years+" years"+" and "+days+ " days"); //displays the amount of years and days
    }




}
