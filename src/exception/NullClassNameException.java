package exception;

public class NullClassNameException extends Exception{
    public NullClassNameException() {
        super("Could not get class name.");
    }
}
