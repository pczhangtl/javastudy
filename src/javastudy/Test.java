package javastudy;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		System.out.println(System.getenv());
		File[] hiddenFiles = new File(".").listFiles(File::isHidden);
		System.out.print(hiddenFiles.length);
		for (File file : hiddenFiles) {
			System.out.println(file.getAbsoluteFile());
		}
	}
}
