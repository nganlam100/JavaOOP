package JavaOOP3.common;

public class BaseTest {
    public void createDriver(){
        System.out.println("Open Driver" + Constants.getBrowser());
    }

    public void closeDriver(){
        System.out.println("Close Driver" + Constants.getBrowser());
    }
}
