// This file was generated by liblab | https://liblab.com/

package com.swagger.petstore.models;

import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;
import lombok.With;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@With
@ToString
@EqualsAndHashCode
@Jacksonized
public class PostInstallPluginPackagesRequest {

  /**
   * A list of Python package names to install.
   * Can include version specifiers (e.g., "scipy==1.9.0").
   *
   */
  @NonNull
  private List<String> packages;
}
