import Model.Response;
import jsonUtill.JsonUtill;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;


public class simpleTest {
    @Test
    public void  test1(){
        Response response= new JsonUtill().toJava();
        System.out.println();
        Assert.assertTrue(doesObjectContainField(response.getManufacturers().getChildCompanies(),"google"));
        Assert.assertFalse(doesObjectContainField(response.getManufacturers().getChildCompanies(),"apple"));


    }
    public boolean doesObjectContainField(Object object, String fieldName) {
        Class<?> objectClass = object.getClass();
        for (Field field : objectClass.getDeclaredFields()) {
            if (field.getName().equals(fieldName)) {
                return true;
            }
        }
        return false;
    }
}
