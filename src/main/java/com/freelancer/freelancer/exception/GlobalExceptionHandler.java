import com.freelancer.freelancer.exception.ResourceNotFoundExecption;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler{
//    @ExceptionHandler(ResourceNotFoundExecption.class)
//    public ResponseEntity<Object> handleResourceNotFound(ResourceNotFoundExecption ex, WebRequest request){
//        return buildResponse(HttpStatus.NOT_FOUND, ex.getMessage(), request.getDescription(false));
//    }
//
//    private ResponseEntity<Object> buildResponse(HttpStatus status, String message, String path){
//        Map<String, Object> body = new LinkedHashMap<>();
//        body.put("timestamp", LocalDateTime.now());
//        body.put("status", status.value());
//        body.put("error", status.getReasonPhrase());
//        body.put("message", message);
//        body.put("path", path.replace("uri=", ""));
//        return new ResponseEntity<>(body, status);
//    }

}