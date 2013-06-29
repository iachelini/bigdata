package ch.iachelini.log.pail.internal;

import java.io.IOException;

import com.backtype.hadoop.pail.Pail;

public class PailIO {

	public void doPail() throws IOException {
		final Pail<?> pail = Pail.create("/tmp/mypail");
		final Pail<?>.TypedRecordOutputStream os = pail.openWrite();
		os.writeObject(new byte[] { 1, 2, 3 });
		os.writeObject(new byte[] { 1, 2, 3, 4 });
		os.writeObject(new byte[] { 1, 2, 3, 4, 5 });
		os.close();
	}
}
