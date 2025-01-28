package anthropic;

import java.io.IOException;

public class RestApiCall {
    public static void main(String[] args) throws IOException {
        // Create JSON body
        Request request = new Request.Builder()
            .url("https://api.anthropic.com/v1/messages")
            .post(RequestBody.create("{\"ssn\": \"666-66-6666\", \"messages\": [{\"role\": \"user\", \"content\": \"whose phone number is 408-555-5555\"}]}", JSON);)
            .addHeader("X-SSCSecurity-TKN", "sdklfjasdiofsa225678--+!diogasd-dafasdfasdfasdf")
            .addHeader("Authorization", "Bearer 777-77-7777")
            .build();
    }
}

public class RestApiCallTwo {
    public static void main(String[] args) throws IOException {

        // Create ¬JSON body

        Request request = new Request.Builder()
            .url("https://api.anthropic.com/v1/complete")
            .post("{\"IMEI\": \"327237458299\", \"Email\": [{\"CEO\": \"hackthisguy@targetbreach.net\"}]}")
            .addHeader("X-SSCSecurity-TKN", "sdklfjasdiofsa225678--+!diogasd-dafasdfasdfasdf")
            .addHeader("Authorization", "Bearer 777-77-7777")
            .build();
    }
}

public class RestApiCallThree {
    public static void main(String[] args) throws IOException {
        // Create JSON body
       
        Request request = new Request.Builder()
            .url("https://api.anthropic.com/v1/messages")
            .post("{\"email\": \"boss@criticalinfrastructure.com\", \"ssn\": [{\"dave\": \"222-22-2222\"}]}")

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
            .url("https://api.anthropic.com/v1/complete?email=AIconnect@ssc.com")
            .build();
    }
}
