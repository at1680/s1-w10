/** 
 * A simple graphics program
 */

import java.awt.*;
import javax.swing.*;

public class Shapes extends JPanel {

   private int myWindowWidth = 300;
   private int myWindowHeight = 400;

   public Shapes() {
      JFrame easel = new JFrame();		
      easel.setSize (myWindowWidth, myWindowHeight);
      easel.add (this);
      easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      easel.setVisible (true);
   }


   public void paintComponent (Graphics g) {
      g.setColor(Color.red);
      g.fillOval(100,100,50,50);
      g.setColor(Color.green);
      this.drawBullsEye(g);
   }

   public void drawBullsEye(Graphics g){
      g.setColor(Color.red);
      g.drawOval(0, 0, 500, 500);
   }

   public void olympicsRings(Graphics g){

   }

   public void trafficLight(Graphics g){

   }
}
