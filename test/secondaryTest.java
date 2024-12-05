public class secondaryTest {
    //Look I don't even know where to begin with testing this using JUnit to be honest.
    /**
     * Base test of printButtons
     */
    @Test
    public final void printButtons1() {

    }

    /**
     * Base test of printToFile (This is literally all that could happen)
     */
    @Test
    public final void printToFile1() {
        SimpleWriter out = new SimpleWriter1L(
                "C:\\Users\\shrav\\CSE2231_Portfolio-Project\\lib\\testfile.txt");
        SimpleReader in = new SimpleReader1L(
                "C:\\Users\\shrav\\CSE2231_Portfolio-Project\\lib\\testfile.txt");
        setData("Shravan", "4:10");
        printToFile(out);
        assertEquals("Hi, my name is Shravan and I am in your class at 4:10",
                in.nextLine());
    }

    //Look I don't even know where to begin with testing this using JUnit to be honest.
    /**
     * Base test of printToFile
     */

    @Test
    public final void copyClipboard1() {

    }

    /**
     * True test case of equals
     */

    @Test
    public final void equals1() {
        assertEquals(setData("im", "tired").equals(setData("im", "tired")),
                true);
    }

    /**
     * False test case of equals
     */
    @Test
    public final void equals2() {
        assertEquals(setData("im", "tired").equals(setData("im NOT", "tired")),
                false);
    }
}
