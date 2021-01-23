package br.com.pfemeiros.receiptstrategy.util;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;

public class PDFUtils {

    public static void generateFile(String html, Long id) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("C:\\Users\\pfeme\\Documents\\Workspace\\receipt-strategy\\src\\main\\resources" + id + ".pdf"); // TODO return file for download
            Document document = new Document();
            PdfWriter.getInstance(document, fileOutputStream);
            document.open();
            HTMLWorker htmlWorker = new HTMLWorker(document); // TODO check deprecated
            htmlWorker.parse(new StringReader(html));
            document.close();
        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }
    }

}
