import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ameer {
    public static void main(String[] args) throws InterruptedException{
        VideoChannelsVerification();
    }

    public static void VideoChannelsVerification() throws InterruptedException{

//        THIS METHOD WILL NAVIGATE TO VIDEO CHANNELS AND VERIFY IF EACH SELECTION IS DISPLAYED AND NAVIGATES TO THE CORRECT PAGE

        String linkCompare = "";
        int s = 1000;

        CD.SetChromeDriver("https://disney.com/");
        CD.MaximizeWindow();
        CD.WaitTime(5);

//        DISNEY PRINCESSES SELECTION
        CD.ScrollToElement("xpath", "//body//div//section[@id='ref-1-9']");
        System.out.println("Disney Princesses gif is displayed: " + CD.PassOrFail(CD.FindAndDisplay("xpath", "//body//div/a[@data-title='Disney Princess Videos']")));
        linkCompare = CD.driver.findElement(By.xpath("//body//div/a[@data-title='Disney Princess Videos']")).getAttribute("href");
        Thread.sleep(s);
        CD.FindAndClick("xpath", "//body//div/a[@data-title='Disney Princess Videos']");
        Thread.sleep(s);
        System.out.println("Disney Princesses link is valid: " + CD.PassOrFail(CD.driver.getCurrentUrl().equals(linkCompare)));
        CD.driver.navigate().back();
        Thread.sleep(s);

//        DISNEY PIXAR SELECTION
        CD.ScrollToElement("xpath", "//body//div//section[@id='ref-1-9']");
        System.out.println("Disney•Pixar gif is displayed: " + CD.PassOrFail(CD.FindAndDisplay("xpath", "//body//div/a[@data-title='Disney•Pixar']")));
        linkCompare = CD.driver.findElement(By.xpath("//body//div/a[@data-title='Disney•Pixar']")).getAttribute("href");
        Thread.sleep(s);
        CD.FindAndClick("xpath", "//body//div/a[@data-title='Disney•Pixar']");
        Thread.sleep(s);
        System.out.println("Disney•Pixar link is valid: " + CD.PassOrFail(CD.driver.getCurrentUrl().equals(linkCompare)));
        CD.driver.navigate().back();
        Thread.sleep(s);

//        OH MY DISNEY SELECTION
        CD.ScrollToElement("xpath", "//body//div//section[@id='ref-1-9']");
        System.out.println("Oh My Disney gif is displayed: " + CD.PassOrFail(CD.FindAndDisplay("xpath", "//body//div/a[@data-title='Oh My Disney']")));
        linkCompare = CD.driver.findElement(By.xpath("//body//div/a[@data-title='Oh My Disney']")).getAttribute("href");
        Thread.sleep(s);
        CD.FindAndClick("xpath", "//body//div/a[@data-title='Oh My Disney']");
        Thread.sleep(s);
        System.out.println("Oh My Disney link is valid: " + CD.PassOrFail(CD.driver.getCurrentUrl().equals(linkCompare)));
        CD.driver.navigate().back();
        Thread.sleep(s);

//        DISNEY STYLE SELECTION
        CD.ScrollToElement("xpath", "//body//div//section[@id='ref-1-9']");
        System.out.println("Disney Style gif is displayed: " + CD.PassOrFail(CD.FindAndDisplay("xpath", "//body//div/a[@data-title='Disney Style']")));
        linkCompare = CD.driver.findElement(By.xpath("//body//div/a[@data-title='Disney Style']")).getAttribute("href");
        Thread.sleep(s);
        CD.FindAndClick("xpath", "//body//div/a[@data-title='Disney Style']");
        Thread.sleep(s);
        System.out.println("Disney Style link is valid: " + CD.PassOrFail(CD.driver.getCurrentUrl().equals(linkCompare)));
        CD.driver.navigate().back();
        Thread.sleep(s);

//        RADIO DISNEY SELECTION
        CD.ScrollToElement("xpath", "//body//div//section[@id='ref-1-9']");
        CD.FindAndClick("xpath", "//body//div//section[@id='ref-1-9']//button[@title='Next']");
        System.out.println("Radio Disney gif is displayed: " + CD.PassOrFail(CD.FindAndDisplay("xpath", "//body//div/a[@data-title='Radio Disney']")));
        linkCompare = CD.driver.findElement(By.xpath("//body//div/a[@data-title='Radio Disney']")).getAttribute("href");
        Thread.sleep(s);
        CD.FindAndClick("xpath", "//body//div/a[@data-title='Radio Disney']");
        Thread.sleep(s);
        System.out.println("Radio Disney link is valid: " + CD.PassOrFail(CD.driver.getCurrentUrl().equals(linkCompare)));
        CD.driver.navigate().back();
        Thread.sleep(s);

//        DISNEY FAMILY SELECTION
        CD.ScrollToElement("xpath", "//body//div//section[@id='ref-1-9']");
        Thread.sleep(s);
        CD.FindAndClick("xpath", "//body//div//section[@id='ref-1-9']//button[@title='Next']");
        Thread.sleep(s);
        System.out.println("Disney Family gif is displayed: " + CD.PassOrFail(CD.FindAndDisplay("xpath", "//body//div/a[@data-title='Disney Family']")));
        linkCompare = CD.driver.findElement(By.xpath("//body//div/a[@data-title='Disney Family']")).getAttribute("href");
        Thread.sleep(s);
        CD.FindAndClick("xpath", "//body//div/a[@data-title='Disney Family']");
        Thread.sleep(s);
        System.out.println("Disney Family link is valid: " + CD.PassOrFail(CD.driver.getCurrentUrl().equals(linkCompare)));
        CD.driver.navigate().back();
        Thread.sleep(s);

//        STAR WARS SELECTION
        CD.ScrollToElement("xpath", "//body//div//section[@id='ref-1-9']");
        Thread.sleep(s);
        CD.FindAndClick("xpath", "//body//div//section[@id='ref-1-9']//button[@title='Next']");
        Thread.sleep(s);
        System.out.println("Star Wars gif is displayed: " + CD.PassOrFail(CD.FindAndDisplay("xpath", "//body//div/a[@data-title='Star Wars']")));
        linkCompare = CD.driver.findElement(By.xpath("//body//div/a[@data-title='Star Wars']")).getAttribute("href");
        Thread.sleep(s);
        CD.FindAndClick("xpath", "//body//div/a[@data-title='Star Wars']");
        Thread.sleep(s);
        System.out.println("Star Wars link is valid: " + CD.PassOrFail(CD.driver.getCurrentUrl().equals(linkCompare)));
        CD.driver.navigate().back();
        Thread.sleep(s);

//        DISNEY CHANNEL SELECTION
        CD.ScrollToElement("xpath", "//body//div//section[@id='ref-1-9']");
        Thread.sleep(s);
        CD.FindAndClick("xpath", "//body//div//section[@id='ref-1-9']//button[@title='Next']");
        Thread.sleep(s);
        System.out.println("Disney Channel gif is displayed: " + CD.PassOrFail(CD.FindAndDisplay("xpath", "//body//div/a[@data-title='Disney Channel']")));
        linkCompare = CD.driver.findElement(By.xpath("//body//div/a[@data-title='Disney Channel']")).getAttribute("href");
        Thread.sleep(s);
        CD.FindAndClick("xpath", "//body//div/a[@data-title='Disney Channel']");
        Thread.sleep(s);
        System.out.println("Disney Channel link is valid: " + CD.PassOrFail(CD.driver.getCurrentUrl().equals(linkCompare)));
        CD.driver.navigate().back();
        Thread.sleep(s);

//        MARVEL SELECTION
        CD.ScrollToElement("xpath", "//body//div//section[@id='ref-1-9']");
        Thread.sleep(s);
        CD.FindAndClick("xpath", "//body//div//section[@id='ref-1-9']//button[@title='Next']");
        Thread.sleep(s);
//        DOES NOT WORK ???
//        CD.FindAndClick("xpath", "//body//div//section[@id='ref-1-9']//button[@title='Next']");
        CD.FindAndClick("xpath", "//*[@id=\"ref-1-9\"]/div/div[2]/button[2]");
        Thread.sleep(s);
        System.out.println("Marvel gif is displayed: " + CD.PassOrFail(CD.FindAndDisplay("xpath", "//body//div/a[@data-title='Marvel']")));
        linkCompare = CD.driver.findElement(By.xpath("//body//div/a[@data-title='Marvel']")).getAttribute("href");
        Thread.sleep(s);
        CD.FindAndClick("xpath", "//body//div/a[@data-title='Marvel']");
        Thread.sleep(s);
        System.out.println("Marvel link is valid: " + CD.PassOrFail(CD.driver.getCurrentUrl().equals(linkCompare)));
        CD.driver.navigate().back();
        Thread.sleep(s);

        CD.ThatsIt();
    }

}