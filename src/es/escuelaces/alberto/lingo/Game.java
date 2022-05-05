package es.escuelaces.alberto.lingo;

import es.escuelaces.alberto.lingo.interfaces.*;

import java.util.ArrayList;

public abstract class Game implements IGame {
    String wordToGuess;
    ArrayList<String> guessedWords = new ArrayList<>();
    ArrayList<Character> guessedLetters = new ArrayList<Character>();

    public Game(String word) {
        this.wordToGuess = word;
    }
    public Game(String word, char... guessed) {
        this.wordToGuess = word;
        for (int i = 0; i < guessed.length; i++) {
            this.guessedLetters.add(guessed[i]);
        }
    }

    public String guess(String word) {
        if (!(word.length() == wordToGuess.length())) {
            return word +TEXT_INVALID_WORD;
        }  else {
            String res = "";
            for (int i = 0; i < word.length(); i++) {
                char letter = word.charAt(i);
                int hasLetter = wordToGuess.indexOf(letter);
                if (hasLetter == i) {
                    res += SAME_PLACE_INDICATOR[0] + letter + SAME_PLACE_INDICATOR[1];
                }else if (hasLetter != -1) {
                    res += IN_WORD_INDICATOR[0] + letter + IN_WORD_INDICATOR[1];
                }else {
                    res += NOT_IN_WORD_INDICATOR[0] + letter + NOT_IN_WORD_INDICATOR[1];
                }
            }
            guessedWords.add(word);
            addGuessedLetters(word);
            return res;
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
        return (getWordWithGuesses().contains(EMPTY.toString()));
    }
}
