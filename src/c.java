import javax.microedition.lcdui.Image;

public class c {
  byte[] byte;
  
  Image[] new;
  
  b try;
  
  byte int;
  
  byte for;
  
  byte do;
  
  byte a;
  
  byte if;
  
  public c(b paramb) { this.try = paramb; }
  
  void a(byte[] paramArrayOfByte) {
    this.int = paramArrayOfByte[this.try.aC.if++];
    this.for = paramArrayOfByte[this.try.aC.if++];
    this.do = paramArrayOfByte[this.try.aC.if++];
    this.a = paramArrayOfByte[this.try.aC.if++];
    this.try.aC.if += 2;
    this.if = paramArrayOfByte[this.try.aC.if++];
    a(paramArrayOfByte, this.if);
  }
  
  byte[][] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2) {
    byte[][] arrayOfByte = (byte[][])null;
    try {
      a(paramArrayOfByte);
      if(paramArrayOfByte, this.if, this.try.aC.if);
      arrayOfByte = new byte[paramInt1][paramInt2];
      byte b1;
      for (b1 = 0; b1 < paramInt1; b1++) {
        for (byte b2 = 0; b2 < paramInt2; b2++)
          arrayOfByte[b1][b2] = -1; 
      } 
      if (this.if == 0) {
        this.new = null;
        return arrayOfByte;
      } 
      this.try.aC.if += this.if * 4;
      for (b1 = this.for; b1 < this.a + this.for; b1++) {
        for (byte b2 = this.int; b2 < this.do + this.int; b2++)
          arrayOfByte[b2][b1] = paramArrayOfByte[this.try.aC.if++]; 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return arrayOfByte;
  }
  
  void a(byte[] paramArrayOfByte, int paramInt) { this.new = this.try.aC.if(paramArrayOfByte, paramInt, this.try.aC.if); }
  
  void if(byte[] paramArrayOfByte, int paramInt1, int paramInt2) {
    this.byte = new byte[paramInt1];
    for (int i = 0; i < paramInt1; i++)
      this.byte[i] = paramArrayOfByte[paramInt2 + i]; 
  }
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/c.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */