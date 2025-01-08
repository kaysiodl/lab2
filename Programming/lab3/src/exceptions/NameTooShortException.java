package exceptions;

public class NameTooShortException extends Exception {
    final protected int min_length;

    public NameTooShortException(int min_length) {
        super("Недопустимое количество символов в имени");
        this.min_length = min_length;
    }

    @Override
    public String getMessage() {
        return "Имя должно быть не короче " + min_length + " символов";
    }
}
