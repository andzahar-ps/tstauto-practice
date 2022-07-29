package ivancescuSorinTema.Tema2;

import org.junit.Test;

public class Exercise3 {
    @Test
    public void main() {
        String sentence = "The quick brown fox jumps over the lazy dog.";
        String replaceSentence = sentence.replace("fox", "cat");
        System.out.println("Original string: " + sentence );
        System.out.println("New String: " + replaceSentence);
    }
}
