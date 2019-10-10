import java.util.Random;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class MMPPartical {
  protected Random random = new Random();
  
  private int COUNT = 80;
  
  private final int WIDTH = 176;
  
  private final int HEIGHT = 208;
  
  int[][] Particle = new int[this.COUNT][10];
  
  byte xx = 2;
  
  byte yy = 2;
  
  int loopStep = 0;
  
  int STEP = 220;
  
  Image snow = null;
  
  boolean bdraw = false;
  
  private final byte CX = 0;
  
  private final byte CY = 1;
  
  private final byte VX = 2;
  
  private final byte VY = 3;
  
  private final byte VAC = 4;
  
  private final byte LIFE = 5;
  
  private final byte DECAY = 6;
  
  int end;
  
  public MMPPartical() {
    this.COUNT = 60 + getRandom(100);
    this.Particle = (int[][])null;
    this.Particle = new int[this.COUNT][10];
    try {
      if (this.snow == null)
        this.snow = Image.createImage("/snow.png"); 
    } catch (Exception exception) {}
    this.xx = 1;
    this.yy = 1;
    this.bdraw = true;
  }
  
  void InitializeParticle(int paramInt1, int paramInt2) {
    for (byte b = 0; b < this.COUNT; b++) {
      if (this.Particle[b][5] <= 0) {
        this.Particle[b][0] = paramInt1 + getRandom(264);
        this.Particle[b][1] = paramInt2 + getRandom(50);
        this.Particle[b][2] = 1 + getRandom(2);
        this.Particle[b][3] = 1 + getRandom(3);
        this.Particle[b][4] = 1;
        this.Particle[b][5] = getRandom(6);
        this.Particle[b][6] = getRandom(3);
      } 
    } 
  }
  
  void MoveParticle() {
    int i = getRandom(2);
    for (byte b = 0; b < this.COUNT; b++) {
      if (this.Particle[b][5] > 0) {
        if (this.loopStep >= this.STEP) {
          this.Particle[b][2] = -this.Particle[b][2];
          this.loopStep = -1;
        } 
        this.Particle[b][0] = this.Particle[b][0] + this.Particle[b][2];
        this.Particle[b][1] = this.Particle[b][1] + this.Particle[b][3];
        if (i == 1)
          this.Particle[b][1] = this.Particle[b][1] + this.Particle[b][4]; 
        this.Particle[b][5] = this.Particle[b][5] - this.Particle[b][6];
        if (this.Particle[b][0] >= 176 || this.Particle[b][1] <= 1 || this.Particle[b][1] >= 208) {
          if (this.end > 0) {
            this.Particle[b][3] = this.Particle[b][3] * -1;
            this.Particle[b][6] = this.Particle[b][6] + 1;
            this.Particle[b][3] = this.Particle[b][3] + 1;
          } else {
            this.bdraw = false;
          } 
        } else {
          this.bdraw = true;
        } 
      } 
    } 
  }
  
  void drawParticle(Graphics paramGraphics, int paramInt) {
    this.end = paramInt;
    InitializeParticle(-88, 0);
    MoveParticle();
    this.loopStep++;
    paramGraphics.setColor(16777215);
    for (byte b = 0; b < this.COUNT; b++) {
      if (getRandom(5) >= 2) {
        paramGraphics.drawImage(this.snow, this.Particle[b][0], this.Particle[b][1], 20);
      } else {
        paramGraphics.fillRect(this.Particle[b][0], this.Particle[b][1], this.xx + getRandom(2), this.yy + getRandom(2));
      } 
    } 
  }
  
  protected int getRandom(int paramInt) { return (this.random.nextInt() & 0x7FFFFFFF) % paramInt; }
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/MMPPartical.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */