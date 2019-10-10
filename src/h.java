import com.nokia.mid.ui.DirectUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;

public class h extends e {
  byte bW = 0;
  
  byte aF = 60;
  
  RecordStore bv;
  
  byte[] aV;
  
  short[] a4;
  
  f Y;
  
  b bV;
  
  byte bl = 0;
  
  byte c = 1;
  
  byte bK = 0;
  
  byte ap;
  
  byte bm = 0;
  
  byte aL;
  
  byte bb = 0;
  
  byte bM;
  
  byte bH;
  
  byte bL;
  
  byte bP;
  
  byte bR;
  
  byte aO;
  
  byte aJ;
  
  byte aM;
  
  byte bJ;
  
  int ba;
  
  int a9;
  
  int bw;
  
  int I;
  
  byte bq;
  
  byte bg;
  
  byte bi = 2;
  
  byte aB;
  
  byte b3;
  
  short bN;
  
  byte A;
  
  int bt = 0;
  
  public d[] F;
  
  public byte bC;
  
  public d[] bd;
  
  public byte ax;
  
  byte[][] m;
  
  public d[] aq;
  
  byte j;
  
  byte aw;
  
  d else;
  
  d bT;
  
  d bp;
  
  Image[] ar;
  
  Image[] B = null;
  
  String[] ah;
  
  String aA;
  
  byte[][][] b0;
  
  byte[] aZ;
  
  byte[] X;
  
  byte br;
  
  short ao = 202;
  
  byte b2 = -1;
  
  byte bk = 0;
  
  byte aP = 0;
  
  byte a8;
  
  byte aU;
  
  byte[] ad;
  
  byte aW;
  
  int f;
  
  byte[][] au;
  
  int Z;
  
  byte ak = 0;
  
  byte D = -1;
  
  Image[] V;
  
  int ab = 0;
  
  byte ac = -1;
  
  byte p;
  
  final int[][] byte = { { 14070014, 7219375, 10049499, 16447990, 14070014 }, { 11831021, 7219375, 10448383, 15195135, 13744638 } };
  
  short[] aj;
  
  byte l;
  
  byte void = 8;
  
  byte[][] v = { { 0, 20, 40, 60, 80, 90, 100 }, { 0, 20, 40, 60, 80, 100, 110 }, { 0, 20, 40, 60, 80, 110, 120 } };
  
  byte O = 0;
  
  byte i;
  
  byte r;
  
  d aG;
  
  public int b;
  
  Image a6 = null;
  
  byte bQ = -1;
  
  Image b1;
  
  Image L;
  
  byte[][] t;
  
  int[] J = { 
      10443007, 10443007, 10443007, 10443007, 10443007, 10443007, 10443007, 7668145, 7668145, 16776960, 
      16776960, 15515137, 15515137 };
  
  int bf = 0;
  
  int o = 8;
  
  Image[] K;
  
  Image[] s;
  
  byte b4;
  
  byte ag;
  
  Image[] aC;
  
  Image[] aK = null;
  
  Image x = null;
  
  Image[] bn;
  
  byte u;
  
  byte W;
  
  byte w;
  
  byte[][] ai;
  
  byte as;
  
  byte d;
  
  String bo;
  
  final byte[][] bF = { { 2, 33, 3 }, { 2, 38, 0 }, { 2, 23, 15 }, { 2, 24, 6 }, { 2, 25, 18 }, { 2, 47, 12 }, { 2, 48, 9 } };
  
  byte[][] bU;
  
  String R;
  
  byte bX = 25;
  
  byte aa;
  
  byte[] bO;
  
  byte[][] bD = { { 35, 20, 36 }, { 49, 20, 63 }, { 11, 20, 12 }, { 25, 20, 26 }, { 78, 20, 79 }, { 36, 40, 43 }, { 63, 40, 54 }, { 12, 40, 9 }, { 26, 40, 25 }, { 79, 40, 72 } };
  
  byte[][][] bA = (byte[][][])null;
  
  byte[][] bu;
  
  String[] aQ;
  
  byte[][] af;
  
  String[] S;
  
  String[] C;
  
  String[] av;
  
  String[] bY;
  
  String[] bc;
  
  String[] a2;
  
  final int[] ae = { 0, 5308790, 6479320, 11476991, 16777215 };
  
  final int[] aS = { 7158528, 8519882, 16777215, 7419587, 5308790, 5842596 };
  
  final int al = 16773328;
  
  byte bZ;
  
  byte[] a3 = new byte[101];
  
  byte[][] bx;
  
  byte[][][][] a0;
  
  byte[][] H;
  
  byte[][] aH;
  
  String[] am;
  
  byte[][] T;
  
  String[] by;
  
  byte[][] q;
  
  short[][][] P;
  
  String[][] G;
  
  short[][] bB;
  
  byte[][] aT;
  
  short[][][] bI;
  
  String[][] at;
  
  byte[][] z;
  
  byte a5 = 0;
  
  byte bS = -1;
  
  byte N;
  
  Image[] aI;
  
  Image[] a1;
  
  byte n = 0;
  
  int goto;
  
  byte g = 0;
  
  byte[] az = new byte[7];
  
  String[] aN;
  
  public byte bh;
  
  Image aE = null;
  
  byte[] U;
  
  byte[] k = { 
      0, 0, 4, 1, 3, 8, 2, 9, 6, 7, 
      33, 34, -100 };
  
  byte e = 0;
  
  byte aD;
  
  byte an;
  
  byte aY = 0;
  
  byte h = -1;
  
  String[] Q = { "调试模式 *返回", "0不遇敌", "1地图跳转", "上 改npc", "左 得道具", "右 战斗逃跑", "3 win", "7进入战斗", "9得到道具", "#得到怪兽" };
  
  static final byte E = 88;
  
  static final byte bz = -14;
  
  int M = 16777215;
  
  byte bj = 0;
  
  byte be = 0;
  
  boolean aX = false;
  
  String[] bs = { "购买金币", "多倍经验", "道具包", "扩充电脑", "开启关卡", "战斗复活" };
  
  String[] bG;
  
  boolean y = false;
  
  byte char;
  
  byte bE = 1;
  
  byte aR = 5;
  
  byte long;
  
  byte ay = 70;
  
  String case = "您的金钱不足！可以按左软键进行购买，还有超值礼包哟。";
  
  String[] a7 = { "您要使用还魂瓶原地复活并且恢复您的所有怪物吗？" };
  
  public h(f paramf) {
    this.Y = paramf;
    ab();
    this.ar = new Image[5];
    this.B = new Image[2];
  }
  
  void ab() { this.bc = a("text"); }
  
  void Y() { this.Y.t = 61; }
  
  void av() {
    String[] arrayOfString = { this.bc[102], this.bc[103], this.bc[104], this.bc[105], this.bc[106], this.bc[107], "qq游戏中心" };
    this.ah = arrayOfString;
    az();
    this.bV = null;
    this.F = null;
    this.aq = null;
    this.bp = null;
    this.bL = 0;
    this.bM = 6;
    this.Y.M = new Image[2][];
    this.Y.M[0] = this.Y.a(7, "menu");
    this.Y.M[1] = this.Y.a(9, "menu2");
  }
  
  void az() {
    if (null != this.bV)
      this.bV.m(); 
    this.ar[4] = null;
    this.B[0] = null;
    this.B[1] = null;
    as();
  }
  
  void int() {
    a(0, null, 3);
    Z();
  }
  
  void case(int paramInt) {
    this.Y.t = 21;
    this.Y.E = (short)(byte)(paramInt * 2);
    this.Y.c();
    this.Y.E = (short)(this.Y.E + 1);
    this.Y.c();
  }
  
  void Z() {
    case(0);
    case(1);
    this.bV = new b(this);
    case(2);
    au();
    case(3);
    f(-1);
    case(4);
    this.br = 2;
    case(5);
    this.bV.v();
    case(6);
    aa();
    case(7);
    this.aa = 3;
    case(8);
    System.gc();
    case(9);
    case(10);
    case(11);
    this.bV.byte();
    for (byte b5 = 12; b5 <= 27; b5 = (byte)(b5 + 1))
      case(b5); 
    this.Y.t = 30;
    this.c = -10;
    this.Y.Q = null;
    this.aC[19] = null;
    this.aC[20] = null;
    a(0, null, 4);
  }
  
  void bk() {
    this.bV.i();
    byte(0);
    byte(1);
    aY();
    a(0, null, 4);
  }
  
  public void Q() {
    switch (this.c) {
      case -87:
        if (this.aB == 0)
          ad(); 
        break;
      case -11:
        if (this.aB >= 4)
          f(this.Y.W); 
        break;
      case -10:
        this.bV.e();
        break;
      case -30:
        if (this.A == 1) {
          this.A = 2;
          new g(this, 1);
        } 
        break;
      case 100:
        if (this.aB == 1) {
          bk();
          this.aB = 0;
          f(this.Y.W);
        } 
        break;
      case -50:
        this.A = 3;
        break;
      case -70:
        if (this.A == 1) {
          this.A = 2;
          new g(this, this.bK);
        } 
        if (this.bK != 0) {
          aW();
          return;
        } 
        break;
      case -15:
        if (this.aB == 100) {
          byte();
          bo();
        } 
        break;
      case -60:
        if (this.A == 1) {
          this.A = 2;
          new g(this, 16);
        } 
        break;
      case 55:
        if (this.A == 1) {
          ap();
          this.A = 3;
        } 
        break;
      case 45:
        if (this.A == 1 && this.aw > 0) {
          this.B[0] = null;
          ap();
          aa();
          this.A = 3;
        } 
        break;
      case 35:
        if (this.A == 1 && this.bC > 0) {
          this.A = 2;
          this.ar[0] = null;
          at();
          this.A = 3;
        } 
        break;
      case 88:
        ag();
        break;
    } 
  }
  
  void int(int paramInt1, int paramInt2) {
    if (this.bM == 1) {
      a(this.Y.long, 10, 238);
      bh();
      i();
      return;
    } 
    byte b5;
    for (b5 = 0; b5 < this.ah.length; b5++) {
      a(paramInt1, paramInt2 + 29 * b5, (b5 == this.bL), 94);
      if (b5 == this.bL) {
        this.int.setColor(this.aS[0]);
      } else {
        this.int.setColor(this.aS[1]);
      } 
      this.int;
      this.int;
      this.int.drawString(this.ah[b5], paramInt1 + 47, paramInt2 + 29 * b5 + 5, 0x10 | true);
      if (this.ah[b5].equals(this.bc[104]))
        if (this.Y.K) {
          this.int.drawString(this.bc[110], paramInt1 + 57 + 5, paramInt2 + 29 * b5 + 5, 20);
        } else {
          this.int.drawString(this.bc[111], paramInt1 + 57 + 5, paramInt2 + 29 * b5 + 5, 20);
        }  
    } 
    b5 = 76;
    a('ð' - b5, 291, true, b5);
    this.int.setColor(3473558);
    this.int.drawImage(this.aC[28], 'ð' - b5 + '\007', 301, 20);
    this.int;
    this.int;
    this.int.drawString(String.valueOf(this.bt), 235, 316, 0x8 | 0x20);
  }
  
  public void a(Graphics paramGraphics) {
    byte b6;
    int i1;
    byte b5;
    this.int = paramGraphics;
    this.new = DirectUtils.getDirectGraphics(paramGraphics);
    switch (this.c) {
      case -10:
        this.bV.if(paramGraphics);
        if (this.bS != -1)
          W(); 
        this.aB = (byte)(this.aB + 1);
        break;
      case 41:
        aB();
        paramGraphics.setClip(0, 0, 240, 64);
        a(2, paramGraphics, this.b2, 20, null);
        paramGraphics.setClip(0, 0, 240, 320);
        paramGraphics.setColor(16777215);
        paramGraphics;
        paramGraphics;
        paramGraphics.drawString("原地复活", 120, 36, true | 0x10);
        b5 = 60;
        a(0, b5, 240, this.Y.Q.length * 18 + 8, 15452159, 10448383, 3473558);
        for (i1 = 0; i1 < this.Y.Q.length; i1++) {
          paramGraphics;
          paramGraphics;
          paramGraphics.drawString(this.Y.Q[i1].toString(), 120, b5 + 18 * i1 + 4, true | 0x10);
        } 
        bh();
        i();
        break;
      case 40:
        this.Y.goto();
        a(this.bc[125], 10, 254);
        break;
      case 98:
        this.Y.goto();
        do(120, 320 - 16 * this.ah.length - 4 >> 1, 16, 30);
        a("      任意键返回", 10, 254);
        break;
      case -15:
        E();
        break;
      case -93:
        aO();
        break;
      case -85:
        D();
        break;
      case -87:
        aK();
        break;
      case -91:
        c();
        break;
      case -70:
        be();
        if (this.b3 < 6) {
          this.b3 = (byte)(this.b3 + 1);
        } else {
          this.b3 = 0;
        } 
        h();
        paramGraphics.setColor(16773328);
        paramGraphics.drawString(a((this.F[0]).do[16]), 13, 258, 20);
        paramGraphics.drawString(this.bc[0] + this.bc[88], 21, 282, 20);
        break;
      case -80:
        be();
        M();
        break;
      case -11:
        if (this.aB < 4) {
          this.new.setARGBColor(1345532723);
          paramGraphics.fillRect(0, 0, 240, 320);
          this.aB = (byte)(this.aB + 1);
        } 
        break;
      case -30:
        else();
        this.aB = (byte)(this.aB + 1);
        if (this.A == 3 && this.aB >= 8) {
          B();
          if (this.bJ == 1) {
            this.c = -50;
          } else {
            J();
          } 
          this.A = 1;
          this.aB = 0;
        } 
        break;
      case 100:
        this.aB = 1;
        a(this.bc[86] + this.bc[87] + this.bc[90] + this.bc[16], 10, 254);
        int(500);
        break;
      case 51:
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 0, 240, 320);
        if (this.bV.aH >= 0)
          this.bV.if(0, 0, 8, 16, 240, 326); 
        bh();
        break;
      case 50:
        if (this.ah == null) {
          byte[] arrayOfByte = new byte[101];
          byte b7;
          for (b7 = 0; b7 < this.bC; b7++)
            arrayOfByte[(this.F[b7]).do[16]] = 1; 
          for (b7 = 0; b7 < this.j; b7++)
            arrayOfByte[(this.aq[b7]).do[16]] = 1; 
          b7 = 0;
          for (byte b8 = 0; b8 < arrayOfByte.length; b8++) {
            if (arrayOfByte[b8] == 1)
              b7++; 
          } 
          this.if = 0;
          this.ah = a("win");
          this.ah[0] = this.ah[0] + b7;
          this.ah[0] = this.ah[0] + this.ah[6];
        } 
        void();
        paramGraphics.setColor(4802889);
        i1 = 320 - this.ah.length * 22 >> 1;
        for (b6 = 0; b6 < 6; b6++)
          paramGraphics.drawString(this.ah[b6], 26, i1 + 22 * b6, 20); 
        paramGraphics.setColor(16777215);
        paramGraphics;
        paramGraphics;
        paramGraphics.drawString(this.bc[140], 131, i1 + 132 + 1, true | 0x10);
        paramGraphics.setColor(9437439);
        paramGraphics;
        paramGraphics;
        paramGraphics.drawString(this.bc[140], 130, i1 + 132 + 1, true | 0x10);
        bh();
        break;
      case -22:
        this.aB = (byte)(this.aB + 1);
        B();
        if (this.aB < 5) {
          this.aB = (byte)(this.aB + 1);
          a(this.aB, 6);
          break;
        } 
        if (this.aB < 12) {
          aQ();
          a4();
        } 
        break;
      case -50:
        B();
        paramGraphics.setColor(1075637);
        paramGraphics.fillArc((this.aB << 3) - 18, 105, 36, 7, 0, 360);
        paramGraphics;
        paramGraphics;
        paramGraphics.drawImage(this.B[1], this.aB << 3, 110, true | 0x20);
        if (this.aB < 23) {
          this.aB = (byte)(this.aB + 1);
          break;
        } 
        if (this.A == 3)
          a4(); 
        break;
      case -60:
        L();
        if (this.aB < 15) {
          this.aB = (byte)(this.aB + 1);
          a(this.aB, 1);
          break;
        } 
        if (this.A == 3)
          I(); 
        break;
      case 25:
        a8();
        break;
      case 18:
      case 19:
        a6();
        break;
      case 35:
        this.aw = this.bC;
        a(this.F);
        break;
      case 65:
        aB();
        a(2, paramGraphics, this.b2, 20, null);
        paramGraphics.setColor(16777215);
        paramGraphics;
        paramGraphics;
        paramGraphics.drawString("操作怪兽", 120, 36, true | 0x10);
        for (b6 = 0; b6 < this.ah.length; b6++) {
          a(81, 104 + b6 * 29, (b6 == this.b2), 78);
          if (b6 == this.b2) {
            paramGraphics.setColor(this.aS[0]);
          } else {
            paramGraphics.setColor(this.aS[1]);
          } 
          paramGraphics;
          paramGraphics;
          paramGraphics.drawString(this.ah[b6], 120, 107 + b6 * 29, true | 0x10);
        } 
        bh();
        i();
        break;
      case 45:
        this.aw = this.j;
        a(this.aq);
        break;
      case 55:
        a7();
        break;
      case -19:
        be();
        if (this.aB < 16) {
          a(this.aB, 2);
          a(this.bc[1] + c(this.a5), 10, 246);
          break;
        } 
        if (this.aB < 17) {
          this.aU = -2;
          paramGraphics.drawImage(this.ar[2], this.ba, this.a9 - 5, 20);
          break;
        } 
        if (this.aB == 17) {
          b6 = 40 - 2 * this.bp.do[11] + (this.bp.for - this.bp.int) * 100 / (this.bp.for + 120);
          if (this.a5 == 5) {
            b6 += 20;
          } else if (this.a5 == 6) {
            b6 += 60;
          } else if (this.a5 == 7) {
            b6 = 100;
          } 
          if (b6 < 0)
            b6 = 0; 
          if (this.a5 == 5 || this.a5 == 6)
            b6 = b6 * (100 - this.H[this.bp.do[16]][12] / 3) / 100; 
          if (this.bp.do[11] <= 3)
            b6 = 100; 
          if (this.j == this.aR && this.bC == 5) {
            a("电脑" + this.bc[42] + this.bc[44] + this.bc[91] + "请扩充空间！", 8, 246);
            do(this.a5, 1);
            int(800);
            break;
          } 
          if (r(100) < b6) {
            paramGraphics.drawImage(this.ar[2], this.ba, this.a9, 20);
            a(a(this.bp.do[16]) + this.bc[3], 10, 246);
            this.bp.a();
            boolean bool = false;
            if (this.a3[this.bp.do[16]] == 0)
              bool = true; 
            bc();
            byte b7 = 0;
            byte b8 = 0;
            if (bool) {
              b8 = ah();
              byte b9;
              for (b9 = 0; b9 < this.bV.a8.length; b9 = (byte)(b9 + 1)) {
                if (b8 == this.bV.a8[b9]) {
                  b7 = b9;
                  break;
                } 
              } 
            } 
            do(this.a5, 1);
            int(500);
            s();
            byte();
            bo();
            if (b7 != 0) {
              this.bV.for = null;
              this.bV.a(this.bc[165] + b8 + this.bc[166]);
              this.bV.aH = 0;
              this.bV.e = 1;
            } 
            break;
          } 
          this.aU = 0;
          aQ();
          do(this.a5, 1);
          a(a(this.bp.do[16]) + this.bc[4], 10, 246);
          int(500);
          break;
        } 
        this.bK = 16;
        I();
        break;
      case 99:
        this.bV.if(paramGraphics);
        this.ba += 20;
        if (this.ba > 1)
          this.ba = 1; 
        int(this.ba, 1);
        break;
      case 21:
        o();
        break;
      case 22:
        m();
        break;
      case 23:
        x();
        break;
      case 88:
        aw();
        break;
    } 
    if (null != this.bV && this.bV.e != -77) {
      if (this.d != 0)
        q(); 
      al();
    } 
    if (this.e != 0)
      aM(); 
  }
  
  void int(int paramInt) { this.Y.G = paramInt; }
  
  void r() {
    switch (this.a8) {
      case 0:
      case 17:
      case 18:
      case 29:
      case 30:
        if (this.aB == 1) {
          this.bw = 6;
          this.I = this.aU * 5;
        } else {
          this.bw = 0;
          this.I = 0;
        } 
        if (this.aB == 4) {
          this.aB = 100;
          this.aU = (byte)-this.aU;
        } 
        return;
    } 
    if (this.aB <= 4) {
      this.bw = 0;
      this.I = -this.aB;
    } else {
      this.bw = 0;
      this.I = 0;
    } 
    if (this.aB == 4) {
      this.aB = 100;
      this.aU = (byte)-this.aU;
    } 
  }
  
  void bj() {
    short s1 = 0;
    short s2 = 0;
    byte b5 = 0;
    if (this.aU != -1) {
      s1 = 190;
      s2 = 105;
    } else {
      s1 = 62;
      s2 = 174;
    } 
    if (this.a8 == 41) {
      b5 = this.aP;
    } else {
      b5 = this.aP / 2;
    } 
    if (this.bx[this.a8].length > 0) {
      if (this.a0[this.bx[this.a8][0]][b5].length == 0) {
        this.bw = 3 * (this.aB & true);
        this.I = 0;
      } else {
        for (byte b6 = 0; b6 < this.a0[this.bx[this.a8][0]][b5].length; b6++) {
          if (this.a0[this.bx[this.a8][0]][b5][b6][3] == 100) {
            this.int.drawImage(this.bn[this.a0[this.bx[this.a8][0]][b5][b6][0]], s1 + this.a0[this.bx[this.a8][0]][b5][b6][1], s2 + this.a0[this.bx[this.a8][0]][b5][b6][2], 20);
          } else {
            this.int;
            this.int;
            this.int.drawImage(this.bn[this.a0[this.bx[this.a8][0]][b5][b6][0]], s1 + this.a0[this.bx[this.a8][0]][b5][b6][1], s2 + this.a0[this.bx[this.a8][0]][b5][b6][2], true | 0x20);
          } 
        } 
      } 
      this.aP = (byte)(this.aP + 1);
      if (b5 >= this.a0[this.bx[this.a8][0]].length - 1) {
        this.aB = 49;
        this.aP = 0;
        b5 = 0;
      } 
    } else if (this.aB <= 2) {
      this.bw = -3;
      this.I = 0;
    } else if (this.aB == 3) {
      this.aB = 49;
    } 
  }
  
  void f() {
    switch (this.a8) {
      case 15:
      case 17:
      case 18:
      case 27:
      case 39:
      case 47:
        if (this.aB == 1)
          this.aU = (byte)-this.aU; 
        a(this.bc[119] + this.bc[19], 10, 246);
        t(this.T[this.a8][3]);
        if (this.aB == 4) {
          if(this.T[this.a8][3], this.else);
          af();
        } 
        return;
      case 13:
      case 25:
      case 37:
      case 46:
        if (this.bT.if[2][0] <= 0 && r(100) <= this.T[this.a8][3]) {
          a(this.bc[133] + this.bc[19], 10, 246);
          this.bT.if[2][0] = -12;
          this.bT.if[2][1] = 2;
          this.bT.if[2][2] = 1;
          int(300);
        } 
        af();
        return;
      case 7:
      case 19:
      case 31:
      case 43:
        if (this.bT.if[4][0] <= 0 && r(100) <= this.T[this.a8][3])
          if (this.bT.do[13] == 11) {
            a(this.bc[36] + c(11) + this.bc[90] + this.bc[18] + this.bc[24] + this.bc[91], 10, 246);
          } else {
            a(this.bc[18] + this.bc[19], 10, 246);
            this.bT.if[4][0] = -14;
            this.bT.if[4][1] = 2;
            this.bT.if[4][2] = 1;
            int(300);
          }  
        af();
        return;
      case 11:
      case 23:
      case 35:
      case 45:
        if (this.bT.if[1][0] <= 0 && r(100) <= this.T[this.a8][3])
          if (this.bT.do[13] == 13) {
            a(this.bc[36] + c(13) + this.bc[90] + this.bc[18] + this.bc[121] + this.bc[91], 10, 246);
          } else {
            a(this.bc[121] + this.bc[19], 10, 246);
            this.bT.if[1][0] = -11;
            this.bT.if[1][1] = 2;
            this.bT.if[1][2] = 1;
            int(300);
          }  
        af();
        return;
      case 41:
      case 42:
        if (this.bT.if[3][0] <= 0) {
          if (r(100) <= this.T[this.a8][3]) {
            if (this.bT.do[13] == 14) {
              a(this.bc[36] + c(14) + this.bc[90] + this.bc[18] + this.bc[134] + this.bc[91], 10, 246);
            } else {
              a(this.bc[134] + this.bc[19], 10, 246);
              this.bT.if[3][0] = -13;
              this.bT.if[3][1] = 3;
              this.bT.if[3][2] = 1;
            } 
            int(300);
          } 
          af();
        } 
        return;
      case 9:
      case 21:
      case 33:
      case 44:
        if (this.bT.if[0][0] <= 0 && r(100) <= this.T[this.a8][3]) {
          if (this.bT.do[13] == 12) {
            a(this.bc[36] + c(12) + this.bc[90] + this.bc[18] + this.bc[135] + this.bc[91], 10, 246);
          } else {
            a(this.bc[135] + this.bc[19], 10, 246);
            this.bT.if[0][0] = -10;
            this.bT.if[0][1] = 4;
          } 
          int(300);
        } 
        af();
        return;
    } 
    af();
  }
  
  void bf() {
    if (this.aW >= 10) {
      if();
    } else if (this.aW >= 2) {
      this.bw = 0;
      this.aW = (byte)(this.aW + 1);
      if (this.aW == 5)
        this.aW = 100; 
    } 
    if (this.aW == 100)
      this.aB = 100; 
  }
  
  void c() {
    be();
    f();
  }
  
  void aH() { this.bJ = 1; }
  
  void a9() { this.bJ = -1; }
  
  byte[] a() {
    int i1 = 0;
    byte[] arrayOfByte1 = new byte[1000];
    int i2 = 0;
    byte b5;
    for (b5 = 0; b5 < this.ax; b5++) {
      if ((this.bd[b5]).do[0] > 1)
        for (byte b6 = 0; b6 < (this.bd[b5]).do[0]; b6++) {
          i2 = this.bx[(this.bd[b5]).do[1 + b6 * 2]].length - 1;
          if (i2 >= 1) {
            System.arraycopy(this.bx[(this.bd[b5]).do[1 + b6 * 2]], 1, arrayOfByte1, i1, i2);
            i1 += i2;
            i2 = 0;
          } 
          i2 = 0;
        }  
    } 
    for (b5 = 0; b5 < this.bC; b5++) {
      if ((this.F[b5]).do[0] > 1)
        for (byte b6 = 0; b6 < (this.F[b5]).do[0]; b6++) {
          i2 = this.bx[(this.F[b5]).do[1 + b6 * 2]].length - 1;
          if (i2 >= 1) {
            System.arraycopy(this.bx[(this.F[b5]).do[1 + b6 * 2]], 1, arrayOfByte1, i1, i2);
            i1 += i2;
          } 
          i2 = 0;
        }  
    } 
    byte[] arrayOfByte2 = new byte[i1];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, i1);
    i1 = 0;
    return arrayOfByte2;
  }
  
  void ar() {
    this.ax = (byte)this.m.length;
    this.bd = new d[this.m.length];
    for (byte b5 = 0; b5 < this.m.length; b5++) {
      this.bd[b5] = new d(this, this.m[b5][0], this.m[b5][1]);
      (this.bd[b5]).do[12] = (byte)b5;
    } 
    this.bp = this.bd[0];
  }
  
  void T() {
    this.bV.aA = null;
    this.X = new byte[6];
    this.bK = 0;
    this.aU = 0;
    ar();
    this.b4 = -1;
    this.bb = 0;
    goto();
    ao();
    for (byte b5 = 0; b5 < this.bC; b5++) {
      (this.F[b5]).if = new byte[6][3];
      (this.F[b5]).do[12] = (byte)b5;
    } 
    this.aW = 0;
    if (this.V == null)
      this.V = this.Y.a(5, "image"); 
  }
  
  void d(int paramInt) {
    this.bN = (short)(paramInt >> 2);
    if (this.f != 0)
      this.bN = (short)(this.bN + 1); 
  }
  
  void v() {
    this.Z = 0;
    this.f = (this.T[this.a8][0] + this.else.do[11]) * (115 - this.else.do[11]) / ('È' - this.T[this.a8][0]);
    if (this.bT.do[11] - this.else.do[11] >= 14) {
      this.f = this.f * 16 / 100;
    } else if (this.else.do[11] - this.bT.do[11] >= 14) {
      this.f = this.f * 184 / 100;
    } else {
      this.f = this.f * (100 + (this.else.do[11] - this.bT.do[11]) * 6) / 100;
    } 
    this.Z = 3 * this.else.do[22 + this.T[this.a8][2]];
    byte[] arrayOfByte = { 24, 25, 22, 23, 26 };
    int i1;
    for (i1 = 0; i1 < 5; i1++) {
      if (this.T[this.a8][2] == i1 && m(arrayOfByte[i1])) {
        if (this.bK == 32) {
          this.Z -= 10;
          break;
        } 
        this.Z += 10;
        break;
      } 
    } 
    for (i1 = 0; i1 < this.S.length - 1; i1++) {
      if (this.T[this.a8][2] == this.au[i1][0] && this.bT.do[21] == this.au[i1][1]) {
        this.Z += 50;
        break;
      } 
      if (i1 < 5 && this.T[this.a8][2] == this.au[i1 + 7][0] && this.bT.do[21] == this.au[i1 + 7][1]) {
        this.Z -= 35;
        break;
      } 
    } 
    if (this.T[this.a8][2] == this.bT.do[21])
      this.Z -= 10; 
    i1 = this.else.a - this.bT.a;
    if (i1 > 5) {
      i1 = 5;
    } else if (i1 < -5) {
      i1 = -5;
    } 
    this.Z += i1;
    this.f = this.f * (this.Z + 100) / 100;
    if (this.bK != 32) {
      short[][] arrayOfShort = { { 80, 80 }, { 90, 100 }, { 100, 120 }, { 110, 140 } };
      short s1 = (short)this.else.do[30];
      for (int i2 = arrayOfShort.length - 1; i2 >= 0; i2--) {
        if (this.else.do[30] >= arrayOfShort[i2][0]) {
          s1 = arrayOfShort[i2][1];
          break;
        } 
      } 
      this.f = this.f * s1 / 100;
    } else {
      this.f = this.f * 80 / 100;
    } 
    if (this.aY == 1)
      this.f = 0; 
  }
  
  void if(d paramd, int paramInt1, int paramInt2) {
    if (paramd.if[paramInt1][1] > 0 && paramInt2 == 0)
      paramd.if[paramInt1][1] = (byte)(paramd.if[paramInt1][1] - 1); 
    if (paramInt2 == 1 && paramd.if[paramInt1][1] == 0) {
      paramd.if[paramInt1][0] = 0;
      paramd.if[paramInt1][2] = 0;
    } 
  }
  
  void ad() {
    short s1 = 0;
    if (this.a8 >= 31 || (this.a8 < 31 && this.a8 >= 19 && this.a8 % 2 == 1)) {
      s1 = 100;
    } else {
      s1 = this.else.a - this.bT.a;
      if (s1 > 0) {
        s1 = 95 + s1 * 27 / 100;
      } else {
        s1 = 90 + s1 * 270 / 100;
      } 
    } 
    if (this.a8 > 19 && this.a8 < 31 && s1 % 3 == 1)
      s1 += 15; 
    for (byte b5 = 0; b5 < this.S.length - 1; b5++) {
      if (this.T[this.a8][2] == this.au[b5][0] && this.bT.do[21] == this.au[b5][1]) {
        s1 = 100;
        break;
      } 
    } 
    this.bN = 0;
    if (r(100) < s1) {
      this.aW = 10;
      v();
      d(this.f);
    } else {
      this.aW = 2;
    } 
  }
  
  void ay() {
    a(a((this.F[0]).do[16]) + this.bc[6] + this.bc[91], 10, 246);
    int(500);
    this.bK = 10;
    goto();
    I();
  }
  
  void case() {
    this.f = 0;
    this.aW = -100;
    a(a(this.bp.do[16]) + this.bc[6] + this.bc[91], 10, 246);
    int(500);
    this.aU = -2;
    this.aB = 0;
    byte b5 = this.bp.do[12];
    u();
    if (b5 != this.bp.do[12]) {
      this.bK = 32;
      this.bb = 1;
      this.A = 1;
      I();
    } else {
      this.c = -15;
      this.bK = 0;
      this.aB = 0;
    } 
  }
  
  void if() {
    if (this.aW < 50)
      this.aW = (byte)(this.aW + 1); 
    if (this.bT.int <= -120) {
      if (this.bK == 32) {
        ay();
        return;
      } 
      case();
      return;
    } 
    if (this.f == 0) {
      this.aW = 100;
      return;
    } 
    if (this.aW >= 10)
      if (this.f - this.bN >= 0) {
        this.f -= this.bN;
        do(-this.bN, this.bT);
      } else {
        do(-this.f, this.bT);
        this.f = 0;
      }  
  }
  
  void bg() {
    if (this.aB == 100) {
      this.ak = (byte)(this.ak + 1);
      if (this.ak > 5) {
        goto();
        this.ak = 0;
        this.c = -85;
      } else {
        this.aB = 0;
      } 
      return;
    } 
    switch (this.else.if[this.ak][0]) {
      case 19:
        a(a(this.else.do[16]) + this.bc[17] + this.bc[19], 10, 246);
        if (this.aB < 5) {
          t(5);
          a(a(this.else.do[16]) + this.bc[17] + this.bc[19], 10, 246);
          int(300);
          break;
        } 
        if(5, this.else);
        this.aB = 100;
        break;
      case -14:
        if (this.aB < 5) {
          a(a(this.else.do[16]) + this.bc[122] + this.bc[18] + this.bc[136], 10, 246);
          if (this.bK == 32) {
            af();
          } else {
            this.D = 0;
          } 
          int(300);
          break;
        } 
        this.aB = 100;
        break;
      case -12:
        a(5, "在" + this.bc[133], false);
        break;
      case -10:
        a(5, this.bc[135] + this.bc[136], false);
        break;
      case -11:
        a(3, this.bc[122] + this.bc[121] + this.bc[136], true);
        if (this.bK == 32) {
          af();
          break;
        } 
        this.D = 0;
        break;
      case -13:
        if (this.aB < 5) {
          a(a(this.else.do[16]) + this.bc[122] + this.bc[134] + this.bc[136], 10, 246);
          if (this.bK == 32) {
            af();
          } else {
            this.D = 0;
          } 
          int(300);
        } else {
          this.aB = 100;
        } 
      default:
        this.aB = 100;
        break;
    } 
    if (this.ak == 5) {
      if (this.else.if[1][0] < 0 && this.else.if[2][0] < 0) {
        af();
        this.ak = 0;
        return;
      } 
      if (this.else.if[4][0] < 0 && this.else.if[2][0] < 0) {
        af();
        this.ak = 0;
        return;
      } 
      if (this.D == 0) {
        this.D = -1;
        this.ak = 0;
        af();
        return;
      } 
    } 
  }
  
  void a(int paramInt, String paramString, boolean paramBoolean) {
    if (this.aB < 5) {
      t(-paramInt);
      a(a(this.else.do[16]) + paramString, 10, 246);
      int(300);
    } else {
      do(-paramInt, this.else);
      this.aB = 100;
      if (this.bK == 32 && paramBoolean)
        af(); 
      if ((this.F[0]).int <= -120) {
        aZ();
        this.ak = 4;
        ay();
      } else if (this.bp.int <= -120) {
        try();
        this.ak = 4;
        case();
      } 
    } 
  }
  
  void t(int paramInt) {
    String str = null;
    if (paramInt > 0) {
      this.int.setColor(65280);
      str = this.bc[92] + paramInt;
    } else {
      this.int.setColor(16711680);
      str = "" + paramInt;
    } 
    this.int;
    this.int;
    this.int.drawString(str, 125 + 49 * this.aU, 68 - 25 * this.aU - this.aB, true | 0x10);
  }
  
  void aQ() {
    if ((this.bK & 0x20) == 32 && this.A != 3)
      return; 
    if (this.aU == -2)
      return; 
    if (this.aU == 1) {
      this.int;
      this.int;
      this.int.drawImage(this.B[1], 190 - this.bw * 2 * this.aU, 110 + this.I * 2, true | 0x20);
    } else {
      this.int;
      this.int;
      this.int.drawImage(this.B[1], 190, 110, true | 0x20);
    } 
  }
  
  void if(int paramInt, d paramd) {
    paramInt += paramd.int;
    if (paramInt > paramd.for) {
      paramd.int = paramd.for;
    } else {
      paramd.int = (short)(byte)paramInt;
    } 
  }
  
  void a(int paramInt, d paramd) {
    paramInt += paramd.do[30];
    if (paramInt > paramd.do[29]) {
      paramd.do[30] = paramd.do[29];
    } else {
      paramd.do[30] = (byte)paramInt;
    } 
  }
  
  void do(int paramInt, d paramd) {
    paramInt += paramd.int;
    if (paramInt > -120) {
      paramd.int = (short)(byte)paramInt;
    } else {
      paramd.int = -120;
    } 
  }
  
  public void aU() {
    if ((this.bK & 0x10) == 16 && this.A != 3)
      return; 
    if (this.aU != 2)
      if (this.aU == -1) {
        this.int;
        this.int;
        this.new;
        if(this.B[0], 62 - this.bw * 2 * this.aU, 179 + this.I * 2, true | 0x20, 8192);
      } else if (this.b3 < 3) {
        this.int;
        this.int;
        this.new;
        if(this.B[0], 62, 179, true | 0x20, 8192);
      } else {
        this.int;
        this.int;
        this.new;
        if(this.B[0], 62, 180, true | 0x20, 8192);
      }  
  }
  
  void a(d paramd, int paramInt1, int paramInt2) {
    this.ac = (byte)(this.ac + 1);
    if (this.ac >= 49)
      this.ac = 0; 
    if (this.ac % 10 == 0) {
      int i1 = (this.ab + 1) % 5;
      do {
        if (paramd.if[i1][0] < 0 && this.ab != i1) {
          this.int.drawImage(this.V[-paramd.if[i1][0] - 10], paramInt1, paramInt2, 20);
          this.ab = i1;
          return;
        } 
        if (++i1 != paramd.if.length)
          continue; 
        i1 = 0;
      } while (i1 != this.ab);
    } 
    if (this.ab > -1 && paramd.if[this.ab][0] < 0)
      this.int.drawImage(this.V[-paramd.if[this.ab][0] - 10], paramInt1, paramInt2, 20); 
  }
  
  public void L() {
    if (this.p > 0)
      B(); 
    if (this.p > 1)
      aQ(); 
    if (this.p > 2)
      try(); 
    if (this.p > 3)
      aU(); 
    if (this.p > 4)
      aZ(); 
  }
  
  void a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this.int.setColor(paramInt4);
    if (paramInt5 == 0) {
      this.int;
      this.int;
      this.int.drawString(paramString, paramInt1 + 2, paramInt2 + 16 + 7, 0x4 | 0x20);
    } else {
      this.int;
      this.int;
      this.int.drawString(paramString, paramInt1 + (paramInt3 >> 1), paramInt2 + 16 + 7, true | 0x20);
    } 
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    int i1 = paramInt2 + paramInt4;
    int i2 = paramInt1 + paramInt3;
    int[] arrayOfInt = paramBoolean ? this.byte[0] : this.byte[1];
    this.int.setColor(arrayOfInt[4]);
    this.int.fillRect(paramInt1 + 1, paramInt2 + 1, paramInt3 - 3, paramInt4 - 3);
    this.int.setColor(arrayOfInt[0]);
    this.int.fillRect(paramInt1 + 3, paramInt2 + 3, paramInt3 - 5, paramInt4 - 5);
    int[][] arrayOfInt1 = { 
        { paramInt1 + 2, paramInt2, i2 - 2, paramInt2, 1 }, { paramInt1, paramInt2 + 2, paramInt1, i1 - 2, 1 }, { paramInt1 + 2, i1, i2 - 2, i1, 1 }, { i2, paramInt2 + 2, i2, i1 - 2, 1 }, { paramInt1 + 1, paramInt2 + 1, paramInt1 + 1, paramInt2 + 1, 1 }, { i2 - 1, i1 - 1, i2 - 1, i1 - 1, 1 }, { paramInt1 + 1, i1 - 1, paramInt1 + 1, i1 - 1, 1 }, { i2 - 1, paramInt2 + 1, i2 - 1, paramInt2 + 1, 1 }, { paramInt1 + 3, paramInt2 + 2, i2 - 3, paramInt2 + 2, 2 }, { i2 - 3, paramInt2 + 3, i2 - 3, paramInt2 + 3, 2 }, 
        { paramInt1 + 2, paramInt2 + 3, paramInt1 + 2, i1 - 3, 2 }, { paramInt1 + 3, i1 - 3, paramInt1 + 3, i1 - 3, 2 }, { paramInt1 + 2, i1 - 1, i2 - 2, i1 - 1, 2 }, { i2 - 1, paramInt2 + 2, i2 - 1, i1 - 2, 2 }, { i2 - 2, i1 - 2, i2 - 2, i1 - 2, 2 }, { paramInt1 + 1, i1 - 2, paramInt1 + 1, i1 - 2, 2 }, { paramInt1 + 2, i1 - 2, i2 - 2, i1 - 2, 3 }, { i2 - 2, paramInt2 + 1, i2 - 2, i1 - 3, 3 } };
    int i3 = arrayOfInt1.length;
    for (byte b5 = 0; b5 < i3; b5++) {
      this.int.setColor(arrayOfInt[arrayOfInt1[b5][4]]);
      this.int.drawLine(arrayOfInt1[b5][0], arrayOfInt1[b5][1], arrayOfInt1[b5][2], arrayOfInt1[b5][3]);
    } 
    arrayOfInt1 = (int[][])null;
  }
  
  byte if(int paramInt) {
    byte b5 = 0;
    if (paramInt < 10 || (paramInt >= 33 && paramInt <= 36)) {
      b5 = 0;
    } else if (paramInt >= 10 && paramInt < 22) {
      b5 = 1;
    } else {
      b5 = 2;
    } 
    if (paramInt == 40 || paramInt == 41 || paramInt == 39 || paramInt == 15) {
      b5 = 2;
    } else if (paramInt == 38) {
      b5 = 0;
    } 
    for (byte b6 = 0; b6 < this.aZ[b5]; b6++) {
      if (this.b0[b5][b6][0] == paramInt)
        return this.b0[b5][b6][1]; 
    } 
    return 0;
  }
  
  void if(int paramInt1, int paramInt2, int paramInt3) {
    paramInt3 += 2;
    paramInt2 -= 2;
    this.int.setClip(paramInt2, paramInt3, 19, 16);
    if (this.ar[4] == null)
      d(); 
    this.int.drawImage(this.ar[4], paramInt2, paramInt3 - (paramInt1 << 4), 20);
    this.int.setClip(0, 0, 240, 320);
  }
  
  void aX() {
    this.c = 18;
    this.bL = 0;
    this.bR = 0;
    this.void = 4;
    A();
  }
  
  void ak() {
    this.c = 19;
    this.bL = 0;
    this.bR = 0;
    this.void = 4;
    A();
  }
  
  void a6() {
    aB();
    byte b5 = 92;
    byte b6 = 30;
    byte b7 = 6;
    if (this.c == 18) {
      String[] arrayOfString = { "买 入", this.bc[30], this.bc[33], this.bc[31] };
      this.aw = (byte)this.aV.length;
      a(0, this.int, this.bL, 0, arrayOfString);
    } else {
      String[] arrayOfString = { "卖 出", this.bc[30], this.bc[33], this.bc[31] };
      this.aw = this.aZ[0];
      a(1, this.int, this.bL, 0, arrayOfString);
    } 
    for (byte b8 = this.bR; this.aw != 0 && b8 < ((this.bR + this.void < this.aw) ? (this.bR + this.void) : this.aw); b8++) {
      byte b9;
      if (b8 == this.bL) {
        a(34, b5 + b6 * (this.bL - this.bR), 173, 30, true);
        this.int.setColor(this.aS[4]);
      } else {
        this.int.setColor(this.aS[5]);
      } 
      if (this.c == 18) {
        b9 = this.aV[b8];
      } else {
        b9 = this.b0[0][b8][0];
      } 
      if(b9, 40, b5 + b7 + (b8 - this.bR) * b6);
      this.int.drawString(c(b9), 59, b5 + b7 + (b8 - this.bR) * b6, 20);
      this.int.drawString(String.valueOf((this.c == 18) ? this.aj[b9] : (this.aj[b9] / 2)), 139, b5 + b7 + (b8 - this.bR) * b6, 20);
      this.int;
      this.int;
      this.int.drawString(String.valueOf(if(b9)), 201, b5 + b7 + (b8 - this.bR) * b6, 0x8 | 0x10);
    } 
    if (this.aw > this.void)
      do(114, 88, 250); 
    if (this.b2 >= 0) {
      do(120, 152, 16, 30);
      if (this.c == 18) {
        new(this.bc[147]);
      } else {
        new(this.bc[151]);
      } 
    } else if (this.b2 < 0) {
      byte b9;
      if (this.c == 18) {
        b9 = this.aV[this.bL];
      } else {
        b9 = this.b0[0][this.bL][0];
      } 
      if (this.aw != 0)
        new(this.C[b9]); 
    } 
    this.int.drawImage(this.aC[28], 147, 36, 20);
    this.int.setColor(16776960);
    this.int;
    this.int;
    this.int.drawString(String.valueOf(this.bt), 204, 50, 0x8 | 0x20);
    bh();
    i();
  }
  
  void do(int paramInt1, int paramInt2, int paramInt3) {
    if (this.bL == 0) {
      this.new;
      if(this.aC[33], paramInt1, paramInt3, 20, 270);
    } else if (this.bL == this.aw - 1) {
      this.new;
      if(this.aC[33], paramInt1, paramInt2, 20, 90);
    } else {
      this.new;
      if(this.aC[33], paramInt1, paramInt2, 20, 90);
      this.new;
      if(this.aC[33], paramInt1, paramInt3, 20, 270);
    } 
  }
  
  void aB() {
    if (null != this.aC)
      for (byte b5 = 0; b5 <= 'ð'; b5 += 66) {
        for (byte b6 = 0; b6 <= 'ŀ'; b6 += 66)
          this.int.drawImage(this.aC[35], b5, b6, 20); 
      }  
  }
  
  void byte(int paramInt1, int paramInt2, int paramInt3) {
    this.int.setColor(paramInt1);
    paramInt3 = paramInt3 + 4 + (paramInt2 - this.bR) * 32;
    this.int.drawString(c(this.b0[this.bM][paramInt2][0]), 83, paramInt3 + 2, 20);
    this.int;
    this.int;
    this.int.drawString("" + this.b0[this.bM][paramInt2][1], 183, paramInt3 + 4, 0x8 | 0x10);
    if(this.b0[this.bM][paramInt2][0], 47, paramInt3 + 2);
  }
  
  void a8() {
    aB();
    a(6 + this.bM, this.int, this.bL, 0, null);
    bh();
    i();
    byte b5 = 68;
    this.aw = this.aZ[this.bM];
    if (this.aw > this.void)
      do(114, 63, 250); 
    for (byte b6 = this.bR; b6 < ((this.bR + this.void < this.aw) ? (this.bR + this.void) : this.aw); b6++) {
      if (b6 == this.bL) {
        a(34, b5 + 32 * (this.bL - this.bR), 174, 30, true);
        byte(this.aS[4], b6, b5);
      } else {
        byte(this.aS[5], b6, b5);
      } 
    } 
    if (this.aZ[this.bM] > 0)
      new(this.C[this.b0[this.bM][this.bL][0]]); 
    if (this.b2 != -1)
      do(120, 320 - 16 * this.ah.length - 4 >> 1, 16, 30); 
  }
  
  void aE() {
    if (this.bK != 6 && (this.bM == 0 || this.bM == 2) && this.aZ[this.bM] > 0) {
      if (this.b0[this.bM][this.bL][0] == 27 || this.b0[this.bM][this.bL][0] == 28 || this.b0[this.bM][this.bL][0] <= 9 || (this.b0[this.bM][this.bL][0] >= 33 && this.b0[this.bM][this.bL][0] <= 38) || this.b0[this.bM][this.bL][0] == 40) {
        String[] arrayOfString = { this.bc[1], this.bc[49] };
        this.ah = arrayOfString;
      } else if (this.b0[this.bM][this.bL][0] == 30) {
        String[] arrayOfString = { this.bc[50], this.bc[49] };
        this.ah = arrayOfString;
      } else if (this.b0[this.bM][this.bL][0] == 32) {
        String[] arrayOfString = { this.bc[142], this.bc[49] };
        this.ah = arrayOfString;
      } else {
        String[] arrayOfString = { this.bc[49] };
        this.ah = arrayOfString;
      } 
    } else if ((this.bm != 1 && this.bM == 1 && this.aZ[this.bM] > 0) || (this.bK == 6 && this.bM == 1 && this.aZ[this.bM] > 0)) {
      String[] arrayOfString = { this.bc[53], this.bc[49] };
      this.ah = arrayOfString;
    } else {
      String[] arrayOfString = { this.bc[49] };
      this.ah = arrayOfString;
    } 
    this.b2 = 0;
  }
  
  void w() {
    if (this.b == -2 && this.b2 < this.ah.length - 1) {
      this.b2 = (byte)(this.b2 + 1);
    } else if (this.b == -1 && this.b2 > 0) {
      this.b2 = (byte)(this.b2 - 1);
    } 
    if (O()) {
      if (this.ah[this.b2] == this.bc[true]) {
        if (this.b0[this.bM][this.bL][0] == 5 || this.b0[this.bM][this.bL][0] == 6 || this.b0[this.bM][this.bL][0] == 7) {
          if (this.bm == 1) {
            if (this.bJ == 1) {
              this.c = -19;
              this.a5 = this.b0[this.bM][this.bL][0];
              this.bR = 0;
              this.bM = 0;
              this.bL = 0;
              this.b2 = -1;
              this.ah = null;
              this.bg = -16;
              this.bq = 10;
              this.aB = 0;
              this.ba = 10;
              this.a9 = 83;
            } else {
              if(this.bc[8] + this.bc[34] + this.bc[40] + this.bc[42], 1);
              int(300);
            } 
          } else {
            if(this.bc[123] + this.bc[1], 1);
          } 
        } else if (this.b0[this.bM][this.bL][0] == 27 || this.b0[this.bM][this.bL][0] == 28) {
          if (this.bm == 1) {
            if(this.bc[35] + this.bc[8] + this.bc[1], 1);
          } else {
            this.b2 = -1;
            this.ah = null;
            if (this.bV.ay == 0) {
              this.bV.try(1, this.b0[this.bM][this.bL][0]);
              if(this.bc[141] + this.bc[154] + c(this.b0[this.bM][this.bL][0]) + this.bc[90] + this.bc[155], 1);
              do(this.b0[this.bM][this.bL][0], 1);
            } else if (this.bV.ay == 1) {
              if(this.bc[156], 1);
            } 
          } 
        } else if (this.b0[this.bM][this.bL][0] == 37) {
          this.aF = (byte)(this.aF + 1);
          this.b2 = -1;
          this.ah = null;
          if(this.bc[141] + this.bc[154] + c(this.b0[this.bM][this.bL][0]) + this.bc[90] + this.bc[157], 1);
          do(this.b0[this.bM][this.bL][0], 1);
        } else if (this.b0[this.bM][this.bL][0] == 40) {
          if (this.bm == 1) {
            if("战斗中无法使用", 1);
          } else {
            this.b2 = -1;
            this.ah = null;
            aT();
            do(this.b0[this.bM][this.bL][0], 1);
            this.bR = 0;
            this.bL = 0;
          } 
        } else {
          this.bK = 9;
          this.W = this.bM;
          this.w = this.bL;
          this.bP = 0;
          this.aO = this.bR;
          this.bR = 0;
          this.bL = 0;
          aA();
        } 
      } else if (this.ah[this.b2] == this.bc[53]) {
        if (this.bK == 6) {
          this.W = this.bM;
          this.w = this.bL;
          try(this.b0[this.W][this.w][0]);
          this.bL = this.bP;
          if (this.aZ[this.bM] > 0 && this.bL == this.aZ[this.bM])
            this.bL = (byte)(this.bL - 1); 
        } else {
          this.bK = 7;
          this.W = this.bM;
          this.w = this.bL;
          this.aO = this.bR;
          this.bR = 0;
          this.bL = 0;
        } 
        aA();
      } else if (this.ah[this.b2] == this.bc[50]) {
        if (this.b0[this.bM][this.bL][0] == 30) {
          this.b2 = -1;
          this.ah = null;
          j();
        } 
      } else if (this.ah[this.b2] == this.bc['']) {
        if (m(31)) {
          byte[] arrayOfByte1 = { 42, 0, 1, 2, 3, 4, 5, 6, 7 };
          byte[] arrayOfByte2 = { 15, 30, 45, 60, 70, 80, 90, 96, 100 };
          byte b5 = 0;
          int i1 = r(100);
          while (b5 < arrayOfByte1.length && arrayOfByte2[b5] <= i1)
            b5++; 
          if (case(arrayOfByte1[b5], 1) != -1) {
            do(31, 1);
            do(32, 1);
            if (this.bL >= this.aZ[this.bM] && this.aZ[this.bM] > 0) {
              this.bL = 0;
              this.bR = 0;
            } 
          } 
        } else {
          if(this.bc[153], 1);
        } 
        this.b2 = -1;
      } else {
        this.b2 = -1;
      } 
    } else if (this.b == -7) {
      this.b2 = -1;
    } 
  }
  
  void y() {
    if (this.b2 == -1) {
      if (O()) {
        this.aO = this.bR;
        aE();
      } else if (this.b == -3 || this.b == -4) {
        if(this.b0.length, 0, 17, 0, 0);
        this.bR = 0;
      } else if (this.b == -7) {
        if (this.bK == 6) {
          this.bK = 2;
          this.bL = this.bP;
          this.bR = this.aO;
          this.aO = 0;
          this.bL = 0;
          aA();
        } else if (this.bm == 1) {
          I();
        } else {
          bo();
        } 
      } else {
        this.void = 6;
        if (this.aZ[this.bM] > 0)
          char(this.aZ[this.bM], this.void); 
        this.ba = 120;
      } 
    } else {
      w();
    } 
  }
  
  void int(String paramString) {
    char c1 = 'Ĕ';
    a(0, c1, 240, 24, 15452159, 10448383, 3473558);
    this.int.setColor(3355443);
    if (paramString != "") {
      this.int;
      this.int;
      this.int.drawString(paramString, 10, c1 + '\005' + '\020', 0x4 | 0x40);
    } 
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.int.setColor(16768193);
    this.int.fillRoundRect(paramInt1, paramInt2, paramInt3 + 1, paramInt4 + 1, 6, 6);
    this.int.setColor(5066061);
    this.int.drawRoundRect(paramInt1, paramInt2, paramInt3, paramInt4, 6, 6);
    this.int.setColor(16617574);
    this.int.drawLine(paramInt1 + 1, paramInt2 + paramInt4 - 15, paramInt1 + paramInt3 - 1, paramInt2 + paramInt4 - 15);
    this.int.drawRoundRect(paramInt1 + 1, paramInt2 + 1, paramInt3 - 2, paramInt4 - 15 - 1, 5, 5);
    this.int.drawRoundRect(paramInt1 + 1, paramInt2 + paramInt4 - 15, paramInt3 - 2, 14, 5, 5);
  }
  
  void aI() {
    this.B[0] = null;
    this.A = 1;
  }
  
  void char(int paramInt1, int paramInt2) {
    if (this.b == -1) {
      if (this.bR > 0) {
        if (this.bL > this.bR) {
          this.bL = (byte)(this.bL - 1);
        } else {
          this.bR = (byte)(this.bR - 1);
          this.bL = (byte)(this.bL - 1);
        } 
      } else if (this.bL > 0) {
        this.bL = (byte)(this.bL - 1);
      } 
    } else if (this.b == -2) {
      if (this.bR + paramInt2 < paramInt1) {
        if (this.bL < this.bR + paramInt2 - 1) {
          this.bL = (byte)(this.bL + 1);
        } else {
          this.bR = (byte)(this.bR + 1);
          this.bL = (byte)(this.bL + 1);
        } 
      } else if (this.bL < paramInt1 - 1) {
        this.bL = (byte)(this.bL + 1);
      } 
      if (this.bL >= paramInt1) {
        this.bL = (byte)paramInt1;
        this.bR = (byte)(paramInt1 - paramInt2);
      } 
    } 
  }
  
  void a(d[] paramArrayOfd) {
    aB();
    a(5, this.int, this.bL, 20, null);
    if (this.b2 == -1)
      a(10, this.int, this.bL, 20, null); 
    bh();
    i();
    if (this.aw == 0) {
      int(this.bc[39] + this.bc[42]);
      return;
    } 
    this.int.setColor(16187136);
    this.int;
    this.int;
    this.int.drawString(this.bc[38] + "  " + (paramArrayOfd[this.bL]).do[11], 28, 132, 0x10 | 0x4);
    if (this.bK == 3) {
      if (this.b3 == 0) {
        a(paramArrayOfd[this.bP], paramArrayOfd[this.bL]);
        this.bL = this.bP;
        if (this.c == 45) {
          this.aG = paramArrayOfd[this.bL];
        } else {
          this.aG = this.F[this.bL];
        } 
      } else if (this.b3 > 6) {
        this.bK = 0;
      } 
      this.b3 = (byte)(this.b3 + 1);
    } 
    byte b5 = 119;
    byte b6 = 96;
    byte b7 = 26;
    byte b8;
    for (b8 = this.bR; b8 < ((this.bR + this.void < this.aw) ? (this.bR + this.void) : this.aw); b8++) {
      byte b9 = 60 + 37 * (b8 - this.bR);
      if (this.bK == 3) {
        if (b8 == this.bP || b8 == this.bL) {
          a(b5, b9, b6, b7, true);
          this.int;
          this.int;
          a(a((paramArrayOfd[b8]).do[16]), b5, b9, b6, this.aS[4], true | 0x10);
        } else {
          a(b5, b9, b6, b7, false);
          this.int;
          this.int;
          a(a((paramArrayOfd[b8]).do[16]), b5, b9, b6, this.aS[5], true | 0x10);
        } 
      } else if (b8 == this.bL) {
        a(b5, b9, b6, b7, true);
        this.int;
        this.int;
        a(a((paramArrayOfd[b8]).do[16]), b5, b9, b6, this.aS[4], true | 0x10);
      } else {
        a(b5, b9, b6, b7, false);
        this.int;
        this.int;
        a(a((paramArrayOfd[b8]).do[16]), b5, b9, b6, this.aS[5], true | 0x10);
      } 
    } 
    this.int.setClip(0, 0, 240, 320);
    if (this.bK == 1 && this.bP < this.bR + 5 && this.bP >= this.bR) {
      int(this.bc[60] + this.bc[42]);
    } else if (this.bK != 7 && this.bK != 9) {
      this.int.setColor(4802889);
      this.int.drawString("" + (this.bL + 1) + this.bc[93] + this.aw, 185, 30, 20);
      if (this.aw > this.void)
        do(166, 47, 250); 
    } 
    if (this.b2 == -1) {
      b8 = 10;
      byte b9 = 83;
      do(b8 - 4, b9 + 127, (paramArrayOfd[this.bL]).int + 120, (paramArrayOfd[this.bL]).for + 120, 70);
      this.int.setColor(16187136);
      this.int;
      this.int;
      this.int.drawString("生命", b8 + 43, b9 + 122, 0x20 | true);
      this.int;
      this.int;
      this.int.drawString(this.bc[143], b8 + 43, b9 + '' + '\013', 0x20 | true);
      if(paramArrayOfd);
    } 
    if (this.b2 == 2 && this.ah[2].equals(this.bc[138])) {
      int i1;
      b8 = 0;
      if (this.c == 35) {
        i1 = a(this.F[this.bL]);
      } else {
        i1 = a(paramArrayOfd[this.bL]);
      } 
      this.int.setColor(29116);
      this.int;
      this.int;
      this.int.drawString("贩卖价格:" + i1, 120, 312, 0x20 | true);
    } 
    if (this.b2 >= 0)
      do(55, 182, 16, 30); 
  }
  
  private void if(d[] paramArrayOfd) {
    byte b5 = 5;
    byte b6 = 94;
    byte b7 = ((paramArrayOfd[this.bL]).do[29] - 100) / 10;
    byte b8;
    for (b8 = 1; b8 < this.v[b7].length && (paramArrayOfd[this.bL]).do[30] > this.v[b7][b8]; b8++);
    byte b9 = b8 / 2;
    byte b10;
    for (b10 = 0; b10 < b9; b10++)
      this.int.drawImage(this.aC[15], b5 + 24 + b10 * 20, '' + b6, 20); 
    if (b8 % 2 != 0)
      this.int.drawImage(this.aC[14], b5 + 24 + b10 * 20, '' + b6, 20); 
  }
  
  void e() {
    if (this.b2 == -1) {
      if (O()) {
        if (this.bK == 0 && this.aw != 0) {
          this.b2 = 0;
        } else if (this.bK == 7) {
          this.ap = 25;
          this.bP = this.bL;
          try(this.b0[this.W][this.w][0]);
          this.bR = this.aO;
          this.c = 16;
        } else if (this.bK == 9) {
          this.bP = this.bL;
          ba();
        } else if (this.bK == 1) {
          if (this.bL != this.bP) {
            this.bK = 3;
            this.b3 = 0;
          } else {
            this.bK = 0;
            this.b3 = 0;
          } 
        } 
      } else if (this.b == -7) {
        if (this.bK == 9 || this.bK == 7) {
          this.bR = this.aO;
          this.aO = this.bR;
          a3();
        } else if (this.c == 35 && this.bm == 1) {
          if ((this.F[0]).int > -120) {
            this.bL = 0;
            this.bK = 0;
            this.A = 3;
            at();
            I();
          } else {
            if(this.bc[124] + this.bc[52] + this.bc[10] + this.bc[42], 1);
          } 
        } else if (this.c == 35 && this.bm == 0) {
          bo();
        } else if (this.c == 35 && this.bm == 2) {
          this.bL = 0;
          bi();
        } else if (this.c == 45) {
          this.bL = 1;
          bi();
        } 
      } else if (this.aw > 0) {
        byte b5 = this.bL;
        this.void = 5;
        char(this.aw, this.void);
        if (b5 != this.bL) {
          boolean bool = true;
          if (this.c == 45) {
            if (this.aG != null && this.aG.do[16] == (this.aq[this.bL]).do[16])
              bool = false; 
            this.aG = this.aq[this.bL];
          } else {
            if (this.aG != null && this.aG.do[16] == (this.F[this.bL]).do[16])
              bool = false; 
            this.aG = this.F[this.bL];
          } 
          if (bool)
            aI(); 
        } 
      } 
    } else {
      aS();
    } 
  }
  
  void p() {
    if (this.aB > 3) {
      this.aB = 0;
    } else {
      this.aB = (byte)(this.aB + 1);
    } 
  }
  
  void if(d paramd) {
    int i1 = a(paramd);
    this.bt += i1;
    if(this.bc[25] + this.bc[98] + i1, 0);
  }
  
  int a(d paramd) {
    null = 'ú' + 6 * paramd.do[11];
    return null * (100 + 2 * this.H[paramd.do[16]][12]) / 'd';
  }
  
  void z() {
    if (this.c == 35) {
      if (a(this.bL) == null)
        if(this.bc[96] + this.bc[54] + this.bc[42], 1); 
      this.aw = this.bC;
    } else {
      this.aq[this.bL] = null;
      for (byte b5 = this.bL; b5 < this.j - 1; b5++)
        this.aq[b5] = this.aq[b5 + 1]; 
      this.j = (byte)(this.j - 1);
      this.aw = this.j;
      if (this.j > 0) {
        this.aG = this.aq[Math.max(0, this.bL)];
      } else {
        this.aG = null;
      } 
    } 
    aG();
  }
  
  private void aG() {
    if (this.bL == this.aw) {
      this.bL = (byte)(this.bL - 1);
      if (this.bL < this.bR)
        this.bR = this.bL; 
    } 
    if (this.aw == 0) {
      this.bL = 0;
      this.bR = 0;
      aI();
      return;
    } 
    aI();
  }
  
  void bn() {
    if (this.j >= this.aR) {
      if("电脑" + this.bc[42] + this.bc[44] + this.bc[91] + "请扩充空间！", 0);
      l(3);
      return;
    } 
    boolean bool = false;
    byte b5;
    for (b5 = 0; b5 < this.bC; b5++) {
      if (b5 != this.bL && (this.F[b5]).int > -120) {
        bool = true;
        break;
      } 
    } 
    if (bool == true) {
      if ((this.F[this.bL]).do[13] != -1) {
        byte((this.F[this.bL]).do[13], 1);
        (this.F[this.bL]).do[13] = -1;
      } 
      do(this.F[this.bL]);
      this.aq[this.j] = this.F[this.bL];
      this.j = (byte)(this.j + 1);
      for (b5 = this.bL; b5 < this.bC - 1; b5++)
        this.F[b5] = this.F[b5 + 1]; 
      this.bC = (byte)(this.bC - 1);
      this.aw = this.bC;
      if (this.bL == this.bC)
        this.bL = (byte)(this.bL - 1); 
      aI();
    } else {
      if(this.bc[96] + this.bc[54] + this.bc[42], 0);
    } 
  }
  
  void a(d paramd1, d paramd2) {
    d d1 = new d();
    d1.do = paramd1.do;
    d1.if = paramd1.if;
    d1.new = paramd1.new;
    d1.for = paramd1.for;
    d1.int = paramd1.int;
    d1.a = paramd1.a;
    paramd1.do = paramd2.do;
    paramd1.if = paramd2.if;
    paramd1.new = paramd2.new;
    paramd1.for = paramd2.for;
    paramd1.int = paramd2.int;
    paramd1.a = paramd2.a;
    paramd2.do = d1.do;
    paramd2.if = d1.if;
    paramd2.new = d1.new;
    paramd2.for = d1.for;
    paramd2.int = d1.int;
    paramd2.a = d1.a;
  }
  
  void R() {
    if (this.bC < 5) {
      this.F[this.bC] = this.aq[this.bL];
      this.bC = (byte)(this.bC + 1);
      for (byte b5 = this.bL; b5 < this.j - 1; b5++)
        this.aq[b5] = this.aq[b5 + 1]; 
      this.j = (byte)(this.j - 1);
      this.aw = this.j;
      if (this.bL == this.j)
        this.bL = (byte)(this.bL - 1); 
      if (this.j == 0) {
        this.bL = 0;
        aI();
        return;
      } 
      this.aG = this.aq[this.bL];
      aI();
    } else {
      if(this.bc[8] + this.bc[20] + this.bc[42], 1);
    } 
  }
  
  void goto() {
    this.bw = 0;
    this.I = 0;
    this.aB = 0;
    this.aW = 0;
  }
  
  void I() {
    if (this.c == 25) {
      this.bM = 1;
      this.bL = 0;
      this.B[0] = this.a6;
      this.a6 = null;
    } else if (this.c == 35) {
      this.bM = 0;
      this.bL = 1;
    } else {
      this.bM = 0;
      this.bL = 0;
    } 
    this.bR = 0;
    this.aU = 0;
    this.p = 5;
    this.c = -70;
    this.b3 = 0;
    String[] arrayOfString = { this.bc[54], this.bc[55], this.bc[42], this.bc[56] };
    this.ah = arrayOfString;
  }
  
  void aW() {
    if (this.bK == 10) {
      for (byte b5 = 1; b5 < this.bC; b5++) {
        if ((this.F[b5]).int > -120) {
          b5 = 50;
          this.bK = 0;
          this.bb = 1;
          this.aG = this.F[this.bL];
          aA();
          return;
        } 
      } 
      this.Y.if();
      this.c = 40;
    } else if (this.bK == 16 && this.A == 1) {
      char(0);
    } else if (this.bK == 16 && this.A == 3) {
      af();
    } else if (this.bK == 32 && this.A == 3) {
      a(this.bc[40] + this.bc[41] + this.bc[42], 10, 246);
      int(800);
      af();
    } else if (this.bK == 48 && this.A == 3) {
      a(this.bc[40] + this.bc[41] + this.bc[42], 10, 246);
      int(800);
      this.bb = 1;
      af();
    } 
  }
  
  void aA() {
    if (this.bK != 9 && this.bK != 7)
      this.bK = 0; 
    if (this.c == -70) {
      this.bm = 1;
      this.bR = 0;
      this.bL = 0;
    } else if (this.c == 65) {
      this.bm = 2;
      this.bR = 0;
      this.bL = 0;
    } else if (this.c != 25) {
      if (this.c == 55) {
        this.bL = this.bP;
      } else {
        this.bR = 0;
        this.bm = 0;
        this.bL = 0;
      } 
    } 
    this.void = 5;
    this.c = 35;
    this.aG = this.F[this.bL];
    if (this.bC > 0) {
      U();
    } else {
      this.A = 3;
    } 
    this.A = 1;
    bp();
    this.b2 = -1;
  }
  
  void S() {
    this.bL = 0;
    if (this.c == 55)
      this.bL = this.bP; 
    this.void = 5;
    this.bm = 3;
    this.c = 45;
    if (this.c == 45)
      this.aG = this.aq[this.bL]; 
    bp();
    if (this.j == 0)
      this.A = 3; 
    this.b2 = -1;
  }
  
  void bi() {
    this.c = 65;
    U();
    bp();
    this.b2 = 0;
  }
  
  void a2() {
    if (this.c == 45) {
      if (this.aG != null && this.aG.do[16] != (this.aq[this.bL]).do[16])
        this.A = 1; 
      this.aG = this.aq[this.bL];
    } else {
      if (this.aG != null && this.aG.do[16] != (this.F[this.bL]).do[16])
        this.A = 1; 
      this.aG = this.F[this.bL];
    } 
    this.bP = this.bL;
    this.c = 55;
    this.bK = 0;
    this.bM = 0;
    this.bL = 0;
    this.b2 = -1;
    this.i = (byte)Math.min(this.aG.do[30] / 24, 4);
    this.r = (byte)r(this.G[this.i].length);
    this.ba = 120;
  }
  
  void bb() {
    aI();
    if (this.bm == 3) {
      S();
    } else {
      aA();
    } 
  }
  
  void U() { aI(); }
  
  void bo() {
    this.aB = 0;
    goto();
    this.b2 = -1;
    this.bn = null;
    this.bV.e = 0;
    System.gc();
    this.c = -11;
  }
  
  void a3() {
    if (this.c == 35 || this.c == 21) {
      if (this.bK != 6)
        this.bK = 0; 
    } else if (this.c == -70) {
      this.bm = 1;
      this.bK = 0;
      this.W = 0;
      this.w = 0;
      this.bR = 0;
    } else if (this.c == 99) {
      this.bR = 0;
      this.W = 0;
      this.w = 0;
    } else {
      this.bK = 0;
    } 
    this.bM = this.W;
    this.bL = this.w;
    if (this.bL >= this.aZ[this.bM] && this.aZ[this.bM] > 0)
      this.bL = (byte)(this.aZ[this.bM] - 1); 
    this.aA = null;
    this.c = 25;
    this.void = 6;
    this.b2 = -1;
  }
  
  void bp() {
    if (this.c == 45) {
      String[] arrayOfString = { this.bc[50], this.bc[57], this.bc[138] };
      this.ah = arrayOfString;
    } else if (this.c == 35) {
      if (this.bm == 1) {
        String[] arrayOfString = { this.bc[10], this.bc[50], this.bc[49] };
        this.ah = arrayOfString;
      } else if (this.bm == 2) {
        String[] arrayOfString = { this.bc[50], this.bc[59], this.bc[138] };
        this.ah = arrayOfString;
      } else if (this.bC > 1) {
        String[] arrayOfString = { this.bc[50], this.bc[60], this.bc[36] };
        this.ah = arrayOfString;
      } else {
        String[] arrayOfString = { this.bc[50], this.bc[36], this.bc[49] };
        this.ah = arrayOfString;
      } 
    } else if (this.c == 25) {
      String[] arrayOfString = { this.bc[59], this.bc[61], this.bc[49] };
      this.ah = arrayOfString;
    } else if (this.c == 65) {
      String[] arrayOfString = { this.bc[59], this.bc[61], "扩充电脑" };
      this.ah = arrayOfString;
    } 
  }
  
  void aS() {
    aV();
    if (this.b == -2 && this.b2 < this.ah.length - 1) {
      this.b2 = (byte)(this.b2 + 1);
    } else if (this.b == -1 && this.b2 > 0) {
      this.b2 = (byte)(this.b2 - 1);
    } 
    if (O()) {
      if (this.bV.e == 16)
        if (this.b2 == 0) {
          this.bV.e = 11;
          aT();
          this.b2 = -1;
          this.bt -= 30;
          this.bV.a4 = 1;
        } else {
          this.bV.e = 11;
          this.b2 = -1;
          this.bV.a4 = 2;
        }  
      if (this.c == 35) {
        if (this.ah[this.b2].equals(this.bc[50])) {
          a2();
        } else if (this.ah[this.b2].equals(this.bc[60])) {
          this.bK = 1;
          this.bP = this.bL;
          this.b2 = -1;
        } else if (this.ah[this.b2].equals(this.bc[36])) {
          this.bK = 2;
          String[] arrayOfString = { this.bc[62], this.bc[63], this.bc[49] };
          this.bP = this.bL;
          this.b2 = 0;
          this.ah = arrayOfString;
        } else if (this.ah[this.b2].equals(this.bc[59])) {
          bn();
          this.b2 = -1;
        } else if (this.ah[this.b2].equals(this.bc[62])) {
          this.bK = 6;
          this.W = 1;
          this.w = 0;
          this.bP = this.bL;
          this.aO = this.bR;
          this.b2 = -1;
          a3();
        } else if (this.ah[this.b2].equals(this.bc[63])) {
          if ((this.F[this.bL]).do[13] != -1) {
            byte((this.F[this.bL]).do[13], 1);
            if(a((this.F[this.bL]).do[16]) + this.bc[63] + c((this.F[this.bL]).do[13]), 1);
            (this.F[this.bL]).do[13] = -1;
          } else {
            if(a((this.F[this.bL]).do[16]) + this.bc[39] + this.bc[36], 1);
          } 
        } else if (this.ah[this.b2].equals(this.bc[138])) {
          d d1 = a(this.bL);
          this.aw = this.bC;
          aG();
          if (null != d1) {
            if(d1);
          } else {
            if(this.bc[96] + this.bc[54] + this.bc[42], 0);
          } 
          this.b2 = -1;
          aI();
        } else if (this.ah[this.b2].equals(this.bc[10])) {
          if ((this.F[this.bL]).int <= -120) {
            if(a((this.F[this.bL]).do[16]) + this.bc[8] + this.bc[10], 1);
            this.b2 = -1;
          } else if (this.bL == 0) {
            if(a((this.F[this.bL]).do[16]) + this.bc[9] + this.bc[10], 1);
            this.b2 = -1;
          } else {
            a(this.F[0], this.F[this.bL]);
            this.b2 = -1;
            aI();
            for (byte b5 = 1; b5 <= this.X[0] && this.X[b5] != (this.F[0]).do[12]; b5++) {
              if (b5 == this.X[0]) {
                this.X[0] = (byte)(this.X[0] + 1);
                this.X[this.X[0]] = (this.F[0]).do[12];
                break;
              } 
            } 
            this.bK = 16;
            this.b4 = -1;
            I();
          } 
        } else if (this.ah[this.b2].equals(this.bc[49])) {
          if (this.bK == 2) {
            this.bK = 0;
            bp();
            this.b2 = 0;
          } else {
            this.b2 = -1;
          } 
        } 
      } else if (this.c == 45) {
        if (this.ah[this.b2].equals(this.bc[50])) {
          a2();
        } else if (this.ah[this.b2].equals(this.bc[57])) {
          R();
          this.b2 = -1;
        } else if (this.ah[this.b2].equals(this.bc[138])) {
          if(this.aq[this.bL]);
          z();
          aG();
          this.b2 = -1;
          this.aG = this.aq[this.bL];
        } else if (this.ah[this.b2].equals(this.bc[49])) {
          this.b2 = -1;
        } 
      } else if (this.c == 65) {
        if (this.ah[this.b2].equals(this.bc[59])) {
          aA();
        } else if (this.ah[this.b2].equals(this.bc[61])) {
          S();
          this.bR = 0;
          this.bL = 0;
        } else {
          l(3);
        } 
      } else if (this.c == -15) {
        if (this.ah[this.b2].equals(this.bc[113])) {
          a(this.F[this.aL], this.bO[this.bQ]);
          this.b2 = -1;
          this.bQ = -1;
          this.bK = 3;
        } else {
          this.ah = new String[this.bO.length];
          for (byte b5 = 0; b5 < this.ah.length; b5++)
            this.ah[b5] = if(this.bO[b5]); 
          this.b2 = 0;
          this.bQ = -1;
        } 
      } 
    } else if (this.b == -7) {
      if (this.c == 35 || this.c == 45) {
        this.b2 = -1;
      } else if (this.c == 65) {
        bo();
      } 
      if (this.bK == 2) {
        this.bK = 0;
        bp();
        this.b2 = 0;
      } 
      if (this.c == -15) {
        this.ah = new String[this.bO.length];
        for (byte b5 = 0; b5 < this.ah.length; b5++)
          this.ah[b5] = if(this.bO[b5]); 
        this.b2 = 0;
        this.bQ = -1;
      } 
    } 
  }
  
  void a7() {
    if (this.A != 3 && this.A != 4) {
      this.Y.if(0);
      return;
    } 
    aB();
    a(3 + this.bL, this.int, this.bL, 0, null);
    i();
    do(6, 111, this.aG.int + 120, this.aG.for + 120, 70);
    if (this.bM == 0) {
      String str = a(this.aG.do[16]);
      this.int.setColor(16187136);
      this.int;
      this.int;
      this.int.drawString(str, 56, 148, true | 0x20);
    } 
    if (this.bK == 0) {
      this.int.setColor(14464767);
      this.int.drawString(this.bc[2] + this.bc[75], 25, 235, 20);
      this.int.drawString(this.bc[72] + this.bc[75], 25, 195, 20);
    } 
    if (this.bL == 0) {
      P();
    } else if (this.bL == 1) {
      aR();
    } 
    new(this.G[this.i][this.r]);
    if (this.bL == 2 && this.bK == 0) {
      this.int;
      this.int;
      this.int.drawString(this.bc[51], 4, 318, 0x4 | 0x20);
    } 
  }
  
  void V() {
    if (this.bK == 0) {
      if (if(0, 2, 1, 1, 0) != 0)
        if (O()) {
          if (this.bM == 1 && this.bK == 0) {
            this.bK = 4;
            this.ba = 120;
            this.bL = 0;
            this.aA = null;
          } 
        } else if (this.b == -7) {
          this.bK = 0;
          this.ba = 120;
          this.aA = null;
          bb();
        }  
    } else if (this.bK == 4) {
      byte b5 = this.bL;
      if (if(0, this.aG.do[0], 1, 1, 0) != 0 && (O() || this.b == -7)) {
        this.bK = 0;
        this.bL = 0;
      } 
      if (this.bL != b5) {
        this.ba = 120;
        this.aA = null;
      } 
    } 
  }
  
  void P() {
    byte b5 = 115;
    byte b6 = 15;
    byte b7 = 26;
    byte b8 = 105;
    String[] arrayOfString1 = { this.bc[145], this.bc[66], this.bc[67], this.bc[68], this.bc[69], this.bc[144], this.bc[70] };
    String[] arrayOfString2 = { "" + this.aG.do[11], "" + (this.aG.int + 120), "" + this.aG.a, "" + this.S[this.aG.do[21]], "" + this.aG.new, "" + this.aG.do[30], "" };
    for (byte b9 = 0; b9 < arrayOfString1.length; b9++) {
      a(arrayOfString1[b9], b5, b7 + (21 + b6) * b9, 73, 16777215, 0);
      this.int;
      this.int;
      this.int.drawString(arrayOfString2[b9], b5 + b8, b7 + (21 + b6) * b9 + 16 + 7, 0x20 | 0x8);
    } 
    if (this.aG.do[13] != -1) {
      if(this.aG.do[13], 73 + b5 - 2 - 16, b7 + (21 + b6) * 6 + 2);
    } else {
      this.int;
      this.int;
      this.int.drawString(this.bc[71], b8 + b5, b7 + (21 + b6) * 6 + 6, 0x10 | 0x8);
    } 
    if (this.bK == 0) {
      this.int.setColor(16777215);
      this.int.drawString(this.bc[72] + this.bc[75], 25, 195, 20);
    } 
  }
  
  void aR() {
    byte b5 = 113;
    byte b6 = 22;
    byte b7 = 35;
    byte b8 = 0;
    b8 = this.aG.do[0];
    for (byte b9 = 0; b9 < b8; b9++) {
      if (this.bK != 0 && b9 == this.bL) {
        int(b9, b5, b7 + (21 + b6) * b9, 1);
      } else {
        int(b9, b5, b7 + (21 + b6) * b9, 0);
      } 
    } 
    if (this.bK == 4) {
      if (this.aA == null) {
        this.a8 = this.aG.do[1 + this.bL * 2];
        this.aA = this.aQ[this.a8] + this.bc[97] + this.bc[73] + this.bc[97] + this.T[this.a8][0] + this.bc[97] + this.bc[1] + this.bc[74] + this.bc[97] + this.aG.do[2 + this.bL * 2] + this.bc[93] + this.T[this.a8][1];
      } 
      new(this.aA);
    } 
    if (this.bK == 0) {
      this.int.setColor(16777215);
      this.int.drawString(this.bc[2] + this.bc[75], 25, 235, 20);
    } 
  }
  
  void int(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.a8 = this.aG.do[1 + paramInt1 * 2];
    a(if(this.a8), paramInt2, paramInt3, 73, 16777215, 0);
    this.int.setColor(16777215);
    this.int;
    this.int;
    this.int.drawString(this.bc[94] + this.S[this.T[this.a8][2]] + this.bc[95], paramInt2 + 76 + 3, paramInt3 + 16 + 7, 0x20 | 0x4);
  }
  
  void void(int paramInt) {
    this.l = 0;
    if (this.bR > 0)
      this.l = (byte)(this.l | 0x10); 
    if (this.bR + paramInt < this.aw)
      this.l = (byte)(this.l | true); 
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.int.setColor(paramInt6);
    if (paramInt1 == 1) {
      for (int i1 = 0; i1 < 5; i1++) {
        if ((paramInt5 & 0x10) != 0)
          this.int.drawLine(paramInt2 + i1, paramInt4 - i1, paramInt2 + i1, paramInt4 + i1); 
        if ((paramInt5 & true) != 0)
          this.int.drawLine(paramInt3 - i1, paramInt4 - i1, paramInt3 - i1, paramInt4 + i1); 
      } 
    } else {
      for (int i1 = 0; i1 < 5; i1++) {
        if ((paramInt5 & 0x10) != 0)
          this.int.drawLine(paramInt4 - i1, paramInt2 + i1, paramInt4 + i1, paramInt2 + i1); 
        if ((paramInt5 & true) != 0)
          this.int.drawLine(paramInt4 - i1, paramInt3 - i1, paramInt4 + i1, paramInt3 - i1); 
      } 
    } 
  }
  
  void h(int paramInt) {
    if (paramInt == 0)
      this.bL = 0; 
  }
  
  byte if(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (this.b == -4 && (paramInt3 & 0x10) > 0) {
      if (this.bM < paramInt1 - 1) {
        this.bM = (byte)(this.bM + 1);
        h(paramInt5);
      } else if (paramInt4 == 1) {
        this.bM = 0;
        h(paramInt5);
      } 
    } else if (this.b == -3 && (paramInt3 & 0x10) > 0) {
      if (this.bM > 0) {
        this.bM = (byte)(this.bM - 1);
        h(paramInt5);
      } else if (paramInt4 == 1) {
        this.bM = (byte)(paramInt1 - 1);
        h(paramInt5);
      } 
    } else if (this.b == -1 && (paramInt3 & true) > 0) {
      if (this.bL > 0)
        this.bL = (byte)(this.bL - 1); 
    } else if (this.b == -2 && (paramInt3 & true) > 0) {
      if (this.bL < paramInt2 - 1)
        this.bL = (byte)(this.bL + 1); 
    } else {
      return -1;
    } 
    return 0;
  }
  
  void aV() {
    this.Y;
    f.S = false;
  }
  
  public void e(int paramInt) {
    this.bk = 1;
    this.b = paramInt;
    if (this.c == 98) {
      this.ah = this.Y.P;
      this.c = this.Y.X;
      if (this.Y.f)
        this.Y.a(this.Y.n.byte, false); 
      aV();
      return;
    } 
    if (this.d > 0) {
      if (this.c == -10 && this.bV.e == 0)
        this.d = 0; 
      aV();
      return;
    } 
    if (paramInt == 42 && this.Y.H) {
      if (this.e == 0) {
        this.e = 1;
      } else {
        this.e = 0;
      } 
      aV();
    } 
    if (this.e != 0) {
      aq();
      return;
    } 
    switch (this.c) {
      case 41:
        o(paramInt);
        break;
      case 40:
        aV();
        this.aX = m(39);
        if (this.aX) {
          this.c = 41;
          this.Y.a(this.a7, 209);
          break;
        } 
        l(5);
        break;
      case -10:
        this.bV.int(paramInt);
        break;
      case 99:
        if (O()) {
          aV();
          if (this.bL == 0) {
            f(this.Y.W);
            this.ah = null;
            break;
          } 
          if (this.bL == 3) {
            this.bK = 9;
            a3();
            break;
          } 
          if (this.bL == 2) {
            if (this.bM == 0) {
              this.bM = 1;
              this.Y.long = this.bc[168];
              break;
            } 
            this.bV.if(this.int);
            this.bM = 0;
            this.c = 100;
            this.aB = 0;
            break;
          } 
          if (this.bL == 4) {
            if (this.bM == 0) {
              this.Y.long = this.bc[167];
              this.bM = 1;
              break;
            } 
            this.bM = 0;
            this.Y.int();
            this.bV = null;
            Z();
            break;
          } 
          if (this.bL == 1) {
            this.bL = 0;
            aA();
            break;
          } 
          if (this.bL == 5) {
            this.Y.else();
            break;
          } 
          if (this.bL == 6) {
            this.c = 0;
            this.ah = null;
            Y();
          } 
          break;
        } 
        if (paramInt == -7) {
          if (this.bM == 1) {
            this.bM = 0;
            break;
          } 
          this.ah = null;
          f(this.Y.W);
          break;
        } 
        if (paramInt == -1) {
          this.bL = (byte)(this.bL - 1);
          if (this.bL < 0)
            this.bL = (byte)(this.ah.length - 1); 
          break;
        } 
        if (paramInt == -2) {
          this.bL = (byte)(this.bL + 1);
          if (this.bL > this.ah.length - 1)
            this.bL = 0; 
        } 
        break;
      case 21:
        ae();
        break;
      case 51:
        if (O()) {
          bk();
          az();
          System.gc();
          this.bV.e = 0;
          aV();
          this.Y.J = 0;
          this.c = 50;
        } 
        break;
      case 50:
        if (O()) {
          this.c = 0;
          this.ah = null;
          Y();
          aV();
        } 
        break;
      case -70:
        if (this.bK != 0)
          return; 
        if (O()) {
          if (this.bM == 0 && this.bL == 0) {
            g();
            break;
          } 
          if (this.bM == 1 && this.bL == 0) {
            if ((this.F[0]).if[2][2] == 0) {
              this.bm = 1;
              this.a6 = this.B[0];
              a3();
              break;
            } 
            this.d = 3;
            if(this.bc[122] + this.bc[133] + this.bc[8] + this.bc[1] + this.bc[30] + this.bc[91], 0);
            break;
          } 
          if (this.bM == 0 && this.bL == 1) {
            if ((this.F[0]).if[1][2] != 0 || (this.F[0]).if[4][2] != 0) {
              this.d = 3;
              if ((this.F[0]).if[1][2] != 0 && (this.F[0]).if[4][2] != 0) {
                if(this.bc[122] + this.bc[18] + this.bc[137] + this.bc[121] + this.bc[136] + this.bc[90] + this.bc[8] + this.bc[50] + this.bc[42], 0);
                break;
              } 
              if ((this.F[0]).if[1][2] != 0) {
                if(this.bc[122] + this.bc[121] + this.bc[136] + this.bc[90] + this.bc[8] + this.bc[50] + this.bc[42], 0);
                break;
              } 
              if ((this.F[0]).if[4][2] != 0)
                if(this.bc[122] + this.bc[18] + this.bc[136] + this.bc[90] + this.bc[8] + this.bc[50] + this.bc[42], 0); 
              break;
            } 
            this.bm = 0;
            this.bL = 0;
            this.bR = 0;
            this.a6 = this.B[0];
            aA();
            break;
          } 
          if (this.bM == 1 && this.bL == 1) {
            if (this.bJ == 1) {
              int i1 = r(10);
              if (i1 > 7) {
                this.d = 3;
                if(this.bc[56] + this.bc[126], 0);
                this.bK = 16;
                break;
              } 
              s();
              byte();
              bo();
              break;
            } 
            this.d = 3;
            if(this.bc[8] + this.bc[56], 0);
            I();
          } 
          break;
        } 
        if(2, 2, 17, 1, 1);
        break;
      case -40:
        if (O()) {
          aN();
          C();
          aV();
        } 
        break;
      case -80:
        if (O()) {
          if ((this.F[0]).do[2 + 2 * this.bL] > 0) {
            (this.F[0]).do[2 + 2 * this.bL] = (byte)((this.F[0]).do[2 + 2 * this.bL] - 1);
            be();
            char(0);
            this.b4 = this.bL;
            this.ag = this.bR;
            break;
          } 
          if(this.bc[171], 0);
          break;
        } 
        if (paramInt == -7) {
          I();
          break;
        } 
        char((this.F[0]).do[0], 2);
        this.ba = 120;
        break;
      case 35:
      case 45:
        e();
        break;
      case 65:
        aS();
        break;
      case 25:
        y();
        break;
      case 18:
        aV();
        if (this.bK == 0) {
          if (O()) {
            if (if(this.aV[this.bL]) == 99) {
              if(this.bc[8] + this.bc[20] + this.bc[30], 0);
              break;
            } 
            if (this.bt >= this.aj[this.aV[this.bL]]) {
              this.bK = 11;
              this.bP = 1;
              this.b2 = 0;
              this.ah = new String[1];
              this.ah[0] = this.bc[76] + this.bc[97] + this.bP;
              break;
            } 
            if(this.case, 0);
            break;
          } 
          if (paramInt == -7) {
            this.ar[4] = null;
            f(this.Y.W);
            break;
          } 
          if (paramInt == -3 || paramInt == -4) {
            ak();
          } else {
            char(this.aV.length, this.void);
          } 
          this.ba = 120;
          break;
        } 
        if (paramInt == -1) {
          if (this.bP + if(this.aV[this.bL]) < 99 && (this.bP + 1) * this.aj[this.aV[this.bL]] <= this.bt) {
            this.bP = (byte)(this.bP + 1);
            this.ah[0] = this.bc[76] + this.bc[97] + this.bP;
          } 
          break;
        } 
        if (paramInt == -2) {
          if (this.bP > 1) {
            this.bP = (byte)(this.bP - 1);
            this.ah[0] = this.bc[76] + this.bc[97] + this.bP;
          } 
          break;
        } 
        if (O()) {
          this.bt -= this.bP * this.aj[this.aV[this.bL]];
          if (byte(this.aV[this.bL], this.bP) == -1) {
            if(this.bc[30] + this.bc[32] + this.bc[44], 1);
          } else {
            if(this.bc[85] + this.bP + this.bc[101] + c(this.aV[this.bL]), 1);
          } 
          this.bP = 0;
          this.bK = 0;
          this.b2 = -1;
          break;
        } 
        if (paramInt == -7) {
          this.bP = 0;
          this.bK = 0;
          this.b2 = -1;
        } 
        break;
      case 19:
        if (this.bK == 0) {
          if (O() && this.aZ[0] > 0) {
            this.bK = 12;
            this.bP = 1;
            this.b2 = 0;
            this.ah = new String[1];
            this.ah[0] = this.bc[76] + this.bc[97] + this.bP;
            break;
          } 
          if (paramInt == -7) {
            this.ar[4] = null;
            f(this.Y.W);
            break;
          } 
          if (paramInt == -3 || paramInt == -4) {
            aX();
          } else {
            char(this.aZ[0], this.void);
          } 
          this.ba = 120;
          break;
        } 
        if (paramInt == -1) {
          if (this.bP < this.b0[0][this.bL][1]) {
            this.bP = (byte)(this.bP + 1);
            this.ah[0] = this.bc[76] + this.bc[97] + this.bP;
          } 
          break;
        } 
        if (paramInt == -2) {
          if (this.bP > 1) {
            this.bP = (byte)(this.bP - 1);
            this.ah[0] = this.bc[76] + this.bc[97] + this.bP;
          } 
          break;
        } 
        if (O()) {
          this.bt += this.bP * this.aj[this.b0[0][this.bL][0]] / 2;
          do(this.b0[0][this.bL][0], this.bP);
          if(this.bc[150] + this.bP + this.bc[101] + c(this.b0[0][this.bL][0]), 1);
          this.bP = 0;
          this.bK = 0;
          this.b2 = -1;
          break;
        } 
        if (paramInt == -7) {
          this.bP = 0;
          this.bK = 0;
          this.b2 = -1;
        } 
        break;
      case 55:
        V();
        break;
      case -15:
        if (this.b2 >= 0) {
          if (O() && this.bQ == -1) {
            String[] arrayOfString = { this.bc[112], this.bc[113] };
            this.ah = arrayOfString;
            this.bQ = this.b2;
            this.b2 = 0;
            break;
          } 
          if (paramInt == -7) {
            if (this.bQ != -1)
              this.bQ = -1; 
            break;
          } 
          aS();
        } 
        break;
      case 22:
        aC();
        break;
      case 23:
        new();
        break;
      case 88:
        long();
        break;
    } 
    if (this.c != -10 || (this.c == -10 && O()))
      aV(); 
  }
  
  void a(d paramd, int paramInt) {
    paramd.do[1 + paramd.do[0] * 2] = (byte)paramInt;
    paramd.do[2 + paramd.do[0] * 2] = this.T[paramInt][1];
    paramd.do[0] = (byte)(paramd.do[0] + 1);
    if(a(paramd.do[16]) + this.bc[127] + if((byte)paramInt), 0);
  }
  
  byte[] a(int paramInt1, byte[] paramArrayOfByte, int paramInt2) {
    try {
      if (paramInt2 == 4) {
        if (this.bv != null) {
          this.bv.closeRecordStore();
          this.bv = null;
        } 
        return null;
      } 
      if (this.bv == null)
        this.bv = RecordStore.openRecordStore("s", true); 
      if (this.bv.getNumRecords() == 0) {
        byte[] arrayOfByte1 = new byte[148];
        byte[] arrayOfByte2 = new byte[20];
        arrayOfByte1[0] = -1;
        for (byte b5 = 0; b5 < 84; b5++) {
          if (b5 < 9) {
            this.bv.addRecord(arrayOfByte1, 0, arrayOfByte1.length);
          } else {
            this.bv.addRecord(arrayOfByte2, 0, arrayOfByte2.length);
          } 
        } 
      } 
      if (paramInt2 != 0) {
        if (paramInt2 == 1)
          return this.bv.getRecord(paramInt1); 
        if (paramInt2 == 2) {
          this.bv.setRecord(paramInt1, paramArrayOfByte, 0, paramArrayOfByte.length);
        } else if (paramInt2 == 3) {
          if (this.bv != null) {
            this.bv.closeRecordStore();
            this.bv = null;
          } 
          RecordStore.deleteRecordStore("s");
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return null;
  }
  
  public void byte(int paramInt) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    try {
      if (paramInt == 0) {
        byteArrayOutputStream.write(this.j);
        for (byte b5 = 0; b5 < this.j; b5++)
          a(byteArrayOutputStream, this.aq[b5]); 
        a(5, byteArrayOutputStream.toByteArray(), 2);
      } else {
        byteArrayOutputStream.write(this.bC);
        for (byte b5 = 0; b5 < this.bC; b5++)
          a(byteArrayOutputStream, this.F[b5]); 
        a(6, byteArrayOutputStream.toByteArray(), 2);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  void p(int paramInt) {
    byte[] arrayOfByte = a(5 + paramInt, null, 1);
    if (paramInt == 0) {
      this.aq = new d[this.aR];
      if (arrayOfByte[0] == -1) {
        this.j = 0;
        return;
      } 
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
      this.j = (byte)byteArrayInputStream.read();
      for (byte b5 = 0; b5 < this.j; b5++) {
        this.aq[b5] = new d();
        a(byteArrayInputStream, this.aq[b5]);
      } 
    } else {
      this.F = new d[5];
      if (arrayOfByte[0] == -1) {
        this.bC = 0;
        return;
      } 
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
      this.bC = (byte)byteArrayInputStream.read();
      for (byte b5 = 0; b5 < this.bC; b5++) {
        this.F[b5] = new d();
        a(byteArrayInputStream, this.F[b5]);
      } 
    } 
  }
  
  public void aY() {
    byte b5 = this.aZ[0] + this.aZ[1] + this.aZ[2];
    byte[] arrayOfByte = new byte[3 + b5 * 2];
    b5 = 0;
    arrayOfByte[0] = this.aZ[0];
    arrayOfByte[1] = this.aZ[1];
    arrayOfByte[2] = this.aZ[2];
    for (byte b6 = 0; b6 < 3; b6++) {
      byte b7 = 0;
      while (b7 < this.aZ[b6]) {
        arrayOfByte[b5 * 2 + 3] = this.b0[b6][b7][0];
        arrayOfByte[b5 * 2 + 4] = this.b0[b6][b7][1];
        b7++;
        b5++;
      } 
    } 
    a(4, arrayOfByte, 2);
    a(7, this.a3, 2);
  }
  
  void ai() {
    byte[] arrayOfByte = a(4, null, 1);
    this.aZ = new byte[3];
    if (arrayOfByte[0] == -1) {
      this.aZ[0] = 0;
    } else {
      this.aZ[0] = arrayOfByte[0];
      this.aZ[1] = arrayOfByte[1];
      this.aZ[2] = arrayOfByte[2];
    } 
    this.b0 = new byte[3][30][2];
    byte b5 = 0;
    for (byte b6 = 0; b6 < 3; b6++) {
      byte b7 = 0;
      while (b7 < this.aZ[b6]) {
        this.b0[b6][b7][0] = arrayOfByte[b5 * 2 + 3];
        this.b0[b6][b7][1] = arrayOfByte[b5 * 2 + 4];
        if (this.b0[b6][b7][0] == 41)
          this.long = this.b0[b6][b7][1]; 
        b7++;
        b5++;
      } 
    } 
    this.a3 = a(7, null, 1);
    if (this.a3[0] == -1)
      this.a3 = new byte[101]; 
  }
  
  void B() {
    this.int.drawImage(this.aK[0], 0, 0, 20);
    if (null == this.x)
      this.x = this.Y.a("/battle/6.png"); 
    if (null != this.x) {
      this.int;
      this.int;
      this.int.drawImage(this.x, 0, 320, 0x4 | 0x20);
    } 
  }
  
  void else() { a(0, 0, 240, 320, 1 + this.aB, 6, 1, 2, 16777215, 4802889); }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10) {
    if ((paramInt9 & 0xFF000000) != 0) {
      this.int.setColor(paramInt9);
      this.int.fillRect(paramInt1, paramInt2, paramInt3, paramInt4);
    } 
    this.int.setColor(paramInt10);
    int i1 = 0;
    int i2 = 1;
    if (paramInt8 == 1) {
      i1 = paramInt2 + paramInt4;
      while (paramInt2 < i1) {
        this.int.fillRect(paramInt1, paramInt2, paramInt3, paramInt5);
        paramInt2 += paramInt5;
        paramInt2 += i2;
        paramInt5 -= paramInt7;
        if (paramInt5 <= 0) {
          if (i2 < --paramInt6)
            i2++; 
          paramInt5 = 1;
        } 
      } 
    } else if (paramInt8 == 2) {
      i1 = paramInt2;
      paramInt2 += paramInt4;
      while (paramInt2 > i1) {
        this.int.fillRect(paramInt1, paramInt2 - paramInt5, paramInt3, paramInt5);
        paramInt2 -= paramInt5;
        paramInt2 -= i2;
        paramInt5 -= paramInt7;
        if (paramInt5 <= 0) {
          if (i2 < --paramInt6)
            i2++; 
          paramInt5 = 1;
        } 
      } 
    } 
  }
  
  void a0() { do(0, 257, 240, 63, 15452159, 10448383, 3473558); }
  
  void void() {
    this.int.setColor(13162740);
    this.int.fillRect(0, 0, 240, 320);
    do(2, 0, 240, 320, 15452159, 10448383, 3473558);
  }
  
  public void do(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    if (null == this.b1)
      this.b1 = this.Y.a("/guochang/dialog.png"); 
    if (paramInt4 == 63) {
      this.int.drawImage(this.b1, paramInt1, paramInt2, 20);
    } else if (paramInt4 < 63) {
      int i1 = paramInt3 >> 1;
      int i2 = paramInt4 >> 1;
      this.int.setClip(paramInt1, paramInt2, i1, i2);
      this.int.drawImage(this.b1, paramInt1, paramInt2, 20);
      this.int.setClip(paramInt1 + i1, paramInt2, i1, i2);
      this.int;
      this.int;
      this.int.drawImage(this.b1, paramInt1 + paramInt3, paramInt2, 0x8 | 0x10);
      this.int.setClip(paramInt1, paramInt2 + i2, i1, i2);
      this.int;
      this.int;
      this.int.drawImage(this.b1, paramInt1, paramInt2 + paramInt4, 0x4 | 0x20);
      this.int.setClip(paramInt1 + i1, paramInt2 + i2, i1, i2);
      this.int;
      this.int;
      this.int.drawImage(this.b1, paramInt1 + paramInt3, paramInt2 + paramInt4, 0x8 | 0x20);
    } else if (paramInt4 > 63) {
      this.int.setClip(0, paramInt2, 240, 31);
      this.int.drawImage(this.b1, paramInt1, paramInt2, 20);
      for (int i1 = paramInt2; i1 < paramInt2 + paramInt4 - 46; i1 += 46) {
        this.int.setClip(0, i1 + 8, 240, 46);
        this.int.drawImage(this.b1, paramInt1, i1, 20);
      } 
      this.int.setClip(0, paramInt4 - 46, 240, 46);
      this.int;
      this.int;
      this.int.drawImage(this.b1, paramInt1, paramInt2 + paramInt4, 0x4 | 0x20);
    } 
    this.int.setClip(0, 0, 240, 320);
  }
  
  public void if(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (null == this.L)
      this.L = this.Y.a("/guochang/name.png"); 
    int i1 = paramInt3 >> 1;
    int i2 = paramInt4 >> 1;
    this.int.setClip(paramInt1, paramInt2, i1, i2);
    this.int.drawImage(this.L, paramInt1, paramInt2, 20);
    this.int.setClip(paramInt1 + i1, paramInt2, i1, i2);
    this.int;
    this.int;
    this.int.drawImage(this.L, paramInt1 + paramInt3, paramInt2, 0x8 | 0x10);
    this.int.setClip(paramInt1, paramInt2 + i2, i1, i2);
    this.int;
    this.int;
    this.int.drawImage(this.L, paramInt1, paramInt2 + paramInt4, 0x4 | 0x20);
    this.int.setClip(paramInt1 + i1, paramInt2 + i2, i1, i2);
    this.int;
    this.int;
    this.int.drawImage(this.L, paramInt1 + paramInt3, paramInt2 + paramInt4, 0x8 | 0x20);
    this.int.setClip(0, 0, 240, 320);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    this.int.setColor(paramInt5);
    this.int.fillRect(paramInt1 + 1, paramInt2 + 1, paramInt3 - 1, paramInt4 - 2);
    this.int.setColor(paramInt6);
    this.int.drawRoundRect(paramInt1, paramInt2, paramInt3 - 1, paramInt4 - 1, 3, 3);
    this.int.setColor(paramInt7);
    this.int.drawRect(paramInt1 + 1, paramInt2 + 1, paramInt3 - 3, paramInt4 - 3);
  }
  
  void try() {
    if (this.aU == -2)
      return; 
    int[] arrayOfInt = { 2234536, 16777215, 10443007, 14597631 };
    a(-10, 0, 138, 46, 8, 8, arrayOfInt);
    this.int.setColor(arrayOfInt[0]);
    this.int.drawString(a(this.bp.do[16]), 3, 5, 20);
    this.int;
    this.int;
    this.int.drawString("生命:", 55, 24, 0x8 | 0x10);
    this.int;
    this.int;
    this.int.drawString("" + this.bp.do[11] + this.bc[77], 120, 5, 0x8 | 0x10);
    do(43, 30, this.bp.int + 120, this.bp.for + 120, 65);
    this.int;
    this.int;
    this.int.drawImage(this.aK[3], 14, 39, 0x8 | 0x20);
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int[] paramArrayOfInt) {
    this.int.setColor(paramArrayOfInt[3]);
    this.int.fillRoundRect(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    this.int.setColor(paramArrayOfInt[0]);
    this.int.drawRoundRect(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    this.int.setColor(paramArrayOfInt[1]);
    this.int.drawRoundRect(paramInt1 + 1, paramInt2, paramInt3 - 2, paramInt4 - 1, paramInt5, paramInt6);
    this.int.setColor(paramArrayOfInt[2]);
    this.int.drawRoundRect(paramInt1 + 2, paramInt2 + 1, paramInt3 - 4, paramInt4 - 3, paramInt5, paramInt6);
  }
  
  void aZ() {
    if (this.aU == 2)
      return; 
    byte b5 = 104;
    char c1 = '§';
    int[] arrayOfInt = { 2234536, 16777215, 10443007, 14597631 };
    a(b5, c1, 190, 45, 8, 8, arrayOfInt);
    a(b5 + 16, c1 + '.', 190, 25, 8, 8, arrayOfInt);
    this.int.setColor(arrayOfInt[0]);
    this.int.drawString(a((this.F[this.aL]).do[16]), b5 + 8, c1 + '\004', 20);
    this.int.drawString("经验:", b5 + 22, c1 + '0', 20);
    this.int;
    this.int;
    this.int.drawString("" + (this.F[this.aL]).do[11] + this.bc[77], 232, c1 + '\004', 0x8 | 0x10);
    this.int.drawString("生命:", b5 + 22, c1 + '\027', 20);
    do(b5 + 50, c1 + '\037', (this.F[this.aL]).int + 120, (this.F[this.aL]).for + 120, 65);
    this.int.setColor(15536986);
    this.int;
    this.int;
    a(0, 15124224, "" + ((this.F[this.aL]).int + 120) + this.bc[93] + ((this.F[this.aL]).for + 120), b5 + 97, c1 + '*', true | 0x20);
    byte b6 = 0;
    b6 = (this.F[this.aL]).do[11] * 75 / 10 - 2;
    for(b5 + 50, c1 + '8', (this.F[this.aL]).new, b6, 65);
    this.int;
    this.int;
    this.int.drawImage(this.aK[3], b5 + 22, c1 + '&', 0x8 | 0x20);
  }
  
  void a(int paramInt1, int paramInt2, String paramString, int paramInt3, int paramInt4, int paramInt5) {
    this.int.setColor(paramInt1);
    this.int.drawString(paramString, paramInt3 - 1, paramInt4, paramInt5);
    this.int.drawString(paramString, paramInt3, paramInt4 - 1, paramInt5);
    this.int.drawString(paramString, paramInt3 + 1, paramInt4, paramInt5);
    this.int.drawString(paramString, paramInt3, paramInt4 + 1, paramInt5);
    this.int.setColor(paramInt2);
    this.int.drawString(paramString, paramInt3, paramInt4, paramInt5);
  }
  
  void if(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    this.int.setColor(12959999);
    this.int.drawRoundRect(paramInt1 - 1, paramInt2 - 1, paramInt7 + 3, 8, 2, 2);
    this.int.setColor(14736895);
    this.int.fillRoundRect(paramInt1, paramInt2, paramInt7 + 1, 6, 2, 2);
    this.int.setColor(paramInt5);
    this.int.drawRoundRect(paramInt1, paramInt2, paramInt7 + 1, 6, 2, 2);
    if (paramInt3 > 0) {
      this.int.setColor(paramInt6);
      this.int.fillRoundRect(paramInt1 + 1, paramInt2 + 1, paramInt3 * paramInt7 / paramInt4, 5, 2, 2);
    } 
  }
  
  void do(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    paramInt1 += 14;
    paramInt5--;
    int i1;
    for (i1 = 0; i1 < this.J.length; i1++) {
      this.int.setColor(this.J[i1]);
      this.int.drawLine(paramInt1 + this.t[i1][0], paramInt2 + this.t[i1][1], paramInt1 + paramInt5 + this.t[i1][2], paramInt2 + this.t[i1][1]);
    } 
    i1 = paramInt3 * paramInt5 / paramInt4;
    if (paramInt3 > 0) {
      this.int.setColor(16762967);
      this.int.drawLine(paramInt1 + 2, paramInt2 + 1, paramInt1 + i1 + 0, paramInt2 + 1);
      this.int.drawLine(paramInt1 + 1, paramInt2 + 2, paramInt1 + i1 + 1, paramInt2 + 2);
      this.int.setColor(16736512);
      this.int.drawLine(paramInt1 + 1, paramInt2 + 3, paramInt1 + i1 + 1, paramInt2 + 3);
      this.int.drawLine(paramInt1 + 2, paramInt2 + 4, paramInt1 + i1 + 0, paramInt2 + 4);
    } 
  }
  
  void for(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    paramInt1 += 14;
    paramInt5--;
    int i1;
    for (i1 = 0; i1 < this.J.length; i1++) {
      this.int.setColor(this.J[i1]);
      this.int.drawLine(paramInt1 + this.t[i1][0], paramInt2 + this.t[i1][1], paramInt1 + paramInt5 + this.t[i1][2], paramInt2 + this.t[i1][1]);
    } 
    i1 = paramInt3 * paramInt5 / paramInt4;
    if (paramInt3 > 0) {
      this.int.setColor(65529);
      this.int.drawLine(paramInt1 + 2, paramInt2 + 1, paramInt1 + i1 + 0, paramInt2 + 1);
      this.int.drawLine(paramInt1 + 1, paramInt2 + 2, paramInt1 + i1 + 1, paramInt2 + 2);
      this.int.setColor(8104447);
      this.int.drawLine(paramInt1 + 1, paramInt2 + 3, paramInt1 + i1 + 1, paramInt2 + 3);
      this.int.drawLine(paramInt1 + 2, paramInt2 + 4, paramInt1 + i1 + 0, paramInt2 + 4);
    } 
  }
  
  void a1() { this.Y.a(a("help"), this.ao); }
  
  void bm() { this.Y.a(a("about"), this.ao + 19); }
  
  void be() {
    B();
    aQ();
    try();
    t();
    aU();
    a(this.F[0], 107, 220);
    aZ();
  }
  
  void D() {
    be();
    a(a(this.else.do[16]) + this.bc[1] + this.bc[2] + if(this.a8), 10, 246);
    int(100);
    r();
    if (this.aB == 100) {
      goto();
      this.c = -87;
    } 
  }
  
  void aO() {
    be();
    bg();
  }
  
  void new(int paramInt) {
    if (this.bK == 0) {
      int i1 = this.if;
      if ((this.F[paramInt]).do[11] - this.bf > 10) {
        i1 = 0;
      } else {
        i1 -= (this.F[paramInt]).do[11] / 3;
      } 
      if ((this.F[paramInt]).do[11] < this.aF && i1 != 0) {
        int(1000);
        this.bK = 1;
        this.bN = (short)((i1 > 0) ? i1 : 0);
        if (this.bJ == -1)
          this.bN = (short)(this.bN * 3 / 2); 
        this.bN = (short)(this.bN * this.bE);
        if (i1 != 0)
          a(a((this.F[paramInt]).do[16]) + this.bc[25] + this.bN + this.bc[26], 10, 246); 
        this.F[paramInt].do();
      } else {
        this.aW = (byte)(this.aW + 1);
      } 
    } else if (this.bK == 1) {
      if ((this.F[paramInt]).do[11] < this.aF) {
        int i1 = 0;
        int i2 = (this.F[paramInt]).new + this.bN;
        i1 = (this.F[paramInt]).do[11] * 75 / 10 - 2;
        if (i2 >= i1) {
          this.bN = (short)(i2 - i1);
          (this.F[paramInt]).new = 0;
          (this.F[paramInt]).do[11] = (byte)((this.F[paramInt]).do[11] + 1);
          short s1 = 0;
          if ((this.F[paramInt]).do[11] <= 20) {
            s1 = 2;
          } else if ((this.F[paramInt]).do[11] > 20 && (this.F[paramInt]).do[11] <= 40) {
            s1 = 3;
          } else {
            s1 = 4;
          } 
          (this.F[paramInt]).for = (short)((this.F[paramInt]).for + s1);
          for(this.F[paramInt]);
          StringBuffer stringBuffer = new StringBuffer();
          stringBuffer.append(a((this.F[paramInt]).do[16]) + this.bc[27] + (this.F[paramInt]).do[11] + this.bc[77] + this.bc[28] + "+" + s1);
          if (((this.F[paramInt]).do[11] & true) == 0) {
            (this.F[paramInt]).a = (short)((this.F[paramInt]).a + 1);
            stringBuffer.append(this.bc[97] + this.bc[29] + this.bc[100]);
          } 
          if ((this.F[paramInt]).do[11] == this.aF)
            stringBuffer.append(this.bc[97] + this.bc[38] + this.bc[44]); 
          a(stringBuffer.toString(), 10, 246);
          int(1000);
          this.bK = 2;
        } else {
          (this.F[paramInt]).new += this.bN;
          this.aW = (byte)(this.aW + 1);
          this.bK = 0;
        } 
      } else {
        (this.F[paramInt]).new = 0;
        this.aW = (byte)(this.aW + 1);
        this.bK = 0;
      } 
    } else if (this.bK == 2) {
      if (this.b2 == -1) {
        this.bO = null;
        byte b5 = (this.F[paramInt]).do[16];
        if(this.F[paramInt], 1);
        if (this.bm == 0 && this.bO != null) {
          this.b2 = 0;
          this.ah = new String[this.bO.length];
          for (byte b6 = 0; b6 < this.ah.length; b6++)
            this.ah[b6] = if(this.bO[b6]); 
        } else if (this.bm == 2) {
          a(a(b5) + this.bc[128] + a((this.F[paramInt]).do[16]), 10, 246);
          this.bL = (byte)paramInt;
          this.aL = this.bL;
          at();
          this.bK = 1;
          this.bm = 0;
          int(1000);
        } else {
          this.bK = 1;
          this.bm = 0;
        } 
      } else {
        if (this.bQ == -1) {
          a(this.bc[129] + this.bc[2] + ":" + this.aQ[this.bO[this.b2]], 10, 246);
        } else {
          a(this.bc[169], 10, 246);
        } 
        do(120, 90 - 14 * this.ah.length - 4 >> 1, 14, 30);
      } 
    } else if (this.bK == 3 && this.d == 0) {
      this.bK = 1;
    } 
  }
  
  void l() {
    if (this.aW < this.X[0]) {
      if (this.bK == 0) {
        this.aL = this.X[1 + this.aW];
        this.bL = this.X[1 + this.aW];
        if ((this.F[this.aL]).do[13] == 10)
          if(20, this.F[this.aL]); 
        at();
        be();
        this.aB = (byte)(this.aB - 1);
      } 
      new(this.X[1 + this.aW]);
    } else {
      if (this.bJ == 1 && r(100) <= this.bf / 3) {
        byte(31, 1);
        a(this.bc[25] + "宝箱1个", 10, 254);
        int(1000);
      } 
      this.aB = 100;
    } 
  }
  
  void s() {
    if (this.bC > 1)
      for (byte b5 = 0; b5 < this.bC - 1; b5++) {
        for (byte b6 = b5 + true; b6 < this.bC; b6++) {
          if ((this.F[b5]).do[12] > (this.F[b6]).do[12])
            a(this.F[b5], this.F[b6]); 
        } 
      }  
  }
  
  void do(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i1 = paramInt4;
    for (int i2 = 0; i2 < this.ah.length; i2++) {
      a(paramInt1 - 47, paramInt2 + i1 * i2, (i2 == this.b2), 94);
      if (i2 == this.b2) {
        this.int.setColor(this.aS[0]);
      } else {
        this.int.setColor(this.aS[1]);
      } 
      this.int;
      this.int;
      this.int.drawString(this.ah[i2], paramInt1, paramInt2 + 4 + i1 * i2, true | 0x10);
    } 
  }
  
  private void a(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3) {
    int i1 = 54 - paramInt3 / 2;
    paramInt1 += paramInt3 / 2;
    if (paramBoolean) {
      if (this.bk > 0) {
        this.bk = (byte)(this.bk - 1);
        i1 -= 2;
      } 
      this.int;
      this.int;
      this.int.drawImage(this.aC[25], paramInt1 + i1, paramInt2, 0x8 | 0x10);
      this.int;
      this.int;
      this.new;
      if(this.aC[25], paramInt1 - i1, paramInt2, 0x4 | 0x10, 8192);
    } else {
      this.int;
      this.int;
      this.int.drawImage(this.aC[29], paramInt1 + i1, paramInt2, 0x8 | 0x10);
      this.int;
      this.int;
      this.new;
      if(this.aC[29], paramInt1 - i1, paramInt2, 0x4 | 0x10, 8192);
    } 
  }
  
  void E() {
    be();
    if (this.aB == 1) {
      s();
      byte b5;
      for (b5 = 1; b5 <= this.X[0]; b5++) {
        if ((this.F[this.X[b5]]).int <= -120) {
          this.F[this.X[b5]].for();
          System.arraycopy(this.X, b5 + true, this.X, b5, this.X[0] - b5);
          this.X[0] = (byte)(this.X[0] - 1);
          continue;
        } 
      } 
      this.if = 0;
      this.bf = (this.bd[0]).do[11];
      for (b5 = 0; b5 < this.ax; b5++) {
        this.if += (this.bd[b5]).do[20] + (this.bd[b5]).do[11] - 5;
        if ((this.bd[b5]).do[11] > this.bf)
          this.bf = (this.bd[b5]).do[11]; 
      } 
      this.if = this.if * (5 * (this.o + 1) - this.X[0] * 6 + 1) / this.o * 5;
      this.aB = 2;
      this.aW = 0;
      ax();
    } 
    if (this.aB >= 2) {
      this.aB = 1;
      l();
    } 
  }
  
  void aK() {
    be();
    if (this.aB < 49)
      bj(); 
    if (this.aB == 49) {
      if (this.aW >= 10) {
        if (this.a8 <= 6)
          b(); 
        String[] arrayOfString1 = { this.bc[158], this.bc[159], this.bc[160], this.bc[161] };
        String[] arrayOfString2 = { this.bc[162], this.bc[163], this.bc[164] };
        boolean bool = true;
        if (this.else.do[30] < 30) {
          a(arrayOfString2[0], 10, 246);
        } else if (this.else.do[30] < 50) {
          a(arrayOfString2[1], 10, 246);
        } else if (this.else.do[30] < 70) {
          a(arrayOfString2[2], 10, 246);
        } else {
          int i1 = r(2);
          if (this.Z <= -25) {
            a(arrayOfString1[i1], 10, 246);
          } else if (this.Z >= 30) {
            a(arrayOfString1[2 + i1], 10, 246);
          } else {
            bool = false;
          } 
        } 
        if (bool)
          int(400); 
      } else {
        this.bw = -3;
        a(a(this.bT.do[16]) + this.bc[11], 10, 246);
        int(200);
      } 
    } else if (this.aB > 49) {
      if (this.aW >= 10) {
        if();
      } else if (this.aW >= 2) {
        this.bw = 0;
        this.aW = (byte)(this.aW + 1);
        if (this.aW == 5) {
          this.aW = 100;
          af();
          return;
        } 
      } 
      if (this.aW == 100)
        this.aB = 100; 
    } 
    if (this.aB == 100) {
      goto();
      this.c = -91;
    } 
  }
  
  void af() {
    goto();
    this.aP = 0;
    if (this.bb == 0) {
      char(1);
      this.bb = 1;
    } else if (this.bp.do[16] == 100) {
      byte();
      bo();
    } else {
      this.bb = 0;
      this.bK = 0;
      for (byte b5 = 0; b5 < 6; b5++) {
        if(this.else, b5, 1);
        if(this.bT, b5, 1);
      } 
      I();
    } 
  }
  
  void at() {
    this.B[0] = null;
    this.B[0] = else((this.F[this.bL]).do[16]);
  }
  
  void ap() { this.B[0] = else(this.aG.do[16]); }
  
  void char() { this.B[1] = else(this.bp.do[16]); }
  
  Image else(int paramInt) { return this.Y.a("/mon/" + paramInt + ".png"); }
  
  void s(int paramInt) {
    this.B[0] = null;
    this.B[0] = this.Y.a("/mon/" + paramInt + ".png");
  }
  
  public void N() {
    if (this.ar[2] == null) {
      Image image = g(8);
      this.ar[2] = e.a(image, 0, 80, 16, 16, 0);
      image = null;
    } 
  }
  
  public void aP() { this.K = this.Y.a(8, "sail"); }
  
  public void G() { this.s = this.Y.a(7, "magicdoor"); }
  
  public void n() {
    this.K = null;
    this.s = null;
  }
  
  public void a(byte paramByte, int paramInt) {
    this.ba += this.bq;
    this.a9 += this.bg - this.bi;
    if (null != this.ar[2])
      if ((paramByte & true) == 0) {
        this.int.drawImage(this.ar[2], this.ba, this.a9, 20);
      } else {
        this.new;
        if(this.ar[2], this.ba, this.a9, 20, 90);
      }  
    this.bg = (byte)(this.bg + paramInt);
  }
  
  public void h() {
    byte b5 = 0;
    for (byte b6 = 0; b6 < this.ah.length; b6++) {
      if ((this.bL << 1 | this.bM) == b6) {
        this.int.setColor(this.aS[2]);
        b5 = 1;
      } else {
        b5 = 2;
        this.int.setColor(this.aS[3]);
      } 
      this.int.drawImage(this.aK[b5], 112 + b6 % 2 * 60 - 4, 'þ' + b6 / 2 * 32 - '\004', 20);
      this.int.drawString(this.ah[b6], 112 + b6 % 2 * 60 + 4, 'þ' + b6 / 2 * 32 + '\002', 20);
    } 
  }
  
  void g() {
    this.c = -80;
    this.bM = 0;
    this.bL = 0;
    this.bR = 0;
    if (this.b4 != -1) {
      this.bL = this.b4;
      this.bR = this.ag;
    } 
    this.aB = 0;
    this.void = 5;
    this.ah = new String[(this.F[0]).do[0]];
    for (byte b5 = 0; b5 < this.ah.length; b5++)
      this.ah[b5] = if((this.F[0]).do[b5 * 2 + 1]); 
  }
  
  private void do(String paramString, int paramInt) {
    int[] arrayOfInt = { 2234536, 16777215, 10443007, 14597631 };
    a(-10, 0, 260, 22, 8, 8, arrayOfInt);
    this.int.setColor(arrayOfInt[0]);
    if (paramString.length() > 11) {
      this.ba -= 4;
      if (this.ba < -19 * (paramString.length() - 4))
        this.ba = 120; 
      this.int;
      this.int;
      this.int.drawString(paramString, this.ba, paramInt + 6 >> 1, 0x4 | 0x10);
    } else {
      this.int;
      this.int;
      this.int.drawString(paramString, 120, paramInt + 6 >> 1, true | 0x10);
    } 
  }
  
  public void M() {
    do(this.aQ[(this.F[0]).do[1 + this.bL * 2]], 0);
    char c1 = 'Č';
    this.aw = (this.F[0]).do[0];
    for (byte b5 = this.bR; b5 < ((this.bR + 2 < (this.F[0]).do[0]) ? (this.bR + 2) : (this.F[0]).do[0]); b5++) {
      if (b5 == this.bL) {
        int[] arrayOfInt = { 2234536, 16777215, 10443007, 14597631 };
        a(12, c1 - '\004' - '\020' + '\002', 168, 24, 2, 2, arrayOfInt);
        this.int.setColor(16777215);
      } else {
        int[] arrayOfInt = { 2234536, 16777215, 10443007, 7419587 };
        a(12, c1 - '\004' - '\020' + '\002', 168, 24, 2, 2, arrayOfInt);
        this.int.setColor(14597631);
      } 
      this.int;
      this.int;
      this.int.drawString(this.ah[b5], 16, c1 + '\002', 0x4 | 0x40);
      this.a8 = (this.F[0]).do[1 + b5 * 2];
      this.int;
      this.int;
      this.int.drawString(this.bc[94] + this.S[this.T[this.a8][2]] + this.bc[95], 95, c1 + '\002', 0x4 | 0x40);
      this.int;
      this.int;
      this.int.drawString("" + (this.F[0]).do[b5 * 2 + 2] + this.bc[93] + this.T[this.a8][1], 170, c1 + '\002', 0x8 | 0x40);
      void(2);
      if ((this.l & 0x10) != 0)
        if(this.aC[33], 212, 254, 20, e.try[1]); 
      if ((this.l & true) != 0)
        if(this.aC[33], 212, 295, 20, e.try[3]); 
      c1 += '\036';
    } 
  }
  
  void byte() {
    this.aL = 0;
    this.bd = new d[5];
    this.bp = null;
    this.B[1] = null;
    this.B[0] = null;
    this.aU = 0;
    this.x = null;
    this.aK = null;
    this.V = null;
    this.a6 = null;
    this.bn = null;
  }
  
  void aN() {
    this.ad = a();
    this.bn = new Image[75];
    for (byte b5 = 0; b5 < this.ad.length; b5++) {
      if (this.bn[this.ad[b5]] == null)
        this.bn[this.ad[b5]] = this.Y.a("/magic/" + this.ad[b5] + ".png"); 
    } 
  }
  
  void ao() {
    if (this.aK == null)
      this.aK = this.Y.a(5, "battle"); 
  }
  
  public void au() {
    ai();
    N();
    p(0);
    p(1);
  }
  
  byte goto(int paramInt) {
    byte b5 = (this.F[paramInt]).do[16];
    if (a(paramInt) != null) {
      if(this.bc[23] + this.bc[42] + a(b5), 0);
      return 1;
    } 
    if(this.bc[96] + this.bc[54] + this.bc[42], 0);
    return -1;
  }
  
  d a(int paramInt) {
    d d1 = null;
    if (this.bC > 1) {
      if ((this.F[paramInt]).do[13] != -1)
        byte((this.F[paramInt]).do[13], 1); 
      d1 = this.F[paramInt];
      this.F[paramInt] = null;
      for (int i1 = paramInt; i1 < this.bC - 1; i1++)
        this.F[i1] = this.F[i1 + 1]; 
      this.bC = (byte)(this.bC - 1);
      return d1;
    } 
    return null;
  }
  
  void do(d paramd) {
    paramd.int = paramd.for;
    paramd.if = new byte[6][3];
    for (byte b5 = 0; b5 < paramd.do[0]; b5++)
      paramd.do[2 + 2 * b5] = this.T[paramd.do[1 + 2 * b5]][1]; 
  }
  
  void for(d paramd) {
    paramd.int = paramd.for;
    paramd.if = new byte[6][3];
  }
  
  void aT() {
    for (byte b5 = 0; b5 < this.bC; b5++) {
      (this.F[b5]).int = (this.F[b5]).for;
      do(this.F[b5]);
    } 
    this.bV.a4 = 1;
    if(this.bc[15] + this.bc[42] + this.bc[90] + this.bc[16], 0);
  }
  
  byte for(int paramInt1, int paramInt2, int paramInt3) {
    byte b5 = -1;
    for (byte b6 = 0; b6 < this.bC; b6++) {
      if ((this.F[b6]).do[16] == paramInt1 && (this.F[b6]).do[11] >= paramInt2 && (this.F[b6]).do[30] >= paramInt3)
        return (byte)b6; 
    } 
    return b5;
  }
  
  byte goto(int paramInt1, int paramInt2) {
    this.bp = new d(this, paramInt1, paramInt2);
    if (this.j == this.aR && this.bC == 5) {
      if(this.bc[43] + this.bc[42] + this.bc[44], 0);
      return -1;
    } 
    this.bp.if();
    bc();
    if(this.bc[25] + this.bc[42] + a((byte)paramInt1), 0);
    return 1;
  }
  
  void bc() {
    if (this.bC < 5) {
      this.F[this.bC] = this.bp;
      (this.F[this.bC]).do[12] = this.bC;
      this.bC = (byte)(this.bC + 1);
      this.a3[this.bp.do[16]] = 1;
    } else if (this.j < this.aR) {
      do(this.bp);
      a(this.bc[57] + this.bc[44] + a(this.bp.do[16]) + this.bc[130] + this.bc[82], 10, 246);
      this.aq[this.j] = this.bp;
      this.j = (byte)(this.j + 1);
      this.a3[this.bp.do[16]] = 1;
    } 
  }
  
  boolean m(int paramInt) {
    if (paramInt >= 10 && paramInt < 22) {
      this.W = 1;
    } else if (paramInt < 10 || (paramInt >= 33 && paramInt <= 36)) {
      this.W = 0;
    } else {
      this.W = 2;
    } 
    if (paramInt == 40 || paramInt == 41 || paramInt == 39 || paramInt == 15) {
      this.W = 2;
    } else if (paramInt == 38) {
      this.W = 0;
    } 
    for (byte b5 = 0; b5 < this.aZ[this.W]; b5 = (byte)(b5 + true)) {
      if (this.b0[this.W][b5][0] == paramInt) {
        this.w = b5;
        return true;
      } 
    } 
    this.w = -1;
    return false;
  }
  
  byte n(int paramInt) {
    for (byte b5 = 0; b5 < this.bC; b5 = (byte)(b5 + 1)) {
      if ((this.F[b5]).do[13] == paramInt)
        return b5; 
    } 
    return -1;
  }
  
  byte for(int paramInt) {
    if (paramInt >= 0) {
      this.bt += paramInt * 100;
      if(this.bc[25] + this.bc[98] + (paramInt * 100), 0);
    } else {
      this.bt += paramInt * 10;
      if(this.bc[23] + this.bc[98] + (-paramInt * 10), 0);
    } 
    return 1;
  }
  
  boolean do(int paramInt) { return (this.bt >= paramInt * 10); }
  
  byte case(int paramInt1, int paramInt2) {
    if (paramInt1 == 42) {
      this.bt += paramInt2 * 100;
      if(this.bc[25] + this.bc[98] + (paramInt2 * 100), 0);
      return 1;
    } 
    if (byte(paramInt1, paramInt2) == 1) {
      if(this.bc[25] + c((byte)paramInt1) + paramInt2 + this.bc[101], 0);
      return 1;
    } 
    if(this.bc[30] + this.bc[32] + this.bc[44], 0);
    return -1;
  }
  
  byte byte(int paramInt1, int paramInt2) {
    m(paramInt1);
    if (this.w != -1) {
      this.b0[this.W][this.w][1] = (byte)(this.b0[this.W][this.w][1] + paramInt2);
      if (this.b0[this.W][this.w][1] > 99) {
        this.b0[this.W][this.w][1] = 99;
        if(this.bc[30] + this.bc[44], 1);
        return -1;
      } 
    } else {
      this.b0[this.W][this.aZ[this.W]][0] = (byte)paramInt1;
      this.b0[this.W][this.aZ[this.W]][1] = (byte)paramInt2;
      this.aZ[this.W] = (byte)(this.aZ[this.W] + 1);
    } 
    return 1;
  }
  
  public boolean try(int paramInt1, int paramInt2) {
    if (m(paramInt1)) {
      if (this.b0[this.W][this.w][1] <= paramInt2);
      return true;
    } 
    return false;
  }
  
  void do(int paramInt1, int paramInt2) {
    m(paramInt1);
    if (this.w != -1) {
      if (this.b0[this.W][this.w][1] >= paramInt2)
        this.b0[this.W][this.w][1] = (byte)(this.b0[this.W][this.w][1] - paramInt2); 
      if (this.b0[this.W][this.w][1] == 0)
        am(); 
    } 
  }
  
  void try(int paramInt) {
    if ((this.F[this.bP]).do[13] != -1) {
      if(a((this.F[this.bP]).do[16]) + this.bc[63] + c((this.F[this.bP]).do[13]) + this.bc[97] + this.bc[36] + c(this.b0[this.W][this.w][0]), 1);
      byte((this.F[this.bP]).do[13], 1);
      else((this.F[this.bP]).do[13], -1);
    } else {
      if(a((this.F[this.bP]).do[16]) + this.bc[36] + c(this.b0[this.W][this.w][0]), 1);
    } 
    (this.F[this.bP]).do[13] = (byte)paramInt;
    do(paramInt, 1);
    else(paramInt, 1);
  }
  
  void else(int paramInt1, int paramInt2) {
    if (paramInt1 >= 16 && paramInt1 <= 21)
      this.F[this.bP].if((paramInt1 - 16 + 1) * paramInt2); 
  }
  
  void am() {
    for (byte b5 = this.w; b5 < this.aZ[this.W] - 1; b5++)
      this.b0[this.W][b5] = this.b0[this.W][b5 + 1]; 
    this.b0[this.W][this.aZ[this.W] - 1] = new byte[2];
    this.aZ[this.W] = (byte)(this.aZ[this.W] - 1);
  }
  
  void do(String paramString) {
    this.ap = 35;
    this.c = 16;
    this.d = 3;
    if(paramString, 1);
    this.bP = 0;
  }
  
  void F() {
    if (this.bm == 1) {
      this.ap = -70;
      this.bK = 16;
    } else {
      this.ap = 25;
      this.bR = this.aO;
    } 
    this.c = 16;
    if("对" + a((this.F[this.bP]).do[16]) + this.bc[1] + c(this.b0[this.W][this.w][0]), 1);
    do(this.b0[this.W][this.w][0], 1);
    this.bP = 0;
  }
  
  void j(int paramInt) {
    if ((this.F[this.bP]).int < (this.F[this.bP]).for && (this.F[this.bP]).int > -120) {
      if(paramInt, this.F[this.bP]);
      do(6, 210, (this.F[this.bP]).int + 120, (this.F[this.bP]).for + 120, 70);
      F();
    } else if ((this.F[this.bP]).int == -120) {
      do(a((this.F[this.bP]).do[16]) + this.bc[7] + this.bc[90] + this.bc[1] + this.bc[24]);
    } else {
      do(a((this.F[this.bP]).do[16]) + this.bc[1] + this.bc[24]);
    } 
  }
  
  void i(int paramInt) {
    if ((this.F[this.bP]).int == -120) {
      do(a((this.F[this.bP]).do[16]) + this.bc[7] + this.bc[90] + this.bc[1] + this.bc[24]);
    } else if ((this.F[this.bP]).do[30] < (this.F[this.bP]).do[29]) {
      a(paramInt, this.F[this.bP]);
      if(this.F);
      F();
    } else {
      do(a((this.F[this.bP]).do[16]) + this.bc[1] + this.bc[24]);
    } 
  }
  
  void ba() {
    byte b5;
    switch (this.b0[this.W][this.w][0]) {
      case 2:
        j(100);
        break;
      case 0:
        j(20);
        break;
      case 1:
        j(60);
        break;
      case 8:
        F();
        for (b5 = 0; b5 < (this.F[this.bL]).do[0]; b5++)
          (this.F[this.bL]).do[b5 * 2 + 2] = this.T[(this.F[this.bL]).do[1 + 2 * b5]][1]; 
        break;
      case 4:
        if ((this.F[this.bP]).if == null) {
          (this.F[this.bP]).if = new byte[6][3];
          for (b5 = 0; b5 < 6; b5++)
            (this.F[this.bP]).if[b5][0] = 0; 
        } 
        for (b5 = 0; b5 < 5; b5++) {
          if ((this.F[this.bP]).if[b5][0] < 0) {
            (this.F[this.bP]).if[b5][0] = 0;
            (this.F[this.bP]).if[b5][1] = 0;
            (this.F[this.bP]).if[b5][2] = 0;
            F();
          } else {
            do(a((this.F[this.bP]).do[16]) + this.bc[1] + this.bc[24]);
          } 
        } 
        break;
      case 3:
        i(20);
        break;
      case 33:
        F();
        this.F[this.bP].if(1);
        break;
      case 35:
        F();
        this.F[this.bP].if(3);
        break;
      case 34:
        F();
        this.F[this.bP].a(5);
        break;
      case 36:
        F();
        this.F[this.bP].a(10);
        break;
      case 9:
        j(9999);
        break;
      case 37:
        this.aF = (byte)(this.aF + 1);
        break;
      case 38:
        if ((this.F[this.bP]).int == -120) {
          do(this.F[this.bP]);
          F();
          break;
        } 
        do(a((this.F[this.bP]).do[16]) + this.bc[1] + this.bc[24]);
        break;
    } 
  }
  
  void k() {
    this.bL = 0;
    this.bM = 0;
    this.bR = 0;
    this.bK = 0;
    this.bm = 0;
    this.bV.aU = 0;
    this.bV.e = 15;
    this.A = 0;
    System.gc();
    this.c = -30;
    aI();
  }
  
  void J() {
    this.c = -22;
    this.p = 3;
    this.A = 1;
    this.bg = -3;
    this.ba = 190 - this.ar[2].getWidth() / 2;
    this.a9 = 10;
    this.bq = 0;
    this.bg = 5;
    this.aB = 0;
  }
  
  void C() {
    this.c = -60;
    for (byte b5 = 0; b5 < this.bC; b5 = (byte)(b5 + true)) {
      if ((this.F[b5]).int > -120) {
        a(this.F[0], this.F[b5]);
        this.aL = 0;
        this.X[0] = 1;
        this.X[1] = b5;
        break;
      } 
    } 
    a(this.bc[5] + this.bc[91] + a((this.F[0]).do[16]), 10, 246);
    this.p = 3;
    this.A = 1;
    this.bq = 4;
    this.bg = -6;
    this.ba = -10;
    this.a9 = 80;
    this.aB = 0;
  }
  
  void a4() {
    this.aB = 0;
    try();
    this.c = -40;
    if (this.bJ == 1) {
      a(this.bc[12] + this.bc[91] + this.bc[13] + a(this.bp.do[16]) + this.bc[14], 10, 246);
    } else {
      a(this.bc[40] + this.bc[1] + a(this.bp.do[16]), 10, 246);
    } 
    this.int;
    this.int;
    this.int.drawImage(this.Y.N[0], 6, 314, 0x4 | 0x20);
  }
  
  void char(int paramInt) {
    if (paramInt == 0) {
      aL();
      if (this.bK == 0) {
        if ((this.F[0]).a >= this.bp.a) {
          this.bK = 16;
        } else {
          this.bK = 32;
        } 
      } else {
        if ((this.bK & 0x20) == 32) {
          this.B[1] = null;
          this.A = 1;
          I();
        } 
        return;
      } 
    } else if (this.bK == 16) {
      aL();
      this.bK = 32;
    } else {
      this.bK = 16;
    } 
    if (this.bK == 16) {
      this.a8 = (this.F[0]).do[this.bL * 2 + 1];
      this.else = this.F[0];
      this.bT = this.bp;
      this.aU = -1;
    } else {
      this.else = this.bp;
      this.bT = this.F[0];
      this.a8 = this.as;
      this.aU = 1;
    } 
    byte b5;
    for (b5 = 0; b5 < this.else.if.length; b5++) {
      if (this.else.if[b5][0] < 0) {
        this.c = -93;
        break;
      } 
      this.c = -85;
    } 
    if (this.else.if[5][0] > 0)
      this.c = -93; 
    for (b5 = 0; b5 < 6; b5++)
      if(this.else, b5, 0); 
    this.aB = 0;
  }
  
  void b() {
    char c1 = Character.MIN_VALUE;
    char c2 = Character.MIN_VALUE;
    if (this.aU == 1) {
      c1 = '¾';
      c2 = 'n';
    } else {
      c1 = '>';
      c2 = '³';
    } 
    c1 -= '\b';
    c2 -= '%';
    this.int.drawImage(this.aK[4], c1, c2, 20);
  }
  
  void aL() {
    byte b5 = this.bp.do[0];
    int i1 = r(100);
    byte b6 = -1;
    byte b7;
    for (b7 = 0; b7 < this.ai[b5 + b6].length; b7 = (byte)(b7 + true)) {
      i1 -= this.ai[b5 + b6][b7];
      if (i1 <= 0) {
        this.as = b7;
        break;
      } 
    } 
    this.as = this.bp.do[this.as * 2 + 1];
  }
  
  void u() {
    for (byte b5 = 0; b5 < this.ax; b5++) {
      if (this.bp.do[12] != (this.bd[b5]).do[12] && (this.bd[b5]).int > -120) {
        this.bp = this.bd[b5];
        return;
      } 
    } 
  }
  
  void t() {
    if (this.aB < 50)
      this.aB = (byte)(this.aB + 1); 
  }
  
  void a(String paramString, int paramInt1, int paramInt2) {
    if (null == this.bV || (this.c > -15 && this.bV.e != 15 && this.bV.e != 8) || this.c == -80 || this.c == 40 || this.c == 88) {
      do(2, paramInt2, 240, 63, 15452159, 10448383, 3473558);
      this.int.setColor(4802889);
    } else {
      if (null == this.x)
        this.x = this.Y.a("/battle/6.png"); 
      this.int;
      this.int;
      this.int.drawImage(this.x, 0, 320, 0x4 | 0x20);
      this.int.setColor(16773328);
    } 
    paramInt2 += 12;
    paramInt1 += 2;
    if (paramString.length() > 11) {
      this.int;
      this.int;
      this.int.drawString(paramString.substring(0, 11), paramInt1, paramInt2 + 16, 0x4 | 0x40);
      this.int;
      this.int;
      this.int.drawString(paramString.substring(11, paramString.length()), paramInt1, paramInt2 + 16 + 22, 0x4 | 0x40);
    } else {
      this.int;
      this.int;
      this.int.drawString(paramString, paramInt1, paramInt2 + 16, 0x4 | 0x40);
    } 
  }
  
  void new(String paramString) {
    this.ba -= 4;
    this.a9 = 296;
    this.int.setColor(29116);
    if (this.ba + this.Y.do.stringWidth(paramString) < 20)
      this.ba = 120; 
    this.int.setClip(20, this.a9, 200, 24);
    this.int.drawString(paramString, this.ba, this.a9, 20);
    this.int.setClip(0, 0, 240, 320);
  }
  
  void q() {
    if (this.bo != null) {
      if (this.d > 0) {
        this.int.setColor(4802889);
        if (this.bo.length() <= 10) {
          int(this.bo);
        } else if (this.d < 9) {
          int(this.bo.substring(0, 10));
        } else {
          int(this.bo.substring(10, this.bo.length()));
        } 
        this.d = (byte)(this.d + 1);
      } 
      if (this.d >= 15) {
        this.d = 0;
        if (this.ap != 0) {
          if (this.ap == 25) {
            this.bR = this.aO;
            this.aO = 0;
            a3();
          } else if (this.ap == -70) {
            this.bK = 16;
            aI();
            I();
          } else {
            this.c = this.ap;
          } 
          this.ap = 0;
        } 
      } 
    } else if (this.R != null) {
      an();
    } 
  }
  
  void ac() {
    this.d = 0;
    String[] arrayOfString = { this.bc[79], this.bc[81] + this.bc[42], this.bc[80], this.bc[1] + this.bc[30], this.bc[139], this.bc[104], this.bc[84] };
    this.Y.if();
    this.bm = 0;
    this.bK = 0;
    this.ah = arrayOfString;
    this.c = 99;
    this.ba = -40;
  }
  
  void f(int paramInt) {
    this.a1 = null;
    this.aI = null;
    this.aN = null;
    this.bL = 0;
    this.bM = 0;
    this.bR = 0;
    this.bK = 0;
    this.bm = 0;
    this.ar[4] = null;
    this.B[0] = null;
    this.B[1] = null;
    this.Y.t = 30;
    if (paramInt != -1)
      this.Y.a(paramInt, false); 
    this.c = -10;
    this.aj = null;
    this.A = 0;
    do();
  }
  
  String c(int paramInt) { return this.av[paramInt]; }
  
  String a(byte paramByte) { return this.am[paramByte]; }
  
  String if(byte paramByte) { return this.by[paramByte]; }
  
  int if(String paramString) {
    byte b5 = -1;
    for (int i1 = 0; i1 < this.by.length; i1++) {
      if (this.by[i1] == paramString) {
        b5 = i1;
        i1 = this.by.length;
      } 
    } 
    return b5;
  }
  
  void a(ByteArrayOutputStream paramByteArrayOutputStream, d paramd) {
    try {
      paramByteArrayOutputStream.write(paramd.do);
      paramByteArrayOutputStream.write((byte)(paramd.new & 0xFF));
      paramByteArrayOutputStream.write((byte)(paramd.new >> 8 & 0xFF));
      paramByteArrayOutputStream.write((byte)(paramd.new >> 16 & 0xFF));
      paramByteArrayOutputStream.write(paramd.new >> 24 & 0xFF);
      paramByteArrayOutputStream.write((byte)(paramd.int & 0xFF));
      paramByteArrayOutputStream.write((byte)(paramd.int >> 8 & 0xFF));
      paramByteArrayOutputStream.write((byte)(paramd.for & 0xFF));
      paramByteArrayOutputStream.write((byte)(paramd.for >> 8 & 0xFF));
      paramByteArrayOutputStream.write((byte)(paramd.a & 0xFF));
      paramByteArrayOutputStream.write((byte)(paramd.a >> 8 & 0xFF));
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  void a(ByteArrayInputStream paramByteArrayInputStream, d paramd) {
    paramd.do = new byte[31];
    try {
      paramByteArrayInputStream.read(paramd.do);
      byte[] arrayOfByte = new byte[10];
      paramByteArrayInputStream.read(arrayOfByte);
      paramd.new = (arrayOfByte[3] & 0xFF) << 24 | (arrayOfByte[2] & 0xFF) << 16 | (arrayOfByte[1] & 0xFF) << 8 | arrayOfByte[0] & 0xFF;
      paramd.int = (short)((arrayOfByte[5] & 0xFF) << 8 | arrayOfByte[4] & 0xFF);
      paramd.for = (short)((arrayOfByte[7] & 0xFF) << 8 | arrayOfByte[6] & 0xFF);
      paramd.a = (short)((arrayOfByte[9] & 0xFF) << 8 | arrayOfByte[8] & 0xFF);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  void if(String paramString, int paramInt) {
    this.d = 3;
    if (paramInt == 0) {
      this.R = paramString;
      this.bo = null;
    } else {
      this.R = null;
      this.bo = paramString;
    } 
  }
  
  Image[] if(byte[] paramArrayOfByte, int paramInt1, int paramInt2) {
    Image image = null;
    Image[] arrayOfImage = new Image[paramInt1];
    this.bU = new byte[paramInt1][2];
    byte b5;
    for (b5 = 0; b5 < paramInt1; b5++)
      this.bU[b5][0] = -1; 
    b5 = -1;
    byte[] arrayOfByte = new byte[3];
    for (int i1 = 0; i1 < paramInt1; i1++) {
      arrayOfByte[0] = paramArrayOfByte[paramInt2 + paramInt1 + i1];
      arrayOfByte[1] = paramArrayOfByte[paramInt2 + paramInt1 * 2 + i1];
      arrayOfByte[2] = paramArrayOfByte[paramInt2 + paramInt1 * 3 + i1];
      if (arrayOfByte[0] != b5) {
        image = null;
        image = g(arrayOfByte[0]);
        b5 = arrayOfByte[0];
      } 
      arrayOfImage[i1] = a(image, arrayOfByte[1], 16, 16, arrayOfByte[2]);
      for (int i2 = this.bF.length - 1; i2 >= 0; i2--) {
        if (arrayOfByte[0] == this.bF[i2][0] && arrayOfByte[1] == this.bF[i2][1]) {
          this.bU[i1][0] = this.bF[i2][2];
          this.bU[i1][1] = arrayOfByte[2];
        } 
      } 
    } 
    image = null;
    return arrayOfImage;
  }
  
  void an() {
    if (this.d > 0) {
      a(this.R, 10, 254);
      this.d = (byte)(this.d + 1);
    } 
    if (this.d >= this.bX)
      this.d = 0; 
  }
  
  void al() {
    if (this.aa > 0 && this.c == -10 && this.bS == -1 && this.bY != null) {
      this.int.setColor(10448383);
      this.int.fillRoundRect(0, 0, 95, 22, 6, 6);
      this.int.setColor(15452159);
      this.int.drawRoundRect(1, 1, 94, 20, 6, 6);
      this.int;
      this.int;
      a(6371758, 16776091, this.bY[this.bV.y], 47, 2, true | 0x10);
      this.aa = (byte)(this.aa + 1);
    } 
    if (this.aa >= 25)
      this.aa = 0; 
  }
  
  void d() { this.ar[4] = g(8); }
  
  byte[] b(int paramInt) { return a("2.dat", paramInt); }
  
  Image g(int paramInt) {
    byte[] arrayOfByte = a("pic.dat", paramInt);
    null = null;
    return Image.createImage(arrayOfByte, 0, arrayOfByte.length);
  }
  
  void aa() {
    ab();
    byte[] arrayOfByte = b(1);
    this.if = 0;
    this.bu = char(arrayOfByte);
    this.P = if(arrayOfByte);
    this.by = case(arrayOfByte);
    this.q = char(arrayOfByte);
    this.H = char(arrayOfByte);
    this.am = case(arrayOfByte);
    this.T = char(arrayOfByte);
    this.aH = char(arrayOfByte);
    this.bx = char(arrayOfByte);
    this.C = case(arrayOfByte);
    this.av = case(arrayOfByte);
    this.S = case(arrayOfByte);
    this.bY = case(arrayOfByte);
    this.G = int(arrayOfByte);
    this.bB = for(arrayOfByte);
    this.aT = char(arrayOfByte);
    this.bI = if(arrayOfByte);
    this.z = char(arrayOfByte);
    this.at = int(arrayOfByte);
    this.aQ = case(arrayOfByte);
    this.a0 = byte(arrayOfByte);
    this.bA = try(arrayOfByte);
    this.af = char(arrayOfByte);
    this.au = char(arrayOfByte);
    this.aV = do(arrayOfByte);
    this.a4 = new(arrayOfByte);
    this.t = char(arrayOfByte);
    this.ai = char(arrayOfByte);
    arrayOfByte = null;
  }
  
  void as() {
    this.bu = (byte[][])null;
    this.by = null;
    this.q = (byte[][])null;
    this.H = (byte[][])null;
    this.am = null;
    this.T = (byte[][])null;
    this.aH = (byte[][])null;
    this.bx = (byte[][])null;
    this.C = null;
    this.av = null;
    this.S = null;
    this.bY = null;
    this.G = (String[][])null;
    this.bB = (short[][])null;
    this.aT = (byte[][])null;
    this.bI = (short[][][])null;
    this.at = (String[][])null;
    this.aQ = null;
    this.a0 = (byte[][][][])null;
    this.bA = (byte[][][])null;
    this.af = (byte[][])null;
    this.au = (byte[][])null;
    this.aV = null;
    this.a4 = null;
    this.t = (byte[][])null;
    this.ai = (byte[][])null;
  }
  
  void a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3) {
    int i1 = r(100);
    byte b5 = 0;
    if (this.bA[paramInt1].length > 4)
      if (m(29)) {
        if (r(100) < 85) {
          b5 = 0;
        } else {
          b5 = 1;
        } 
      } else if (r(100) < 90) {
        b5 = 0;
      } else {
        b5 = 1;
      }  
    byte b6 = 0;
    b6 = b5 * 3 + 1;
    if (b5 == 1)
      this.bV.aU = 1; 
    for (b5 = 0; i1 > this.bA[paramInt1][b6][b5]; b5++);
    paramArrayOfByte[0] = this.bA[paramInt1][b6 + 1][b5];
    paramArrayOfByte[1] = (byte)(this.bA[paramInt1][b6 + 2][b5] + r(3) - 1);
    if (paramArrayOfByte[1] > this.aF)
      paramArrayOfByte[1] = this.aF; 
  }
  
  void for(int paramInt1, int paramInt2) {
    byte[] arrayOfByte = new byte[10];
    byte b5 = 0;
    for (int i1 = paramInt2 * 3; i1 < (paramInt2 + 1) * 3; i1++) {
      boolean bool = false;
      int i2;
      for (i2 = paramInt2 * 3; i2 < i1; i2++) {
        if (this.aH[paramInt1][i1] == this.aH[paramInt1][i2]) {
          bool = true;
          break;
        } 
      } 
      if (!bool)
        for (i2 = 0; i2 < this.T.length; i2++) {
          if (this.aH[paramInt1][i1] == this.T[i2][2] && paramInt2 + 1 == this.T[i2][4]) {
            arrayOfByte[b5] = (byte)i2;
            b5++;
          } 
        }  
    } 
    this.bO = new byte[b5];
    System.arraycopy(arrayOfByte, 0, this.bO, 0, b5);
  }
  
  public void if(d paramd, int paramInt) {
    byte[] arrayOfByte = { 0, 8, 19, 34, 50 };
    if (paramInt == 0) {
      for (byte b5 = 0; b5 < arrayOfByte.length && paramd.do[11] >= arrayOfByte[b5]; b5++) {
        for(paramd.do[16], b5);
        paramd.do[1 + b5 * 2] = this.bO[r(this.bO.length)];
        paramd.do[2 + b5 * 2] = this.T[paramd.do[1 + b5 * 2]][1];
        paramd.do[0] = (byte)(paramd.do[0] + 1);
      } 
    } else {
      byte b5;
      for (b5 = 0; b5 < 5; b5++) {
        if (paramd.do[11] == arrayOfByte[b5]) {
          for(paramd.do[16], b5);
          this.bm = 0;
          return;
        } 
      } 
      for (b5 = 0; b5 < this.bD.length; b5++) {
        if (paramd.do[16] == this.bD[b5][0] && paramd.do[11] == this.bD[b5][1]) {
          this.bm = 2;
          d d1 = new d(this, this.bD[b5][2], this.bD[b5][1]);
          System.arraycopy(d1.do, 16, paramd.do, 16, 14);
          this.a3[this.bD[b5][2]] = 1;
          break;
        } 
      } 
    } 
  }
  
  public byte[] q(int paramInt) { return this.H[paramInt]; }
  
  public void X() {
    byte[] arrayOfByte = b(3);
    this.if = 0;
    short[][] arrayOfShort = for(arrayOfByte);
    arrayOfByte = null;
    Image image = this.Y.a("/jiemian.png");
    this.aC = a(image, arrayOfShort);
    image = null;
    arrayOfShort = (short[][])null;
    System.gc();
  }
  
  public void bh() {
    this.int;
    this.int;
    this.int.drawImage(this.Y.N[0], 0, 303, 0x4 | 0x10);
  }
  
  public void i() {
    this.int;
    this.int;
    this.int.drawImage(this.Y.N[1], 240, 303, 0x8 | 0x10);
  }
  
  public void a(int paramInt1, Graphics paramGraphics, byte paramByte, int paramInt2, String[] paramArrayOfString) {
    this.new = DirectUtils.getDirectGraphics(paramGraphics);
    if (this.P[paramInt1] == null)
      return; 
    byte b5 = -1;
    byte b6;
    for (b6 = 0; b6 < this.P[paramInt1].length; b6 = (byte)(b6 + 1)) {
      if (this.P[paramInt1][b6][0] >= 0) {
        if (this.P[paramInt1][b6][3] == 0) {
          paramGraphics.drawImage(this.aC[this.P[paramInt1][b6][0]], this.P[paramInt1][b6][1] + 240, this.P[paramInt1][b6][2] + 320, this.do[this.P[paramInt1][b6][3]]);
        } else {
          if(this.aC[this.P[paramInt1][b6][0]], this.P[paramInt1][b6][1] + 240, this.P[paramInt1][b6][2] + 320, this.do[this.P[paramInt1][b6][3]], this.for[this.P[paramInt1][b6][3]]);
        } 
      } else if (this.P[paramInt1][b6][0] == -1) {
        if (b5 == -1)
          b5 = b6; 
        byte b7 = b6 - b5;
        if (b6 - b5 == paramByte) {
          paramGraphics.drawImage(this.aC[paramInt2], this.P[paramInt1][b7][1] + 100, this.P[paramInt1][b7][2] + 100, 20);
          this.new;
          if(this.aC[paramInt2], this.P[paramInt1][b7][1] + 100 + 28, this.P[paramInt1][b7][2] + 100, 20, 8192);
        } 
        paramGraphics.setColor(this.ae[this.P[paramInt1][b6][5]]);
        paramGraphics.drawString(this.ah[b7], this.P[paramInt1][b7][1] + 100 + 33, this.P[paramInt1][b7][2] + 100 + 2, this.P[paramInt1][b6][3]);
      } else if (this.P[paramInt1][b6][0] == -2) {
        if (this.B[false] != null) {
          paramGraphics.drawImage(this.B[0], this.P[paramInt1][b6][1] + 100, this.P[paramInt1][b6][2] + 100, this.P[paramInt1][b6][3]);
          if (this.H[(this.c == 21) ? this.bP : this.aG.do[16]][12] >= 50) {
            if (null == this.a1)
              this.a1 = this.Y.a(5, "shan"); 
            paramGraphics.drawImage(this.a1[(this.aB > 10) ? 0 : (Math.abs(this.aB) % 10 / 2)], this.P[paramInt1][b6][1] + 100 - 24, this.P[paramInt1][b6][2] + 100 - 52, this.P[paramInt1][b6][3]);
            this.aB = (byte)(this.aB + 1);
            if (this.aB > 20)
              this.aB = 0; 
          } 
        } 
      } else if (this.P[paramInt1][b6][0] == -3) {
        b5 = (byte)(b5 + 1);
        paramGraphics.setColor(this.ae[this.P[paramInt1][b6][4]]);
        paramGraphics.drawString(paramArrayOfString[b5], this.P[paramInt1][b6][1] + 100, this.P[paramInt1][b6][2] + 100 + 4, this.P[paramInt1][b6][3]);
      } 
    } 
  }
  
  void try(int paramInt1, int paramInt2, int paramInt3) {
    paramInt1 %= 12;
    byte[][] arrayOfByte = { { 
          31, 31, 33, 33, 31, 31, 32, 32, 32, 32, 
          32, 32 }, { 
          0, 0, 0, 0, 0, 0, 8, 8, 18, 18, 
          8, 8 } };
    this.int;
    this.int;
    this.int.drawImage(this.aC[arrayOfByte[0][paramInt1] - 1], paramInt2, paramInt3 - arrayOfByte[1][paramInt1], 0x20 | true);
  }
  
  void o() {
    aB();
    if (this.b2 == -1) {
      a(11, this.int, (byte)2, 2, null);
      byte b5 = 60;
      byte b6 = 30;
      for (byte b7 = 0; b7 < 6; b7++) {
        byte b8 = this.bM * 6 + b7;
        if (b8 >= 101)
          break; 
        if (b7 == this.bL) {
          a(45, b5 + b6 * b7 - 4, 149, 27, true);
          this.int.setColor(this.aS[4]);
        } else {
          this.int.setColor(this.aS[5]);
        } 
        this.int.drawString("NO." + (b8 + 1), 56, b5 + b7 * b6, 20);
        if (this.a3[b8] == 1) {
          this.int.drawString(this.am[b8], 115, b5 + b7 * b6, 20);
        } else {
          this.int.drawString("???????", 115, b5 + b7 * b6, 20);
        } 
      } 
      for(59, 292, 121, 22);
      new(24, 9);
      this.int.setColor(9066984);
      this.int;
      this.int;
      this.int.drawString((this.bM + 1) + "/" + this.bZ, 120, 314, 0x20 | true);
      bh();
      i();
    } else {
      a(12, this.int, (byte)2, 2, null);
      char c1 = '';
      byte b5 = 68;
      byte b6 = 30;
      this.int.setColor(16777215);
      this.int;
      this.int;
      this.int.drawString(this.am[this.bP], 64, 176, 0x20 | true);
      this.int.drawString("编号：" + (this.bP + 1), c1, b5, 20);
      this.int.drawString("属性：" + this.S[this.H[this.bP][3]], c1, b5 + b6, 20);
      this.int.drawString("发现地点：", c1, b5 + 2 * b6, 20);
      if (this.af[this.bP][0] == -1) {
        this.int.drawString("进化获得", c1 + '\t', b5 + 3 * b6, 20);
      } else if (this.af[this.bP][0] == -2) {
        this.int.drawString("任务获得", c1 + '\t', b5 + 3 * b6, 20);
      } else {
        for (byte b7 = 0; b7 < this.af[this.bP].length; b7++)
          this.int.drawString(this.bY[this.af[this.bP][b7]], c1 + '\t', b5 + (3 + b7) * b6, 20); 
      } 
      i();
    } 
    this.int.setColor(16777215);
    this.int;
    this.int;
    this.int.drawString("怪物图鉴", 120, 14, 0x10 | true);
  }
  
  public void new(int paramInt1, int paramInt2) {
    if (this.bR != -1) {
      this.int;
      this.int;
      this.int.drawImage(this.aC[26], 120 - paramInt1, 320 - paramInt2, 0x20 | 0x8);
    } 
    if (this.bR != 1) {
      this.int;
      this.int;
      this.new;
      if(this.aC[26], 120 + paramInt1, 320 - paramInt2, 0x20 | 0x4, 8192);
    } 
    if (this.bR == -1) {
      this.int;
      this.int;
      this.int.drawImage(this.aC[27], 120 - paramInt1 - 2, 320 - paramInt2, 0x20 | 0x8);
    } else if (this.bR == 1) {
      this.int;
      this.int;
      this.new;
      if(this.aC[27], 120 + paramInt1 + 2, 320 - paramInt2, 0x20 | 0x4, 8192);
    } 
    this.bR = 0;
  }
  
  private void int(int paramInt1, int paramInt2, int paramInt3) {
    if (this.g < 0) {
      this.int;
      this.int;
      this.new;
      this.new;
      if(this.aC[27], paramInt1, paramInt2 + paramInt3 + 1, 0x10 | true, 0x5A | 0x2000);
    } else {
      this.int;
      this.int;
      this.new;
      this.new;
      if(this.aC[26], paramInt1, paramInt2 + paramInt3, 0x10 | true, 0x5A | 0x2000);
    } 
    if (this.g > 0) {
      this.int;
      this.int;
      this.new;
      if(this.aC[27], paramInt1, paramInt2 - paramInt3 - 1, 0x20 | true, 270);
    } else {
      this.int;
      this.int;
      this.new;
      if(this.aC[26], paramInt1, paramInt2 - paramInt3, 0x20 | true, 270);
    } 
    this.g = 0;
  }
  
  void ae() {
    if (this.b2 == -1) {
      if(this.bZ, 6, 17, 1, 0);
      if (this.bM * 6 + this.bL >= 101)
        this.bL = 4; 
      if (this.b == -3) {
        this.bR = -1;
      } else if (this.b == -4) {
        this.bR = 1;
      } 
      if (O()) {
        this.bP = (byte)(this.bM * 6 + this.bL);
        this.B[0] = else(this.bP);
        if (this.a3[this.bP] == 1)
          this.b2 = 1; 
      } else if (this.b == -7) {
        this.aI = null;
        a3();
      } 
    } else if (this.b == -7) {
      this.b2 = -1;
    } 
  }
  
  void j() {
    this.bZ = 17;
    this.b2 = -1;
    this.c = 21;
    this.bL = 0;
    this.bM = 0;
    this.bR = 0;
    this.bP = 0;
  }
  
  void for(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.int.setColor(13683967);
    this.int.fillRect(paramInt1, paramInt2, paramInt3, paramInt4);
    this.int.setColor(12561151);
    this.int.drawRect(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  void W() {
    this.N = (byte)(this.N + 1);
    if (this.N > 80)
      this.N = 0; 
    byte[] arrayOfByte1 = this.aT[this.bS];
    aB();
    byte b5 = 30;
    byte b6 = 73;
    byte[] arrayOfByte2 = { 0, 25, 10, 10, 0 };
    b6 += arrayOfByte2[this.bS];
    this.int.translate(b5, b6);
    this.int.setColor(16777215);
    byte b7;
    for (b7 = 0; b7 < arrayOfByte1.length; b7++) {
      if (this.bB[arrayOfByte1[b7]].length > 0) {
        this.int.setColor(10448383);
        this.int.fillRect(this.bB[arrayOfByte1[b7]][0] - 1, this.bB[arrayOfByte1[b7]][1] - 1, this.bB[arrayOfByte1[b7]][2] - 1 + 3, this.bB[arrayOfByte1[b7]][3] - 1 + 3);
        this.int.setColor(16777215);
        this.int.drawRect(this.bB[arrayOfByte1[b7]][0], this.bB[arrayOfByte1[b7]][1], this.bB[arrayOfByte1[b7]][2] - 1, this.bB[arrayOfByte1[b7]][3] - 1);
      } 
    } 
    this.int.setColor(10448383);
    for (b7 = 0; b7 < this.bI[this.bS].length; b7++) {
      switch (this.bI[this.bS][b7][0]) {
        case 0:
        case 1:
          this.int.setColor(10448383);
          this.int.fillRect(this.bI[this.bS][b7][1] - 3, this.bI[this.bS][b7][2] - 3, 6, 6);
          break;
      } 
    } 
    for (b7 = 0; b7 < this.bI[this.bS].length; b7++) {
      switch (this.bI[this.bS][b7][0]) {
        case 0:
          this.int.setColor(16777215);
          this.int.drawLine(this.bI[this.bS][b7][1] - 3, this.bI[this.bS][b7][2] - 1, this.bI[this.bS][b7][1] - 3, this.bI[this.bS][b7][2] + 1);
          this.int.drawLine(this.bI[this.bS][b7][1] + 3, this.bI[this.bS][b7][2] - 1, this.bI[this.bS][b7][1] + 3, this.bI[this.bS][b7][2] + 1);
          break;
        case 1:
          this.int.setColor(16777215);
          this.int.drawLine(this.bI[this.bS][b7][1] - 1, this.bI[this.bS][b7][2] - 3, this.bI[this.bS][b7][1] + 1, this.bI[this.bS][b7][2] - 3);
          this.int.drawLine(this.bI[this.bS][b7][1] - 1, this.bI[this.bS][b7][2] + 3, this.bI[this.bS][b7][1] + 1, this.bI[this.bS][b7][2] + 3);
          break;
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
          this.int;
          this.int;
          this.int.drawImage(this.aI[this.bI[this.bS][b7][0] - 2], this.bI[this.bS][b7][1], this.bI[this.bS][b7][2], 0x20 | true);
          break;
      } 
    } 
    this.int.translate(-b5, -b6);
    b7 = 22;
    this.int.setColor(14868479);
    this.int.fillRect(0, b7, 240, 22);
    this.int.setColor(10448383);
    this.int.drawRect(-1, b7, 242, 22);
    this.int.setColor(9066984);
    this.ba -= 4;
    int i1 = this.ba;
    byte b8;
    for (b8 = 0; b8 < this.z[this.bS].length; b8++) {
      this.int;
      this.int;
      this.int.drawImage(this.aI[this.z[this.bS][b8]], i1, b7 + 12, 0x4 | 0x2);
      i1 += 22;
      this.int;
      this.int;
      this.int.drawString(this.at[this.bS][b8], i1, b7 + 20, 0x4 | 0x20);
      i1 += this.Y.do.stringWidth(this.at[this.bS][b8]) + 8;
    } 
    if (i1 < 0)
      this.ba = 240; 
    if (this.bS == this.bP) {
      this.int.translate(b5, b6);
      if (this.aO != -1 && this.N % 8 < 4 && this.bB[this.aO].length > 0) {
        this.int;
        this.int;
        this.int.drawImage(this.aI[5], this.bB[this.aO][0] - 6 + this.bM, this.bB[this.aO][1] + 3 + this.bL, 0x20 | 0x4);
      } 
      this.int.translate(-b5, -b6);
    } 
    b8 = 11;
    for(59, 'ŀ' - b8 - '\025', 121, 22);
    new(46, b8 + 4);
    this.int.setColor(9066984);
    this.int;
    this.int;
    this.int.drawString(this.at[5][this.bS], 120, 'ŀ' - b8, 0x20 | true);
    i();
  }
  
  public void k(int paramInt) {
    if (paramInt == -7 || paramInt == 51) {
      this.bS = -1;
      this.bR = 0;
      this.bM = 0;
      this.bL = 0;
      this.bP = 0;
      this.aI = null;
    } else if (paramInt == -3) {
      this.ba = 240;
      this.bR = -1;
      this.bS = (byte)(this.bS - 1);
      if (this.bS < 0)
        this.bS = (byte)(this.aT.length - 1); 
    } else if (paramInt == -4) {
      this.ba = 240;
      this.bR = 1;
      this.bS = (byte)(this.bS + 1);
      if (this.bS > this.aT.length - 1)
        this.bS = 0; 
    } 
  }
  
  void for() {
    this.bP = -1;
    this.bS = -1;
    this.aI = this.Y.a(6, "map");
    byte b5;
    for (b5 = 0; b5 < this.aT.length; b5 = (byte)(b5 + true)) {
      for (byte b6 = 0; b6 < this.aT[b5].length; b6 = (byte)(b6 + true)) {
        if (this.bV.y == this.aT[b5][b6]) {
          this.bS = b5;
          this.aO = this.bV.y;
          this.bM = (byte)(this.bV.if / 16 * this.bB[this.aO][2] / this.bV.a6);
          this.bL = (byte)(this.bV.ba / 16 * this.bB[this.aO][3] / this.bV.al);
          break;
        } 
      } 
    } 
    if (this.bS == -1)
      for (b5 = 0; b5 < this.aT.length; b5 = (byte)(b5 + 1)) {
        for (byte b6 = 0; b6 < this.aT[b5].length; b6 = (byte)(b6 + true)) {
          if (this.bV.p == this.aT[b5][b6]) {
            this.bS = b5;
            this.aO = this.bV.p;
            this.bM = this.bV.X;
            this.bL = this.bV.V;
            break;
          } 
        } 
      }  
    if (this.bS == -1)
      this.bS = 0; 
    this.bP = this.bS;
  }
  
  byte ah() {
    byte b5 = 0;
    for (int i1 = this.a3.length - 1; i1 >= 0; i1--) {
      if (this.a3[i1] == 1)
        b5 = (byte)(b5 + true); 
    } 
    return b5;
  }
  
  static int r(int paramInt) { return f.int(paramInt); }
  
  void m() {
    aB();
    if (this.bR == 0) {
      a(14, this.int, (byte)0, 0, null);
      do(120, (320 - 26 * this.ah.length - 4 >> 1) - 17, 16, 38);
      int(this.aN[0]);
    } else {
      a(15, this.int, (byte)0, 0, null);
      byte b5 = 40;
      int i1 = 185;
      byte b6 = 104;
      char c1 = '';
      char c2 = 'Ñ';
      this.int.setColor(16777215);
      this.int;
      this.int;
      this.int.drawString(this.aN[1], b5, b6, 0x4 | 0x20);
      this.int;
      this.int;
      this.int.drawString(this.aN[2], b5, c2, 0x4 | 0x20);
      if (this.b2 == 0) {
        this.int;
        this.int;
        this.int.drawString(this.aN[3], b5, c1, 0x4 | 0x20);
      } else {
        this.int;
        this.int;
        this.int.drawString(this.aN[4], b5, c1, 0x4 | 0x20);
      } 
      this.int.setColor(16777215);
      this.int;
      this.int;
      this.int.drawString(Integer.toString(this.goto), i1, b6, 0x8 | 0x20);
      this.int;
      this.int;
      this.int.drawString(Integer.toString(this.bt), i1, c2, 0x8 | 0x20);
      c1 -= '\003';
      this.int.fillRoundRect(i1 - (this.az.length - 1) * 10 - 3, c1 - '\020', this.az.length * 10 + 4, 16, 6, 6);
      for (byte b7 = 0; b7 < this.az.length; b7++) {
        if (b7 == this.bM) {
          this.int.setColor(16711680);
        } else {
          this.int.setColor(0);
        } 
        this.int;
        this.int;
        this.int.drawString(Integer.toString(this.az[b7]), i1 - b7 * 10, c1 + '\003', 0x4 | 0x20);
        if (b7 == this.bM)
          int(i1 - b7 * 10 + 3, c1 - '\b', 8); 
      } 
      if (this.b2 == 0) {
        int(this.aN[5]);
      } else {
        int(this.aN[6]);
      } 
    } 
    this.int.setColor(16777215);
    this.int;
    this.int;
    this.int.drawString(this.aN[7], 120, 35, 0x10 | true);
    bh();
    i();
  }
  
  void aD() {
    for (byte b5 = 0; b5 < this.az.length; b5++)
      this.az[b5] = 0; 
  }
  
  void ax() { this.n = (byte)(this.n + 1); }
  
  void aC() {
    if (this.bR == 0) {
      if (O()) {
        this.bR = 1;
        this.bM = 2;
        int i1 = long(this.n);
        if (i1 > 0) {
          this.bt += i1;
          if(this.aN[8] + i1, 0);
          this.n = 0;
        } 
        this.n = 0;
        aD();
      } else if (this.b == -7) {
        this.aI = null;
        this.b2 = -1;
        f(this.Y.W);
      } else if (this.b == -1 || this.b == -2) {
        this.b2 = (byte)(this.b2 ^ true);
      } 
    } else if (this.bR == 1) {
      if (O()) {
        int i1 = 0;
        for (byte b5 = 0; b5 < this.az.length; b5++)
          i1 += if(10, b5) * this.az[b5]; 
        if (this.b2 == 0) {
          if (i1 > this.bt) {
            if(this.aN[9], 1);
          } else {
            this.bt -= i1;
            this.goto += i1;
            aD();
          } 
          if (this.goto >= 20000 && this.bh == 0) {
            this.bh = 1;
            case(37, 1);
            if(this.aN[13], 0);
            int(1000);
          } 
        } else if (i1 > this.goto) {
          if(this.aN[10], 1);
        } else {
          this.bt += i1;
          this.goto -= i1;
          aD();
        } 
      } else if (this.b == -7) {
        this.bR = 0;
      } else if (this.b == -1) {
        this.g = 1;
        this.az[this.bM] = (byte)(this.az[this.bM] + 1);
        if (this.az[this.bM] > 9)
          this.az[this.bM] = 0; 
      } else if (this.b == -2) {
        this.g = -1;
        this.az[this.bM] = (byte)(this.az[this.bM] - 1);
        if (this.az[this.bM] < 0)
          this.az[this.bM] = 9; 
      } else if (this.b == -3) {
        if (this.bM < this.az.length - 1)
          this.bM = (byte)(this.bM + 1); 
      } else if (this.b == -4 && this.bM > 2) {
        this.bM = (byte)(this.bM - 1);
      } 
    } 
  }
  
  void aF() {
    this.c = 22;
    this.b2 = 0;
    this.bR = 0;
    aD();
    this.aN = a("bank");
    this.ah = new String[] { this.aN[11], this.aN[12] };
  }
  
  private void do() {
    if (this.n >= 10 && this.goto > 0) {
      this.n = 0;
      if(this.bc[146] + long(10), 0);
      int(500);
    } 
  }
  
  private int long(int paramInt) { return this.goto * paramInt / 200; }
  
  public static int if(int paramInt1, int paramInt2) {
    int i1 = 1;
    for (byte b5 = 1; b5 <= paramInt2; b5++)
      i1 *= paramInt1; 
    return i1;
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    a(paramInt1, paramInt2, paramInt3, paramInt4, true);
    int i1 = paramInt1 + paramInt3 / 2 - 5;
    this.int.setClip(i1, 0, 10, 320);
    this.int;
    this.int;
    this.int.drawImage(this.aE, i1 - paramInt5 * 10, paramInt2 + paramInt4 / 2 + 8, 0x4 | 0x20);
    this.int.setClip(0, 0, 240, 320);
  }
  
  private void for(String paramString) { a(paramString, 10, 237); }
  
  private void x() {
    this.Y.E = (short)(this.Y.E + 1);
    if (this.Y.E > 10000)
      this.Y.E = 0; 
    byte b5 = 55;
    char c1 = 120 - b5;
    char c2 = 120 + b5;
    char c3 = '¤';
    char c4 = '\017';
    byte b6 = 15;
    char c5 = '';
    aB();
    a(16, this.int, (byte)0, 0, null);
    if (this.bK != 7) {
      a(c1 - c4, c3 - c4, c4 * '\002', b6 * 2, this.U[0]);
      a(c2 - c4, c3 - c4, c4 * '\002', b6 * 2, this.U[1]);
      if (this.b2 != -1)
        for (byte b8 = 0; b8 < 2; b8++) {
          byte b9 = 0;
          if (this.bK == 1) {
            b9 = (this.b2 == b8 && this.Y.E % 6 < 3) ? b8 : (b8 + 2);
          } else if (this.bK == 0) {
            b9 = b8 + 2;
          } else {
            b9 = (this.b2 == b8) ? b8 : (b8 + 2);
          } 
          this.int;
          this.int;
          this.int.drawImage(this.aI[b9], 120, c5 + b8 * 25, 0x2 | true);
        }  
    } 
    this.int.setColor(16777215);
    this.int;
    this.int;
    this.int.drawString(this.aN[14], 120, 36, 0x10 | true);
    byte b7 = 105;
    this.int.setColor(16777215);
    this.int;
    this.int;
    this.int.drawString(this.aN[15], 133, b7, 0x4 | 0x20);
    this.int;
    this.int;
    this.int.drawString(this.aN[16], 38, b7, 0x4 | 0x20);
    this.int.setColor(16776960);
    this.int;
    this.int;
    a(6371758, 16776091, this.bt + "", 97, b7, true | 0x20);
    this.int;
    this.int;
    a(6371758, 16776091, this.U[3] + "", 188, b7, 0x8 | 0x20);
    if (this.bK == 0) {
      if (this.aB > 10) {
        this.U[1] = (byte)(r(9) + 1);
        if ((this.U[0] == 1 || this.U[0] == 9) && r(100) < 50)
          this.U[0] = (byte)(r(7) + 2); 
      } else {
        a(c2 - c4, c3 - c4, c4 * '\002', b6 * 2, 10);
      } 
      a(c1 - c4, c3 - c4, c4 * '\002', b6 * 2, 10);
      if (this.aB >= 14) {
        this.bK = 1;
        this.aB = 0;
        this.b2 = 0;
      } 
      for(this.aN[17]);
    } else if (this.bK == 1) {
      a(c1 - c4, c3 - c4, c4 * '\002', b6 * 2, 10);
      for(this.aN[18]);
      bh();
    } else if (this.bK == 2) {
      this.U[0] = (byte)(r(9) + 1);
      if (this.aB >= 6) {
        if (r(100) < 10)
          if (this.b2 == 0) {
            this.U[0] = (byte)(r(this.U[1]) + 1);
          } else if (this.U[1] != 9) {
            this.U[0] = (byte)(this.U[1] + r(9 - this.U[1]) + 1);
          }  
        this.bK = 3;
        this.aB = 0;
      } 
      bh();
    } else if (this.bK == 3) {
      byte b8 = this.U[0] - this.U[1];
      if (b8 > 0) {
        this.U[2] = 0;
      } else if (b8 < 0) {
        this.U[2] = 1;
      } else {
        this.U[2] = 2;
      } 
      if (this.U[2] == 2 || this.U[2] == this.b2) {
        for(this.aN[19]);
      } else {
        for(this.aN[20] + this.bc[98] + '2' + "。");
        this.bt += 50;
      } 
      if (this.U[2] == 2 || this.U[2] == this.b2) {
        this.U[3] = (byte)(this.U[3] + 1);
        if (this.U[3] >= 12) {
          this.bK = 7;
          this.ah = null;
          this.b2 = -1;
          this.aI = null;
          this.aI = new Image[1];
          this.aI[0] = this.Y.a("/guochang/8.png");
        } else {
          this.bK = 4;
        } 
      } else if (this.bt >= 200) {
        this.bK = 5;
      } else {
        this.bK = 6;
      } 
      this.aB = 0;
      int(2000);
    } else if (this.bK == 4) {
      if (this.U[3] == 1) {
        for(this.aN[22]);
      } else {
        for(this.aN[26] + "“" + c(this.k[this.U[3]]) + "”" + this.aN[27]);
      } 
      bh();
      i();
    } else if (this.bK == 5) {
      for(this.aN[28]);
      bh();
      i();
    } else if (this.bK == 6) {
      for(this.aN[29]);
      bh();
    } else if (this.bK == 7) {
      this.int;
      this.int;
      this.int.drawImage(this.aI[0], 120, 160, true | 0x2);
      for(this.aN[30]);
      bh();
    } 
    this.aB = (byte)(this.aB + 1);
  }
  
  private void new() {
    aV();
    if (this.bK == 1) {
      if (this.b == -2 && this.b2 < this.ah.length - 1) {
        this.b2 = (byte)(this.b2 + 1);
      } else if (this.b == -1 && this.b2 > 0) {
        this.b2 = (byte)(this.b2 - 1);
      } else if (O()) {
        this.aB = 0;
        this.bK = 2;
      } 
    } else if (this.bK == 2) {
      if (O())
        this.aB = 0; 
    } else if (this.bK == 4) {
      this.aB = 0;
      if (O()) {
        bd();
      } else if (this.b == -7) {
        if (this.U[3] >= 2)
          case(this.k[this.U[3]], 1); 
        bl();
      } 
    } else if (this.bK == 5) {
      this.aB = 0;
      if (O()) {
        aJ();
      } else if (this.b == -7) {
        bl();
      } 
    } else if (this.bK == 6 && O()) {
      bl();
    } else if (this.bK == 7 && O()) {
      goto(86, 1);
      bl();
    } 
  }
  
  public void aJ() {
    this.U = new byte[5];
    this.U[3] = 0;
    this.c = 23;
    this.aN = a("bank");
    this.aE = this.Y.a("/num.png");
    this.aI = this.Y.a(4, "bank");
    bd();
    if (this.bt < 200) {
      this.bK = 6;
      this.ah = new String[] { this.aN[25] };
    } else {
      this.bt -= 200;
    } 
  }
  
  private void bl() {
    this.b2 = -1;
    this.U = null;
    f(this.Y.W);
    this.bV.if(this.int);
    this.aE = null;
    this.c = 100;
  }
  
  public void bd() {
    this.bK = 0;
    this.b2 = 0;
    this.aB = 0;
  }
  
  public boolean O() { return (this.b == -6 || this.b == 53 || this.b == -5); }
  
  private void aq() {
    if (this.e == 1) {
      switch (this.b) {
        case 48:
          this.bW = (byte)(this.bW ^ true);
          if (this.bW == 0) {
            if("遇敌模式", 0);
          } else {
            if("不遇敌模式", 0);
          } 
          this.e = 0;
          break;
        case 49:
          this.e = 2;
          break;
        case -1:
          this.e = 7;
          this.aD = 1;
          this.an = 1;
          break;
        case 51:
          this.bV.f();
          this.e = 0;
          break;
        case -3:
          this.e = 5;
          this.aD = 0;
          this.an = 1;
          break;
        case 55:
          this.aD = 1;
          this.an = 1;
          this.e = 4;
          break;
        case 57:
          case(24, 1);
          case(25, 1);
          case(26, 1);
          case(22, 1);
          case(23, 1);
          case(15, 1);
          case(30, 1);
          case(3, 1);
          case(31, 50);
          case(32, 50);
          goto(10, 61);
          this.e = 0;
          break;
        case -4:
          s();
          byte();
          bo();
          this.bV.e = 0;
          this.e = 0;
          break;
        case -2:
          this.e = 0;
          break;
        case 35:
          this.e = 3;
          this.aD = 1;
          this.an = 1;
          break;
        case 53:
          this.aD = this.bV.y;
          this.an = 0;
          this.e = 6;
          break;
      } 
    } else if (this.e == 2) {
      this.aD = a(this.aD, 0, this.bY.length - 1);
      if (O()) {
        this.bV.byte(this.aD, this.an);
        this.e = 0;
      } 
    } else if (this.e == 3) {
      this.aD = a(this.aD, 0, this.am.length - 1);
      this.an = new(this.an, 1, 65);
      if (O()) {
        goto(this.aD, this.an);
        this.bV.e = 0;
        this.e = 0;
      } 
    } else if (this.e == 4) {
      this.aD = a(this.aD, 0, this.am.length - 1);
      this.an = new(this.an, 1, 60);
      if (O()) {
        this.m = new byte[1][2];
        this.m[0][0] = this.aD;
        this.m[0][1] = this.an;
        k();
        aH();
        this.e = 0;
      } 
    } else if (this.e == 5) {
      this.aD = a(this.aD, -1, this.av.length - 1);
      this.an = new(this.an, 1, 60);
      if (O()) {
        if (this.aD == -1)
          this.aD = 42; 
        case(this.aD, this.an);
        this.e = 0;
      } 
    } else if (this.e == 6) {
      this.aD = a(this.aD, 0, this.am.length - 1);
      this.an = new(this.an, 0, 7);
      if (O()) {
        this.bV.aV[this.aD * 2 + 1] = (byte)(this.bV.aV[this.aD * 2 + 1] | 1 << this.an);
        if (this.bV.aR[this.aD] != null && this.bV.aR[this.aD].length > this.an)
          this.bV.aR[this.aD][this.an] = 24224; 
      } 
    } else if (this.e == 7) {
      this.aD = a(this.aD, 0, this.bV.ag.length - 1);
      this.bV.ag[this.aD][2] = new(this.bV.ag[this.aD][2], 0, 4);
      if (O())
        this.e = 0; 
    } 
    aV();
  }
  
  private byte a(int paramInt1, int paramInt2, int paramInt3) {
    if (this.b == -3) {
      if (--paramInt1 < paramInt2)
        paramInt1 = paramInt3; 
    } else if (this.b == -4 && ++paramInt1 > paramInt3) {
      paramInt1 = paramInt2;
    } 
    return (byte)paramInt1;
  }
  
  private byte new(int paramInt1, int paramInt2, int paramInt3) {
    if (this.b == 55) {
      if (--paramInt1 < paramInt2)
        paramInt1 = paramInt3; 
    } else if (this.b == 57 && ++paramInt1 > paramInt3) {
      paramInt1 = paramInt2;
    } 
    return (byte)paramInt1;
  }
  
  private void aM() {
    this.int.setColor(16711680);
    if (this.e == 1) {
      for (byte b5 = 0; b5 < this.Q.length; b5++)
        a(this.Q[b5], 10, 22 + b5 * 22, 20); 
      System.gc();
      a("run_state" + this.c + "M: " + ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024L) + " / " + (Runtime.getRuntime().totalMemory() / 1024L) + "k", 1, 1, 20);
    } else if (this.e == 2) {
      String str = "目标地图<" + this.aD + ">" + this.bY[this.aD];
      this.int;
      this.int;
      a(str, 120, 16, 0x10 | true);
    } else if (this.e == 3) {
      String str = "生成<" + this.aD + ">" + this.am[this.aD] + "<" + this.an + "级>";
      this.int;
      this.int;
      a(str, 120, 16, 0x10 | true);
      this.int;
      this.int;
      a("46选怪79改级", 120, 32, 0x10 | true);
    } else if (this.e == 4) {
      String str = "战斗怪物<" + this.aD + ">" + this.am[this.aD] + "<" + this.an + "级>";
      this.int;
      this.int;
      a(str, 120, 16, 0x10 | true);
    } else if (this.e == 5) {
      String str;
      if (this.aD == -1) {
        str = "moeny  " + this.an + "00";
      } else {
        str = "道具<" + this.aD + ">" + this.av[this.aD] + "<" + this.an + "个>";
      } 
      this.int;
      this.int;
      a(str, 120, 16, 0x10 | true);
    } else if (this.e == 6) {
      String str = "地图<" + this.aD + ">" + this.bY[this.aD];
      this.int;
      this.int;
      a(str, 120, 16, 0x10 | true);
      for (byte b5 = 0; b5 < 8; b5++) {
        byte b6 = ((this.bV.aV[this.aD * 2 + 1] & true << b5) == 0) ? 0 : 1;
        short s1 = 0;
        if (this.bV.aR[this.aD] != null && this.bV.aR[this.aD].length > b5)
          s1 = this.bV.aR[this.aD][b5]; 
        if (this.an == b5) {
          a(b5 + ":" + b6 + "  " + s1, 20, 30 + b5 * 16, 20);
        } else {
          a(b5 + ":" + b6 + "  " + s1, 10, 30 + b5 * 16, 20);
        } 
      } 
    } else if (this.e == 7) {
      String str = "door id<" + this.aD + ">方向无上下左右<" + this.bV.ag[this.aD][2] + ">";
      this.int;
      this.int;
      a(str, 120, 16, 0x10 | true);
    } 
  }
  
  private void a(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    this.int.setColor(6819840);
    this.int.drawString(paramString, paramInt1 - 1, paramInt2 - 1, paramInt3);
    this.int.drawString(paramString, paramInt1 - 1, paramInt2 + 1, paramInt3);
    this.int.drawString(paramString, paramInt1 + 1, paramInt2 - 1, paramInt3);
    this.int.drawString(paramString, paramInt1 + 1, paramInt2 + 1, paramInt3);
    this.int.drawString(paramString, paramInt1 - 1, paramInt2, paramInt3);
    this.int.drawString(paramString, paramInt1, paramInt2 + 1, paramInt3);
    this.int.drawString(paramString, paramInt1 + 1, paramInt2, paramInt3);
    this.int.drawString(paramString, paramInt1, paramInt2 - 1, paramInt3);
    this.int.setColor(14352223);
    this.int.drawString(paramString, paramInt1, paramInt2, paramInt3);
  }
  
  private void a5() {
    a(2, this.int, this.b2, 20, null);
    this.int.setColor(this.M);
    this.int;
    this.int;
    this.int.drawString("短信购买", 120, 36, true | 0x10);
    for (byte b5 = 0; b5 < 3; b5++) {
      a(81, 104 + b5 * 29, (b5 == this.bL), 78);
      if (b5 == this.bL) {
        this.int.setColor(this.aS[0]);
      } else {
        this.int.setColor(this.aS[1]);
      } 
      this.int;
      this.int;
      this.int.drawString(this.bs[b5], 120, 107 + b5 * 29, true | 0x10);
    } 
    new("进入查看详情");
    bh();
    i();
  }
  
  private void aw() {
    aB();
    this.int.setClip(0, 0, 240, 64);
    a(2, this.int, this.b2, 20, null);
    this.int.setClip(0, 0, 240, 320);
    this.int.setColor(this.M);
    if (this.be == -1) {
      a5();
      return;
    } 
    this.int;
    this.int;
    this.int.drawString(this.bs[this.be], 120, 36, true | 0x10);
    byte b5 = 80;
    a(0, b5, 240, this.Y.Q.length * 18 + 8, 15452159, 10448383, 3473558);
    for (byte b6 = 0; b6 < this.Y.Q.length; b6++) {
      this.int;
      this.int;
      this.int.drawString(this.Y.Q[b6].toString(), 120, b5 + 18 * b6 + 4, true | 0x10);
    } 
    switch (this.bj) {
      case 0:
        bh();
        i();
        break;
      case 1:
        for("短信发送中....");
        break;
      case 2:
        for("购买失败！");
        bh();
        i();
        break;
      case 3:
        for("购买成功！");
        int(1000);
        this.bj = 4;
        break;
      case 4:
        for("储存完毕！");
        i();
        break;
    } 
  }
  
  private void K() {
    if (this.be == 0) {
      this.bt += 5000;
      case(1, 5);
      case(38, 1);
      case(39, 1);
    } else if (this.be == 1) {
      this.bE = (byte)(this.bE + 1);
    } else if (this.be == 2) {
      byte(1, 10);
      byte(2, 5);
      byte(3, 5);
      byte(8, 5);
    } else if (this.be == 4) {
      this.bV.aT[4][4] = 3;
      this.bt += 1000;
    } else if (this.be == 3) {
      this.aR = (byte)(this.aR + 5);
      d[] arrayOfd = new d[this.aR];
      for (byte b5 = 0; b5 < this.aR - 5; b5++)
        arrayOfd[b5] = this.aq[b5]; 
      this.aq = arrayOfd;
      byte(3, 5);
    } else if (this.be == 5) {
      aT();
      this.bt += 2000;
    } 
    this.d = 0;
  }
  
  private void ag() {
    if (this.be != -1 && this.bj == 1) {
      this.bj = i.a().a(r(6)) ? 3 : 2;
      if (this.bj == 3) {
        K();
        H();
        bk();
      } 
    } 
  }
  
  private void long() {
    aV();
    if (this.be == -1) {
      if (this.b == -1) {
        this.bL = (byte)Math.max(this.bL = (byte)(this.bL - 1), 0);
      } else if (this.b == -2) {
        this.bL = (byte)Math.min(this.bL = (byte)(this.bL + 1), 2);
      } else if (this.b == -6) {
        l(this.bL);
      } else if (this.b == -7) {
        f(this.Y.W);
        this.ah = null;
      } 
    } else if (this.b == -6 && (this.bj == 0 || this.bj == 2)) {
      switch (this.be) {
        case 0:
        case 2:
        case 4:
        case 5:
          this.bj = 1;
          break;
        case 1:
          if (this.bE >= 4) {
            if("已经达到上限！", 0);
            break;
          } 
          this.bj = 1;
          break;
        case 3:
          if (this.aR >= 60) {
            if("已经达到上限！", 0);
            break;
          } 
          this.bj = 1;
          break;
      } 
    } else if (this.bj == 4 && this.b == -7) {
      this.bj = 0;
      switch (this.be) {
        case 0:
        case 1:
        case 2:
          this.be = -1;
          break;
        case 3:
          bi();
          break;
        case 4:
        case 5:
          f(this.Y.W);
          this.bV.e = 0;
          break;
      } 
    } else if (this.b == -7) {
      this.bj = 0;
      switch (this.be) {
        case 0:
        case 1:
        case 2:
          this.be = -1;
          break;
        case 3:
          bi();
          break;
        case 4:
          f(this.Y.W);
          break;
        case 5:
          Y();
          break;
      } 
    } 
  }
  
  void H() {
    String[] arrayOfString = { "您只需发送短信（0元/条，不含通信费）就能立刻获得5000金，还能获得价值1000金的超值道具噢！立刻购买吧！zhangxuhui提醒：该游戏已破解，可以放心购买，不会发送收费短信，祝您玩得愉快！", "您只需发送短信（0元/条，不含通信费）就能立刻让你战斗获得的经验增加一倍（最高4倍），练级时间大大缩短，永久有效！zhangxuhui提醒：该游戏已破解，可以放心购买，不会发送收费短信，祝您玩得愉快！您当前是" + this.bE + "倍经验。", "您只需发送短信（0元/条，不含通信费）就能获得价值5000金的道具大礼包（包括精灵之实，精灵祝福，紫晶石，玛娜果），让您立刻摆脱野外无药可用的尴尬处境。zhangxuhui提醒：该游戏已破解，可以放心购买，不会发送收费短信，祝您玩得愉快！", "您只需发送短信（0元/条，不含通信费）就能使电脑中的宠物存放位置增加5个（上限为60），另外还赠送价值1500金的宠物最爱的紫晶石！zhangxuhui提醒：该游戏已破解，可以放心购买，不会发送收费短信，祝您玩得愉快！当前的宠物存放位置为" + this.aR + "个。", "您已经通过了主线剧情的4%，您只需发送短信（0元/条，不含通信费）就能一次性的将之后的地图以及迷宫完全打开，充分享受宠物王国2的乐趣。此外，还能免费获得1000金游戏币，要继续游戏么？zhangxuhui提醒：该游戏已破解，可以放心购买，不会发送收费短信，祝您玩得愉快！", "您只需要发送短信（0元/条，不含通信费）就能原地复活，并且恢复您的所有怪物，另外还赠送2000金。接受复活吗？zhangxuhui提醒：该游戏已破解，可以放心购买，不会发送收费短信，祝您玩得愉快！" };
    this.bG = arrayOfString;
    if (this.be >= 0)
      this.Y.a(new String[] { this.bG[this.be] }, 209); 
  }
  
  public void l(int paramInt) {
    this.c = 88;
    this.bj = 0;
    this.be = (byte)paramInt;
    H();
  }
  
  void A() {
    short[] arrayOfShort = { 
        60, 120, 200, 130, 100, 200, 600, 2000, 150, 400, 
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
        0, 0, 0, 0, 0, 0, 0, 150, 300, 0, 
        0, 0, 88, 800, 800, 1600, 1600, 1600, 800, 500, 
        500, 5000 };
    this.aj = new short[arrayOfShort.length];
    for (byte b5 = 0; b5 < arrayOfShort.length; b5++) {
      this.aj[b5] = arrayOfShort[b5];
      if (b5 != 41)
        for (byte b6 = 0; b6 < this.long; b6++)
          this.aj[b5] = (short)(this.aj[b5] * this.ay / 100);  
    } 
  }
  
  public void o(int paramInt) {
    if (O()) {
      do(39, 1);
      aT();
      f(this.Y.W);
      this.ah = null;
      this.bV.e = 0;
    } else if (paramInt == -7) {
      Y();
    } 
  }
  
  public void aj() {
    if (this.bt < 500 && this.bV.y == 33)
      if(this.case, 0); 
  }
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/h.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */