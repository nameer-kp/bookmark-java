package com.company.bookmark.Utils;

import java.io.*;
import java.util.List;

public class IOutils {
    public static void read(List<String> data, String filename) {
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF-8"))) {
            String line;
            while ((line = bf.readLine()) != null) {
                data.add(line);
            }


        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String read(InputStream inputStream) {
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"))) {
            StringBuilder text = new StringBuilder();
            String line;
            while ((line = bf.readLine()) != null) {
                text.append(line).append("\n");

            }
            return text.toString();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {

        }
        return null;
    }

    public static void write(String webpage, long id) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter((new FileOutputStream("pages/"+String.valueOf(id)+".html")), "UTF-8"))) {

            writer.write(webpage);

        } catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
}