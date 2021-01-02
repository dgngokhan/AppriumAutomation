package com.automation;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
public class TestRunner {
    @Test
    public void calculatorTest() throws Exception {
        //desiredCapabilities.setCapability("platformName", "Android");
        //to specify test settings and required info about device and app under the test
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
        //for new apps - just use "app"
        //for pre-installed - "appPackage" and "appActivity"
        //address of appium server
        //localhost means that appium server is running on your computer
        //if, appium server launched on some other computer
        //specify IP/DNS address instead of localhost
        //4723 - default port number of appium server. Can be changed
        URL url = new URL("http://localhost:4723/wd/hub");
        AppiumDriver<AndroidElement> driver = new AndroidDriver<>(url, desiredCapabilities);
    }
}