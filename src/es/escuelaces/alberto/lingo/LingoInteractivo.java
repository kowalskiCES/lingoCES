package es.escuelaces.alberto.lingo;

import java.util.Scanner;

public class LingoInteractivo extends Game {

    public LingoInteractivo (String word) {
        super(word);
    }

    public LingoInteractivo(String word, char... guessed) {
        super(word, guessed);
    }

    @Override
    public void main() {
        System.out.println(WELCOME);
        Scanner sc = new Scanner(System.in);
        while (!this.isGuessed()) {
            System.out.println(guess(sc.nextLine()));
            System.out.println();
            System.out.println(getWordWithGuesses());
        }
        System.out.println(GOODBYE);
    }
}
