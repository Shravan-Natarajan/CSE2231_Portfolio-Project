import components.map.Map;
import components.simplewriter.SimpleWriter;

public interface Intro {

    /**
     * Handles the creation of the buttons.
     *
     * @param mapping
     *            The user provided map of name/time
     *
     * @param numOfClasses
     *            The number of intros the user requested.
     */

    void printButtons(Map<String, String> mapping, int numOfClasses);

    /**
     * Handles printing to file
     *
     * @param outputLocale
     *
     * @param mapping
     *            The user provided map of name/time
     *
     * @param numOfClasses
     *            The number of intros the user requested.
     */
    public static void printToFile(SimpleWriter outputLocale,
            Map<String, String> mapping, int numOfClasses) {

    }
}
