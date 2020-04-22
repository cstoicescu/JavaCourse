package Ch11.Packages.BasicWindow;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyWindow extends Frame {
    @Setter @Getter
    private String firstName;
    @Setter @Getter
    private String lastName;

    public MyWindow(String title, String firstName, String lastName) {
        super(title);
        this.firstName = firstName;
        this.lastName = lastName;
        setSize(500,150);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SanseSerif",Font.BOLD, 18);
        Font sansSerifSmall = new Font("SanseSerif",Font.BOLD,12);
        g.setFont(sansSerifSmall);
        g.drawString(firstName,60,60);
        g.setFont(sansSerifLarge);
        g.drawString(lastName,60,100);
    }
}
