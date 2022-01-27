package depinj.nina.unittest;


import depinj.nina.service.NinaService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestService {

    private static final String NINA_ODELIUS = "Nina Odelius";

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:depinj-nina-service.xml");

    @Test
    public void testSpringWiring(){
        NinaService ninaService = (NinaService)applicationContext.getBean("service");
        List<String> students = ninaService.getStudents();
        Assert.assertEquals(NINA_ODELIUS, students.get(0));
    }

}
