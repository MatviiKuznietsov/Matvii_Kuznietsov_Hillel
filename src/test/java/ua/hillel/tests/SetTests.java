package ua.hillel.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SetTests {
    @Test(dataProvider = "userData", groups = "login", priority = 10)
    public void loginTest(String login, String roots, String password) {
        System.out.println("$Login test " + roots);
    }


    @Test(dependsOnGroups = "login", priority = 11)
    public void dependenceTest() {
        int[] dateOfMaking = {2022, 2023, 2025};
        for (int date : dateOfMaking)
            if (date == 2025) {
                throw new RuntimeException("ERROR DATE!!!");
            }
    }

    @Test(priority = 12)
    @Parameters({"param"})
    public void externalParam(String param) {
        System.out.println("externalParam " + param);
    }

    @DataProvider(name = "userData")
    public Object[][] userDataProvider() {
        Object[][] result = {
                {"Name1", "Admin", "111"},
                {"Name2", "Guest", "222"},
                {"Name3", "Editor", "333"}
        };
        return result;
    }
}
