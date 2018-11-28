package cs.tao.tinyspring.io;

import java.net.URL;

/**
 * Created by wts on 2018/11/28.
 */
public class UrlResourceLoader implements ResourceLoader {

    @Override
    public Resource getResource(String location) {
        URL resource = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }
}
