package es.escuelaces.alberto.lingo;

import es.escuelaces.alberto.lingo.interfaces.*;

import java.util.ArrayList;
import java.util.Locale;

public abstract class Game implements IGame {
    String wordToGuess;
    ArrayList<String> guessedWords = new ArrayList<>();
    ArrayList<Character> guessedLetters = new ArrayList<Character>();

    public Game(String word) {
        this.wordToGuess = word.toUpperCase(Locale.ROOT);
    }
    public Game(String word, char... guessed) {
        this.wordToGuess = word.toUpperCase(Locale.ROOT);
        for (int i = 0; i < guessed.length; i++) {
            this.guessedLetters.add(Character.toUpperCase(guessed[i]));
        }
    }

    public String guess(String word) {
        word = word.toUpperCase(Locale.ROOT);
        System.out.println(word);
        if (word.length() != wordToGuess.length()) {
            return word + " " + TEXT_INVALID_WORD;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char letter = word.charAt(i);
                int hasLetter = wordToGuess.indexOf(letter);
                if (hasLetter == i) {
                    sb.append(StatusEnum.OK.getWithStatus(letter));
                }else if (hasLetter != -1) {
                    sb.append(StatusEnum.REGULAR.getWithStatus(letter)) ;
                }else {
                    sb.append(StatusEnum.BAD.getWithStatus(letter)) ;
                }
            }
            guessedWords.add(word);
            addGuessedLetters(word);
            return sb.toString();
        }
    }

    public String getWordWithGuesses() {
        String res = "";
        for (int i = 0; i < wordToGuess.length(); i++) {
            char letter = wordToGuess.charAt(i);
            if (guessedLetters.contains(letter)) {
                res += letter;
            } else {
                res += EMPTY;
            }
            res += " ";
        }
        return res;
    }

    public void addGuessedLetters(String word) {
        for (int i = 0; i < word.length(); i++) {
            Character letter = word.charAt(i);
            if (!guessedLetters.contains(letter)) {
                guessedLetters.add(letter);
            }
        }
    }

    public boolean isGuessed() {
        return (!getWordWithGuesses().contains(EMPTY.toString()));
    }
}
