// This file was generated by liblab | https://liblab.com/

package com.swagger.petstore.services;

import com.swagger.petstore.config.InfluxdbSdkConfig;
import com.swagger.petstore.exceptions.ApiError;
import com.swagger.petstore.exceptions.ErrorMessageException;
import com.swagger.petstore.http.Environment;
import com.swagger.petstore.http.HttpMethod;
import com.swagger.petstore.http.util.RequestBuilder;
import com.swagger.petstore.models.ErrorMessage;
import com.swagger.petstore.models.PostWriteLpParameters;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import lombok.NonNull;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * WriteDataService Service
 */
public class WriteDataService extends BaseService {

  public WriteDataService(@NonNull OkHttpClient httpClient, InfluxdbSdkConfig config) {
    super(httpClient, config);
  }

  /**
   * Write line protocol
   *
   * @param requestParameters {@link PostWriteLpParameters} Request Parameters Object
   * @return response of {@code void}
   */
  public void postWriteLp(@NonNull PostWriteLpParameters requestParameters) throws ApiError {
    this.addErrorMapping(401, ErrorMessage.class, ErrorMessageException.class);
    Request request = this.buildPostWriteLpRequest(requestParameters);
    this.execute(request);
  }

  /**
   * Write line protocol
   *
   * @param requestParameters {@link PostWriteLpParameters} Request Parameters Object
   * @return response of {@code CompletableFuture<Void>}
   */
  public CompletableFuture<Void> postWriteLpAsync(@NonNull PostWriteLpParameters requestParameters) throws ApiError {
    this.addErrorMapping(401, ErrorMessage.class, ErrorMessageException.class);
    Request request = this.buildPostWriteLpRequest(requestParameters);
    return this.executeAsync(request).thenApplyAsync(response -> null);
  }

  private Request buildPostWriteLpRequest(@NonNull PostWriteLpParameters requestParameters) {
    RequestBuilder builder = new RequestBuilder(
      HttpMethod.POST,
      Optional.ofNullable(this.config.getBaseUrl()).orElse(Environment.DEFAULT.getUrl()),
      "api/v3/write_lp"
    )
      .setAccessTokenAuth(this.config.getAccessToken(), "Bearer")
      .setQueryParameter("db", requestParameters.getDb())
      .setQueryParameter("precision", requestParameters.getPrecision().getValue())
      .setOptionalQueryParameter("accept_partial", requestParameters.getAcceptPartial())
      .setOptionalQueryParameter("no_sync", requestParameters.getNoSync())
      .setOptionalHeader("Content-Length", requestParameters.getContentLength())
      .setBody(RequestBody.create(requestParameters.getRequestBody(), MediaType.parse("text/plain")));
    if (requestParameters.getContentType() != null) {
      builder.setOptionalHeader("Content-Type", requestParameters.getContentType().getValue());
    }
    if (requestParameters.getAccept() != null) {
      builder.setOptionalHeader("Accept", requestParameters.getAccept().getValue());
    }
    if (requestParameters.getContentEncoding() != null) {
      builder.setOptionalHeader("Content-Encoding", requestParameters.getContentEncoding().getValue());
    }
    return builder.build();
  }
}
