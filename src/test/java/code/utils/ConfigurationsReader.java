package code.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationsReader {
    //We created this because we need to read our Configuration.properties file

    private static Properties configFile= new Properties();
    static {
        try {
            FileInputStream fileInputStream = new FileInputStream("Configuration.properties");
            configFile.load(fileInputStream);
            fileInputStream.close();
        }catch (Exception e){
            System.out.println("Failed to load the properties");
            e.printStackTrace();
        }
    }
    public static String getProperties(String key){
        return configFile.getProperty(key);
    }
}


            //CONFIG FILE READING