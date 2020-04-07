package iie.cas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FileReadApplication {

	public static void main(String[] args) {
		System.setProperty("es.set.netty.runtime.available.processors", "false");
		SpringApplication.run(FileReadApplication.class, args);
	}

}
