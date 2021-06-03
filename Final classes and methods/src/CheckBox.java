public final class CheckBox extends UIControl{

    @Override                            // Cannot override as this method is declared final in the parent.
    public void render(){
        System.out.println("render CB");
    }
}