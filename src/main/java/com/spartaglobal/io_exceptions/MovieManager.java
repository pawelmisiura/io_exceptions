package com.spartaglobal.io_exceptions;
/*
all films higher then 7.5 and save them into a new csv
all films under
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MovieManager {

    public void searchForFilm(){
        try {
        BufferedReader csvReader = new BufferedReader(new FileReader("resources/movie_metadata.csv"));

        String csvLine;
        String values = null;
        csvReader.readLine();
        while ((csvLine = csvReader.readLine()) != null) {
            String[] csvLineData = csvLine.split(",");
            if(Double.parseDouble(csvLineData[1]) >= 7.5){
                System.out.println(csvLineData[0]);
                System.out.println(csvLineData[1]);
            }
        }


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e){
                e.printStackTrace();
            }


    }
}
