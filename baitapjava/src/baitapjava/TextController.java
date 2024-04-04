package baitapjava;

import java.io.IOException;
import javax.swing.JButton;

public class TextController {
    private TextModel model;
    private TextView view;
    private JButton button;

    public TextController(TextModel model, TextView view, JButton button) {
        this.model = model;
        this.view = view;
        this.button = button;

        button.addActionListener(e -> {
            displayText();
        });
    }

    public void addLine(String line) {
        model.addLine(line);
    }

    public void removeLine(int index) {
        model.removeLine(index);
    }

    public void clearText() {
        model.clear();
    }

    public void displayText() {
        view.displayText(model.getLines());
    }

    public void saveToFile(String fileName) throws IOException {
        model.saveToFile(fileName);
    }

    public void loadFromFile(String fileName) throws IOException {
        model.loadFromFile(fileName);
    }

    public static void main(String[] args) {
        TextModel model = new TextModel();
        TextView view = new TextView();
        JButton button = new JButton(); 

        TextController controller = new TextController(model, view, button); 
    }
}
