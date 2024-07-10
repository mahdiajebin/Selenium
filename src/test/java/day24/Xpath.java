package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

    //Absolute Xpath
    //ex /html/body/header/div/div[2]/div/input--tagname
    //relative xpath
    // //*[@id="search"] --attribute
    ////*[@id="narbar-menu"]/ul/li[4]/a
//    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demo.opencart.com/");
//        driver.manage().window().maximize();
//        //Xpath with single attribute
//        driver.findElement(By.xpath("//*[@id'=narbar-menu']/ul/li[4]/a")).click();
//
//        //Xpath with multiple attribute
//        driver.findElement(By.xpath("//input[@placeholder='Search'][@placeholder='Search']")).sendKeys("T-shirts");
//       //and or
//        driver.findElement(By.xpath("//input[@placeholder='Search' or @placeholder='Search']")).sendKeys("T-shirts");
//
//       //Xpath with inner Text
//        driver.findElement(By.xpath("//*text()='MacBook']")).click();
//
//        boolean displayedStatus = driver.findElement(By.xpath("//*text()='Featured']")).isDisplayed();
//        System.out.println(displayedStatus);
//
//        String value =  driver.findElement(By.xpath("//*text()='Featured']")).getText();
//
//        System.out.println(value);
//        //xpath with contains()
//
//        driver.findElement(By.xpath("//input[contains(@placeholder,'Search'")).sendKeys("T-shirt");
//        //starts-with
//        //handling dynamic attributes
//
//        // *//[@id='start' or @id = 'stop']
//        // *//[contains{@id,'st')]
//        // *[starts-with{@id,'st')]
//
//        /// --chained xpath (combination of relative and absolute xpath
//
//
//        //div[@id='logo']/a/img
//        //  div[contains(text(),'')];
//
//
//    }


}
