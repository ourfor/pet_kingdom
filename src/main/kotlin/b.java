import com.nokia.mid.ui.DirectGraphics;
import com.nokia.mid.ui.DirectUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class b {
  static Graphics aG;
  
  static Image u;
  
  String[] aI;
  
  byte P = -1;
  
  byte O = -1;
  
  byte aE = -1;
  
  byte av = 1;
  
  Image[][] aK;
  
  c void;
  
  c G;
  
  byte a6;
  
  byte al;
  
  byte aj;
  
  byte aX;
  
  byte[][] z;
  
  byte[][] k;
  
  static DirectGraphics w;
  
  static Graphics ab;
  
  byte as;
  
  int Z;
  
  int Y;
  
  short int;
  
  short K;
  
  short aD;
  
  short A;
  
  int if;
  
  int ba;
  
  byte af;
  
  byte ad;
  
  byte aZ;
  
  byte aS;
  
  byte else;
  
  byte e;
  
  byte am;
  
  byte p;
  
  byte b;
  
  byte X;
  
  byte V;
  
  byte a5;
  
  byte x;
  
  byte g;
  
  byte ar;
  
  byte L;
  
  byte j = 4;
  
  byte aM = 100;
  
  byte[][] ae = { { 1, 0, 2, 0 }, { 1, 0, 1, 0 }, { 1, 0, 2, 0 }, { 0, 0, 0, 0 } };
  
  byte[][] aF = { { 6, 0, 3, 3 }, { 4, 0, 2, 2 }, { 6, 0, 3, 3 }, { 6, 0, 3, 3 } };
  
  Image[] aY;
  
  byte h = 0;
  
  byte an = 0;
  
  byte[] goto;
  
  byte[] aV;
  
  byte[][] ag;
  
  byte[][] o;
  
  byte[][] aT;
  
  byte[][] char;
  
  byte y = 0;
  
  byte a4;
  
  byte ay = 0;
  
  byte aJ;
  
  byte v = 30;
  
  byte aQ = 4;
  
  byte a = 0;
  
  int aa;
  
  byte[][] W;
  
  short[] new;
  
  short[][] aR;
  
  byte T;
  
  byte S;
  
  StringBuffer[] Q;
  
  byte aH = -1;
  
  byte ap = -1;
  
  byte ah;
  
  h aC;
  
  byte[][] I = new byte[74][];
  
  Image[] c;
  
  byte s = 0;
  
  byte ax = -2;
  
  byte[][] N;
  
  byte[] a8;
  
  byte[] E;
  
  String[] aP;
  
  String[] a2;
  
  byte q;
  
  String for;
  
  byte long = 0;
  
  byte t = -1;
  
  byte aw = -1;
  
  k F;
  
  a at;
  
  int m = -1000;
  
  short i = -1;
  
  String[] a1;
  
  byte do = 0;
  
  byte aB = 4;
  
  byte[] a0 = { 
      0, 1, 1, 2, 2, 3, 2, 2, 1, 1, 
      0 };
  
  int H = 4;
  
  byte[][] D = { 
      { 0, 0 }, { 1, 0 }, { 0, 0 }, { 1, 0 }, { 0, 0 }, { 2, 0 }, { 3, -1 }, { 4, -1 }, { 5, -3 }, { 6, -1 }, 
      { 6, -1 }, { 4, -1 } };
  
  byte a3 = 0;
  
  int ak = 0;
  
  int aO = 0;
  
  int az = 0;
  
  int aq = 0;
  
  int C = 0;
  
  int aN = 0;
  
  byte l = 0;
  
  Image[] aA;
  
  Image d;
  
  private int a9;
  
  private int a7;
  
  boolean r = true;
  
  byte[][][] B = { { { 0, 0 }, { 0, -4 }, { 0, 4 }, { -4, 0 }, { 4, 0 } }, { { 0, 0 }, { 0, -8 }, { 0, 8 }, { -8, 0 }, { 8, 0 } }, { { 0, 0 }, { 0, -4 }, { 0, 4 }, { -4, 0 }, { 4, 0 } }, { { 0, 0 }, { 0, -4 }, { 0, 4 }, { -4, 0 }, { 4, 0 } } };
  
  byte aU;
  
  byte R = 0;
  
  byte case = 0;
  
  Image[] n;
  
  short[] au = { -1, -2, -2, 1, 0 };
  
  byte[][] ac;
  
  byte[][] ai;
  
  Image[] byte;
  
  short[] U = null;
  
  byte[] aW = { 0, 4, 2, 0, 0 };
  
  byte[][] aL = { { 0, 0, 0, -2, 2 }, { 0, -2, 2, 0, 0 } };
  
  byte[][] ao;
  
  Image[] J;
  
  byte[][] M;
  
  Vector f;
  
  byte try = -1;
  
  public void byte() {
    u = this.aC.a(256, 336);
    aG = u.getGraphics();
  }
  
  public void else() {
    this.I = (byte[][])null;
    this.I = new byte[74][];
  }
  
  public void try(int paramInt1, int paramInt2) {
    if (paramInt1 == 0) {
      this.aQ = (byte)(new(19) + 1);
      this.aJ = (byte)((this.aQ - 10) * (this.aQ - 10));
      if (this.aJ == 0)
        this.aJ = 10; 
      if (this.aJ > new(120))
        this.aQ = (byte)(12 + new(9) - new(9)); 
      this.aJ = 0;
      if (this.h == 1)
        this.aQ = (byte)(this.aQ + 15); 
      this.aJ = 0;
    } else if (paramInt1 == 1) {
      this.ay = 1;
      this.aQ = (byte)(this.v * (paramInt2 - 27 + 2));
      this.aJ = 0;
    } 
  }
  
  public void y() {
    byte[] arrayOfByte = this.aC.b(4);
    this.aC.if = 0;
    this.ac = this.aC.char(arrayOfByte);
    this.ai = this.aC.char(arrayOfByte);
    this.ao = this.aC.char(arrayOfByte);
    this.N = this.aC.char(arrayOfByte);
    this.a1 = this.aC.case(arrayOfByte);
    this.a8 = this.aC.do(arrayOfByte);
    this.E = this.aC.do(arrayOfByte);
    this.aP = this.aC.case(arrayOfByte);
    this.a2 = this.aC.case(arrayOfByte);
    arrayOfByte = null;
    this.a8 = new byte[] { 2, 10, 20, 30, 40, 101 };
  }
  
  public b(h paramh) {
    this.aC = paramh;
    this.aI = paramh.a("map");
    y();
    j();
    try(0, 0);
    this.aV = paramh.a(8, null, 1);
    this.goto = paramh.a(1, null, 1);
    char(this.h);
    for (byte b1 = 0; b1 < this.goto.length; b1++) {
      if (this.goto[b1] == 1 && null == this.I[b1])
        this.I[b1] = paramh.a(9 + b1, null, 1); 
    } 
    q();
    case();
    c();
  }
  
  public void char(int paramInt) {
    this.c = this.aC.Y.a(7, "face");
    if (paramInt != 1) {
      Image image = this.aC.g(6);
      this.aY = new Image[9];
      for (byte b1 = 0; b1 < 9; b1++)
        this.aY[b1] = this.aC.a(image, b1, 16, 17, 0); 
      image = null;
    } else {
      this.aY = null;
      this.aY = new Image[6];
      Image image = this.aC.g(9);
      for (byte b1 = 0; b1 < 6; b1++) {
        this.aC;
        this.aY[b1] = e.a(image, this.aC.bu[b1][0], this.aC.bu[b1][1], this.aC.bu[b1][2], this.aC.bu[b1][3], 0);
      } 
    } 
  }
  
  void j() {
    this.aC.a(2, null, 0);
    byte[] arrayOfByte = this.aC.a(2, null, 1);
    if (arrayOfByte[0] == -1) {
      byte[] arrayOfByte1 = { 
          0, 6, 12, 2, 6, 1, 2, 0, 0, 0, 
          0, 0, 0, 0, 0, 0, 60, 0, 0, 0, 
          1, 5 };
      arrayOfByte = arrayOfByte1;
      this.aC.a(2, arrayOfByte1, 2);
      this.aR = new short[76][];
      this.aC.a(3, a(this.aR), 2);
    } else {
      this.aR = w();
    } 
    this.y = arrayOfByte[0];
    this.if = arrayOfByte[1] * 16;
    this.ba = arrayOfByte[2] * 16;
    this.aZ = arrayOfByte[3];
    this.aS = arrayOfByte[4];
    this.p = arrayOfByte[5];
    this.b = arrayOfByte[6];
    l();
    this.aC.bt = (arrayOfByte[10] & 0xFF) << 24 | (arrayOfByte[9] & 0xFF) << 16 | (arrayOfByte[8] & 0xFF) << 8 | arrayOfByte[7] & 0xFF;
    this.aC.n = arrayOfByte[11];
    this.aC.goto = (arrayOfByte[15] & 0xFF) << 24 | (arrayOfByte[14] & 0xFF) << 16 | (arrayOfByte[13] & 0xFF) << 8 | arrayOfByte[12] & 0xFF;
    this.aC.aF = arrayOfByte[16];
    this.X = arrayOfByte[17];
    this.V = arrayOfByte[18];
    this.aC.bh = arrayOfByte[19];
    this.aC.bE = arrayOfByte[20];
    this.aC.aR = arrayOfByte[21];
  }
  
  void s() {
    byte[] arrayOfByte = new byte[22];
    arrayOfByte[0] = this.y;
    arrayOfByte[5] = this.p;
    arrayOfByte[6] = this.b;
    arrayOfByte[1] = (byte)(this.if / 16);
    arrayOfByte[2] = (byte)(this.ba / 16);
    arrayOfByte[3] = this.aZ;
    arrayOfByte[4] = this.aS;
    arrayOfByte[7] = (byte)(this.aC.bt & 0xFF);
    arrayOfByte[8] = (byte)(this.aC.bt >> 8 & 0xFF);
    arrayOfByte[9] = (byte)(this.aC.bt >> 16 & 0xFF);
    arrayOfByte[10] = (byte)(this.aC.bt >> 24 & 0xFF);
    arrayOfByte[11] = this.aC.n;
    arrayOfByte[12] = (byte)(this.aC.goto & 0xFF);
    arrayOfByte[13] = (byte)(this.aC.goto >> 8 & 0xFF);
    arrayOfByte[14] = (byte)(this.aC.goto >> 16 & 0xFF);
    arrayOfByte[15] = (byte)(this.aC.goto >> 24 & 0xFF);
    arrayOfByte[16] = this.aC.aF;
    arrayOfByte[17] = this.X;
    arrayOfByte[18] = this.V;
    arrayOfByte[19] = this.aC.bh;
    arrayOfByte[20] = this.aC.bE;
    arrayOfByte[21] = this.aC.aR;
    this.aC.a(2, arrayOfByte, 2);
  }
  
  void i() {
    s();
    d();
    for (byte b1 = 0; b1 < this.aV.length / 2; b1++) {
      if (this.goto[b1] == 1) {
        this.goto[b1] = 0;
        this.aC.a(9 + b1, this.I[b1], 2);
      } 
    } 
    else();
    this.aC.a(8, this.aV, 2);
    this.aC.a(3, a(this.aR), 2);
    this.aC.a(1, this.goto, 2);
  }
  
  void for() {
    Image image = this.aC.g(7);
    this.aK = (Image[][])null;
    this.aK = new Image[3][37];
    byte b1;
    for (b1 = 0; this.aT != null && b1 < this.aT.length; b1++) {
      for (byte b2 = 0; b2 < 3; b2++) {
        if (this.aT[b1][2] < 33 && this.aK[b2][this.aT[b1][2]] == null)
          this.aK[b2][this.aT[b1][2]] = this.aC.a(image, b2 * 11 + this.aT[b1][2], 16, 17, 0); 
      } 
    } 
    if (null == this.aK[false][33])
      for (b1 = 0; b1 < 3; b1++)
        this.aK[b1][33] = this.aC.Y.a("/image/diam" + b1 + ".png");  
    if (null == this.aK[false][34]) {
      this.aK[2][34] = this.aC.Y.a("/image/god.png");
      this.aK[1][34] = this.aC.Y.a("/image/god.png");
      this.aK[0][34] = this.aC.Y.a("/image/god.png");
    } 
    if (null == this.aK[false][35]) {
      this.aK[0][35] = this.aC.Y.a("/image/boat2.png");
      this.aK[0][36] = this.aC.Y.a("/image/boat1.png");
    } 
    image = null;
    x();
  }
  
  void do() {
    if (null == this.J) {
      Image image = this.aC.g(11);
      this.J = new Image[21];
      for (byte b1 = 0; b1 < 21; b1++)
        this.J[b1] = this.aC.a(image, b1, 16, 16, 0); 
    } 
  }
  
  void if() {
    if (null == this.n)
      this.n = this.aC.Y.a(10, "fish"); 
  }
  
  void goto() {
    if (null == this.byte)
      this.byte = this.aC.Y.a(6, "rabbit"); 
  }
  
  byte[] a(byte[] paramArrayOfByte, int paramInt) {
    byte b1 = 1;
    for (byte b3 = 0; b3 < paramInt; b3++) {
      byte b4 = (paramArrayOfByte[b1++] & 0xFF) << 8 | paramArrayOfByte[b1++] & 0xFF;
      b1 += b4;
    } 
    byte b2 = (paramArrayOfByte[b1++] & 0xFF) << 8 | paramArrayOfByte[b1++] & 0xFF;
    byte[] arrayOfByte = new byte[b2];
    System.arraycopy(paramArrayOfByte, b1, arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }
  
  void c() {
    for();
    byte[] arrayOfByte = this.aC.a("poke2ev", this.y);
    short s1 = 0;
    if (arrayOfByte.length == 1) {
      this.aa = 0;
      return;
    } 
    this.aa = arrayOfByte[s1++];
    if (this.aV[this.y * 2] <= 0) {
      this.new = new short[this.aa];
      this.aR[this.y] = this.new;
      this.aV[this.y * 2 + 1] = 0;
    } else {
      for (byte b2 = 0; b2 < this.aR[this.y].length; b2++) {
        if ((this.aV[this.y * 2 + 1] & true << b2) != 0)
          this.aR[this.y][b2] = 24224; 
      } 
      this.new = this.aR[this.y];
    } 
    this.W = new byte[this.aa][];
    short s2 = 0;
    for (byte b1 = 0; b1 < this.aa; b1++) {
      s2 = (short)(arrayOfByte[s1++] << 8 | arrayOfByte[s1++] & 0xFF);
      if (this.new[b1] < s2) {
        this.W[b1] = new byte[s2];
        System.arraycopy(arrayOfByte, s1, this.W[b1], 0, this.W[b1].length);
      } 
      s1 += s2;
    } 
  }
  
  void q() {
    byte[] arrayOfByte = null;
    this.aC.if = 0;
    boolean bool = false;
    if (this.aV[this.y * 2] <= 0) {
      byte[] arrayOfByte1 = this.aC.b(0);
      arrayOfByte = a(arrayOfByte1, this.y);
      bool = true;
    } else {
      if (null == this.I[this.y])
        this.I[this.y] = this.aC.a(9 + this.y, null, 1); 
      arrayOfByte = this.I[this.y];
      bool = false;
    } 
    this.aT = a(arrayOfByte, this.aT);
    if (bool) {
      this.char = new byte[this.aT.length][2];
      for (byte b1 = 0; b1 < this.char.length; b1++)
        this.char[b1][0] = 7; 
    } else {
      this.char = a(arrayOfByte, this.char);
    } 
    this.o = a(arrayOfByte, this.o);
    this.ag = a(arrayOfByte, this.ag);
  }
  
  byte[][] a(byte[] paramArrayOfByte, byte[][] paramArrayOfByte1) {
    paramArrayOfByte1 = (byte[][])null;
    paramArrayOfByte1 = new byte[paramArrayOfByte[this.aC.if++]][];
    byte b1 = 0;
    if (this.aV[this.y * 2] > 0)
      b1 = 100; 
    for (byte b2 = 0; b2 < paramArrayOfByte1.length; b2++) {
      paramArrayOfByte1[b2] = new byte[paramArrayOfByte[this.aC.if++] + b1];
      byte b3 = 0;
      while (b3 < paramArrayOfByte1[b2].length) {
        paramArrayOfByte1[b2][b3] = paramArrayOfByte[this.aC.if];
        b3++;
        this.aC.if++;
      } 
    } 
    return paramArrayOfByte1;
  }
  
  void d() {
    this.I[this.y] = null;
    this.I[this.y] = g();
    this.aV[this.y * 2] = 1;
    this.goto[this.y] = 1;
  }
  
  void case() {
    this.void = null;
    this.G = null;
    this.void = new c(this);
    this.G = new c(this);
    byte[] arrayOfByte = this.aC.a("poke2map", this.y);
    System.gc();
    this.aC.if = 0;
    this.a6 = arrayOfByte[this.aC.if++];
    this.al = arrayOfByte[this.aC.if++];
    this.f = new Vector();
    this.z = this.void.a(arrayOfByte, this.a6, this.al);
    if(this.z);
    this.k = this.G.a(arrayOfByte, this.a6, this.al);
    if(this.k);
    new();
    this.Z = a(this.if / 16, this.a6, 15, 8, 240, 16);
    this.Y = a(this.ba / 16, this.al, 20, 10, 320, 16);
    this.int = 112;
    this.K = (short)(this.a6 * 16 - 120 - 8);
    this.aD = 152;
    this.A = (short)(this.al * 16 - 160 - 8);
  }
  
  byte a(byte[][] paramArrayOfByte) {
    byte b1 = -2;
    if (this.y < this.aC.bB.length && this.aC.bB[this.y].length > 0) {
      this.X = (byte)(this.if / 16 * this.aC.bB[this.y][2] / this.a6);
      this.V = (byte)(this.ba / 16 * this.aC.bB[this.y][3] / this.al);
    } 
    if (paramArrayOfByte[this.a5][3] == -1) {
      b1 = this.y;
      this.y = this.p;
      this.p = b1;
      this.b = this.a5;
      b1 = -1;
    } else {
      if (this.y != 71 && this.y != 72 && this.y != 73) {
        this.p = this.y;
        this.b = this.a5;
      } 
      this.y = paramArrayOfByte[this.a5][4];
      b1 = paramArrayOfByte[this.a5][3];
    } 
    return b1;
  }
  
  void void() {
    d();
    this.goto[this.y] = 1;
    this.aC.a(1, this.goto, 2);
  }
  
  void a() {
    this.aC.Y;
    f.S = false;
  }
  
  void if(int paramInt) {
    if (this.e == -77)
      this.H++; 
    if (this.e == -78)
      return; 
    this.aC.aB = (byte)paramInt;
    this.aC.Y.repaint();
    this.aC.Y.serviceRepaints();
  }
  
  void h() {
    this.m = -1000;
    this.i = -1;
    this.aJ = 0;
    this.aU = 0;
    this.long = 0;
    this.av = 1;
    if(0);
    void();
    if (this.ax != -2) {
      this.y = this.s;
      this.s = 0;
    } 
    byte b1 = this.b;
    if (this.ax == -2)
      this.ax = a(this.ag); 
    this.aC.az();
    this.aC.P = (short[][][])null;
    System.gc();
    q();
    if(1);
    if (this.ax == -1)
      this.ax = b1; 
    a(this.ax, this.ag);
    l();
    case();
    if(6);
    c();
    System.gc();
    this.aC.aa();
    if(8);
    this.a4 = 0;
    this.aC.aa = 3;
    if (this.ag[this.ax][5] == 1) {
      this.as = this.aZ;
      try();
    } 
    this.e = 0;
    this.aC.aB = 0;
    if (this.h == 2) {
      this.aK[0][35] = this.aC.Y.a("/image/boat2.png");
      this.aK[0][36] = this.aC.Y.a("/image/boat1.png");
    } 
    char(this.h);
    v();
    a();
    this.ax = -2;
    this.a3 = 0;
    this.aC.n();
    this.aC.aj();
    this.aC.a(0, null, 4);
  }
  
  public void v() {
    boolean bool = false;
    for (byte b1 = 0; b1 < this.N.length; b1 = (byte)(b1 + 2)) {
      for (byte b2 = 0; !bool && b2 < this.N[b1].length; b2 = (byte)(b2 + true)) {
        if (this.y == this.N[b1][b2]) {
          this.aC.Y.W = this.N[b1 + true][new(this.N[b1 + true].length)];
          bool = true;
          break;
        } 
      } 
    } 
    if (!bool)
      this.aC.Y.W = (byte)(1 + new(2)); 
    this.aC.Y.a(this.aC.Y.W, true);
  }
  
  void a(byte paramByte, byte[][] paramArrayOfByte) {
    if (paramArrayOfByte[paramByte][2] != 0)
      this.aZ = (byte)((paramArrayOfByte[paramByte][2] - 1) / 2 * 2 + 1 + paramArrayOfByte[paramByte][2] % 2); 
    this.if = paramArrayOfByte[paramByte][0] << 4;
    this.ba = paramArrayOfByte[paramByte][1] << 4;
  }
  
  int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    int i1;
    if (paramInt2 <= paramInt3) {
      i1 = paramInt5 - paramInt6 * paramInt2 >> 1;
    } else if (paramInt1 + 1 <= paramInt4) {
      i1 = 0;
    } else if (paramInt1 >= paramInt2 - paramInt4) {
      i1 = paramInt5 - paramInt2 * paramInt6;
    } else {
      i1 = paramInt5 / 2 - paramInt1 * paramInt6 - paramInt6 / 2;
    } 
    return i1;
  }
  
  void t() {
    this.T = 0;
    this.S = 0;
    this.q = 0;
    this.a = 1;
    this.e = 0;
  }
  
  void k() {
    for (byte b1 = 0; null != this.W && b1 < this.W.length; b1++) {
      if (null != this.W[b1] && this.new[b1] < this.W[b1].length)
        do {
          byte b5;
          short s1;
          byte b4;
          byte[] arrayOfByte;
          byte b3;
          byte b2;
          this.a = 0;
          if (this.new[b1] >= this.W[b1].length) {
            this.W[b1] = null;
            this.aV[this.y * 2 + 1] = (byte)(this.aV[this.y * 2 + 1] | true << b1);
            break;
          } 
          switch (this.W[b1][this.new[b1]]) {
            case 20:
              if (this.aC.bl == 1) {
                this.T = this.W[b1][this.new[b1] + 2];
                this.S = this.W[b1][this.new[b1] + 3];
                this.aV[this.T * 2 + 1] = (byte)(this.aV[this.T * 2 + 1] | 1 << this.S);
                this.aR[this.T][this.S] = 24224;
                this.new[b1] = (short)(this.new[b1] + (this.W[b1][this.new[b1] + 3] << 1) + 4);
                t();
                break;
              } 
              if (this.q == 0) {
                if (this.W[b1][this.new[b1] + 2] == 0) {
                  this.for = null;
                } else {
                  this.for = this.aC.a(this.aT[this.W[b1][this.new[b1] + 2] - 1], 6, this.aT[this.W[b1][this.new[b1] + 2] - 1][5]);
                  if (this.for.equals("路人"))
                    this.for = null; 
                } 
                a(this.aC.a(this.W[b1], this.new[b1] + 4, this.W[b1][this.new[b1] + 3]));
                this.aH = 0;
                this.q = 1;
                this.e = 1;
                break;
              } 
              if (this.e == 0) {
                this.new[b1] = (short)(this.new[b1] + (this.W[b1][this.new[b1] + 3] << 1) + 4);
                if (this.t == 1)
                  this.new[b1] = (short)(this.new[b1] + (this.W[b1][this.new[b1] + 3] << 1) + 4); 
                t();
              } 
              break;
            case 40:
              if (this.a4 == 0 && this.aC.do(3) && this.e != 16) {
                this.e = 16;
                String[] arrayOfString = { "回复", "不回复" };
                this.aC.ah = arrayOfString;
                this.aC.b2 = 0;
                break;
              } 
              if (this.aC.d == 0 && this.e == 0) {
                this.new[b1] = (short)(this.new[b1] + 3);
                t();
                this.aC.aX();
                if (this.a4 == 2)
                  this.a4 = 0; 
              } 
              break;
            case -75:
              this.aC.l(4);
              this.new[b1] = (short)(this.new[b1] + 3);
              t();
              break;
            case 47:
              this.new[b1] = 0;
              this.e = 0;
              break;
            case 50:
              if (this.aC.for(this.W[b1][this.new[b1] + 2], this.W[b1][this.new[b1] + 3], this.W[b1][this.new[b1] + 4]) != -1) {
                this.new[b1] = (short)(this.new[b1] + 5);
                t();
                break;
              } 
              this.new[b1] = 0;
              this.a = 0;
              break;
            case -120:
              if (this.q == 0) {
                this.T = this.aC.goto(this.W[b1][this.new[b1] + 2], this.W[b1][this.new[b1] + 3]);
                this.q = 1;
                this.e = 11;
                break;
              } 
              if (this.aC.d == 0) {
                if (this.T == 1) {
                  this.new[b1] = (short)(this.new[b1] + this.W[b1][this.new[b1] + 1] + 2);
                  t();
                  break;
                } 
                this.new[b1] = 0;
                this.e = 0;
              } 
              break;
            case -110:
              if (this.q == 0) {
                this.S = this.aC.for(this.W[b1][this.new[b1] + 2], this.W[b1][this.new[b1] + 3], this.W[b1][this.new[b1] + 4]);
                this.T = this.aC.goto(this.S);
                this.q = 1;
                this.e = 11;
                break;
              } 
              if (this.aC.d == 0) {
                if (this.T == 1) {
                  this.new[b1] = (short)(this.new[b1] + this.W[b1][this.new[b1] + 1] + 2);
                  t();
                  break;
                } 
                this.new[b1] = 0;
                this.e = 0;
              } 
              break;
            case -13:
              a();
              this.aC.bi();
              this.new[b1] = (short)(this.new[b1] + 3);
              t();
              break;
            case -16:
              f();
              this.aV[this.y * 2 + 1] = (byte)(this.aV[this.y * 2 + 1] | 0x8);
              this.aR[this.y][3] = 24224;
              this.new[b1] = (short)(this.new[b1] + 4);
              this.e = 1;
              break;
            case -100:
              if (this.e == 2 && this.a5 + 1 == this.W[b1][this.new[b1] + 2]) {
                this.new[b1] = (short)(this.new[b1] + 3);
                this.a = 1;
              } 
              break;
            case -50:
              this.aC.ax = (byte)(this.W[b1][this.new[b1] + 1] >> 1);
              this.aC.m = new byte[this.W[b1][this.new[b1] + 1] >> 1][2];
              this.S = 0;
              while (this.S < this.W[b1][this.new[b1] + 1] >> 1) {
                this.aC.m[this.S][0] = this.W[b1][this.new[b1] + 2 + this.S * 2];
                this.aC.m[this.S][1] = this.W[b1][this.new[b1] + 3 + this.S * 2];
                this.S = (byte)(this.S + 1);
              } 
              this.new[b1] = (short)(this.new[b1] + 2 + this.W[b1][this.new[b1] + 1]);
              this.aC.a9();
              this.aC.Y.a(9, false);
              this.aC.k();
              break;
            case -40:
              if (this.q == 0) {
                this.S = this.W[b1][this.new[b1] + 1];
                if (this.t == 0) {
                  this.aC.ah = new String[this.S - 1];
                } else {
                  this.aC.ah = new String[this.S];
                } 
                byte b6 = 0;
                for (byte b7 = 0; b7 < this.S; b7++) {
                  if (this.t != 0 || b7 != 1) {
                    this.aC.ah[b6] = this.aC.a(this.W[b1], this.new[b1] + 2 + this.T + 1, this.W[b1][this.new[b1] + 2 + this.T]);
                    b6++;
                  } 
                  this.T = (byte)(this.T + (this.W[b1][this.new[b1] + 2 + this.T] << 1) + 1);
                } 
                this.aC.b2 = 0;
                this.aC.bm = 0;
                this.q = 1;
                this.e = 11;
                break;
              } 
              if (this.aC.bm == 12) {
                this.T = (byte)(this.T + 2);
                short s2 = 0;
                if (this.t == 0 && this.aC.b2 == 1)
                  s2 = 1; 
                this.new[b1] = (short)(this.new[b1] + this.T + this.S + this.W[b1][this.new[b1] + this.T + this.aC.b2 + s2]);
                this.aC.b2 = -1;
                this.t = -1;
                t();
                break;
              } 
              if (this.as == -7) {
                this.new[b1] = 0;
                this.aC.b2 = -1;
                this.t = -1;
                t();
              } 
              break;
            case -39:
              this.new[b1] = (short)(this.new[b1] + 2 + this.W[b1][this.new[b1] + 1]);
              t();
              break;
            case -31:
              if (this.q == 0) {
                this.T = this.aC.for(this.W[b1][this.new[b1] + 2]);
                this.q = 1;
                this.e = 11;
                break;
              } 
              if (this.aC.d == 0) {
                if (this.T == 1) {
                  this.new[b1] = (short)(this.new[b1] + this.W[b1][this.new[b1] + 1] + 2);
                  t();
                  break;
                } 
                this.e = 0;
                this.new[b1] = 0;
              } 
              break;
            case -30:
              if (this.q == 0) {
                this.T = this.aC.case(this.W[b1][this.new[b1] + 2], this.W[b1][this.new[b1] + 3]);
                this.q = 1;
                this.e = 11;
                break;
              } 
              if (this.aC.d == 0) {
                if (this.T == 1) {
                  this.new[b1] = (short)(this.new[b1] + this.W[b1][this.new[b1] + 1] + 2);
                  t();
                  break;
                } 
                this.e = 0;
                this.new[b1] = 0;
              } 
              break;
            case -20:
              this.T = this.W[b1][this.new[b1] + 2];
              this.S = this.W[b1][this.new[b1] + 3];
              this.aV[this.T * 2 + 1] = (byte)(this.aV[this.T * 2 + 1] | 1 << this.S);
              this.aR[this.T][this.S] = 24224;
              this.new[b1] = (short)(this.new[b1] + 4);
              t();
              break;
            case 0:
              if (this.q != 0)
                break; 
              if (this.T < this.W[b1][this.new[b1] + 1]) {
                this.e = 10;
                if (this.aM >= this.L) {
                  if (this.S < this.W[b1][this.new[b1] + 2 + this.T + 1]) {
                    this.S = (byte)(this.S + 1);
                    this.as = this.W[b1][this.new[b1] + 2 + this.T];
                    try();
                    if (this.e == 5)
                      this.new[b1] = (short)(this.new[b1] + this.W[b1][this.new[b1] + 1] + 2); 
                    break;
                  } 
                  this.T = (byte)(this.T + 2);
                  this.S = 0;
                } 
                break;
              } 
              this.new[b1] = (short)(this.new[b1] + this.W[b1][this.new[b1] + 1] + 2);
              t();
              break;
            case 1:
              if (this.if / 16 == this.W[b1][this.new[b1] + 2] && this.ba / 16 == this.W[b1][this.new[b1] + 3]) {
                if (this.aM >= this.L) {
                  this.new[b1] = (short)(this.new[b1] + 4);
                  t();
                } 
                break;
              } 
              this.e = 10;
              if (this.aM >= this.L) {
                int i1 = this.if / 16 - this.W[b1][this.new[b1] + 2];
                int i2 = this.ba / 16 - this.W[b1][this.new[b1] + 3];
                if (Math.abs(i1) > Math.abs(i2)) {
                  this.as = (i1 > 0) ? 3 : 4;
                } else {
                  this.as = (i2 > 0) ? 1 : 2;
                } 
                if (this.R != 0)
                  if (this.as == 3 || this.as == 4) {
                    if (i2 > 0) {
                      this.as = 1;
                    } else if (i2 < 0) {
                      this.as = 2;
                    } else if (i1 > 0) {
                      this.as = 3;
                    } else if (i1 < 0) {
                      this.as = 4;
                    } 
                  } else if (i1 > 0) {
                    this.as = 3;
                  } else if (i1 < 0) {
                    this.as = 4;
                  } else if (i2 > 0) {
                    this.as = 1;
                  } else if (i2 < 0) {
                    this.as = 2;
                  }  
                try();
              } 
              break;
            case 2:
              if (this.aZ != this.W[b1][this.new[b1] + 2])
                do(this.W[b1][this.new[b1] + 2]); 
              this.new[b1] = (short)(this.new[b1] + 3);
              t();
              break;
            case 3:
              if (this.aC.m(this.W[b1][this.new[b1] + 2]) || -1 != this.aC.n(this.W[b1][this.new[b1] + 2])) {
                this.new[b1] = (short)(this.new[b1] + 3);
                t();
              } 
              break;
            case 5:
              if ((this.aV[this.W[b1][this.new[b1] + 2] * 2 + 1] & 1 << this.W[b1][this.new[b1] + 3]) != 0) {
                this.new[b1] = (short)(this.new[b1] + 4);
                this.a = 1;
                this.t = 1;
                break;
              } 
              this.t = 0;
              this.new[b1] = (short)(this.new[b1] + 4);
              this.new[b1] = (short)(this.new[b1] + (this.W[b1][this.new[b1] + 3] << 1) + 4);
              t();
              break;
            case 7:
              if (this.aZ == this.W[b1][this.new[b1] + 2]) {
                this.new[b1] = (short)(this.new[b1] + 3);
                t();
              } 
              break;
            case 8:
              try(this.W[b1][this.new[b1] + 2]);
              a();
              this.new[b1] = (short)(this.new[b1] + 3);
              t();
              break;
            case 9:
              this.aT[this.W[b1][this.new[b1] + 2] - 1][4] = 1;
              this.new[b1] = (short)(this.new[b1] + 3);
              t();
              break;
            case 10:
              this.av = this.W[b1][this.new[b1] + 2];
              this.new[b1] = (short)(this.new[b1] + 3);
              t();
              break;
            case 11:
              if (this.if / 16 == this.W[b1][this.new[b1] + 2] && this.ba / 16 == this.W[b1][this.new[b1] + 3] && this.aZ == this.W[b1][this.new[b1] + 4]) {
                this.new[b1] = (short)(this.new[b1] + 5);
                t();
              } 
              break;
            case 12:
              if (this.if / 16 == this.W[b1][this.new[b1] + 2] && this.ba / 16 == this.W[b1][this.new[b1] + 3] && this.aZ == this.W[b1][this.new[b1] + 4] && this.h == this.W[b1][this.new[b1] + 5]) {
                this.new[b1] = (short)(this.new[b1] + 6);
                t();
              } 
              break;
            case 13:
              if (this.long != this.W[b1][this.new[b1] + 2]) {
                this.long = this.W[b1][this.new[b1] + 2];
                this.new[b1] = (short)(this.new[b1] + 3);
              } 
              break;
            case 14:
              if ((this.aV[this.W[b1][this.new[b1] + 2] * 2 + 1] & 1 << this.W[b1][this.new[b1] + 3]) != 0) {
                this.new[b1] = (short)(this.new[b1] + 4);
                this.new[b1] = (short)(this.new[b1] + (this.W[b1][this.new[b1] + 3] << 1) + 4);
                this.new[b1] = (short)(this.new[b1] + 4);
                this.a = 1;
                break;
              } 
              this.new[b1] = (short)(this.new[b1] + 4);
              this.long = 0;
              t();
              break;
            case 15:
              if (this.if / 16 == this.W[b1][this.new[b1] + 2] && this.ba / 16 == this.W[b1][this.new[b1] + 3] && this.aZ == this.W[b1][this.new[b1] + 4] && this.long != this.W[b1][this.new[b1] + 5]) {
                this.long = this.W[b1][this.new[b1] + 5];
                this.new[b1] = (short)(this.new[b1] + 6);
                t();
              } 
              break;
            case 16:
              if (this.q == 0) {
                a(this.W[b1][this.new[b1] + 2], this.W[b1][this.new[b1] + 3]);
                this.q = 1;
                this.e = 10;
                break;
              } 
              if (this.O == -1) {
                this.new[b1] = (short)(this.new[b1] + 4);
                t();
              } 
              break;
            case 17:
              this.aC.int(this.W[b1][this.new[b1] + 2] * 10);
              this.new[b1] = (short)(this.new[b1] + 3);
              t();
              break;
            case 18:
              if (this.aC.bl == this.W[b1][this.new[b1] + 2]) {
                this.new[b1] = (short)(this.new[b1] + 3);
                t();
              } 
              break;
            case 19:
              byte(this.W[b1][this.new[b1] + 2], this.W[b1][this.new[b1] + 3]);
              this.new[b1] = (short)(this.new[b1] + 4);
              t();
              this.aC.Y.c();
              break;
            case 21:
              b2 = 0;
              for (b3 = 0; b3 < this.aC.bC; b3++) {
                if (this.aC.F[b3] != null && b2 < (this.aC.F[b3]).do[11])
                  b2 = (this.aC.F[b3]).do[11]; 
              } 
              if (b2 >= this.W[b1][this.new[b1] + 2]) {
                this.new[b1] = (short)(this.new[b1] + 3);
                t();
              } 
              break;
            case 60:
              if (this.aT[this.W[b1][this.new[b1] + 2] - 1][4] == 0) {
                this.aT[this.W[b1][this.new[b1] + 2] - 1][4] = -1;
              } else {
                this.aT[this.W[b1][this.new[b1] + 2] - 1][4] = 3;
                this.r = false;
              } 
              this.new[b1] = (short)(this.new[b1] + 3);
              t();
              break;
            case -10:
              this.S = (byte)(this.W[b1][this.new[b1] + 2] - 1);
              arrayOfByte = new byte[7 + this.aT[this.S][5] * 2 + (this.W[b1][this.new[b1] + 3] << 1)];
              for (b4 = 0; b4 < 6 + this.aT[this.S][5] * 2; b4++)
                arrayOfByte[b4] = this.aT[this.S][b4]; 
              b4 = 6 + this.aT[this.S][5] * 2;
              for (s1 = 0; s1 < (this.W[b1][this.new[b1] + 3] << 1) + 1; s1++) {
                arrayOfByte[b4] = this.W[b1][this.new[b1] + 3 + s1];
                b4++;
              } 
              this.aT[this.S] = null;
              this.aT[this.S] = arrayOfByte;
              this.new[b1] = (short)(this.new[b1] + (this.W[b1][this.new[b1] + 3] << 1) + 4);
              t();
              break;
            case -80:
              if ((this.aV[this.W[b1][this.new[b1] + 2] * 2 + 1] & 1 << this.W[b1][this.new[b1] + 3]) != 0) {
                this.new[b1] = (short)(this.new[b1] + 4);
                this.a = 1;
              } 
              break;
            case -60:
              if (this.if / 16 == this.W[b1][this.new[b1] + 2] && this.ba / 16 == this.W[b1][this.new[b1] + 3]) {
                a();
                this.new[b1] = (short)(this.new[b1] + 4);
                t();
              } 
              break;
            case -61:
              if (this.if / 16 >= this.W[b1][this.new[b1] + 2] && this.if / 16 <= this.W[b1][this.new[b1] + 4] && this.ba / 16 >= this.W[b1][this.new[b1] + 3] && this.ba / 16 <= this.W[b1][this.new[b1] + 5]) {
                a();
                this.new[b1] = (short)(this.new[b1] + 6);
                t();
              } 
              break;
            case -62:
              s1 = this.W[b1][this.new[b1] + 2];
              b5 = this.W[b1][this.new[b1] + 3];
              if (s1 != 0)
                this.char[s1 - 1][0] = b5; 
              this.new[b1] = (short)(this.new[b1] + 4);
              t();
              break;
            case -63:
              this.T = this.W[b1][this.new[b1] + 2];
              this.S = this.W[b1][this.new[b1] + 3];
              if (this.T != 0)
                this.char[this.T - 1][1] = this.S; 
              this.new[b1] = (short)(this.new[b1] + 4);
              t();
              break;
            case -64:
              byte(this.W[b1][this.new[b1] + 2]);
              this.new[b1] = (short)(this.new[b1] + 3);
              t();
              break;
            case -65:
              if (this.q == 0) {
                this.T = -1;
                this.S = 0;
                byte b6 = this.aC.ah();
                byte b7;
                for (b7 = 0; b7 < this.a8.length && b6 >= this.a8[b7]; b7 = (byte)(b7 + true)) {
                  if (!this.aC.m(this.E[b7]) && this.aC.n(this.E[b7]) == -1) {
                    this.T = b7;
                    break;
                  } 
                  this.S = b7;
                } 
                this.for = this.aI[1];
                if (this.T == -1) {
                  if (this.S >= 5) {
                    a(this.aI[2]);
                  } else {
                    a(this.aI[3] + this.aP[this.S] + this.aI[4] + b6 + this.aI[5] + this.a8[this.S + 1] + this.aI[6]);
                  } 
                } else {
                  a(this.aI[7] + this.aP[this.T] + "," + this.a2[this.T]);
                } 
                this.aH = 0;
                this.q = 1;
                this.e = 1;
                break;
              } 
              if (this.e == 0) {
                if (this.T != -1)
                  this.aC.case(this.E[this.T], 1); 
                this.new[b1] = (short)(this.new[b1] + 3);
                t();
              } 
              break;
            case -66:
              this.T = this.W[b1][this.new[b1] + 2];
              if (this.T != 0) {
                this.aT[this.T - 1][0] = (byte)(this.aT[this.T - 1][0] + this.W[b1][this.new[b1] + 3]);
                this.aT[this.T - 1][1] = (byte)(this.aT[this.T - 1][1] + this.W[b1][this.new[b1] + 4]);
              } 
              this.new[b1] = (short)(this.new[b1] + 5);
              t();
              break;
            case -67:
              if (this.aC.do(this.W[b1][this.new[b1] + 2])) {
                this.new[b1] = (short)(this.new[b1] + 3);
                t();
                break;
              } 
              this.aC.if(this.aC.case, 0);
              this.new[b1] = 0;
              this.a = 0;
              break;
            case -68:
              this.new[b1] = (short)(this.new[b1] + 3);
              t();
              this.e = 17;
              break;
            case -69:
              this.new[b1] = (short)(this.new[b1] + 3);
              t();
              this.aC.aF();
              break;
            case -70:
              this.new[b1] = (short)(this.new[b1] + 3);
              t();
              this.aC.aJ();
              break;
            case -71:
              if (this.aC.try(this.W[b1][this.new[b1] + 2], this.W[b1][this.new[b1] + 3])) {
                this.new[b1] = (short)(this.new[b1] + 4);
                t();
              } 
              break;
            case -72:
              if (this.q == 0) {
                this.try = this.W[b1][this.new[b1] + 2];
                this.e = 10;
                this.q = 1;
                break;
              } 
              if (this.try < 0) {
                this.new[b1] = (short)(this.new[b1] + 3);
                t();
              } 
              break;
            case -73:
              this.T = this.W[b1][this.new[b1] + 2];
              this.S = this.W[b1][this.new[b1] + 3];
              this.k[this.T][this.S] = -1;
              this.a3 = 0;
              this.new[b1] = (short)(this.new[b1] + 4);
              t();
              break;
            case -74:
              this.aT[this.W[b1][this.new[b1] + 2] - 1][4] = -1;
              this.new[b1] = (short)(this.new[b1] + 3);
              t();
              break;
          } 
        } while (this.a == 1); 
    } 
  }
  
  public void byte(int paramInt1, int paramInt2) {
    this.e = 6;
    this.s = (byte)paramInt1;
    this.ax = (byte)paramInt2;
    this.aM = this.L;
  }
  
  public void f() {
    this.aH = 0;
    this.aC.br = 12;
    a(this.aC.a("end")[0]);
    this.aC.ah = null;
    this.aC.c = 51;
  }
  
  void long() {
    this.F = null;
    this.F = new k();
  }
  
  void e() {
    if (this.e == -77) {
      this.H++;
      if (this.H > 93) {
        h();
        this.H = -1;
        this.e = 0;
        this.as = 0;
      } 
      return;
    } 
    if (this.e == -78) {
      this.H++;
      if (this.H >= this.D.length * 2) {
        this.H = -1;
        h();
        this.e = 0;
        this.as = 0;
      } 
      return;
    } 
    if (this.i % 50 == 0) {
      if (this.y == 1 || this.y == 3 || this.y == 4 || this.y == 6) {
        if ((this.m < 0 && new(100) <= 40) || this.m <= -100 - new(801)) {
          this.m = 100 + (new(4) + 1) * 100;
          long();
        } 
      } else {
        this.F = null;
      } 
      byte[] arrayOfByte = { 
          5, 13, 15, 16, 18, 20, 21, 22, 25, 26, 
          28, 47, 52, 53, 54, 55, 57 };
      boolean bool = false;
      for (int i1 = arrayOfByte.length - 1; i1 >= 0; i1--) {
        if (arrayOfByte[i1] == this.y) {
          bool = true;
          break;
        } 
      } 
      if (bool) {
        if ((this.m < 0 && new(100) <= 30) || this.m <= -1000) {
          this.m = 100 + (new(4) + 1) * 100;
          if (null == this.at)
            this.at = new a(); 
        } 
        if (null != this.at)
          this.at.if(); 
      } else {
        this.at = null;
      } 
    } 
    k();
    if (this.am == 5 && this.aM >= this.L) {
      this.am = 0;
      this.aC.A = 1;
      this.e = 5;
      this.aC.aV();
    } 
    if (this.e == 5 && this.aM >= this.L) {
      this.aC.Y.if();
      this.e = 6;
    } 
    if (this.e == 6) {
      this.aC.A = 1;
      if (this.an == 1) {
        this.an = 0;
        this.e = -78;
        this.H = 0;
        this.aC.ba = this.if + this.Z + 8;
        this.aC.a9 = this.ba + this.Y + 16;
        this.aC.G();
      } else if (this.h == 2) {
        this.aC.aP();
        this.e = -77;
        this.H = 4;
      } else {
        h();
      } 
      return;
    } 
    if (this.e == 2) {
      this.am = 2;
      if (this.aT[this.a5][4] == 1) {
        this.for = this.aC.a(this.aT[this.a5], 6, this.aT[this.a5][5]);
        if (this.for.equals("路人"))
          this.for = null; 
      } else {
        this.for = null;
      } 
      a(this.aC.a(this.aT[this.a5], 7 + this.aT[this.a5][5] * 2, this.aT[this.a5][6 + this.aT[this.a5][5] * 2]));
      this.aH = 0;
      this.e = 1;
    } else if (this.e == 8 && this.aM >= this.L) {
      if (this.aC.bW == 0)
        else(7 + new(2)); 
      this.e = 0;
    } 
    r();
  }
  
  void else(int paramInt) {
    if (this.aU == 0) {
      this.aC.m = new byte[1][2];
      this.aC.a(this.y, this.aC.m[0], this.if, this.ba);
    } 
    if (this.aU == 1) {
      this.aJ = (byte)new(8);
      this.aU = 2;
      if (this.aC.m(29))
        this.aC.if(this.a1[3], 0); 
      return;
    } 
    if (this.aU == 2) {
      this.aC.if(this.a1[4], 0);
    } else {
      this.aC.if(this.a1[new(3)], 0);
    } 
    this.aC.Y.c();
    this.aC.aH();
    this.aC.Y.a(paramInt, false);
    this.aC.k();
  }
  
  void char() {
    this.aC.case(this.o[this.a5][3], this.o[this.a5][4]);
    this.o[this.a5][2] = -1;
    this.e = 11;
  }
  
  void case(int paramInt) {
    this.a3 = 0;
    if (this.aT[paramInt][2] == 35) {
      this.aT[paramInt][4] = -1;
      this.do = 0;
      this.r = true;
      return;
    } 
    if (this.do > 4) {
      for (byte b1 = 0; b1 < 4; b1++) {
        ab.setClip(this.Z + (this.aT[paramInt][0] << 4), this.Y + (this.aT[paramInt][1] << 4) + b1 * 4, 16, this.do - this.aB);
        ab;
        ab;
        ab.drawImage(this.aK[0][this.aT[paramInt][2]], this.Z + (this.aT[paramInt][0] << 4) + 8, this.Y + (this.aT[paramInt][1] << 4) + 16, true | 0x20);
        ab.setClip(0, 0, 240, 320);
      } 
    } else {
      ab;
      ab;
      ab.drawImage(this.aK[0][this.aT[paramInt][2]], this.Z + (this.aT[paramInt][0] << 4) + 8, this.Y + (this.aT[paramInt][1] << 4) + 16, true | 0x20);
    } 
    this.do = (byte)(this.do + 1);
    if (this.do > 4 + this.aB) {
      this.do = 0;
      this.aT[paramInt][4] = -1;
      this.r = true;
    } 
  }
  
  void for(int paramInt) {
    if (this.aT[paramInt][4] == 3) {
      case(paramInt);
    } else {
      if (this.aT[paramInt][2] == 33) {
        byte b2 = (byte)Math.abs(this.aC.aB % 12 / 3);
        byte[] arrayOfByte = { 0, 1, 0, 2 };
        ab;
        ab;
        ab.drawImage(this.aK[arrayOfByte[b2]][33], this.Z + (this.aT[paramInt][0] << 4) + 8, this.Y + (this.aT[paramInt][1] << 4) + 16, true | 0x20);
        return;
      } 
      ab;
      ab;
      byte b1 = true | 0x20;
      int i1 = this.char[paramInt][1];
      if (this.aT[paramInt][2] == 35) {
        ab;
        ab;
        b1 = true | 0x2;
      } else if ((this.e == 1 || this.e == 14 || this.O > -1) && this.a5 == paramInt && null != this.for) {
        i1 = do(this.if - (this.aT[paramInt][0] << 4), this.ba - (this.aT[paramInt][1] << 4));
      } 
      if (i1 == 3) {
        w;
        this.aC.a(w, this.aK[1][this.aT[paramInt][2]], this.Z + (this.aT[paramInt][0] << 4) + 8, this.Y + (this.aT[paramInt][1] << 4) + 16, b1, 8192);
      } else {
        ab.drawImage(this.aK[i1][this.aT[paramInt][2]], this.Z + (this.aT[paramInt][0] << 4) + 8, this.Y + (this.aT[paramInt][1] << 4) + 16, b1);
      } 
    } 
  }
  
  private int do(int paramInt1, int paramInt2) {
    byte b1 = 0;
    byte b2 = 17;
    if (paramInt1 > 0 && paramInt1 < b2) {
      b1 = 3;
    } else if (paramInt1 < 0 && paramInt1 > -b2) {
      b1 = 1;
    } else if (paramInt2 < 0 && paramInt2 > -b2) {
      b1 = 2;
    } else if (paramInt2 > 0 && paramInt2 < b2) {
      b1 = 0;
    } 
    return b1;
  }
  
  void u() {
    ab.setColor(8947848);
    ab.fillRoundRect(86, 242, 66, 3, 1, 1);
    ab.setColor(16777215);
    ab.drawLine(87, 243, 87 + (this.aC.aB * 64 >> 3), 243);
  }
  
  void a(Graphics paramGraphics) {
    int i3;
    int i2;
    byte b1 = this.aj;
    byte b2 = this.aX;
    int i1 = this.aN;
    short s1 = 256;
    short s2 = 336;
    if (this.a3 == 0) {
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 0, s1, s2);
      this.a3 = 1;
      if (this.Z >= 0) {
        this.aj = 0;
        this.ak = this.Z;
      } else {
        this.aj = (byte)(-this.Z / 16);
        this.ak = this.Z + this.aj * 16;
      } 
      if (this.Y >= 0) {
        this.aX = 0;
        this.aO = this.Y;
      } else {
        this.aX = (byte)(-this.Y / 16);
        this.aO = this.Y + this.aX * 16;
      } 
      a(this.aj, this.aX, this.a6, this.al, 0, 0, s1, s2);
    } else {
      if (this.Z >= 0) {
        this.aj = 0;
        this.ak = this.Z;
      } else {
        this.aj = (byte)(-this.Z / 16);
        this.ak = this.Z + this.aj * 16;
      } 
      if (this.Y >= 0) {
        this.aX = 0;
        this.aO = this.Y;
      } else {
        this.aX = (byte)(-this.Y / 16);
        this.aO = this.Y + this.aX * 16;
      } 
      if (this.aj != b1 || this.aX != b2) {
        paramGraphics.setColor(0);
        paramGraphics.copyArea(0, 0, s1, s2, -(this.aj - b1) * 16, -(this.aX - b2) * 16, 20);
        if (this.aj < b1) {
          a(this.aj, this.aX, b1, this.al, 0, 0, s1, s2);
        } else if (this.aj > b1) {
          i2 = 0;
          if (this.aj + 16 > this.a6) {
            i2 = this.a6;
          } else {
            i2 = this.aj + 16;
          } 
          a(b1 + 16, this.aX, i2, this.al, s1 - (this.aj - b1) * 16, 0, s1, s2);
        } 
        this.aN = i1;
        if (this.aX < b2) {
          a(this.aj, this.aX, this.a6, b2, 0, 0, s1, s2);
        } else if (this.aX > b2) {
          i2 = 0;
          if (this.aX + 21 > this.al) {
            i2 = this.al;
          } else {
            i2 = this.aX + 21;
          } 
          a(this.aj, b2 + 21, this.a6, i2, 0, s2 - (this.aX - b2) * 16, s1, s2);
        } 
      } 
    } 
    if (this.ak >= 0) {
      i2 = this.ak;
    } else {
      i2 = this.ak % 16;
    } 
    if (this.aO >= 0) {
      i3 = this.aO;
    } else {
      i3 = this.aO % 16;
    } 
    this;
    ab.drawImage(u, i2, i3, 20);
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    Graphics graphics = aG;
    int i1 = paramInt5;
    int i2 = paramInt6;
    this.aN = paramInt2;
    graphics.setColor(0);
    while (i2 < paramInt8 && this.aN < paramInt4) {
      i1 = paramInt5;
      this.C = paramInt1;
      while (i1 < paramInt7 && this.C < paramInt3) {
        int i3 = paramInt5 + (this.C - paramInt1 << 4);
        int i4 = paramInt6 + (this.aN - paramInt2 << 4);
        graphics.fillRect(i3, i4, 16, 16);
        i3 += 8;
        i4 += 16;
        if (this.z[this.C][this.aN] != -1) {
          graphics;
          graphics;
          graphics.drawImage(this.void.new[this.z[this.C][this.aN]], i3, i4, true | 0x20);
        } 
        if (this.k[this.C][this.aN] != -1) {
          graphics;
          graphics;
          graphics.drawImage(this.G.new[this.k[this.C][this.aN]], i3, i4, true | 0x20);
        } 
        this.C++;
        i1 += 16;
      } 
      this.aN++;
      i2 += 16;
    } 
  }
  
  void if(Graphics paramGraphics) {
    this;
    ab = paramGraphics;
    w = DirectUtils.getDirectGraphics(paramGraphics);
    if (this.e == 6) {
      if (this.h != 2)
        u(); 
      if (this.h == 2)
        this.e = -77; 
      return;
    } 
    if (this.e == -77) {
      if (this.aC.K == null)
        return; 
      paramGraphics.setColor(6031861);
      paramGraphics.fillRect(0, 0, 240, 320);
      int i2 = -200;
      int i3 = this.H;
      int i4 = this.H * 2;
      int i5 = this.H * 2;
      int i6;
      for (i6 = 0; i6 < 4; i6 = (byte)(i6 + 1))
        paramGraphics.drawImage(this.aC.K[2], i2 + this.aC.K[2].getWidth() * i6 + i3, 0, 20); 
      for (i6 = 0; i6 < 4; i6 = (byte)(i6 + 1))
        paramGraphics.drawImage(this.aC.K[1], i2 + this.aC.K[1].getWidth() * i6 + i4, 35, 20); 
      for (i6 = 0; i6 < 4; i6 = (byte)(i6 + 1)) {
        paramGraphics;
        paramGraphics;
        paramGraphics.drawImage(this.aC.K[0], i2 + this.aC.K[0].getWidth() * i6 + i5, 320, 0x4 | 0x20);
      } 
      byte[][][] arrayOfByte = { { { 3, 0, 0 }, { 6, 0, 30 }, { 7, 0, 38 } }, { { 3, 0, 0 }, { 4, 0, 30 }, { 7, 0, 38 } }, { { 5, 0, 0 } } };
      byte b1 = (byte)(this.H % 3);
      for (byte b2 = 0; b2 < arrayOfByte[b1].length; b2++)
        paramGraphics.drawImage(this.aC.K[arrayOfByte[b1][b2][0]], arrayOfByte[b1][b2][1] + 240 - 10 - this.H * 3, arrayOfByte[b1][b2][2] + 142, 20); 
      return;
    } 
    this.aC.Y.if(0);
    a(aG);
    o();
    if (this.e == -78) {
      if (this.H != -1) {
        paramGraphics;
        paramGraphics;
        paramGraphics.drawImage(this.aC.s[this.D[this.H / 2][0]], this.aC.ba, this.aC.a9 + 7 + this.D[this.H / 2][1], true | 0x20);
        if (this.H / 2 < this.D.length - 1 && null != this.aY[false]) {
          paramGraphics;
          paramGraphics;
          paramGraphics.drawImage(this.aY[0], this.aC.ba, this.aC.a9 - ((this.H > 11) ? (this.H - 11) : 0), true | 0x20);
        } 
        this.aC.int(150);
      } 
      this.aZ = 2;
      return;
    } 
    int i1;
    for (i1 = 0; null != this.aT && i1 < this.aT.length; i1++) {
      if (a(this.aT[i1]))
        if (this.aT[i1][2] != 35 && this.aT[i1][4] > 0) {
          for(i1);
        } else if (this.aT[i1][2] == 35 && this.av == 1 && this.h != 2) {
          for(i1);
        }  
    } 
    if (null == this.aY)
      char(this.h); 
    if (this.h == 2)
      if (this.aZ <= 2) {
        paramGraphics;
        paramGraphics;
        w;
        this.aC.a(w, this.aK[0][36], this.Z + this.if + 8, this.Y + this.ba + 15, true | 0x2, 90 * (this.aZ - 1) * 2);
      } else {
        paramGraphics;
        paramGraphics;
        w;
        this.aC.a(w, this.aK[0][35], this.Z + this.if + 8, this.Y + this.ba + 15, true | 0x2, ' ' * (4 - this.aZ));
      }  
    if (this.h <= 2) {
      if (this.aZ != 4) {
        paramGraphics;
        paramGraphics;
        paramGraphics.drawImage(this.aY[this.else], this.Z + this.if + 8, this.Y + this.ba + 16, true | 0x20);
      } else if (null != this.aY[this.else]) {
        paramGraphics;
        paramGraphics;
        w;
        this.aC.a(w, this.aY[this.else], this.Z + this.if + 8, this.Y + this.ba + 16, true | 0x20, 8192);
      } 
    } else {
      i1 = (byte)Math.abs(this.aC.aB % 12 / 3);
      paramGraphics.setClip(this.Z + this.if, this.Y + this.ba, 16, 10);
      if (this.aZ != 4) {
        paramGraphics;
        paramGraphics;
        paramGraphics.drawImage(this.aY[this.aS], this.Z + this.if + 8, this.Y + i1 + this.ba - 16 + 15, true | 0x10);
      } else {
        paramGraphics;
        paramGraphics;
        w;
        this.aC.a(w, this.aY[this.aS], this.Z + this.if + 8, this.Y + i1 + this.ba - 16 + 15, true | 0x10, 8192);
      } 
      paramGraphics.setClip(0, 0, 240, 320);
    } 
    for (i1 = 0; null != this.aT && i1 < this.aT.length; i1++) {
      if (this.char[i1][0] != 7 && this.aT[i1][4] > 0 && this.aT[i1][2] != 35 && this.aT[i1][2] != 34 && a(this.aT[i1]) && Math.abs(this.if - (this.aT[i1][0] << 4)) <= 32 && Math.abs(this.ba - (this.aT[i1][1] << 4)) <= 32)
        paramGraphics.drawImage(this.c[this.char[i1][0]], this.Z + (this.aT[i1][0] << 4) + 4, this.Y + (this.aT[i1][1] << 4) - 2 - 8 + this.a0[Math.abs(this.aC.aB) % this.a0.length], 20); 
    } 
    if (this.O > -1) {
      if (this.aE == -1) {
        paramGraphics.drawImage(this.c[this.P], this.Z + this.if + 4, this.Y + this.ba - 2 - 8 + this.a0[Math.abs(this.aC.aB) % this.a0.length], 20);
      } else {
        paramGraphics.drawImage(this.c[this.P], this.Z + (this.aT[this.aE][0] << 4) + 4, this.Y + (this.aT[this.aE][1] << 4) - 2 - 8 + this.a0[Math.abs(this.aC.aB) % this.a0.length], 20);
      } 
      this.O = (byte)(this.O - 1);
    } 
    if (null != this.F && this.F.d) {
      this.m--;
      this.F.a(paramGraphics, this.m);
    } 
    if (null != this.at) {
      this.m--;
      if (this.m > -50)
        this.at.a(paramGraphics); 
    } 
    p();
    if (this.aH >= 0) {
      if(4, 257, 12, 269, 230, 63);
      if (null != this.for) {
        this.aC.if(4, 228, this.for.length() * 19 + 24, 30);
        paramGraphics.setColor(4129131);
        paramGraphics;
        paramGraphics;
        paramGraphics.drawString(this.for, (this.for.length() * 19 + 12) / 2 + 8, 234, true | 0x10);
      } 
      if (this.aH < 0) {
        this.e = 0;
        this.for = null;
      } 
    } 
    if (this.e == 13) {
      this.aC.a(this.aC.bc[45] + this.aC.R + this.aC.bc[131], 10, 254);
      if (this.aC.bm == 12) {
        if (this.aC.b2 == 0) {
          this.aC.a(this.aC.R, 10, 254);
          this.k[this.af][this.ad] = -1;
          this.aC.int(300);
          if (new(2) == 1) {
            i1 = (byte)(1 + new(3));
            this.aC.bt += i1;
            this.aC.if(this.aC.bc[132] + this.aC.bc[98] + i1, 0);
          } 
          this.a3 = 0;
        } 
        this.aC.b2 = -1;
        this.aC.bm = 0;
        this.e = 0;
        this.a5 = 0;
      } else if (this.as == -7) {
        this.aC.b2 = -1;
        this.aC.bm = 0;
        this.e = 0;
        this.a5 = 0;
      } 
    } else if (this.e == 18) {
      this.aC.if(this.aC.R, 0);
      this.e = 0;
      a();
    } 
    if (this.e == 17) {
      this.aC.a(this.aI[15], 10, 238);
      this.aC.bh();
      this.aC.i();
    } 
    this.aC.an();
    if (this.aC.b2 != -1) {
      if (this.y == 2) {
        this.aC.do(120, (320 - this.aC.ah.length * 16 >> 1) + 18, 16, 30);
        i1 = 66;
        byte b1 = 66;
        int i2 = (240 - i1) / 2;
        char c1 = ('ŀ' - b1) / '\002' - '0';
        paramGraphics.setColor(10061480);
        paramGraphics.fillRoundRect(i2, c1, i1, b1, 9, 9);
        paramGraphics.setColor(6570881);
        paramGraphics.drawRoundRect(i2, c1, i1, b1, 9, 9);
        paramGraphics.setColor(15925247);
        paramGraphics.drawRoundRect(i2 + 1, c1 + '\001', i1 - 2, b1 - 2, 9, 9);
        paramGraphics.setColor(12760287);
        paramGraphics.drawRoundRect(i2 + 2, c1 + '\002', i1 - 4, b1 - 4, 9, 9);
        paramGraphics.setColor(6570881);
        paramGraphics.drawRoundRect(i2 + 3, c1 + '\003', i1 - 6, b1 - 6, 9, 9);
        if (null == this.aC.B[false]) {
          byte[] arrayOfByte = { 28, 74, 51 };
          this.aC.B[0] = this.aC.else(arrayOfByte[this.aC.b2]);
        } 
        paramGraphics;
        paramGraphics;
        paramGraphics.drawImage(this.aC.B[0], 120, c1 + '\013', 0x10 | true);
      } else {
        this.aC.do(120, 320 - this.aC.ah.length * 16 >> 1, 16, 30);
      } 
      if (this.e == 16)
        this.aC.a("花费30金回复所有怪物体力？", 8, 254); 
    } 
    int();
    this.i = (short)(this.i + 1);
    if (this.i > 10000)
      this.i = 0; 
  }
  
  private void p() {
    if (null == this.d)
      this.d = this.aC.Y.a("/sms.png"); 
    ab;
    ab;
    ab.drawImage(this.d, 239, 319, 0x8 | 0x20);
    if (this.l != 0 && null != this.aA)
      if (this.l != 7) {
        ab;
        ab;
        ab.drawImage(this.aA[1], 120, 57, true | 0x10);
        ab;
        ab;
        ab.drawImage(this.aA[0], 120, 0, 0x8 | 0x10);
        ab;
        ab;
        w;
        this.aC.a(w, this.aA[0], 120, 0, 0x4 | 0x10, 8192);
      } else {
        ab;
        ab;
        ab.drawImage(this.aA[1], 120, 0, true | 0x10);
      }  
  }
  
  private void byte(int paramInt) {
    this.l = (byte)paramInt;
    this.aA = null;
    if (paramInt != 0) {
      this.aA = new Image[2];
      if (this.l != 7)
        this.aA[0] = this.aC.Y.a("/guochang/bg.png"); 
      this.aA[1] = this.aC.Y.a("/guochang/" + paramInt + ".png");
    } 
  }
  
  private boolean a(byte[] paramArrayOfByte) {
    this.a9 = this.Z + (paramArrayOfByte[0] << 4);
    this.a7 = this.Y + (paramArrayOfByte[1] << 4);
    return (this.a9 >= -16 && this.a9 < 240 && this.a7 >= -16 && this.a7 < 320);
  }
  
  void int(int paramInt) {
    if (this.e == 16 && this.aC.b2 >= 0)
      this.aC.aS(); 
    if (this.e == 10) {
      paramInt = 0;
      return;
    } 
    if (this.h == 2) {
      paramInt = 0;
      return;
    } 
    if (this.aC.bS != -1) {
      this.aC.k(paramInt);
      a();
      return;
    } 
    if (this.aC.b2 != -1) {
      if (paramInt == -6 || paramInt == 53 || paramInt == -5) {
        this.aC.bm = 12;
      } else {
        if (this.y == 2)
          this.aC.B[0] = null; 
        this.aC.aS();
        this.as = (byte)paramInt;
      } 
      a();
      return;
    } 
    if (this.e == 11) {
      if (paramInt == -6 || paramInt == 53 || paramInt == -5)
        this.aC.d = 0; 
      if (this.aC.d == 0)
        this.e = 0; 
      return;
    } 
    if (this.e == 1) {
      this.e = 14;
      if (paramInt == -7 && this.am == 2) {
        this.e = 0;
        this.aH = -1;
        this.am = 0;
      } 
      a();
    } 
    if (this.e == 17) {
      if (paramInt == -6 || paramInt == 53) {
        this.e = 0;
        if(ab);
        this.aC.c = 100;
        this.aC.aB = 0;
      } else if (paramInt == -7) {
        this.e = 0;
      } 
      a();
      return;
    } 
    if (this.aM < this.L || this.e != 0)
      return; 
    if (this.e == 0 && this.aC.c != 98)
      if (paramInt == -6) {
        this.aC.ac();
      } else if (paramInt == -7) {
        this.aC.l(-1);
      }  
    if (this.r) {
      if (this.h == 2)
        return; 
      this.as = (byte)-paramInt;
      try();
    } 
  }
  
  void try() {
    switch (this.as) {
      case 1:
      case 2:
      case 3:
      case 4:
        if (this.aZ != this.as) {
          do(this.as);
          break;
        } 
        new(this.B[this.h][this.as][0], this.B[this.h][this.as][1]);
        break;
      case -53:
      case 5:
        int(this.B[this.h][this.aZ][0] * this.j, this.B[this.h][this.aZ][1] * this.j);
        break;
      case -57:
        if (this.aC.m(15) && this.h <= 1) {
          if (this.h == 1) {
            try(0);
          } else {
            try(1);
          } 
          a();
        } 
        break;
      case -51:
        if (this.aC.bS == -1)
          this.aC.for(); 
        a();
        break;
    } 
  }
  
  void l() {
    this.aS = this.aF[this.h][this.aZ - 1];
    this.else = this.aS;
  }
  
  void do(int paramInt) {
    this.aZ = (byte)paramInt;
    l();
    this.L = 2;
    this.aM = 0;
    this.x = 0;
    this.g = 0;
  }
  
  void try(int paramInt) {
    if (paramInt != this.h && (paramInt == 1 || this.h == 1))
      char(paramInt); 
    this.h = (byte)paramInt;
    this.j = (byte)((this.h == 1) ? 2 : 4);
    l();
  }
  
  void r() {
    if (this.aM < this.L) {
      if ((this.x > 0 && this.if >= this.int && this.if < this.K) || (this.x < 0 && this.if > this.int && this.if <= this.K))
        this.Z -= this.x; 
      if ((this.g > 0 && this.ba >= this.aD && this.ba < this.A) || (this.g < 0 && this.ba > this.aD && this.ba <= this.A))
        this.Y -= this.g; 
      this.if += this.x;
      this.ba += this.g;
      if (this.if < 0)
        this.if = 0; 
      if (this.ba < 0)
        this.ba = 0; 
      if (this.if + 8 >= this.a6 * 16)
        this.if = this.a6 * 16 - 16; 
      if (this.ba + 8 > this.al * 16)
        this.ba = this.al * 16 - 16; 
      if (this.ar == 0) {
        this.else = this.aS;
        if (this.h != 2)
          this.else = (byte)(this.else + this.ae[this.h][this.aM]); 
        this.ar = 0;
      } else {
        this.ar = (byte)(this.ar - 1);
      } 
      this.aM = (byte)(this.aM + 1);
    } else {
      this.aM = 100;
    } 
  }
  
  byte do(byte[][] paramArrayOfByte) {
    for (byte b1 = 0; b1 < paramArrayOfByte.length; b1 = (byte)(b1 + 1)) {
      if (paramArrayOfByte[b1][0] == this.af && paramArrayOfByte[b1][1] == this.ad)
        return b1; 
    } 
    return -1;
  }
  
  void a(int paramInt) {
    if (this.aC.m(paramInt)) {
      this.aC.R = this.aC.bc[141] + this.aC.bc[1] + this.aC.c(paramInt);
    } else {
      this.aC.R = this.aI[12] + this.aC.bc[1] + this.aC.c(paramInt) + this.aI[13];
    } 
    this.a5 = this.aC.w;
  }
  
  void n() {
    if (this.a5 != -1) {
      this.e = 13;
      String[] arrayOfString = { this.aC.bc[113], this.aC.bc[112] };
      this.aC.ah = arrayOfString;
      this.aC.b2 = 0;
    } else {
      this.e = 18;
    } 
    a();
  }
  
  byte if(int paramInt1, int paramInt2) {
    if (this.k[paramInt1][paramInt2] != -1) {
      byte b1 = this.G.byte[this.k[paramInt1][paramInt2]];
      switch (b1) {
        case 3:
          a(26);
          n();
          return 3;
        case 2:
          a(25);
          n();
          return 2;
        case 6:
          this.aC.R = this.aI[9];
          this.e = 18;
          return 6;
        case 5:
          if (!this.aC.m(23)) {
            this.aC.R = this.aI[10];
            this.e = 18;
            return 5;
          } 
          return 0;
        case 4:
          if (this.e == 0 && !this.aC.m(22)) {
            this.aC.R = this.aI[11];
            this.e = 18;
          } 
          return 4;
      } 
      return b1;
    } 
    return 0;
  }
  
  byte int(int paramInt1, int paramInt2) {
    this.af = (byte)((this.if + paramInt1) / 16);
    this.ad = (byte)((this.ba + paramInt2) / 16);
    if (this.af < 0 || this.af >= this.a6 || this.ad < 0 || this.ad >= this.al)
      return 0; 
    byte b1 = 0;
    b1 = do(this.aT);
    if (this.e == 0 && b1 != -1 && this.aT[b1][4] > -1) {
      this.e = 2;
      a();
      this.a5 = b1;
      return 99;
    } 
    b1 = do(this.o);
    if (b1 != -1 && this.o[b1][2] != -1) {
      this.a5 = b1;
      a();
      char();
      return 0;
    } 
    return if(this.af, this.ad);
  }
  
  byte for(int paramInt1, int paramInt2) {
    this.af = (byte)((paramInt1 >= 0) ? ((this.if + 15 + paramInt1) / 16) : ((this.if + paramInt1) / 16));
    this.ad = (byte)((paramInt2 >= 0) ? ((this.ba + 15 + paramInt2) / 16) : ((this.ba + paramInt2) / 16));
    byte b1 = do(this.ag);
    if (b1 != -1) {
      if (((this.as == this.ag[b1][2] && this.ag[b1][5] != 2) || (this.ag[b1][5] == 2 && this.ag[b1][2] == 0)) && this.h != 2) {
        a();
        if (this.ag[b1][5] == 2 && this.ag[b1][2] == 0)
          this.an = 1; 
        if (this.y == 46 && b1 >= 1 && b1 <= 4) {
          if (this.aT[0][4] == -1) {
            this.e = 5;
            this.am = this.e;
            this.a5 = b1;
          } else {
            this.aC.if(this.aI[14], 0);
            this.an = 0;
          } 
        } else {
          this.e = 5;
          this.am = this.e;
          this.a5 = b1;
        } 
        return 0;
      } 
      if ((this.ag[b1][2] == 0 || (this.ag[b1][5] == 2 && this.ag[b1][2] != 0)) && this.h == 2) {
        this.e = 5;
        this.am = this.e;
        this.a5 = b1;
        return 0;
      } 
    } 
    b1 = do(this.aT);
    if (b1 != -1 && this.aT[b1][4] == 1) {
      a();
      return (this.aT[b1][2] == 35) ? 0 : 1;
    } 
    b1 = do(this.o);
    if (b1 != -1) {
      a();
      return (this.o[b1][2] == 1) ? 1 : 0;
    } 
    boolean bool = false;
    if (this.k[this.af][this.ad] != -1) {
      b1 = if(this.af, this.ad);
      if (b1 == 0 && this.h == 3)
        try(0); 
      if (b1 == 4) {
        if (this.h == 2)
          b1 = 0; 
        if (this.aC.m(22) && this.h != 2) {
          try(3);
          bool = true;
          b1 = 0;
        } 
      } else if (b1 == 5 && this.aC.m(23)) {
        b1 = 0;
      } 
      if (b1 != 0)
        return b1; 
    } 
    if (this.z[this.af][this.ad] != -1) {
      b1 = this.void.byte[this.z[this.af][this.ad]];
      if (!bool && b1 == 0 && this.h == 3)
        try(0); 
      if (b1 == 4)
        if (this.h == 2) {
          b1 = 0;
        } else if (this.aC.m(22)) {
          try(3);
          b1 = 0;
        }  
      return b1;
    } 
    return 0;
  }
  
  void b() {
    if (this.aJ < this.aQ) {
      if (this.e != 10)
        this.aJ = (byte)(this.aJ + 1); 
    } else {
      if (this.ay == 1) {
        this.ay = 0;
        this.aC.if(this.aI[0], 0);
      } else {
        this.e = 8;
      } 
      this.aJ = 0;
      try(0, 0);
    } 
  }
  
  void new(int paramInt1, int paramInt2) {
    this.x = (byte)paramInt1;
    this.g = (byte)paramInt2;
    if (this.if + this.x >= 0 && this.if + this.x + 15 < this.a6 * 16 && this.ba + this.g >= 0 && this.ba + this.g + 15 < this.al * 16) {
      this.R = for(this.x, this.g);
      if (0 == this.R) {
        this.L = this.j;
        this.aM = 0;
        if (this.aC.bA[this.y].length > 0 && this.h != 2)
          b(); 
      } else if (this.R == 4) {
        if (this.aC.m(22)) {
          try(3);
          if (this.aC.bA[this.y].length > 0 && this.h != 2)
            b(); 
        } 
      } else {
        this.x = 0;
        this.g = 0;
      } 
    } else {
      this.x = 0;
      this.g = 0;
      this.af = (byte)(this.if / 16);
      this.ad = (byte)(this.ba / 16);
      byte b1 = do(this.ag);
      if (b1 != -1 && this.ag[b1][5] == 0 && this.as == this.ag[b1][2]) {
        this.e = 5;
        this.am = this.e;
        this.a5 = b1;
      } 
    } 
  }
  
  void if(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.aC.do(paramInt1, paramInt2, paramInt5, paramInt6 - 1, 15452159, 10448383, 3473558);
    ab.setColor(4802889);
    byte b1;
    for (b1 = 0; b1 < this.ah && b1 + this.aH < this.Q.length; b1 = (byte)(b1 + 1)) {
      if (this.aH + this.aC.br >= this.Q.length) {
        ab;
        ab;
        ab.drawString(this.Q[this.aH + b1].toString(), paramInt3 + 3, paramInt4 + b1 * 22 + 16, 0x4 | 0x40);
        if (this.e == 14) {
          this.aH = -1;
          this.ah = 1;
          this.Q = null;
          break;
        } 
      } else {
        ab;
        ab;
        ab.drawString(this.Q[this.aH + b1].toString(), paramInt3 + 3, paramInt4 + b1 * 22 + 16, 0x4 | 0x40);
        if (this.e == 14 && b1 == this.aC.br - 1) {
          this.ah = 1;
          this.aH = (byte)(this.aH + this.aC.br);
          this.e = 1;
        } 
      } 
    } 
    if (this.ah < this.aC.br)
      this.ah = (byte)(this.ah + 1); 
  }
  
  public void a(int paramInt1, int paramInt2) {
    this.aE = (byte)(paramInt1 - 1);
    this.P = (byte)paramInt2;
    this.O = 10;
  }
  
  void m() {
    this.at = null;
    this.F = null;
    this.void = null;
    this.G = null;
    this.aT = (byte[][])null;
    this.o = (byte[][])null;
    this.ag = (byte[][])null;
    this.aK = (Image[][])null;
    this.z = (byte[][])null;
    this.k = (byte[][])null;
    this.n = null;
    this.byte = null;
    this.U = null;
    this.aA = null;
    this.c = null;
    this.W = (byte[][])null;
    this.J = null;
    this.M = (byte[][])null;
    this.f = null;
    if (this.h != 2) {
      this.aY = null;
    } else {
      for (byte b1 = 0; b1 < this.aY.length; b1++) {
        if (b1 != 3)
          this.aY[b1] = null; 
      } 
    } 
  }
  
  StringBuffer[] a(String paramString) {
    int i1 = (paramString.length() % 11 == 0) ? (paramString.length() / 11) : (paramString.length() / 11 + 1);
    this.Q = new StringBuffer[i1];
    int i2 = 0;
    for (byte b1 = 0; i2 < paramString.length(); b1++) {
      if (b1 >= i1) {
        StringBuffer[] arrayOfStringBuffer = this.Q;
        this.Q = new StringBuffer[++i1];
        System.arraycopy(arrayOfStringBuffer, 0, this.Q, 0, arrayOfStringBuffer.length);
      } 
      if (i2 + 11 > paramString.length()) {
        this.Q[b1] = new StringBuffer(paramString.substring(i2));
      } else {
        this.Q[b1] = new StringBuffer(paramString.substring(i2, i2 + 11));
      } 
      int i3 = this.Q[b1].toString().indexOf("/n");
      if (i3 != -1) {
        this.Q[b1] = new StringBuffer(paramString.substring(i2, i2 + i3));
        i2 += i3 + 2;
      } else {
        i2 += 11;
      } 
    } 
    return this.Q;
  }
  
  byte[] g() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    a(byteArrayOutputStream, this.aT);
    a(byteArrayOutputStream, this.char);
    a(byteArrayOutputStream, this.o);
    a(byteArrayOutputStream, this.ag);
    return byteArrayOutputStream.toByteArray();
  }
  
  void a(ByteArrayOutputStream paramByteArrayOutputStream, byte[][] paramArrayOfByte) {
    try {
      paramByteArrayOutputStream.write(paramArrayOfByte.length);
      for (byte b1 = 0; b1 < paramArrayOfByte.length; b1++) {
        paramByteArrayOutputStream.write(paramArrayOfByte[b1].length - 100);
        paramByteArrayOutputStream.write(paramArrayOfByte[b1]);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  short[][] w() {
    short[][] arrayOfShort = (short[][])null;
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.aC.a(3, null, 1));
    arrayOfShort = new short[byteArrayInputStream.read()][];
    for (byte b1 = 0; b1 < arrayOfShort.length; b1++) {
      int i1 = byteArrayInputStream.read();
      if (i1 != 0) {
        arrayOfShort[b1] = new short[i1];
        for (byte b2 = 0; b2 < arrayOfShort[b1].length; b2++)
          arrayOfShort[b1][b2] = (short)(byteArrayInputStream.read() | byteArrayInputStream.read() << 8); 
      } 
    } 
    return arrayOfShort;
  }
  
  byte[] a(short[][] paramArrayOfShort) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    byteArrayOutputStream.write(paramArrayOfShort.length);
    for (byte b1 = 0; b1 < paramArrayOfShort.length; b1++) {
      if (paramArrayOfShort[b1] == null) {
        byteArrayOutputStream.write(0);
      } else {
        byteArrayOutputStream.write(paramArrayOfShort[b1].length);
        for (byte b2 = 0; b2 < paramArrayOfShort[b1].length; b2++) {
          byteArrayOutputStream.write(paramArrayOfShort[b1][b2] & 0xFF);
          byteArrayOutputStream.write(paramArrayOfShort[b1][b2] >> 8 & 0xFF);
        } 
      } 
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  void o() {
    if (null == this.M)
      return; 
    this.case = (byte)(this.case + 1);
    if (this.case >= 9)
      this.case = 0; 
    byte b1 = (byte)(this.case / 3);
    int i1 = this.M.length;
    int i2;
    for (i2 = 0; i2 < i1; i2++) {
      byte b2 = (this.M[i2][1] << 4) + this.Z;
      byte b3 = (this.M[i2][2] << 4) + this.Y;
      if (b2 > -16 && b2 < 256 && b3 > -16 && b3 < 336)
        if (this.M[i2][3] == 0) {
          ab.drawImage(this.J[this.M[i2][0] + b1], b2, b3, 20);
        } else {
          this.aC;
          this.aC.a(w, this.J[this.M[i2][0] + b1], b2, b3, 20, e.try[this.M[i2][3]]);
        }  
    } 
    if (this.au[0] == -1 && this.aC.aB % 30 == 0 && new(2) == 0)
      for (i2 = this.ai.length - 1; i2 >= 0; i2--) {
        if (this.y == this.ai[i2][0]) {
          int i3 = new((this.ai[i2].length - 1) / 2) * 2 + 1;
          this.au[1] = (short)((this.ai[i2][i3] << 4) - 5 + new(10));
          this.au[2] = (short)((this.ai[i2][i3 + 1] << 4) - 5 + new(10));
          this.au[3] = (short)new(2);
          this.au[4] = (short)new(3);
          this.au[0] = 0;
          break;
        } 
      }  
    if (this.au[0] >= 0) {
      if();
      i2 = (byte)Math.abs(this.au[0] % 20 / 2);
      if (this.au[3] == 0) {
        ab.drawImage(this.n[i2], this.au[1] + this.ac[i2][0] + this.Z, this.au[2] + this.ac[i2][1] + this.Y, 20);
      } else {
        ab;
        ab;
        w;
        this.aC.a(w, this.n[i2], this.au[1] - this.ac[i2][0] + this.Z, this.au[2] + this.ac[i2][1] + this.Y, 0x10 | 0x8, 8192);
      } 
      this.au[0] = (short)(this.au[0] + 1);
      if (this.au[4] == 0) {
        if (this.au[0] >= 6)
          this.au[0] = -1; 
      } else if (this.au[0] >= 20) {
        this.au[0] = -1;
      } 
    } 
    if (null != this.U) {
      this.U[5] = (short)(this.U[3] - this.if + 8);
      this.U[6] = (short)(this.U[4] - this.ba + 8);
      if (this.U[11] == 1) {
        if (Math.abs(this.U[5]) < 20 && Math.abs(this.U[6]) < 20) {
          if (Math.abs(this.U[5]) < Math.abs(this.U[6])) {
            if (this.U[5] > 0) {
              this.U[0] = 4;
            } else {
              this.U[0] = 3;
            } 
          } else if (this.U[6] > 0) {
            this.U[0] = 2;
          } else {
            this.U[0] = 1;
          } 
          this.U[11] = 5;
        } else if (this.U[1] == 1 && new(10) == 0) {
          this.U[0] = (short)(new(4) + 1);
        } 
        if (this.U[3] < this.U[7]) {
          this.U[0] = 4;
        } else if (this.U[4] < this.U[8]) {
          this.U[0] = 2;
        } else if (this.U[3] > this.U[9]) {
          this.U[0] = 3;
        } else if (this.U[4] > this.U[10]) {
          this.U[0] = 1;
        } 
      } else if (this.U[11] > 1) {
        this.U[11] = (short)(this.U[11] - 1);
      } 
      if (this.U[11] > 1) {
        this.U[1] = (short)(this.U[1] + 1);
      } else if (this.U[1] == 1 && new(2) == 0) {
        this.U[1] = (short)(this.U[1] + 1);
      } else if (this.U[1] == 0 && new(5) == 0) {
        this.U[1] = (short)(this.U[1] + 1);
      } 
      if (this.U[1] >= 2)
        this.U[1] = 0; 
      if (this.U[1] == 1) {
        this.U[5] = (short)(this.U[3] + this.aL[0][this.U[0]]);
        this.U[6] = (short)(this.U[4] + this.aL[1][this.U[0]]);
        this.U[3] = this.U[5];
        this.U[4] = this.U[6];
      } 
      this.U[2] = (short)(this.aW[this.U[0]] + this.U[1]);
      if (this.U[0] != 4) {
        ab;
        ab;
        ab.drawImage(this.byte[this.U[2]], this.Z + this.U[3], this.Y + this.U[4] + 5, true | 0x20);
      } else {
        ab;
        ab;
        w;
        this.aC.a(w, this.byte[this.U[2]], this.Z + this.U[3], this.Y + this.U[4] + 5, true | 0x20, 8192);
      } 
    } 
  }
  
  private void x() {
    this.au[0] = -1;
    this.U = null;
    for (int i1 = this.ao.length - 1; i1 >= 0; i1--) {
      if (this.ao[i1][0] == this.y) {
        this.U = new short[] { 
            1, 0, 0, (short)(this.ao[i1][1] + 1 << 4), (short)(this.ao[i1][2] + 1 << 4), 0, 0, (short)(this.ao[i1][1] << 4), (short)(this.ao[i1][2] << 4), (short)(this.ao[i1][3] << 4), 
            (short)(this.ao[i1][4] << 4), 1 };
        break;
      } 
    } 
    if (null != this.U)
      goto(); 
  }
  
  void if(byte[][] paramArrayOfByte) {
    for (int i1 = paramArrayOfByte.length - 1; i1 >= 0; i1--) {
      for (int i2 = paramArrayOfByte[i1].length - 1; i2 >= 0; i2--) {
        if (paramArrayOfByte[i1][i2] != -1 && this.aC.bU[paramArrayOfByte[i1][i2]][0] != -1) {
          byte[] arrayOfByte = new byte[4];
          arrayOfByte[0] = this.aC.bU[paramArrayOfByte[i1][i2]][0];
          arrayOfByte[1] = (byte)i1;
          arrayOfByte[2] = (byte)i2;
          arrayOfByte[3] = this.aC.bU[paramArrayOfByte[i1][i2]][1];
          this.f.addElement(arrayOfByte);
        } 
      } 
    } 
  }
  
  void new() {
    this.M = new byte[this.f.size()][];
    for (int i1 = this.f.size() - 1; i1 >= 0; i1--)
      this.M[i1] = (byte[])this.f.elementAt(i1); 
    this.f = null;
    if (this.M.length > 0)
      do(); 
  }
  
  static int new(int paramInt) { return f.int(paramInt); }
  
  private void int() {
    if (this.try >= 0) {
      if (this.try % 2 < 1) {
        ab.setColor(15658734);
        ab.fillRect(0, 0, 240, 320);
      } 
      this.aC.int(100);
      this.try = (byte)(this.try - 1);
    } 
  }
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/b.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */