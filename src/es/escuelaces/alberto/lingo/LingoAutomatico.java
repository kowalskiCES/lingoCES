package es.escuelaces.alberto.lingo;

public class LingoAutomatico extends Game{
    private static final String[] INTENTOS = {"AIRES", "PATATA", "MUNDO", "MINA", "AMEBA", "AMIGO"};

    public LingoAutomatico(String word) {
        super(word);
    }
    public LingoAutomatico(String word, char... guessed) {
        super(word, guessed);
    }

    public void main(String[] args) {
        int coun = 0;
        System.out.println(WELCOME);
        while (!this.isGuessed()) {
            System.out.println(guess(INTENTOS[coun]));
            System.out.println(getWordWithGuesses());
        }
    }
}
