import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleClicker extends JPanel implements MouseListener, MouseMotionListener {
    private int xClick = -9999;
	private int yClick = -9999;
    public SimpleClicker () {
        JFrame myFrame = new JFrame();      
        myFrame.setSize (300, 300);
        myFrame.add (this);
        myFrame.setVisible (true);
                
        addMouseListener (this);
    }
	public void paintComponent(Graphics g){
    	Graphics2D g2d = (Graphics2D) g;
    	g2d.setStroke(new BasicStroke(10.0f));
		if(xClick !=-9999 && yClick != -9999){
			g.setColor(Color.red);
			g.drawOval(xClick, yClick, 100, 100);
		}
	}

	public void mouseDragged(MouseEvent event){
		this.xClick = event.getX();
		this.yClick = event.getY();
		repaint();
	}

	public void mouseMoved(MouseEvent event){
		this.xClick = event.getX();
		this.yClick = event.getY();
		repaint();
	}
    
    public void mouseClicked (MouseEvent event) {
		this.xClick = event.getX();
		this.yClick = event.getY();
	}
	
	public void mouseReleased (MouseEvent event) {
	}
	
	public void mousePressed (MouseEvent event) {
		this.xClick = event.getX();
		this.yClick = event.getY();
		repaint();
	}
	
	public void mouseEntered (MouseEvent event) {
	}
	
	public void mouseExited (MouseEvent event) {
	}
}
