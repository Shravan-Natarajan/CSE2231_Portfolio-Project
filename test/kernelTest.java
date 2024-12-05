
public class kernelTest {

    /**
     * Base test of setData
     */

    @Test
    public final void setData1(Key key, String value) {
        Map.Pair<String, String> mapTest = new Map1L();
        mapTest.add(key, "tired");
        assertEquals(mapTest, setData(key, "tired"));
    }

    /**
     * Base test of getData, testing that it
     */
    @Test
    public final void getData1(Key key) {
        Map.Pair<String, String> mapTest = new Map1L();
        mapTest.add(key, "tired");
        setData(key, "tired");
        assertEquals(mapTest.value(), getData(key));
    }

    /**
     * True test of hasData
     */
    @Test
    public final void hasData1(Key key) {
        Map<key, String> mapTest = new Map1L();
        mapTest.add(key, "tired");
        setData(key, "tired");
        assertEquals(hasData(key), mapTest.hasKey(key));
    }

    /**
     * False test of hasData
     */
    @Test
    public final void hasData1(Key key) {
        Map<key, String> mapTest = new Map1L();
        mapTest.add(new key(), "tired");
        setData(key, "tired");
        assertEquals(hasData(key), mapTest.hasKey(key));
    }
}
