import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    private Counter _counter;
    private String str = "0";

    public MyPanel(Counter counter){
        this.setBackground(Color.MAGENTA);
        _counter = counter;
    }

    public void setStr(int counter){
        this.str = "" + counter;
    }

    @Override
    public void paintComponent(Graphics g){
        g = (Graphics2D)g;
        super.paintComponent(g);
        g.drawString(str, 20, 20);
    }
}
