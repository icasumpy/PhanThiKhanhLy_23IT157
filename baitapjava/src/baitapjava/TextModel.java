package baitapjava;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextModel {
    private List<String> lines = new ArrayList<>();

    public List<String> getLines() {
        return lines;
    }

    public void addLine(String line) {
        lines.add(line);
    }

    public void removeLine(int index) {
        lines.remove(index);
    }

    public void clear() {
        lines.clear();
    }
    
    public void saveToFile(String fileName) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            lines.forEach(writer::println);
        }
    }

    public void loadFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            lines.clear();
            reader.lines().forEach(lines::add);
        }
    }

}
