package gui.loader;

public class StyleLoader {
    private StyleSource LoginCss;
    private StyleSource RegisterCss;
    private StyleSource RoomCss;
    
    public StyleLoader(){
        LoginCss = new StyleSource("/gui/login/loginview.css");
        RegisterCss = new StyleSource("/gui/register/registerview.css");
        RoomCss = new StyleSource("/gui/room/roomview.css");
    }

    public String getLoginCss() {
        return LoginCss.getCss();
    }

    public String getRegisterCss() {
        return RegisterCss.getCss();
    }
    
    public String getRoomCss(){
        return RoomCss.getCss();
    }
}