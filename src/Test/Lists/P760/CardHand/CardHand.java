package Test.Lists.P760.CardHand;

import Test.Lists.P760.Card.Card;
import Test.Lists.P760.Card.Suit;
import Test.Lists.P760.PositionalList.DoubleLinkedPositionalList;
import Test.Lists.P760.PositionalList.IPositionalList;
import Test.Lists.P760.PositionalList.Position;

import java.util.Iterator;

public class CardHand {

    Position<Card> hearts = null;
    Position<Card> clubs = null;
    Position<Card> spades = null;
    Position<Card> diamonds = null;

    int heartsCounter = 0;
    int clubsCounter = 0;
    int spadesCounter = 0;
    int diamondsCounter = 0;

    IPositionalList<Card> hand = new DoubleLinkedPositionalList();

    public void addCard(int rank, Suit s){
        Card newCard = new Card(s,rank);

        switch (s){
            case CLUBS -> {
                this.clubs = addToFinger(clubs,newCard);
                this.clubsCounter++;
            }
            case HEARTS -> {
                this.hearts = addToFinger(hearts,newCard);
                this.heartsCounter++;
            }
            case SPADES -> {
                this.spades = addToFinger(spades,newCard);
                this.spadesCounter++;
            }
            case DIAMONDS -> {
                this.diamonds = addToFinger(diamonds,newCard);
                this.diamondsCounter++;
            }
        }

    }

    private Position<Card> addToFinger(Position<Card> finger, Card newCard){
        if(finger == null){
            return hand.addFirst(newCard);
        }else {
            hand.addAfter(finger,newCard);
            return finger;
        }
    }

    private Card removeFromFinger(Position<Card> finger,int amountOfSuit){
        if(hand.isEmpty()){return null;}
        if(finger == null){
            return hand.remove(hand.last());
        }else if(amountOfSuit > 1){
            return hand.remove(hand.after(finger));
        }else {
            return hand.remove(finger);
        }
    }

    public Card play(Suit s){
        Card removedCard = null;
        switch (s){
            case HEARTS -> {
                    removedCard = removeFromFinger(this.hearts,this.heartsCounter);
                    if(this.heartsCounter == 1){
                        this.hearts = null;
                    }
                    this.heartsCounter--;
                    return removedCard;
            }
            case CLUBS -> {
                removedCard = removeFromFinger(this.clubs,this.clubsCounter);
                if(this.clubsCounter == 1){
                    this.clubs = null;
                }
                this.clubsCounter--;
                return removedCard;
            }
            case SPADES -> {
                removedCard = removeFromFinger(this.spades,this.spadesCounter);
                if(this.spadesCounter == 1){
                    this.spades = null;
                }
                this.spadesCounter--;
                return removedCard;
            }
            case DIAMONDS -> {
                removedCard = removeFromFinger(this.diamonds,this.diamondsCounter);
                if(this.diamondsCounter == 1){
                    this.diamonds = null;
                }
                this.diamondsCounter--;
                return removedCard;
            }
        }
        return null;
    }

    public Iterator<Card> iterator(){
        return null;
    }

    public Iterator<Card> suitIterator(){
        return null;
    }

}
