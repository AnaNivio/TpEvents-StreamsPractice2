package exceptions;

public class EventNotFoundException extends Exception{
    private String description;

    public EventNotFoundException(String message) {
        super(message);
    }
}
