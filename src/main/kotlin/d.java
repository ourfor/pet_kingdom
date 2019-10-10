public class d {
  byte[] do;
  
  int new;
  
  short for;
  
  short int;
  
  short a;
  
  byte[][] if;
  
  public d(h paramh, int paramInt1, int paramInt2) {
    this.do = new byte[31];
    this.do[16] = (byte)paramInt1;
    this.do[11] = (byte)paramInt2;
    System.arraycopy(paramh.q(paramInt1), 0, this.do, 18, 12);
    this.for = (short)this.do[18];
    this.int = (short)this.do[17];
    this.a = (short)this.do[19];
    int i = 0;
    short s = 0;
    if (this.do[11] <= 20) {
      i = 2;
      s = 0;
    } else if (this.do[11] > 20 && this.do[11] <= 40) {
      i = 3;
      s = -20;
    } else {
      i = 4;
      s = -60;
    } 
    this.for = (short)(this.for - 120 + paramInt2 * i + s + f.int(8));
    this.a = (short)(this.a + (paramInt2 >> 1) - 2 + f.int(4));
    this.int = this.for;
    this.do[13] = -1;
    this.do[14] = -100;
    this.do[30] = 100;
    this.new = 0;
    paramh.if(this, 0);
    this.if = new byte[6][3];
  }
  
  public void a() { this.do[30] = (byte)(60 + f.int(10)); }
  
  public void if() { this.do[30] = 100; }
  
  public void do() { this.do[30] = (byte)Math.max(1, this.do[30] - 2); }
  
  public void for() { this.do[30] = (byte)Math.max(1, this.do[30] - 20); }
  
  public void a(int paramInt) { this.for = (short)(this.for + paramInt); }
  
  public void if(int paramInt) { this.a = (short)(this.a + paramInt); }
  
  public d() {}
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/d.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */