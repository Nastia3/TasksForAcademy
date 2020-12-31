import Model.ChildCompaniesItem;
import Model.Response;
import jsonUtill.JsonUtill;
import org.junit.Assert;
import org.junit.Test;

public class simpleTest {
    @Test
    public void  test1(){
        Response response = JsonUtill.toJava();
        System.out.println();

        ChildCompaniesItem testObject1 = new ChildCompaniesItem();
        ChildCompaniesItem testObject2 = new ChildCompaniesItem();

        testObject1.setName("Amazon");
        testObject1.setAddress("Amazon Address");
        testObject1.setPhone("123456");
        testObject1.setState("LA");

        testObject2.setName("Apple");
        testObject2.setAddress("Apple Address");
        testObject2.setPhone("3333333");
        testObject2.setState("LA");


        Assert.assertTrue(response.getManufacturers().getChildCompanies().contains(testObject1));
        Assert.assertFalse(response.getManufacturers().getChildCompanies().contains(testObject2));

    }



}
