// This file was generated by liblab | https://liblab.com/

package com.swagger.petstore.exceptions;

import com.swagger.petstore.models.ErrorMessage;
import lombok.Getter;
import okhttp3.Response;

/**
 * Exception class for ErrorMessage errors.
 */
@Getter
public class ErrorMessageException extends ApiError {

  private final ErrorMessage error;

  public ErrorMessageException(ErrorMessage error, String message, int code, Response response) {
    super(message, code, response);
    this.error = error;
  }
}
