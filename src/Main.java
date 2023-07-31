import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        File imageFile = new File("C:\\Users\\ricca\\IdeaProjects\\prova_1\\img\\img_1.pdf");
        ITesseract instance = new Tesseract();
        instance.setDatapath("C:\\Users\\ricca\\IdeaProjects\\prova_1\\tessdata");
        try {
            String result = instance.doOCR(imageFile);
            System.out.println("Output\n"+ result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}