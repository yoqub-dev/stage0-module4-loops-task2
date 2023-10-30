package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String phrase = "";

        for (char character : chars) {
            phrase += character;
        }
        System.out.println(phrase);
    }
}
