import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public abstract class DirectUtils {
  public static DirectGraphics getDirectGraphics(Graphics paramGraphics) { return new DirectGraphics(paramGraphics); }
  
  public static Image createImage(byte[] paramArrayOfByte, int paramInt1, int paramInt2) { return Image.createImage(paramArrayOfByte, paramInt1, paramInt2); }
  
  public static Image createImage(int paramInt1, int paramInt2, int paramInt3) { return Image.createImage(paramInt1, paramInt2); }
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/DirectUtils.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */