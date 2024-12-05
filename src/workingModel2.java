import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public class workingModel2 {
    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();
        out.println("File path?");
        SimpleWriter toFile = new SimpleWriter1L(in.nextLine());
        setData(Key key, "jungry");
        //The standard use case of button creation for an intro copy+paste.
        printButtons();
        printToFile(toFile);

    }
}
