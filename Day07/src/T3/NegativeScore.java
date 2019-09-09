package T3;

public class NegativeScore extends RuntimeException {
    public NegativeScore() {
    }

    public NegativeScore(String message) {
        super(message);
    }
}
