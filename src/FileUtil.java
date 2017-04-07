
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

	public static List<String> readFile(String path) throws IOException {
		List<String> lines = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(path)), "UTF8"));

		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			lines.add(line);
		}
		br.close();

		return lines;
	}

	public static List<String> readFile(String path, String encoding) throws IOException {
		List<String> lines = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(path)), encoding));

		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			lines.add(line);
		}
		br.close();

		return lines;
	}

	public static void writeFile(List<String> lines, String path) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF8"));
		for (String line : lines) {
			bw.write(line);
			bw.write("\n");
		}
		bw.close();
	}

	public static void writeFile(List<String> lines, String path, String encoding) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), encoding));
		for (String line : lines) {
			bw.write(line);
			bw.write("\n");
		}
		bw.close();
	}

}
