package es.escuelaces.alberto.lingo;

public class LingoAutomatico extends Game{
    private static final String[] INTENTOS = {"AIRES", "PATATA", "MUNDO", "MINA", "AMEBA", "AMIGO"};

    public LingoAutomatico(String word) {
        super(word);
    }
    public LingoAutomatico(String word, char... guessed) {
        super(word, guessed);
    }

    @Override
    public void main() {
        int coun = 0;
        System.out.println(WELCOME);
        while (!this.isGuessed()) {
            System.out.println(guess(INTENTOS[coun++]));
            System.out.println();
            System.out.println(getWordWithGuesses());
        }
        System.out.println(GOODBYE);
    }
}
