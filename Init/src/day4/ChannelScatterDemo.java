package day4;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelScatterDemo {
	public static void main(String[] args) throws IOException {
		
		RandomAccessFile f = new RandomAccessFile("c:\\a.txt", "r");
		System.out.println("HERE");
		FileChannel channel = f.getChannel();
		ByteBuffer[] buf = {ByteBuffer.allocate(48), ByteBuffer.allocate(48)};
		System.out.println("HERE");
		long numBytesRead = channel.read(buf);
		System.out.println("Num Bytes Read: " + numBytesRead);
		while(numBytesRead != -1) {
			
			for(int i=0;i<buf.length;i++) {
				ByteBuffer curBuf = buf[i];
				curBuf.flip();
				while(curBuf.hasRemaining()) {
					System.out.print(curBuf.get());
				}
			}
			numBytesRead = channel.read(buf);
			
		}
		
		
		
	}
}
