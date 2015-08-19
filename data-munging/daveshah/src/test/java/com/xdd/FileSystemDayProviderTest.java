package com.xdd;

import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * Created by shah on 8/14/15.
 */
public class FileSystemDayProviderTest {

    @Test
    public void itProvidesDaysFromAFile() throws Exception {
        FileSystemDayProvider provider = new FileSystemDayProvider("data/weather.dat");

        Stream<Day> days = provider.getValidDays();

        assertEquals(31,days.count());
    }
}