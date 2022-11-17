package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.stream.Stream;

public class MonsterMethods {

	private String searchUrl = ("https://api.open5e.com/monsters/?format=json&search=");
	private Random random = new Random();
	private String slug;
//	private File monsterList = new File("MonsterList.txt");

	public MonsterMethods() {
	}

	public URL toUrl(String u) throws MalformedURLException {
		String urlString = searchUrl + u;
		URL url = new URL(urlString);

		return url;
	}

	public int randomNum(int numCount) {
		int randomNum = random.nextInt(numCount + 1);

		return randomNum;
	}

	public String monsSlug() throws IOException {

		int r = random.nextInt(1470);

		try (BufferedReader br = new BufferedReader(new FileReader("MonsterList"))) {
			for (int i = 0; i < r; i++)
				br.readLine();
			slug = br.readLine();

		} catch (IOException e) {
			System.out.println(e);
		}
		return slug;
	}

}
