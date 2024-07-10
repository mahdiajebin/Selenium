package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.Set;

public class WebDriverMethods {

    // get methods
    //conditional methods
    // browser methods
    //navigational methods
    //wait methods

  //  public static void main(String[] args) throws InterruptedException {
        //Get methods
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        Thread.sleep(5000);
        //gets title of the url
//        System.out.println(driver.getTitle());
//        //get current url
//        System.out.println(driver.getCurrentUrl());
//
//        //get page sourse
//        System.out.println(driver.getPageSource());
//        //get windowhandle
//        String windowid = driver.getWindowHandle();
//        System.out.println("window ID " + windowid);
//
//        //get window handles - returns id of all open window
//            //--open new window
//        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
//
//        Set<String> windowIds= driver.getWindowHandles();
//        System.out.println(windowIds);

        //driver.quit();

        //// ------------Conditional Methods = access these commands through WebElements
        // returns boolean value
        //isDisplayed()
        //isEnabled()
        //isSelected()
      //  WebDriver driver = new ChromeDriver();
//        driver.get("https://demo.nopcommerce.com/register");
//        //  Thread.sleep(5000);
//
//        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//        System.out.println("Display status of logo" + logo.isDisplayed());
//
//        boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
//        System.out.println("Display status of logo" + status);
//
//        WebElement firstname = driver.findElement(By.xpath("//input[@id='FirstName']"));
//        System.out.println("is firstname field enabled " + firstname.isEnabled());
//
//        //isSelected
//        WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
//        WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));
//        //before selecting
//        System.out.println(male_rd.isSelected()); // false
//        System.out.println(female_rd.isSelected()); // false
//
//        //after selecting male
//        male_rd.click();
//        System.out.println(male_rd.isSelected()); //true
//        System.out.println(female_rd.isSelected()); // false
//
//        boolean newsletterstatus = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();

     //BROWSER Methods
        //close -single
        //quit() -- multiple windows

        //driver.quit();
        //https://testautomationpractice.blogspot.com/
        //
//        WebDriver driver = new ChromeDriver();
//      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//      String windowid= driver.getWindowHandle(); // one window id  --- set is for windowhandles
//      Thread.sleep(5000);
//      driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //new window
//         String windowid2= driver.getWindowHandle(); // one window id  --- set is for windowhandles
//        String title  = driver.getTitle();
//        String url = driver.getCurrentUrl();
//        Thread.sleep(5000);
//        System.out.println("title of the page " + title + url);
//
//         title  = driver.getTitle();
//        url = driver.getCurrentUrl();
//        System.out.println("title of the page " + title + url);
//        driver.quit();



 //   }
}