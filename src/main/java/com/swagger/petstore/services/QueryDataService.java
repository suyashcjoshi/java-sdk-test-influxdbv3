// This file was generated by liblab | https://liblab.com/

package com.swagger.petstore.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.swagger.petstore.config.InfluxdbSdkConfig;
import com.swagger.petstore.exceptions.ApiError;
import com.swagger.petstore.exceptions.ErrorMessageException;
import com.swagger.petstore.http.Environment;
import com.swagger.petstore.http.HttpMethod;
import com.swagger.petstore.http.ModelConverter;
import com.swagger.petstore.http.util.RequestBuilder;
import com.swagger.petstore.models.ErrorMessage;
import com.swagger.petstore.models.GetExecuteInfluxQlQueryParameters;
import com.swagger.petstore.models.GetExecuteQuerySqlParameters;
import com.swagger.petstore.models.GetV1ExecuteQueryParameters;
import com.swagger.petstore.models.PostExecuteQueryInfluxQlParameters;
import com.swagger.petstore.models.PostExecuteQuerySqlParameters;
import com.swagger.petstore.models.PostExecuteV1QueryParameters;
import com.swagger.petstore.models.QueryResponse;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import lombok.NonNull;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * QueryDataService Service
 */
public class QueryDataService extends BaseService {

  public QueryDataService(@NonNull OkHttpClient httpClient, InfluxdbSdkConfig config) {
    super(httpClient, config);
  }

  /**
   * Execute SQL query
   *
   * @param requestParameters {@link GetExecuteQuerySqlParameters} Request Parameters Object
   * @return response of {@code QueryResponse}
   */
  public QueryResponse getExecuteQuerySql(@NonNull GetExecuteQuerySqlParameters requestParameters) throws ApiError {
    this.addErrorMapping(401, ErrorMessage.class, ErrorMessageException.class);
    Request request = this.buildGetExecuteQuerySqlRequest(requestParameters);
    Response response = this.execute(request);
    return ModelConverter.convert(response, new TypeReference<QueryResponse>() {});
  }

  /**
   * Execute SQL query
   *
   * @param requestParameters {@link GetExecuteQuerySqlParameters} Request Parameters Object
   * @return response of {@code CompletableFuture<QueryResponse>}
   */
  public CompletableFuture<QueryResponse> getExecuteQuerySqlAsync(
    @NonNull GetExecuteQuerySqlParameters requestParameters
  ) throws ApiError {
    this.addErrorMapping(401, ErrorMessage.class, ErrorMessageException.class);
    Request request = this.buildGetExecuteQuerySqlRequest(requestParameters);
    CompletableFuture<Response> futureResponse = this.executeAsync(request);
    return futureResponse.thenApplyAsync(response ->
      ModelConverter.convert(response, new TypeReference<QueryResponse>() {})
    );
  }

  private Request buildGetExecuteQuerySqlRequest(@NonNull GetExecuteQuerySqlParameters requestParameters) {
    RequestBuilder builder = new RequestBuilder(
      HttpMethod.GET,
      Optional.ofNullable(this.config.getBaseUrl()).orElse(Environment.DEFAULT.getUrl()),
      "api/v3/query_sql"
    )
      .setAccessTokenAuth(this.config.getAccessToken(), "Bearer")
      .setQueryParameter("db", requestParameters.getDb())
      .setQueryParameter("q", requestParameters.getQ());
    if (requestParameters.getFormat() != null) {
      builder.setOptionalQueryParameter("format", requestParameters.getFormat().getValue());
    }
    if (requestParameters.getAccept() != null) {
      builder.setOptionalHeader("Accept", requestParameters.getAccept().getValue());
    }
    if (requestParameters.getContentType() != null) {
      builder.setOptionalHeader("Content-Type", requestParameters.getContentType().getValue());
    }
    return builder.build();
  }

  /**
   * Execute SQL query
   *
   * @param requestParameters {@link PostExecuteQuerySqlParameters} Request Parameters Object
   * @return response of {@code QueryResponse}
   */
  public QueryResponse postExecuteQuerySql(@NonNull PostExecuteQuerySqlParameters requestParameters) throws ApiError {
    this.addErrorMapping(401, ErrorMessage.class, ErrorMessageException.class);
    Request request = this.buildPostExecuteQuerySqlRequest(requestParameters);
    Response response = this.execute(request);
    return ModelConverter.convert(response, new TypeReference<QueryResponse>() {});
  }

  /**
   * Execute SQL query
   *
   * @param requestParameters {@link PostExecuteQuerySqlParameters} Request Parameters Object
   * @return response of {@code CompletableFuture<QueryResponse>}
   */
  public CompletableFuture<QueryResponse> postExecuteQuerySqlAsync(
    @NonNull PostExecuteQuerySqlParameters requestParameters
  ) throws ApiError {
    this.addErrorMapping(401, ErrorMessage.class, ErrorMessageException.class);
    Request request = this.buildPostExecuteQuerySqlRequest(requestParameters);
    CompletableFuture<Response> futureResponse = this.executeAsync(request);
    return futureResponse.thenApplyAsync(response ->
      ModelConverter.convert(response, new TypeReference<QueryResponse>() {})
    );
  }

  private Request buildPostExecuteQuerySqlRequest(@NonNull PostExecuteQuerySqlParameters requestParameters) {
    RequestBuilder builder = new RequestBuilder(
      HttpMethod.POST,
      Optional.ofNullable(this.config.getBaseUrl()).orElse(Environment.DEFAULT.getUrl()),
      "api/v3/query_sql"
    )
      .setAccessTokenAuth(this.config.getAccessToken(), "Bearer")
      .setJsonContent(requestParameters.getQueryRequestObject());
    if (requestParameters.getAccept() != null) {
      builder.setOptionalHeader("Accept", requestParameters.getAccept().getValue());
    }
    if (requestParameters.getContentType() != null) {
      builder.setOptionalHeader("Content-Type", requestParameters.getContentType().getValue());
    }
    return builder.build();
  }

  /**
   * Execute InfluxQL query
   *
   * @param requestParameters {@link GetExecuteInfluxQlQueryParameters} Request Parameters Object
   * @return response of {@code QueryResponse}
   */
  public QueryResponse getExecuteInfluxQlQuery(@NonNull GetExecuteInfluxQlQueryParameters requestParameters)
    throws ApiError {
    this.addErrorMapping(401, ErrorMessage.class, ErrorMessageException.class);
    Request request = this.buildGetExecuteInfluxQlQueryRequest(requestParameters);
    Response response = this.execute(request);
    return ModelConverter.convert(response, new TypeReference<QueryResponse>() {});
  }

  /**
   * Execute InfluxQL query
   *
   * @param requestParameters {@link GetExecuteInfluxQlQueryParameters} Request Parameters Object
   * @return response of {@code CompletableFuture<QueryResponse>}
   */
  public CompletableFuture<QueryResponse> getExecuteInfluxQlQueryAsync(
    @NonNull GetExecuteInfluxQlQueryParameters requestParameters
  ) throws ApiError {
    this.addErrorMapping(401, ErrorMessage.class, ErrorMessageException.class);
    Request request = this.buildGetExecuteInfluxQlQueryRequest(requestParameters);
    CompletableFuture<Response> futureResponse = this.executeAsync(request);
    return futureResponse.thenApplyAsync(response ->
      ModelConverter.convert(response, new TypeReference<QueryResponse>() {})
    );
  }

  private Request buildGetExecuteInfluxQlQueryRequest(@NonNull GetExecuteInfluxQlQueryParameters requestParameters) {
    RequestBuilder builder = new RequestBuilder(
      HttpMethod.GET,
      Optional.ofNullable(this.config.getBaseUrl()).orElse(Environment.DEFAULT.getUrl()),
      "api/v3/query_influxql"
    )
      .setAccessTokenAuth(this.config.getAccessToken(), "Bearer")
      .setQueryParameter("q", requestParameters.getQ())
      .setOptionalQueryParameter("db", requestParameters.getDb())
      .setOptionalQueryParameter("format", requestParameters.getFormat());
    if (requestParameters.getAccept() != null) {
      builder.setOptionalHeader("Accept", requestParameters.getAccept().getValue());
    }
    return builder.build();
  }

  /**
   * Execute InfluxQL query
   *
   * @param requestParameters {@link PostExecuteQueryInfluxQlParameters} Request Parameters Object
   * @return response of {@code QueryResponse}
   */
  public QueryResponse postExecuteQueryInfluxQl(@NonNull PostExecuteQueryInfluxQlParameters requestParameters)
    throws ApiError {
    this.addErrorMapping(401, ErrorMessage.class, ErrorMessageException.class);
    Request request = this.buildPostExecuteQueryInfluxQlRequest(requestParameters);
    Response response = this.execute(request);
    return ModelConverter.convert(response, new TypeReference<QueryResponse>() {});
  }

  /**
   * Execute InfluxQL query
   *
   * @param requestParameters {@link PostExecuteQueryInfluxQlParameters} Request Parameters Object
   * @return response of {@code CompletableFuture<QueryResponse>}
   */
  public CompletableFuture<QueryResponse> postExecuteQueryInfluxQlAsync(
    @NonNull PostExecuteQueryInfluxQlParameters requestParameters
  ) throws ApiError {
    this.addErrorMapping(401, ErrorMessage.class, ErrorMessageException.class);
    Request request = this.buildPostExecuteQueryInfluxQlRequest(requestParameters);
    CompletableFuture<Response> futureResponse = this.executeAsync(request);
    return futureResponse.thenApplyAsync(response ->
      ModelConverter.convert(response, new TypeReference<QueryResponse>() {})
    );
  }

  private Request buildPostExecuteQueryInfluxQlRequest(@NonNull PostExecuteQueryInfluxQlParameters requestParameters) {
    RequestBuilder builder = new RequestBuilder(
      HttpMethod.POST,
      Optional.ofNullable(this.config.getBaseUrl()).orElse(Environment.DEFAULT.getUrl()),
      "api/v3/query_influxql"
    )
      .setAccessTokenAuth(this.config.getAccessToken(), "Bearer")
      .setJsonContent(requestParameters.getQueryRequestObject());
    if (requestParameters.getAccept() != null) {
      builder.setOptionalHeader("Accept", requestParameters.getAccept().getValue());
    }
    if (requestParameters.getContentType() != null) {
      builder.setOptionalHeader("Content-Type", requestParameters.getContentType().getValue());
    }
    return builder.build();
  }

  /**
   * Execute InfluxQL query (v1-compatible)
   *
   * @param requestParameters {@link GetV1ExecuteQueryParameters} Request Parameters Object
   * @return response of {@code QueryResponse}
   */
  public QueryResponse getV1ExecuteQuery(@NonNull GetV1ExecuteQueryParameters requestParameters) throws ApiError {
    this.addErrorMapping(401, ErrorMessage.class, ErrorMessageException.class);
    Request request = this.buildGetV1ExecuteQueryRequest(requestParameters);
    Response response = this.execute(request);
    return ModelConverter.convert(response, new TypeReference<QueryResponse>() {});
  }

  /**
   * Execute InfluxQL query (v1-compatible)
   *
   * @param requestParameters {@link GetV1ExecuteQueryParameters} Request Parameters Object
   * @return response of {@code CompletableFuture<QueryResponse>}
   */
  public CompletableFuture<QueryResponse> getV1ExecuteQueryAsync(
    @NonNull GetV1ExecuteQueryParameters requestParameters
  ) throws ApiError {
    this.addErrorMapping(401, ErrorMessage.class, ErrorMessageException.class);
    Request request = this.buildGetV1ExecuteQueryRequest(requestParameters);
    CompletableFuture<Response> futureResponse = this.executeAsync(request);
    return futureResponse.thenApplyAsync(response ->
      ModelConverter.convert(response, new TypeReference<QueryResponse>() {})
    );
  }

  private Request buildGetV1ExecuteQueryRequest(@NonNull GetV1ExecuteQueryParameters requestParameters) {
    RequestBuilder builder = new RequestBuilder(
      HttpMethod.GET,
      Optional.ofNullable(this.config.getBaseUrl()).orElse(Environment.DEFAULT.getUrl()),
      "query"
    )
      .setAccessTokenAuth(this.config.getAccessToken(), "Bearer")
      .setQueryParameter("q", requestParameters.getQ())
      .setOptionalQueryParameter("chunked", requestParameters.getChunked())
      .setOptionalQueryParameter("chunk_size", requestParameters.getChunkSize())
      .setOptionalQueryParameter("db", requestParameters.getDb())
      .setOptionalQueryParameter("pretty", requestParameters.getPretty());
    if (requestParameters.getEpoch() != null) {
      builder.setOptionalQueryParameter("epoch", requestParameters.getEpoch().getValue());
    }
    if (requestParameters.getAccept() != null) {
      builder.setOptionalHeader("Accept", requestParameters.getAccept().getValue());
    }
    return builder.build();
  }

  /**
   * Execute InfluxQL query (v1-compatible)
   *
   * @return response of {@code QueryResponse}
   */
  public QueryResponse postExecuteV1Query() throws ApiError {
    return this.postExecuteV1Query(PostExecuteV1QueryParameters.builder().build());
  }

  /**
   * Execute InfluxQL query (v1-compatible)
   *
   * @param requestParameters {@link PostExecuteV1QueryParameters} Request Parameters Object
   * @return response of {@code QueryResponse}
   */
  public QueryResponse postExecuteV1Query(@NonNull PostExecuteV1QueryParameters requestParameters) throws ApiError {
    this.addErrorMapping(401, ErrorMessage.class, ErrorMessageException.class);
    Request request = this.buildPostExecuteV1QueryRequest(requestParameters);
    Response response = this.execute(request);
    return ModelConverter.convert(response, new TypeReference<QueryResponse>() {});
  }

  /**
   * Execute InfluxQL query (v1-compatible)
   *
   * @return response of {@code CompletableFuture<QueryResponse>}
   */
  public CompletableFuture<QueryResponse> postExecuteV1QueryAsync() throws ApiError {
    return this.postExecuteV1QueryAsync(PostExecuteV1QueryParameters.builder().build());
  }

  /**
   * Execute InfluxQL query (v1-compatible)
   *
   * @param requestParameters {@link PostExecuteV1QueryParameters} Request Parameters Object
   * @return response of {@code CompletableFuture<QueryResponse>}
   */
  public CompletableFuture<QueryResponse> postExecuteV1QueryAsync(
    @NonNull PostExecuteV1QueryParameters requestParameters
  ) throws ApiError {
    this.addErrorMapping(401, ErrorMessage.class, ErrorMessageException.class);
    Request request = this.buildPostExecuteV1QueryRequest(requestParameters);
    CompletableFuture<Response> futureResponse = this.executeAsync(request);
    return futureResponse.thenApplyAsync(response ->
      ModelConverter.convert(response, new TypeReference<QueryResponse>() {})
    );
  }

  private Request buildPostExecuteV1QueryRequest(@NonNull PostExecuteV1QueryParameters requestParameters) {
    RequestBuilder builder = new RequestBuilder(
      HttpMethod.POST,
      Optional.ofNullable(this.config.getBaseUrl()).orElse(Environment.DEFAULT.getUrl()),
      "query"
    )
      .setAccessTokenAuth(this.config.getAccessToken(), "Bearer")
      .setJsonContent(requestParameters.getRequestBody());
    if (requestParameters.getAccept() != null) {
      builder.setOptionalHeader("Accept", requestParameters.getAccept().getValue());
    }
    return builder.build();
  }
}
