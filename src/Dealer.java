import java.util.ArrayList;

public class Dealer {
    private String name; 
    private Hand hand;


    public Dealer(String n){
        this.name = n;
        this.hand = new Hand();
    }

    public String getName(){
        return name; 
    }

    public Hand getHand(){
        return hand;
    }

    public void receiveCard(Card c){
        hand.addCard(c);
    }

    public int getTotal(){
        return hand.getTotal();
    }

    public void play(Deck deck){
        while (hand.getTotal() < 17){
            hand.addCard(deck.dealCard());
        }
    }

    @Override
    public String toString(){
        String cards = hand.toString().replace("\n", "\n  ");
        return name + ":\n  " + cards + "\nTotal: " + hand.getTotal();
    }

}

