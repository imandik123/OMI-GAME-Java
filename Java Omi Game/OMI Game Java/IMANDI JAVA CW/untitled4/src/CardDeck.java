public class CardDeck {

    Cards card1 = new Cards("♦", "7", 7);  //card 1 stores 7 0f diamonds
    Cards card2 = new Cards("♦", "8", 8);    //card 2 stores 8 0f diamonds
    Cards card3 = new Cards("♦", "9", 9);    //card 3 stores 9 0f diamonds
    Cards card4 = new Cards("♦", "10", 10);    //card 4 stores 10 0f diamonds
    Cards card5 = new Cards("♦", "J", 11);      //card 5 stores jack 0f diamonds
    Cards card6 = new Cards("♦", "Q", 12);       //card 6 stores queen 0f diamonds
    Cards card7= new Cards("♦", "K", 13);        //card 7 stores king  0f diamonds
    Cards card8 = new Cards("♦", "A", 14);       //card 8 stores ace of diamonds

    Cards card9 = new Cards("♥", "7", 7);         //card9 stores the 7 of hearts
    Cards card10 = new Cards("♥", "8", 8);         //card10 stores the 8 of hearts
    Cards card11 = new Cards("♥", "9", 9);          //card11 stores the 9 of hearts
    Cards card12 = new Cards("♥", "10", 10);           //card12 stores the 10 of hearts
    Cards card13 = new Cards("♥", "J", 11);        //card13 stores the jack of hearts
    Cards card14 = new Cards("♥", "Q", 12);        //card14 stores the queen  of hearts
    Cards card15 = new Cards("♥", "K", 13);         //card15 stores the king of hearts
    Cards card16 = new Cards("♥", "A", 14);        //card16 stores the ace of hearts


    Cards card17 = new Cards ("♠", "7", 7);      //card17 stores the 7 of spades
    Cards card18 = new Cards("♠", "8", 8);      //card18 stores the 8 of spades
    Cards card19 = new Cards("♠", "9", 9);      //card 19 stores the 9 of spades
    Cards card20 = new Cards("♠", "10", 10);   //card20 stores the 10 of spades
    Cards card21 = new Cards("♠", "J", 11);    //card21 stores the jack of spades
    Cards card22 = new Cards("♠", "Q", 12);    //card22 stores the queen of spades
    Cards card23 = new Cards("♠", "K", 13);    //card23 stores the king of spades
    Cards card24 = new Cards("♠", "A", 14);    //card24 stores the ace of spades



    Cards card25 = new Cards("♣", "7", 7);    //card 25 stores the 7 of clubs
    Cards card26 = new Cards("♣", "8", 8);    //card 26 stores the 8 of clubs
    Cards card27 = new Cards("♣", "9", 9);  //card 27 stores the 9 of clubs
    Cards card28 = new Cards("♣", "10", 10);   //card 28 stores the 10 of clubs
    Cards card29 = new Cards("♣", "J", 11);   //card29 stores the jack of clubs
    Cards card30 = new Cards("♣", "Q", 12);  //card30 stores the queen of clubs
    Cards card31 = new Cards("♣", "K", 13);  //card31 stores the king of clubs
    Cards card32 = new Cards("♣", "A", 14);    //cad32 stores the ace of clubs





    public Cards CheckCard(String UserInput) {
        Cards userStartPlay = null;            //input given by user (userStartPlay)  initially set to null
        if (UserInput.equals("7♦"))    //checks if users input is equal to 7 of diamonds
            userStartPlay = card1;      //assigns to card1
        else if (UserInput.equals("8♦"))  //checks if users input is equal to 8 of diamonds
            userStartPlay = card2;    //assigns to card2
        else if (UserInput.equals("9♦"))  //checks if users input is equal to 9 of diamonds
            userStartPlay = card3;     //assigns to card3
        else if (UserInput.equals("10♦"))   //checks if users input is equal to 10 of diamonds
            userStartPlay = card4;     //assigns to card4
        else if (UserInput.equals("J♦"))   //checks if users input is equal to jack of diamonds
            userStartPlay = card5;      //assigns to card5
        else if (UserInput.equals("Q♦"))    //checks if users input is equal to queen of diamonds
            userStartPlay = card6;    //assigns to card6
        else if (UserInput.equals("K♦"))    //checks if users input is equal to king of diamonds
            userStartPlay = card7;    //assigns to card7
        else if (UserInput.equals("A♦"))     //checks if users input is equal to ace of diamonds
            userStartPlay = card8;   //assigns to card8
        else if (UserInput.equals("7♥"))     //checks if users input is equal to 7 of hearts
            userStartPlay = card9;     //assigns to card9
        else if (UserInput.equals("8♥"))    //checks if users input is equal to 8 of hearts
            userStartPlay = card10;     //assigns to card10
        else if (UserInput.equals("9♥"))     //checks if users input is equal to 9 of hearts
            userStartPlay = card11;     //assigns to card11
        else if (UserInput.equals("10♥"))     //checks if users input is equal to 10 of hearts
            userStartPlay = card12;    //assigns to card12
        else if (UserInput.equals("J♥"))     //checks if users input is equal to jack of hearts
            userStartPlay = card13;    //assigns to card13
        else if (UserInput.equals("Q♥"))        //checks if users input is equal to queen of hearts
            userStartPlay = card14;     //assigns to card14
        else if (UserInput.equals("K♥"))       //checks if users input is equal to king of hearts
            userStartPlay = card15;      //assigns to card15
        else if (UserInput.equals("A♥"))        //checks if users input is equal to ace of hearts
            userStartPlay = card16;    //assigns to card16
        else if (UserInput.equals("7♠"))        //checks if users input is equal to 7 of spades
            userStartPlay = card17;     //assigns to card17
        else if (UserInput.equals("8♠"))          //checks if users input is equal to 8 of spades
            userStartPlay = card18;      //assigns to card18
        else if (UserInput.equals("9♠"))          //checks if users input is equal to 9 of spades
            userStartPlay = card19;      //assigns to card19
        else if (UserInput.equals("10♠"))        //checks if users input is equal to 10 of spades
            userStartPlay = card20;       //assigns to card20
        else if (UserInput.equals("J♠"))       //checks if users input is equal to jack of spades
            userStartPlay = card21;    //assigns to card21
        else if (UserInput.equals("Q♠"))      //checks if users input is equal to queen of spades
            userStartPlay = card22;   //assigns to card22
        else if (UserInput.equals("K♠"))       //checks if users input is equal to king of spades
            userStartPlay = card23;    //assigns to card23
        else if (UserInput.equals("A♠"))          //checks if users input is equal to ace of spades
            userStartPlay = card24;     //assigns to card24
        else if (UserInput.equals("7♣"))         //checks if user input is equal to 7 of clubs
            userStartPlay = card25;     //assigns to card25
        else if (UserInput.equals("8♣"))        //checks if user input is equal to 8 of clubs
            userStartPlay = card26;    //assigns to card26
        else if (UserInput.equals("9♣"))       //checks if user input is equal to 9 of clubs
            userStartPlay = card27;    //assigns to card27
        else if (UserInput.equals("10♣"))       //checks if user input is equal to 10 of clubs
            userStartPlay = card28;     //assigns to card28
        else if (UserInput.equals("J♣"))      //checks if user input is equal to jack of clubs
            userStartPlay = card29;     //assigns to card29
        else if (UserInput.equals("Q♣"))       //checks if user input is equal to queen of clubs
            userStartPlay = card30;    //assigns to card30
        else if (UserInput.equals("K♣"))     //checks if user input is equal to king of clubs
            userStartPlay = card31;      //assigns to card31
        else if (UserInput.equals("A♣"))        //checks if user input is equal to ace of clubs
            userStartPlay = card32;      //assigns to card32
        return userStartPlay;          //returns users input
    }



}
