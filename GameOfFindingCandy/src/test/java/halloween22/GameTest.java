package halloween22;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.Objects;
import static org.junit.jupiter.api.Assertions.*;


class GameTest {

   @BeforeAll
   static void beforeAll() {
      new HalloweenCharacters();
      new Game();
   }

@Test
   public void testingThatEmptyUserInputReturnsNothing(){

      Game.setState(0);
      Game.setMonsterNr(0);
      String emptyString = "";
      String result = Game.myGame(emptyString);
      String expectedMessage = "";
      assertobjectequals(expectedMessage, result);
   }

   @Test
   public void testingThatRandomAnswerGetARiddleToAnswer(){

      Game.setState(0);
      Game.setMonsterNr(0);
      String randomString = "just writing something random";
      String result =Game.myGame(randomString);
      String expectedMessage = HalloweenCharacters.characters[0].getQuestion();
      assertobjectequals(expectedMessage,result);
   }
   @Test
   public void testThatUserGetsCorrectForCorrectAnswer(){

      Game.setState(1);
      String userGuess = "klocka";
      Boolean result =Game.isCorrectAnswer(userGuess, 1);
      Boolean expectedMessage = true;
      assertSame(expectedMessage,result);

   }
   @Test
   public void testThatUserGetsCorrectForCorrectKeyword(){

      Game.setState(1);
      String userGuess = "stol";
      Boolean result =Game.isCorrectAnswer(userGuess, 2);
      Boolean expectedMessage = true;
      assertSame(expectedMessage,result);

   }

   @Test
   public void testThatUserGetsWrongmessageForWrongAnswer(){

      Game.setState(1);
      Game.setMonsterNr(0);
      String userGuess = "KLoCkis";
      String results =Game.myGame(userGuess);
      String expectedWrongMessage= HalloweenCharacters.characters[0].getWrongAnswer();
      assertSame(expectedWrongMessage, results);

   }

   private void assertobjectequals(String expectedMessage, String result) {

      if (Objects.equals(expectedMessage, result)) {
         System.out.println("they are the same");
      }else{
         fail("input not working..");
      }
      }

   }




