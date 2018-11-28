package cs.tao.tinyspring.io;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by wts on 2018/11/28.
 */
public class UrlResource implements Resource {

    private final URL url;

    public UrlResource(URL url) {
        this.url = url;
    }

    @Override
    public InputStream getInputStream() throws Exception {
        URLConnection urlConnection = url.openConnection();
        return urlConnection.getInputStream();
    }
}
