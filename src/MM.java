import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public final class MM extends MIDlet {
  private f a = new f(this);
  
  public MM() {
    Display.getDisplay(this).setCurrent(this.a);
    this.a.new();
  }
  
  public void startApp() {}
  
  public void pauseApp() {}
  
  public void destroyApp(boolean paramBoolean) {
    this.a.b();
    notifyDestroyed();
  }
  
  public void a() {
    try {
      platformRequest("http://3g.qq.com/forward.jsp?from=kjavagame&bid=4");
    } catch (Exception exception) {}
    destroyApp(true);
  }
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/MM.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */