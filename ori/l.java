import com.nokia.mid.ui.DirectGraphics;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public abstract class l extends Canvas {
  final byte goto = -1;
  
  final byte if = -2;
  
  final byte int = -3;
  
  final byte char = -4;
  
  final byte byte = -6;
  
  final byte try = -7;
  
  final byte new = -5;
  
  final byte for = -11;
  
  DirectGraphics else;
  
  Graphics case;
  
  static Font do = Font.getFont(0, 0, 8);
  
  h a;
  
  protected l() { setFullScreenMode(true); }
  
  protected void paint(Graphics paramGraphics) { this.case = paramGraphics; }
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/l.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */