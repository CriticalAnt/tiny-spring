package cs.tao.tinyspring.factory;

import cs.tao.tinyspring.BeanDefinition;
import cs.tao.tinyspring.BeanReference;
import cs.tao.tinyspring.PropertyValue;

import java.lang.reflect.Field;

/**
 * Created by wts on 2018/11/28.
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {


    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
        Object bean = Class.forName(beanDefinition.getBeanClassName()).newInstance();
        beanDefinition.setBean(bean);
        applyPropertyValues(bean, beanDefinition);
        return bean;
    }

    private void applyPropertyValues(Object bean, BeanDefinition beanDefinition) throws Exception {
        for (PropertyValue propertyValue : beanDefinition.getPropertyValues().getPropertyValues()) {
            Field field = bean.getClass().getDeclaredField(propertyValue.getName());
            field.setAccessible(true);
            Object value = propertyValue.getValue();
            if (value instanceof BeanReference) {
                BeanReference beanReference = (BeanReference) value;
                value = getBean(beanReference.getName());
            }
            field.set(bean, value);
        }
    }
}
