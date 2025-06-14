// This file was generated by liblab | https://liblab.com/

package com.swagger.petstore.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;
import lombok.With;
import lombok.extern.jackson.Jacksonized;
import org.openapitools.jackson.nullable.JsonNullable;

@Data
@Builder
@With
@ToString
@EqualsAndHashCode
@Jacksonized
public class PostExecuteQueryInfluxQlParameters {

  @NonNull
  @JsonProperty("QueryRequestObject")
  private QueryRequestObject queryRequestObject;

  /**
   * The content type that the client can understand.
   *
   */
  @JsonProperty("Accept")
  private JsonNullable<GetExecuteQuerySqlAccept> accept;

  /**
   * The format of the data in the request body.
   *
   */
  @JsonProperty("Content-Type")
  private JsonNullable<ContentType> contentType;

  @JsonIgnore
  public GetExecuteQuerySqlAccept getAccept() {
    return accept.orElse(null);
  }

  @JsonIgnore
  public ContentType getContentType() {
    return contentType.orElse(null);
  }

  // Overwrite lombok builder methods
  public static class PostExecuteQueryInfluxQlParametersBuilder {

    private JsonNullable<GetExecuteQuerySqlAccept> accept = JsonNullable.undefined();

    @JsonProperty("Accept")
    public PostExecuteQueryInfluxQlParametersBuilder accept(GetExecuteQuerySqlAccept value) {
      if (value == null) {
        throw new IllegalStateException("accept cannot be null");
      }
      this.accept = JsonNullable.of(value);
      return this;
    }

    private JsonNullable<ContentType> contentType = JsonNullable.undefined();

    @JsonProperty("Content-Type")
    public PostExecuteQueryInfluxQlParametersBuilder contentType(ContentType value) {
      if (value == null) {
        throw new IllegalStateException("contentType cannot be null");
      }
      this.contentType = JsonNullable.of(value);
      return this;
    }
  }
}
