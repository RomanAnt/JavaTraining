import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CardEnum 
{
	public enum Rank {DEUCE, THREE, FOR, FIVE, SIX, SEVEN, EIGHT,
								NINE, TEN, JACK, QUEEN, KING, ACE }
	
	public enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES}
	
	private static  Rank rank;
	private static  Suit suit;
	
	private CardEnum(Rank rank, Suit suit)
	{
		this.rank = rank;
		this.suit = suit;
	}
	
	public Rank rank()
	{
		return this.rank;
	}
	
	public Suit suit()
	{
		return this.suit;
	}
	
	public String toString()
	{
		return (rank + " of " + suit);
	}
	
	private static final List<CardEnum> protoDeck = 
								new ArrayList<CardEnum>();
	
	static
	{
		for(Suit s : (Suit.values()))
		{
			for(Rank r : (Rank.values()))
			{
				protoDeck.add(new CardEnum(rank,s));
			}
		}
	}
	
	public static ArrayList<CardEnum> newDeck()
	{
		return new ArrayList<CardEnum>(protoDeck);
	}
	
	public static void main (String argy [])
	{
		List<CardEnum> deck = CardEnum.newDeck();
		Collections.shuffle(deck);
		
		for(CardEnum c : deck)
		{
			System.out.println(c + " ");
		}
	}

}
