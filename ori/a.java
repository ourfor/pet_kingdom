import java.util.Random;
import javax.microedition.lcdui.Graphics;

public class a {
  protected Random int = new Random();
  
  private short long = 240;
  
  private short char = 320;
  
  private final int new = 120;
  
  private int[][] byte = new int[120][9];
  
  private final byte c = 0;
  
  private final byte void = 1;
  
  private final byte try = 2;
  
  private final byte for = 3;
  
  private final byte if = 4;
  
  private final byte else = 5;
  
  private final byte a = 6;
  
  private final byte d = 7;
  
  private final byte b = 8;
  
  int goto = 1;
  
  int case = 1;
  
  int do = -1;
  
  public a() {
    this.goto = 8 + a(4);
    this.case = 100;
    for (short s = this.char / 12; s > 0; s--) {
      a(-17920, 0);
      a();
    } 
  }
  
  void if() {
    this.goto = 8 + a(4);
    this.case = 100;
    if (a(10) < 5)
      this.do = 0; 
    if (this.goto < -40) {
      this.do = 1;
    } else if (this.goto > 40) {
      this.do = -1;
    } 
  }
  
  void a(int paramInt1, int paramInt2) {
    for (byte b1 = 0; b1 < 120; b1++) {
      if (this.byte[b1][5] <= 0) {
        this.byte[b1][0] = paramInt1 + a(122880);
        this.byte[b1][1] = paramInt2 + a(2560);
        this.byte[b1][7] = this.byte[b1][0];
        this.byte[b1][8] = this.byte[b1][1];
        this.byte[b1][3] = 1024 + a(1024);
        if (this.case > 0)
          this.byte[b1][2] = this.byte[b1][3] * this.goto / this.case; 
        this.byte[b1][4] = 256;
        this.byte[b1][5] = (30 + a(20)) * 2;
        this.byte[b1][6] = 1 + a(2);
      } 
    } 
  }
  
  void a() {
    this.goto += this.do * a(2);
    for (byte b1 = 0; b1 < 120; b1++) {
      if (this.byte[b1][5] > 0) {
        this.byte[b1][7] = this.byte[b1][0];
        this.byte[b1][8] = this.byte[b1][1];
        this.byte[b1][0] = this.byte[b1][0] + this.byte[b1][2];
        this.byte[b1][1] = this.byte[b1][1] + this.byte[b1][3];
        this.byte[b1][5] = this.byte[b1][5] - this.byte[b1][6];
        if (this.byte[b1][0] >= this.long << 8 || this.byte[b1][1] >= this.char << 8)
          this.byte[b1][5] = 0; 
      } 
    } 
  }
  
  void a(Graphics paramGraphics) {
    a(-17920, 0);
    a();
    paramGraphics.setColor(14540253);
    for (byte b1 = 0; b1 < 120; b1++)
      paramGraphics.drawLine(this.byte[b1][7] >> 8, this.byte[b1][8] >> 8, this.byte[b1][0] >> 8, this.byte[b1][1] >> 8); 
  }
  
  protected int a(int paramInt) { return (this.int.nextInt() & 0x7FFFFFFF) % paramInt; }
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/a.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */