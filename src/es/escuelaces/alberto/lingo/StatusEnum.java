package es.escuelaces.alberto.lingo;

public enum StatusEnum {
    OK('[', ']'),
    REGULAR('(', ')'),
    BAD(' ',' ');

    private char before;
    private char after;

    private StatusEnum (char before, char after) {
        this.before = before;
        this.after = after;
    }

    public String getWithStatus(char letter) {
        StringBuilder sb = new StringBuilder();
        sb.append(before);
        sb.append(letter);
        sb.append(after);
        return sb.toString();
    }
    
}
