package cn.linyang.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileUtils implements ServletContextListener {


    private static Properties prop = new Properties();

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        InputStream inputStream;
        try {
            inputStream = getClass().getResourceAsStream("/data.properties");
            if (inputStream != null) {
                prop.load(inputStream);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

    public static String getProperties(String name)
    {
        return prop.getProperty(name);
    }
}
