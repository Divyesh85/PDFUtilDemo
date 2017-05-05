package com.morningstar;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by dtandel on 5/2/2017.
 */
public class PDFCompareTest {

    @Test
    public void pdfCompareTest() throws IOException, Exception {
        Properties props=new Properties();

        props.load(PDFCompare.class.getResourceAsStream("/application.properties"));

        PDFCompare pdfCompareObj = new PDFCompare();
        pdfCompareObj.pdfVisualCompare(props.getProperty("File_Source"),props.getProperty("File_Dest"),props.getProperty("Img_Path"),props.getProperty("No_of_Pages"));
        pdfCompareObj.AddImageToWord(props.getProperty("Img_Path"));
    }
}
