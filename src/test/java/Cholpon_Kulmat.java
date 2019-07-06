import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Cholpon_Kulmat {
    public static void main(String[] args) throws InterruptedException{
//        SelectAge();
//        ContactInfo();
//        OpenPhotoPage();
    }

    public static void SelectAge() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.disney.com/");
        if(driver.getCurrentUrl().contains("https://www.disney.com/")){
            System.out.println("Go to website verification PASSED!");
        }else {
            System.out.println("Go to website verification FAILED!");
        }

        Thread.sleep(2000);
        WebElement menu = driver.findElement(By.id("goc-button"));
        menu.click();
        if(menu.isDisplayed()){
            System.out.println("Menu displayed verification is PASSED!");
        }else{
            System.out.println("Menu displayed verification is FAILED!");
        }

        Thread.sleep(2000);
        WebElement aulani=driver.findElement(By.linkText("Aulani"));
        aulani.click();
        if(aulani.isDisplayed()){
            System.out.println("Click to Aulini page verification is PASSED!");
        }
        else {
            System.out.println("Click to Aulini page verification is FAILED!");
        }

        Thread.sleep(2000);
        WebElement adultcounter=driver.findElement(By.id("adult-counter"));
        if(adultcounter.getText().equals("1")){
            System.out.println("Adult counter default value verification is PASSED!");
        }else{
            System.out.println("Adult counter default value verification is FAILED!");
        }

        Thread.sleep(2000);
        WebElement plusSign=driver.findElement(By.xpath("//*[@id=\"WDWRooms_AulaniRoomOnlySQQProductOption_AulaniSQQPartyMix\"]/div[1]/div/button[2]"));
        plusSign.click();
        plusSign.click();
        plusSign.click();
        if(plusSign.isDisplayed()){
            System.out.println("Value increment verification is PASSED!");
        }else {
            System.out.println("Value increment verification is FAILED!");
        }

        Thread.sleep(2000);
        WebElement minus = driver.findElement(By.xpath("//*[@id=\"WDWRooms_AulaniRoomOnlySQQProductOption_AulaniSQQPartyMix\"]/div[1]/div/button[1]"));
        minus.click();
        if(minus.isDisplayed()){
            System.out.println("Value dicrement verification is PASSED!");
        }else{
            System.out.println("Value dicrement verification is FAILED!");
        }

        Thread.sleep(2000);
        WebElement children = driver.findElement(By.xpath("//*[@id='WDWRooms_AulaniRoomOnlySQQProductOption_AulaniSQQPartyMix']/div[2]/div/button[2]"));
        children.click();
        if(driver.getCurrentUrl().equals("https://www.disneyaulani.com/?DISCID=DI_flyawaynav_12")){
            System.out.println("Increment to childerns value verification is PASSED!");
        }else {
            System.out.println("Invrement to childerns value verification is FAILED!");
        }

        Thread.sleep(2000);
        WebElement dropBox= driver.findElement(By.id("WDWRooms_AulaniRoomOnlySQQProductOption_AulaniSQQPartyMix_child1"));
        dropBox.click();
        if(dropBox.isDisplayed()){
            System.out.println("Drop box verification is PASSED!");
        }
        else {
            System.out.println("Drop box verification is FAILED!");
        }

        Thread.sleep(2000);
        Select sel= new Select(dropBox);
        sel.selectByVisibleText("10");
        if(driver.getCurrentUrl().equals("https://www.disneyaulani.com/?DISCID=DI_flyawaynav_12")){
            System.out.println("Age select verification is PASSED!");
        }
        else {
            System.out.println("Age select verification is FAILED!");
        }

        Thread.sleep(3000);
        WebElement viewRates = driver.findElement(By.id("WDWRooms_AulaniRoomOnlySQQProductOption_Submit"));
        viewRates.click();
        if(viewRates.isDisplayed()){
            System.out.println("View Rates click verification is PASSED!");
        }
        else {
            System.out.println("View Rates click verification is FAILED!");
        }

    }

    public static void ContactInfo() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.disney.com/");
        WebElement menu = driver.findElement(By.id("goc-button"));
        menu.click();
        if (driver.getCurrentUrl().contains("https://www.disney.com/")) {
            System.out.println("Go to website verification PASSED!");
        } else {
            System.out.println("Go to website verification FAILED!");
        }

        WebElement aulani = driver.findElement(By.linkText("Aulani"));
        aulani.click();
        if (aulani.isDisplayed()) {
            System.out.println("Aulani select verification is PASSED!");
        } else {
            System.out.println("Aulani select verification is FAILED!");
        }

        Thread.sleep(1000);
        WebElement contactUs = driver.findElement(By.id("Aulani_Footer2_Questions_Contact_Us"));
        contactUs.click();
        if (driver.getCurrentUrl().equals("https://www.disneyaulani.com/about-aulani/contact-us/")) {
            System.out.println("Contact us select verification is PASSED!");
        } else {
            System.out.println("AContact us select verification is FAILED!");
        }


        Faker faker = new Faker();

        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.id("first_name"));
        firstName.sendKeys(faker.name().firstName());

        Thread.sleep(1000);
        WebElement lastName = driver.findElement(By.id("last_name"));
        lastName.sendKeys(faker.name().lastName());

        Thread.sleep(1000);
        WebElement email = driver.findElement(By.id("email_address"));
        email.sendKeys(faker.internet().emailAddress());

        Thread.sleep(1000);
        WebElement select = driver.findElement(By.id("subject"));
        select.click();

        Thread.sleep(1000);
        Select selectObj = new Select(select);
        selectObj.selectByVisibleText("Guest Information");

        Thread.sleep(1000);
        WebElement sendMessage = driver.findElement(By.id("your_question"));
        sendMessage.sendKeys("Hello, Could you please tell me how much cost cruise trip for one week?,Thank You!");

        Thread.sleep(1000);
        WebElement send = driver.findElement(By.id("go_submit"));
        send.click();
        if(driver.getCurrentUrl().equals("https://www.disneyaulani.com/about-aulani/contact-us/?form=complete&url=home")){
            System.out.println("Message send verifaication PASSED!");
        }
        else {
            System.out.println("Message send verifaication FAILED!");
        }
        driver.quit();

    }

    public static void OpenPhotoPage() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.disney.com/");
        WebElement menu = driver.findElement(By.id("goc-button"));
        menu.click();
        if(driver.getCurrentUrl().contains("https://www.disney.com/")){
            System.out.println("Go to website verification PASSED!");
        }else {
            System.out.println("Go to website verification FAILED!");
        }

        Thread.sleep(2000);
        WebElement aulani = driver.findElement(By.linkText("Aulani"));
        aulani.click();
        if (aulani.isDisplayed()) {
            System.out.println("Aulani select verification is PASSED!");
        }
        else {
            System.out.println("Aulani select verification is FAILED!");
        }

        Thread.sleep(2000);
        WebElement roomsAndoffers = driver.findElement(By.id("Rooms&Offers"));
        roomsAndoffers.click();
        if(driver.getCurrentUrl().equals("https://www.disneyaulani.com/rooms-offers/")){
            System.out.println("Rooms and Offers click verification is PASSED!");
        }
        else{
            System.out.println("Rooms and Offers click verification is FAILED!");
        }
        Thread.sleep(2000);
        WebElement photo = driver.findElement(By.id("launchWDW_Rooms_FloorplanImages_IslandGardensView"));
        photo.click();
        if (photo.isDisplayed()) {
            System.out.println("Photo verification PASSED");
        } else {
            System.out.println("Photo verification FAILED");
        }

        Thread.sleep(2000);
        WebElement next = driver.findElement(By.xpath("//div[@class='select-toggle hoverable']"));
        next.click();
        if(next.isDisplayed()){
            System.out.println("Next button click verification PASSED!");
        }
        else {
            System.out.println("Next button click verification FAILED!");
        }

        Thread.sleep(200);
        WebElement maximize = driver.findElement(By.xpath("//a[@class='fullscreenButton']"));
        maximize.click();
        if (maximize.isDisplayed()) {
            System.out.println("Screen maximize verification is PASSED!");
        } else {
            System.out.println("Screen maximize verification is FAILED!");
        }

        Thread.sleep(2000);
        WebElement nextPicture = driver.findElement(By.xpath("//a[@class='carouselNext']"));
        nextPicture.click();
        Thread.sleep(1000);
        nextPicture.click();
        Thread.sleep(1000);
        nextPicture.click();
        Thread.sleep(1000);
        nextPicture.click();
        Thread.sleep(1000);
        nextPicture.click();
        if(nextPicture.isDisplayed()){
            System.out.println("Clicking to next picture clickable verification is PASSED!");

        }else{
            System.out.println("Clicking to next picture clickable verification is FAILED!");
        }

        Thread.sleep(1000);
        WebElement minimize = driver.findElement(By.xpath("//a[@class='fullscreenButton enabled']"));
        minimize.click();
        if (minimize.isDisplayed()) {
            System.out.println("Screen minimize verification is PASSED!");
        } else {
            System.out.println("Screen minimize verification is FAILED!");
        }

        Thread.sleep(1000);
        WebElement closeScreen = driver.findElement(By.xpath("//a[@class='mediaEngineCloseBtn']"));
        closeScreen.click();
        if(driver.getCurrentUrl().equals("https://www.disneyaulani.com/rooms-offers/")){
            System.out.println("Close screen verification is PASSED!");
        }
        else {
            System.out.println("Close screen verification is FAILED!");
        }
        driver.quit();
    }

}
