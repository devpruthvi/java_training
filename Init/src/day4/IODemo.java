package day4;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class IODemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile f = new RandomAccessFile("c:\\a.txt", "r");
		FileChannel fc = f.getChannel();
		ByteBuffer bb = ByteBuffer.allocate(48);
		int numBytesRead = fc.read(bb);
		
		while(numBytesRead != -1) {
			bb.flip();
			while(bb.hasRemaining()) {
				System.out.print((char)bb.get());
			}
			bb.compact();
			numBytesRead = fc.read(bb);
		}
		
		fc.close();
		f.close();
		
	}
}
