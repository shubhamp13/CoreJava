package com.collections.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo
{
    public static void main(String[] args)
    {
        try {
            FileInputStream fis = new FileInputStream("db.properties");
            Properties prop = new Properties();
            prop.load(fis);
            String user=prop.getProperty("user");
            String password=prop.getProperty("password");
            String driverName=prop.getProperty("driverName");
            String url=prop.getProperty("URL");
            System.out.println("User:"+user);
            prop.setProperty("user","Shubham");
            System.out.println("Password:"+password);
            System.out.println("Driver Name:"+driverName);
            System.out.println("URL:"+url);
            FileOutputStream outputStream=new FileOutputStream("db.properties");
            prop.store(outputStream,"Shubham Pandit Puri");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
