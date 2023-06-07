package hust.soict.dsai.garbage ;

public class GarbageCreator {
	String filename = "tet.exe";
	byte[] inputBytes = { 0 };
	long startTime, endTime ;
	
	inputBytes = Files.readAllbytes(Paths.get(filename));
	startTime = System.currentTimeMillis();
	String outputString  =  "";
	for (byte b : inputBytes) {
		outputString += (char)b;
	}
	endTime = System.currentTimeMillis();
	System.out.println(endTime - startTime);
}
