import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;

public final class j {
  byte new;
  
  byte byte = 0;
  
  byte try;
  
  boolean for = true;
  
  Player if;
  
  VolumeControl int;
  
  String[] do = { "wild1", "wild2", "city1", "", "city3", "village", "battle1", "battle2", "battle3" };
  
  byte[] a = { 
      0, 2, 3, -1, 2, -1, -1, -1, -1, -1, 
      -1 };
  
  Player a(String paramString, int paramInt) {
    String[] arrayOfString = { "audio/midi", "audio/x-wav" };
    try {
      if (paramInt >= 0) {
        if (this.if != null)
          this.if.close(); 
        this.if = null;
        InputStream inputStream = getClass().getResourceAsStream("/sound/" + paramString + ".mid");
        this.if = Manager.createPlayer(inputStream, arrayOfString[paramInt]);
        this.if.prefetch();
        this.int = (VolumeControl)this.if.getControl("VolumeControl");
        this.int.setLevel(50);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return this.if;
  }
  
  boolean a(int paramInt, boolean paramBoolean) {
    byte b = this.a[paramInt];
    this.try = (byte)b;
    try {
      if (this.byte != (byte)paramInt || paramBoolean) {
        this.new = (byte)paramInt;
        this.byte = this.new;
        if (this.if != null)
          this.if.close(); 
        this.if = null;
        a(this.do[this.new - 1], 0);
      } else {
        this.new = (byte)paramInt;
      } 
      return true;
    } catch (Exception exception) {
      return false;
    } 
  }
  
  void a() {
    try {
      this.if.prefetch();
      this.if.start();
    } catch (Exception exception) {}
  }
  
  public void a(boolean paramBoolean) {
    this.for = paramBoolean;
    if (this.new > 0)
      if (paramBoolean) {
        if (this.try == -1) {
          if();
          this.if.setLoopCount(-1);
          a();
          this.new = 0;
        } else if (this.try > 0 && this.if != null && this.if.getState() != 400) {
          this.if.setLoopCount(1);
          a();
          this.try = (byte)(this.try - 1);
        } else if (this.try == 0) {
          this.new = 0;
          this.byte = 0;
        } 
      } else {
        this.new = 0;
      }  
  }
  
  boolean if() {
    try {
      this.if.stop();
      return false;
    } catch (Exception exception) {
      return false;
    } 
  }
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/j.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */