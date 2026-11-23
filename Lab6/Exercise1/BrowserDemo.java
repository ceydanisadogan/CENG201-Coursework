public class BrowserDemo {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();

        browser.visit("google.com");
        browser.visit("youtube.com");
        browser.goBack();

        browser.visit("Facebook.com");
        browser.goBack();

        browser.goForward();

        browser.visit("stackoverflow.com");

        browser.displayCurrentPage();
        browser.displayHistory();
    }
}
