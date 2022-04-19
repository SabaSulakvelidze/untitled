import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {


        @DataProvider
        public Object[][] dpMethod(){
            return new Object[][] {{1, 7 , 3}, {2, 12, 14}};
        }

        @Test(dataProvider = "dpMethod")
        public void myTest (int a, int b, int result) {
            int sum = a + b;
            Assert.assertEquals(result, sum);

    }
}
