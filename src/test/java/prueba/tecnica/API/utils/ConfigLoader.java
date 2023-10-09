package prueba.tecnica.API.utils;

import java.util.Properties;

public class ConfigLoader {

    private  final Properties properties;
    private static ConfigLoader configLoader;

    private ConfigLoader(){
        properties = PropertyUtils.getProperties("src/test/resources/data.properties");
    }

    public static ConfigLoader getInstance(){
        if(configLoader == null){
            configLoader = new ConfigLoader();
        }
        return configLoader;
    }

    public String getProperty(String key) {
        String property = properties.getProperty(key);
        if (property != null) return property;
        else throw new RuntimeException("Property '" + key + "' not found.");
        }

    }

