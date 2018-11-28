package cs.tao.tinyspring;

import cs.tao.tinyspring.io.ResourceLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by wts on 2018/11/28.
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private Map<String, BeanDefinition> registry = new ConcurrentHashMap<String, BeanDefinition>();
    private List<String> beanDefinitionNames = new ArrayList<String>();

    private ResourceLoader resourceLoader;

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        registry.put(name, beanDefinition);
        beanDefinitionNames.add(name);
    }


    public Map<String, BeanDefinition> getRegistry() {
        return registry;
    }

    public List<String> getBeanDefinitionNames() {
        return beanDefinitionNames;
    }
}
