package exceptions;

public class CustomExceptionMain {
    public static void main(String[] args) {
        try {
            throw new SdaExceptions("big problem", new Throwable());
        } catch (SdaExceptions exceptions) {
            exceptions.printStackTrace();
        }
    }
}
