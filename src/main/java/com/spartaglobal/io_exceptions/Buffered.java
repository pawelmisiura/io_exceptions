package com.spartaglobal.io_exceptions;

import java.io.*;

public class Buffered {

    public void readerWriter() throws IOException {
        File file = new File("resources/TestFile.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        File newFile = new File("resources/newFile.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));

        String line;

        while ((line = reader.readLine()) != null){
            if (!line.equals("")){
                writer.append(line.trim() + "\n");
                writer .append(line);
                System.out.println("Friyay ive added a new line sic");
            }
        }
        writer.flush();
        writer.close();
        reader.close();
    }
}
