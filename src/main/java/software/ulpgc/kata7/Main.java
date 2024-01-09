package software.ulpgc.kata7;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        new JFrame() {
            {
                setTitle("Hello world");
                setSize(800, 400);
                setLocationRelativeTo(null);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        }.setVisible(true);
    }
}
