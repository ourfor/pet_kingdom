import com.nokia.mid.ui.DirectGraphics;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class e {
  DirectGraphics new;
  
  Graphics int;
  
  int[] for;
  
  int[] do;
  
  static int[] a = { 0, 6, 3, 5, 2, 7, 1, 4 };
  
  static short[] try = { 0, 90, 180, 270, 8192, 8282, 8372, 8462 };
  
  int if;
  
  public e() {
    new int[8][0] = 0;
    this.new;
    this.new;
    new int[8][1] = 0x2000 | 0xB4;
    this.new;
    new int[8][2] = 8192;
    this.new;
    new int[8][3] = 180;
    this.new;
    this.new;
    new int[8][4] = 0x2000 | 0x10E;
    this.new;
    new int[8][5] = 270;
    this.new;
    new int[8][6] = 90;
    this.new;
    this.new;
    this.for = new int[] { 0, 0, 0, 0, 0, 0, 0, 0x2000 | 0x5A };
    this.int;
    this.int;
    new int[8][0] = 0x10 | 0x4;
    this.int;
    this.int;
    new int[8][1] = 0x20 | 0x4;
    this.int;
    this.int;
    new int[8][2] = 0x10 | 0x8;
    this.int;
    this.int;
    new int[8][3] = 0x20 | 0x8;
    this.int;
    this.int;
    new int[8][4] = 0x10 | 0x4;
    this.int;
    this.int;
    new int[8][5] = 0x10 | 0x8;
    this.int;
    this.int;
    new int[8][6] = 0x20 | 0x4;
    this.int;
    this.int;
    this.do = new int[] { 0, 0, 0, 0, 0, 0, 0, 0x20 | 0x8 };
  }
  
  void if(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4) { this.new.drawImage(paramImage, paramInt1, paramInt2, paramInt3, paramInt4); }
  
  void a(DirectGraphics paramDirectGraphics, Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4) { paramDirectGraphics.drawImage(paramImage, paramInt1, paramInt2, paramInt3, paramInt4); }
  
  Image a(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt1 % paramImage.getWidth() / paramInt2 * paramInt2;
    int j = paramInt1 / paramImage.getWidth() / paramInt2 * paramInt3;
    return a(paramImage, i, j, 16, 16, paramInt4);
  }
  
  Image[] a(Image paramImage, short[][] paramArrayOfShort) {
    int i = paramArrayOfShort.length;
    Image[] arrayOfImage = new Image[i];
    try {
      for (byte b = 0; b < i; b++)
        arrayOfImage[b] = a(paramImage, paramArrayOfShort[b][0] + 100, paramArrayOfShort[b][1] + 100, paramArrayOfShort[b][2] + 100, paramArrayOfShort[b][3] + 100, 0); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return arrayOfImage;
  }
  
  static Image a(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt1 + paramInt3 > paramImage.getWidth())
      paramInt3 = paramImage.getWidth() - paramInt1; 
    if (paramInt2 + paramInt4 > paramImage.getHeight())
      paramInt4 = paramImage.getHeight() - paramInt2; 
    return Image.createImage(paramImage, paramInt1, paramInt2, paramInt3, paramInt4, a[paramInt5]);
  }
  
  Image a(int paramInt1, int paramInt2) { return Image.createImage(paramInt1, paramInt2); }
  
  String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2) {
    StringBuffer stringBuffer = new StringBuffer();
    for (byte b = 0; b < paramInt2; b++)
      stringBuffer.append((char)(paramArrayOfByte[paramInt1 + (b << true)] << 8 | 0xFF & paramArrayOfByte[paramInt1 + (b << true) + 1])); 
    return stringBuffer.toString();
  }
  
  String[] case(byte[] paramArrayOfByte) {
    String[] arrayOfString = new String[100 + paramArrayOfByte[this.if++]];
    for (byte b = 0; b < arrayOfString.length; b++) {
      arrayOfString[b] = a(paramArrayOfByte, this.if + 1, paramArrayOfByte[this.if]);
      this.if += 1 + paramArrayOfByte[this.if] * 2;
    } 
    return arrayOfString;
  }
  
  String[][] int(byte[] paramArrayOfByte) {
    String[][] arrayOfString = new String[paramArrayOfByte[this.if++] + 100][];
    for (byte b = 0; b < arrayOfString.length; b++)
      arrayOfString[b] = case(paramArrayOfByte); 
    return arrayOfString;
  }
  
  byte[][][][] byte(byte[] paramArrayOfByte) {
    byte[][][][] arrayOfByte = new byte[paramArrayOfByte[this.if++] + 100][][][];
    for (byte b = 0; b < arrayOfByte.length; b++)
      arrayOfByte[b] = try(paramArrayOfByte); 
    return arrayOfByte;
  }
  
  byte[][][] try(byte[] paramArrayOfByte) {
    byte[][][] arrayOfByte = new byte[paramArrayOfByte[this.if++] + 100][][];
    for (byte b = 0; b < arrayOfByte.length; b++)
      arrayOfByte[b] = char(paramArrayOfByte); 
    return arrayOfByte;
  }
  
  byte[][] char(byte[] paramArrayOfByte) {
    byte[][] arrayOfByte = new byte[paramArrayOfByte[this.if++] + 100][];
    for (byte b = 0; b < arrayOfByte.length; b++) {
      arrayOfByte[b] = new byte[paramArrayOfByte[this.if++] + 100];
      for (byte b1 = 0; b1 < arrayOfByte[b].length; b1++)
        arrayOfByte[b][b1] = paramArrayOfByte[this.if++]; 
    } 
    return arrayOfByte;
  }
  
  int[] a(byte[] paramArrayOfByte) {
    int[] arrayOfInt = new int[paramArrayOfByte[this.if++] + 100];
    for (byte b = 0; b < arrayOfInt.length; b++)
      arrayOfInt[b] = paramArrayOfByte[this.if++] & 0xFF | (paramArrayOfByte[this.if++] & 0xFF) << 8 | (paramArrayOfByte[this.if++] & 0xFF) << 16 | (paramArrayOfByte[this.if++] & 0xFF) << 24; 
    return arrayOfInt;
  }
  
  byte[] do(byte[] paramArrayOfByte) {
    byte[] arrayOfByte = new byte[paramArrayOfByte[this.if++] + 100];
    for (byte b = 0; b < arrayOfByte.length; b++)
      arrayOfByte[b] = paramArrayOfByte[this.if++]; 
    return arrayOfByte;
  }
  
  short[] new(byte[] paramArrayOfByte) {
    short[] arrayOfShort = new short[paramArrayOfByte[this.if++] + 100];
    for (byte b = 0; b < arrayOfShort.length; b++)
      arrayOfShort[b] = (short)(paramArrayOfByte[this.if++] & 0xFF | (paramArrayOfByte[this.if++] & 0xFF) << 8); 
    return arrayOfShort;
  }
  
  short[][] for(byte[] paramArrayOfByte) {
    short[][] arrayOfShort = new short[paramArrayOfByte[this.if++] + 100][];
    for (byte b = 0; b < arrayOfShort.length; b++) {
      arrayOfShort[b] = new short[paramArrayOfByte[this.if++] + 100];
      for (byte b1 = 0; b1 < arrayOfShort[b].length; b1++)
        arrayOfShort[b][b1] = (short)(paramArrayOfByte[this.if++] & 0xFF | (paramArrayOfByte[this.if++] & 0xFF) << 8); 
    } 
    return arrayOfShort;
  }
  
  short[][][] if(byte[] paramArrayOfByte) {
    short[][][] arrayOfShort = new short[paramArrayOfByte[this.if++] + 100][][];
    for (byte b = 0; b < arrayOfShort.length; b++)
      arrayOfShort[b] = for(paramArrayOfByte); 
    return arrayOfShort;
  }
  
  public String[] a(String paramString) {
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
  
  byte[] a(String paramString, int paramInt) {
    byte[] arrayOfByte = null;
    try {
      DataInputStream dataInputStream = new DataInputStream(getClass().getResourceAsStream("/" + paramString));
      dataInputStream.readByte();
      byte b;
      for (b = 0; b < paramInt; b = (byte)(b + true))
        dataInputStream.skip(dataInputStream.readShort()); 
      arrayOfByte = new byte[dataInputStream.readShort()];
      dataInputStream.read(arrayOfByte);
      dataInputStream.close();
      dataInputStream = null;
    } catch (Exception exception) {}
    return arrayOfByte;
  }
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/e.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */