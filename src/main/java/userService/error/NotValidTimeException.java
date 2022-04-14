package userService.error;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.http.HttpStatus;

import static org.springframework.boot.web.error.ErrorAttributeOptions.Include.MESSAGE;

public class NotValidTimeException extends AppException {
    public NotValidTimeException(String message) {
        super(HttpStatus.UNPROCESSABLE_ENTITY, message, ErrorAttributeOptions.of(MESSAGE));
    }
}