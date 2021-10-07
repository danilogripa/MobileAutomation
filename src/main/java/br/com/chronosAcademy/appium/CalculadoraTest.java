package br.com.chronosAcademy.appium;

import io.appium.java_client.MobileBy;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.net.MalformedURLException;

public class CalculadoraTest {
    DriverFactory driverFactory;

    @BeforeEach
    public void Setup() throws MalformedURLException{
        driverFactory = new DriverFactory();
        driverFactory.setCapabilities("Android", "ChronosMobile", "uiautomator2",
                "com.android.calculator2", "com.android.calculator2.Calculator");
        driverFactory.setDriver();
    }

    @AfterEach
    public void TearDown(){
        driverFactory.getDriver().quit();
    }

    @Test
    public void validarMultiplicacao() {
        clickId("digit_7");
        clickId("op_mul");
        clickId("digit_9");
        clickId("eq");
        assertEquals("63", getText("result"));
    }

    @Test
    public void validarSoma(){
        clickId("digit_7");
        clickId("op_add");
        clickId("digit_9");
        clickId("eq");
        assertEquals("16", getText("result"));
    }

    @Test
    public void validarDivisao(){
        clickId("digit_9");
        clickId("op_div");
        clickId("digit_3");
        clickId("eq");
        assertEquals("3", getText("result"));
    }

    public void clickId(String id){
        driverFactory.getDriver().findElement(MobileBy.id(id)).click();
    }

    public String getText(String id){

        return driverFactory.getDriver().findElement(MobileBy.id(id)).getText();
    }
}
