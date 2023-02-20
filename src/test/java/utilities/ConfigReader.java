package utilities;
import java.io.FileInputStream;
import java.util.Properties;
public class ConfigReader {
    //This class reads the configuration.properties file  configuration properties sinifini okumak icin kullanilir
    //Create Properties instance
    // property file i okumak icin property objesi olusturulur
    private static Properties properties;
    // ainifi cagirir cagirmaz herseyden once static block calisir
    static {
        //path of the configuration file  ---> data cekmek istedgim dosyani npathi
        String path="configuration.properties";

        // try catch kulllandik comptime except olusuyor cath yapmak icin
        try {
            //Opening configuration.properties file using FileInputStream
            FileInputStream fileInputStream = new FileInputStream(path);
            // properties objesini instanciate ediyoruz
            properties = new Properties();

            // configuration.property dosyasindaki datalari yukeler
            properties.load(fileInputStream);


            //close the file
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //This method will get the key from properties file,
    //And return the value as String
    //We create this method to read the file  biz burada key girdigimizde value return ediyor
    // orn browser  verdik chrome return eder
    //    ConfigReader.getProperty("browser"); -> chrome
    //    ConfigReader.getProperty("amazon_url"); -> https://www.amazon.com
    //    ConfigReader.getProperty("username"); -> ali
    public static String getProperty(String key){
        String value=properties.getProperty(key);
        return value;
    }
}
