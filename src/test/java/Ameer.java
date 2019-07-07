import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ameer {
    public static void main(String[] args) throws InterruptedException{
//        WEBSITE: DISNEY.COM
        AvdentureTime();
//        ParksAndTravelDropdownVerification();
//        VideoChannelsVerification();

    }

    public static void AvdentureTime() throws InterruptedException{
        int s = 1000;

        CD.SetChromeDriver("http://disney.com");
        CD.MaximizeWindow();
        CD.WaitTime(15);

//        NAVIGATES TO ADVENTURES BY DISNEY
        CD.MoveToElement("xpath", "//div//span/li[@class='goc-desktop goc-parks goc-top-dropdown goc-left-2']");
        CD.FindAndClick("xpath", "//div//div//span//span/span/a[@title='Adventures by Disney']");
//

//        FIND YOUR TRIP HERE SELECTION AREA

//        DESTINATIONS
        CD.FindAndClick("xpath", "//div//section//h2[contains(text(), \"Destinations\")]");
        System.out.println("Destinations is displayed: " + CD.PassOrFail(!CD.FindAndDisplay("xpath", "//h2[contains(text(), \"Destinations\")]")));
        CD.FindAndClick("xpath", "//main//section//div//section//span[@class='NorthAmerica ']");
        CD.FindAndClick("xpath", "//div//section//h2[contains(text(), \"Destinations\")]");
        System.out.println("North America is selected: " + CD.PassOrFail(CD.FindAndDisplay("xpath", "//body//main//*[@id=\"destinations-filter-group\"]/p[contains(text(), \"North America\")]")));
//

//        DEPARTURE DATES
        System.out.println("Departure Dates is displayed: " + CD.PassOrFail(CD.FindAndDisplay("xpath", "//body//main//section//div//section//h2[contains(text(), \"Departure Dates\")]")));
        CD.FindAndClick("xpath", "//body//main//section//div//section//h2[contains(text(), \"Departure Dates\")]");
        CD.FindAndClick("xpath", "//body//main//section//span[contains(text(), \"Sep\")]");
        CD.FindAndDisplay("xpath", "//body//main//section//div//section[@id='dates-filter-group']");
        System.out.println("Sep is selected: " + CD.PassOrFail(!CD.FindAndDisplay("xpath", "//body//main//*[@id=\"dates-filter-group\"]/p[contains(text(), \"Sep\")]")));
//

//        TRIP TYPES
        System.out.println("Trip Types is displayed: " + CD.PassOrFail(CD.FindAndDisplay("xpath", "//body//div//section//h2[contains(text(), \"Trip Types\")]")));
        CD.FindAndClick("xpath", "//body//main//section//div//section//h2[contains(text(), \"Trip Types\")]");
        CD.FindAndClick("xpath", "//body//main//section//div//section//span[contains(text(), \"Escapes\")]");
        CD.FindAndClick("xpath", "//body//main//section//div//section//h2[contains(text(), \"Trip Types\")]");
        System.out.println("Escapes is selected: " + CD.PassOrFail(CD.FindAndDisplay("xpath", "//*[@id=\"types-filter-group\"]/p[contains(text(), \"Escapes\")]")));
//
        CD.FindAndClick("xpath", "//body//main//section//a[@class='default-btn ts-filters-btn']");
        System.out.println("There are 3 results: " + CD.PassOrFail(CD.driver.findElement(By.xpath("//body//main//section//div//span[@class='count']")).getText().equals("3")));
//


        CD.Done();

    }

    public static void ParksAndTravelDropdownVerification() throws InterruptedException{
        String linkCompare = "";
        int s = 1500;

        CD.SetChromeDriver("https://disney.com/");
        CD.MaximizeWindow();
        CD.WaitTime(5);

        Thread.sleep(s);

//        CD.MoveToElement("xpath", "//body//div//span/li[@class='goc-desktop goc-parks goc-top-dropdown goc-left-2']");
//        CD.MoveToElement("xpath", "//*[@id=\"goc-bar-left\"]/li[3]/a");

        CD.MoveToElement("xpath", "//body//div//span/li[@class='goc-desktop goc-parks goc-top-dropdown goc-left-2']");

//        START DISPLAY VERIFICATION
        System.out.println("Verify if the following are displayed:");
        System.out.println("Walt Disney World Resort: " + CD.PassOrFail(CD.FindAndDisplay("xpath", "//body//div//div//span//span/span/a[@title='Walt Disney World Resort']")));
        System.out.println("Disneyland Resort: " + CD.PassOrFail(CD.FindAndDisplay("xpath", "//body//div//div//span//span/span/a[@title='Disneyland Resort']")));
        System.out.println("Disney Cruise Line: " + CD.PassOrFail(CD.FindAndDisplay("xpath", "//body//div//div//span//span/span/a[@title='Disney Cruise Line']")));
        System.out.println("Aulani - A Disney Resort and Spa: " + CD.PassOrFail(CD.FindAndDisplay("xpath", "//body//div//div//span//span/span/a[@title='Aulani - A Disney Resort and Spa']")));
        System.out.println("Adventures by Disney: " + CD.PassOrFail(CD.FindAndDisplay("xpath", "//body//div//div//span//span/span/a[@title='Adventures by Disney']")));
        System.out.println("Disney Vacation Club: " + CD.PassOrFail(CD.FindAndDisplay("xpath", "//body//div//div//span//span/span/a[@title='Disney Vacation Club']")));
//        END DISPLAY VERIFICATION

        System.out.println();

//        START LINK VERIFICATION
        System.out.println("Verify if the following links are valid:");
        linkCompare = CD.driver.findElement(By.xpath("//body//div//div//span//span/span/a[@title='Walt Disney World Resort']")).getAttribute("href");
        CD.FindAndClick("xpath", "//body//div//div//span//span/span/a[@title='Walt Disney World Resort']");
        Thread.sleep(s);
        System.out.println("Parks & Travel: Walt Disney World Resort: " + CD.PassOrFail(CD.driver.getCurrentUrl().equals(linkCompare)));
        CD.Back();
        Thread.sleep(s);
        CD.MoveToElement("xpath", "//body//div//span/li[@class='goc-desktop goc-parks goc-top-dropdown goc-left-2']");

        linkCompare = CD.driver.findElement(By.xpath("//body//div//div//span//span/span/a[@title='Disneyland Resort']")).getAttribute("href");
        CD.FindAndClick("xpath", "//body//div//div//span//span/span/a[@title='Disneyland Resort']");
        Thread.sleep(s);
        System.out.println("Parks & Travel: Disneyland Resort: " + CD.PassOrFail(CD.driver.getCurrentUrl().equals(linkCompare)));
        CD.Back();
        Thread.sleep(s);
        CD.MoveToElement("xpath", "//body//div//span/li[@class='goc-desktop goc-parks goc-top-dropdown goc-left-2']");

        linkCompare = CD.driver.findElement(By.xpath("//body//div//div//span//span/span/a[@title='Disney Cruise Line']")).getAttribute("href");
        CD.FindAndClick("xpath", "//body//div//div//span//span/span/a[@title='Disney Cruise Line']");
        Thread.sleep(s);
        System.out.println("Parks & Travel: Disney Cruise Line: " + CD.PassOrFail(CD.driver.getCurrentUrl().equals(linkCompare)));
        CD.Back();
        Thread.sleep(s);
        CD.MoveToElement("xpath", "//body//div//span/li[@class='goc-desktop goc-parks goc-top-dropdown goc-left-2']");

        linkCompare = CD.driver.findElement(By.xpath("//body//div//div//span//span/span/a[@title='Aulani - A Disney Resort and Spa']")).getAttribute("href");
        CD.FindAndClick("xpath", "//body//div//div//span//span/span/a[@title='Aulani - A Disney Resort and Spa']");
        Thread.sleep(s);
        System.out.println("Parks & Travel: Aulani - A Disney Resort and Spa: " + CD.PassOrFail(CD.driver.getCurrentUrl().equals(linkCompare)));
        CD.Back();
        Thread.sleep(s);
        CD.MoveToElement("xpath", "//body//div//span/li[@class='goc-desktop goc-parks goc-top-dropdown goc-left-2']");

        linkCompare = CD.driver.findElement(By.xpath("//body//div//div//span//span/span/a[@title='Adventures by Disney']")).getAttribute("href");
        CD.FindAndClick("xpath", "//body//div//div//span//span/span/a[@title='Adventures by Disney']");
        Thread.sleep(s);
        System.out.println("Parks & Travel: Adventures by Disney: " + CD.PassOrFail(CD.driver.getCurrentUrl().equals(linkCompare)));
        CD.Back();
        Thread.sleep(s);
        CD.MoveToElement("xpath", "//body//div//span/li[@class='goc-desktop goc-parks goc-top-dropdown goc-left-2']");

        linkCompare = CD.driver.findElement(By.xpath("//body//div//div//span//span/span/a[@title='Disney Vacation Club']")).getAttribute("href");
        CD.FindAndClick("xpath", "//body//div//div//span//span/span/a[@title='Disney Vacation Club']");
        System.out.println("Parks & Travel: Disney Vacation Club: " + CD.PassOrFail(CD.driver.getCurrentUrl().equals(linkCompare)));
        Thread.sleep(s);
//        END LINK VERIFICATION


        CD.ThatsIt();

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
        CD.Back();
        Thread.sleep(s);

//        DISNEY PIXAR SELECTION
        CD.ScrollToElement("xpath", "//body//div//section[@id='ref-1-9']");
        System.out.println("Disney•Pixar gif is displayed: " + CD.PassOrFail(CD.FindAndDisplay("xpath", "//body//div/a[@data-title='Disney•Pixar']")));
        linkCompare = CD.driver.findElement(By.xpath("//body//div/a[@data-title='Disney•Pixar']")).getAttribute("href");
        Thread.sleep(s);
        CD.FindAndClick("xpath", "//body//div/a[@data-title='Disney•Pixar']");
        Thread.sleep(s);
        System.out.println("Disney•Pixar link is valid: " + CD.PassOrFail(CD.driver.getCurrentUrl().equals(linkCompare)));
        CD.Back();
        Thread.sleep(s);

//        OH MY DISNEY SELECTION
        CD.ScrollToElement("xpath", "//body//div//section[@id='ref-1-9']");
        System.out.println("Oh My Disney gif is displayed: " + CD.PassOrFail(CD.FindAndDisplay("xpath", "//body//div/a[@data-title='Oh My Disney']")));
        linkCompare = CD.driver.findElement(By.xpath("//body//div/a[@data-title='Oh My Disney']")).getAttribute("href");
        Thread.sleep(s);
        CD.FindAndClick("xpath", "//body//div/a[@data-title='Oh My Disney']");
        Thread.sleep(s);
        System.out.println("Oh My Disney link is valid: " + CD.PassOrFail(CD.driver.getCurrentUrl().equals(linkCompare)));
        CD.Back();
        Thread.sleep(s);

//        DISNEY STYLE SELECTION
        CD.ScrollToElement("xpath", "//body//div//section[@id='ref-1-9']");
        System.out.println("Disney Style gif is displayed: " + CD.PassOrFail(CD.FindAndDisplay("xpath", "//body//div/a[@data-title='Disney Style']")));
        linkCompare = CD.driver.findElement(By.xpath("//body//div/a[@data-title='Disney Style']")).getAttribute("href");
        Thread.sleep(s);
        CD.FindAndClick("xpath", "//body//div/a[@data-title='Disney Style']");
        Thread.sleep(s);
        System.out.println("Disney Style link is valid: " + CD.PassOrFail(CD.driver.getCurrentUrl().equals(linkCompare)));
        CD.Back();
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
        CD.Back();
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
        CD.Back();
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
        CD.Back();
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
        CD.Back();
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
        CD.Back();
        Thread.sleep(s);

        CD.ThatsIt();
    }

}