
import java.awt.*;
import javax.swing.*;

public class Greetings2 extends JPanel {
	
   private int myWindowWidth = 300;
   private int myWindowHeight = 400;
	
   public Greetings2() {
      JFrame easel = new JFrame();		
      easel.setSize (myWindowWidth, myWindowHeight);
      easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      easel.add (this);
      easel.setVisible (true);
   }
   
   public void paintComponent (Graphics g) {
      g.setColor(Color.pink);
      this.newDrawRect(g, 100, 100, 90, 40);
      
   }
   
   
   // Step 25 Write newDrawRect2 here, which calls drawLine four times.
   public void newDrawRect(Graphics g, int tlx, int tly, int width, int height) {
      g.drawLine(tlx, tly, tlx+width, tly);
      g.drawLine(tlx, tly, tlx, tly+height);
      g.drawLine(tlx+width, tly+height, tlx+width, tly);
      g.drawLine(tlx+width, tly+height, tlx, tly+height);
   }
   
   // Step 26 This method takes top-left x, top-left y, bottom-right x, bottom-right y to define
   //  a rectangle.  It should take drawRect.
   public void newDrawRect2(Graphics g, int tlx, int tly, int brx, int bry) {
      this.newDrawRect(g, tlx, tly, brx-tlx, bry-tly);
   }

   public void safeDrawRect(Graphics g, int tlx, int tly, int brx, int bry){
      int maxX = this.getSize().width;
      int maxY = this.getSize().height;
      if (tlx>=0 && tly>=0 && brx<=maxX && bry<=maxY)
         this.newDrawRect(g, tlx, tly, maxX, maxY);
   }

   
}
