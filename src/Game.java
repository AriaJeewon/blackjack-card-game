import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);

        Deck deck = new Deck();
        deck.shuffle();

        System.out.print("Enter your name: ");
        String pName = sc.nextLine();
        Player player = new Player(pName);

        Dealer dealer = new Dealer("Dealer");

    }

}
