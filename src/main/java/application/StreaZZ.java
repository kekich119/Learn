package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreaZZ {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("https://google.com");

        Stream<URI> stream = list.stream().map(str ->
        {
            try
            {
                return new URI(str);

            }
            catch (URISyntaxException e){
                e.printStackTrace();
                return null;
            }
        });



    }


}
