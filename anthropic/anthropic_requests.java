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
        // Create JSON body
        String jsonBody = "{\"ssn\": \"666-66-6666\", \"messages\": [{\"role\": \"user\", \"content\": \"whose phone number is 408-555-5555\"}]}";
        RequestBody body = RequestBody.create(jsonBody, JSON);
        Request request = new Request.Builder()
            .url("https://api.anthropic.com/v1/messages")
            .post(body)
            .addHeader("X-SSCSecurity-TKN", "sdklfjasdiofsa225678--+!diogasd-dafasdfasdfasdf")
            .addHeader("Authorization", "Bearer 777-77-7777")
            .build();
    }
}

public class RestApiCallTwo {
    public static void main(String[] args) throws IOException {

        // Create ¬JSON body
        String jsonBody = "{\"key1\": \"value1\", \"key2\": [{\"subKey1\": \"value2\"}]}";
        RequestBody body = RequestBody.create(jsonBody, JSON);
        Request request = new Request.Builder()
            .url("https://api.anthropic.com/v1/complete")
            .post(body)
            .addHeader("X-SSCSecurity-TKN", "sdklfjasdiofsa225678--+!diogasd-dafasdfasdfasdf")
            .addHeader("Authorization", "Bearer 777-77-7777")
            .build();
    }
}

public class RestApiCallThree {
    public static void main(String[] args) throws IOException {
        // Create JSON body
        String jsonBody = "{\"email\": \"boss@criticalinfrastructure.com\", \"ssn\": [{\"dave\": \"222-22-2222\"}]}";
        RequestBody body = RequestBody.create(jsonBody, JSON);
        Request request = new Request.Builder()
            .url("https://api.anthropic.com/v1/messages")
            .post(body)

            .build();
    }
}

public class RestApiCallFour {
    public static void main(String[] args) throws IOException {
        Request request = new Request.Builder()
            .get()
            .url("https://api.anthropic.com/v1/messages?IMEI=358632958148007")
            .build();
    }
}

public class RestApiCallFive {
    public static void main(String[] args) throws IOException {

        Request request = new Request.Builder()
            .get()
            .url("https://api.anthropic.com/v1/complete?email=testAI@ssc.com")
            .build();
    }
}
