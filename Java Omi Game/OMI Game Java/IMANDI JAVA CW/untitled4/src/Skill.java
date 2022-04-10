import java.util.ArrayList;
import java.util.Scanner;

import java.util.Random;

public class Skill {
    Scanner sc = new Scanner(System.in);
    public ArrayList<Cards> cardDeck = new ArrayList<>();  //carddeck array list created
    public ArrayList<Cards> user = new ArrayList<>();  //user array list created
    public ArrayList<Cards> robo1 = new ArrayList<>();  //robo1 array list created
    public ArrayList<Cards> robo2 = new ArrayList<>();  //robo2 array list created
    public ArrayList<Cards> robo3 = new ArrayList<>();  //robo3 array list created
    Random r = new Random();

    public void addCards(Cards... currentCard) {  //goes in a loop
        System.out.println(currentCard.length);
        for (int i = 0; i < currentCard.length ; i++) {
            cardDeck.add(currentCard[i]); //adds current card to card deck
            System.out.println(i);

        }
        System.out.println(cardDeck);
    }

    public ArrayList<Cards> getCardDeck() {
        return cardDeck;
    }  //gets carddeck

    public void shuffleDeck(ArrayList<Cards> shuffleArr) {  //shuffling algrorithm implemented
        int element = r.nextInt(32);  //gets a random number from 0-31
        for (int i = 0; i <= shuffleArr.size()+1 ; i++) {   //goes in a loop

            Cards newCard = shuffleArr.get(element);  //swaps random elememts card with card in the  index
            shuffleArr.remove(element);
            shuffleArr.add(0, newCard); //adds to a shuffling array
        }

    }

    public void leadUser() {  //if user leads the trumps
        for (int i = 0; i < 3; i++) {   //first 4 cards user
            Cards card = cardDeck.get(i);
            user.add(card);  //addded to user array
        }
        for (int i = 4; i < 8; i++) {  //next 4 cards to robo1
            Cards card = cardDeck.get(i);
            robo1.add(card);  //added to robo1 array
        }
        for (int i = 8; i < 12; i++) { //next 4  cards to robo2
            Cards card = cardDeck.get(i);
            robo2.add(card);  //added to robo2 array
        }
        for (int i = 12; i < 16; i++) {  //next 4 cards to robo3
            Cards card = cardDeck.get(i);
            robo3.add(card);  //added to robo3 array
        }
        for (int i = 16; i < 20; i++) {    //next 4 cards to user
            Cards card = cardDeck.get(i);
            user.add(card);  //addded to user array
        }
        for (int i = 20; i < 24; i++) {  //next 4 cards to robo1
            Cards card = cardDeck.get(i);
            robo1.add(card);  //added to robo1 array
        }
        for (int i = 24; i < 28; i++) {  //next 4  cards to robo2
            Cards card = cardDeck.get(i);
            robo2.add(card);   //added to robo2 array
        }
        for (int i = 28; i < 31; i++) {  //next 4 cards to robo3
            Cards card = cardDeck.get(i);
            robo3.add(card);  //added to robo3 array
        }

    }

    public void leadRobo1() {   //if robo1 leads the trumps
        for (int i = 0; i < 4; i++) {  //first four cards given to robo1
            Cards card = cardDeck.get(i);
            robo1.add(card);   //added to robo1 array
        }
        for (int i = 4; i < 8; i++) {  //next 4 cards to robo2
            Cards card = cardDeck.get(i);
            robo2.add(card);  //added to robo2 array
        }
        for (int i = 8; i < 12; i++) {  //next 4 cards to robo3
            Cards card = cardDeck.get(i);
            robo3.add(card);  //added to robo3 array
        }
        for (int i = 12; i < 16; i++) {  //next 4 cards to user
            Cards card = cardDeck.get(i);
            user.add(card);  //addded to user array
        }
        for (int i = 16; i < 20; i++) {  //next 4 cards to robo1
            Cards card = cardDeck.get(i);
            robo1.add(card); //added to robo1 array
        }
        for (int i = 20; i < 24; i++) {  //next 4 cards to robo2
            Cards card = cardDeck.get(i);
            robo2.add(card);  //added to robo2 array
        }
        for (int i = 24; i < 28; i++) {  //next 4 cards to robo3
            Cards card = cardDeck.get(i);
            robo3.add(card); //added to robo3 array
        }
        for (int i = 28; i < 32; i++) {  //next 4 cards to user
            Cards card = cardDeck.get(i);
            user.add(card);  //added to user array
        }

    }

    public void leadRobo2() {  //if robo2 leads trumps
        for (int i = 0; i < 4; i++) {  //first four cards to robo2
            Cards card = cardDeck.get(i);
            robo2.add(card); //added to robo2 array
        }
        for (int i = 4; i < 8; i++) {  //next 4 cards to robo3
            Cards card = cardDeck.get(i);
            robo3.add(card);  //added to robo3 array
        }
        for (int i = 8; i < 12; i++) {  //next 4 cards to user
            Cards card = cardDeck.get(i);
            user.add(card); //added to user array
        }
        for (int i = 12; i < 16; i++) {   //next 4 cards to robo1
            Cards card = cardDeck.get(i);
            robo1.add(card);  //added to robo1 array
        }
        for (int i = 16; i < 20; i++) {  //next 4 cards to robo2
            Cards card = cardDeck.get(i);
            robo2.add(card);  //added to robo2 array
        }
        for (int i = 20; i < 24; i++) {  //next 4 cards to robo3
            Cards card = cardDeck.get(i);
            robo3.add(card);  //added to robo3 array
        }
        for (int i = 24; i < 28; i++) {  //next 4 cards to user
            Cards card = cardDeck.get(i);
            user.add(card); //added to user array
        }
        for (int i = 28; i < 32; i++) {  //next 4 cards to robo1
            Cards card = cardDeck.get(i);
            robo1.add(card);  //added to robo1 array
        }

    }

    public void leadRobo3() {  //if robo3 leads trumps
        for (int i = 0; i < 4; i++) {   //first four cards given to robo3
            Cards card = cardDeck.get(i);
            robo3.add(card);  //added to robo3 array
        }
        for (int i = 4; i < 8; i++) {  //next 4 cards to user
            Cards card = cardDeck.get(i);
            user.add(card);  //added to user array
        }
        for (int i = 8; i < 12; i++) {   //next 4 cards to robo1
            Cards card = cardDeck.get(i);
            robo1.add(card);   //added to robo1  array
        }
        for (int i = 12; i < 16; i++) {   //next 4 cards to robo2
            Cards card = cardDeck.get(i);
            robo2.add(card);  //added to robo2 array
        }
        for (int i = 16; i < 20; i++) {   //next 4 cards to robo3
            Cards card = cardDeck.get(i);
            robo3.add(card);  //added to robo3 array
        }
        for (int i = 20; i < 24; i++) {   //next 4 cards to user
            Cards card = cardDeck.get(i);
            user.add(card);  //added to user array
        }
        for (int i = 24; i < 28; i++) {    //next 4 cards to robo1
            Cards card = cardDeck.get(i);
            robo1.add(card);  //added to robo1  array
        }
        for (int i = 28; i < 32; i++) {   //next 4 cards to robo2
            Cards card = cardDeck.get(i);
            robo2.add(card);   //added to robo2 array
        }

    }

    public ArrayList<Cards> getRobo1() {
        return robo1;
    }  //returns robo1 array

    public ArrayList<Cards> getUser() {
        return user;
    } //returns user  array

    public ArrayList<Cards> getRobo2() {
        return robo2;
    }  //returns robo2 array
    public ArrayList<Cards> getRobo3() {
        return robo3;
    }  //returns robo3 array

String trumpSuit =null;   //initialises trump suit as null
    public void trumpUser(ArrayList<Cards> arr){
        String userTrump;  //gets users trump
        leadUser();  //divides cards equally starting from user

        for(int x=0; x<=3; x++) {
            System.out.println("Your cards are  : "+ getUser().get(x).getNumber()+ getUser().get(x).getSuit()); //displays users cards
        }
        boolean flag = false; //flag assigned to false
        while (!flag){  //while flag not equal to false
            flag = true; //flag assigned to true
            System.out.println("please select a trump suit from : diamonds ,hearts ,spades ,clubs ");
            userTrump = sc.nextLine();  //gets users trump
            switch (userTrump) {
                case "diamonds":  //checks if user has put diamonds as trumps
                    trumpSuit = "♦";  //trump made diamonds
                    break;
                case "hearts":   //checks if user has put hearts  as trumps
                    trumpSuit = "♥"; //trump made hearts
                    break;
                case "spades": //checks if user has put spades  as trumps
                    trumpSuit = "♠";  //trumps made spades
                    break;
                case "clubs": //checks if user has put clubs  as trumps
                    trumpSuit = "♣";   //trumps made clubs
                    break;
                default:
                    flag = false; //flag assigned to false
            }
        }

        for(int x = 0; x<= getUser().size()-1; x++) {
            System.out.println("your cards are  : " + getUser().get(x).getNumber() + getUser().get(x).getSuit()); //prints users cards
        }

        System.out.println("the trump suit is : "+ trumpSuit);  //prints trump for that round

    }

   //trump selection for robo
    public void roboChoiceTrump(ArrayList<Cards> cardArr) {
        int RandomIndex = r.nextInt(4);   //gets a random index
        //checks if all the four cards have same suit
        if ((cardArr.get(0).getSuit().equals(cardArr.get(1).getSuit())) == (cardArr.get(2).getSuit().equals(cardArr.get(3).getSuit()))){
            trumpSuit = cardArr.get(0).getSuit(); //assigms trumps to one of the card since all hve same suit
            System.out.println("the trump suit is : "+ trumpSuit);  //prints trumps

        }
        //checks if  three card suits are equal
        //checks if first , second and third catrd suits the same
        else if((cardArr.get(0).getSuit().equals(cardArr.get(1).getSuit())) && (cardArr.get(1).getSuit().equals(cardArr.get(2).getSuit()))){
            trumpSuit = cardArr.get(0).getSuit();  //chooses one of the cards
            System.out.println("the trump suit is : "+ trumpSuit); //prints trumps
        }


        else if((cardArr.get(0).getSuit().equals(cardArr.get(2).getSuit())) && (cardArr.get(2).getSuit().equals(cardArr.get(3).getSuit()))){  //checks if first ,third and fourth suit same
            trumpSuit = cardArr.get(0).getSuit();  //chooses one of the cards with same suit
            System.out.println("the trump suit is : "+ trumpSuit); //prints trumps
        }
        else if((cardArr.get(1).getSuit().equals(cardArr.get(2).getSuit())) && (cardArr.get(2).getSuit().equals(cardArr.get(3).getSuit()))){  //checks if second ,third and fouth card suit same
            trumpSuit = cardArr.get(0).getSuit();  //chooses one of the cards with same suit
            System.out.println("the trump suit is : "+ trumpSuit); //prints trumps
        }
        else if((cardArr.get(0).getSuit().equals(cardArr.get(1).getSuit())) && (cardArr.get(1).getSuit().equals(cardArr.get(3).getSuit()))){ //checks if first,second and third card suit same
            trumpSuit = cardArr.get(0).getSuit();  //chooses one card with same suit
            System.out.println("the trump suit is : "+ trumpSuit); //prints trumps
        }

        //checks if there are two similar card suits
        else if((cardArr.get(0).getSuit().equals(cardArr.get(1).getSuit())) && (cardArr.get(2).getSuit().equals(cardArr.get(3).getSuit()))){  //checks if first and second equal and third and fourth equal

            if(cardArr.get(0).getDigit()==14 || cardArr.get(1).getDigit()==14){  //checks if either first or second card has an ace
                trumpSuit = cardArr.get(2).getSuit(); //if ace present gives to third and fourth card suit
                System.out.println("the trump suit is : "+ trumpSuit);  //prints trumps
            }
            else if(cardArr.get(2).getDigit()==14 || cardArr.get(3).getDigit()==14){  //checks if third and fourth card has an ace
                trumpSuit = cardArr.get(0).getSuit();   //if ace present gives to first and second card suit
                System.out.println("the trump suit is : "+ trumpSuit);  //prints trumps
            }
            else{
                trumpSuit = cardArr.get(RandomIndex).getSuit();  //randomly selects a trump suit usind random index value calculated
                System.out.println("the trump suit is : "+ trumpSuit);  //prints trumps
            }

        }
        //if two cards =same  suit and other two cards=same suits.

        else if((cardArr.get(0).getSuit().equals(cardArr.get(3).getSuit())) && (cardArr.get(1).getSuit().equals(cardArr.get(2).getSuit()))) {
            if (cardArr.get(0).getDigit() == 14 || cardArr.get(3).getDigit() == 14) {     //checks if first and fourth card have an ace
                trumpSuit = cardArr.get(1).getSuit(); //if present assigns trumps to second or third card suit
                System.out.println("the trump suit is : "+ trumpSuit); //prints trumps
            }
            else if (cardArr.get(1).getDigit() == 14 || cardArr.get(3).getDigit() == 14) {  //checks iff 2 and 4 card  have an ace
                trumpSuit = cardArr.get(0).getSuit();  //if ace is present then assigns trumps to first or third card suit
                System.out.println("the trump suit is : "+ trumpSuit); //prints trumps
            }
            else {
                    trumpSuit = cardArr.get(RandomIndex).getSuit();   //assigns trumps to  random card suit
                    System.out.println("the trump suit is : "+ trumpSuit); //prints trumps
            }

        }


        else if((cardArr.get(0).getSuit().equals(cardArr.get(2).getSuit())) && (cardArr.get(1).getSuit().equals(cardArr.get(3).getSuit()))) {  //first=third and second=fourth card suit
            if (cardArr.get(0).getDigit() == 14 || cardArr.get(2).getDigit() == 14) { //checks if ace is present on first or third
                trumpSuit = cardArr.get(1).getSuit();  //if present assigns trumps to second and fourth card suit
                System.out.println("the trump suit is : "+ trumpSuit);  ///prints trumps
            }
            else if (cardArr.get(1).getDigit() == 14 || cardArr.get(2).getDigit() == 14) {      //checks if ace is present on second  or fourth
                trumpSuit = cardArr.get(0).getSuit();   //if present assigns trumps to first  and third card suit
                System.out.println("the trump suit is : "+ trumpSuit);  //prints trumps
            }
            else {
                trumpSuit = cardArr.get(RandomIndex).getSuit();  //assigns random index card suit as trumps
                System.out.println("the trump suit is : "+ trumpSuit);  //prints trump
            }

        }

        //checks if two only one equal suit
        else if(cardArr.get(0).getSuit().equals(cardArr.get(1).getSuit())){  //if first and second same
            trumpSuit = cardArr.get(1).getSuit();  //assigns trumps to either first or second
            System.out.println("the trump suit is : "+ trumpSuit); //prints trumps
        }
        else if(cardArr.get(2).getSuit().equals(cardArr.get(3).getSuit())){  //if third and fourth suit same
            trumpSuit = cardArr.get(3).getSuit();   //assigns trumps to 4th card suit
            System.out.println("the trump suit is : "+ trumpSuit);   //prints trumps
        }
        else if(cardArr.get(0).getSuit().equals(cardArr.get(2).getSuit())){  //if first and third card suit same
            trumpSuit = cardArr.get(2).getSuit();  //assigns trumps to third card suit
            System.out.println("the trump suit is : "+ trumpSuit); //prints trumps
        }
        else if(cardArr.get(1).getSuit().equals(cardArr.get(3).getSuit())){   //if second and fourth suit same
            trumpSuit = cardArr.get(1).getSuit(); //assigns trumps to second
            System.out.println("the trump suit is : "+ trumpSuit); //prints trumps
        }
        else if(cardArr.get(0).getSuit().equals(cardArr.get(3).getSuit())){  //assigns first and fourth suit same
            trumpSuit = cardArr.get(3).getSuit();  //assigns trump suit to fourth
            System.out.println("the trump suit is : "+ trumpSuit); //prints trumps
        }
        else if(cardArr.get(1).getSuit().equals(cardArr.get(2).getSuit())){  //if second and third suit same
            trumpSuit = cardArr.get(2).getSuit();   //assigns trumps to the third suit
            System.out.println("the trump suit is : "+ trumpSuit); //prints trumps
        }

        //checks if all four cards have a different suit
        else{
            trumpSuit = cardArr.get(RandomIndex).getSuit();  //gets a random card and assigns its trump suit
            System.out.println("the trump suit is : "+ trumpSuit);  //prints trumps
        }






    }


}



