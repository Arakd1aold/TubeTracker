package tubetracker;

import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Window extends JFrame {


   
    private JTextArea textArea = new JTextArea();
    private Insets marginTextArea = new Insets(12,12,12,12);

    public Window(ArrayList<Video> videos) {
        super("TubeTracker by Matt Barker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(650, 350);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        textArea.setWrapStyleWord(true);
        textArea.setMargin(marginTextArea);
        textArea.setAutoscrolls(true);
        add(textArea);
        for (int i = 0; i < videos.size(); i++) {
            String result = textArea.getText()+"\n"
                    + videos.get(i).getName()+"\n"
                    + videos.get(i).getViews()+"\n"
                    + videos.get(i).getUrl()+"\n\n";
            textArea.setText(result);
        }
    }

    public String getTextArea() {
        String text = textArea.getText();
        return text;
    }

    public void setTextArea(String text) {
        textArea.setText(text);

    }

}
