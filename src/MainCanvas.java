import com.nokia.mid.sound.Sound;
import com.nokia.mid.ui.FullCanvas;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class MainCanvas extends FullCanvas implements Runnable {
  int error;
  
  String errorString = "";
  
  Graphics g;
  
  DirectGraphics dg;
  
  Font font = Font.getFont(0, 0, 8);
  
  static Random random = new Random();
  
  Image image_logo;
  
  MM game;
  
  GameRun gameRun;
  
  public int game_state;
  
  private int menu_state;
  
  boolean quitGame = false;
  
  public static boolean keyRepeat;
  
  public static boolean key_press;
  
  public static int key;
  
  Sound[] snd_music;
  
  public boolean sound_play = false;
  
  int loop_s;
  
  int logo_c = 0;
  
  byte page = 0;
  
  byte PAGE_MAX = 0;
  
  CwaSound cwaSound;
  
  byte musicId = 1;
  
  boolean sound_on = false;
  
  private byte fisrt_paint;
  
  Image[] imgYesNo = new Image[2];
  
  int sleep_time;
  
  byte gc = 0;
  
  short battle_c = 9;
  
  String strTemp = "";
  
  byte temp_state = 0;
  
  String[] tempAction_str;
  
  StringBuffer[] dialog;
  
  int load_c = -1;
  
  Image image_logo_word;
  
  Image[] imgCwaLogo;
  
  Image[][] imageMenu;
  
  byte menu_c = 0;
  
  byte[] miji = new byte[3];
  
  final byte[] MIJIINIT = { 49, 49, 57 };
  
  boolean zuobi = false;
  
  public MainCanvas(MM paramMM) {
    this.game = paramMM;
    this.gameRun = new GameRun(this);
    this.gameRun.getUiImage();
    this.imgYesNo[0] = this.gameRun.uiImage[16];
    this.imgYesNo[1] = this.gameRun.uiImage[17];
    this.gameRun.uiImage = null;
    this.gameRun.data_init();
    game_init();
    System.gc();
  }
  
  private final void game_init() { this.cwaSound = new CwaSound(); }
  
  public final void game_start() { (new Thread(this)).start(); }
  
  public final void game_stop() {
    if (this.gameRun != null && this.gameRun.rms != null)
      this.gameRun.rmsOptions(0, null, 4); 
    if (null != this.cwaSound)
      soundStop(); 
  }
  
  public final void run() {
    long l1 = 0L;
    long l2 = 0L;
    try {
      while (!this.quitGame) {
        byte b;
        l1 = System.currentTimeMillis();
        if (this.sound_on && null != this.cwaSound)
          this.cwaSound.soundPlay(this.sound_play); 
        switch (this.game_state) {
          case 30:
            this.gameRun.gameRun_run();
            break;
          case 10:
            createFengmianImage();
            this.gameRun.keyRelease();
            this.gameRun.goMAIN_MENU2();
            goMain_menu();
            break;
          case 61:
            for (b = 0; b <= 4; b = (byte)(b + 1))
              doPaint(b); 
            this.gameRun.mapP;
            Map.screenTemp = null;
            System.gc();
            doPaint(5);
            this.gameRun.goMAIN_MENU2();
            for (b = 6; b <= 9; b = (byte)(b + 1))
              doPaint(b); 
            System.gc();
            for (b = 10; b <= 13; b = (byte)(b + 1))
              doPaint(b); 
            for (b = 14; b <= 17; b = (byte)(b + 1))
              doPaint(b); 
            System.gc();
            for (b = 18; b <= 27; b = (byte)(b + 1))
              doPaint(b); 
            createFengmianImage();
            goMain_menu();
            break;
        } 
        paint();
        if (keyRepeat || key_press)
          keyProcess(); 
        key_press = false;
        this.gc = (byte)(this.gc + 1);
        if (this.gc > 40) {
          this.gc = 0;
          System.gc();
        } 
        l2 = System.currentTimeMillis() - l1;
        if (this.sleep_time > 0) {
          Thread.sleep(this.sleep_time);
          this.sleep_time = 0;
          continue;
        } 
        if (l2 < 80L)
          Thread.sleep(80L - l2 + 10L); 
      } 
    } catch (Exception exception) {
      this.game_state = 9999;
      this.errorString = "r" + exception.toString();
      exception.printStackTrace();
      paint();
      while (key != 48);
    } 
    if (this.quitGame || key == 48)
      this.game.destroyApp(true); 
  }
  
  void goMain_menu() {
    setMusic(3, false);
    this.game_state = 60;
    this.menu_state = 0;
    this.fisrt_paint = 0;
    this.battle_c = 0;
  }
  
  void doPaint(int paramInt) {
    this.battle_c = (short)(byte)paramInt;
    paint();
  }
  
  public void createFengmianImage() {
    if (this.image_logo == null)
      this.image_logo = createImage("/fengmian.png"); 
  }
  
  public void paint() {
    repaint();
    serviceRepaints();
  }
  
  void drawScreen(int paramInt) {
    this.g.setColor(paramInt);
    this.g.fillRect(0, 0, 176, 208);
  }
  
  protected final void paint(Graphics paramGraphics) {
    this.g = paramGraphics;
    this.dg = DirectUtils.getDirectGraphics(paramGraphics);
    paramGraphics.setFont(this.font);
    try {
      char c;
      switch (this.game_state) {
        case 30:
          this.gameRun.gameRun_paint(paramGraphics);
          break;
        case 0:
          paintMobileLogo();
          break;
        case 21:
          this.gameRun.blueBg();
          this.gameRun.drawUI(13, paramGraphics, (byte)1, 1, null);
          paramGraphics.setColor(16773120);
          paramGraphics.drawString("小提示:", 19, 35, 20);
          paramGraphics.setColor(16777215);
          if (this.dialog != null)
            for (byte b = 0; b < this.dialog.length; b++)
              paramGraphics.drawString(this.dialog[b].toString(), 19, 54 + b * 18, 20);  
          this.gameRun.drawLoad(15, 188, this.battle_c, 27, 11731197, 11731197, 141);
          this.gameRun.jumpjump(this.battle_c, 15 + 141 * this.battle_c / 27, 188);
          break;
        case 61:
          this.gameRun.blueBg();
          this.gameRun.drawLoad(15, 188, this.battle_c, 27, 11731197, 11731197, 141);
          this.gameRun.jumpjump(this.battle_c, 15 + 141 * this.battle_c / 27, 188);
          break;
        case 12:
          drawScreen(0);
        case 20:
          if (this.gameRun.popMenustate >= 0) {
            this.gameRun.g = paramGraphics;
            paramGraphics.translate(0, -20);
            this.gameRun.showString(this.strTemp, 8, 170);
            paramGraphics.translate(0, 20);
            this.gameRun.queding();
            this.gameRun.quxiao();
          } 
          break;
        case 60:
          switch (this.menu_state) {
            case 0:
              c = '®';
              paramGraphics.drawImage(this.image_logo, 0, 0, 20);
              paramGraphics.setColor(16504);
              this.battle_c = (short)(this.battle_c + 1);
              if (this.battle_c < 6) {
                drawMenu(176 - this.battle_c * 176 / 2 / 6 + 10, c);
                break;
              } 
              drawMenu(88, c);
              break;
            case 3:
              if (this.fisrt_paint == 0) {
                this.fisrt_paint = 1;
                this.gameRun.drawRichText(0, -1, 176, 209, 15452159, 10448383, 3473558);
                paramGraphics.setColor(4802889);
                paramGraphics;
                paramGraphics;
                paramGraphics.drawString("游戏帮助", 88, 5, true | 0x10);
                drawHelp(paramGraphics);
                this.gameRun.quxiao();
              } 
              break;
            case 4:
              if (this.fisrt_paint == 0) {
                this.fisrt_paint = 1;
                this.gameRun.drawRichText(0, -1, 176, 213, 15452159, 10448383, 3473558);
                paramGraphics.setColor(4802889);
                drawHelp(paramGraphics);
                this.gameRun.quxiao();
              } 
              break;
          } 
          break;
        case 9999:
          paramGraphics.setColor(16711680);
          paramGraphics.drawString(this.game_state + " " + this.error + ":" + this.errorString, 0, 20, 20);
          paramGraphics.drawString(this.errorString, -128, 40, 20);
          paramGraphics.drawString(this.errorString, -256, 60, 20);
          paramGraphics.drawString("   " + this.gameRun.run_state, 0, 80, 20);
          break;
      } 
    } catch (Exception exception) {
      paramGraphics.setClip(0, 0, 176, 208);
      paramGraphics.setColor(0);
      exception.printStackTrace();
      paramGraphics.drawString(exception.toString() + this.error + "game" + this.game_state, 20, 120, 20);
      while (key != 49);
      this.quitGame = true;
    } 
  }
  
  private void drawHelp(Graphics paramGraphics) {
    this.PAGE_MAX = (byte)((this.dialog.length % 9 == 0) ? (this.dialog.length / 9) : (this.dialog.length / 9 + 1));
    byte b1 = 23;
    byte b = (byte)(9 * this.page);
    for (byte b2 = b; b2 < this.dialog.length && b2 != b + 9; b2++) {
      paramGraphics.drawString(this.dialog[b2].toString(), 16, b1 + (b2 - b) * 18, 20);
      if (this.dialog.length > 9) {
        paramGraphics;
        paramGraphics;
        paramGraphics.drawString((this.page + 1) + "/" + this.PAGE_MAX, 88, 206, true | 0x20);
      } 
    } 
  }
  
  protected void hideNotify() {
    keyRepeat = false;
    this.gameRun;
    if (this.game_state == 30 && this.gameRun.run_state != 88 && this.gameRun.run_state != 98) {
      String[] arrayOfString = { "游戏暂停" };
      this.tempAction_str = this.gameRun.action_str;
      this.gameRun.action_str = arrayOfString;
      this.temp_state = this.gameRun.run_state;
      this.gameRun.run_state = 98;
    } 
    if (this.sound_on)
      this.cwaSound.soundStop(); 
  }
  
  protected void showNotify() {
    if (this.game_state != 30) {
      this.fisrt_paint = 0;
      if (this.sound_on)
        setMusic(this.cwaSound.musicID, false); 
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
    } else if (paramInt == -11) {
      paramInt = -7;
    } 
    this;
    key = paramInt;
    keyRepeat = true;
    saveKeyCode(paramInt);
  }
  
  void keyOption() {
    if (this.sound_play) {
      this.sound_play = false;
      soundStop();
    } else {
      this.sound_play = true;
      if (this.game_state != 30)
        setMusic(3, false); 
    } 
  }
  
  void goFlash() {
    setMusic(3, false);
    this.game_state = 10;
  }
  
  private final void keyProcess() {
    switch (this.game_state) {
      case 13:
        if (key == -6)
          this.game_state = 10; 
        break;
      case 12:
        if (key == -6 || key == -5 || key == 53) {
          this.sound_play = true;
          goFlash();
        } else if (key == -7) {
          this.sound_play = false;
          goFlash();
        } 
        this.gameRun.keyRelease();
        break;
      case 30:
        this.gameRun.key(key);
        break;
      case 20:
        if (key == -6 || key == -5 || key == 53) {
          goLoading();
          this.gameRun.start();
          break;
        } 
        if (key == -7)
          goMain_menu(); 
        break;
      case 60:
        switch (this.menu_state) {
          case 0:
            this.gameRun.keyRelease();
            if (key == -6 || key == 53 || key == -5) {
              String[] arrayOfString;
              switch (this.gameRun.select_stateX) {
                case 1:
                  soundStop();
                  this.game_state = 20;
                  arrayOfString = new String[] { this.gameRun.text[113], this.gameRun.text[112] };
                  this.strTemp = this.gameRun.text[86] + this.gameRun.text[108] + this.gameRun.text[90] + this.gameRun.text[109] + this.gameRun.text[88];
                  this.gameRun.action_str = arrayOfString;
                  this.gameRun.popMenustate = 0;
                  paint();
                  break;
                case 0:
                  soundStop();
                  goLoading();
                  this.gameRun.mapP = null;
                  this.gameRun.continue_game();
                  break;
                case 2:
                  keyOption();
                  break;
                case 3:
                  this.menu_state = 3;
                  this.gameRun.getHELP_dialog();
                  this.page = 0;
                  this.logo_c = 0;
                  this.fisrt_paint = 0;
                  break;
                case 4:
                  this.fisrt_paint = 0;
                  this.logo_c = 0;
                  this.page = 0;
                  this.menu_state = this.gameRun.select_stateX;
                  this.gameRun.getAbout_dialog();
                  break;
                case 5:
                  this.quitGame = true;
                  break;
                case 6:
                  this.game.wap();
                  break;
              } 
              break;
            } 
            if (this.menu_c == 0) {
              this.gameRun.key = key;
              this.gameRun.select_state(this.gameRun.action_str.length, 0, 16, 1, 0);
              if (key == -3) {
                this.menu_c = -6;
              } else if (key == -4) {
                this.menu_c = 6;
              } 
            } 
            this.battle_c = 10;
            break;
          case 3:
            if (key == -7) {
              goMain_menu();
              this.dialog = null;
            } 
            keyHelp();
            this.gameRun.keyRelease();
            break;
          case 4:
            if (key == -7)
              goMain_menu(); 
            keyHelp();
            this.gameRun.keyRelease();
            break;
        } 
        break;
    } 
  }
  
  private void keyHelp() {
    if (key == -1 || key == -3) {
      this.page = (byte)(this.page - 1);
      if (this.page < 0)
        this.page = (byte)(this.PAGE_MAX - 1); 
      this.fisrt_paint = 0;
    } else if (key == -2 || key == -4) {
      this.page = (byte)(this.page + 1);
      if (this.page >= this.PAGE_MAX)
        this.page = 0; 
      this.fisrt_paint = 0;
    } 
  }
  
  public void goLoading() {
    this.image_logo = null;
    this.imageMenu = (Image[][])null;
    this.battle_c = 0;
    this.game_state = 21;
    String[] arrayOfString = this.gameRun.loadText("tips");
    byte b = (byte)getRandom(arrayOfString.length);
    this.dialog = groupString(arrayOfString[b], 144);
    arrayOfString = null;
    this.gameRun.popMenustate = -1;
    this.gameRun.getUiImage();
    paint();
  }
  
  protected final void keyReleased(int paramInt) { keyRepeat = false; }
  
  public Image createImage(String paramString) {
    try {
      return Image.createImage(paramString);
    } catch (Exception exception) {
      exception.printStackTrace();
      return null;
    } 
  }
  
  public Image[] createImageArray(int paramInt, String paramString) { return createImageArrayStream(paramInt, paramString); }
  
  public Image[] createImageArrayStream(int paramInt, String paramString) {
    Image[] arrayOfImage = new Image[paramInt];
    try {
      DataInputStream dataInputStream = new DataInputStream(getClass().getResourceAsStream("/" + paramString + ".dat"));
      dataInputStream.readByte();
      byte[] arrayOfByte = null;
      byte b;
      for (b = 0; b < paramInt; b = (byte)(b + true)) {
        arrayOfByte = new byte[dataInputStream.readShort()];
        dataInputStream.read(arrayOfByte);
        arrayOfImage[b] = Image.createImage(arrayOfByte, 0, arrayOfByte.length);
        arrayOfByte = null;
      } 
      dataInputStream.close();
      dataInputStream = null;
    } catch (IOException iOException) {}
    return arrayOfImage;
  }
  
  public void drawRectBG() {
    this.dg = DirectUtils.getDirectGraphics(this.g);
    drawScreen(7135485);
    int[] arrayOfInt1 = { 0, 8, 16, 8 };
    int[] arrayOfInt2 = { 8, 0, 8, 16 };
    for (byte b = 0; b < 11; b++) {
      for (byte b1 = 0; b1 < 13; b1++) {
        this.g.translate(b1 * 16, b * 16);
        this.dg.fillPolygon(arrayOfInt1, 0, arrayOfInt2, 0, 4, -10763287);
        this.g.translate(b1 * -16, b * -16);
      } 
    } 
  }
  
  Sound createMusic(String paramString, int paramInt) {
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
  
  void soundStop(int paramInt) {
    if (paramInt >= 0 && paramInt < this.snd_music.length && this.snd_music[paramInt] != null)
      this.snd_music[paramInt].stop(); 
  }
  
  static int getRandom(int paramInt) { return (random.nextInt() & 0x7FFFFFFF) % paramInt; }
  
  protected void paintMobileLogo() {
    if (this.load_c < 0) {
      this.load_c = 0;
    } else {
      if (this.load_c >= 0 && this.load_c < 10) {
        drawScreen(16777215);
        if (this.load_c == 0) {
          this.gameRun.g = this.g;
          this.image_logo = createImage("/logo.png");
        } 
        this.g;
        this.g;
        this.g.drawImage(this.image_logo, 88, 104, true | 0x2);
      } else if (this.load_c >= 10 && this.load_c < 22) {
        if (this.load_c == 10)
          this.image_logo = null; 
        paintCWALogo(20);
      } else if (this.load_c == 22) {
        this.gameRun.g = this.g;
        this.imgCwaLogo = null;
        this.image_logo = null;
        this.gameRun.popMenustate = 0;
        this.game_state = 12;
        this.strTemp = "是否开始音乐?";
      } 
      this.load_c++;
    } 
    this.g.setClip(0, 0, 176, 208);
  }
  
  protected void paintCWALogo(int paramInt) {
    if (null == this.imgCwaLogo)
      this.imgCwaLogo = createImageArray(1, "logo"); 
    drawScreen(16777215);
    this.g;
    this.g;
    this.g.drawImage(this.imgCwaLogo[0], 88, 104, true | 0x2);
  }
  
  void setMusic(int paramInt, boolean paramBoolean) { this.sound_on = this.cwaSound.setMusic(paramInt, paramBoolean); }
  
  void soundStop() { this.sound_on = this.cwaSound.soundStop(); }
  
  private void drawMenu(int paramInt1, int paramInt2) {
    int i = this.imageMenu[0][this.gameRun.select_stateX].getWidth() / 2 + 8 + this.battle_c % 6 / 2;
    if (this.menu_c < -4) {
      this.g;
      this.g;
      this.g.drawImage(this.imageMenu[1][1], paramInt1 - i - 2, paramInt2, 0x8 | 0x2);
    } else {
      this.g;
      this.g;
      this.g.drawImage(this.imageMenu[1][0], paramInt1 - i, paramInt2, 0x8 | 0x2);
    } 
    if (this.menu_c > 4) {
      this.g;
      this.g;
      this.dg;
      this.dg.drawImage(this.imageMenu[1][1], paramInt1 + i + 2, paramInt2, 0x4 | 0x2, 4);
    } else {
      this.g;
      this.g;
      this.dg;
      this.dg.drawImage(this.imageMenu[1][0], paramInt1 + i, paramInt2, 0x4 | 0x2, 4);
    } 
    i += 2;
    this.g.setClip(paramInt1 - i, 0, i * 2, 208);
    int j = this.imageMenu[0][this.gameRun.select_stateX].getWidth() + 30;
    int k = this.imageMenu[0].length;
    paramInt1 += j * this.menu_c / 6;
    if (this.menu_c > 0) {
      this.menu_c = (byte)(this.menu_c - 1);
    } else if (this.menu_c < 0) {
      this.menu_c = (byte)(this.menu_c + 1);
    } 
    for (int m = -1; m <= 1; m++) {
      this.g;
      this.g;
      this.g.drawImage(this.imageMenu[0][(this.gameRun.select_stateX + k + m) % k], paramInt1 + j * m, paramInt2, true | 0x2);
      if (this.gameRun.select_stateX + m == 2)
        if (this.sound_play) {
          this.g;
          this.g;
          this.g.drawImage(this.imageMenu[1][2], paramInt1 + j * m + 10, paramInt2, 0x4 | 0x2);
        } else {
          this.g;
          this.g;
          this.g.drawImage(this.imageMenu[1][3], paramInt1 + j * m + 10, paramInt2, 0x4 | 0x2);
        }  
    } 
    this.g.setClip(0, 0, 176, 208);
  }
  
  public StringBuffer[] groupString(String paramString, int paramInt) {
    StringBuffer[] arrayOfStringBuffer1 = new StringBuffer[50];
    StringBuffer stringBuffer1 = new StringBuffer();
    StringBuffer stringBuffer2 = new StringBuffer();
    StringBuffer stringBuffer3 = new StringBuffer(paramString);
    int i = paramString.length();
    byte b = -1;
    boolean bool = false;
    for (byte b1 = 0; b1 < i; b1++) {
      stringBuffer1.append(stringBuffer3.charAt(0));
      if (this.font.stringWidth(stringBuffer1.toString()) <= paramInt) {
        stringBuffer2.append(stringBuffer3.charAt(0));
        stringBuffer3.deleteCharAt(0);
      } else {
        b1--;
        stringBuffer1 = new StringBuffer();
        bool = true;
        b++;
      } 
      if (b1 == i - 1 && !bool) {
        bool = true;
        b++;
      } 
      if (bool) {
        bool = false;
        arrayOfStringBuffer1[b] = stringBuffer2;
        stringBuffer2 = new StringBuffer();
      } 
    } 
    StringBuffer[] arrayOfStringBuffer2 = new StringBuffer[b + 1];
    System.arraycopy(arrayOfStringBuffer1, 0, arrayOfStringBuffer2, 0, b + 1);
    return arrayOfStringBuffer2;
  }
  
  public void getDialogs(String[] paramArrayOfString, int paramInt) {
    StringBuffer[] arrayOfStringBuffer = new StringBuffer[60];
    int i = 0;
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      StringBuffer[] arrayOfStringBuffer1 = groupString(paramArrayOfString[b], paramInt);
      System.arraycopy(arrayOfStringBuffer1, 0, arrayOfStringBuffer, i, arrayOfStringBuffer1.length);
      i += arrayOfStringBuffer1.length;
    } 
    this.dialog = new StringBuffer[i];
    System.arraycopy(arrayOfStringBuffer, 0, this.dialog, 0, i);
  }
  
  private void saveKeyCode(int paramInt) {
    if (null != this.gameRun && this.gameRun.run_state == 99 && !this.zuobi) {
      int i = 0;
      for (i = this.miji.length - 1; i >= 1; i--)
        this.miji[i] = this.miji[i - 1]; 
      this.miji[0] = (byte)paramInt;
      for (i = this.miji.length - 1; i >= 0; i--) {
        if (this.miji[i] != this.MIJIINIT[i])
          return; 
      } 
      this.zuobi = false;
    } 
  }
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/MainCanvas.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */