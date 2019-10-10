import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class GameRun_Father {
  DirectGraphics dg;
  
  Graphics g;
  
  int[] F_flag = { 0, 1, 2, 3, 4, 5, 6, 7 };
  
  int[] F_flag2;
  
  static int[] transA = { 0, 6, 3, 5, 2, 7, 1, 4 };
  
  int skip;
  
  public GameRun_Father() {
    this.g;
    this.g;
    new int[8][0] = 0x10 | 0x4;
    this.g;
    this.g;
    new int[8][1] = 0x20 | 0x4;
    this.g;
    this.g;
    new int[8][2] = 0x10 | 0x8;
    this.g;
    this.g;
    new int[8][3] = 0x20 | 0x8;
    this.g;
    this.g;
    new int[8][4] = 0x10 | 0x4;
    this.g;
    this.g;
    new int[8][5] = 0x10 | 0x4;
    this.g;
    this.g;
    new int[8][6] = 0x10 | 0x4;
    this.g;
    this.g;
    this.F_flag2 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0x10 | 0x4 };
  }
  
  void drawImage(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4) { this.dg.drawImage(paramImage, paramInt1, paramInt2, paramInt3, paramInt4); }
  
  void drawImage(DirectGraphics paramDirectGraphics, Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4) { paramDirectGraphics.drawImage(paramImage, paramInt1, paramInt2, paramInt3, paramInt4); }
  
  Image[] createImage(Image paramImage, byte[][] paramArrayOfByte) {
    int i = paramArrayOfByte.length;
    Image[] arrayOfImage = new Image[i];
    try {
      for (byte b = 0; b < i; b++)
        arrayOfImage[b] = createImage(paramImage, paramArrayOfByte[b][0] + 100, paramArrayOfByte[b][1] + 100, paramArrayOfByte[b][2] + 100, paramArrayOfByte[b][3] + 100, 0); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return arrayOfImage;
  }
  
  static Image createImage(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt1 + paramInt3 > paramImage.getWidth())
      paramInt3 = paramImage.getWidth() - paramInt1; 
    if (paramInt2 + paramInt4 > paramImage.getHeight())
      paramInt4 = paramImage.getHeight() - paramInt2; 
    return Image.createImage(paramImage, paramInt1, paramInt2, paramInt3, paramInt4, transA[paramInt5]);
  }
  
  String getDialogs(byte[] paramArrayOfByte, int paramInt1, int paramInt2) {
    StringBuffer stringBuffer = new StringBuffer();
    for (byte b = 0; b < paramInt2; b++)
      stringBuffer.append((char)(paramArrayOfByte[paramInt1 + (b << true)] << 8 | 0xFF & paramArrayOfByte[paramInt1 + (b << true) + 1])); 
    return stringBuffer.toString().replace('—', '-');
  }
  
  String[] createStringArray(byte[] paramArrayOfByte) {
    String[] arrayOfString = new String[100 + paramArrayOfByte[this.skip++]];
    for (byte b = 0; b < arrayOfString.length; b++) {
      arrayOfString[b] = getDialogs(paramArrayOfByte, this.skip + 1, paramArrayOfByte[this.skip]);
      this.skip += 1 + paramArrayOfByte[this.skip] * 2;
    } 
    return arrayOfString;
  }
  
  String[][] create2StringArray(byte[] paramArrayOfByte) {
    String[][] arrayOfString = new String[paramArrayOfByte[this.skip++] + 100][];
    for (byte b = 0; b < arrayOfString.length; b++)
      arrayOfString[b] = createStringArray(paramArrayOfByte); 
    return arrayOfString;
  }
  
  byte[][][][] create4Array(byte[] paramArrayOfByte) {
    byte[][][][] arrayOfByte = new byte[paramArrayOfByte[this.skip++] + 100][][][];
    for (byte b = 0; b < arrayOfByte.length; b++)
      arrayOfByte[b] = create3Array(paramArrayOfByte); 
    return arrayOfByte;
  }
  
  byte[][][] create3Array(byte[] paramArrayOfByte) {
    byte[][][] arrayOfByte = new byte[paramArrayOfByte[this.skip++] + 100][][];
    for (byte b = 0; b < arrayOfByte.length; b++)
      arrayOfByte[b] = create2Array(paramArrayOfByte); 
    return arrayOfByte;
  }
  
  byte[][] create2Array(byte[] paramArrayOfByte) {
    byte[][] arrayOfByte = new byte[paramArrayOfByte[this.skip++] + 100][];
    for (byte b = 0; b < arrayOfByte.length; b++) {
      arrayOfByte[b] = new byte[paramArrayOfByte[this.skip++] + 100];
      for (byte b1 = 0; b1 < arrayOfByte[b].length; b1++)
        arrayOfByte[b][b1] = paramArrayOfByte[this.skip++]; 
    } 
    return arrayOfByte;
  }
  
  int[] createIntArray(byte[] paramArrayOfByte) {
    int[] arrayOfInt = new int[paramArrayOfByte[this.skip++] + 100];
    for (byte b = 0; b < arrayOfInt.length; b++)
      arrayOfInt[b] = paramArrayOfByte[this.skip++] & 0xFF | (paramArrayOfByte[this.skip++] & 0xFF) << 8 | (paramArrayOfByte[this.skip++] & 0xFF) << 16 | (paramArrayOfByte[this.skip++] & 0xFF) << 24; 
    return arrayOfInt;
  }
  
  byte[] createArray(byte[] paramArrayOfByte) {
    byte[] arrayOfByte = new byte[paramArrayOfByte[this.skip++] + 100];
    for (byte b = 0; b < arrayOfByte.length; b++)
      arrayOfByte[b] = paramArrayOfByte[this.skip++]; 
    return arrayOfByte;
  }
  
  short[] createShortArray(byte[] paramArrayOfByte) {
    short[] arrayOfShort = new short[paramArrayOfByte[this.skip++] + 100];
    for (byte b = 0; b < arrayOfShort.length; b++)
      arrayOfShort[b] = (short)(paramArrayOfByte[this.skip++] & 0xFF | (paramArrayOfByte[this.skip++] & 0xFF) << 8); 
    return arrayOfShort;
  }
  
  short[][] create2ShortArray(byte[] paramArrayOfByte) {
    short[][] arrayOfShort = new short[paramArrayOfByte[this.skip++] + 100][];
    for (byte b = 0; b < arrayOfShort.length; b++) {
      arrayOfShort[b] = new short[paramArrayOfByte[this.skip++] + 100];
      for (byte b1 = 0; b1 < arrayOfShort[b].length; b1++)
        arrayOfShort[b][b1] = (short)(paramArrayOfByte[this.skip++] & 0xFF | (paramArrayOfByte[this.skip++] & 0xFF) << 8); 
    } 
    return arrayOfShort;
  }
  
  short[][][] create3ShortArray(byte[] paramArrayOfByte) {
    short[][][] arrayOfShort = new short[paramArrayOfByte[this.skip++] + 100][][];
    for (byte b = 0; b < arrayOfShort.length; b++)
      arrayOfShort[b] = create2ShortArray(paramArrayOfByte); 
    return arrayOfShort;
  }
  
  public String[] loadText(String paramString) {
    String[] arrayOfString;
    paramString = "/doc/" + paramString;
    String str = "";
    try {
      inputStream = getClass().getResourceAsStream(paramString);
      byte[] arrayOfByte = new byte[inputStream.available()];
      inputStream.skip(2L);
      inputStream.read(arrayOfByte);
      inputStream.close();
      arrayOfString = new StringBuffer("");
      byte b = 0;
      while (b < arrayOfByte.length) {
        byte b1 = arrayOfByte[b++];
        if (b1 < 0)
          b1 += 256; 
        byte b2 = arrayOfByte[b++];
        if (b2 < 0)
          b2 += 256; 
        char c = (char)(b1 + (b2 << 8));
        arrayOfString.append(c);
      } 
      str = arrayOfString.toString();
    } catch (IOException null) {
      arrayOfString.printStackTrace();
    } finally {
      Object object = null;
    } 
    Vector vector = new Vector();
    try {
      byte b1 = 0;
      byte b2 = 0;
      byte b3;
      for (b3 = 0; b3 < str.length(); b3++) {
        if (str.charAt(b3) == '\n' || b3 == str.length()) {
          String str1 = str.substring(b1, b2 - true);
          vector.addElement(str1);
          b1 = b2 + true;
        } 
        b2++;
      } 
      arrayOfString = new String[vector.size()];
      for (b3 = 0; b3 < vector.size(); b3++) {
        String str1 = (String)vector.elementAt(b3);
        arrayOfString[b3] = str1;
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
    return arrayOfString;
  }
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/GameRun_Father.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */