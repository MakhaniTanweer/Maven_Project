package com.mycompany.app;

/**
 * Hello world!
 *
 */
import com.fasterxml.jackson.core.*;

import java.io.File;
import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println("Hello World!");
        //System.out.println(System.getProperty("user.dir"));
        JsonFactory factory = new JsonFactory();

        JsonParser jp = factory.createParser(new File("src\\main\\resources\\input.json"));
        jp.nextToken();
        String fieldName = jp.getCurrentName();
        // Let's move to value
        System.out.println(fieldName);
    }
}
