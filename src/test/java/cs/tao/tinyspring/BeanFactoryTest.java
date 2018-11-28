package cs.tao.tinyspring;

import cs.tao.tinyspring.context.ApplicationContext;
import cs.tao.tinyspring.context.ClassPathXmlApplicationContext;
import org.junit.Test;


public class BeanFactoryTest {

    @Test
    public void test() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tinyioc.xml");
        HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }
}
