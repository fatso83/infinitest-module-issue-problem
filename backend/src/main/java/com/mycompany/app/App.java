package com.mycompany.app;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Hello world!
 *
 */
public class App 
{
    public int factOfLife(){
        return 42;
    }

    public String getDataFromResource() throws IOException {
        final URL resource = this.getClass().getClassLoader().getResource("a-resource.dat");
        return Files.readString(Paths.get(resource.getPath()));
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
