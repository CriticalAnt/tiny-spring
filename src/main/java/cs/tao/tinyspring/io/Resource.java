package cs.tao.tinyspring.io;

import java.io.InputStream;

/**
 * Created by wts on 2018/11/28.
 */
public interface Resource {

    InputStream getInputStream() throws Exception;
}
