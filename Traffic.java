import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Traffic implements ItemListener {
    public JRadioButton red, green, yellow;
    public JLabel msg;
    public Traffic() {
        JFrame fr = new JFrame();
        fr.setTitle("TRAFFIC");
        fr.setSize(400, 400);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel P1 = new JPanel();
        JPanel P2 = new JPanel();
        GridLayout g = new GridLayout(2, 1);
        fr.setLayout(g);
        msg = new JLabel("COLOUR");
        Font f = new Font("", Font.BOLD, 25);
        msg.setFont(f);
        P1.setLayout(new FlowLayout());
        P1.add(msg);
        red = new JRadioButton("Red", true);
        green = new JRadioButton("Green");
        yellow = new JRadioButton("Yellow");
        red.setForeground(Color.red);
        green.setForeground(Color.green);
        yellow.setForeground(Color.yellow);
        ButtonGroup b = new ButtonGroup();
        b.add(red);
        b.add(green);
        b.add(yellow);
        red.addItemListener(this);
        green.addItemListener(this);
        yellow.addItemListener(this); 
        P2.setLayout(new FlowLayout());
        P2.add(red);
        P2.add(green);
        P2.add(yellow);
        fr.add(P1);
        fr.add(P2);
        fr.setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (red.isSelected()) {
            msg.setText("STOP!");
            msg.setForeground(Color.RED);
        } else if (yellow.isSelected()) {
            msg.setText("WAIT!");
            msg.setForeground(Color.ORANGE);
        } else if (green.isSelected()) {
            msg.setText("GO!");
            msg.setForeground(Color.GREEN.darker());
        }
    }
    public static void main(String[] args) {
        new Traffic();
    }
}