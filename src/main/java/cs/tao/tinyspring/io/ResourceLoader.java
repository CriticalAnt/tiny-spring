package cs.tao.tinyspring.io;

/**
 * Created by wts on 2018/11/28.
 */
public interface ResourceLoader {

    Resource getResource(String location) throws Exception;
}
