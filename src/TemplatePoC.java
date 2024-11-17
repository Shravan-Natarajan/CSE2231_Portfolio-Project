import java.util.Map;

import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public class TemplatePoC {

    private String templateString;

    public TemplatePoC(String templateString) {
        this.templateString = templateString;
        // Hi $name, welcome to $site
    }

    //public String substitute(Map<String, String> mapping) {
    // {("name": "Joe"), ("site", "google.com")}
    //this.templateString.split(this.templateString);
    //}

    public Map<String, String> substitute(String key, String value) {
        Map<String, String> mapping = new Map1L<>();
        Map.add(key, value);
        return mapping;

    }

    public void printToFile(SimpleWriter outputLocale,
            Map<String, String> mapping) {
        outputLocale.println("Hi, my name is " + map.key() + "Im in your "
                + map.value() + "class.");
    }

    public static void main(String[] args) {
        SimpleWriter out = new SimpleWriter1L();
        SimpleReader in = new SimpleReader1L();
        System.out.print("Provide file: ");
        String outputFile = out.println();
        SimpleWriter outputFileLocation = new SimpleWriter1L(outputFile); //Add file output here.
        System.out.print("Provide name: ");
        String key = in.println();
        System.out.print("Provide time: ");
        String value = in.println();
        // get data
        Map<String, String> mapping = this.substitute(key, value);
        this.printToFile(outputFileLocation, mapping);
    }

}
