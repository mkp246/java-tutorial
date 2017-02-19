package core.gui;

import javax.swing.*;
import java.awt.*;

public class UI implements Runnable {
    private JFrame frame;

    public UI() {
    }

    @Override
    public void run() {
        frame = new JFrame("title");
        frame.setPreferredSize(new Dimension(600, 400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        createComponents(frame.getContentPane());
        createComponentGrid(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new BorderLayout());
        JLabel text = new JLabel("Text field|");
        container.add(text, BorderLayout.NORTH);
        JButton button = new JButton("click me");
        button.addActionListener(new MessageListener());
        container.add(button, BorderLayout.EAST);
        container.add(new JButton("South"), BorderLayout.SOUTH);
        container.add(new JButton("West"), BorderLayout.WEST);
        container.add(new JButton("Center"), BorderLayout.CENTER);
    }

    public void createComponentGrid(Container container){
        container.setLayout(new GridLayout(1,3));
        JTextArea jTextAreaLeft = new JTextArea("the copier");
        JTextArea jTextAreaRight = new JTextArea();
        JButton copyButton = new JButton("copy");
        copyButton.addActionListener(new AreaCopier(jTextAreaLeft, jTextAreaRight));
        container.add(jTextAreaLeft);
        container.add(copyButton);
        container.add(jTextAreaRight);
    }

    public JFrame getFrame() {
        return frame;
    }
}
