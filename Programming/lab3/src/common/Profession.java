package common;

public enum Profession {
    SOLDIER("Солдаты -"),
    SENIOR("синьора");

    private String text;

    Profession(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
