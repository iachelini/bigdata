package ch.iachelini.pail.internal;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import ch.iachelini.pail.internal.model.Login;
import ch.iachelini.pail.internal.model.structure.LoginPailStructure;
import ch.iachelini.pail.internal.model.structure.PartitionedLoginPailStructure;

import com.backtype.hadoop.pail.Pail;
import com.backtype.hadoop.pail.PailSpec;
import com.backtype.hadoop.pail.SequenceFileFormat;

public class PailIO {

	private static final String TMP_LOGINS = "/tmp/logins";

	public void doPail() throws IOException {
		final Pail<?> pail = Pail.create("/tmp/mypail");
		final Pail<?>.TypedRecordOutputStream os = pail.openWrite();
		os.writeObject(new byte[] { 1, 2, 3 });
		os.writeObject(new byte[] { 1, 2, 3, 4 });
		os.writeObject(new byte[] { 1, 2, 3, 4, 5 });
		os.close();
	}

	public void writeLogins() throws IOException {
		// FIXME: Fix generic issues
		@SuppressWarnings("unchecked")
		Pail<Login> loginPail = Pail.create(TMP_LOGINS,
				new LoginPailStructure());
		Pail<Login>.TypedRecordOutputStream out = loginPail.openWrite();
		out.writeObject(new Login("alex", 1352679231));
		out.writeObject(new Login("bob", 1352674216));
		out.close();
	}

	public void readLogins() throws IOException {
		Pail<Login> loginPail = new Pail<Login>(TMP_LOGINS);
		for (Login l : loginPail) {
			System.out.println(l.userName + " " + l.loginUnixTime);
		}
	}

	public void appendData() throws IOException {
		Pail<Login> loginPail = new Pail<Login>(TMP_LOGINS);
		Pail<Login> updatePail = new Pail<Login>("/tmp/updates");
		loginPail.absorb(updatePail);
	}

	public void partitionData() throws IOException {
		Pail<Login> pail = Pail.create("/tmp/partitioned_logins",
				new PartitionedLoginPailStructure());
		Pail<Login>.TypedRecordOutputStream os = pail.openWrite();
		os.writeObject(new Login("chris", 1352702020));
		os.writeObject(new Login("david", 1352788472));
		os.close();
	}

	public void createCompressedPail() throws IOException {
		Map<String, Object> options = new HashMap<String, Object>();
		
		options.put(//
				SequenceFileFormat.CODEC_ARG, SequenceFileFormat.CODEC_ARG_GZIP);
		options.put(//
				SequenceFileFormat.TYPE_ARG, SequenceFileFormat.TYPE_ARG_BLOCK);
		
		LoginPailStructure struct = new LoginPailStructure();
		Pail compressed = Pail.create("/tmp/compressed", new PailSpec(
				"SequenceFile", options, struct));
		
		// TODO: Now use the comressed Pail...
	}
}