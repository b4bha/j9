/*Create an applet which displays a message in the center of the screen.
 * The message indicates the events taking place on the applet window. 
 *Handle events like mouse click, mouse moved, mouse dragged, mouse pressed.
 * The message should update each time an event occurs. 
 *The message should give details of the event such as which mouse button was pressed*/
 import java.awt.*;
 import java.applet.*;
 import java.awt.event.*;
 /*<applet code="Slip9_1" width=400 height=200></applet>*/
 public class Slip9_1 extends Applet implements MouseMotionListener,MouseListener
{
	String msg="";
 	public void init()
 	{
 		setBackground(Color.cyan);
 		addMouseMotionListener(this);
 		addMouseListener(this);
 	}
 	public void paint(Graphics g)
 	{
 		g.drawString(msg,250,250);
 	}
 	public void mouseDragged(MouseEvent e)
 	{
 		msg="Mouse Dragged.";
 		repaint();
 	}
 	public void mouseMoved(MouseEvent e)
 	{
 		msg="Mouse Moved.";
 		repaint();
 	}
 	public void mouseClicked(MouseEvent e)
 	{
 		msg="Mouse Button"+e.getButton()+"clicked.";
 		repaint();
 	}
 	public void mousePressed(MouseEvent e)
 	{
 		msg="Mouse Button"+e.getButton()+"pressed.";
 		repaint();
 	}
 	public void mouseReleased(MouseEvent e)
 	{
 		msg="Mouse Button Released.";
 		repaint();
 	}
 	public void mouseEntered(MouseEvent e)
 	{
 	}
 	public void mouseExited(MouseEvent e)
 	{
 	}
 }