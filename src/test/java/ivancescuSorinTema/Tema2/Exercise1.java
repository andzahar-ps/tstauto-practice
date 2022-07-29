package ivancescuSorinTema.Tema2;

import org.junit.Test;

public class Exercise1 {
    @Test
    public void main() {
        String[] countries = {"Spania", "Franta", "Romania", "Italia", "Germania"};
        for(int i = 0; i < countries.length; i++) {
            if(countries[i] == "Romania"){
                System.out.println("This array contains " + countries[i]);
            }
        }
    }
}
