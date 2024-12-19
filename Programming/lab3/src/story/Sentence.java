package story;

public record Sentence(String content) {

    public Sentence add(String text) {
        return new Sentence(this.content + " " + text);
    }

    public Sentence add(String text, Others others) {
        return new Sentence(this.content + " " + others.getOthers() + " " + text);
    }

    public Sentence add(Others others, String text) {
        return new Sentence(this.content  + " " + text + " " + others.getOthers());
    }

    @Override
    public String toString() {
        return this.content + ".";
    }
}