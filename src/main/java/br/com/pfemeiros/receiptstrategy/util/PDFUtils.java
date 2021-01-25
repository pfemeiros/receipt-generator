package br.com.pfemeiros.receiptstrategy.util;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;

public class PDFUtils {

    public static byte[] generateFile(String html) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            Document document = new Document();
            PdfWriter.getInstance(document, baos);
            document.open();
            HTMLWorker htmlWorker = new HTMLWorker(document);// TODO check deprecated
            htmlWorker.parse(new StringReader(html));
            document.close();
            baos.close();
            return baos.toByteArray();
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Could not read file");
        }
    }

}
