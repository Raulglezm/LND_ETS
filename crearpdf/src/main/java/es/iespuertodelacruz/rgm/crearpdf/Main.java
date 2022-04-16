package es.iespuertodelacruz.rgm.crearpdf;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

public class Main {


    public static void main(String[] args) throws Exception {
        try (PDDocument document = new PDDocument()) {


            PDPage page = new PDPage(PDRectangle.A6);
            document.addPage(page);
            PDPageContentStream contentStream = new PDPageContentStream(document, page);



            Estructura estructura = new Estructura((int) (page.getMediaBox().getHeight() - 10));


            System.out.println("Introduzca el texto que desea convertir");
            

            for (int i = 0; i < 10; i++) {
             
                // Text

                int tamanioLetra = 10;

                contentStream.beginText();
                contentStream.setFont(PDType1Font.TIMES_BOLD, tamanioLetra);
                contentStream.newLineAtOffset( 20, estructura.getHeightActual());
                contentStream.showText("Hello World.......!");
                contentStream.endText();
                estructura.avanzarEnHeight(tamanioLetra);
            }

            // Image
            PDImageXObject image = PDImageXObject.createFromByteArray(document, Main.class.getResourceAsStream("/java.png").readAllBytes(), "Java Logo");
            contentStream.drawImage(image, 10, 10, image.getWidth() / 8, image.getHeight() / 8);

            contentStream.close();

            document.save("document.pdf");
        }
    }
}
