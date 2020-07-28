package com.company.bookmark.Utils;

import java.io.IOException;
import java.net.*;
//HttpConnect class for connecting and retriving input Stream from webpage
public class HttpConnect {
    public static String download(String sourceUrl) throws URISyntaxException, MalformedURLException {
        URL url = new URI(sourceUrl).toURL();

        try {
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            int responseCode = con.getResponseCode();
            if (responseCode >= 200 && responseCode <= 400) {
                System.out.println("Downloading Bookmark");
                return IOutils.read(con.getInputStream());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}