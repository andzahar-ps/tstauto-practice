package automation_toni;


import org.testng.annotations.Test;

public class HelloWorld {
    @Test
    public void HelloWorld(){

        System.out.println("Hello World"); //displays Hello World
    }

    @Test
    public void CharacterOutput(){

        System.out.printf("+++++++++++\n@@@@@@@@@@@@@@\n***********\n############\n"); // displays each special character on a new line while using \n

    }
}
