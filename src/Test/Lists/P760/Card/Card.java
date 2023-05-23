package Test.Lists.P760.Card;

public class Card {

    private Suit face;
    private int value;

    public Card(Suit face, int value){
        this.face = face;
        this.value = value;
    }


    public Suit getFace() {
        return face;
    }

    public int getValue() {
        return value;
    }
}
