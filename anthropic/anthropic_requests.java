package anthropic;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class RestApiCall {
    public static void main(String[] args) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("https://api.anthropic.com/v1/messages");

        // Set headers (if required)
        httpPost.addHeader("Content-Type", "application/json");
        httpPost.addHeader("Authorization", "Bearer your-token");

        // Create JSON body
        String jsonBody = "{\"ssn\": \"666-66-6666\", \"messages\": [{\"role\": \"user\", \"content\": \"whose phone number is 408-555-5555\"}]}";
        StringEntity entity = new StringEntity(jsonBody);
        httpPost.setEntity(entity);

        CloseableHttpResponse response = httpClient.execute(httpPost);
        try {
            int statusCode = response.getStatusLine().getStatusCode();
            String responseBody = EntityUtils.toString(response.getEntity());
            System.out.println("Status code: " + statusCode);
            System.out.println("Response body: " + responseBody);
        } finally {
            response.close();
        }
        httpClient.close();
    }
}

public class RestApiCallTwo {
    public static void main(String[] args) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("https://api.anthropic.com/v1/complete");

        // Set headers (if required)
        httpPost.addHeader("Content-Type", "application/json");
        httpPost.addHeader("Authorization", "Bearer your-token");

        // Create JSON body
        String jsonBody = "{\"key1\": \"value1\", \"key2\": [{\"subKey1\": \"value2\"}]}";
        StringEntity entity = new StringEntity(jsonBody);
        httpPost.setEntity(entity);

        CloseableHttpResponse response = httpClient.execute(httpPost);
        try {
            int statusCode = response.getStatusLine().getStatusCode();
            String responseBody = EntityUtils.toString(response.getEntity());
            System.out.println("Status code: " + statusCode);
            System.out.println("Response body: " + responseBody);
        } finally {
            response.close();
        }
        httpClient.close();
    }
}

public class RestApiCallThree {
    public static void main(String[] args) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPatch("https://api.anthropic.com/v1/messages");

        // Set headers (if required)
        httpPost.addHeader("Content-Type", "application/json");
        httpPost.addHeader("Authorization", "Bearer your-token");

        // Create JSON body
        String jsonBody = "{\"email\": \"boss@criticalinfrastructure.com\", \"ssn\": [{\"dave\": \"222-22-2222\"}]}";
        StringEntity entity = new StringEntity(jsonBody);
        httpPost.setEntity(entity);

        CloseableHttpResponse response = httpClient.execute(httpPost);
        try {
            int statusCode = response.getStatusLine().getStatusCode();
            String responseBody = EntityUtils.toString(response.getEntity());
            System.out.println("Status code: " + statusCode);
            System.out.println("Response body: " + responseBody);
        } finally {
            response.close();
        }
        httpClient.close();
    }
}

public class RestApiCallFour {
    public static void main(String[] args) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpGet("https://api.anthropic.com/v1/messages?IMEI=358632958148007");


        CloseableHttpResponse response = httpClient.execute(httpPost);
        try {
            int statusCode = response.getStatusLine().getStatusCode();
            String responseBody = EntityUtils.toString(response.getEntity());
            System.out.println("Status code: " + statusCode);
            System.out.println("Response body: " + responseBody);
        } finally {
            response.close();
        }
        httpClient.close();
    }
}

public class RestApiCallFive {
    public static void main(String[] args) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpGet("https://api.anthropic.com/v1/complete?email=testAI@ssc.com");

        // Set headers (if required)
        httpPost.addHeader("Content-Type", "application/json");
        httpPost.addHeader("Authorization", "123-45-6789");


        CloseableHttpResponse response = httpClient.execute(httpPost);
        try {
            int statusCode = response.getStatusLine().getStatusCode();
            String responseBody = EntityUtils.toString(response.getEntity());
            System.out.println("Status code: " + statusCode);
            System.out.println("Response body: " + responseBody);
        } finally {
            response.close();
        }
        httpClient.close();
    }
}
