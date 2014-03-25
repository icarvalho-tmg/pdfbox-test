package au.com.marlo.pdftest.main;

import org.apache.pdfbox.util.PDFMergerUtility;

public class MergeFiles {

	public static void main(String[] args) throws Exception {
       MergeFiles mf = new MergeFiles();
       mf.merge();

	}
	

    private void merge() throws Exception
    {
        String destinationFileName = "pdfmerged.pdf";
        String sourceFileName = "Hello World.pdf";


        PDFMergerUtility merger = new PDFMergerUtility();
        merger.addSource(sourceFileName);
        merger.addSource(sourceFileName);

        

        merger.setDestinationFileName(destinationFileName);

        merger.mergeDocuments();
    }


}
