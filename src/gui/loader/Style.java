package gui.loader;

public abstract class Style {
    private String path;
    
    public Style(String path){
        this.path=path;
    }
    
    public String getCss(){
        return this.getClass().getResource(path).toExternalForm();
    }   
}