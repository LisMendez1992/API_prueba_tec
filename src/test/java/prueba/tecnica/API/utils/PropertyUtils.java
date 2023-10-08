package prueba.tecnica.API.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {

    public static Properties getProperties(String filePath) {
        Properties properties = new Properties();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            try {
                properties.load(reader);
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("No fue posible cargar el archivo de propiedades");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("No se encontro el archivo");
        }
        return properties;
    }
}


