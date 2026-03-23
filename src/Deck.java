import java.util.Collections;
import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<Card>();
        
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    
        for (String s: suits){
            for (String r: ranks){
                int val;

                if (r.equals("Ace")){
                    val = 11;
                }else if (r.equals("Jack") || r.equals("Queen") || r.equals("King")){
                    val = 10;
                }else {
                    val = Integer.parseInt(r);
                }

                cards.add(new Card(s,r, val));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card dealCard(){
        return cards.remove(0);
    }

    public int size(){
        return cards.size();
    }
}

