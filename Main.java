import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main(){
        this.setTitle("MVC");
        this.setSize(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container pane = this.getContentPane();
        pane.setLayout(new GridLayout(2, 1));
        Counter counter = new Counter(); // модель в шаблоне MVC
        MyPanel panel = new MyPanel(counter);
        MyButton button = new MyButton(counter, panel);
        pane.add(panel);
        pane.add(button);

        this.setVisible(true);

        counter.addObserver(button);
    }

    public static void main(String[] args){
        new Main();
    }
}
