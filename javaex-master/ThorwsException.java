package exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThorwsException {
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {
		//ThrowsException test = new ThrowExption();
	}

}
