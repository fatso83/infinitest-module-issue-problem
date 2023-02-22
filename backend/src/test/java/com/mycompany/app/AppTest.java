package com.mycompany.app;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void know_something_about_life()
    {
        assertEquals(new App().factOfLife(), 42);
    }

    @Test
    public void it_should_load_classpath_resources() throws IOException {
        assertEquals("life is meaningless", new App().getDataFromResource());
    }

    @Test
    public void it_should_use_the_modules_base_directory_as_the_user_directory() {
        String userDirectory = System.getProperty("user.dir");
        String userDirectory2 = new File("").getAbsolutePath();
        String userDirectory3 = Paths.get("").toAbsolutePath().toString();
        assertEquals(userDirectory, userDirectory2);
        assertEquals(userDirectory, userDirectory3);
        assertThat(userDirectory, endsWith(Paths.get("infinitest-module-issue-problem","backend").toString()));
    }
}
