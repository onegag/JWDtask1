package by.tamkovich.cube.exception;

public class WrongFilePathException extends RuntimeException {
    private String message;

    public WrongFilePathException() {
        message = "Exception occurred while reading path";
    }

    public WrongFilePathException(String message) {
        this.message = message;
    }

    public WrongFilePathException(String message, Throwable cause, String message1) {
        super(message, cause);
        this.message = message1;
    }

    public WrongFilePathException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }
    @Override
    public String toString() {
        if (message == null) {
            return "Exception occurred while reading path";
        } else {
            return "Exception occurred while reading path, with message: " + message;
        }
    }

}