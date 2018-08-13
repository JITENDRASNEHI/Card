import java.util.*;
public class Deck {
    List<Pack> packs;
    static int top;
    public Deck(int noOfPack){
        packs = new ArrayList<>();
        for(int i=0; i<noOfPack; i++){
            packs.add(new Pack());
        }
        shuffleDeck();
    }

    public void shuffleDeck() {
        for (int i = 0; i < packs.size(); i++) {
            Collections.shuffle(packs.get(i).cards);
        }
    }

    public ArrayList<Card> dealer(int noOfCards){
        ArrayList<Card> hand = new ArrayList<>();
        int index = top/54;
        int start = top%54;
        for(int i=start;i<start+noOfCards;i++)
            hand.add(packs.get(index).cards.get(i));
        return hand;
    }

    public void declareWildCard(Card card){
            card.isWildCard=true;
        }


    }


