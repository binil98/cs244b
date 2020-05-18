package FileViewing;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class FileViewer {
    private static final String fileName = "D:\\Nikhil\\IntellijProjects\\GameAIs\\src\\FileViewing\\File.txt";
    private JTextArea ta;
    private JFrame frame;

    public static void main(String[] args) {
        FileViewer fv = new FileViewer(900, 900);

        while (true) {
            fv.check();

            try {
                Thread.sleep(1000);
            } catch (Exception ignored) {}
        }
    }

    public void check() {
        Scanner fio = null;
        try {
            fio = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        StringBuilder text = new StringBuilder();
        assert fio != null;
        while (fio.hasNext()) {
            text.append(fio.nextLine()).append("\n");
        }

        System.out.println(text.toString() + " l;khdsf;l");
        ta.setText(text.toString());

        frame.repaint();
    }

    public FileViewer(int width, int height) {
        frame = new JFrame("Viewing File");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(width, height));
        frame.setResizable(true);
        ta = new JTextArea();
        ta.setLineWrap(true);
        ta.setFont(new Font("Arial", Font.PLAIN, 30));
        JScrollPane scrollPane = new JScrollPane(ta);
        frame.add(scrollPane);
        frame.pack();
        frame.setVisible(true);

    }
}
