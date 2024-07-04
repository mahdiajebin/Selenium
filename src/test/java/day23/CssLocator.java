package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {

    // CSS selector  tag-id (tag#id) tag-class(tag.classname)
    // tag-attribute (tag[attribute="value"], tag-class-attrubute (tag.classname[attribute = "value"]

    public static void main(String[] args) {
        //Locators
          /*
          id , name, linktext, partialLinktext
           */
        WebDriver driver = new ChromeDriver(); // open broswer
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize(); // maximize window

        //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");

        //driver.findElement(By.linkText("Search")).click();

        //tag attribute
       // driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirt");
        // Tag class and attribute
       // driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirt");
        //FIND SELECTOR USING https://chromewebstore.google.com/detail/selectorshub/ndgimibanhlabgdgjcpbbndiehljcpfh?hl=en&pli=1


    }
    }
