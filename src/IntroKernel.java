import components.standard.Standard;

public interface IntroKernel extends Standard<Intro> {

    enum Key {
        NAME("Hi, my name is "), TIME("I am in your class at ");

        String prompt;

        public String getPrompt() {
            return this.prompt;
        }

        private Key(String prompt) {
            this.prompt = prompt;
        }
    }

    /**
     * Sets some data.
     *
     * @param key
     *            the key you want to set
     * @param value
     *            the corresponding value of that key
     * @ensures key is set to some value
     */
    void setData(Key key, String value);

    /**
     * Gets some data.
     *
     * @param key
     *            the key we want to look up
     * @return a string corresponding to the input key
     * @requires [key exists]
     * @ensures returns the corresponding value
     */
    String getData(Key key);

    /**
     * Checks if some data exists.
     *
     * @param key
     *            a key to look up
     * @return true if key exists, false otherwise
     * @ensures boolean if key exists
     */
    boolean hasData(Key key);
}
