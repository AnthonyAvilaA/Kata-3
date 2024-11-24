package software.ulpgc.kata3.dirty;

import software.ulpgc.kata3.clean.Command;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class MainFrame extends JFrame {
    JFreeChartDisplay display;
    Map<String, Command> commands;

    public MainFrame() {
        this.setTitle("Statics");
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        this.add(menu(), BorderLayout.NORTH);
        this.add(getDisplay(), BorderLayout.CENTER);
        this.commands = new HashMap<>();
    }

    private JPanel getDisplay() {
        this.display = new JFreeChartDisplay();
        return this.display;
    }

    private JPanel menu() {
        JPanel panel = new JPanel();
        panel.add(toggleButton());
        return panel;
    }

    private JButton toggleButton() {
        JButton button = new JButton("toggle");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                commands.get("toggle").execute();
            }
        });
        return button;
    }

    public void add(String key, Command value) {
        this.commands.put(key, value);
    }
}
