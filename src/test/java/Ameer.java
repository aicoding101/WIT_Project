public class Ameer {
    public static void main(String[] args) {
        CD.ScrollPage(2000);
    }

    public static void ScrollPage(){
        CD.SetChromeDriver("https://disney.com/");
        CD.WaitTime(10);
        CD.ScrollPage(2000);
        CD.WaitTime(10);
//        CD.ThatsIt();
    }

}
