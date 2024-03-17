Why use Controller Advice?
Centralized Exception Handling: Instead of scattering exception handling logic across multiple controllers, you can consolidate it in one place.

Modularization and Reusability: By separating exception handling logic from controllers, you promote modularity and make your code more reusable.

Consistent Error Responses: You can ensure that all error responses adhere to a consistent format and structure, enhancing the API's usability.

Reduced Boilerplate Code: Controller Advice helps in reducing boilerplate code, as you can define common exception handling logic once and reuse it across multiple controllers.

Example:
Let's say you have a RESTful API for managing employees. You want to handle two types of exceptions: EmployeeNotFoundException, which occurs when an employee is not found, and generic exceptions for other unexpected errors.

java
Copy code
@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessage handleEmployeeNotFoundException(EmployeeNotFoundException ex) {
        return new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorMessage handleGenericException(Exception ex) {
        return new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR, "An unexpected error occurred");
    }
}
In this example:

@ControllerAdvice annotation marks the class as a global exception handler.
@ExceptionHandler annotations are used to define methods that handle specific types of exceptions.
@ResponseBody indicates that the return value of the methods should be serialized directly into the response body.
@ResponseStatus sets the HTTP status code for the response.
Now, whenever an EmployeeNotFoundException is thrown from any controller method, the handleEmployeeNotFoundException method will be invoked to handle it. Similarly, for any other uncaught exceptions, the handleGenericException method will be invoked.

This way, you can ensure consistent and centralized error handling across your Spring Boot application.
