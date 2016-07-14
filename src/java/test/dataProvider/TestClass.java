package dataProvider;

import org.testng.annotations.Test;

public class TestClass {
    private Integer counter = 0;

    @Test(dataProvider = "demoDataProvider",
            dataProviderClass = DataProviderClass.class)
    public void testDataProvider(String login, String password) throws Exception {
        LoginEngine loginEngine = new LoginEngine();
        loginEngine.loginUser(login,password);

        System.out.println(++counter + " run by dataProvider");
    }
}
