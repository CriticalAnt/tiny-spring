package cs.tao.tinyspring.context;

import cs.tao.tinyspring.BeanDefinition;
import cs.tao.tinyspring.factory.AbstractBeanFactory;
import cs.tao.tinyspring.factory.AutowireCapableBeanFactory;
import cs.tao.tinyspring.io.UrlResourceLoader;
import cs.tao.tinyspring.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * Created by wts on 2018/11/28.
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {

    private String configLocation;

    public ClassPathXmlApplicationContext(String configLocation) throws Exception {
        this(configLocation, new AutowireCapableBeanFactory());
    }

    public ClassPathXmlApplicationContext(String configLocation, AbstractBeanFactory beanFactory) throws Exception {
        super(beanFactory);
        this.configLocation = configLocation;
        refresh();
    }

    @Override
    public void refresh() throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new UrlResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions(configLocation);
        for (Map.Entry<String, BeanDefinition> entry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(entry.getKey(), entry.getValue());
        }
    }
}
