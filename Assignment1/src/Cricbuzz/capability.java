package Cricbuzz;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class capability {

			public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
			//when I am running  my program on a remote device
			//remote device is my emulator
			//i want to check,do my emulator has this capabilities
			
			DesiredCapabilities cap =new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Harini");
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			//this is not mandatory,even if I remove this it will work//but for ios this is mandatory,it will not work if u dont specify the automation name
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
			//first test will be on web app
			cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
			//there are specific capabilities
			cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\Users\\HariniKantheti\\Desktop\\SDET training\\Appium Training\\chromedriver_win32\\chromedriver.exe"	);
		//To open a browser in my local machine
			//WebDriver driver=new ChromeDriver();
			//To open browser in my remote machine
			AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
						return driver;
		
		
		}
	}


