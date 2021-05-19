package example;

import com.google.common.base.Joiner;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Example {

    public static String join(String... args) {
        try {
            InputStream is = new InputStream() {
                @Override
                public int read() throws IOException {
                    return 0;
                }
            };
            ObjectInputStream ois = new ObjectInputStream(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return Joiner.on(' ').join(args);
    }

}
