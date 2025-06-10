# CompatibilityEndpointsService

A list of all methods in the `CompatibilityEndpointsService` service. Click on the method name to view detailed information about that method.

| Methods                     | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| :-------------------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [postV1Write](#postv1write) | Writes line protocol to the specified database. This endpoint provides backward compatibility for InfluxDB 1.x write workloads using tools such as InfluxDB 1.x client libraries, the Telegraf `outputs.influxdb` output plugin, or third-party tools. Use this endpoint to send data in [line protocol](https://docs.influxdata.com/influxdb3/core/reference/syntax/line-protocol/) format to InfluxDB. Use query parameters to specify options for writing data. |
| [postV2Write](#postv2write) | Writes line protocol to the specified database. This endpoint provides backward compatibility for InfluxDB 2.x write workloads using tools such as InfluxDB 2.x client libraries, the Telegraf `outputs.influxdb_v2` output plugin, or third-party tools. Use this endpoint to send data in [line protocol](/influxdb3/core/reference/syntax/line-protocol/) format to InfluxDB. Use query parameters to specify options for writing data.                         |

## postV1Write

Writes line protocol to the specified database. This endpoint provides backward compatibility for InfluxDB 1.x write workloads using tools such as InfluxDB 1.x client libraries, the Telegraf `outputs.influxdb` output plugin, or third-party tools. Use this endpoint to send data in [line protocol](https://docs.influxdata.com/influxdb3/core/reference/syntax/line-protocol/) format to InfluxDB. Use query parameters to specify options for writing data.

- HTTP Method: `POST`
- Endpoint: `/write`

**Parameters**

| Name              | Type                                                        | Required | Description               |
| :---------------- | :---------------------------------------------------------- | :------- | :------------------------ |
| requestParameters | [PostV1WriteParameters](../models/PostV1WriteParameters.md) | ✅       | Request Parameters Object |

**Example Usage Code Snippet**

```java
import com.swagger.petstore.InfluxdbSdk;
import com.swagger.petstore.config.InfluxdbSdkConfig;
import com.swagger.petstore.models.ContentEncoding;
import com.swagger.petstore.models.LineProtocol;
import com.swagger.petstore.models.PostV1WriteAccept;
import com.swagger.petstore.models.PostV1WriteParameters;
import com.swagger.petstore.models.PrecisionWriteCompatibility;

public class Main {

  public static void main(String[] args) {
    InfluxdbSdkConfig config = InfluxdbSdkConfig.builder().accessToken("YOUR_ACCESS_TOKEN").build();

    InfluxdbSdk influxdbSdk = new InfluxdbSdk(config);

    PostV1WriteParameters requestParameters = PostV1WriteParameters.builder()
      .db("db")
      .precision(PrecisionWriteCompatibility.MS)
      .contentType(LineProtocol.TEXT_PLAIN)
      .accept(PostV1WriteAccept.APPLICATION_JSON)
      .contentEncoding(ContentEncoding.GZIP)
      .contentLength(2L)
      .requestBody("do labore in")
      .build();

    influxdbSdk.compatibilityEndpoints.postV1Write(requestParameters);
  }
}

```

## postV2Write

Writes line protocol to the specified database. This endpoint provides backward compatibility for InfluxDB 2.x write workloads using tools such as InfluxDB 2.x client libraries, the Telegraf `outputs.influxdb_v2` output plugin, or third-party tools. Use this endpoint to send data in [line protocol](/influxdb3/core/reference/syntax/line-protocol/) format to InfluxDB. Use query parameters to specify options for writing data.

- HTTP Method: `POST`
- Endpoint: `/api/v2/write`

**Parameters**

| Name              | Type                                                        | Required | Description               |
| :---------------- | :---------------------------------------------------------- | :------- | :------------------------ |
| requestParameters | [PostV2WriteParameters](../models/PostV2WriteParameters.md) | ✅       | Request Parameters Object |

**Example Usage Code Snippet**

```java
import com.swagger.petstore.InfluxdbSdk;
import com.swagger.petstore.config.InfluxdbSdkConfig;
import com.swagger.petstore.models.LineProtocol;
import com.swagger.petstore.models.PostV2WriteAccept;
import com.swagger.petstore.models.PostV2WriteContentEncoding;
import com.swagger.petstore.models.PostV2WriteParameters;
import com.swagger.petstore.models.PrecisionWriteCompatibility;

public class Main {

  public static void main(String[] args) {
    InfluxdbSdkConfig config = InfluxdbSdkConfig.builder().accessToken("YOUR_ACCESS_TOKEN").build();

    InfluxdbSdk influxdbSdk = new InfluxdbSdk(config);

    PostV2WriteParameters requestParameters = PostV2WriteParameters.builder()
      .db("db")
      .precision(PrecisionWriteCompatibility.MS)
      .acceptPartial(true)
      .contentType(LineProtocol.TEXT_PLAIN)
      .contentEncoding(PostV2WriteContentEncoding.GZIP)
      .contentLength(6L)
      .accept(PostV2WriteAccept.APPLICATION_JSON)
      .requestBody("labore elit ")
      .build();

    influxdbSdk.compatibilityEndpoints.postV2Write(requestParameters);
  }
}

```

<!-- This file was generated by liblab | https://liblab.com/ -->
