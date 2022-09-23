/*
package halloween22;

//TODO: utskrift o se så objekten ser bra ut. [x]
// Börja adda in scanner för inputs [x]
// Skriv allt i main- dela upp i metoder- [x]
// och generera svar (logik o algoritm)[]
//hur får man ut första häslningsfrasen från objektet?[x]
//Se så programmet fungerar i terminal [x]
//Börja implementera i fönster. []
//kolla så programmet går att köra. []
//Skriv test. []x
//dela upp så texten läses upp från textfil till characters
//adda bilder ev []

import java.util.Objects;
import java.util.Scanner;

public class TheHalloweenGame {

   static Character[] characters = new Character[4];


   TheHalloweenGame() {

      characters[0] = new Character("Vampyren Rakel", "Välkommen till mitt slott! Jag heter Vampyren Rakel och " +
              "har bott här i si så där.. 3000 år." + '\n' + '\n'+ " Jag har förstått att ni är här för att det är halloween och ni vill ha godis?",
              "Då vill jag att du svarar på en gåta:" + '\n' + "En man hade fyra söner, " +
                      "och varje son hade en syster. Hur många barn hade mannen?", "fem", "5", "..Jaha.. vart var det där godiset nu?"
              + '\n' + "Fråga slottsbetjänten Igor!" + '\n' + "…nu är det dags " +
              "att byta glödlampa i kistan. Vi ses när vi ses, Tjingeling!");

      characters[1] = new Character("Slottsbetjänten Igor", "öööööh.... Jag är Igor." + '\n'
              + "Vem är ni och vad" +
              " vill ni med Igor?", "Då vill jag att ni svarar på en gåta: " + '\n' + "Har inga fötter, kan ändå gå. " +
              "Har inga händer kan ändå slå. Vad är jag?",
              "klockan", "klocka","..Jaha.. ja... hm.. nämen titta, där kommer ju Uffe!" + '\n' +
              "Kanske han vet var godiset är?" + '\n' + '\n' +
              " Nu måste jag återgå till att dammsuga matsalen- zombierna smular så mycket när de äter kakor! Hejsvejs!");

      characters[2] = new Character("Varulven Ulf", "*Yyyyyyyyl* ..Ledsen kidsen, såg er inte! Jag heter " +
              "Ulf men kallas Uffe och är en varulv!" +
              "Vad har ni på hjärtat då?", "Då vill jag att du svarar på en gåta:" + '\n' + "Vad har fyra ben, " +
              "en rygg men ingen kropp?", "stolen", "stol", "..ok.." + '\n' + '\n' +" hm.. angående " +
              "det där godiset.. Problemet är bara " + '\n' + "att jag inte har något godis." + '\n' + '\n' + "..." +
              "Däremot hörde jag spöket Linus prata om att han hade SÅÅ mycket godis som ligger och skräpar..."
              + '\n' + '\n' + " oj, här kommer han ju. passa på att fråga!");

      characters[3] = new Character("Spöket Linus", "Woho! Nya ansikten! tjenixen vettja! Jag heter" +
              " Linus och är slottets spöke! Vad gör ni här?", "Då vill jag att du svarar på en gåta:"
              + '\n' + '\n' + "Vad är det som tillhör dig, " +
              "men dina vänner använder det mer än du?", "ditt namn", "namn", "ok, låt gå för det."
              + '\n' + '\n' + " Jag postar godiset till er hemadress, så kollar ni brevlådan om sisådär.. " +
              "5 spök-minuter så är det ert." + '\n' + '\n' + ".. Glöm inte att borsta tänderna efteråt bara!"
              + '\n' + '\n' + "Annars blir ni tandlösa, som jag *haha*! Hejdå");

      */
/*System.out.println(characters[2].getName());
      System.out.println(characters[2].getWelcomeGreeting());
      System.out.println(characters[0].getName());
      System.out.println(characters[0].getWelcomeGreeting());*//*

   }


   public static void main(String[] args) {
      new TheHalloweenGame();

      meetingWithTheMonster();


   }


   static void meetingWithTheMonster() {
      String userInput;
      String userAnswer = null;
      int monster;
      monster = 0;
      Scanner scanner = new Scanner(System.in);
      String[] monstersWeHaveTalkedTo = new String[4];
      */
/*System.out.println(monstersWeHaveTalkedTo[0]);*//*


      while(monster < monstersWeHaveTalkedTo.length) {

         System.out.println(characters[monster].getWelcomeGreeting());
         userInput = scanner.nextLine();

         if (!Objects.equals(userInput, "")) {
            System.out.println(characters[monster].getQuestion());
            userAnswer = scanner.nextLine();
         }
         answereTheQuestion(userAnswer, userInput, monster);
         */
/*i++;*//*

         scanner.nextLine();
         monster++;
      }


   }

   static boolean answereTheQuestion(String userAnswer, String userInput, int nrOfCharacter) {

      int nrOfQuestionsAsked = 0;

      while(nrOfQuestionsAsked < 2) {
         if (userAnswer.contains(characters[nrOfCharacter].getCorrectAnswer()) || userAnswer.contains(characters[nrOfCharacter].getKeyword())) {
         */
/*if (userAnswer.contains("fem") || userAnswer.contains("5")) {*//*

            System.out.println("Det rätta svaret är..." + characters[nrOfCharacter].getCorrectAnswer());
            userInput.nextLine();
            System.out.println(characters[nrOfCharacter].getGoodbyeMessage());
            return true;

         } else {
            System.out.println("Fel svar, försök igen!");
            userAnswer = userInput.nextLine();
            nrOfQuestionsAsked++;
         }
      }

         System.out.println("aaah, svår fråga?");
         System.out.println("Det rätta svaret är..." + characters[nrOfCharacter].getCorrectAnswer());
         userInput.nextLine();
         System.out.println(characters[nrOfCharacter].getGoodbyeMessage());


      return true;
   }
}

*/
