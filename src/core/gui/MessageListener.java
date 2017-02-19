package core.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MessageListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("message received");
    }
}
