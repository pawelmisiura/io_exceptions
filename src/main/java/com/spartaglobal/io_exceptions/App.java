package com.spartaglobal.io_exceptions;

import java.io.IOException;

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

        Buffered buffered = new Buffered();
        try{
            buffered.readerWriter();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
