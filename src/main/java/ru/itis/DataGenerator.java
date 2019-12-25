package ru.itis;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DataGenerator {

    private ObjectMapper mapper;

    public DataGenerator() {
        mapper = new ObjectMapper();
    }

    public String generateJsonFromObject(String className) {
        try {
            Class<?> type = Class.forName("ru.itis.models." + className);
            Constructor<?> constructor = type.getConstructor();
            Object object = constructor.newInstance();
            return className + "=" + mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            System.out.println("Exception while generating json");
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            System.out.println("Error with reflection");
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

}
