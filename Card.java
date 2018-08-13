public class Card{
    static enum Suits {CLUB, DIAMOND, HEART, SPADE,JOKER};
    static enum Ranks {ZERO,ACE, ONE, TWO, THREE, FOUR, FIVE,SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};

    public Suits suit;
    public Ranks rank;
    public boolean isWildCard;

    public Card(Suits suit, Ranks rank){
        this.rank = rank;
        this.suit = suit;
        isWildCard = false;
    }


    public String toString(){
        return this.suit.equals(Suits.JOKER)? "JOKER" : (this.rank + " (" + this.suit + ")");
    }

    @Override
     public boolean equals(Object o) {
        Card card = (Card)o;
        return (this.suit== card.suit && this.rank == card.rank);
    }

    public int CompareWithSuits(Card card){
        return this.suit.ordinal() - card.suit.ordinal();
    }

    public int CompareWithRanks(Card card){
        return this.rank.ordinal()- card.rank.ordinal();
    }

    public void setWildCard(Card card,Suits suit,Ranks rank){
        if(card.isWildCard){
            card.suit=suit;
            card.rank=rank;
        }
    }

}

