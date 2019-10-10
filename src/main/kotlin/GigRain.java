import java.util.Random;
import javax.microedition.lcdui.Graphics;

public class GigRain {
  protected Random random = new Random();
  
  private short WIDTH = 176;
  
  private short HEIGHT = 208;
  
  private final int COUNT = 60;
  
  private int[][] Particle = new int[60][9];
  
  private final byte CX = 0;
  
  private final byte CY = 1;
  
  private final byte VX = 2;
  
  private final byte VY = 3;
  
  private final byte VAC = 4;
  
  private final byte LIFE = 5;
  
  private final byte DECAY = 6;
  
  private final byte LastX = 7;
  
  private final byte LastY = 8;
  
  int w = 1;
  
  int h = 1;
  
  int off = -1;
  
  public GigRain() {
    this.w = 8 + getRandom(4);
    this.h = 100;
    for (short s = this.HEIGHT / 12; s > 0; s--) {
      InitializeParticle(-17920, 0);
      MoveParticle();
    } 
  }
  
  void reset() {
    this.w = 8 + getRandom(4);
    this.h = 100;
    if (getRandom(10) < 5)
      this.off = 0; 
    if (this.w < -40) {
      this.off = 1;
    } else if (this.w > 40) {
      this.off = -1;
    } 
  }
  
  void InitializeParticle(int paramInt1, int paramInt2) {
    for (byte b = 0; b < 60; b++) {
      if (this.Particle[b][5] <= 0) {
        this.Particle[b][0] = paramInt1 + getRandom(76800);
        this.Particle[b][1] = paramInt2 + getRandom(2560);
        this.Particle[b][7] = this.Particle[b][0];
        this.Particle[b][8] = this.Particle[b][1];
        this.Particle[b][3] = 1024 + getRandom(1024);
        if (this.h > 0)
          this.Particle[b][2] = this.Particle[b][3] * this.w / this.h; 
        this.Particle[b][4] = 256;
        this.Particle[b][5] = 20 + getRandom(20);
        this.Particle[b][6] = 1 + getRandom(2);
      } 
    } 
  }
  
  void MoveParticle() {
    this.w += this.off * getRandom(2);
    for (byte b = 0; b < 60; b++) {
      if (this.Particle[b][5] > 0) {
        this.Particle[b][7] = this.Particle[b][0];
        this.Particle[b][8] = this.Particle[b][1];
        this.Particle[b][0] = this.Particle[b][0] + this.Particle[b][2];
        this.Particle[b][1] = this.Particle[b][1] + this.Particle[b][3];
        this.Particle[b][5] = this.Particle[b][5] - this.Particle[b][6];
        if (this.Particle[b][0] >= this.WIDTH << 8 || this.Particle[b][1] >= this.HEIGHT << 8)
          this.Particle[b][5] = 0; 
      } 
    } 
  }
  
  void drawParticle(Graphics paramGraphics) {
    InitializeParticle(-17920, 0);
    MoveParticle();
    paramGraphics.setColor(14540253);
    for (byte b = 0; b < 60; b++)
      paramGraphics.drawLine(this.Particle[b][7] >> 8, this.Particle[b][8] >> 8, this.Particle[b][0] >> 8, this.Particle[b][1] >> 8); 
  }
  
  protected int getRandom(int paramInt) { return (this.random.nextInt() & 0x7FFFFFFF) % paramInt; }
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/GigRain.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */