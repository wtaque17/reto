package com.capsula.reto.busqueda.drivers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Chromedriver {

    public WebDriver driver;
    public static List<Chromedriver> listChromeDriver = new ArrayList<>();

    public static Chromedriver chrome(){
        ChromeOptions options = new ChromeOptions();
        //System.setProperty("webdriver.chrome.driver",".'src/test/resources/drivers/chromedriver.exe");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        listChromeDriver.add(new Chromedriver());
        listChromeDriver.get(listChromeDriver.size()-1).driver = new org.openqa.selenium.chrome.ChromeDriver(options);
        listChromeDriver.get(listChromeDriver.size()-1).driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return listChromeDriver.get(listChromeDriver.size()-1);
    }

    public WebDriver conURL (String url){
        driver.get(url);
        return listChromeDriver.get(listChromeDriver.size()-1).driver;
    }

}
