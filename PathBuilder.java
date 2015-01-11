import java.io.File;

public class PathBuilder {

	public static void build(String path) {
		File file = new File(path);
		if (!file.exists()) {
			file.mkdirs();
		}
	}

}
