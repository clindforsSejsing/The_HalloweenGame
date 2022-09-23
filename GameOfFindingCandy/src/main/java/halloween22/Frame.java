package halloween22;


import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;


import static halloween22.GameOffFindingCandy.*;

public class Frame {

   int monsterNr = 0;
   int state = 0;

   Frame() {
      //creating frame, setting size
      JFrame frame = new JFrame("Chat_with_the_monsters");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(800, 400);

      //Creating the MenuBar and adding components
      JMenuBar mb = new JMenuBar();
      JMenu m1 = new JMenu("Happy Halloween");
      mb.add(m1);


      //Creating the panel at bottom and adding components
      JPanel panel = new JPanel();
      JLabel label = new JLabel("Ditt svar:");
      JTextField tf = new JTextField(80);
      tf.setFont(new Font("Arial Unicode MS", Font.BOLD, 16));
      /*tf.setForeground(Color.yellow);*/
      JButton send = new JButton("Skicka");


      JTextArea ta = new JTextArea ( 20, 58 );
      ta.setFont(new Font("Arial Unicode MS", Font.BOLD, 16));
      ta.setEditable ( false ); // set textArea non-editable*/

      JPanel middlePanel = new JPanel ();
      middlePanel.setBorder ( new TitledBorder ( new EtchedBorder (), "HalloweenGame" ) );
      JScrollPane scroll = new JScrollPane ( ta );
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

      panel.add(tf, gbc);


      gbc.gridx = 1;
      gbc.gridy = 1;
      panel.add(send, gbc);



      frame.add(panel);
      frame.pack ();
      frame.setLocationRelativeTo ( null );

      frame.getContentPane().add(label, BorderLayout.CENTER);
      frame.getContentPane().add(BorderLayout.SOUTH, panel);
      frame.getContentPane().add(BorderLayout.NORTH, mb);
      frame.setVisible(true);

      send.addActionListener(e -> {
         String inputString = tf.getText();
         ta.append('\n' + inputString + '\n'+ '\n');
         tf.setText("");
         ta.append(myGame(inputString));

      });

      String startGame = ( HalloweenCharacters.characters[0].getWelcomeGreeting());
      monsterGreeting(startGame);
      ta.append(startGame);

   }

   private String myGame(String input)
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
            return ("Fel svar, f\u00F6rs\u00F6k igen!");
         }
      }
      else if(state == 2)
      {
         state = 0;
         return HalloweenCharacters.characters[monsterNr].getWelcomeGreeting();
      }

      return "";
   }



   private String checkAnswer(String input, int monster)
   {
      if(isCorrectAnswer(input, monsterNr))
      {
         monsterNr++;
         return ("Det r\u00E4tta svaret \u00E4r..." + HalloweenCharacters.characters[monsterNr-1].getCorrectAnswer());
      }
      else
      {
         return ("Fel svar, f\u00F6rs\u00F6k igen!");
      }
   }

   private boolean isCorrectAnswer(String inputString, int monster)
   {
      boolean answer = false;
      System.out.println("Svaret är: "+HalloweenCharacters.characters[monster].getCorrectAnswer());

      if(inputString.contains(HalloweenCharacters.characters[monster].getCorrectAnswer()) ||
              inputString.contains(HalloweenCharacters.characters[monster].getKeyword())){
         answer = true;
      }else{
         answer = false;
      }
      return answer;
   }

   private String monsterQuestion(String inputString) { //gets input and checks it
      System.out.println(inputString + "this");
      String answer;
      answer= null;

      if(inputString.contains(HalloweenCharacters.characters[0].getCorrectAnswer()) ||
              inputString.contains(HalloweenCharacters.characters[0].getKeyword())){
            answer = ("Det r\u00E4tta svaret \u00E4r..." + HalloweenCharacters.characters[0].getCorrectAnswer());
      }else{
         answer = ("Fel svar, f\u00F6rs\u00F6k igen!");
      }
      return answer;
   }

   private String monsterGreeting(String startGame) {

      int monster;
      monster = 0;
      if (monster == 0) {
         String question = (HalloweenCharacters.characters[0].getQuestion());
         return question;
      }else {

      }
      return "";
   }


}
