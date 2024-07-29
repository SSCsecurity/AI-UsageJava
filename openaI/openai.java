import java.io.IOException;

public class RestApiCall {
    public static void main(String[] args) throws IOException {
        // Create JSON body
        Request request = new Request.Builder()
            .url("https://api.openai.com/v1/files")
            .post("{\"model\": \"gpt-4o-mini\",\"ssn\": \"666-66-6666\", \"messages\": [{\"role\": \"user\", \"content\": \"whose phone number is 408-555-5555\"}]}")
            .addHeader("X-SSCSecurity-TKN", "sdklfjasdiofsa225678--+!diogasd-dafasdfasdfasdf")
            .addHeader()
            .build();
    }
}

public class RestApiCallTwo {
    public static void main(String[] args) throws IOException {

        Request request = new Request.Builder()
            .url("https://api.openai.com/v1/chat/completions")
            .post("{\"model\": \"gpt-4o-mini\",\"ssn\": \"000-00-0000\", \"messages\": [{\"role\": \"user\", \"content\": \"what is the address of phone number 408-555-5555\"}]}")
            .addHeader("X-SSCSecurity-TKN", "dddd12@%-dafasdfasdfasdf")
            .addHeader()
            .build();
    }
}

public class RestApiCallThree {
    public static void main(String[] args) throws IOException {
        // Create JSON body
        Request request = new Request.Builder()
            .url("https://api.openai.com/v1/messages")
            .patch("{\"email\": \"boss@criticalinfrastructure.com\", \"ssn\": [{\"dave\": \"222-22-2222\"}]}")
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
