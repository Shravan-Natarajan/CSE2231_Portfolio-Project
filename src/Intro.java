import components.map.Map;
import components.simplewriter.SimpleWriter;

public interface Intro extends IntroKernel {

    /**
     * Handles the creation of the buttons.
     *
     */

    void printButtons();

    /**
     * Handles printing to file
     *
     * @param outputLocale
     */
    void printToFile(SimpleWriter outputLocale);

    /**
     * Allows buttons to copy to clipboard an intro statement based on map.
     *
     *
     */
    void copyClipboard();

}
