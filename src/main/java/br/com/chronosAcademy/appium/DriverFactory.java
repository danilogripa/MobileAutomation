package br.com.chronosAcademy.appium;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {
    private DesiredCapabilities capabilities;

    public void setCapabilities(String plataform, String device, String automation,
                                String appPackage, String appActivity){
        capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, plataform);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, automation);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, appPackage);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, appActivity);
    }

}
