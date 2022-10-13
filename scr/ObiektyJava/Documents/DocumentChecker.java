package ObiektyJava.Documents;

public class DocumentChecker {
    public static void main(String[] args) {
        //document excel możemy zadeklarować na 2 sposoby:
        // sposób1:
        //ExcelDocument document = new ExcelDocument();
        // sposób 2:
        //Document excelDocument = new ExcelDocument();
        //więc można to zapisać w ten sposób, bo excel i pdf są jakimiś postaciami dokumentu
        Document excelDocument = new ExcelDocument();
        Document pdfDocument = new PdfDocument();
        //widzimy wielopstaciowość Document
        // w zalęzności od tego jaki dokumnet stworzyliśmy taki będzie opis
        pdfDocument.getDescription();
        excelDocument.getDescription();


    }
}
