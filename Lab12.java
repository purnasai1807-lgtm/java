import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class Lab12 extends MouseAdapter{
	JLabel x;
	public Lab12(){
		JFrame fr=new JFrame();
		fr.setSize(400,400);
		fr.setLayout(new GridBagLayout());
		x=new JLabel();
		fr.add(x);
		Font f=new Font("Verdana",Font.BOLD, 20);
		x.setFont(f);
		x.setForeground(Color.BLUE);
		x.setAlignmentX(Component.CENTER_ALIGNMENT);
		x.setAlignmentY(Component.CENTER_ALIGNMENT);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.addMouseListener(this);
		fr.addMouseMotionListener(this);
		fr.setTitle("Mouse");
	}
	@Override
	public void mouseClicked(MouseEvent e){
		x.setText("Mouse Clicked...");
	}
	@Override
	public void mousePressed(MouseEvent e){
		x.setText("Mouse Pressed...");
	}
	@Override
	public void mouseReleased(MouseEvent e){
		x.setText("Mouse Released..");
	}
	@Override
	public void mouseEntered(MouseEvent e){
		x.setText("Mouse Entered...");
	}
	@Override
	public void mouseExited(MouseEvent e){
		x.setText("Mouse Exited...");
	}
	@Override
	public void mouseMoved(MouseEvent e){
		x.setText("Mouse Moved...");
	}
	@Override
	public void mouseDragged(MouseEvent e){
		x.setText("Mouse Dragged...");
	}
	
	public static void main(String args[]){
		new Lab12();
	}
}