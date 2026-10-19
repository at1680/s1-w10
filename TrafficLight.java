import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class TrafficLight extends JPanel implements MouseListener{
    private int clicks = 0;
    public TrafficLight () {
        JFrame myFrame = new JFrame();      
        myFrame.setSize (800, 1000);
        myFrame.add (this);
        myFrame.setVisible (true);
                
        addMouseListener (this);
    }
	public void paintComponent(Graphics g){
    	Graphics2D g2d = (Graphics2D) g;
    	g2d.setStroke(new BasicStroke(10.0f));
        g.drawOval(100, 100, 200, 200);
        g.drawOval(100, 350, 200, 200);
        g.drawOval(100, 600, 200, 200);
        if (clicks%3==1){
            g.setColor(Color.red);
            g.fillOval(100, 100, 200, 200);
        }
        if (clicks%3==2){
            g.setColor(Color.yellow);
            g.fillOval(100, 350, 200, 200);
        }
        if (clicks%3==0){
            g.setColor(Color.green);
            g.fillOval(100, 600, 200, 200);
        }
	}

    public void mouseClicked(MouseEvent event){

    }
	public void mouseDragged(MouseEvent event){

	}

	public void mouseMoved(MouseEvent event){

	}
	
	public void mouseReleased (MouseEvent event) {
	}
	
	public void mousePressed (MouseEvent event) {
        clicks++;
        repaint();
	}
	
	public void mouseEntered (MouseEvent event) {
	}
	
	public void mouseExited (MouseEvent event) {
	}
}

