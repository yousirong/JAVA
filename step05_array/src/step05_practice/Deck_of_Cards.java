package step05_practice;

public class Deck_of_Cards {

	public static void main(String[] args) {
		// 포커의 덱
		int[] deck  =new int[52];
		String[] suits = {"Spades", "Hearts", "Diamods", "Clubs"};
		String[] ranks = {"Ace", "2","3","4","5", "6", "7", "8", "9","10","Jack", "Queen", "King"};
		
		//Initialize cards
		for( int i = 0 ; i < deck.length; i++)
			deck[i] = i;
		
		// Shuffle the cards
		for( int i =0; i < deck.length; i++) {
			//Generate an index randomly
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[index] = temp;
		}
		
	}
}
