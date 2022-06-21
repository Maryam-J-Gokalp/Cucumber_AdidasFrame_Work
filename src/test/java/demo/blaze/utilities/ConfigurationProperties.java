package demo.blaze.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationProperties {

    private static Properties prop = new Properties();

    static {

        try{
            InputStream file = new FileInputStream("configuration.properties");
            prop.load(file);
            file.close();

        }catch (IOException e){
            System.out.println("There is some problem in the ConfigurationReader");
        }


    }

    public static String getProperty(String keyword){
        return prop.getProperty(keyword);
    }

}
