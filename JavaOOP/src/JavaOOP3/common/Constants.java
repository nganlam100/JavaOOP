package JavaOOP3.common;

public class Constants {
    public static String browser = "Chrome";
    public static Boolean report = true;
    public static Boolean headless = false;

    public static String getBrowser() {
        return browser;
    }

    public static void setBrowser(String browser) {
        Constants.browser = browser;
    }
}
