package tax.fjgs.longyan.java8feature.chapter08;

import java.util.zip.Adler32;
import java.util.zip.CRC32;

public class ChecksumTest
{
	public static void main(String[] args) throws Exception
	{
		String str = "HELLO";
		byte[] data = str.getBytes("UTF-8");
		System.out.println("Adler32 and CRC32 checksums for " + str);

		Adler32 ad = new Adler32();
		ad.update(data);
		long adler32Checksum = ad.getValue();
		System.out.println("Adler32: " + adler32Checksum);

		CRC32 crc = new CRC32();
		crc.update(data);
		long crc32Checksum = crc.getValue();
		System.out.println("CRC32: " + crc32Checksum);
		/* 
		 * test git stash branch 
		 */
	}
}
