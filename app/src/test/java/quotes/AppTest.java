/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;

public class AppTest {
    @Test public void testrandom()throws FileNotFoundException {
        String fileName = "/home/bader/quotes/app/src/main/resources/recentquotes.json";
        Gson gson = new Gson();

            FileReader fileReader = new FileReader(fileName);
            JsonReader reader = new JsonReader(fileReader);
            System.out.println(reader);

            Quotes[] data = gson.fromJson(reader, Quotes[].class);

                assertEquals("Marilyn Monroe", data[0].getAuthor());
       
    }
}
