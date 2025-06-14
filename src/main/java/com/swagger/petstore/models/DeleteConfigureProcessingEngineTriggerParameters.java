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
public class DeleteConfigureProcessingEngineTriggerParameters {

  /**
   * The name of the database.
   *
   */
  @NonNull
  private String db;

  @NonNull
  @JsonProperty("trigger_name")
  private String triggerName;

  @JsonProperty("force")
  private JsonNullable<Boolean> force;

  @JsonIgnore
  public Boolean getForce() {
    return force.orElse(null);
  }

  // Overwrite lombok builder methods
  public static class DeleteConfigureProcessingEngineTriggerParametersBuilder {

    private JsonNullable<Boolean> force = JsonNullable.undefined();

    @JsonProperty("force")
    public DeleteConfigureProcessingEngineTriggerParametersBuilder force(Boolean value) {
      if (value == null) {
        throw new IllegalStateException("force cannot be null");
      }
      this.force = JsonNullable.of(value);
      return this;
    }
  }
}
