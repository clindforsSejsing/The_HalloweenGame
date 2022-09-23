package halloween22;

public class Character implements monster {

   @Override
   public String getWelcomeGreeting() {
      return welcomeGreeting;
   }

   @Override
   public String getQuestion() {
      return question;
   }

   @Override
   public String getGoodbyeMessage() {
      return goodbyeMessage;
   }

   private final String welcomeGreeting;
   private final String question;
   private final String correctAnswer;

   private final String wrongAnswer;

   @Override
   public String getKeyword() {
      return keyword;
   }

   private final String keyword;

   private final String goodbyeMessage;


   @Override
   public String getCorrectAnswer() {
      return correctAnswer;
   }

   @Override
   public String getWrongAnswer() {
      return wrongAnswer;
   }
public Character (String welcomeGreeting, String question, String correctAnswer,String wrongAnswer, String keyword
                  ,String goodbyeMessage){

   this.welcomeGreeting = welcomeGreeting;
   this.question = question;
   this.correctAnswer = correctAnswer;
   this.wrongAnswer = wrongAnswer;
   this.keyword = keyword;
   this.goodbyeMessage = goodbyeMessage;

}

}