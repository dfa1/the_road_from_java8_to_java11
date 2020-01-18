import java.net.URI;
import java.net.http.*;
import java.time.Duration;

public class HttpClientDemo {
	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			System.err.println("missing URL argument");
			System.exit(1);
		}
		URI uri = URI.create(args[0]);
		HttpClient client = HttpClient.newBuilder()
			.version(HttpClient.Version.HTTP_2)
			.build();
		HttpRequest request = HttpRequest.newBuilder()
			.uri(uri)
			.timeout(Duration.ofSeconds(1))
			.build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.print(response.body());
	}
}

