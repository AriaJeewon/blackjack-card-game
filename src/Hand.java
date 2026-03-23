import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards;

    public Hand(){
        cards = new ArrayList<Card>();
    }

    public void addCard(Card c){
        cards.add(c);
    }

    public int getTotal() {
        int numAces =0;
        int total = 0;
        for (Card c: cards){
            if (c.getValue() == 11){
                numAces++;
            }
            total += c.getValue();
        }
        while (total > 21 && numAces > 0){
            total -= 10;
            numAces --;
        }
        return total;
    }

    @Override
    public String toString(){
        String result = "";
        for (Card c: cards){
            result += c + ", ";
        }
        return result.isEmpty() ? result : result.substring(0, result.length() - 2);
    }

}