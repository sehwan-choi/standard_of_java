package exception;

import java.sql.SQLException;
import java.util.NoSuchElementException;

public class ExceptionTrace {

    public static void main(String[] args) {

        try {
            try {
                throw new IllegalStateException("AAA");
            } catch (IllegalStateException e) {
                throw new SQLException("BBB", e);
            }
        } catch (SQLException e) {
            throw new CException("CCC", e);
        }
    }

    public static class AException extends RuntimeException {

        public AException(String message) {
            super(message);
        }

        public AException(String message, Throwable cause) {
            super(message, cause);
        }
    }


    public static class BException extends RuntimeException {
        public BException(String message, Throwable cause) {
            super(message, cause);
        }
    }


    public static class CException extends RuntimeException {
        public CException(String message, Throwable cause) {
            super(message, cause);
        }
    }

}
