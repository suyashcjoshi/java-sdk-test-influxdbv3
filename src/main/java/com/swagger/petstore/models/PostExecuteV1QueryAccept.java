// This file was generated by liblab | https://liblab.com/

package com.swagger.petstore.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PostExecuteV1QueryAccept {
  APPLICATION_JSON("application/json"),
  APPLICATION_CSV("application/csv"),
  TEXT_CSV("text/csv");

  @JsonValue
  private final String value;

  @JsonCreator
  public static PostExecuteV1QueryAccept fromValue(String value) {
    return Arrays.stream(PostExecuteV1QueryAccept.values())
      .filter(item -> item.value.equals(value))
      .findFirst()
      .orElse(null);
  }
}
