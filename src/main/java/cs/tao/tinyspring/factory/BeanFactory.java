package cs.tao.tinyspring.factory;

/**
 * Created by wts on 2018/11/28.
 */
public interface BeanFactory {

    Object getBean(String name) throws Exception;
}
