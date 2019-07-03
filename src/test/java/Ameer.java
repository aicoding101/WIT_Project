import org.openqa.selenium.JavascriptExecutor;

public class Ameer {
    public static void main(String[] args) throws InterruptedException{
        ScrollPage();
    }

    public static void ScrollPage() throws InterruptedException{
        CD.SetChromeDriver("https://disney.com/");
        CD.WaitTime(10);
        CD.ScrollPage(Integer.MAX_VALUE);
//        CD.ScrollToBottom();
        Thread.sleep(8000);
//        CD.WaitTime(10);
        CD.ThatsIt();
    }

}
