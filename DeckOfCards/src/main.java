import Models.Deck;

public class main {

    public static void main(String[] args){
        Deck shuffleDeck = Deck.Shuffle(1);
        System.out.println(shuffleDeck.getName());
    }
}
