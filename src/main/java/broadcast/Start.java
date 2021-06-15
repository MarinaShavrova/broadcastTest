package broadcast;

import javax.swing.*;
import java.awt.*;

public class Start extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Input:");

    public Start() {
        super("Broadcast");
        this.setSize(500,350); //размер фрейма
        this.setLocationRelativeTo(null);//для того чтобы окошко было внутри экрана
        this.setResizable(false);//запрет возможности изменять размеры фрейма
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//по нажатию на крестик закрывается полностью программа
        this.setVisible(true);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label);
        container.add(input);

    }

    public static void main(String[] args) {
        Start app = new Start();
        app.setVisible(true);
    }
}
