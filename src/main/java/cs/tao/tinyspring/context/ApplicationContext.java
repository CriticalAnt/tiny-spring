package cs.tao.tinyspring.context;

import cs.tao.tinyspring.factory.BeanFactory;

/**
 * Created by wts on 2018/11/28.
 */
public interface ApplicationContext extends BeanFactory {

    void refresh() throws Exception;
}
