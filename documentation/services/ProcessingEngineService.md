# ProcessingEngineService

A list of all methods in the `ProcessingEngineService` service. Click on the method name to view detailed information about that method.

| Methods                                                                           | Description                                                                                                                                                                                                                                                                                                                                                                                                                        |
| :-------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [postConfigureProcessingEngineTrigger](#postconfigureprocessingenginetrigger)     | Creates a processing engine trigger with the specified plugin file and trigger specification. ### Related guides - [Processing engine and Python plugins](/influxdb3/core/plugins/)                                                                                                                                                                                                                                                |
| [deleteConfigureProcessingEngineTrigger](#deleteconfigureprocessingenginetrigger) | Deletes a processing engine trigger.                                                                                                                                                                                                                                                                                                                                                                                               |
| [postDisableProcessingEngineTrigger](#postdisableprocessingenginetrigger)         | Disables a processing engine trigger.                                                                                                                                                                                                                                                                                                                                                                                              |
| [postEnableProcessingEngineTrigger](#postenableprocessingenginetrigger)           | Enables a processing engine trigger.                                                                                                                                                                                                                                                                                                                                                                                               |
| [postInstallPluginPackages](#postinstallpluginpackages)                           | Installs the specified Python packages into the processing engine plugin environment. This endpoint is synchronous and blocks until the packages are installed. ### Related guides - [Processing engine and Python plugins](/influxdb3/core/plugins/)                                                                                                                                                                              |
| [postInstallPluginRequirements](#postinstallpluginrequirements)                   | Installs requirements from a requirements file (also known as a "pip requirements file") into the processing engine plugin environment. This endpoint is synchronous and blocks until the requirements are installed. ### Related - [Processing engine and Python plugins](/influxdb3/core/plugins/) - [Python requirements file format](https://pip.pypa.io/en/stable/reference/requirements-file-format/)                        |
| [postTestWalPlugin](#posttestwalplugin)                                           | Executes a test of a write-ahead logging (WAL) plugin.                                                                                                                                                                                                                                                                                                                                                                             |
| [postTestSchedulingPlugin](#posttestschedulingplugin)                             | Executes a test of a scheduling plugin.                                                                                                                                                                                                                                                                                                                                                                                            |
| [getProcessingEnginePluginRequest](#getprocessingenginepluginrequest)             | Executes the On Request processing engine plugin specified in `\<plugin_path\>`. The request can include request headers, query string parameters, and a request body, which InfluxDB passes to the plugin. An On Request plugin implements the following signature: `python def process_request(influxdb3_local, query_parameters, request_headers, request_body, args=None) ` The response depends on the plugin implementation. |
| [postProcessingEnginePluginRequest](#postprocessingenginepluginrequest)           | Executes the On Request processing engine plugin specified in `\<plugin_path\>`. The request can include request headers, query string parameters, and a request body, which InfluxDB passes to the plugin. An On Request plugin implements the following signature: `python def process_request(influxdb3_local, query_parameters, request_headers, request_body, args=None) ` The response depends on the plugin implementation. |

## postConfigureProcessingEngineTrigger

Creates a processing engine trigger with the specified plugin file and trigger specification. ### Related guides - [Processing engine and Python plugins](/influxdb3/core/plugins/)

- HTTP Method: `POST`
- Endpoint: `/api/v3/configure/processing_engine_trigger`

**Parameters**

| Name                           | Type                                                                          | Required | Description  |
| :----------------------------- | :---------------------------------------------------------------------------- | :------- | :----------- |
| processingEngineTriggerRequest | [ProcessingEngineTriggerRequest](../models/ProcessingEngineTriggerRequest.md) | ✅       | Request Body |

**Example Usage Code Snippet**

```java
import com.swagger.petstore.InfluxdbSdk;
import com.swagger.petstore.config.InfluxdbSdkConfig;
import com.swagger.petstore.models.ProcessingEngineTriggerRequest;

public class Main {

  public static void main(String[] args) {
    InfluxdbSdkConfig config = InfluxdbSdkConfig.builder().accessToken("YOUR_ACCESS_TOKEN").build();

    InfluxdbSdk influxdbSdk = new InfluxdbSdk(config);

    ProcessingEngineTriggerRequest processingEngineTriggerRequest = ProcessingEngineTriggerRequest.builder()
      .db("db")
      .pluginFilename("plugin_filename")
      .triggerName("trigger_name")
      .triggerSpecification("cron:0 0 6 * * 1-5")
      .triggerArguments(new Object())
      .disabled(true)
      .build();

    influxdbSdk.processingEngine.postConfigureProcessingEngineTrigger(processingEngineTriggerRequest);
  }
}

```

## deleteConfigureProcessingEngineTrigger

Deletes a processing engine trigger.

- HTTP Method: `DELETE`
- Endpoint: `/api/v3/configure/processing_engine_trigger`

**Parameters**

| Name              | Type                                                                                                              | Required | Description               |
| :---------------- | :---------------------------------------------------------------------------------------------------------------- | :------- | :------------------------ |
| requestParameters | [DeleteConfigureProcessingEngineTriggerParameters](../models/DeleteConfigureProcessingEngineTriggerParameters.md) | ✅       | Request Parameters Object |

**Example Usage Code Snippet**

```java
import com.swagger.petstore.InfluxdbSdk;
import com.swagger.petstore.config.InfluxdbSdkConfig;
import com.swagger.petstore.models.DeleteConfigureProcessingEngineTriggerParameters;

public class Main {

  public static void main(String[] args) {
    InfluxdbSdkConfig config = InfluxdbSdkConfig.builder().accessToken("YOUR_ACCESS_TOKEN").build();

    InfluxdbSdk influxdbSdk = new InfluxdbSdk(config);

    DeleteConfigureProcessingEngineTriggerParameters requestParameters =
      DeleteConfigureProcessingEngineTriggerParameters.builder()
        .db("db")
        .triggerName("trigger_name")
        .force(true)
        .build();

    influxdbSdk.processingEngine.deleteConfigureProcessingEngineTrigger(requestParameters);
  }
}

```

## postDisableProcessingEngineTrigger

Disables a processing engine trigger.

- HTTP Method: `POST`
- Endpoint: `/api/v3/configure/processing_engine_trigger/disable`

**Parameters**

| Name              | Type                                                                                                      | Required | Description               |
| :---------------- | :-------------------------------------------------------------------------------------------------------- | :------- | :------------------------ |
| requestParameters | [PostDisableProcessingEngineTriggerParameters](../models/PostDisableProcessingEngineTriggerParameters.md) | ✅       | Request Parameters Object |

**Example Usage Code Snippet**

```java
import com.swagger.petstore.InfluxdbSdk;
import com.swagger.petstore.config.InfluxdbSdkConfig;
import com.swagger.petstore.models.ContentType;
import com.swagger.petstore.models.PostDisableProcessingEngineTriggerParameters;
import com.swagger.petstore.models.ProcessingEngineTriggerRequest;

public class Main {

  public static void main(String[] args) {
    InfluxdbSdkConfig config = InfluxdbSdkConfig.builder().accessToken("YOUR_ACCESS_TOKEN").build();

    InfluxdbSdk influxdbSdk = new InfluxdbSdk(config);

    ProcessingEngineTriggerRequest processingEngineTriggerRequest = ProcessingEngineTriggerRequest.builder()
      .db("db")
      .pluginFilename("plugin_filename")
      .triggerName("trigger_name")
      .triggerSpecification("cron:0 0 6 * * 1-5")
      .triggerArguments(new Object())
      .disabled(true)
      .build();

    PostDisableProcessingEngineTriggerParameters requestParameters =
      PostDisableProcessingEngineTriggerParameters.builder()
        .contentType(ContentType.APPLICATION_JSON)
        .processingEngineTriggerRequest(processingEngineTriggerRequest)
        .build();

    influxdbSdk.processingEngine.postDisableProcessingEngineTrigger(requestParameters);
  }
}

```

## postEnableProcessingEngineTrigger

Enables a processing engine trigger.

- HTTP Method: `POST`
- Endpoint: `/api/v3/configure/processing_engine_trigger/enable`

**Parameters**

| Name              | Type                                                                                                    | Required | Description               |
| :---------------- | :------------------------------------------------------------------------------------------------------ | :------- | :------------------------ |
| requestParameters | [PostEnableProcessingEngineTriggerParameters](../models/PostEnableProcessingEngineTriggerParameters.md) | ✅       | Request Parameters Object |

**Example Usage Code Snippet**

```java
import com.swagger.petstore.InfluxdbSdk;
import com.swagger.petstore.config.InfluxdbSdkConfig;
import com.swagger.petstore.models.ContentType;
import com.swagger.petstore.models.PostEnableProcessingEngineTriggerParameters;
import com.swagger.petstore.models.ProcessingEngineTriggerRequest;

public class Main {

  public static void main(String[] args) {
    InfluxdbSdkConfig config = InfluxdbSdkConfig.builder().accessToken("YOUR_ACCESS_TOKEN").build();

    InfluxdbSdk influxdbSdk = new InfluxdbSdk(config);

    ProcessingEngineTriggerRequest processingEngineTriggerRequest = ProcessingEngineTriggerRequest.builder()
      .db("db")
      .pluginFilename("plugin_filename")
      .triggerName("trigger_name")
      .triggerSpecification("cron:0 0 6 * * 1-5")
      .triggerArguments(new Object())
      .disabled(true)
      .build();

    PostEnableProcessingEngineTriggerParameters requestParameters =
      PostEnableProcessingEngineTriggerParameters.builder()
        .contentType(ContentType.APPLICATION_JSON)
        .processingEngineTriggerRequest(processingEngineTriggerRequest)
        .build();

    influxdbSdk.processingEngine.postEnableProcessingEngineTrigger(requestParameters);
  }
}

```

## postInstallPluginPackages

Installs the specified Python packages into the processing engine plugin environment. This endpoint is synchronous and blocks until the packages are installed. ### Related guides - [Processing engine and Python plugins](/influxdb3/core/plugins/)

- HTTP Method: `POST`
- Endpoint: `/api/v3/configure/plugin_environment/install_packages`

**Parameters**

| Name              | Type                                                                                    | Required | Description               |
| :---------------- | :-------------------------------------------------------------------------------------- | :------- | :------------------------ |
| requestParameters | [PostInstallPluginPackagesParameters](../models/PostInstallPluginPackagesParameters.md) | ✅       | Request Parameters Object |

**Example Usage Code Snippet**

```java
import com.swagger.petstore.InfluxdbSdk;
import com.swagger.petstore.config.InfluxdbSdkConfig;
import com.swagger.petstore.models.ContentType;
import com.swagger.petstore.models.PostInstallPluginPackagesParameters;
import com.swagger.petstore.models.PostInstallPluginPackagesRequest;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    InfluxdbSdkConfig config = InfluxdbSdkConfig.builder().accessToken("YOUR_ACCESS_TOKEN").build();

    InfluxdbSdk influxdbSdk = new InfluxdbSdk(config);

    List<String> packagesList = Arrays.asList("packages");

    PostInstallPluginPackagesRequest postInstallPluginPackagesRequest = PostInstallPluginPackagesRequest.builder()
      .packages(packagesList)
      .build();

    PostInstallPluginPackagesParameters requestParameters = PostInstallPluginPackagesParameters.builder()
      .contentType(ContentType.APPLICATION_JSON)
      .requestBody(postInstallPluginPackagesRequest)
      .build();

    influxdbSdk.processingEngine.postInstallPluginPackages(requestParameters);
  }
}

```

## postInstallPluginRequirements

Installs requirements from a requirements file (also known as a "pip requirements file") into the processing engine plugin environment. This endpoint is synchronous and blocks until the requirements are installed. ### Related - [Processing engine and Python plugins](/influxdb3/core/plugins/) - [Python requirements file format](https://pip.pypa.io/en/stable/reference/requirements-file-format/)

- HTTP Method: `POST`
- Endpoint: `/api/v3/configure/plugin_environment/install_requirements`

**Parameters**

| Name              | Type                                                                                            | Required | Description               |
| :---------------- | :---------------------------------------------------------------------------------------------- | :------- | :------------------------ |
| requestParameters | [PostInstallPluginRequirementsParameters](../models/PostInstallPluginRequirementsParameters.md) | ✅       | Request Parameters Object |

**Example Usage Code Snippet**

```java
import com.swagger.petstore.InfluxdbSdk;
import com.swagger.petstore.config.InfluxdbSdkConfig;
import com.swagger.petstore.models.ContentType;
import com.swagger.petstore.models.PostInstallPluginRequirementsParameters;
import com.swagger.petstore.models.PostInstallPluginRequirementsRequest;

public class Main {

  public static void main(String[] args) {
    InfluxdbSdkConfig config = InfluxdbSdkConfig.builder().accessToken("YOUR_ACCESS_TOKEN").build();

    InfluxdbSdk influxdbSdk = new InfluxdbSdk(config);

    PostInstallPluginRequirementsRequest postInstallPluginRequirementsRequest =
      PostInstallPluginRequirementsRequest.builder().requirementsLocation("requirements.txt").build();

    PostInstallPluginRequirementsParameters requestParameters = PostInstallPluginRequirementsParameters.builder()
      .contentType(ContentType.APPLICATION_JSON)
      .requestBody(postInstallPluginRequirementsRequest)
      .build();

    influxdbSdk.processingEngine.postInstallPluginRequirements(requestParameters);
  }
}

```

## postTestWalPlugin

Executes a test of a write-ahead logging (WAL) plugin.

- HTTP Method: `POST`
- Endpoint: `/api/v3/plugin_test/wal`

**Example Usage Code Snippet**

```java
import com.swagger.petstore.InfluxdbSdk;
import com.swagger.petstore.config.InfluxdbSdkConfig;

public class Main {

  public static void main(String[] args) {
    InfluxdbSdkConfig config = InfluxdbSdkConfig.builder().accessToken("YOUR_ACCESS_TOKEN").build();

    InfluxdbSdk influxdbSdk = new InfluxdbSdk(config);

    influxdbSdk.processingEngine.postTestWalPlugin();
  }
}

```

## postTestSchedulingPlugin

Executes a test of a scheduling plugin.

- HTTP Method: `POST`
- Endpoint: `/api/v3/plugin_test/schedule`

**Example Usage Code Snippet**

```java
import com.swagger.petstore.InfluxdbSdk;
import com.swagger.petstore.config.InfluxdbSdkConfig;

public class Main {

  public static void main(String[] args) {
    InfluxdbSdkConfig config = InfluxdbSdkConfig.builder().accessToken("YOUR_ACCESS_TOKEN").build();

    InfluxdbSdk influxdbSdk = new InfluxdbSdk(config);

    influxdbSdk.processingEngine.postTestSchedulingPlugin();
  }
}

```

## getProcessingEnginePluginRequest

Executes the On Request processing engine plugin specified in `\<plugin_path\>`. The request can include request headers, query string parameters, and a request body, which InfluxDB passes to the plugin. An On Request plugin implements the following signature: `python def process_request(influxdb3_local, query_parameters, request_headers, request_body, args=None) ` The response depends on the plugin implementation.

- HTTP Method: `GET`
- Endpoint: `/api/v3/engine/{plugin_path}`

**Parameters**

| Name       | Type   | Required | Description                                                                                                                                                                                                                                                                                                     |
| :--------- | :----- | :------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| pluginPath | String | ✅       | The path configured in the request trigger specification "path:\\<plugin_path\\>"` for the plugin. For example, if you define a trigger with the following: `json trigger-spec: "path:hello-world" ` then, the HTTP API exposes the following plugin endpoint: `\\<INFLUXDB3_HOST\\>/api/v3/engine/hello-world` |

**Example Usage Code Snippet**

```java
import com.swagger.petstore.InfluxdbSdk;
import com.swagger.petstore.config.InfluxdbSdkConfig;

public class Main {

  public static void main(String[] args) {
    InfluxdbSdkConfig config = InfluxdbSdkConfig.builder().accessToken("YOUR_ACCESS_TOKEN").build();

    InfluxdbSdk influxdbSdk = new InfluxdbSdk(config);

    influxdbSdk.processingEngine.getProcessingEnginePluginRequest("plugin_path");
  }
}

```

## postProcessingEnginePluginRequest

Executes the On Request processing engine plugin specified in `\<plugin_path\>`. The request can include request headers, query string parameters, and a request body, which InfluxDB passes to the plugin. An On Request plugin implements the following signature: `python def process_request(influxdb3_local, query_parameters, request_headers, request_body, args=None) ` The response depends on the plugin implementation.

- HTTP Method: `POST`
- Endpoint: `/api/v3/engine/{plugin_path}`

**Parameters**

| Name              | Type                                                                                                    | Required | Description                                                                                                                                                                                                                                                                                                     |
| :---------------- | :------------------------------------------------------------------------------------------------------ | :------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| pluginPath        | String                                                                                                  | ✅       | The path configured in the request trigger specification "path:\\<plugin_path\\>"` for the plugin. For example, if you define a trigger with the following: `json trigger-spec: "path:hello-world" ` then, the HTTP API exposes the following plugin endpoint: `\\<INFLUXDB3_HOST\\>/api/v3/engine/hello-world` |
| requestParameters | [PostProcessingEnginePluginRequestParameters](../models/PostProcessingEnginePluginRequestParameters.md) | ❌       | Request Parameters Object                                                                                                                                                                                                                                                                                       |

**Example Usage Code Snippet**

```java
import com.swagger.petstore.InfluxdbSdk;
import com.swagger.petstore.config.InfluxdbSdkConfig;
import com.swagger.petstore.models.ContentType;
import com.swagger.petstore.models.PostProcessingEnginePluginRequestParameters;

public class Main {

  public static void main(String[] args) {
    InfluxdbSdkConfig config = InfluxdbSdkConfig.builder().accessToken("YOUR_ACCESS_TOKEN").build();

    InfluxdbSdk influxdbSdk = new InfluxdbSdk(config);

    PostProcessingEnginePluginRequestParameters requestParameters =
      PostProcessingEnginePluginRequestParameters.builder()
        .contentType(ContentType.APPLICATION_JSON)
        .requestBody(new Object())
        .build();

    influxdbSdk.processingEngine.postProcessingEnginePluginRequest("plugin_path", requestParameters);
  }
}

```

<!-- This file was generated by liblab | https://liblab.com/ -->
