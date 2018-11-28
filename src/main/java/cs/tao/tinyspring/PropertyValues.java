package cs.tao.tinyspring;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wts on 2018/11/28.
 */
public class PropertyValues {

    private List<PropertyValue> propertyValues = new ArrayList<PropertyValue>();

    public void addPropertyValue(PropertyValue pv) {
        propertyValues.add(pv);
    }

    public List<PropertyValue> getPropertyValues() {
        return propertyValues;
    }
}
