package github.com.jrlcst.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import github.com.jrlcst.entities.Order;
import github.com.jrlcst.entities.User;
import github.com.jrlcst.entities.enu.OrderStatus;
import github.com.jrlcst.repositories.OrderRepository;
import github.com.jrlcst.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2022-05-26T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2022-05-25T03:42:10Z"), OrderStatus.WAITING_PAIMENT, u2);
		Order o3 = new Order(null, Instant.parse("2022-05-26T15:21:22Z"), OrderStatus.WAITING_PAIMENT,u1);
		
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
	
}
