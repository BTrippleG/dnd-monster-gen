package application;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class MonsterParser {
	private int strength, dexterity, constituion, intelligents, wisdom, charisma;
	private String name, size, type, alignment;

	public MonsterParser() {

	}
	
	 //public <T> T fromJson(String json, Class<T> classOfT)
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void jsonparse() throws FileNotFoundException, IOException, ParseException {
		Object obj = new JSONParser().parse(new FileReader("\\DnDMonster\\RelatedFiles\\Monsters.json"));
		JSONObject jsonObject = (JSONObject) obj;

		JSONArray results = (JSONArray) jsonObject.get("results");

	}
	//Does not fully work
	public void testParser() throws IOException {
		URL url = new URL("https://api.open5e.com/monsters/?format=json&search=aatxe");
		Scanner scanner = null;
		scanner = new Scanner(url.openStream());

		String rawData = scanner.nextLine();
		System.out.println(rawData);

		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(rawData);// change to url all info is able to work
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray results = (JSONArray) jsonObject.get("results");// commented out
			// int j = results.

			// for (int i = 0; i < results.length(); i++) {

			// }

			// JSONObject resultsObj = (JSONObject) jsonObject.get("results"); - cant get
			// this to work as we need to 'bypass' the results to get the name
			String name = (String) jsonObject.get("name");
			String size = (String) jsonObject.get("size");
			System.out.println("Name: " + name);
			System.out.println("Size: " + size);
			/*
			 * System.out.println("legAction:"); Iterator iterator = legAction.iterator();
			 * while (iterator.hasNext()) { System.out.println(iterator.next()); }
			 */
		} catch (Exception e) {
			// System.out.println("name not found");
			e.printStackTrace();
		}

	}
}
