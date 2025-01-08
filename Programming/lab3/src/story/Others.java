package story;

public enum Others {
    AND("и"),
    THEN(", а затем,"),
    SO(", чтобы");

    private final String text;

    Others(String text) {
        this.text = text;
    }  //always private

    public String getOthers() {
        return text;
    }
}
