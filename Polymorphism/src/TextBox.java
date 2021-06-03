public class TextBox extends UIControl{
    private String text="";

    @Override
    public String toString(){
        return text;
    }

    @Override
    public void render(){
        System.out.println("render TB");
    }

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }
}
