package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Constants {
    public static final int WAIT_EXPLICIT_SEC = Integer.parseInt(!(System.getProperty("wait.explicit.seconds") == null) ? System.getProperty("wait.explicit.seconds") : ConfigReader.loadProperty("wait.explicit.seconds"));
    public static final String APP_URL = !(System.getProperty("rush_exhibitions") == null) ? System.getProperty("rush_exhibitions") : ConfigReader.loadProperty("rush_exhibitions");

    public static String getUrl(String namePatn){
        String url = null;
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream("src\\main\\resources\\web_dog_patn.properties"));
            url = properties.getProperty(namePatn);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return url;
    }
}
