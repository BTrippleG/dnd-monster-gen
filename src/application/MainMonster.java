package application;

import java.io.IOException;

public class MainMonster {

	public static void main(String[] args) throws IOException {
		// rename to correct format when finished testing
		MonsterParser parse = new MonsterParser();
		MonsterMethods methodTest = new MonsterMethods();

		// parse.testParser(); not working atm
		System.out.println(methodTest.toUrl(methodTest.monsSlug()));
	}

}
