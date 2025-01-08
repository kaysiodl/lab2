package common;

public enum Profession {
    SOLDIER("Солдаты -"),
    SENIOR("синьора");

    private final String text;

    Profession(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
