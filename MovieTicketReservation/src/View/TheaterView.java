package View;

import Controller.SearchMovieController;
import Controller.TheaterViewController;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

public class TheaterView {
    private static GuiComponents guiComponents = new GuiComponents();

    private static JPanel jPanel = guiComponents.createPanel();
    private static JLabel jLabel = guiComponents.createLabel("Theaters Playing movie");
    private static JButton back = guiComponents.createButton("Go Back");

    public static JPanel getjPanel() {
        return jPanel;
    }

    public static JLabel getjLabel() {
        return jLabel;
    }

    public static JButton getBack() {
        return back;
    }

    public JButton getTheater() {
        return theater;
    }

    private JButton theater;

    public JPanel setupTheaterView() {
        JPanel subPanel = guiComponents.createPanel();
        BoxLayout boxLayout = new BoxLayout(subPanel, BoxLayout.Y_AXIS);
        setAlignments();
        addComponentsToPanel(subPanel, boxLayout);
        jPanel.add(subPanel);
        return jPanel;
    }

    private void setAlignments() {
        jPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        jLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
//        searchMovieButton.setBackground(Color.ORANGE);
        back.setAlignmentX(Component.CENTER_ALIGNMENT);
        back.setBackground(Color.blue);
        back.setForeground(Color.white);
    }

    private void addComponentsToPanel(JPanel panel, BoxLayout boxLayout) {
        JPanel temp = guiComponents.createPanel();
        BoxLayout b1 = new BoxLayout(temp, BoxLayout.Y_AXIS);
        String theaters[] = {"SE Cineplex", "NW Cineplex", "Downtown Cineplex", "Crowfoot Cineplex"};
        TheaterViewController theaterController = new TheaterViewController(this);

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            temp.add(Box.createRigidArea(new Dimension(200, 5)));
            theater = guiComponents.createButton(theaters[i]);
            theater.setAlignmentX(Component.CENTER_ALIGNMENT);
            theater.addActionListener(theaterController);
            temp.add(theater);
            temp.add(Box.createRigidArea(new Dimension(200, 5)));
        }
        temp.setLayout(b1);
        temp.setBorder(BorderFactory.createTitledBorder("Theaters Found"));
        panel.add(jLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 15)));
        panel.add(temp);
        panel.add(back);
        panel.setLayout(boxLayout);
    }

}
