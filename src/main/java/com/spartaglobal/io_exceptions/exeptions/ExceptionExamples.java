package com.spartaglobal.io_exceptions.exeptions;

import java.io.*;

public class ExceptionExamples {

    public void readFile() {
        File file = new File("resources/TestFile.txt");
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while((line = bufferedReader.readLine()) != null);
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }


    }
}
