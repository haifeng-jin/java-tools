import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileLineAppender {
	public static void appendLine(String path, String line) {
		//line should not end with a '\n'
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(path, true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// true表示在文件末尾追加

		try {
			fos.write((line + "\n").getBytes());
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	public static void main(String[] args) {
//		appendLine("test", "a");
//	}
}
