import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class DirectGraphics {
  static final byte FLIP_HORIZONTAL = 4;
  
  static final byte ROTATE_90 = 1;
  
  static final byte ROTATE_270 = 3;
  
  Graphics g;
  
  static int[] transA = { 0, 6, 3, 5, 2, 7, 1, 4 };
  
  int image_width;
  
  int image_height;
  
  public DirectGraphics(Graphics paramGraphics) { this.g = paramGraphics; }
  
  public void setARGBColor(int paramInt) { this.g.setColor(paramInt); }
  
  public void drawTriangle(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    this.g.setColor(paramInt7);
    this.g.drawLine(paramInt1, paramInt2, paramInt3, paramInt4);
    this.g.drawLine(paramInt3, paramInt4, paramInt5, paramInt6);
    this.g.drawLine(paramInt1, paramInt2, paramInt5, paramInt6);
  }
  
  public void fillTriangle(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    this.g.setColor(paramInt7);
    this.g.fillTriangle(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
  }
  
  public void drawPixels(int[] paramArrayOfInt, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) { this.g.drawRGB(paramArrayOfInt, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramBoolean); }
  
  public void getPixels(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {}
  
  public void getPixels(short[] paramArrayOfShort, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {}
  
  public void fillPolygon(int[] paramArrayOfInt1, int paramInt1, int[] paramArrayOfInt2, int paramInt2, int paramInt3, int paramInt4) {
    this.g.setColor(paramInt4);
    this.g.fillTriangle(paramArrayOfInt1[0], paramArrayOfInt2[0], paramArrayOfInt1[1], paramArrayOfInt2[1], paramArrayOfInt1[2], paramArrayOfInt2[2]);
    this.g.fillTriangle(paramArrayOfInt1[0], paramArrayOfInt2[0], paramArrayOfInt1[3], paramArrayOfInt2[3], paramArrayOfInt1[2], paramArrayOfInt2[2]);
  }
  
  public void drawImage(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4) { this.g.drawRegion(paramImage, 0, 0, paramImage.getWidth(), paramImage.getHeight(), transA[paramInt4], paramInt1, paramInt2, paramInt3); }
  
  public void drawImage2(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.image_width = paramImage.getWidth();
    this.image_height = paramImage.getHeight();
    if (paramInt4 < 5) {
      this.g.drawRegion(paramImage, 0, 0, this.image_width, this.image_height, paramInt4, paramInt1, paramInt2, paramInt3);
    } else if (paramInt4 == 5) {
      this.g.drawRegion(paramImage, 0, 0, this.image_width, this.image_height, paramInt4, paramInt1 - this.image_height, paramInt2, paramInt3);
    } else if (paramInt4 == 6) {
      this.g.drawRegion(paramImage, 0, 0, this.image_width, this.image_height, paramInt4, paramInt1, paramInt2 - this.image_width, paramInt3);
    } else if (paramInt4 == 7) {
      this.g.drawRegion(paramImage, 0, 0, this.image_width, this.image_height, paramInt4, paramInt1 - this.image_height, paramInt2 - this.image_width, paramInt3);
    } 
  }
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/DirectGraphics.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */