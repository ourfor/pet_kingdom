import java.util.Random;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class k {
  protected Random a = new Random();
  
  private int b = 160;
  
  private final int for = 240;
  
  private final int long = 320;
  
  int[][] void = new int[this.b][10];
  
  byte try = 2;
  
  byte else = 2;
  
  int f = 0;
  
  int goto = 220;
  
  Image int = null;
  
  boolean d = false;
  
  private final byte e = 0;
  
  private final byte c = 1;
  
  private final byte case = 2;
  
  private final byte byte = 3;
  
  private final byte new = 4;
  
  private final byte if = 5;
  
  private final byte char = 6;
  
  int do;
  
  public k() {
    this.b = 60 + a(100);
    this.void = (int[][])null;
    this.void = new int[this.b][10];
    try {
      if (this.int == null)
        this.int = Image.createImage("/snow.png"); 
    } catch (Exception exception) {}
    this.try = 1;
    this.else = 1;
    this.d = true;
  }
  
  void a(int paramInt1, int paramInt2) {
    for (byte b1 = 0; b1 < this.b; b1++) {
      if (this.void[b1][5] <= 0) {
        this.void[b1][0] = paramInt1 + a(360);
        this.void[b1][1] = paramInt2 + a(50);
        this.void[b1][2] = 1 + a(2);
        this.void[b1][3] = 1 + a(3);
        this.void[b1][4] = 1;
        this.void[b1][5] = a(6);
        this.void[b1][6] = a(3);
      } 
    } 
  }
  
  void a() {
    int i = a(2);
    for (byte b1 = 0; b1 < this.b; b1++) {
      if (this.void[b1][5] > 0) {
        if (this.f >= this.goto) {
          this.void[b1][2] = -this.void[b1][2];
          this.f = -1;
        } 
        this.void[b1][0] = this.void[b1][0] + this.void[b1][2];
        this.void[b1][1] = this.void[b1][1] + this.void[b1][3];
        if (i == 1)
          this.void[b1][1] = this.void[b1][1] + this.void[b1][4]; 
        this.void[b1][5] = this.void[b1][5] - this.void[b1][6];
        if (this.void[b1][0] >= 240 || this.void[b1][1] <= 1 || this.void[b1][1] >= 320) {
          if (this.do > 0) {
            this.void[b1][3] = this.void[b1][3] * -1;
            this.void[b1][6] = this.void[b1][6] + 1;
            this.void[b1][3] = this.void[b1][3] + 1;
          } else {
            this.d = false;
          } 
        } else {
          this.d = true;
        } 
      } 
    } 
  }
  
  void a(Graphics paramGraphics, int paramInt) {
    this.do = paramInt;
    a(-120, 0);
    a();
    this.f++;
    paramGraphics.setColor(16777215);
    for (byte b1 = 0; b1 < this.b; b1++) {
      if (a(5) >= 2) {
        paramGraphics.drawImage(this.int, this.void[b1][0], this.void[b1][1], 20);
      } else {
        paramGraphics.fillRect(this.void[b1][0], this.void[b1][1], this.try + a(2), this.else + a(2));
      } 
    } 
  }
  
  protected int a(int paramInt) { return (this.a.nextInt() & 0x7FFFFFFF) % paramInt; }
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/k.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */