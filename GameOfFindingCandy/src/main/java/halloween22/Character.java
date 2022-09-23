package halloween22;

public class Character {
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getWelcomeGreeting() {
      return welcomeGreeting;
   }

   public void setWelcomeGreeting(String welcomeGreeting) {
      this.welcomeGreeting = welcomeGreeting;
   }

   public String getQuestion() {
      return question;
   }

   public void setQuestion(String question) {
      this.question = question;
   }

   public String getGoodbyeMessage() {
      return goodbyeMessage;
   }

   public void setGoodbyeMessage(String goodbyeMessage) {
      this.goodbyeMessage = goodbyeMessage;
   }

   private String name;
   private String welcomeGreeting;
   private String question;
   private String correctAnswer;

   public String getKeyword() {
      return keyword;
   }

   public void setKeyword(String keyword) {
      this.keyword = keyword;
   }

   private String keyword;

   private String goodbyeMessage;
   //ha en img? hur att lösa det?

   public String getCorrectAnswer() {
      return correctAnswer;
   }

   public void setCorrectAnswer(String correctAnswer) {
      this.correctAnswer = correctAnswer;
   }





public Character (String name, String welcomeGreeting, String question, String correctAnswer,String keyword
                  ,String goodbyeMessage){
   this.name= name;
   this.welcomeGreeting = welcomeGreeting;
   this.question = question;
   this.correctAnswer = correctAnswer;
   this.keyword = keyword;
   this.goodbyeMessage = goodbyeMessage;

}

}