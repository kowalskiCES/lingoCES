package es.escuelaces.alberto.lingo.interfaces;

import java.util.ArrayList;

public interface IGame {
    String TEXT_INVALID_WORD= "Is an invalid word!!";
    char[] SAME_PLACE_INDICATOR = "[]".toCharArray();
    char[] IN_WORD_INDICATOR = "()".toCharArray();
    char[] NOT_IN_WORD_INDICATOR = "  ".toCharArray();
    String WELCOME = "Bienvenido a lingo!"
            +"\n" +  "Vamos a jugar!";
    Character EMPTY = '_';
    String guess(String word);
    String getWordWithGuesses();

}
