package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators {

    //   public static void main(String[] args) {
    //Locators
          /*
          id , name, linktext, partialLinktext
           */
    //     WebDriver driver = new ChromeDriver(); // open broswer
    //    driver.get("https://demo.opencart.com/");
    //   driver.manage().window().maximize(); // maximize window
    //name
    // driver.findElement(By.name("search")).sendKeys("Mac"); // locate and send value
    // by ID
    // boolean  logodisplayedStatus = driver.findElement(By.id("logo")).isDisplayed();
    //    System.out.println(logodisplayedStatus);

    //by LinkedText -- text after the link or on the link
    // driver.findElement(By.linkText("Tablets")).click();
    // by Partial linltext..
    //   driver.findElement(By.partialLinkText("Table")).click();
    // TagName, class ( group of elements)

    //how many link in header
    // List<WebElement> headerLinks =  driver.findElements(By.className("list-inline-item"));
    //  System.out.println(  "size " + headerLinks.size());
    //tagname
    // List<WebElement> links = driver.findElements(By.tagName("a"));
    //  System.out.println("total number of links " + links.size());
    // CSS selector  tag-id (tag#id) tag-class(tag.classname)
    // tag-attribute (tag[attribute="value"], tag-class-attrubute (tag.classname[attribute = "value"]


    // }
}
