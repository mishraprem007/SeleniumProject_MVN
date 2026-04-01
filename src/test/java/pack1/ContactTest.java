package pack1;

import java.io.IOException;

import org.testng.annotations.Test;

import Pack3_Utility.FileUtility;

public class ContactTest {
	FileUtility fLib = new FileUtility();

	@Test
	public void createcontactTest() {
		System.out.println("execute createcontactTest");
	}

	@Test
	public void modifycontactTest() throws IOException {
		System.out.println("execute modifycontactTest");
		String url = System.getProperty("url", fLib.readDatafromPropertyFile("url"));
		String browser = System.getProperty("browser", fLib.readDatafromPropertyFile("browser"));
		System.out.println(url);
		System.out.println(browser);

	}

	@Test
	public void deleteContactTest() {
		System.out.println("execute deletecontactTest");

	}

}
