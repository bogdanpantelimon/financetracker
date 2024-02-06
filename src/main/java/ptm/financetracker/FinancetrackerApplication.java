package ptm.financetracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages = {"ptm.financetracker.repository"})
@SpringBootApplication
public class FinancetrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancetrackerApplication.class, args);
	}

}
