package es.escuelaces.alberto.lingo.interfaces;

public interface IGame {
    String TEXT_INVALID_WORD= "Is an invalid word!!";
    String WELCOME = "Bienvenido a lingo!"
            +"\n" +  "Vamos a jugar!";
    String GOODBYE = "Has ganado!";
    Character EMPTY = '_';
    String guess(String word);
    String getWordWithGuesses();
    boolean isGuessed();
    void main();
}
