package com.mycompany.app;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.junit.Assert.assertEquals;

public class AnotherTest
{

    @Test
    public void know_something_about_life()
    {
        assertEquals(new App().factOfLife(), 42);
    }
}
