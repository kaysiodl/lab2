package exceptions;

public class NegativeLevelOfBoredException extends Exception {
    final protected int minLevel;

    public NegativeLevelOfBoredException(int minLevel) {
        super("Отрицательный уровень скуки");
        this.minLevel = minLevel;
    }

    @Override
    public String getMessage() {
        return "Минимальный уровень скуки - " + minLevel;
    }
}
