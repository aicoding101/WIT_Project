import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.awt.font.TextHitInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ameer {
    public static void main(String[] args) throws InterruptedException{
        ScrollPage();
    }

    public static void ScrollPage() throws InterruptedException{
        CD.SetChromeDriver("https://disney.com/");
        CD.WaitTime(10);
        Thread.sleep(2000);
        CD.ScrollToElement("xpath", "//body//img[@alt='Disney Princess Videos']");
//        CD.ScrollToBottom();
        Thread.sleep(3000);
        String click = Keys.chord(Keys.CONTROL, Keys.ENTER);
        List<WebElement> listOfA = CD.driver.findElement(By.cssSelector("#ref-1-9 .bound.none.unstyled_entity")).findElements(By.tagName("a"));
        System.out.println(listOfA.size());
        for(WebElement w: listOfA){
            if(w.getAttribute("href").contains("disney.com/disney-princess")){
                w.sendKeys(click);
            }
        }
        Thread.sleep(2000);
        Set<String> windows = CD.driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parent = it.next();
        String child = it.next();
        Thread.sleep(2000);
        String anotherTabTitle =  CD.driver.switchTo().window(child).getTitle();
        System.out.println(anotherTabTitle);
        CD.driver.switchTo().window(parent);



//        WebElement pic = CD.driver.findElement(By.cssSelector("[src*='channelsquares_disneyprincess_ddt-16860_fbd67095']"));

//        pic.sendKeys(click);

        Thread.sleep(2000);
//        CD.CloseTab();
//        Thread.sleep(8000);
//        CD.WaitTime(10);
        CD.ThatsIt();
    }

}
