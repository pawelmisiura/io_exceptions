package com.spartaglobal.io_exceptions;

import java.io.*;

public class FileInputStreamManager {

    public void fileStreamReader(){

        try {
            BufferedReader file = new BufferedReader(new FileReader("resources/newFile.txt"));

            // Breaks up the words using spaces and puts each word in an array
            String line;
            while((line = file.readLine()) != null){
                String[] lineData = line.split(" ");
                System.out.println(lineData);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
