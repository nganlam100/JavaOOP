package JavaOOP3.testcases;

import JavaOOP3.common.BaseTest;
import JavaOOP3.common.Constants;

public class TestCase extends BaseTest {
    public static void main(String[] args) {
        TestCase testCases = new TestCase();
        testCases.login();
        System.out.println("=========================");
        testCases.addCategory();

    }

    public void login(){
        Constants.setBrowser("Edge");
        createDriver();
        System.out.println("Navigate to url https://cms.anhtester.com/login");
        System.out.println("Enter email and password");
        System.out.println("Click Login button");
        System.out.println("Verify redirect to Admin page");
        closeDriver();
    }

    public void addCategory(){
        Constants.setBrowser("Firefox");
        createDriver();
        System.out.println("Navigate to url https://cms.anhtester.com/login");
        System.out.println("Enter email and password");
        System.out.println("Click Login button");
        System.out.println("Verify redirect to Admin page");

        System.out.println("Clicks on the Products menu");
        System.out.println("Clicks on the Category menu");
        System.out.println("Clicks on the Add New category button");
        System.out.println("Enter all fields on the form create new category");
        System.out.println("Clicks on the Save button");
        System.out.println("Verify add New Category successfully");
        closeDriver();
    }
}
