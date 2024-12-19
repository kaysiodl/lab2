package story;

public enum Others {
    AND(" и "),
    THEN(", а затем,"),
    SO(", чтобы"),
    COMMA(",");

    private String text;

    private Others(String text){
        this.text = text;
    }

    public String getOthers() {
        return text;
    }
}
