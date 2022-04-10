public class Cards {
    private String suit;    //stores the suit of the card
    private String number;  //stores the card value
    private int digit;    //stores the digit which the card represents

    public Cards(String suit, String number, int digit){  //this is the constructor for the class cards
        this.suit = suit;      //initialises the suit
        this.number = number;     //initialises the number
        this.digit = digit;    //initialises the digit
    }

    public String getSuit() { return this.suit;}    //returns the card suit
    public String getNumber() { return this.number;}   //returns card number
    public int getDigit() { return this.digit;}    //returns card digit
}




