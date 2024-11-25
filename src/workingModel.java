import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import components.map.Map;
import components.map.Map1L;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public class workingModel {

    /*
     *
     */
    public static void copyClipboard(Map.Pair<String, String> nameAndTime) {
        String copyString = "Hi, my name is " + nameAndTime.key()
                + ", and I'm in your " + nameAndTime.value() + " class.";
        StringSelection pasteString = new StringSelection(copyString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(pasteString, null);
    }

    /*
     *
     */
    public static void getData(SimpleReader in, SimpleWriter out,
            int numOfClasses, Map<String, String> mapping) {
        for (int i = 0; i < numOfClasses; i++) {
            out.println("Provide name/nickname for class " + (i + 1) + ":");
            String key = in.nextLine();
            out.println("Provide time for class " + (i + 1) + " :");
            String value = in.nextLine();
            mapping.add(key, value);
        }
    }

    /*
     * Handles the copying and pasting implementation.
     */

    public void printButtons(Map<String, String> mapping, int numOfClasses) {
        Map<String, String> mapCopy = mapping.newInstance();
        JFrame f = new JFrame("Button Example");
        f.setLayout(new GridLayout(numOfClasses, 1));
        //Sets # of buttons equal to how many class/time pairs are provided
        for (int i = 0; i < numOfClasses; i++) {
            Map.Pair<String, String> nameAndTime = mapping.removeAny();
            JButton b = new JButton(
                    "Click to copy your " + nameAndTime.value() + " class.");
            b.setBounds(50, 100, 95, 30);
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    copyClipboard(nameAndTime);
                }
            });
            f.add(b);
        }
        f.setVisible(true);
        f.pack();
        mapping.transferFrom(mapCopy);
    }

    /*
     *
     */
    public static void printToFile(SimpleWriter outputLocale,
            Map<String, String> mapping, int numOfClasses) {
        Map<String, String> mapCopy = mapping.newInstance();
        for (int i = 0; i < numOfClasses; i++) {
            Map.Pair<String, String> nameAndTime = mapping.removeAny();
            outputLocale.println("Hi, my name is " + nameAndTime.key()
                    + ", and I'm in your " + nameAndTime.value() + "class.");
            mapCopy.add(nameAndTime.key(), nameAndTime.value());
        }
        mapping.transferFrom(mapCopy);
    }

    public static void main(String[] args) {
        SimpleWriter out = new SimpleWriter1L();
        SimpleReader in = new SimpleReader1L();

        //Add file output location here.
        out.println("Provide file locale: ");
        String outputFile = in.nextLine();
        //Initialize output to file
        SimpleWriter outputFileLocation = new SimpleWriter1L(outputFile);

        //Initializes # of loops
        out.println("How many classes will you be adding?");
        String numOfClassesString = in.nextLine();
        int numOfClassesFR = Integer.parseInt(numOfClassesString);

        //Collect data
        Map<String, String> mapping = new Map1L();
        getData(in, out, numOfClassesFR, mapping);

        //Print data to button (and just in case a file)
        printToFile(outputFileLocation, mapping, numOfClassesFR);
        TemplatePoC template = new TemplatePoC();
        template.printButtons(mapping, numOfClassesFR);
    }

}
