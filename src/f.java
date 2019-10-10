import com.nokia.mid.sound.Sound;
import com.nokia.mid.ui.DirectGraphics;
import com.nokia.mid.ui.DirectUtils;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class f extends l implements Runnable {
  int u;
  
  String b = "";
  
  final byte g = 12;
  
  Graphics case;
  
  DirectGraphics else;
  
  Font do = Font.getFont(0, 0, 8);
  
  static Random r = new Random();
  
  Image V;
  
  MM m;
  
  h a;
  
  public int t;
  
  private int z;
  
  boolean O = false;
  
  public static boolean S;
  
  public static boolean v;
  
  public static int k;
  
  Sound[] p;
  
  public boolean K = false;
  
  byte h = 0;
  
  int L;
  
  int J = 0;
  
  byte c = 0;
  
  byte d = 0;
  
  j n;
  
  byte W = 1;
  
  boolean f = false;
  
  private byte q;
  
  Image[] N = new Image[2];
  
  int G;
  
  byte j = 0;
  
  short E = 9;
  
  String long = "";
  
  byte X = 0;
  
  String[] P;
  
  StringBuffer[] Q;
  
  final byte U = 22;
  
  int w = -1;
  
  Image void;
  
  Image[] T;
  
  Image[][] M;
  
  byte e = 0;
  
  short C;
  
  byte F = 0;
  
  Image[] y;
  
  Image[] x;
  
  short[] A = new short[5];
  
  short[][][] l;
  
  byte[][] I;
  
  short[] s = { 16, 240, 240, 280, 100 };
  
  short[][][] o = { { { 0, 0, 0, 0 } }, { { 0, 4, 3, 54 }, { 0, 4, 47, 47 }, { 0, 4, 75, 61 }, { 0, 4, 125, 76 }, { 0, 4, 154, 70 }, { 0, 4, 192, 54 } }, { { 0, 3, 21, 84 }, { 0, 3, 87, 75 }, { 1, 3, 82, 84 }, { 1, 3, 148, 75 } }, { { 0, 2, -35, 83 }, { 1, 2, 31, 83 }, { 1, 2, 214, 83 }, { 0, 2, 148, 83 }, { 1, 2, 120, 76 }, { 0, 2, 54, 76 } }, { { 0, 1, 0, 198 } } };
  
  short[] B = { 16, 100, 132, 122, 42 };
  
  byte[][] i = { { 0, 1 }, { 23, 2 }, { 38, 3 }, { 51, 4 }, { 58, 5 }, { 72, 6 } };
  
  byte[] R = new byte[3];
  
  final byte[] D = { 49, 49, 57 };
  
  boolean H = false;
  
  public f(MM paramMM) {
    this.m = paramMM;
    this.a = new h(this);
    this.a.X();
    this.N[0] = this.a.aC[19];
    this.N[1] = this.a.aC[20];
    this.a.aa();
    case();
    System.gc();
  }
  
  private final void d() { this.n = new j(); }
  
  public final void new() { (new Thread(this)).start(); }
  
  public final void b() {
    if (this.a != null && this.a.bv != null)
      this.a.a(0, null, 4); 
    if (null != this.n)
      if(); 
  }
  
  public final void run() {
    long l1 = 0L;
    long l2 = 0L;
    try {
      while (!this.O) {
        byte b1;
        l1 = System.currentTimeMillis();
        if (this.f && null != this.n)
          this.n.a(this.K); 
        switch (this.t) {
          case 30:
            this.a.Q();
            break;
          case 10:
            void();
            a(this.h);
            this.h = 0;
            d();
            this.a.aV();
            this.a.av();
            do();
            break;
          case 60:
            if (this.z == 0 && this.E > 300) {
              System.gc();
              this.E = 0;
              long();
            } 
            break;
          case 61:
            for (b1 = 0; b1 <= 4; b1 = (byte)(b1 + 1))
              do(b1); 
            this.a.bV;
            b.u = null;
            System.gc();
            do(5);
            this.a.av();
            for (b1 = 6; b1 <= 9; b1 = (byte)(b1 + 1))
              do(b1); 
            System.gc();
            for (b1 = 10; b1 <= 13; b1 = (byte)(b1 + 1))
              do(b1); 
            case();
            for (b1 = 14; b1 <= 17; b1 = (byte)(b1 + 1))
              do(b1); 
            System.gc();
            for (b1 = 18; b1 <= 27; b1 = (byte)(b1 + 1))
              do(b1); 
            void();
            do();
            break;
        } 
        c();
        if (S || v)
          for(); 
        v = false;
        if (this.h > 0)
          char(); 
        this.j = (byte)(this.j + 1);
        if (this.j > 40) {
          this.j = 0;
          System.gc();
        } 
        l2 = System.currentTimeMillis() - l1;
        if (this.G > 0) {
          Thread.sleep(this.G);
          this.G = 0;
          continue;
        } 
        if (l2 < 80L)
          Thread.sleep(80L - l2 + 10L); 
      } 
    } catch (Exception exception) {
      this.t = 9999;
      this.b = "r" + exception.toString();
      exception.printStackTrace();
      c();
      while (k != 48);
    } 
    if (this.O || k == 48)
      this.m.destroyApp(true); 
  }
  
  void do() {
    a(3, false);
    this.t = 60;
    this.z = 0;
    this.q = 0;
    this.E = 0;
  }
  
  void do(int paramInt) {
    this.E = (short)(byte)(paramInt * 2);
    c();
    this.E = (short)(this.E + 1);
    c();
  }
  
  public void void() {
    if (this.V == null)
      this.V = this.a.a(240, 320); 
    Graphics graphics = this.V.getGraphics();
    this.C = (short)(this.I.length - 1);
    if(graphics);
  }
  
  public void c() {
    repaint();
    serviceRepaints();
  }
  
  void if(int paramInt) {
    this.case.setColor(paramInt);
    this.case.fillRect(0, 0, 240, 320);
  }
  
  protected final void paint(Graphics paramGraphics) {
    this.case = paramGraphics;
    this.else = DirectUtils.getDirectGraphics(paramGraphics);
    paramGraphics.setFont(this.do);
    try {
      short s1;
      char c1;
      switch (this.t) {
        case 30:
          this.a.a(paramGraphics);
          break;
        case 0:
          byte();
          break;
        case 13:
          if(paramGraphics);
          paramGraphics;
          paramGraphics;
          paramGraphics.drawImage(this.x[5], 2, 318, 0x4 | 0x20);
          break;
        case 21:
          this.a.aB();
          this.a.a(13, paramGraphics, (byte)1, 1, null);
          paramGraphics.setColor(16773120);
          paramGraphics.drawString("小提示:", 22, 60, 20);
          paramGraphics.setColor(16777215);
          if (this.Q != null)
            for (byte b1 = 0; b1 < this.Q.length; b1++)
              paramGraphics.drawString(this.Q[b1].toString(), 22, 79 + b1 * 22, 20);  
          this.a.if(15, 300, this.E, 54, 11731197, 11731197, 205);
          this.a.try(this.E, 15 + 205 * this.E / 27 / 2, 300);
          break;
        case 61:
          this.a.aB();
          this.a.if(15, 300, this.E, 54, 11731197, 11731197, 205);
          this.a.try(this.E, 15 + 205 * this.E / 27 / 2, 300);
          break;
        case 12:
          if(0);
        case 20:
          if (this.a.b2 >= 0) {
            this.a.int = paramGraphics;
            this.a.a(this.long, 10, 238);
            this.a.bh();
            this.a.i();
          } 
          break;
        case 60:
          switch (this.z) {
            case 0:
              c1 = 'Ď';
              paramGraphics.drawImage(this.V, 0, 0, 20);
              paramGraphics.setColor(16504);
              this.E = (short)(this.E + 1);
              if (this.E < 5) {
                if(240 - this.E * 240 / 2 / 5 + 10, c1);
              } else {
                if(120, c1);
              } 
              s1 = this.E % 90;
              if (s1 >= 30 && s1 <= 43) {
                byte[] arrayOfByte = { 
                    0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 
                    3, 4, 0, 0, 0, 0, 0 };
                paramGraphics.drawImage(this.M[1][arrayOfByte[s1 - 30] + 4], 154, 105, 20);
              } 
              break;
            case 3:
              if (this.q == 0) {
                this.q = 1;
                this.a.void();
                paramGraphics.setColor(4802889);
                paramGraphics;
                paramGraphics;
                paramGraphics.drawString("游戏帮助", 120, 12, true | 0x10);
                a(paramGraphics);
                this.a.i();
              } 
              break;
            case 4:
              if (this.q == 0) {
                this.q = 1;
                this.a.void();
                paramGraphics.setColor(4802889);
                a(paramGraphics);
                this.a.i();
              } 
              break;
          } 
          break;
        case 9999:
          paramGraphics.setColor(16711680);
          paramGraphics.drawString(this.t + " " + this.u + ":" + this.b, 0, 20, 20);
          paramGraphics.drawString(this.b, -128, 40, 20);
          paramGraphics.drawString(this.b, -256, 60, 20);
          paramGraphics.drawString("   " + this.a.c, 0, 80, 20);
          break;
      } 
    } catch (Exception exception) {
      paramGraphics.setClip(0, 0, 240, 320);
      paramGraphics.setColor(0);
      exception.printStackTrace();
      paramGraphics.drawString(exception.toString() + this.u + "game" + this.t, 20, 120, 20);
      while (k != 49);
      this.O = true;
    } 
  }
  
  private void a(Graphics paramGraphics) {
    this.d = (byte)((this.Q.length % 10 == 0) ? (this.Q.length / 10) : (this.Q.length / 10 + 1));
    byte b1 = 50;
    byte b2 = (byte)(10 * this.c);
    for (byte b3 = b2; b3 < this.Q.length && b3 != b2 + 10; b3++) {
      paramGraphics.drawString(this.Q[b3].toString(), 19, b1 + (b3 - b2) * 22, 20);
      if (this.Q.length > 10) {
        paramGraphics;
        paramGraphics;
        paramGraphics.drawString((this.c + 1) + "/" + this.d, 120, 308, true | 0x20);
        this.a.new = this.else;
        this.a.new(38, 16);
      } 
    } 
  }
  
  protected void hideNotify() {
    S = false;
    this.a;
    if (this.t == 30 && this.a.c != 88 && this.a.c != 98) {
      String[] arrayOfString = { "游戏暂停" };
      this.P = this.a.ah;
      this.a.ah = arrayOfString;
      this.X = this.a.c;
      this.a.c = 98;
    } 
    if (this.f)
      this.n.if(); 
  }
  
  protected void showNotify() {
    if (this.t != 30) {
      this.q = 0;
      if (this.f)
        a(this.n.byte, false); 
    } 
  }
  
  protected final void keyPressed(int paramInt) {
    if (paramInt == 50) {
      paramInt = -1;
    } else if (paramInt == 52) {
      paramInt = -3;
    } else if (paramInt == 54) {
      paramInt = -4;
    } else if (paramInt == 56) {
      paramInt = -2;
    } 
    this;
    k = paramInt;
    S = true;
    for(paramInt);
  }
  
  void else() {
    if (this.K) {
      this.K = false;
      if();
    } else {
      this.K = true;
      if (this.t != 30)
        a(3, false); 
    } 
  }
  
  void long() {
    if (this.n != null)
      if(); 
    this.C = 0;
    this.A = new short[5];
    this.J = 1;
    if (null == this.y)
      case(); 
    this.V = null;
    System.gc();
    this.V = this.a.a(240, 320);
    this.t = 13;
  }
  
  private final void for() {
    switch (this.t) {
      case 13:
        if (k == -6)
          this.t = 10; 
        break;
      case 12:
        if (k == -6 || k == -5 || k == 53) {
          this.K = true;
          long();
        } else if (k == -7) {
          this.K = false;
          long();
        } 
        this.a.aV();
        break;
      case 30:
        this.a.e(k);
        break;
      case 20:
        if (k == -6 || k == -5 || k == 53) {
          int();
          this.a.int();
          break;
        } 
        if (k == -7)
          do(); 
        break;
      case 60:
        switch (this.z) {
          case 0:
            this.a.aV();
            if (k == -6 || k == 53 || k == -5) {
              String[] arrayOfString;
              switch (this.a.bM) {
                case 1:
                  if();
                  this.t = 20;
                  arrayOfString = new String[] { this.a.bc[113], this.a.bc[112] };
                  this.long = this.a.bc[86] + this.a.bc[108] + this.a.bc[90] + this.a.bc[109] + this.a.bc[88];
                  this.a.ah = arrayOfString;
                  this.a.b2 = 0;
                  c();
                  break;
                case 0:
                  if();
                  int();
                  this.a.bV = null;
                  this.a.Z();
                  break;
                case 2:
                  else();
                  break;
                case 3:
                  this.z = 3;
                  this.a.a1();
                  this.c = 0;
                  this.J = 0;
                  this.q = 0;
                  break;
                case 4:
                  this.q = 0;
                  this.J = 0;
                  this.c = 0;
                  this.z = this.a.bM;
                  this.a.bm();
                  break;
                case 5:
                  this.O = true;
                  break;
                case 6:
                  this.m.a();
                  break;
              } 
              break;
            } 
            if (this.e == 0) {
              this.a.b = k;
              this.a.if(this.a.ah.length, 0, 16, 1, 0);
              if (k == -3) {
                this.e = -6;
              } else if (k == -4) {
                this.e = 6;
              } 
            } 
            this.E = 10;
            break;
          case 3:
            if (k == -7) {
              do();
              this.Q = null;
            } 
            try();
            this.a.aV();
            break;
          case 4:
            if (k == -7)
              do(); 
            try();
            this.a.aV();
            break;
        } 
        break;
    } 
  }
  
  private void try() {
    if (k == -1 || k == -3) {
      this.c = (byte)(this.c - 1);
      if (this.c < 0)
        this.c = (byte)(this.d - 1); 
      this.q = 0;
    } else if (k == -2 || k == -4) {
      this.c = (byte)(this.c + 1);
      if (this.c >= this.d)
        this.c = 0; 
      this.q = 0;
    } 
  }
  
  public void int() {
    a();
    this.V = null;
    this.M = (Image[][])null;
    this.E = 0;
    this.t = 21;
    String[] arrayOfString = this.a.a("tips");
    byte b1 = (byte)int(arrayOfString.length);
    this.Q = if(arrayOfString[b1], 196);
    arrayOfString = null;
    this.a.b2 = -1;
    c();
  }
  
  protected final void keyReleased(int paramInt) { S = false; }
  
  public Image a(String paramString) {
    try {
      return Image.createImage(paramString);
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public Image[] a(int paramInt, String paramString) { return if(paramInt, paramString); }
  
  public Image[] if(int paramInt, String paramString) {
    Image[] arrayOfImage = new Image[paramInt];
    try {
      DataInputStream dataInputStream = new DataInputStream(getClass().getResourceAsStream("/" + paramString + ".dat"));
      dataInputStream.readByte();
      byte[] arrayOfByte = null;
      byte b1;
      for (b1 = 0; b1 < paramInt; b1 = (byte)(b1 + true)) {
        arrayOfByte = new byte[dataInputStream.readShort()];
        dataInputStream.read(arrayOfByte);
        arrayOfImage[b1] = Image.createImage(arrayOfByte, 0, arrayOfByte.length);
        arrayOfByte = null;
      } 
      dataInputStream.close();
      dataInputStream = null;
    } catch (IOException iOException) {}
    return arrayOfImage;
  }
  
  public void goto() {
    this.else = DirectUtils.getDirectGraphics(this.case);
    if(7135485);
    int[] arrayOfInt1 = { 0, 8, 16, 8 };
    int[] arrayOfInt2 = { 8, 0, 8, 16 };
    for (byte b1 = 0; b1 <= 'ð'; b1 += 16) {
      for (byte b2 = 0; b2 <= 'ŀ'; b2 += 16) {
        this.case.translate(b2, b1);
        this.else.fillPolygon(arrayOfInt1, 0, arrayOfInt2, 0, 4, -10763287);
        this.case.translate(-b2, -b1);
      } 
    } 
  }
  
  Sound a(String paramString, int paramInt) {
    Sound sound = null;
    try {
      byte[] arrayOfByte = null;
      InputStream inputStream = getClass().getResourceAsStream(paramString);
      arrayOfByte = new byte[paramInt];
      inputStream.read(arrayOfByte);
      sound = new Sound(arrayOfByte, 5);
      arrayOfByte = null;
      sound.setGain(100);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return sound;
  }
  
  void a(int paramInt1, int paramInt2) {
    this.h = (byte)paramInt1;
    this.L = (byte)paramInt2;
  }
  
  public void char() {
    if (this.K)
      if (this.L == -1 && this.p[this.h - 1].getState() != 0) {
        this.p[this.h - 1].play(1);
      } else if (this.L > 0 && this.p[this.h - 1].getState() != 0) {
        this.p[this.h - 1].play(1);
        this.L--;
      } else if (this.L == 0) {
        this.h = 0;
      }  
  }
  
  void a(int paramInt) {
    if (paramInt >= 0 && paramInt < this.p.length && this.p[paramInt] != null)
      this.p[paramInt].stop(); 
  }
  
  static int int(int paramInt) { return (r.nextInt() & 0x7FFFFFFF) % paramInt; }
  
  protected void byte() {
    if (this.w < 0) {
      this.w = 0;
    } else {
      if (this.w >= 0 && this.w < 10) {
        if(16777215);
        if (this.w == 0) {
          this.a.int = this.case;
          this.V = a("/logo.png");
        } 
        this.case;
        this.case;
        this.case.drawImage(this.V, 120, 160, true | 0x2);
      } else if (this.w >= 10 && this.w < 22) {
        if (this.w == 10)
          this.V = null; 
        new(20);
      } else if (this.w == 22) {
        this.a.int = this.case;
        this.T = null;
        this.V = null;
        this.a.b2 = 0;
        this.t = 12;
        this.long = "是否开始音乐?";
      } 
      this.w++;
    } 
    this.case.setClip(0, 0, 240, 320);
  }
  
  protected void new(int paramInt) {
    if (null == this.T)
      this.T = a(1, "logo"); 
    if(16777215);
    this.case;
    this.case;
    this.case.drawImage(this.T[0], 120, 160, true | 0x2);
  }
  
  void a(int paramInt, boolean paramBoolean) { this.f = this.n.a(paramInt, paramBoolean); }
  
  void if() { this.f = this.n.if(); }
  
  private void if(int paramInt1, int paramInt2) {
    int i1 = this.M[0][this.a.bM].getWidth() / 2 + 8 + this.E % 6 / 2;
    if (this.e < -4) {
      this.case;
      this.case;
      this.case.drawImage(this.M[1][1], paramInt1 - i1 - 2, paramInt2, 0x8 | 0x2);
    } else {
      this.case;
      this.case;
      this.case.drawImage(this.M[1][0], paramInt1 - i1, paramInt2, 0x8 | 0x2);
    } 
    if (this.e > 4) {
      this.case;
      this.case;
      this.else;
      this.a.a(this.else, this.M[1][1], paramInt1 + i1 + 2, paramInt2, 0x4 | 0x2, 8192);
    } else {
      this.case;
      this.case;
      this.else;
      this.a.a(this.else, this.M[1][0], paramInt1 + i1, paramInt2, 0x4 | 0x2, 8192);
    } 
    i1 += 2;
    this.case.setClip(paramInt1 - i1, 0, i1 * 2, 320);
    int i2 = this.M[0][this.a.bM].getWidth() + 30;
    int i3 = this.M[0].length;
    paramInt1 += i2 * this.e / 6;
    if (this.e > 0) {
      this.e = (byte)(this.e - 1);
    } else if (this.e < 0) {
      this.e = (byte)(this.e + 1);
    } 
    for (int i4 = -1; i4 <= 1; i4++) {
      this.case;
      this.case;
      this.case.drawImage(this.M[0][(this.a.bM + i3 + i4) % i3], paramInt1 + i2 * i4, paramInt2, true | 0x2);
      if (this.a.bM + i4 == 2)
        if (this.K) {
          this.case;
          this.case;
          this.case.drawImage(this.M[1][2], paramInt1 + i2 * i4 + 10, paramInt2, 0x4 | 0x2);
        } else {
          this.case;
          this.case;
          this.case.drawImage(this.M[1][3], paramInt1 + i2 * i4 + 10, paramInt2, 0x4 | 0x2);
        }  
    } 
    this.case.setClip(0, 0, 240, 320);
  }
  
  public void if(Graphics paramGraphics) {
    Graphics graphics = this.V.getGraphics();
    this.else = DirectUtils.getDirectGraphics(graphics);
    if (this.F == 0)
      for (int i2 = this.i.length - 1; i2 >= 0; i2--) {
        if (this.i[i2][0] == this.C) {
          a(this.i[i2][1], 1);
          break;
        } 
      }  
    byte[] arrayOfByte = { 1, 1, 2, 3, 3 };
    int i1;
    for (i1 = 0; i1 < this.o.length; i1++) {
      short s3;
      for (s3 = this.A[i1] - 352; s3 <= 240; s3 += this.s[i1]) {
        for (int i2 = this.o[i1].length - 1; i2 >= 0; i2--) {
          if (s3 + this.o[i1][i2][2] > -this.B[this.o[i1][i2][1]] && s3 + this.o[i1][i2][2] <= 240)
            if (this.o[i1][i2][0] == 0) {
              graphics.drawImage(this.x[this.o[i1][i2][1]], this.o[i1][i2][2] + s3, this.o[i1][i2][3], 20);
            } else {
              this.else;
              this.a.a(this.else, this.x[this.o[i1][i2][1]], this.o[i1][i2][2] + s3, this.o[i1][i2][3], 20, 8192);
            }  
        } 
      } 
      if (this.C < 25)
        this.A[i1] = (short)(this.A[i1] + arrayOfByte[i1] * 3); 
    } 
    if (this.C > 47 && this.C <= 51)
      for (i1 = 0; i1 <= 240; i1 += 16) {
        for (byte b2 = 0; b2 <= 'ŀ'; b2 += 16)
          graphics.drawImage(this.y[43 + this.C - 48], i1, b2, 20); 
      }  
    i1 = this.l[this.I[this.C][0]].length;
    short s1 = 223;
    short s2 = 302;
    byte b1;
    for (b1 = 0; b1 < i1; b1 = (byte)(b1 + true)) {
      if (this.l[this.I[this.C][0]][b1][3] == 0) {
        graphics.drawImage(this.y[this.l[this.I[this.C][0]][b1][0]], this.l[this.I[this.C][0]][b1][1] + s1, this.l[this.I[this.C][0]][b1][2] + s2, this.a.do[this.l[this.I[this.C][0]][b1][3]]);
      } else {
        this.a.a(this.else, this.y[this.l[this.I[this.C][0]][b1][0]], this.l[this.I[this.C][0]][b1][1] + s1, this.l[this.I[this.C][0]][b1][2] + s2, this.a.do[this.l[this.I[this.C][0]][b1][3]], this.a.for[this.l[this.I[this.C][0]][b1][3]]);
      } 
    } 
    if (this.C >= 44 && this.C <= 47) {
      int[] arrayOfInt = { 10418943, 16762368, 16777215, 10418943 };
      graphics.setColor(arrayOfInt[this.C - 44]);
      graphics.fillRect(0, 0, 240, 320);
    } 
    this.F = (byte)(this.F + 1);
    if (this.F >= this.I[this.C][1]) {
      this.F = 0;
      this.C = (short)(this.C + 1);
    } 
    if (this.C >= this.I.length)
      this.t = 10; 
    paramGraphics.drawImage(this.V, 0, 0, 20);
  }
  
  public void case() {
    this.y = a(47, "fengmian");
    this.x = a(6, "bg");
    byte[] arrayOfByte = this.a.b(2);
    this.a.if = 0;
    this.l = this.a.if(arrayOfByte);
    this.I = this.a.char(arrayOfByte);
    arrayOfByte = null;
    int[] arrayOfInt = { 23961, 1760, 7948, 2845, 4184, 1641 };
    this.p = new Sound[arrayOfInt.length];
    for (byte b1 = 0; b1 < arrayOfInt.length; b1++)
      this.p[b1] = a("/wav/" + b1 + ".wav", arrayOfInt[b1]); 
  }
  
  public void a() {
    this.y = null;
    this.x = null;
    this.l = (short[][][])null;
    this.I = (byte[][])null;
    this.p = null;
  }
  
  public StringBuffer[] if(String paramString, int paramInt) {
    StringBuffer[] arrayOfStringBuffer1 = new StringBuffer[50];
    StringBuffer stringBuffer1 = new StringBuffer();
    StringBuffer stringBuffer2 = new StringBuffer();
    StringBuffer stringBuffer3 = new StringBuffer(paramString);
    int i1 = paramString.length();
    byte b1 = -1;
    boolean bool = false;
    for (byte b2 = 0; b2 < i1; b2++) {
      stringBuffer1.append(stringBuffer3.charAt(0));
      if (this.do.stringWidth(stringBuffer1.toString()) <= paramInt) {
        stringBuffer2.append(stringBuffer3.charAt(0));
        stringBuffer3.deleteCharAt(0);
      } else {
        b2--;
        stringBuffer1 = new StringBuffer();
        bool = true;
        b1++;
      } 
      if (b2 == i1 - 1 && !bool) {
        bool = true;
        b1++;
      } 
      if (bool) {
        bool = false;
        arrayOfStringBuffer1[b1] = stringBuffer2;
        stringBuffer2 = new StringBuffer();
      } 
    } 
    StringBuffer[] arrayOfStringBuffer2 = new StringBuffer[b1 + 1];
    System.arraycopy(arrayOfStringBuffer1, 0, arrayOfStringBuffer2, 0, b1 + 1);
    return arrayOfStringBuffer2;
  }
  
  public void a(String[] paramArrayOfString, int paramInt) {
    StringBuffer[] arrayOfStringBuffer = new StringBuffer[60];
    int i1 = 0;
    for (byte b1 = 0; b1 < paramArrayOfString.length; b1++) {
      StringBuffer[] arrayOfStringBuffer1 = if(paramArrayOfString[b1], paramInt);
      System.arraycopy(arrayOfStringBuffer1, 0, arrayOfStringBuffer, i1, arrayOfStringBuffer1.length);
      i1 += arrayOfStringBuffer1.length;
    } 
    this.Q = new StringBuffer[i1];
    System.arraycopy(arrayOfStringBuffer, 0, this.Q, 0, i1);
  }
  
  private void for(int paramInt) {
    if (null != this.a && this.a.c == 99 && !this.H) {
      int i1 = 0;
      for (i1 = this.R.length - 1; i1 >= 1; i1--)
        this.R[i1] = this.R[i1 - 1]; 
      this.R[0] = (byte)paramInt;
      for (i1 = this.R.length - 1; i1 >= 0; i1--) {
        if (this.R[i1] != this.D[i1])
          return; 
      } 
      this.H = false;
    } 
  }
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/f.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */