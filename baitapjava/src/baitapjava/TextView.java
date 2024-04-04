package baitapjava;

import java.util.List;

public class TextView {
    public void displayText(List<String> lines) {
        lines.forEach(System.out::println);
    }
}
