package cs.tao.tinyspring.context;

import cs.tao.tinyspring.factory.AbstractBeanFactory;

/**
 * Created by wts on 2018/11/28.
 */
public abstract class AbstractApplicationContext implements ApplicationContext {

    protected AbstractBeanFactory beanFactory;

    public AbstractApplicationContext(AbstractBeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    @Override
    public Object getBean(String name) throws Exception {
        return beanFactory.getBean(name);
    }
}
