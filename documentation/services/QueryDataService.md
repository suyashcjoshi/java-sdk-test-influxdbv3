# QueryDataService

A list of all methods in the `QueryDataService` service. Click on the method name to view detailed information about that method.

| Methods                                               | Description                                                                                                                                                                                                                                                |
| :---------------------------------------------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [getExecuteQuerySql](#getexecutequerysql)             | Executes an SQL query to retrieve data from the specified database.                                                                                                                                                                                        |
| [postExecuteQuerySql](#postexecutequerysql)           | Executes an SQL query to retrieve data from the specified database.                                                                                                                                                                                        |
| [getExecuteInfluxQlQuery](#getexecuteinfluxqlquery)   | Executes an InfluxQL query to retrieve data from the specified database.                                                                                                                                                                                   |
| [postExecuteQueryInfluxQl](#postexecutequeryinfluxql) | Executes an InfluxQL query to retrieve data from the specified database.                                                                                                                                                                                   |
| [getV1ExecuteQuery](#getv1executequery)               | Executes an InfluxQL query to retrieve data from the specified database. This endpoint is compatible with InfluxDB 1.x client libraries and third-party integrations such as Grafana. Use query parameters to specify the database and the InfluxQL query. |
| [postExecuteV1Query](#postexecutev1query)             | Executes an InfluxQL query to retrieve data from the specified database.                                                                                                                                                                                   |

## getExecuteQuerySql

Executes an SQL query to retrieve data from the specified database.

- HTTP Method: `GET`
- Endpoint: `/api/v3/query_sql`

**Parameters**

| Name              | Type                                                                      | Required | Description               |
| :---------------- | :------------------------------------------------------------------------ | :------- | :------------------------ |
| requestParameters | [GetExecuteQuerySqlParameters](../models/GetExecuteQuerySqlParameters.md) | ✅       | Request Parameters Object |

**Return Type**

`QueryResponse`

**Example Usage Code Snippet**

```java
import com.swagger.petstore.InfluxdbSdk;
import com.swagger.petstore.config.InfluxdbSdkConfig;
import com.swagger.petstore.models.ContentType;
import com.swagger.petstore.models.Format;
import com.swagger.petstore.models.GetExecuteQuerySqlAccept;
import com.swagger.petstore.models.GetExecuteQuerySqlParameters;
import com.swagger.petstore.models.QueryResponse;

public class Main {

  public static void main(String[] args) {
    InfluxdbSdkConfig config = InfluxdbSdkConfig.builder().accessToken("YOUR_ACCESS_TOKEN").build();

    InfluxdbSdk influxdbSdk = new InfluxdbSdk(config);

    GetExecuteQuerySqlParameters requestParameters = GetExecuteQuerySqlParameters.builder()
      .db("db")
      .q("q")
      .format(Format.JSON)
      .accept(GetExecuteQuerySqlAccept.APPLICATION_JSON)
      .contentType(ContentType.APPLICATION_JSON)
      .build();

    QueryResponse response = influxdbSdk.queryData.getExecuteQuerySql(requestParameters);

    System.out.println(response);
  }
}

```

## postExecuteQuerySql

Executes an SQL query to retrieve data from the specified database.

- HTTP Method: `POST`
- Endpoint: `/api/v3/query_sql`

**Parameters**

| Name              | Type                                                                        | Required | Description               |
| :---------------- | :-------------------------------------------------------------------------- | :------- | :------------------------ |
| requestParameters | [PostExecuteQuerySqlParameters](../models/PostExecuteQuerySqlParameters.md) | ✅       | Request Parameters Object |

**Return Type**

`QueryResponse`

**Example Usage Code Snippet**

```java
import com.swagger.petstore.InfluxdbSdk;
import com.swagger.petstore.config.InfluxdbSdkConfig;
import com.swagger.petstore.models.ContentType;
import com.swagger.petstore.models.GetExecuteQuerySqlAccept;
import com.swagger.petstore.models.PostExecuteQuerySqlParameters;
import com.swagger.petstore.models.QueryRequestObject;
import com.swagger.petstore.models.QueryRequestObjectFormat;
import com.swagger.petstore.models.QueryResponse;

public class Main {

  public static void main(String[] args) {
    InfluxdbSdkConfig config = InfluxdbSdkConfig.builder().accessToken("YOUR_ACCESS_TOKEN").build();

    InfluxdbSdk influxdbSdk = new InfluxdbSdk(config);

    QueryRequestObject queryRequestObject = QueryRequestObject.builder()
      .database("database")
      .queryStr("query_str")
      .format(QueryRequestObjectFormat.JSON)
      .params(new Object())
      .build();

    PostExecuteQuerySqlParameters requestParameters = PostExecuteQuerySqlParameters.builder()
      .accept(GetExecuteQuerySqlAccept.APPLICATION_JSON)
      .contentType(ContentType.APPLICATION_JSON)
      .queryRequestObject(queryRequestObject)
      .build();

    QueryResponse response = influxdbSdk.queryData.postExecuteQuerySql(requestParameters);

    System.out.println(response);
  }
}

```

## getExecuteInfluxQlQuery

Executes an InfluxQL query to retrieve data from the specified database.

- HTTP Method: `GET`
- Endpoint: `/api/v3/query_influxql`

**Parameters**

| Name              | Type                                                                                | Required | Description               |
| :---------------- | :---------------------------------------------------------------------------------- | :------- | :------------------------ |
| requestParameters | [GetExecuteInfluxQlQueryParameters](../models/GetExecuteInfluxQlQueryParameters.md) | ✅       | Request Parameters Object |

**Return Type**

`QueryResponse`

**Example Usage Code Snippet**

```java
import com.swagger.petstore.InfluxdbSdk;
import com.swagger.petstore.config.InfluxdbSdkConfig;
import com.swagger.petstore.models.GetExecuteInfluxQlQueryParameters;
import com.swagger.petstore.models.GetExecuteQuerySqlAccept;
import com.swagger.petstore.models.QueryResponse;

public class Main {

  public static void main(String[] args) {
    InfluxdbSdkConfig config = InfluxdbSdkConfig.builder().accessToken("YOUR_ACCESS_TOKEN").build();

    InfluxdbSdk influxdbSdk = new InfluxdbSdk(config);

    GetExecuteInfluxQlQueryParameters requestParameters = GetExecuteInfluxQlQueryParameters.builder()
      .q("q")
      .db("db")
      .format("format")
      .accept(GetExecuteQuerySqlAccept.APPLICATION_JSON)
      .build();

    QueryResponse response = influxdbSdk.queryData.getExecuteInfluxQlQuery(requestParameters);

    System.out.println(response);
  }
}

```

## postExecuteQueryInfluxQl

Executes an InfluxQL query to retrieve data from the specified database.

- HTTP Method: `POST`
- Endpoint: `/api/v3/query_influxql`

**Parameters**

| Name              | Type                                                                                  | Required | Description               |
| :---------------- | :------------------------------------------------------------------------------------ | :------- | :------------------------ |
| requestParameters | [PostExecuteQueryInfluxQlParameters](../models/PostExecuteQueryInfluxQlParameters.md) | ✅       | Request Parameters Object |

**Return Type**

`QueryResponse`

**Example Usage Code Snippet**

```java
import com.swagger.petstore.InfluxdbSdk;
import com.swagger.petstore.config.InfluxdbSdkConfig;
import com.swagger.petstore.models.ContentType;
import com.swagger.petstore.models.GetExecuteQuerySqlAccept;
import com.swagger.petstore.models.PostExecuteQueryInfluxQlParameters;
import com.swagger.petstore.models.QueryRequestObject;
import com.swagger.petstore.models.QueryRequestObjectFormat;
import com.swagger.petstore.models.QueryResponse;

public class Main {

  public static void main(String[] args) {
    InfluxdbSdkConfig config = InfluxdbSdkConfig.builder().accessToken("YOUR_ACCESS_TOKEN").build();

    InfluxdbSdk influxdbSdk = new InfluxdbSdk(config);

    QueryRequestObject queryRequestObject = QueryRequestObject.builder()
      .database("database")
      .queryStr("query_str")
      .format(QueryRequestObjectFormat.JSON)
      .params(new Object())
      .build();

    PostExecuteQueryInfluxQlParameters requestParameters = PostExecuteQueryInfluxQlParameters.builder()
      .accept(GetExecuteQuerySqlAccept.APPLICATION_JSON)
      .contentType(ContentType.APPLICATION_JSON)
      .queryRequestObject(queryRequestObject)
      .build();

    QueryResponse response = influxdbSdk.queryData.postExecuteQueryInfluxQl(requestParameters);

    System.out.println(response);
  }
}

```

## getV1ExecuteQuery

Executes an InfluxQL query to retrieve data from the specified database. This endpoint is compatible with InfluxDB 1.x client libraries and third-party integrations such as Grafana. Use query parameters to specify the database and the InfluxQL query.

- HTTP Method: `GET`
- Endpoint: `/query`

**Parameters**

| Name              | Type                                                                    | Required | Description               |
| :---------------- | :---------------------------------------------------------------------- | :------- | :------------------------ |
| requestParameters | [GetV1ExecuteQueryParameters](../models/GetV1ExecuteQueryParameters.md) | ✅       | Request Parameters Object |

**Return Type**

`QueryResponse`

**Example Usage Code Snippet**

```java
import com.swagger.petstore.InfluxdbSdk;
import com.swagger.petstore.config.InfluxdbSdkConfig;
import com.swagger.petstore.models.EpochCompatibility;
import com.swagger.petstore.models.GetV1ExecuteQueryAccept;
import com.swagger.petstore.models.GetV1ExecuteQueryParameters;
import com.swagger.petstore.models.QueryResponse;

public class Main {

  public static void main(String[] args) {
    InfluxdbSdkConfig config = InfluxdbSdkConfig.builder().accessToken("YOUR_ACCESS_TOKEN").build();

    InfluxdbSdk influxdbSdk = new InfluxdbSdk(config);

    GetV1ExecuteQueryParameters requestParameters = GetV1ExecuteQueryParameters.builder()
      .q("q")
      .chunked(true)
      .chunkSize(10000L)
      .db("db")
      .pretty(false)
      .epoch(EpochCompatibility.NS)
      .accept(GetV1ExecuteQueryAccept.APPLICATION_JSON)
      .build();

    QueryResponse response = influxdbSdk.queryData.getV1ExecuteQuery(requestParameters);

    System.out.println(response);
  }
}

```

## postExecuteV1Query

Executes an InfluxQL query to retrieve data from the specified database.

- HTTP Method: `POST`
- Endpoint: `/query`

**Parameters**

| Name              | Type                                                                      | Required | Description               |
| :---------------- | :------------------------------------------------------------------------ | :------- | :------------------------ |
| requestParameters | [PostExecuteV1QueryParameters](../models/PostExecuteV1QueryParameters.md) | ❌       | Request Parameters Object |

**Return Type**

`QueryResponse`

**Example Usage Code Snippet**

```java
import com.swagger.petstore.InfluxdbSdk;
import com.swagger.petstore.config.InfluxdbSdkConfig;
import com.swagger.petstore.models.Epoch;
import com.swagger.petstore.models.PostExecuteV1QueryAccept;
import com.swagger.petstore.models.PostExecuteV1QueryParameters;
import com.swagger.petstore.models.PostExecuteV1QueryRequest;
import com.swagger.petstore.models.QueryResponse;

public class Main {

  public static void main(String[] args) {
    InfluxdbSdkConfig config = InfluxdbSdkConfig.builder().accessToken("YOUR_ACCESS_TOKEN").build();

    InfluxdbSdk influxdbSdk = new InfluxdbSdk(config);

    PostExecuteV1QueryRequest postExecuteV1QueryRequest = PostExecuteV1QueryRequest.builder()
      .db("db")
      .q("q")
      .chunked(true)
      .chunkSize(10000L)
      .epoch(Epoch.NS)
      .pretty(true)
      .build();

    PostExecuteV1QueryParameters requestParameters = PostExecuteV1QueryParameters.builder()
      .accept(PostExecuteV1QueryAccept.APPLICATION_JSON)
      .requestBody(postExecuteV1QueryRequest)
      .build();

    QueryResponse response = influxdbSdk.queryData.postExecuteV1Query(requestParameters);

    System.out.println(response);
  }
}

```

<!-- This file was generated by liblab | https://liblab.com/ -->
