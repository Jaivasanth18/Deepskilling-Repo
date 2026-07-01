// interface document
interface Document {
    void open();
}


// concrete implementations
class WordDocumentImpl implements Document {
    public void open() {
        System.out.println("Opening Word...");
    }
}

class ExcelDocumentImpl implements Document {
    public void open() {
        System.out.println("Opening Excel...");
    }
}

class PdfDocumentImpl implements Document {
    public void open() {
        System.out.println("Opening PDF...");
    }
}

// document factory 
abstract class DocumentFactory {
    public abstract Document createDocument();
}

// concrete classes for each type of doc
class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocumentImpl();
    }
}

class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocumentImpl();
    }
}

class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocumentImpl();
    }
}

// test class

public class test {
    public static void main(String[] args) {

        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();
    }
}