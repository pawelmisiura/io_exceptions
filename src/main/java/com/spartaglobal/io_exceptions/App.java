package com.spartaglobal.io_exceptions;

import com.spartaglobal.io_exceptions.exeptions.ExceptionExamples;

import java.io.IOException;
import java.lang.reflect.MalformedParameterizedTypeException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ByteReaderManager byteReaderManager = new ByteReaderManager();
//        byteReaderManager.charReader();

//        Buffered buffered = new Buffered();
//        try{
//            buffered.readerWriter();
//        }catch (IOException e){
//            e.printStackTrace();
//        }

//        MovieManager movieManager = new MovieManager();
//        movieManager.searchForFilm();

        ExceptionExamples exceptionExamples = new ExceptionExamples();
        exceptionExamples.readFile();
    }
}
