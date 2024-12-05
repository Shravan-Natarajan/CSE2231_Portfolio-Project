import components.map.Map;
import components.map.Map1L;

public abstract class IntroKernelImplementation implements IntroKernel {
    //I changed some of this because everything decided to implode
    static Map<Key, String> lebonbon = new Map1L();

    @Override
    public void setData(Key key, String value) {
        lebonbon.add(key, value);
    }

    @Override
    public String getData(Key key) {
        return lebonbon.value(key);
    }

    @Override
    public boolean hasData(Key key) {
        return lebonbon.hasKey(key);
    }
}