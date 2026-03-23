public class Card {

    private String suit;
    private String rank;
    private int value;


    public Card (String s, String r, int v){
        this.suit = s;
        this.rank = r;
        this.value = v;
    }

    public String getSuit(){
        return suit;
    }

    public String getRank(){
        return rank;
    }

    public int getValue(){
        return value;
    }

    public String toString(){
        return rank + " of " + suit;
    }
}

