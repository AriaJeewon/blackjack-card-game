import java.util.ArrayList;

public class Player {
    private String name; 
    private Hand hand;


    public Player(String n){
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

    @Override
    public String toString(){
        String cards = hand.toString().replace("\n", "\n  ");
        return name + ":\n  " + cards + "\nTotal: " + hand.getTotal();
    }

}
