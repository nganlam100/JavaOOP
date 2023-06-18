package com.nganlam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nganl\\IdeaProjects\\Selenium\\src\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://anhtester.com");

        //1 - Maximize browser của mình
        driver.manage().window().maximize();

        //2 - Đi đến 1 url

        driver.navigate().to("https://anhtester.com");

        //3 - Lấy Title và in ra console

        System.out.println(driver.getTitle());

        // Thoát hẳn Browser

        driver.quit();
    }
}
