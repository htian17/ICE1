
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 * Edited by Haotian Li
 * 991609029
 */
public class CardTrick {
    public static void main(String[] args)
    {
       Card Card = new Card();
       Card.setValue(10);
       Card.setSuit("Hearts");
       System.out.println(Card.getValue() + " of " + Card.getSuit());
       
       Card Card2 = new Card();
       Card2.setValue(11);
       Card2.setSuit("Spades");
       System.out.println(Card2);
       //2nd ojb
    }
    
}
