package by.tamkovich.cube.exception;

public class WrongFilePathException extends RuntimeException {
    private String message;

    public WrongFilePathException() {
        message = "Exception occurred while parsing path";
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
            return "Exception occurred while parsing path";
        } else {
            return "Exception occurred while parsing path, with message: " + message;
        }
    }

}