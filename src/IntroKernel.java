import components.map.Map;
import components.simplereader.SimpleReader;
import components.simplewriter.SimpleWriter;

public interface IntroKernel {

    /**
     * Allows buttons to copy to clipboard an intro statement based on map.
     *
     * @param nameAndTime
     *            The map containing data for the buttons
     *
     */
    public static void copyClipboard(Map.Pair<String, String> nameAndTime) {

    }

    /**
     * Populates a map by repeatedly asking user for data depending on desired
     * amount of intros
     *
     * @param in
     *            Allows the user provided info to be interpreted by code.
     *
     * @param out
     *            Allows code to ask user questions.
     *
     * @param numOfClasses
     *            The number of intros the user requested.
     *
     * @param mapping
     *            The map containing all the data.
     */
    public static void getData(SimpleReader in, SimpleWriter out,
            int numOfClasses, Map<String, String> mapping) {

    }
}
