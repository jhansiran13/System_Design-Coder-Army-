import java.util.ArrayList;
import java.util.List;




class DocumentEditor{
    private List<String> documentElements;
    private String renderDocument;
    public DocumentEditor(){
        documentElements=new ArrayList<>();
        renderDocument="";
    }
    // add text as string
    public void addText(String text){
        documentElements.add(text);
    }
    // add image as file path
    public void addImage(String imagePath){
        documentElements.add(imagePath);
    }


    // rendering the document
}