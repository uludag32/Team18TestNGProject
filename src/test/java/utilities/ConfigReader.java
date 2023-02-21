package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    //    Bu sinif configuration.properties file i okumak icin kullanilir
//    property file i okumak icin properti objecsi kullanilir
    //This class reads the configuration.properties file
    //Create Properties instance
    private static Properties properties;
    static {
        //    static block : ilk calisir
        //path of the configuration file
        String path="configuration.properties";
        try {
            //configuration.property dosyasini acar
            //Opening configuration.properties file using FileInputStream
            FileInputStream fileInputStream = new FileInputStream(path);
            //properties objesini instantiate ediyoruz
            properties = new Properties();
            //configuration.property dosyasindaki datalari yukler
            properties.load(fileInputStream);
            //file input stream kapatilir
            //close the file
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //ConfigReader.getProperty("browser"); -> chrome
    //ConfigReader.getProperty("amazon_url"); -> https://www.amazon.com
    //ConfigReader.getProperty("username"); -> ali
    //This method will get the key from properties file,
    //And return the value as String
    //We create this method to read the file
    public static String getProperty(String key){
        String value=properties.getProperty(key);
        return value;
    }
}
