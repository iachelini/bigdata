import java.io.IOException;

import org.apache.hadoop.conf.Configuration;

import com.backtype.hadoop.pail.Pail;


public class PailTool {
	public static void main(String[] args) throws IOException {
		Configuration c;
		Pail<?> pail = Pail.create("/pail/rcsd");
		Pail<?>.TypedRecordOutputStream os = pail.openWrite();
		os.writeObject(new byte[] {1, 2, 3});
		os.writeObject(new byte[] {1, 2, 3, 4});
		os.writeObject(new byte[] {1, 2, 3, 4, 5});
		os.close();
		}
}
