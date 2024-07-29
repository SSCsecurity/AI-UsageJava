import java.io.IOException;

public class RestApiCall {
    public static void main(String[] args) throws IOException {
        // Create JSON body
        String json = "{\"model\": \"gpt-4o-mini\",\"ssn\": \"666-66-6666\", \"messages\": [{\"role\": \"user\", \"content\": \"whose phone number is 408-555-5555\"}]}";
        RequestBody body = RequestBody.create(json, JSON);
        Request request = new Request.Builder()
            .url("https://api.openai.com/v1/files")
            .post(body)
            .addHeader("X-SSCSecurity-TKN", "sdklfjasdiofsa225678--+!diogasd-dafasdfasdfasdf")
            .addHeader()
            .build();
    }
}

public class RestApiCallTwo {
    public static void main(String[] args) throws IOException {
        // Create JSON body
        String jsonBody = "{\"key1\": \"value1\", \"key2\": [{\"subKey1\": \"value2\"}], \"model\": \"gpt-4o-mini\"}";
        // Create JSON body
        String json = "{\"model\": \"gpt-4o-mini\",\"ssn\": \"666-66-6666\", \"messages\": [{\"role\": \"user\", \"content\": \"whose phone number is 408-555-5555\"}]}";
        RequestBody body = RequestBody.create(json, JSON);
        Request request = new Request.Builder()
            .url("https://api.openai.com/v1/chat/completions")
            .post(body)
            .addHeader("X-SSCSecurity-TKN", "dddd12@%-dafasdfasdfasdf")
            .addHeader()
            .build();
    }
}

public class RestApiCallThree {
    public static void main(String[] args) throws IOException {
        // Create JSON body
        String json = "{\"email\": \"boss@criticalinfrastructure.com\", \"ssn\": [{\"dave\": \"222-22-2222\"}]}";
        RequestBody body = RequestBody.create(json, JSON);
        Request request = new Request.Builder()
            .url("https://api.openai.com/v1/messages")
            .patch(body)
            .addHeader("X-Secret-Key", "sdklfjasdiofsadiogasd-dafasdfasdfasdf")
            .build();
    }
}

public class RestApiCallFour {
    public static void main(String[] args) throws IOException {
        Request request = new Request.Builder()
            .get()
            .url("https://api.openai.com/v1/chat/completions?IMEI=358632958148007")
            .build();
    }
}

public class RestApiCallFive {
    public static void main(String[] args) throws IOException {
        Request request = new Request.Builder()
            .get()
            .url("https://api.openai.com/v1/completions?email=testAI@ssc.com")
            .build();
    }
}
