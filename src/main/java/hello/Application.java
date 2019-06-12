package hello;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String args[]) {
		sendPostRequest();
		sendGetRequest();
	}

	private static void sendPostRequest() {
		final String url = "http://localhost:8080/customer/0";
		Customer customer = new Customer("aaa", "bbb");
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.put(url, customer);
	}
	
	private static void sendGetRequest() {
		RestTemplate restTemplate = new RestTemplate();
		Customer resp = restTemplate.getForObject("http://localhost:8080/customer/0", Customer.class);
		System.out.println("resp=" + resp);
	}
}
