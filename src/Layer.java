import javax.microedition.lcdui.Image;

public class Layer {
  byte[] type_area;
  
  Image[] cellImage;
  
  Map maps;
  
  byte left;
  
  byte top;
  
  byte cols;
  
  byte rows;
  
  byte aByte;
  
  public Layer(Map paramMap) { this.maps = paramMap; }
  
  void createMapImage(byte[] paramArrayOfByte) {
    this.left = paramArrayOfByte[this.maps.gameRun.skip++];
    this.top = paramArrayOfByte[this.maps.gameRun.skip++];
    this.cols = paramArrayOfByte[this.maps.gameRun.skip++];
    this.rows = paramArrayOfByte[this.maps.gameRun.skip++];
    this.maps.gameRun.skip += 2;
    this.aByte = paramArrayOfByte[this.maps.gameRun.skip++];
    createCellImage(paramArrayOfByte, this.aByte);
  }
  
  byte[][] createMap(byte[] paramArrayOfByte, int paramInt1, int paramInt2) {
    byte[][] arrayOfByte = (byte[][])null;
    try {
      createMapImage(paramArrayOfByte);
      type_of_element(paramArrayOfByte, this.aByte, this.maps.gameRun.skip);
      arrayOfByte = new byte[paramInt1][paramInt2];
      byte b;
      for (b = 0; b < paramInt1; b++) {
        for (byte b1 = 0; b1 < paramInt2; b1++)
          arrayOfByte[b][b1] = -1; 
      } 
      if (this.aByte == 0) {
        this.cellImage = null;
        return arrayOfByte;
      } 
      this.maps.gameRun.skip += this.aByte * 4;
      for (b = this.top; b < this.rows + this.top; b++) {
        for (byte b1 = this.left; b1 < this.cols + this.left; b1++)
          arrayOfByte[b1][b] = paramArrayOfByte[this.maps.gameRun.skip++]; 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return arrayOfByte;
  }
  
  void createCellImage(byte[] paramArrayOfByte, int paramInt) { this.cellImage = this.maps.gameRun.createCellImage(paramArrayOfByte, paramInt, this.maps.gameRun.skip); }
  
  void type_of_element(byte[] paramArrayOfByte, int paramInt1, int paramInt2) {
    this.type_area = new byte[paramInt1];
    for (int i = 0; i < paramInt1; i++)
      this.type_area[i] = paramArrayOfByte[paramInt2 + i]; 
  }
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/Layer.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */