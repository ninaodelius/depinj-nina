package depinj.nina.unittest;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:depinj-nina-service.xml");
}
