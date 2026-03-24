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

        player.receiveCard(deck.dealCard());
        dealer.receiveCard(deck.dealCard());
        player.receiveCard(deck.dealCard());
        dealer.receiveCard(deck.dealCard());

        System.out.println(player);

        while (player.getTotal() < 21){
            System.out.println("Do you want to hit or stand? (h/s)");
            String decision = sc.nextLine();

            if (decision.equals("h")){
                player.receiveCard(deck.dealCard());
                System.out.println(player);

                if (player.getTotal() > 21){
                    System.out.println("Bust! You went over 21.");
                    break;
                }

            }
            else if (decision.equals("s")){
                    System.out.println("You stand at " + player.getTotal());
                    break;    
            }
            
        }
        
    }

}
