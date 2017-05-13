package ComNopcommerce;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by KAVITA on 10/05/2017.
 * Load property file
 */
public class LoadProp extends BasePage {

    //static Properties properties;
   // static FileInputStream inputStream;

    public String getProperty(String key)
    {
        Properties properties = new Properties();
        try {
            FileInputStream inputStream= new FileInputStream("src/test/Resources/config.properties");
            properties.load(inputStream);
        }catch (Exception e)
        {
           e.fillInStackTrace();
        }
        return properties.getProperty(key);
    }
}
