package groups;

import org.testng.annotations.Test;

public class groupsExample {
    private Integer counter = 0;

    @Test(groups = {"regression", "p1"})
    public void test1() throws Exception {
        System.out.println(++counter + " - testP1");
    }
    @Test(groups = {"regression", "p2"})
    public void test2() throws Exception {
        System.out.println(++counter + " - testP2");
    }
}
