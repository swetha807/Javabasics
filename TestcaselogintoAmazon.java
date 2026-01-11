package package2;
class LaunchandQuit
{
	static void launchBrowser()
	{
		System.out.println("launching the browser");
	}
	static void closeBrowser()
	{
		System.out.println("closing the browser");
	}
}
public class TestcaselogintoAmazon extends LaunchandQuit
{
	static void testData()
	{
		System.out.println("test data");
	}
public static void main(String[] args) 
	{
	 launchBrowser();
	 closeBrowser();
	 testData();
	}
}

