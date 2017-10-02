/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumkortspil;

/**
 *
 * @author burhan
 */


public class Main {

    // Hjemmeopgave KORTSPIL til 02.10.2017 fra Andras slides

    

    public static void main(String[] args) 
    {

        //TEST

        //System.out.println("Hello BlackJackPlayer!");



        // Declaring the variables

        Rank highCard, faceCard, card1, card2;



        // Initiliating variables; (faceCard, card1 and card2, randomly chosen by me!)

        highCard = Rank.ACE;

        faceCard = Rank.QUEEN;

        card1 = Rank.EIGHT;

        card2 = Rank.SIX;



        System.out.println("\nA blackjack hand: " + highCard + " and " + faceCard);



        // Declaring and initialising the two next variables as ordinals

        // The ordinal method reads from zero, and ACE is one, so I have to start adding 1.

        int card1Val, card2Val;

        card1Val = card1.ordinal() +1;

        card2Val = card2.ordinal() +1;



        System.out.println("\nA two card hand: " + card1 + " " + card2);

        System.out.println("Hand value: " + ("The sum of the face values of the two cards; "

                + card1 + " and " + card2 + " is " + (card1Val + card2Val)));



    }

}