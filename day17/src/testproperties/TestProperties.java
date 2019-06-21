package testproperties;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Set;

public class TestProperties {

	public static void main(String[] args) {

		Properties poper = new Properties();

		InputStream io = TestProperties.class.getResourceAsStream("myFile.properties");
		InputStreamReader r = new  InputStreamReader(io);
		try {
			poper.load(r);
			print(poper);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void print(Properties s) {
		Set<String> keys = s.stringPropertyNames();
		keys.stream().forEach(key -> {
			String vule = s.getProperty(key);
			System.out.println(vule);
		});
	}

}
