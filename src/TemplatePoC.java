import java.util.Map;

import components.map.Map1L;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public class TemplatePoC {

    //private String templateString;

    //public TemplatePoC(String templateString) {
    //this.templateString = templateString;
    // Hi $name, welcome to $site
    //}

    //public String substitute(Map<String, String> mapping) {
    // {("name": "Joe"), ("site", "google.com")}
    //this.templateString.split(this.templateString);
    //}

    //public Map<String, String> substitute(String key, String value) {
    //Map<String, String> mapping = new Map1L<>();
    //mapping.add(key, value);
    //return mapping;

    //}

    /*
     *
     */
    public static void printToFile(SimpleWriter outputLocale,
            Map<String, String> mapping, int numOfClasses) {
        Map<String, String> mapCopy = mapping.newInstance();
        for (int i = 0; i < numOfClasses; i++) {
            Map.Pair<String, String> nameAndTime = mapping.removeAny();
            outputLocale.println("Hi, my name is " + nameAndTime.key()
                    + "Im in your " + nameAndTime.value() + "class.");
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
        for (int i = 0; i < numOfClassesFR; i++) {
            out.println("Provide name/nickname for class " + i + ":");
            String key = in.nextLine();
            out.println("Provide time for class " + i + " :");
            String value = in.nextLine();
            mapping.add(key, value);
        }
        //Print data
        printToFile(outputFileLocation, mapping, numOfClassesFR);
    }

}
