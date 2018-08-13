import java.util.ArrayList;
import java.util.*;

public class Pack {
   List <Card> cards;

    public Pack(){
        cards = new ArrayList<>();
        int index = 0;
        for (Card.Suits suits : Card.Suits.values()) {
            if(!suits.equals(Card.Suits.JOKER)){
            for (Card.Ranks ranks : Card.Ranks.values()) {
                if(!ranks.equals(Card.Ranks.ZERO))
                cards.add(new Card (suits,ranks));
            }
        }
        }
       cards.add(new Card(Card.Suits.JOKER,Card.Ranks.ZERO)) ;
        cards.add(new Card(Card.Suits.JOKER,Card.Ranks.ZERO)) ;
    }




}