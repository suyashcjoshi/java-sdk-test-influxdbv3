// This file was generated by liblab | https://liblab.com/

package com.swagger.petstore.validation.validators;

import com.swagger.petstore.validation.Violation;

public interface Validator<T> {
  Violation[] validate(T value);
}
