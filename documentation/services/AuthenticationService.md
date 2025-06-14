# AuthenticationService

A list of all methods in the `AuthenticationService` service. Click on the method name to view detailed information about that method.

| Methods                                               | Description                                                                                                            |
| :---------------------------------------------------- | :--------------------------------------------------------------------------------------------------------------------- |
| [postCreateAdminToken](#postcreateadmintoken)         | Creates an admin token. An admin token is a special type of token that has full access to all resources in the system. |
| [postRegenerateAdminToken](#postregenerateadmintoken) | Regenerates an admin token and revokes the previous token with the same name.                                          |

## postCreateAdminToken

Creates an admin token. An admin token is a special type of token that has full access to all resources in the system.

- HTTP Method: `POST`
- Endpoint: `/api/v3/configure/token/admin`

**Return Type**

`AdminTokenObject`

**Example Usage Code Snippet**

```java
import com.swagger.petstore.InfluxdbSdk;
import com.swagger.petstore.config.InfluxdbSdkConfig;
import com.swagger.petstore.models.AdminTokenObject;

public class Main {

  public static void main(String[] args) {
    InfluxdbSdkConfig config = InfluxdbSdkConfig.builder().accessToken("YOUR_ACCESS_TOKEN").build();

    InfluxdbSdk influxdbSdk = new InfluxdbSdk(config);

    AdminTokenObject response = influxdbSdk.authentication.postCreateAdminToken();

    System.out.println(response);
  }
}

```

## postRegenerateAdminToken

Regenerates an admin token and revokes the previous token with the same name.

- HTTP Method: `POST`
- Endpoint: `/api/v3/configure/token/admin/regenerate`

**Return Type**

`AdminTokenObject`

**Example Usage Code Snippet**

```java
import com.swagger.petstore.InfluxdbSdk;
import com.swagger.petstore.config.InfluxdbSdkConfig;
import com.swagger.petstore.models.AdminTokenObject;

public class Main {

  public static void main(String[] args) {
    InfluxdbSdkConfig config = InfluxdbSdkConfig.builder().accessToken("YOUR_ACCESS_TOKEN").build();

    InfluxdbSdk influxdbSdk = new InfluxdbSdk(config);

    AdminTokenObject response = influxdbSdk.authentication.postRegenerateAdminToken();

    System.out.println(response);
  }
}

```

<!-- This file was generated by liblab | https://liblab.com/ -->
