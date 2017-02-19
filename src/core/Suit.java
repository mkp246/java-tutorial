package core;

public enum Suit {
    DIAMOND("RED", 1),
    SPADES("BLACK", 2),
    CLUBS("BLACK", 3),
    HEARTS("RED", 4);

    private final String colour;
    private final int precedence;
    Suit(String colour, int precedence){
        this.colour = colour;
        this.precedence = precedence;
    }

    public String getColour() {
        return colour;
    }

    public int getPrecedence() {
        return precedence;
    }
}
