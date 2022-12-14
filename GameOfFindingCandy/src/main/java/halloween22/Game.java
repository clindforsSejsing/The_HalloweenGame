package halloween22;


import javax.swing.*;
import java.awt.*;


public class Game {

   private static int monsterNr = 0;

   public static void setMonsterNr(int monsterNr) {
      Game.monsterNr = monsterNr;
   }

   public static void setState(int state) {
      Game.state = state;
   }

   private static int state = 0;


   Game() {

      JFrame frame = new JFrame("Chat_with_the_monsters");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(800, 400);


      JPanel panel = new JPanel();
      JTextField userInputTextField = new JTextField(80);
      userInputTextField.setFont(new Font("Arial Unicode MS", Font.BOLD, 16));
      JButton sendBtn = new JButton("Skicka");


      JTextArea chatWindow = new JTextArea ( 20, 58 );
      chatWindow.setFont(new Font("Arial Unicode MS", Font.BOLD, 16));
      chatWindow.setEditable ( false ); // set textArea non-editable*/

      //adding scrollfunction
      JScrollPane scroll = new JScrollPane ( chatWindow );
      scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );

      GridBagLayout layout = new GridBagLayout();

      panel.setLayout(layout);

      GridBagConstraints gbc = new GridBagConstraints();
      gbc.fill = GridBagConstraints.HORIZONTAL;
      gbc.gridx = 0;
      gbc.gridy = 0;
      gbc.gridwidth = 2;

      panel.add(scroll, gbc);

      gbc.gridx = 0;
      gbc.gridy = 1;
      gbc.gridwidth = 1;

      panel.add(userInputTextField, gbc);


      gbc.gridx = 1;
      gbc.gridy = 1;
      panel.add(sendBtn, gbc);


      frame.add(panel);
      frame.pack ();
      frame.setLocationRelativeTo ( null );

      frame.getContentPane().add(BorderLayout.SOUTH, panel);
      frame.setVisible(true);

      sendBtn.addActionListener(e -> gettingUserInputAndPrintingItToTextArea(userInputTextField, chatWindow));

      String startGame = HalloweenCharacters.characters[0].getWelcomeGreeting();
      chatWindow.append(startGame);

   }

   /**
    * @param userInputTextField Textfield that takes userinput.
    * @param chatWindow TextArea where conversation takes place =  chat-window.
    */
   private static void gettingUserInputAndPrintingItToTextArea(JTextField userInputTextField, JTextArea chatWindow) {
      String inputString = userInputTextField.getText().toLowerCase();
      chatWindow.append('\n' + inputString + '\n'+ '\n');
      userInputTextField.setText("");
      chatWindow.append(myGame(inputString));
   }

   /**
    * @param input text from user.
    * @return returning feedback to user.
    */
   public static String myGame(String input)
   {
      if(state == 0)
      {
            if(!input.isEmpty())
            {
               state++;
               return HalloweenCharacters.characters[monsterNr].getQuestion();
            }
            else
            {
               return "";
            }
      }
      else if(state == 1)
      {
         if(isCorrectAnswer(input, monsterNr)){
            monsterNr++;
            state++;
            return ("Det r\u00E4tta svaret \u00E4r..." + '\n' + '\n'  +
                    HalloweenCharacters.characters[monsterNr-1].getCorrectAnswer()) + '\n' + '\n'
                    + HalloweenCharacters.characters[monsterNr-1].getGoodbyeMessage();
         }
         else
         {
            return (HalloweenCharacters.characters[monsterNr].getWrongAnswer());
         }
      }
      else if(state == 2)
      {
         state = 0;
         return HalloweenCharacters.characters[monsterNr].getWelcomeGreeting();
      }

      return "";
   }

   /**
    * @param inputString Userinput.
    * @param monster counter of what character were talking to.
    * @return get feedback if users answer is correct or not.
    */
   static boolean isCorrectAnswer(String inputString, int monster)
   {
      boolean answer;

      answer = inputString.contains(HalloweenCharacters.characters[monster].getCorrectAnswer()) ||
              inputString.contains(HalloweenCharacters.characters[monster].getKeyword());
      return answer;
   }
}
