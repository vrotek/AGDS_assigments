package Test.Lists.P760;

import Test.Lists.P760.Card.Card;
import Test.Lists.P760.Card.Suit;
import Test.Lists.P760.CardHand.CardHand;

public class main {

    public static CardHand hand = new CardHand();

    public static void main(String[] args) {
        Card card1 = new Card(Suit.HEARTS,4);
        Card card2 = new Card(Suit.HEARTS,12);
        Card card3 = new Card(Suit.HEARTS,1);
        Card card4 = new Card(Suit.DIAMONDS,12);
        Card card5 = new Card(Suit.SPADES,12);

        hand.addCard(card1.getValue(),card1.getFace());
        hand.addCard(card2.getValue(),card2.getFace());
        hand.addCard(card4.getValue(),card4.getFace());
        hand.addCard(card3.getValue(),card3.getFace());
        hand.addCard(card5.getValue(),card5.getFace());

        Card draw1 = hand.play(Suit.DIAMONDS);
        Card draw2 = hand.play(Suit.HEARTS);
        Card draw3 = hand.play(Suit.HEARTS);
        Card draw4 = hand.play(Suit.SPADES);
        Card draw5 = hand.play(Suit.SPADES);

        System.out.println("Card 1: " + draw1.getFace() + " " + draw1.getValue());
        System.out.println("Card 2: " + draw2.getFace() + " " + draw2.getValue());
        System.out.println("Card 3: " + draw3.getFace() + " " + draw3.getValue());
        System.out.println("Card 4: " + draw4.getFace() + " " + draw4.getValue());
        System.out.println("Card 5: " + draw5.getFace() + " " + draw5.getValue());

    }
}
