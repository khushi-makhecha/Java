public class UIControl {
    private boolean isEnabled;

    public void enable(){
        isEnabled = true;
    }

    public void disable(){
        isEnabled = false;
    }

    public boolean isEnabled(){
        return isEnabled;
    }

    public final void render() {

    }
}