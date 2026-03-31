package pack1;

import org.testng.annotations.Test;

public class ContactTest {

	@Test
	public void createcontactTest() {
		System.out.println("execute createcontactTest");
	}

	@Test
	public void modifycontactTest() {
		System.out.println("execute modifycontactTest");
		String url = System.getProperty("url");
		String browser = System.getProperty("browser");
		System.out.println(url);
		System.out.println(browser);

	}

	@Test
	public void deleteContactTest() {
		System.out.println("execute deletecontactTest");

	}

}
