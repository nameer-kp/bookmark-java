package com.company.bookmark.IOutils;

import java.io.*;

public class IOutils {
public static void read(String[] data,String filename)
{
    try(BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(filename),"UTF-8"))) {
    String line ;
    int count = 0;
    while ((line=bf.readLine())!=null){
        data[count]=line;
        count++;
    }




    } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
