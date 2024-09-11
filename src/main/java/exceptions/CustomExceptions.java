package exceptions;

/*

 */
class CustomCheckedExceptions extends Exception {
    public CustomCheckedExceptions(String message) {
        super("Found the following checked exception: " + message);
    }
}

class CustomUncheckedExceptions extends RuntimeException {
    public CustomUncheckedExceptions(String message) {
        super("Found the following unchecked exception: " + message);
    }
}

class SdaExceptions extends RuntimeException {
    public SdaExceptions(String message, Throwable cause) {
        super(("Found SdaException: " + message), cause);
    }
}

class IllegalAddressException extends IllegalArgumentException {
    public IllegalAddressException(String message) {
        super(String.format("Provided address '%s' is not valid", message));
    }
}
