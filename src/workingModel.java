
//The import is wrong, checkstyle won't let me do otherwise though.
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public class workingModel {
    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();
        //User generated input
        out.println("What you like the first half to be?");
        String fhalf = in.nextLine();
        out.println("What you like the second half to be?");
        String shalf = in.nextLine();
        //Copies the info to clipboard for a custom intro use case.
        copyClipboardCustom(fhalf, shalf);
    }

}
