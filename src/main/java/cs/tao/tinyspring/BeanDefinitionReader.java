package cs.tao.tinyspring;

/**
 * Created by wts on 2018/11/28.
 */
public interface BeanDefinitionReader {

    void loadBeanDefinitions(String configLocation) throws Exception;
}
