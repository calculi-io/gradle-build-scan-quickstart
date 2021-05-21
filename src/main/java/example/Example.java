package example;

import com.google.common.base.Joiner;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

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
            TTransport transport;

           transport = new TSocket("localhost", 9090);
           transport.open();

           TProtocol protocol = new TBinaryProtocol(transport);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return Joiner.on(' ').join(args);
    }

}
