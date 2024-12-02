public abstract class IntroSecondary implements Intro {

    @Override
    public void printButtons() {
        JFrame f = new JFrame("Button Example");
        f.setLayout(new GridLayout(numOfClasses, 1));

        JButton b = new JButton(this.getData(Key.NAME) + ", Click to copy your "
                + this.getData(Key.TIME) + " class.");
        b.setBounds(50, 100, 95, 30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                copyClipboard();
            }
        });
        f.add(b);
        f.setVisible(true);
        f.pack();
    }

    @Override
    public void printToFile(SimpleWriter outputLocale) {
        outputLocale.println(Key.NAME.getPrompt() + this.getData(Key.NAME)
                + " and " + Key.TIME.getPrompt() + this.getData(Key.TIME));
    }

    public copyClipboard(){
        String copyString = Key.NAME.getPrompt() + this.getData(Key.NAME)
        + " and " + Key.TIME.getPrompt() + this.getData(Key.TIME);
        StringSelection pasteString = new StringSelection(copyString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(pasteString, null);
    }

    @Override
    public boolean equals(Object o) {
        for (Key key : Key.values()) {
            if (!this.getData(key).equals(o.getData(key))) {
                return false;
            }
        }
        return true;
    }

}
