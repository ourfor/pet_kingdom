import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class Map {
  static Graphics offG;
  
  static Image screenTemp;
  
  String[] text;
  
  byte faceType = -1;
  
  byte faceTime = -1;
  
  byte faceNpc = -1;
  
  byte boat_show = 1;
  
  Image[][] imageNpc;
  
  Layer bgLayer;
  
  Layer fgLayer;
  
  byte cols;
  
  byte rows;
  
  byte leftCol;
  
  byte topRow;
  
  byte[][] map;
  
  byte[][] frontmap;
  
  static DirectGraphics dg;
  
  static Graphics g;
  
  byte map_key;
  
  int map_x;
  
  int map_y;
  
  short mapLeft_NOmove;
  
  short mapRight_NOmove;
  
  short mapUp_NOmove;
  
  short mapDown_NOmove;
  
  int my_x;
  
  int my_y;
  
  byte iX;
  
  byte iY;
  
  byte my_dir;
  
  byte my_start_image;
  
  byte my_image_no;
  
  byte my_state;
  
  byte my_tempState;
  
  byte my_lastMap;
  
  byte my_lastExit;
  
  byte my_lastX;
  
  byte my_lastY;
  
  byte get_meet;
  
  byte my_x_speed;
  
  byte my_y_speed;
  
  byte change_c;
  
  byte frame_max;
  
  byte frame_num = 4;
  
  byte my_frame_c = 100;
  
  byte[][] frame = { { 1, 0, 2, 0 }, { 1, 0, 1, 0 }, { 1, 0, 2, 0 }, { 0, 0, 0, 0 } };
  
  byte[][] directImage = { { 6, 0, 3, 3 }, { 4, 0, 2, 2 }, { 6, 0, 3, 3 }, { 6, 0, 3, 3 } };
  
  Image[] my_image;
  
  byte imageKind = 0;
  
  byte chuansong = 0;
  
  byte[] mapChange;
  
  byte[] mapInfo;
  
  byte[][] door;
  
  byte[][] item;
  
  byte[][] npc;
  
  byte[][] npc2;
  
  byte mapNo = 0;
  
  byte inShop;
  
  byte notMeet = 0;
  
  byte meet_step;
  
  byte MEET = 30;
  
  byte step_MEET = 4;
  
  byte event_state = 0;
  
  int eventCount;
  
  byte[][] event;
  
  short[] event_now;
  
  short[][] event_now_list;
  
  byte now_eV1;
  
  byte now_eV2;
  
  StringBuffer[] dialog;
  
  byte dialog_no = -1;
  
  byte dialog_control = -1;
  
  byte line_count;
  
  GameRun gameRun;
  
  byte[][] mapTemp = new byte[74][];
  
  Image[] imgFace;
  
  byte mapNotemp = 0;
  
  byte go = -2;
  
  byte[][] music;
  
  byte[] catchNum;
  
  byte[] huizhang;
  
  String[] chenghao;
  
  String[] guli;
  
  byte eventGoing;
  
  String npcName;
  
  byte ifirst = 0;
  
  byte ifelse = -1;
  
  byte popSave = -1;
  
  MMPPartical mmp;
  
  GigRain gr;
  
  int mmpTime = -1000;
  
  short mapc = -1;
  
  String[] battleSay;
  
  byte npcfram = 0;
  
  byte xiaoshiTime = 4;
  
  byte[] facedata = { 
      0, 1, 1, 2, 2, 3, 2, 2, 1, 1, 
      0 };
  
  int ccc = 4;
  
  byte[][] magicdoor = { 
      { 0, 0 }, { 1, 0 }, { 0, 0 }, { 1, 0 }, { 0, 0 }, { 2, 0 }, { 3, -1 }, { 4, -1 }, { 5, -3 }, { 6, -1 }, 
      { 6, -1 }, { 4, -1 } };
  
  byte firstDrawMap = 0;
  
  int map_left = 0;
  
  int map_top = 0;
  
  int map_right = 0;
  
  int map_bottom = 0;
  
  int rightCol = 0;
  
  int bottomRow = 0;
  
  byte guochang = 0;
  
  Image[] imageGuochang;
  
  private int tempNpcX;
  
  private int tempNpcY;
  
  boolean keyEnable = true;
  
  byte[][][] dir_select = { { { 0, 0 }, { 0, -4 }, { 0, 4 }, { -4, 0 }, { 4, 0 } }, { { 0, 0 }, { 0, -8 }, { 0, 8 }, { -8, 0 }, { 8, 0 } }, { { 0, 0 }, { 0, -4 }, { 0, 4 }, { -4, 0 }, { 4, 0 } }, { { 0, 0 }, { 0, -4 }, { 0, 4 }, { -4, 0 }, { 4, 0 } } };
  
  byte yudaoJingying;
  
  byte roadType = 0;
  
  byte firec = 0;
  
  Image[] imageFish;
  
  short[] fishA = { -1, -2, -2, 1, 0 };
  
  byte[][] fishdata;
  
  byte[][] fishdata2;
  
  Image[] imageRabbit;
  
  short[] rabbitA = null;
  
  byte[] rabbitFrame = { 0, 4, 2, 0, 0 };
  
  byte[][] rabbitOffset = { { 0, 0, 0, -2, 2 }, { 0, -2, 2, 0, 0 } };
  
  byte[][] rabbitPos;
  
  Image[] imageFire;
  
  byte[][] fire;
  
  Vector vfire;
  
  byte flashTimes = -1;
  
  public void initScreenTemp() {
    screenTemp = Image.createImage(192, 224);
    offG = screenTemp.getGraphics();
  }
  
  public void setTempNull() {
    this.mapTemp = (byte[][])null;
    this.mapTemp = new byte[74][];
  }
  
  public void notMeet(int paramInt1, int paramInt2) {
    if (paramInt1 == 0) {
      this.step_MEET = (byte)(getRandom(19) + 1);
      this.meet_step = (byte)((this.step_MEET - 10) * (this.step_MEET - 10));
      if (this.meet_step == 0)
        this.meet_step = 10; 
      if (this.meet_step > getRandom(120))
        this.step_MEET = (byte)(12 + getRandom(9) - getRandom(9)); 
      this.meet_step = 0;
      if (this.imageKind == 1)
        this.step_MEET = (byte)(this.step_MEET + 15); 
      this.meet_step = 0;
    } else if (paramInt1 == 1) {
      this.notMeet = 1;
      this.step_MEET = (byte)(this.MEET * (paramInt2 - 27 + 2));
      this.meet_step = 0;
    } 
  }
  
  public void mapdataInit() {
    byte[] arrayOfByte = this.gameRun.createData(4);
    this.gameRun.skip = 0;
    this.fishdata = this.gameRun.create2Array(arrayOfByte);
    this.fishdata2 = this.gameRun.create2Array(arrayOfByte);
    this.rabbitPos = this.gameRun.create2Array(arrayOfByte);
    this.music = this.gameRun.create2Array(arrayOfByte);
    this.battleSay = this.gameRun.createStringArray(arrayOfByte);
    this.catchNum = this.gameRun.createArray(arrayOfByte);
    this.huizhang = this.gameRun.createArray(arrayOfByte);
    this.chenghao = this.gameRun.createStringArray(arrayOfByte);
    this.guli = this.gameRun.createStringArray(arrayOfByte);
    arrayOfByte = null;
    this.catchNum = new byte[] { 2, 10, 20, 30, 40, 101 };
  }
  
  public Map(GameRun paramGameRun) {
    this.gameRun = paramGameRun;
    this.text = paramGameRun.loadText("map");
    mapdataInit();
    loadGame();
    notMeet(0, 0);
    this.mapInfo = paramGameRun.rmsOptions(8, null, 1);
    this.mapChange = paramGameRun.rmsOptions(1, null, 1);
    createHero(this.imageKind);
    for (byte b = 0; b < this.mapChange.length; b++) {
      if (this.mapChange[b] == 1 && null == this.mapTemp[b])
        this.mapTemp[b] = paramGameRun.rmsOptions(9 + b, null, 1); 
    } 
    createOther();
    createLayer();
    createEvent();
  }
  
  public void createHero(int paramInt) {
    this.imgFace = this.gameRun.maincanvas.createImageArray(7, "face");
    if (paramInt != 1) {
      Image image = this.gameRun.createImage(6);
      this.my_image = new Image[9];
      for (byte b = 0; b < 9; b++)
        this.my_image[b] = this.gameRun.createCellImage(image, b, 16, 17, 0); 
      image = null;
    } else {
      this.my_image = null;
      this.my_image = new Image[6];
      Image image = this.gameRun.createImage(9);
      for (byte b = 0; b < 6; b++) {
        this.gameRun;
        this.my_image[b] = GameRun_Father.createImage(image, this.gameRun.A[b][0], this.gameRun.A[b][1], this.gameRun.A[b][2], this.gameRun.A[b][3], 0);
      } 
    } 
  }
  
  void loadGame() {
    this.gameRun.rmsOptions(2, null, 0);
    byte[] arrayOfByte = this.gameRun.rmsOptions(2, null, 1);
    if (arrayOfByte[0] == -1) {
      byte[] arrayOfByte1 = { 
          0, 6, 4, 2, 6, 1, 2, 0, 0, 0, 
          0, 0, 0, 0, 0, 0, 60, 0, 0, 0, 
          1, 5 };
      arrayOfByte = arrayOfByte1;
      this.gameRun.rmsOptions(2, arrayOfByte1, 2);
      this.event_now_list = new short[76][];
      this.gameRun.rmsOptions(3, getEventNowData(this.event_now_list), 2);
    } else {
      this.event_now_list = readEventNowData();
    } 
    this.mapNo = arrayOfByte[0];
    this.my_x = arrayOfByte[1] * 16;
    this.my_y = arrayOfByte[2] * 16;
    this.my_dir = arrayOfByte[3];
    this.my_start_image = arrayOfByte[4];
    this.my_lastMap = arrayOfByte[5];
    this.my_lastExit = arrayOfByte[6];
    setImageNo();
    this.gameRun.money = (arrayOfByte[10] & 0xFF) << 24 | (arrayOfByte[9] & 0xFF) << 16 | (arrayOfByte[8] & 0xFF) << 8 | arrayOfByte[7] & 0xFF;
    this.gameRun.bankTime = arrayOfByte[11];
    this.gameRun.bankMoney = (arrayOfByte[15] & 0xFF) << 24 | (arrayOfByte[14] & 0xFF) << 16 | (arrayOfByte[13] & 0xFF) << 8 | arrayOfByte[12] & 0xFF;
    this.gameRun.MON_MAX_LV = arrayOfByte[16];
    this.my_lastX = arrayOfByte[17];
    this.my_lastY = arrayOfByte[18];
    this.gameRun.bankItem = arrayOfByte[19];
    this.gameRun.multiExp = arrayOfByte[20];
    this.gameRun.MAX_MONSTERS = arrayOfByte[21];
  }
  
  void map_saveGame() {
    byte[] arrayOfByte = new byte[22];
    arrayOfByte[0] = this.mapNo;
    arrayOfByte[5] = this.my_lastMap;
    arrayOfByte[6] = this.my_lastExit;
    arrayOfByte[1] = (byte)(this.my_x / 16);
    arrayOfByte[2] = (byte)(this.my_y / 16);
    arrayOfByte[3] = this.my_dir;
    arrayOfByte[4] = this.my_start_image;
    arrayOfByte[7] = (byte)(this.gameRun.money & 0xFF);
    arrayOfByte[8] = (byte)(this.gameRun.money >> 8 & 0xFF);
    arrayOfByte[9] = (byte)(this.gameRun.money >> 16 & 0xFF);
    arrayOfByte[10] = (byte)(this.gameRun.money >> 24 & 0xFF);
    arrayOfByte[11] = this.gameRun.bankTime;
    arrayOfByte[12] = (byte)(this.gameRun.bankMoney & 0xFF);
    arrayOfByte[13] = (byte)(this.gameRun.bankMoney >> 8 & 0xFF);
    arrayOfByte[14] = (byte)(this.gameRun.bankMoney >> 16 & 0xFF);
    arrayOfByte[15] = (byte)(this.gameRun.bankMoney >> 24 & 0xFF);
    arrayOfByte[16] = this.gameRun.MON_MAX_LV;
    arrayOfByte[17] = this.my_lastX;
    arrayOfByte[18] = this.my_lastY;
    arrayOfByte[19] = this.gameRun.bankItem;
    arrayOfByte[20] = this.gameRun.multiExp;
    arrayOfByte[21] = this.gameRun.MAX_MONSTERS;
    this.gameRun.rmsOptions(2, arrayOfByte, 2);
  }
  
  void save() {
    map_saveGame();
    saveNpc();
    for (byte b = 0; b < this.mapInfo.length / 2; b++) {
      if (this.mapChange[b] == 1) {
        this.mapChange[b] = 0;
        this.gameRun.rmsOptions(9 + b, this.mapTemp[b], 2);
      } 
    } 
    setTempNull();
    this.gameRun.rmsOptions(8, this.mapInfo, 2);
    this.gameRun.rmsOptions(3, getEventNowData(this.event_now_list), 2);
    this.gameRun.rmsOptions(1, this.mapChange, 2);
  }
  
  void createNpcImage() {
    Image image = this.gameRun.createImage(7);
    this.imageNpc = (Image[][])null;
    this.imageNpc = new Image[3][37];
    byte b;
    for (b = 0; this.npc != null && b < this.npc.length; b++) {
      for (byte b1 = 0; b1 < 3; b1++) {
        if (this.npc[b][2] < 33 && this.imageNpc[b1][this.npc[b][2]] == null)
          this.imageNpc[b1][this.npc[b][2]] = this.gameRun.createCellImage(image, b1 * 11 + this.npc[b][2], 16, 17, 0); 
      } 
    } 
    if (null == this.imageNpc[false][33])
      for (b = 0; b < 3; b++)
        this.imageNpc[b][33] = this.gameRun.maincanvas.createImage("/image/diam" + b + ".png");  
    if (null == this.imageNpc[false][34]) {
      this.imageNpc[2][34] = this.gameRun.maincanvas.createImage("/image/god.png");
      this.imageNpc[1][34] = this.gameRun.maincanvas.createImage("/image/god.png");
      this.imageNpc[0][34] = this.gameRun.maincanvas.createImage("/image/god.png");
    } 
    if (null == this.imageNpc[false][35]) {
      this.imageNpc[0][35] = this.gameRun.maincanvas.createImage("/image/boat2.png");
      this.imageNpc[0][36] = this.gameRun.maincanvas.createImage("/image/boat1.png");
    } 
    image = null;
    initRabbit();
  }
  
  void getFireImage() {
    if (null == this.imageFire) {
      Image image = this.gameRun.createImage(11);
      this.imageFire = new Image[21];
      for (byte b = 0; b < 21; b++)
        this.imageFire[b] = this.gameRun.createCellImage(image, b, 16, 16, 0); 
    } 
  }
  
  void getFishImage() {
    if (null == this.imageFish)
      this.imageFish = this.gameRun.maincanvas.createImageArray(10, "fish"); 
  }
  
  void getRabbitImage() {
    if (null == this.imageRabbit)
      this.imageRabbit = this.gameRun.maincanvas.createImageArray(6, "rabbit"); 
  }
  
  byte[] initData(byte[] paramArrayOfByte, int paramInt) {
    byte b = 1;
    for (byte b2 = 0; b2 < paramInt; b2++) {
      byte b3 = (paramArrayOfByte[b++] & 0xFF) << 8 | paramArrayOfByte[b++] & 0xFF;
      b += b3;
    } 
    byte b1 = (paramArrayOfByte[b++] & 0xFF) << 8 | paramArrayOfByte[b++] & 0xFF;
    byte[] arrayOfByte = new byte[b1];
    System.arraycopy(paramArrayOfByte, b, arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }
  
  void createEvent() {
    createNpcImage();
    byte[] arrayOfByte = this.gameRun.getStream("poke2ev", this.mapNo);
    short s1 = 0;
    if (arrayOfByte.length == 1) {
      this.eventCount = 0;
      return;
    } 
    this.eventCount = arrayOfByte[s1++];
    if (this.mapInfo[this.mapNo * 2] <= 0) {
      this.event_now = new short[this.eventCount];
      this.event_now_list[this.mapNo] = this.event_now;
      this.mapInfo[this.mapNo * 2 + 1] = 0;
    } else {
      for (byte b1 = 0; b1 < this.event_now_list[this.mapNo].length; b1++) {
        if ((this.mapInfo[this.mapNo * 2 + 1] & true << b1) != 0)
          this.event_now_list[this.mapNo][b1] = 24224; 
      } 
      this.event_now = this.event_now_list[this.mapNo];
    } 
    this.event = new byte[this.eventCount][];
    short s2 = 0;
    for (byte b = 0; b < this.eventCount; b++) {
      s2 = (short)(arrayOfByte[s1++] << 8 | arrayOfByte[s1++] & 0xFF);
      if (this.event_now[b] < s2) {
        this.event[b] = new byte[s2];
        System.arraycopy(arrayOfByte, s1, this.event[b], 0, this.event[b].length);
      } 
      s1 += s2;
    } 
  }
  
  void createOther() {
    byte[] arrayOfByte = null;
    this.gameRun.skip = 0;
    boolean bool = false;
    if (this.mapInfo[this.mapNo * 2] <= 0) {
      byte[] arrayOfByte1 = this.gameRun.createData(0);
      arrayOfByte = initData(arrayOfByte1, this.mapNo);
      bool = true;
    } else {
      if (null == this.mapTemp[this.mapNo])
        this.mapTemp[this.mapNo] = this.gameRun.rmsOptions(9 + this.mapNo, null, 1); 
      arrayOfByte = this.mapTemp[this.mapNo];
      bool = false;
    } 
    this.npc = createNpc(arrayOfByte, this.npc);
    if (bool) {
      this.npc2 = new byte[this.npc.length][2];
      for (byte b = 0; b < this.npc2.length; b++)
        this.npc2[b][0] = 7; 
    } else {
      this.npc2 = createNpc(arrayOfByte, this.npc2);
    } 
    this.item = createNpc(arrayOfByte, this.item);
    this.door = createNpc(arrayOfByte, this.door);
  }
  
  byte[][] createNpc(byte[] paramArrayOfByte, byte[][] paramArrayOfByte1) {
    paramArrayOfByte1 = (byte[][])null;
    paramArrayOfByte1 = new byte[paramArrayOfByte[this.gameRun.skip++]][];
    byte b = 0;
    if (this.mapInfo[this.mapNo * 2] > 0)
      b = 100; 
    for (byte b1 = 0; b1 < paramArrayOfByte1.length; b1++) {
      paramArrayOfByte1[b1] = new byte[paramArrayOfByte[this.gameRun.skip++] + b];
      byte b2 = 0;
      while (b2 < paramArrayOfByte1[b1].length) {
        paramArrayOfByte1[b1][b2] = paramArrayOfByte[this.gameRun.skip];
        b2++;
        this.gameRun.skip++;
      } 
    } 
    return paramArrayOfByte1;
  }
  
  void saveNpc() {
    this.mapTemp[this.mapNo] = null;
    this.mapTemp[this.mapNo] = getNpcData();
    this.mapInfo[this.mapNo * 2] = 1;
    this.mapChange[this.mapNo] = 1;
  }
  
  void createLayer() {
    this.bgLayer = null;
    this.fgLayer = null;
    this.bgLayer = new Layer(this);
    this.fgLayer = new Layer(this);
    byte[] arrayOfByte = this.gameRun.getStream("poke2map", this.mapNo);
    System.gc();
    this.gameRun.skip = 0;
    this.cols = arrayOfByte[this.gameRun.skip++];
    this.rows = arrayOfByte[this.gameRun.skip++];
    this.vfire = new Vector();
    this.map = this.bgLayer.createMap(arrayOfByte, this.cols, this.rows);
    getFire(this.map);
    this.frontmap = this.fgLayer.createMap(arrayOfByte, this.cols, this.rows);
    getFire(this.frontmap);
    fireToArray();
    this.map_x = map_set(this.my_x / 16, this.cols, 11, 6, 176, 16);
    this.map_y = map_set(this.my_y / 16, this.rows, 13, 7, 208, 16);
    this.mapLeft_NOmove = 80;
    this.mapRight_NOmove = (short)(this.cols * 16 - 88 - 8);
    this.mapUp_NOmove = 96;
    this.mapDown_NOmove = (short)(this.rows * 16 - 104 - 8);
  }
  
  byte exitMap(byte[][] paramArrayOfByte) {
    byte b = -2;
    if (this.mapNo < this.gameRun.mapdataMap.length && this.gameRun.mapdataMap[this.mapNo].length > 0) {
      this.my_lastX = (byte)(this.my_x / 16 * this.gameRun.mapdataMap[this.mapNo][2] / this.cols);
      this.my_lastY = (byte)(this.my_y / 16 * this.gameRun.mapdataMap[this.mapNo][3] / this.rows);
    } 
    if (paramArrayOfByte[this.get_meet][3] == -1) {
      b = this.mapNo;
      this.mapNo = this.my_lastMap;
      this.my_lastMap = b;
      this.my_lastExit = this.get_meet;
      b = -1;
    } else {
      if (this.mapNo != 71 && this.mapNo != 72 && this.mapNo != 73) {
        this.my_lastMap = this.mapNo;
        this.my_lastExit = this.get_meet;
      } 
      this.mapNo = paramArrayOfByte[this.get_meet][4];
      b = paramArrayOfByte[this.get_meet][3];
    } 
    return b;
  }
  
  void saveMapBak() {
    saveNpc();
    this.mapChange[this.mapNo] = 1;
    this.gameRun.rmsOptions(1, this.mapChange, 2);
  }
  
  void keyRelease() {
    this.gameRun.maincanvas;
    MainCanvas.keyRepeat = false;
  }
  
  void doPaint(int paramInt) {
    if (this.my_state == -77)
      this.ccc++; 
    if (this.my_state == -78)
      return; 
    this.gameRun.battle_c = (byte)paramInt;
    this.gameRun.maincanvas.repaint();
    this.gameRun.maincanvas.serviceRepaints();
  }
  
  void goNextMap() {
    this.mmpTime = -1000;
    this.mapc = -1;
    this.meet_step = 0;
    this.yudaoJingying = 0;
    this.ifirst = 0;
    this.boat_show = 1;
    doPaint(0);
    saveMapBak();
    if (this.go != -2) {
      this.mapNo = this.mapNotemp;
      this.mapNotemp = 0;
    } 
    byte b = this.my_lastExit;
    if (this.go == -2)
      this.go = exitMap(this.door); 
    this.gameRun.setNull();
    this.gameRun.uiData = (byte[][][])null;
    System.gc();
    createOther();
    doPaint(1);
    if (this.go == -1)
      this.go = b; 
    getInMap(this.go, this.door);
    setImageNo();
    createLayer();
    doPaint(6);
    createEvent();
    System.gc();
    this.gameRun.data_init();
    doPaint(8);
    this.inShop = 0;
    this.gameRun.mapNsay_c = 3;
    if (this.door[this.go][5] == 1) {
      this.map_key = this.my_dir;
      doKey();
    } 
    this.my_state = 0;
    this.gameRun.battle_c = 0;
    if (this.imageKind == 2) {
      this.imageNpc[0][35] = this.gameRun.maincanvas.createImage("/image/boat2.png");
      this.imageNpc[0][36] = this.gameRun.maincanvas.createImage("/image/boat1.png");
    } 
    createHero(this.imageKind);
    beginMusic();
    keyRelease();
    this.go = -2;
    this.firstDrawMap = 0;
    this.gameRun.setDriverGifNull();
    this.gameRun.sayNoMoney();
    this.gameRun.rmsOptions(0, null, 4);
  }
  
  public void beginMusic() {
    boolean bool = false;
    for (byte b = 0; b < this.music.length; b = (byte)(b + 2)) {
      for (byte b1 = 0; !bool && b1 < this.music[b].length; b1 = (byte)(b1 + true)) {
        if (this.mapNo == this.music[b][b1]) {
          this.gameRun.maincanvas.musicId = this.music[b + true][getRandom(this.music[b + true].length)];
          bool = true;
          break;
        } 
      } 
    } 
    if (!bool)
      this.gameRun.maincanvas.musicId = (byte)(1 + getRandom(2)); 
    this.gameRun.maincanvas.setMusic(this.gameRun.maincanvas.musicId, true);
  }
  
  void getInMap(byte paramByte, byte[][] paramArrayOfByte) {
    if (paramArrayOfByte[paramByte][2] != 0)
      this.my_dir = (byte)((paramArrayOfByte[paramByte][2] - 1) / 2 * 2 + 1 + paramArrayOfByte[paramByte][2] % 2); 
    this.my_x = paramArrayOfByte[paramByte][0] << 4;
    this.my_y = paramArrayOfByte[paramByte][1] << 4;
  }
  
  int map_set(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    int i;
    if (paramInt2 <= paramInt3) {
      i = paramInt5 - paramInt6 * paramInt2 >> 1;
    } else if (paramInt1 + 1 <= paramInt4) {
      i = 0;
    } else if (paramInt1 >= paramInt2 - paramInt4) {
      i = paramInt5 - paramInt2 * paramInt6;
    } else {
      i = paramInt5 / 2 - paramInt1 * paramInt6 - paramInt6 / 2;
    } 
    return i;
  }
  
  void nextEvent() {
    this.now_eV1 = 0;
    this.now_eV2 = 0;
    this.eventGoing = 0;
    this.event_state = 1;
    this.my_state = 0;
  }
  
  void eventCheck() {
    for (byte b = 0; null != this.event && b < this.event.length; b++) {
      if (null != this.event[b] && this.event_now[b] < this.event[b].length)
        do {
          byte b4;
          short s;
          byte b3;
          byte b2;
          byte[] arrayOfByte;
          byte b1;
          this.event_state = 0;
          if (this.event_now[b] >= this.event[b].length) {
            this.event[b] = null;
            this.mapInfo[this.mapNo * 2 + 1] = (byte)(this.mapInfo[this.mapNo * 2 + 1] | true << b);
            break;
          } 
          switch (this.event[b][this.event_now[b]]) {
            case 20:
              if (this.gameRun.battleWin == 1) {
                this.now_eV1 = this.event[b][this.event_now[b] + 2];
                this.now_eV2 = this.event[b][this.event_now[b] + 3];
                this.mapInfo[this.now_eV1 * 2 + 1] = (byte)(this.mapInfo[this.now_eV1 * 2 + 1] | 1 << this.now_eV2);
                this.event_now_list[this.now_eV1][this.now_eV2] = 24224;
                this.event_now[b] = (short)(this.event_now[b] + (this.event[b][this.event_now[b] + 3] << 1) + 4);
                nextEvent();
                break;
              } 
              if (this.eventGoing == 0) {
                if (this.event[b][this.event_now[b] + 2] == 0) {
                  this.npcName = null;
                } else {
                  this.npcName = this.gameRun.getDialogs(this.npc[this.event[b][this.event_now[b] + 2] - 1], 6, this.npc[this.event[b][this.event_now[b] + 2] - 1][5]);
                  if (this.npcName.equals("路人"))
                    this.npcName = null; 
                } 
                getDialogs(this.gameRun.getDialogs(this.event[b], this.event_now[b] + 4, this.event[b][this.event_now[b] + 3]));
                this.dialog_no = 0;
                this.eventGoing = 1;
                this.my_state = 1;
                break;
              } 
              if (this.my_state == 0) {
                this.event_now[b] = (short)(this.event_now[b] + (this.event[b][this.event_now[b] + 3] << 1) + 4);
                if (this.ifelse == 1)
                  this.event_now[b] = (short)(this.event_now[b] + (this.event[b][this.event_now[b] + 3] << 1) + 4); 
                nextEvent();
              } 
              break;
            case 40:
              if (this.inShop == 0 && this.gameRun.hasMoney(3) && this.my_state != 16) {
                this.my_state = 16;
                String[] arrayOfString = { "回复", "不回复" };
                this.gameRun.action_str = arrayOfString;
                this.gameRun.popMenustate = 0;
                break;
              } 
              if (this.gameRun.say_c == 0 && this.my_state == 0) {
                this.event_now[b] = (short)(this.event_now[b] + 3);
                nextEvent();
                this.gameRun.goBUY_ITEM();
                if (this.inShop == 2)
                  this.inShop = 0; 
              } 
              break;
            case -75:
              this.gameRun.goSms(4);
              this.event_now[b] = (short)(this.event_now[b] + 3);
              nextEvent();
              break;
            case 47:
              this.event_now[b] = 0;
              this.my_state = 0;
              break;
            case 50:
              if (this.gameRun.findMonster(this.event[b][this.event_now[b] + 2], this.event[b][this.event_now[b] + 3], this.event[b][this.event_now[b] + 4]) != -1) {
                this.event_now[b] = (short)(this.event_now[b] + 5);
                nextEvent();
                break;
              } 
              this.event_now[b] = 0;
              this.event_state = 0;
              break;
            case -120:
              if (this.eventGoing == 0) {
                this.now_eV1 = this.gameRun.getMonster(this.event[b][this.event_now[b] + 2], this.event[b][this.event_now[b] + 3]);
                this.eventGoing = 1;
                this.my_state = 11;
                break;
              } 
              if (this.gameRun.say_c == 0) {
                if (this.now_eV1 == 1) {
                  this.event_now[b] = (short)(this.event_now[b] + this.event[b][this.event_now[b] + 1] + 2);
                  nextEvent();
                  break;
                } 
                this.event_now[b] = 0;
                this.my_state = 0;
              } 
              break;
            case -110:
              if (this.eventGoing == 0) {
                this.now_eV2 = this.gameRun.findMonster(this.event[b][this.event_now[b] + 2], this.event[b][this.event_now[b] + 3], this.event[b][this.event_now[b] + 4]);
                this.now_eV1 = this.gameRun.delMonster(this.now_eV2);
                this.eventGoing = 1;
                this.my_state = 11;
                break;
              } 
              if (this.gameRun.say_c == 0) {
                if (this.now_eV1 == 1) {
                  this.event_now[b] = (short)(this.event_now[b] + this.event[b][this.event_now[b] + 1] + 2);
                  nextEvent();
                  break;
                } 
                this.event_now[b] = 0;
                this.my_state = 0;
              } 
              break;
            case -13:
              keyRelease();
              this.gameRun.goVIEW_COMPUTER();
              this.event_now[b] = (short)(this.event_now[b] + 3);
              nextEvent();
              break;
            case -16:
              goGameWin();
              this.mapInfo[this.mapNo * 2 + 1] = (byte)(this.mapInfo[this.mapNo * 2 + 1] | 0x8);
              this.event_now_list[this.mapNo][3] = 24224;
              this.event_now[b] = (short)(this.event_now[b] + 4);
              this.my_state = 1;
              break;
            case -100:
              if (this.my_state == 2 && this.get_meet + 1 == this.event[b][this.event_now[b] + 2]) {
                this.event_now[b] = (short)(this.event_now[b] + 3);
                this.event_state = 1;
              } 
              break;
            case -50:
              this.gameRun.enemy_takens = (byte)(this.event[b][this.event_now[b] + 1] >> 1);
              this.gameRun.enemyList = new byte[this.event[b][this.event_now[b] + 1] >> 1][2];
              this.now_eV2 = 0;
              while (this.now_eV2 < this.event[b][this.event_now[b] + 1] >> 1) {
                this.gameRun.enemyList[this.now_eV2][0] = this.event[b][this.event_now[b] + 2 + this.now_eV2 * 2];
                this.gameRun.enemyList[this.now_eV2][1] = this.event[b][this.event_now[b] + 3 + this.now_eV2 * 2];
                this.now_eV2 = (byte)(this.now_eV2 + 1);
              } 
              this.event_now[b] = (short)(this.event_now[b] + 2 + this.event[b][this.event_now[b] + 1]);
              this.gameRun.matchBattle();
              this.gameRun.maincanvas.setMusic(9, false);
              this.gameRun.goGO_BATTLE();
              break;
            case -40:
              if (this.eventGoing == 0) {
                this.now_eV2 = this.event[b][this.event_now[b] + 1];
                if (this.ifelse == 0) {
                  this.gameRun.action_str = new String[this.now_eV2 - 1];
                } else {
                  this.gameRun.action_str = new String[this.now_eV2];
                } 
                byte b5 = 0;
                for (byte b6 = 0; b6 < this.now_eV2; b6++) {
                  if (this.ifelse != 0 || b6 != 1) {
                    this.gameRun.action_str[b5] = this.gameRun.getDialogs(this.event[b], this.event_now[b] + 2 + this.now_eV1 + 1, this.event[b][this.event_now[b] + 2 + this.now_eV1]);
                    b5++;
                  } 
                  this.now_eV1 = (byte)(this.now_eV1 + (this.event[b][this.event_now[b] + 2 + this.now_eV1] << 1) + 1);
                } 
                this.gameRun.popMenustate = 0;
                this.gameRun.view_state = 0;
                this.eventGoing = 1;
                this.my_state = 11;
                break;
              } 
              if (this.gameRun.view_state == 12) {
                this.now_eV1 = (byte)(this.now_eV1 + 2);
                short s1 = 0;
                if (this.ifelse == 0 && this.gameRun.popMenustate == 1)
                  s1 = 1; 
                this.event_now[b] = (short)(this.event_now[b] + this.now_eV1 + this.now_eV2 + this.event[b][this.event_now[b] + this.now_eV1 + this.gameRun.popMenustate + s1]);
                this.gameRun.popMenustate = -1;
                this.ifelse = -1;
                nextEvent();
                break;
              } 
              if (this.map_key == -7) {
                this.event_now[b] = 0;
                this.gameRun.popMenustate = -1;
                this.ifelse = -1;
                this.my_state = 0;
                nextEvent();
              } 
              break;
            case -39:
              this.event_now[b] = (short)(this.event_now[b] + 2 + this.event[b][this.event_now[b] + 1]);
              nextEvent();
              break;
            case -31:
              if (this.eventGoing == 0) {
                this.now_eV1 = this.gameRun.getMoney(this.event[b][this.event_now[b] + 2]);
                this.eventGoing = 1;
                this.my_state = 11;
                break;
              } 
              if (this.gameRun.say_c == 0) {
                if (this.now_eV1 == 1) {
                  this.event_now[b] = (short)(this.event_now[b] + this.event[b][this.event_now[b] + 1] + 2);
                  nextEvent();
                  break;
                } 
                this.my_state = 0;
                this.event_now[b] = 0;
              } 
              break;
            case -30:
              if (this.eventGoing == 0) {
                this.now_eV1 = this.gameRun.getItem(this.event[b][this.event_now[b] + 2], this.event[b][this.event_now[b] + 3]);
                this.eventGoing = 1;
                this.my_state = 11;
                break;
              } 
              if (this.gameRun.say_c == 0) {
                if (this.now_eV1 == 1) {
                  this.event_now[b] = (short)(this.event_now[b] + this.event[b][this.event_now[b] + 1] + 2);
                  nextEvent();
                  break;
                } 
                this.my_state = 0;
                this.event_now[b] = 0;
              } 
              break;
            case -20:
              this.now_eV1 = this.event[b][this.event_now[b] + 2];
              this.now_eV2 = this.event[b][this.event_now[b] + 3];
              this.mapInfo[this.now_eV1 * 2 + 1] = (byte)(this.mapInfo[this.now_eV1 * 2 + 1] | 1 << this.now_eV2);
              this.event_now_list[this.now_eV1][this.now_eV2] = 24224;
              this.event_now[b] = (short)(this.event_now[b] + 4);
              nextEvent();
              break;
            case 0:
              if (this.eventGoing != 0)
                break; 
              if (this.now_eV1 < this.event[b][this.event_now[b] + 1]) {
                this.my_state = 10;
                if (this.my_frame_c >= this.frame_max) {
                  if (this.now_eV2 < this.event[b][this.event_now[b] + 2 + this.now_eV1 + 1]) {
                    this.now_eV2 = (byte)(this.now_eV2 + 1);
                    this.map_key = this.event[b][this.event_now[b] + 2 + this.now_eV1];
                    doKey();
                    if (this.my_state == 5)
                      this.event_now[b] = (short)(this.event_now[b] + this.event[b][this.event_now[b] + 1] + 2); 
                    break;
                  } 
                  this.now_eV1 = (byte)(this.now_eV1 + 2);
                  this.now_eV2 = 0;
                } 
                break;
              } 
              this.event_now[b] = (short)(this.event_now[b] + this.event[b][this.event_now[b] + 1] + 2);
              nextEvent();
              break;
            case 1:
              if (this.my_x / 16 == this.event[b][this.event_now[b] + 2] && this.my_y / 16 == this.event[b][this.event_now[b] + 3]) {
                if (this.my_frame_c >= this.frame_max) {
                  this.event_now[b] = (short)(this.event_now[b] + 4);
                  nextEvent();
                } 
                break;
              } 
              this.my_state = 10;
              if (this.my_frame_c >= this.frame_max) {
                int i = this.my_x / 16 - this.event[b][this.event_now[b] + 2];
                int j = this.my_y / 16 - this.event[b][this.event_now[b] + 3];
                if (Math.abs(i) > Math.abs(j)) {
                  this.map_key = (i > 0) ? 3 : 4;
                } else {
                  this.map_key = (j > 0) ? 1 : 2;
                } 
                if (this.roadType != 0)
                  if (this.map_key == 3 || this.map_key == 4) {
                    if (j > 0) {
                      this.map_key = 1;
                    } else if (j < 0) {
                      this.map_key = 2;
                    } else if (i > 0) {
                      this.map_key = 3;
                    } else if (i < 0) {
                      this.map_key = 4;
                    } 
                  } else if (i > 0) {
                    this.map_key = 3;
                  } else if (i < 0) {
                    this.map_key = 4;
                  } else if (j > 0) {
                    this.map_key = 1;
                  } else if (j < 0) {
                    this.map_key = 2;
                  }  
                doKey();
              } 
              break;
            case 2:
              if (this.my_dir != this.event[b][this.event_now[b] + 2])
                turnAround(this.event[b][this.event_now[b] + 2]); 
              this.event_now[b] = (short)(this.event_now[b] + 3);
              nextEvent();
              break;
            case 3:
              if (this.gameRun.findItem(this.event[b][this.event_now[b] + 2]) || -1 != this.gameRun.checkMonItem(this.event[b][this.event_now[b] + 2])) {
                this.event_now[b] = (short)(this.event_now[b] + 3);
                nextEvent();
              } 
              break;
            case 5:
              if ((this.mapInfo[this.event[b][this.event_now[b] + 2] * 2 + 1] & 1 << this.event[b][this.event_now[b] + 3]) != 0) {
                this.event_now[b] = (short)(this.event_now[b] + 4);
                this.event_state = 1;
                this.ifelse = 1;
                break;
              } 
              this.ifelse = 0;
              this.event_now[b] = (short)(this.event_now[b] + 4);
              this.event_now[b] = (short)(this.event_now[b] + (this.event[b][this.event_now[b] + 3] << 1) + 4);
              nextEvent();
              break;
            case 7:
              if (this.my_dir == this.event[b][this.event_now[b] + 2]) {
                this.event_now[b] = (short)(this.event_now[b] + 3);
                nextEvent();
              } 
              break;
            case 8:
              setImageKind(this.event[b][this.event_now[b] + 2]);
              keyRelease();
              this.event_now[b] = (short)(this.event_now[b] + 3);
              nextEvent();
              break;
            case 9:
              this.npc[this.event[b][this.event_now[b] + 2] - 1][4] = 1;
              this.event_now[b] = (short)(this.event_now[b] + 3);
              nextEvent();
              break;
            case 10:
              this.boat_show = this.event[b][this.event_now[b] + 2];
              this.event_now[b] = (short)(this.event_now[b] + 3);
              nextEvent();
              break;
            case 11:
              if (this.my_x / 16 == this.event[b][this.event_now[b] + 2] && this.my_y / 16 == this.event[b][this.event_now[b] + 3] && this.my_dir == this.event[b][this.event_now[b] + 4]) {
                this.event_now[b] = (short)(this.event_now[b] + 5);
                nextEvent();
              } 
              break;
            case 12:
              if (this.my_x / 16 == this.event[b][this.event_now[b] + 2] && this.my_y / 16 == this.event[b][this.event_now[b] + 3] && this.my_dir == this.event[b][this.event_now[b] + 4] && this.imageKind == this.event[b][this.event_now[b] + 5]) {
                this.event_now[b] = (short)(this.event_now[b] + 6);
                nextEvent();
              } 
              break;
            case 13:
              if (this.ifirst != this.event[b][this.event_now[b] + 2]) {
                this.ifirst = this.event[b][this.event_now[b] + 2];
                this.event_now[b] = (short)(this.event_now[b] + 3);
              } 
              break;
            case 14:
              if ((this.mapInfo[this.event[b][this.event_now[b] + 2] * 2 + 1] & 1 << this.event[b][this.event_now[b] + 3]) != 0) {
                this.event_now[b] = (short)(this.event_now[b] + 4);
                this.event_now[b] = (short)(this.event_now[b] + (this.event[b][this.event_now[b] + 3] << 1) + 4);
                this.event_now[b] = (short)(this.event_now[b] + 4);
                this.event_state = 1;
                break;
              } 
              this.event_now[b] = (short)(this.event_now[b] + 4);
              this.ifirst = 0;
              nextEvent();
              break;
            case 15:
              if (this.my_x / 16 == this.event[b][this.event_now[b] + 2] && this.my_y / 16 == this.event[b][this.event_now[b] + 3] && this.my_dir == this.event[b][this.event_now[b] + 4] && this.ifirst != this.event[b][this.event_now[b] + 5]) {
                this.ifirst = this.event[b][this.event_now[b] + 5];
                this.event_now[b] = (short)(this.event_now[b] + 6);
                nextEvent();
              } 
              break;
            case 16:
              if (this.eventGoing == 0) {
                face(this.event[b][this.event_now[b] + 2], this.event[b][this.event_now[b] + 3]);
                this.eventGoing = 1;
                this.my_state = 10;
                break;
              } 
              if (this.faceTime == -1) {
                this.event_now[b] = (short)(this.event_now[b] + 4);
                nextEvent();
              } 
              break;
            case 17:
              this.gameRun.sleep(this.event[b][this.event_now[b] + 2] * 10);
              this.event_now[b] = (short)(this.event_now[b] + 3);
              nextEvent();
              break;
            case 18:
              if (this.gameRun.battleWin == this.event[b][this.event_now[b] + 2]) {
                this.event_now[b] = (short)(this.event_now[b] + 3);
                nextEvent();
              } 
              break;
            case 19:
              gotoMap(this.event[b][this.event_now[b] + 2], this.event[b][this.event_now[b] + 3]);
              this.event_now[b] = (short)(this.event_now[b] + 4);
              nextEvent();
              this.gameRun.maincanvas.paint();
              break;
            case 21:
              b1 = 0;
              for (b2 = 0; b2 < this.gameRun.monster_takens; b2++) {
                if (this.gameRun.myMonster[b2] != null && b1 < (this.gameRun.myMonster[b2]).monster[11])
                  b1 = (this.gameRun.myMonster[b2]).monster[11]; 
              } 
              if (b1 >= this.event[b][this.event_now[b] + 2]) {
                this.event_now[b] = (short)(this.event_now[b] + 3);
                nextEvent();
              } 
              break;
            case 60:
              if (this.npc[this.event[b][this.event_now[b] + 2] - 1][4] == 0) {
                this.npc[this.event[b][this.event_now[b] + 2] - 1][4] = -1;
              } else {
                this.npc[this.event[b][this.event_now[b] + 2] - 1][4] = 3;
                this.keyEnable = false;
              } 
              this.event_now[b] = (short)(this.event_now[b] + 3);
              nextEvent();
              break;
            case -10:
              this.now_eV2 = (byte)(this.event[b][this.event_now[b] + 2] - 1);
              arrayOfByte = new byte[7 + this.npc[this.now_eV2][5] * 2 + (this.event[b][this.event_now[b] + 3] << 1)];
              for (b3 = 0; b3 < 6 + this.npc[this.now_eV2][5] * 2; b3++)
                arrayOfByte[b3] = this.npc[this.now_eV2][b3]; 
              b3 = 6 + this.npc[this.now_eV2][5] * 2;
              for (s = 0; s < (this.event[b][this.event_now[b] + 3] << 1) + 1; s++) {
                arrayOfByte[b3] = this.event[b][this.event_now[b] + 3 + s];
                b3++;
              } 
              this.npc[this.now_eV2] = null;
              this.npc[this.now_eV2] = arrayOfByte;
              this.event_now[b] = (short)(this.event_now[b] + (this.event[b][this.event_now[b] + 3] << 1) + 4);
              nextEvent();
              break;
            case -80:
              if ((this.mapInfo[this.event[b][this.event_now[b] + 2] * 2 + 1] & 1 << this.event[b][this.event_now[b] + 3]) != 0) {
                this.event_now[b] = (short)(this.event_now[b] + 4);
                this.event_state = 1;
              } 
              break;
            case -60:
              if (this.my_x / 16 == this.event[b][this.event_now[b] + 2] && this.my_y / 16 == this.event[b][this.event_now[b] + 3]) {
                keyRelease();
                this.event_now[b] = (short)(this.event_now[b] + 4);
                nextEvent();
              } 
              break;
            case -61:
              if (this.my_x / 16 >= this.event[b][this.event_now[b] + 2] && this.my_x / 16 <= this.event[b][this.event_now[b] + 4] && this.my_y / 16 >= this.event[b][this.event_now[b] + 3] && this.my_y / 16 <= this.event[b][this.event_now[b] + 5]) {
                keyRelease();
                this.event_now[b] = (short)(this.event_now[b] + 6);
                nextEvent();
              } 
              break;
            case -62:
              s = this.event[b][this.event_now[b] + 2];
              b4 = this.event[b][this.event_now[b] + 3];
              if (s != 0)
                this.npc2[s - 1][0] = b4; 
              this.event_now[b] = (short)(this.event_now[b] + 4);
              nextEvent();
              break;
            case -63:
              this.now_eV1 = this.event[b][this.event_now[b] + 2];
              this.now_eV2 = this.event[b][this.event_now[b] + 3];
              if (this.now_eV1 != 0)
                this.npc2[this.now_eV1 - 1][1] = this.now_eV2; 
              this.event_now[b] = (short)(this.event_now[b] + 4);
              nextEvent();
              break;
            case -64:
              guochang(this.event[b][this.event_now[b] + 2]);
              this.event_now[b] = (short)(this.event_now[b] + 3);
              nextEvent();
              break;
            case -65:
              if (this.eventGoing == 0) {
                this.now_eV1 = -1;
                this.now_eV2 = 0;
                byte b5 = this.gameRun.getmonNum();
                byte b6;
                for (b6 = 0; b6 < this.catchNum.length && b5 >= this.catchNum[b6]; b6 = (byte)(b6 + true)) {
                  if (!this.gameRun.findItem(this.huizhang[b6]) && this.gameRun.checkMonItem(this.huizhang[b6]) == -1) {
                    this.now_eV1 = b6;
                    break;
                  } 
                  this.now_eV2 = b6;
                } 
                this.npcName = this.text[1];
                if (this.now_eV1 == -1) {
                  if (this.now_eV2 >= 5) {
                    getDialogs(this.text[2]);
                  } else {
                    getDialogs(this.text[3] + this.chenghao[this.now_eV2] + this.text[4] + b5 + this.text[5] + this.catchNum[this.now_eV2 + 1] + this.text[6]);
                  } 
                } else {
                  getDialogs(this.text[7] + this.chenghao[this.now_eV1] + "," + this.guli[this.now_eV1]);
                } 
                this.dialog_no = 0;
                this.eventGoing = 1;
                this.my_state = 1;
                break;
              } 
              if (this.my_state == 0) {
                if (this.now_eV1 != -1)
                  this.gameRun.getItem(this.huizhang[this.now_eV1], 1); 
                this.event_now[b] = (short)(this.event_now[b] + 3);
                nextEvent();
              } 
              break;
            case -66:
              this.now_eV1 = this.event[b][this.event_now[b] + 2];
              if (this.now_eV1 != 0) {
                this.npc[this.now_eV1 - 1][0] = (byte)(this.npc[this.now_eV1 - 1][0] + this.event[b][this.event_now[b] + 3]);
                this.npc[this.now_eV1 - 1][1] = (byte)(this.npc[this.now_eV1 - 1][1] + this.event[b][this.event_now[b] + 4]);
              } 
              this.event_now[b] = (short)(this.event_now[b] + 5);
              nextEvent();
              break;
            case -67:
              if (this.gameRun.hasMoney(this.event[b][this.event_now[b] + 2])) {
                this.event_now[b] = (short)(this.event_now[b] + 3);
                nextEvent();
                break;
              } 
              this.gameRun.say(this.gameRun.noMoney, 0);
              this.event_now[b] = 0;
              this.event_state = 0;
              break;
            case -68:
              this.event_now[b] = (short)(this.event_now[b] + 3);
              nextEvent();
              this.my_state = 17;
              break;
            case -69:
              this.event_now[b] = (short)(this.event_now[b] + 3);
              nextEvent();
              this.gameRun.goBank();
              break;
            case -70:
              this.event_now[b] = (short)(this.event_now[b] + 3);
              nextEvent();
              this.gameRun.goGuess();
              break;
            case -71:
              this.event_now[b] = (short)(this.event_now[b] + 3);
              nextEvent();
              this.gameRun.goGuess();
              break;
            case -72:
              if (this.eventGoing == 0) {
                this.flashTimes = this.event[b][this.event_now[b] + 2];
                this.my_state = 10;
                this.eventGoing = 1;
                break;
              } 
              if (this.flashTimes < 0) {
                this.event_now[b] = (short)(this.event_now[b] + 3);
                nextEvent();
              } 
              break;
            case -73:
              this.now_eV1 = this.event[b][this.event_now[b] + 2];
              this.now_eV2 = this.event[b][this.event_now[b] + 3];
              this.frontmap[this.now_eV1][this.now_eV2] = -1;
              this.firstDrawMap = 0;
              this.event_now[b] = (short)(this.event_now[b] + 4);
              nextEvent();
              break;
            case -74:
              this.npc[this.event[b][this.event_now[b] + 2] - 1][4] = -1;
              this.event_now[b] = (short)(this.event_now[b] + 3);
              nextEvent();
              break;
          } 
        } while (this.event_state == 1); 
    } 
  }
  
  public void gotoMap(int paramInt1, int paramInt2) {
    this.my_state = 6;
    this.mapNotemp = (byte)paramInt1;
    this.go = (byte)paramInt2;
    this.my_frame_c = this.frame_max;
  }
  
  public void goGameWin() {
    this.dialog_no = 0;
    this.gameRun.LINE_MAX = 11;
    getDialogs(this.gameRun.loadText("end")[0]);
    this.gameRun.action_str = null;
    this.gameRun.run_state = 51;
  }
  
  void initMMP() {
    this.mmp = null;
    this.mmp = new MMPPartical();
  }
  
  void map_run() {
    if (this.my_state == -77) {
      this.ccc++;
      if (this.ccc > 72) {
        goNextMap();
        this.ccc = -1;
        this.my_state = 0;
        this.map_key = 0;
      } 
      return;
    } 
    if (this.my_state == -78) {
      this.ccc++;
      if (this.ccc >= this.magicdoor.length * 2) {
        this.ccc = -1;
        goNextMap();
        this.my_state = 0;
        this.map_key = 0;
      } 
      return;
    } 
    if (this.mapc % 50 == 0) {
      if (this.mapNo == 1 || this.mapNo == 3 || this.mapNo == 4 || this.mapNo == 6) {
        if ((this.mmpTime < 0 && getRandom(100) <= 40) || this.mmpTime <= -100 - getRandom(801)) {
          this.mmpTime = 100 + (getRandom(4) + 1) * 100;
          initMMP();
        } 
      } else {
        this.mmp = null;
      } 
      byte[] arrayOfByte = { 
          5, 13, 15, 16, 18, 20, 21, 22, 25, 26, 
          28, 47, 52, 53, 54, 55, 57 };
      boolean bool = false;
      for (int i = arrayOfByte.length - 1; i >= 0; i--) {
        if (arrayOfByte[i] == this.mapNo) {
          bool = true;
          break;
        } 
      } 
      if (bool) {
        if ((this.mmpTime < 0 && getRandom(100) <= 30) || this.mmpTime <= -1000) {
          this.mmpTime = 100 + (getRandom(4) + 1) * 100;
          if (null == this.gr)
            this.gr = new GigRain(); 
        } 
        if (null != this.gr)
          this.gr.reset(); 
      } else {
        this.gr = null;
      } 
    } 
    eventCheck();
    if (this.my_tempState == 5 && this.my_frame_c >= this.frame_max) {
      this.my_tempState = 0;
      this.gameRun.createOver = 1;
      this.my_state = 5;
      this.gameRun.keyRelease();
    } 
    if (this.my_state == 5 && this.my_frame_c >= this.frame_max) {
      this.gameRun.maincanvas.soundStop();
      this.my_state = 6;
    } 
    if (this.my_state == 6) {
      this.gameRun.createOver = 1;
      if (this.chuansong == 1) {
        this.chuansong = 0;
        this.my_state = -78;
        this.ccc = 0;
        this.gameRun.x = this.my_x + this.map_x + 8;
        this.gameRun.y = this.my_y + this.map_y + 16;
        this.gameRun.getMagicDoorGif();
      } else if (this.imageKind == 2) {
        this.gameRun.getDriverGif();
        this.my_state = -77;
        this.ccc = 4;
      } else {
        goNextMap();
      } 
      return;
    } 
    if (this.my_state == 2) {
      this.my_tempState = 2;
      if (this.npc[this.get_meet][4] == 1) {
        this.npcName = this.gameRun.getDialogs(this.npc[this.get_meet], 6, this.npc[this.get_meet][5]);
        if (this.npcName.equals("路人"))
          this.npcName = null; 
      } else {
        this.npcName = null;
      } 
      getDialogs(this.gameRun.getDialogs(this.npc[this.get_meet], 7 + this.npc[this.get_meet][5] * 2, this.npc[this.get_meet][6 + this.npc[this.get_meet][5] * 2]));
      this.dialog_no = 0;
      this.my_state = 1;
    } else if (this.my_state == 8 && this.my_frame_c >= this.frame_max) {
      if (this.gameRun.immueEnemy == 0)
        goToBattle(7 + getRandom(2)); 
      this.my_state = 0;
    } 
    meMove();
  }
  
  void goToBattle(int paramInt) {
    if (this.yudaoJingying == 0) {
      this.gameRun.enemyList = new byte[1][2];
      this.gameRun.getMonster(this.mapNo, this.gameRun.enemyList[0], this.my_x, this.my_y);
    } 
    if (this.yudaoJingying == 1) {
      this.meet_step = (byte)getRandom(8);
      this.yudaoJingying = 2;
      if (this.gameRun.findItem(29))
        this.gameRun.say(this.battleSay[3], 0); 
      return;
    } 
    if (this.yudaoJingying == 2) {
      this.gameRun.say(this.battleSay[4], 0);
    } else {
      this.gameRun.say(this.battleSay[getRandom(3)], 0);
    } 
    this.gameRun.maincanvas.paint();
    this.gameRun.fieldBattle();
    this.gameRun.maincanvas.setMusic(paramInt, false);
    this.gameRun.goGO_BATTLE();
  }
  
  void getItem() {
    this.gameRun.getItem(this.item[this.get_meet][3], this.item[this.get_meet][4]);
    this.item[this.get_meet][2] = -1;
    this.my_state = 11;
  }
  
  void npcXiaoshi(int paramInt) {
    this.firstDrawMap = 0;
    if (this.npc[paramInt][2] == 35) {
      this.npc[paramInt][4] = -1;
      this.npcfram = 0;
      this.keyEnable = true;
      return;
    } 
    if (this.npcfram > 4) {
      for (byte b = 0; b < 4; b++) {
        g.setClip(this.map_x + (this.npc[paramInt][0] << 4), this.map_y + (this.npc[paramInt][1] << 4) + b * 4, 16, this.npcfram - this.xiaoshiTime);
        g;
        g;
        g.drawImage(this.imageNpc[0][this.npc[paramInt][2]], this.map_x + (this.npc[paramInt][0] << 4) + 8, this.map_y + (this.npc[paramInt][1] << 4) + 16, true | 0x20);
        g.setClip(0, 0, 176, 208);
      } 
    } else {
      g;
      g;
      g.drawImage(this.imageNpc[0][this.npc[paramInt][2]], this.map_x + (this.npc[paramInt][0] << 4) + 8, this.map_y + (this.npc[paramInt][1] << 4) + 16, true | 0x20);
    } 
    this.npcfram = (byte)(this.npcfram + 1);
    if (this.npcfram > 4 + this.xiaoshiTime) {
      this.npcfram = 0;
      this.npc[paramInt][4] = -1;
      this.keyEnable = true;
    } 
  }
  
  void drawNpc(int paramInt) {
    if (this.npc[paramInt][4] == 3) {
      npcXiaoshi(paramInt);
    } else {
      if (this.npc[paramInt][2] == 33) {
        byte b1 = (byte)Math.abs(this.gameRun.battle_c % 12 / 3);
        byte[] arrayOfByte = { 0, 1, 0, 2 };
        g;
        g;
        g.drawImage(this.imageNpc[arrayOfByte[b1]][33], this.map_x + (this.npc[paramInt][0] << 4) + 8, this.map_y + (this.npc[paramInt][1] << 4) + 16, true | 0x20);
        return;
      } 
      g;
      g;
      byte b = true | 0x20;
      int i = this.npc2[paramInt][1];
      if (this.npc[paramInt][2] == 35) {
        g;
        g;
        b = true | 0x2;
      } else if ((this.my_state == 1 || this.my_state == 14 || this.faceTime > -1) && this.get_meet == paramInt && null != this.npcName) {
        i = getDir(this.my_x - (this.npc[paramInt][0] << 4), this.my_y - (this.npc[paramInt][1] << 4));
      } 
      if (i == 3) {
        dg;
        dg.drawImage(this.imageNpc[1][this.npc[paramInt][2]], this.map_x + (this.npc[paramInt][0] << 4) + 8, this.map_y + (this.npc[paramInt][1] << 4) + 16, b, 4);
      } else {
        g.drawImage(this.imageNpc[i][this.npc[paramInt][2]], this.map_x + (this.npc[paramInt][0] << 4) + 8, this.map_y + (this.npc[paramInt][1] << 4) + 16, b);
      } 
    } 
  }
  
  private int getDir(int paramInt1, int paramInt2) {
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
  
  void drawChangeMap() {
    g.setColor(8947848);
    g.fillRoundRect(54, 180, 66, 3, 1, 1);
    g.setColor(16777215);
    g.drawLine(55, 181, 55 + (this.gameRun.battle_c * 64 >> 3), 181);
  }
  
  void drawMap(Graphics paramGraphics) {
    int k;
    int j;
    byte b1 = this.leftCol;
    byte b2 = this.topRow;
    int i = this.bottomRow;
    short s1 = 192;
    short s2 = 224;
    if (this.firstDrawMap == 0) {
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 0, s1, s2);
      this.firstDrawMap = 1;
      if (this.map_x >= 0) {
        this.leftCol = 0;
        this.map_left = this.map_x;
      } else {
        this.leftCol = (byte)(-this.map_x / 16);
        this.map_left = this.map_x + this.leftCol * 16;
      } 
      if (this.map_y >= 0) {
        this.topRow = 0;
        this.map_top = this.map_y;
      } else {
        this.topRow = (byte)(-this.map_y / 16);
        this.map_top = this.map_y + this.topRow * 16;
      } 
      copyArea(this.leftCol, this.topRow, this.cols, this.rows, 0, 0, s1, s2);
    } else {
      if (this.map_x >= 0) {
        this.leftCol = 0;
        this.map_left = this.map_x;
      } else {
        this.leftCol = (byte)(-this.map_x / 16);
        this.map_left = this.map_x + this.leftCol * 16;
      } 
      if (this.map_y >= 0) {
        this.topRow = 0;
        this.map_top = this.map_y;
      } else {
        this.topRow = (byte)(-this.map_y / 16);
        this.map_top = this.map_y + this.topRow * 16;
      } 
      if (this.leftCol != b1 || this.topRow != b2) {
        paramGraphics.setColor(0);
        paramGraphics.copyArea(0, 0, s1, s2, -(this.leftCol - b1) * 16, -(this.topRow - b2) * 16, 20);
        if (this.leftCol < b1) {
          copyArea(this.leftCol, this.topRow, b1, this.rows, 0, 0, s1, s2);
        } else if (this.leftCol > b1) {
          j = 0;
          if (this.leftCol + 12 > this.cols) {
            j = this.cols;
          } else {
            j = this.leftCol + 12;
          } 
          copyArea(b1 + 12, this.topRow, j, this.rows, s1 - (this.leftCol - b1) * 16, 0, s1, s2);
        } 
        this.bottomRow = i;
        if (this.topRow < b2) {
          copyArea(this.leftCol, this.topRow, this.cols, b2, 0, 0, s1, s2);
        } else if (this.topRow > b2) {
          j = 0;
          if (this.topRow + 14 > this.rows) {
            j = this.rows;
          } else {
            j = this.topRow + 14;
          } 
          copyArea(this.leftCol, b2 + 14, this.cols, j, 0, s2 - (this.topRow - b2) * 16, s1, s2);
        } 
      } 
    } 
    if (this.map_left >= 0) {
      j = this.map_left;
    } else {
      j = this.map_left % 16;
    } 
    if (this.map_top >= 0) {
      k = this.map_top;
    } else {
      k = this.map_top % 16;
    } 
    this;
    g.drawImage(screenTemp, j, k, 20);
  }
  
  void copyArea(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    Graphics graphics = offG;
    int i = paramInt5;
    int j = paramInt6;
    this.bottomRow = paramInt2;
    graphics.setColor(0);
    while (j < paramInt8 && this.bottomRow < paramInt4) {
      i = paramInt5;
      this.rightCol = paramInt1;
      while (i < paramInt7 && this.rightCol < paramInt3) {
        int k = paramInt5 + (this.rightCol - paramInt1 << 4);
        int m = paramInt6 + (this.bottomRow - paramInt2 << 4);
        graphics.fillRect(k, m, 16, 16);
        k += 8;
        m += 16;
        if (this.map[this.rightCol][this.bottomRow] != -1) {
          graphics;
          graphics;
          graphics.drawImage(this.bgLayer.cellImage[this.map[this.rightCol][this.bottomRow]], k, m, true | 0x20);
        } 
        if (this.frontmap[this.rightCol][this.bottomRow] != -1) {
          graphics;
          graphics;
          graphics.drawImage(this.fgLayer.cellImage[this.frontmap[this.rightCol][this.bottomRow]], k, m, true | 0x20);
        } 
        this.rightCol++;
        i += 16;
      } 
      this.bottomRow++;
      j += 16;
    } 
  }
  
  void map_paint(Graphics paramGraphics) {
    this;
    g = paramGraphics;
    dg = DirectUtils.getDirectGraphics(paramGraphics);
    if (this.my_state == 6) {
      if (this.imageKind != 2)
        drawChangeMap(); 
      if (this.imageKind == 2)
        this.my_state = -77; 
      return;
    } 
    if (this.my_state == -77) {
      if (this.gameRun.boatGif == null)
        return; 
      paramGraphics.setColor(6031861);
      paramGraphics.fillRect(0, 0, 176, 208);
      int j = -200;
      int k = this.ccc;
      int m = this.ccc * 2;
      int n = this.ccc * 2;
      int i1;
      for (i1 = 0; i1 < 3; i1 = (byte)(i1 + 1))
        paramGraphics.drawImage(this.gameRun.boatGif[2], j + this.gameRun.boatGif[2].getWidth() * i1 + k, 0, 20); 
      for (i1 = 0; i1 < 3; i1 = (byte)(i1 + 1))
        paramGraphics.drawImage(this.gameRun.boatGif[1], j + this.gameRun.boatGif[1].getWidth() * i1 + m, 0, 20); 
      for (i1 = 0; i1 < 3; i1 = (byte)(i1 + 1)) {
        paramGraphics;
        paramGraphics;
        paramGraphics.drawImage(this.gameRun.boatGif[0], j + this.gameRun.boatGif[0].getWidth() * i1 + n, 208, 0x4 | 0x20);
      } 
      byte[][][] arrayOfByte = { { { 3, 0, 0 }, { 6, 0, 30 }, { 7, 0, 38 } }, { { 3, 0, 0 }, { 4, 0, 30 }, { 7, 0, 38 } }, { { 5, 0, 0 } } };
      byte b = (byte)(this.ccc % 3);
      for (byte b1 = 0; b1 < arrayOfByte[b].length; b1++)
        paramGraphics.drawImage(this.gameRun.boatGif[arrayOfByte[b][b1][0]], arrayOfByte[b][b1][1] + 176 - 10 - this.ccc * 3, arrayOfByte[b][b1][2] + 80, 20); 
      return;
    } 
    this.gameRun.maincanvas.drawScreen(0);
    drawMap(offG);
    drawfire();
    if (this.my_state == -78) {
      if (this.ccc != -1) {
        paramGraphics;
        paramGraphics;
        paramGraphics.drawImage(this.gameRun.magicGif[this.magicdoor[this.ccc / 2][0]], this.gameRun.x, this.gameRun.y + 7 + this.magicdoor[this.ccc / 2][1], true | 0x20);
        if (this.ccc / 2 < this.magicdoor.length - 1 && null != this.my_image[false]) {
          paramGraphics;
          paramGraphics;
          paramGraphics.drawImage(this.my_image[0], this.gameRun.x, this.gameRun.y - ((this.ccc > 11) ? (this.ccc - 11) : 0), true | 0x20);
        } 
        this.gameRun.sleep(150);
      } 
      this.my_dir = 2;
      return;
    } 
    int i;
    for (i = 0; null != this.npc && i < this.npc.length; i++) {
      if (isInTheScreen(this.npc[i]))
        if (this.npc[i][2] != 35 && this.npc[i][4] > 0) {
          drawNpc(i);
        } else if (this.npc[i][2] == 35 && this.boat_show == 1 && this.imageKind != 2) {
          drawNpc(i);
        }  
    } 
    if (null == this.my_image)
      createHero(this.imageKind); 
    if (this.imageKind == 2)
      if (this.my_dir <= 2) {
        paramGraphics;
        paramGraphics;
        dg;
        dg.drawImage(this.imageNpc[0][36], this.map_x + this.my_x + 8, this.map_y + this.my_y + 15, true | 0x2, 1 * (this.my_dir - 1) * 2);
      } else {
        paramGraphics;
        paramGraphics;
        dg;
        dg.drawImage(this.imageNpc[0][35], this.map_x + this.my_x + 8, this.map_y + this.my_y + 15, true | 0x2, 4 * (4 - this.my_dir));
      }  
    if (this.imageKind <= 2) {
      if (this.my_dir != 4) {
        paramGraphics;
        paramGraphics;
        paramGraphics.drawImage(this.my_image[this.my_image_no], this.map_x + this.my_x + 8, this.map_y + this.my_y + 16, true | 0x20);
      } else if (null != this.my_image[this.my_image_no]) {
        paramGraphics;
        paramGraphics;
        dg;
        dg.drawImage(this.my_image[this.my_image_no], this.map_x + this.my_x + 8, this.map_y + this.my_y + 16, true | 0x20, 4);
      } 
    } else {
      i = (byte)Math.abs(this.gameRun.battle_c % 12 / 3);
      paramGraphics.setClip(this.map_x + this.my_x, this.map_y + this.my_y, 16, 10);
      if (this.my_dir != 4) {
        paramGraphics;
        paramGraphics;
        paramGraphics.drawImage(this.my_image[this.my_start_image], this.map_x + this.my_x + 8, this.map_y + i + this.my_y - 16 + 15, true | 0x10);
      } else {
        paramGraphics;
        paramGraphics;
        dg;
        dg.drawImage(this.my_image[this.my_start_image], this.map_x + this.my_x + 8, this.map_y + i + this.my_y - 16 + 15, true | 0x10, 4);
      } 
      paramGraphics.setClip(0, 0, 176, 208);
    } 
    for (i = 0; null != this.npc && i < this.npc.length; i++) {
      if (this.npc2[i][0] != 7 && this.npc[i][4] > 0 && this.npc[i][2] != 35 && this.npc[i][2] != 34 && isInTheScreen(this.npc[i]) && Math.abs(this.my_x - (this.npc[i][0] << 4)) <= 32 && Math.abs(this.my_y - (this.npc[i][1] << 4)) <= 32)
        paramGraphics.drawImage(this.imgFace[this.npc2[i][0]], this.map_x + (this.npc[i][0] << 4) + 4, this.map_y + (this.npc[i][1] << 4) - 2 - 8 + this.facedata[Math.abs(this.gameRun.battle_c) % this.facedata.length], 20); 
    } 
    if (this.faceTime > -1) {
      if (this.faceNpc == -1) {
        paramGraphics.drawImage(this.imgFace[this.faceType], this.map_x + this.my_x + 4, this.map_y + this.my_y - 2 - 8 + this.facedata[Math.abs(this.gameRun.battle_c) % this.facedata.length], 20);
      } else {
        paramGraphics.drawImage(this.imgFace[this.faceType], this.map_x + (this.npc[this.faceNpc][0] << 4) + 4, this.map_y + (this.npc[this.faceNpc][1] << 4) - 2 - 8 + this.facedata[Math.abs(this.gameRun.battle_c) % this.facedata.length], 20);
      } 
      this.faceTime = (byte)(this.faceTime - 1);
    } 
    if (null != this.mmp && this.mmp.bdraw) {
      this.mmpTime--;
      this.mmp.drawParticle(paramGraphics, this.mmpTime);
    } 
    if (null != this.gr) {
      this.mmpTime--;
      if (this.mmpTime > -50)
        this.gr.drawParticle(paramGraphics); 
    } 
    drawGuochang();
    if (this.dialog_no >= 0) {
      dialog(6, 161, 10, 166, 166, 46);
      if (null != this.npcName) {
        this.gameRun.drawRichText(0, 142, this.npcName.length() * 16 + 12, 24, 15452159, 10448383, 3473558);
        paramGraphics.setColor(4129131);
        paramGraphics;
        paramGraphics;
        paramGraphics.drawString(this.npcName, (this.npcName.length() * 16 + 12) / 2, 146, true | 0x10);
      } 
      if (this.dialog_no < 0) {
        this.my_state = 0;
        this.npcName = null;
      } 
    } 
    if (this.my_state == 13) {
      this.gameRun.showString(this.gameRun.text[45] + this.gameRun.str_show + this.gameRun.text[131], 8, 170);
      if (this.gameRun.view_state == 12) {
        if (this.gameRun.popMenustate == 0) {
          this.gameRun.showString(this.gameRun.str_show, 8, 170);
          this.frontmap[this.iX][this.iY] = -1;
          this.gameRun.sleep(300);
          if (getRandom(2) == 1) {
            i = (byte)(1 + getRandom(3));
            this.gameRun.money += i;
            this.gameRun.say(this.gameRun.text[132] + this.gameRun.text[98] + i, 0);
          } 
          this.firstDrawMap = 0;
        } 
        this.gameRun.popMenustate = -1;
        this.gameRun.view_state = 0;
        this.my_state = 0;
        this.get_meet = 0;
      } else if (this.map_key == -7) {
        this.gameRun.popMenustate = -1;
        this.gameRun.view_state = 0;
        this.my_state = 0;
        this.get_meet = 0;
      } 
    } else if (this.my_state == 18) {
      keyRelease();
      this.gameRun.say(this.gameRun.str_show, 0);
      this.my_state = 0;
    } 
    if (this.my_state == 17) {
      paramGraphics.translate(0, -20);
      this.gameRun.showString(this.text[15], 8, 170);
      paramGraphics.translate(0, 20);
      this.gameRun.queding();
      this.gameRun.quxiao();
    } 
    this.gameRun.map_flashString();
    if (this.gameRun.popMenustate != -1) {
      if (this.mapNo == 2) {
        this.gameRun.drawPopMenu(88, (208 - this.gameRun.action_str.length * 16 >> 1) + 18, 16, 24);
        i = 50;
        byte b = 50;
        int j = (176 - i) / 2;
        char c = ('Ð' - b) / '\002' - '&';
        paramGraphics.setColor(10061480);
        paramGraphics.fillRoundRect(j, c, i, b, 9, 9);
        paramGraphics.setColor(6570881);
        paramGraphics.drawRoundRect(j, c, i, b, 9, 9);
        paramGraphics.setColor(15925247);
        paramGraphics.drawRoundRect(j + 1, c + '\001', i - 2, b - 2, 9, 9);
        paramGraphics.setColor(12760287);
        paramGraphics.drawRoundRect(j + 2, c + '\002', i - 4, b - 4, 9, 9);
        paramGraphics.setColor(6570881);
        paramGraphics.drawRoundRect(j + 3, c + '\003', i - 6, b - 6, 9, 9);
        if (null == this.gameRun.imgMonster[false]) {
          byte[] arrayOfByte = { 28, 74, 51 };
          this.gameRun.imgMonster[0] = this.gameRun.Image(arrayOfByte[this.gameRun.popMenustate]);
        } 
        paramGraphics;
        paramGraphics;
        paramGraphics.drawImage(this.gameRun.imgMonster[0], 88, c + '\f', 0x10 | true);
      } else {
        this.gameRun.drawPopMenu(88, 208 - this.gameRun.action_str.length * 16 >> 1, 16, 24);
      } 
      if (this.my_state == 16)
        this.gameRun.showString("花费30金回复所有怪物体力？", 8, 170); 
    } 
    flash();
    this.mapc = (short)(this.mapc + 1);
    if (this.mapc > 10000)
      this.mapc = 0; 
    paramGraphics.setColor(16711680);
  }
  
  private void drawGuochang() {
    if (this.guochang != 0 && null != this.imageGuochang[false]) {
      this.gameRun.blueBg();
      if (this.guochang == 2) {
        g;
        g;
        g.drawImage(this.imageGuochang[1], 88, 0, true | 0x10);
        g;
        g;
        g.drawImage(this.imageGuochang[0], this.imageGuochang[0].getWidth() / 2, 45, true | 0x10);
      } else if (this.guochang == 3) {
        g;
        g;
        g.drawImage(this.imageGuochang[1], 88, 0, true | 0x10);
        g;
        g;
        g.drawImage(this.imageGuochang[0], 79 + this.imageGuochang[0].getWidth() / 2, 58, true | 0x10);
      } else {
        g;
        g;
        g.drawImage(this.imageGuochang[0], 88, 0, true | 0x10);
      } 
    } 
  }
  
  private void guochang(int paramInt) {
    this.guochang = (byte)paramInt;
    this.imageGuochang = null;
    System.gc();
    if (paramInt != 0) {
      this.imageGuochang = new Image[2];
      this.imageGuochang[0] = this.gameRun.createImageOneOfArray("guochang", paramInt - 1);
      if (paramInt == 2 || paramInt == 3)
        this.imageGuochang[1] = this.gameRun.createImageOneOfArray("guochang", 0); 
    } 
  }
  
  private boolean isInTheScreen(byte[] paramArrayOfByte) {
    this.tempNpcX = this.map_x + (paramArrayOfByte[0] << 4);
    this.tempNpcY = this.map_y + (paramArrayOfByte[1] << 4);
    return (this.tempNpcX >= -16 && this.tempNpcX < 176 && this.tempNpcY >= -16 && this.tempNpcY < 208);
  }
  
  void map_Key(int paramInt) {
    if (this.my_state == 16 && this.gameRun.popMenustate >= 0)
      this.gameRun.popState(); 
    if (this.my_state == 10) {
      paramInt = 0;
      return;
    } 
    if (this.imageKind == 2) {
      paramInt = 0;
      return;
    } 
    if (this.gameRun.showArea != -1) {
      this.gameRun.keyDrawmap(paramInt);
      keyRelease();
      return;
    } 
    if (this.gameRun.popMenustate != -1) {
      if (paramInt == -6 || paramInt == 53 || paramInt == -5) {
        this.gameRun.view_state = 12;
      } else {
        if (this.mapNo == 2)
          this.gameRun.imgMonster[0] = null; 
        this.gameRun.popState();
        this.map_key = (byte)paramInt;
      } 
      keyRelease();
      return;
    } 
    if (this.my_state == 11) {
      if (paramInt == -6 || paramInt == 53 || paramInt == -5)
        this.gameRun.say_c = 0; 
      if (this.gameRun.say_c == 0)
        this.my_state = 0; 
      return;
    } 
    if (this.my_state == 1) {
      this.my_state = 14;
      if (paramInt == -7 && this.my_tempState == 2) {
        this.my_state = 0;
        this.dialog_no = -1;
        this.my_tempState = 0;
      } 
      keyRelease();
    } 
    if (this.my_state == 17) {
      if (paramInt == -6 || paramInt == 53) {
        this.my_state = 0;
        map_paint(g);
        this.gameRun.run_state = 100;
        this.gameRun.battle_c = 0;
      } else if (paramInt == -7) {
        this.my_state = 0;
      } 
      keyRelease();
      return;
    } 
    if (this.my_frame_c < this.frame_max || this.my_state != 0)
      return; 
    if (this.my_state == 0 && this.gameRun.run_state != 98)
      if (paramInt == -7) {
        this.gameRun.goPAUSE();
      } else if (paramInt == -6) {
        this.gameRun.goSms(-1);
      }  
    if (this.keyEnable) {
      if (this.imageKind == 2)
        return; 
      this.map_key = (byte)-paramInt;
      doKey();
    } 
  }
  
  void doKey() {
    switch (this.map_key) {
      case 1:
      case 2:
      case 3:
      case 4:
        if (this.my_dir != this.map_key) {
          turnAround(this.map_key);
          break;
        } 
        canMove(this.dir_select[this.imageKind][this.map_key][0], this.dir_select[this.imageKind][this.map_key][1]);
        break;
      case -53:
      case 5:
        checkSoftKey(this.dir_select[this.imageKind][this.my_dir][0] * this.frame_num, this.dir_select[this.imageKind][this.my_dir][1] * this.frame_num);
        break;
      case -57:
        if (this.gameRun.findItem(15) && this.imageKind <= 1) {
          if (this.imageKind == 1) {
            setImageKind(0);
          } else {
            setImageKind(1);
          } 
          keyRelease();
        } 
        break;
      case -51:
        if (this.gameRun.showArea == -1)
          this.gameRun.getShowMap(); 
        keyRelease();
        break;
    } 
  }
  
  void setImageNo() {
    this.my_start_image = this.directImage[this.imageKind][this.my_dir - 1];
    this.my_image_no = this.my_start_image;
  }
  
  void turnAround(int paramInt) {
    this.my_dir = (byte)paramInt;
    setImageNo();
    this.frame_max = 2;
    this.my_frame_c = 0;
    this.my_x_speed = 0;
    this.my_y_speed = 0;
  }
  
  void setImageKind(int paramInt) {
    if (paramInt != this.imageKind && (paramInt == 1 || this.imageKind == 1))
      createHero(paramInt); 
    this.imageKind = (byte)paramInt;
    this.frame_num = (byte)((this.imageKind == 1) ? 2 : 4);
    setImageNo();
  }
  
  void meMove() {
    if (this.my_frame_c < this.frame_max) {
      if ((this.my_x_speed > 0 && this.my_x >= this.mapLeft_NOmove && this.my_x < this.mapRight_NOmove) || (this.my_x_speed < 0 && this.my_x > this.mapLeft_NOmove && this.my_x <= this.mapRight_NOmove))
        this.map_x -= this.my_x_speed; 
      if ((this.my_y_speed > 0 && this.my_y >= this.mapUp_NOmove && this.my_y < this.mapDown_NOmove) || (this.my_y_speed < 0 && this.my_y > this.mapUp_NOmove && this.my_y <= this.mapDown_NOmove))
        this.map_y -= this.my_y_speed; 
      this.my_x += this.my_x_speed;
      this.my_y += this.my_y_speed;
      if (this.my_x < 0)
        this.my_x = 0; 
      if (this.my_y < 0)
        this.my_y = 0; 
      if (this.my_x + 8 >= this.cols * 16)
        this.my_x = this.cols * 16 - 16; 
      if (this.my_y + 8 > this.rows * 16)
        this.my_y = this.rows * 16 - 16; 
      if (this.change_c == 0) {
        this.my_image_no = this.my_start_image;
        if (this.imageKind != 2)
          this.my_image_no = (byte)(this.my_image_no + this.frame[this.imageKind][this.my_frame_c]); 
        this.change_c = 0;
      } else {
        this.change_c = (byte)(this.change_c - 1);
      } 
      this.my_frame_c = (byte)(this.my_frame_c + 1);
    } else {
      this.my_frame_c = 100;
    } 
  }
  
  byte checkIfNpc(byte[][] paramArrayOfByte) {
    for (byte b = 0; b < paramArrayOfByte.length; b = (byte)(b + 1)) {
      if (paramArrayOfByte[b][0] == this.iX && paramArrayOfByte[b][1] == this.iY)
        return b; 
    } 
    return -1;
  }
  
  void checkMonItem(int paramInt) {
    if (this.gameRun.findItem(paramInt)) {
      this.gameRun.str_show = this.gameRun.text[141] + this.gameRun.text[1] + this.gameRun.getItemName(paramInt);
    } else {
      this.gameRun.str_show = this.text[12] + this.gameRun.text[1] + this.gameRun.getItemName(paramInt) + this.text[13];
    } 
    this.get_meet = this.gameRun.item_no;
  }
  
  void goSTONE_DESTROY() {
    if (this.get_meet != -1) {
      this.my_state = 13;
      String[] arrayOfString = { this.gameRun.text[113], this.gameRun.text[112] };
      this.gameRun.action_str = arrayOfString;
      this.gameRun.popMenustate = 0;
    } else {
      this.my_state = 18;
    } 
    keyRelease();
  }
  
  byte checkMapElement(int paramInt1, int paramInt2) {
    if (this.frontmap[paramInt1][paramInt2] != -1) {
      byte b = this.fgLayer.type_area[this.frontmap[paramInt1][paramInt2]];
      switch (b) {
        case 3:
          checkMonItem(26);
          goSTONE_DESTROY();
          return 3;
        case 2:
          checkMonItem(25);
          goSTONE_DESTROY();
          return 2;
        case 6:
          this.gameRun.str_show = this.text[9];
          this.my_state = 18;
          return 6;
        case 5:
          if (!this.gameRun.findItem(23)) {
            this.gameRun.str_show = this.text[10];
            this.my_state = 18;
            return 5;
          } 
          return 0;
        case 4:
          if (this.my_state == 0 && !this.gameRun.findItem(22)) {
            this.gameRun.str_show = this.text[11];
            this.my_state = 18;
          } 
          return 4;
      } 
      return b;
    } 
    return 0;
  }
  
  byte checkSoftKey(int paramInt1, int paramInt2) {
    this.iX = (byte)((this.my_x + paramInt1) / 16);
    this.iY = (byte)((this.my_y + paramInt2) / 16);
    if (this.iX < 0 || this.iX >= this.cols || this.iY < 0 || this.iY >= this.rows)
      return 0; 
    byte b = 0;
    b = checkIfNpc(this.npc);
    if (this.my_state == 0 && b != -1 && this.npc[b][4] > -1) {
      this.my_state = 2;
      keyRelease();
      this.get_meet = b;
      return 99;
    } 
    b = checkIfNpc(this.item);
    if (b != -1 && this.item[b][2] != -1) {
      this.get_meet = b;
      keyRelease();
      getItem();
      return 0;
    } 
    return checkMapElement(this.iX, this.iY);
  }
  
  byte checkMap(int paramInt1, int paramInt2) {
    this.iX = (byte)((paramInt1 >= 0) ? ((this.my_x + 15 + paramInt1) / 16) : ((this.my_x + paramInt1) / 16));
    this.iY = (byte)((paramInt2 >= 0) ? ((this.my_y + 15 + paramInt2) / 16) : ((this.my_y + paramInt2) / 16));
    byte b = checkIfNpc(this.door);
    if (b != -1) {
      if (((this.map_key == this.door[b][2] && this.door[b][5] != 2) || (this.door[b][5] == 2 && this.door[b][2] == 0)) && this.imageKind != 2) {
        keyRelease();
        if (this.door[b][5] == 2 && this.door[b][2] == 0)
          this.chuansong = 1; 
        if (this.mapNo == 46 && b >= 1 && b <= 4) {
          if (this.npc[0][4] == -1) {
            this.my_state = 5;
            this.my_tempState = this.my_state;
            this.get_meet = b;
          } else {
            this.gameRun.say(this.text[14], 0);
            this.chuansong = 0;
          } 
        } else {
          this.my_state = 5;
          this.my_tempState = this.my_state;
          this.get_meet = b;
        } 
        return 0;
      } 
      if ((this.door[b][2] == 0 || (this.door[b][5] == 2 && this.door[b][2] != 0)) && this.imageKind == 2) {
        this.my_state = 5;
        this.my_tempState = this.my_state;
        this.get_meet = b;
        return 0;
      } 
    } 
    b = checkIfNpc(this.npc);
    if (b != -1 && this.npc[b][4] == 1) {
      keyRelease();
      return (this.npc[b][2] == 35) ? 0 : 1;
    } 
    b = checkIfNpc(this.item);
    if (b != -1) {
      keyRelease();
      return (this.item[b][2] == 1) ? 1 : 0;
    } 
    boolean bool = false;
    if (this.frontmap[this.iX][this.iY] != -1) {
      b = checkMapElement(this.iX, this.iY);
      if (b == 0 && this.imageKind == 3)
        setImageKind(0); 
      if (b == 4) {
        if (this.imageKind == 2)
          b = 0; 
        if (this.gameRun.findItem(22) && this.imageKind != 2) {
          setImageKind(3);
          bool = true;
          b = 0;
        } 
      } else if (b == 5 && this.gameRun.findItem(23)) {
        b = 0;
      } 
      if (b != 0)
        return b; 
    } 
    if (this.map[this.iX][this.iY] != -1) {
      b = this.bgLayer.type_area[this.map[this.iX][this.iY]];
      if (!bool && b == 0 && this.imageKind == 3)
        setImageKind(0); 
      if (b == 4)
        if (this.imageKind == 2) {
          b = 0;
        } else if (this.gameRun.findItem(22)) {
          setImageKind(3);
          b = 0;
        }  
      return b;
    } 
    return 0;
  }
  
  void meetGrass() {
    if (this.meet_step < this.step_MEET) {
      if (this.my_state != 10)
        this.meet_step = (byte)(this.meet_step + 1); 
    } else {
      if (this.notMeet == 1) {
        this.notMeet = 0;
        this.gameRun.say(this.text[0], 0);
      } else {
        this.my_state = 8;
      } 
      this.meet_step = 0;
      notMeet(0, 0);
    } 
  }
  
  void canMove(int paramInt1, int paramInt2) {
    this.my_x_speed = (byte)paramInt1;
    this.my_y_speed = (byte)paramInt2;
    if (this.my_x + this.my_x_speed >= 0 && this.my_x + this.my_x_speed + 15 < this.cols * 16 && this.my_y + this.my_y_speed >= 0 && this.my_y + this.my_y_speed + 15 < this.rows * 16) {
      this.roadType = checkMap(this.my_x_speed, this.my_y_speed);
      if (0 == this.roadType) {
        this.frame_max = this.frame_num;
        this.my_frame_c = 0;
        if (this.gameRun.monster_appear[this.mapNo].length > 0 && this.imageKind != 2)
          meetGrass(); 
      } else if (this.roadType == 4) {
        if (this.gameRun.findItem(22)) {
          setImageKind(3);
          if (this.gameRun.monster_appear[this.mapNo].length > 0 && this.imageKind != 2)
            meetGrass(); 
        } 
      } else {
        this.my_x_speed = 0;
        this.my_y_speed = 0;
      } 
    } else {
      this.my_x_speed = 0;
      this.my_y_speed = 0;
      this.iX = (byte)(this.my_x / 16);
      this.iY = (byte)(this.my_y / 16);
      byte b = checkIfNpc(this.door);
      if (b != -1 && this.door[b][5] == 0 && this.map_key == this.door[b][2]) {
        this.my_state = 5;
        this.my_tempState = this.my_state;
        this.get_meet = b;
      } 
    } 
  }
  
  void dialog(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.gameRun.drawRichText(paramInt1, paramInt2, paramInt5, paramInt6 - 1, 15452159, 10448383, 3473558);
    g.setColor(4802889);
    byte b;
    for (b = 0; b < this.line_count && b + this.dialog_no < this.dialog.length; b = (byte)(b + 1)) {
      if (this.dialog_no + this.gameRun.LINE_MAX >= this.dialog.length) {
        g;
        g;
        g.drawString(this.dialog[this.dialog_no + b].toString(), paramInt3 + 3, paramInt4 - 2 + b * 18 + 16, 0x4 | 0x40);
        if (this.my_state == 14) {
          this.dialog_no = -1;
          this.line_count = 1;
          this.dialog = null;
          break;
        } 
      } else {
        g;
        g;
        g.drawString(this.dialog[this.dialog_no + b].toString(), paramInt3 + 3, paramInt4 - 2 + b * 18 + 16, 0x4 | 0x40);
        if (this.my_state == 14 && b == this.gameRun.LINE_MAX - 1) {
          this.line_count = 1;
          this.dialog_no = (byte)(this.dialog_no + this.gameRun.LINE_MAX);
          this.my_state = 1;
        } 
      } 
    } 
    if (this.line_count < this.gameRun.LINE_MAX)
      this.line_count = (byte)(this.line_count + 1); 
  }
  
  public void face(int paramInt1, int paramInt2) {
    this.faceNpc = (byte)(paramInt1 - 1);
    this.faceType = (byte)paramInt2;
    this.faceTime = 10;
  }
  
  void setNull() {
    this.gr = null;
    this.mmp = null;
    this.bgLayer = null;
    this.fgLayer = null;
    this.npc = (byte[][])null;
    this.item = (byte[][])null;
    this.door = (byte[][])null;
    this.imageNpc = (Image[][])null;
    this.map = (byte[][])null;
    this.frontmap = (byte[][])null;
    this.imageFish = null;
    this.imageRabbit = null;
    this.rabbitA = null;
    this.imageGuochang = null;
    this.imgFace = null;
    this.event = (byte[][])null;
    this.imageFire = null;
    this.fire = (byte[][])null;
    this.vfire = null;
    if (this.imageKind != 2) {
      this.my_image = null;
    } else {
      for (byte b = 0; b < this.my_image.length; b++) {
        if (b != 3)
          this.my_image[b] = null; 
      } 
    } 
  }
  
  StringBuffer[] getDialogs(String paramString) {
    int i = (paramString.length() % 9 == 0) ? (paramString.length() / 9) : (paramString.length() / 9 + 1);
    this.dialog = new StringBuffer[i];
    int j = 0;
    for (byte b = 0; j < paramString.length(); b++) {
      if (b >= i) {
        StringBuffer[] arrayOfStringBuffer = this.dialog;
        this.dialog = new StringBuffer[++i];
        System.arraycopy(arrayOfStringBuffer, 0, this.dialog, 0, arrayOfStringBuffer.length);
      } 
      if (j + 9 > paramString.length()) {
        this.dialog[b] = new StringBuffer(paramString.substring(j));
      } else {
        this.dialog[b] = new StringBuffer(paramString.substring(j, j + 9));
      } 
      int k = this.dialog[b].toString().indexOf("/n");
      if (k != -1) {
        this.dialog[b] = new StringBuffer(paramString.substring(j, j + k));
        j += k + 2;
      } else {
        j += 9;
      } 
    } 
    return this.dialog;
  }
  
  byte[] getNpcData() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    getNpcData(byteArrayOutputStream, this.npc);
    getNpcData(byteArrayOutputStream, this.npc2);
    getNpcData(byteArrayOutputStream, this.item);
    getNpcData(byteArrayOutputStream, this.door);
    return byteArrayOutputStream.toByteArray();
  }
  
  void getNpcData(ByteArrayOutputStream paramByteArrayOutputStream, byte[][] paramArrayOfByte) {
    try {
      paramByteArrayOutputStream.write(paramArrayOfByte.length);
      for (byte b = 0; b < paramArrayOfByte.length; b++) {
        paramByteArrayOutputStream.write(paramArrayOfByte[b].length - 100);
        paramByteArrayOutputStream.write(paramArrayOfByte[b]);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  short[][] readEventNowData() {
    short[][] arrayOfShort = (short[][])null;
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.gameRun.rmsOptions(3, null, 1));
    arrayOfShort = new short[byteArrayInputStream.read()][];
    for (byte b = 0; b < arrayOfShort.length; b++) {
      int i = byteArrayInputStream.read();
      if (i != 0) {
        arrayOfShort[b] = new short[i];
        for (byte b1 = 0; b1 < arrayOfShort[b].length; b1++)
          arrayOfShort[b][b1] = (short)(byteArrayInputStream.read() | byteArrayInputStream.read() << 8); 
      } 
    } 
    return arrayOfShort;
  }
  
  byte[] getEventNowData(short[][] paramArrayOfShort) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    byteArrayOutputStream.write(paramArrayOfShort.length);
    for (byte b = 0; b < paramArrayOfShort.length; b++) {
      if (paramArrayOfShort[b] == null) {
        byteArrayOutputStream.write(0);
      } else {
        byteArrayOutputStream.write(paramArrayOfShort[b].length);
        for (byte b1 = 0; b1 < paramArrayOfShort[b].length; b1++) {
          byteArrayOutputStream.write(paramArrayOfShort[b][b1] & 0xFF);
          byteArrayOutputStream.write(paramArrayOfShort[b][b1] >> 8 & 0xFF);
        } 
      } 
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  void drawfire() {
    if (null == this.fire)
      return; 
    this.firec = (byte)(this.firec + 1);
    if (this.firec >= 9)
      this.firec = 0; 
    byte b = (byte)(this.firec / 3);
    int i = this.fire.length;
    int j;
    for (j = 0; j < i; j++) {
      byte b1 = (this.fire[j][1] << 4) + this.map_x;
      byte b2 = (this.fire[j][2] << 4) + this.map_y;
      if (b1 > -16 && b1 < 192 && b2 > -16 && b2 < 224)
        if (this.fire[j][3] == 0) {
          g.drawImage(this.imageFire[this.fire[j][0] + b], b1, b2, 20);
        } else {
          dg.drawImage(this.imageFire[this.fire[j][0] + b], b1, b2, 20, this.fire[j][3]);
        }  
    } 
    if (this.fishA[0] == -1 && this.gameRun.battle_c % 30 == 0 && getRandom(2) == 0)
      for (j = this.fishdata2.length - 1; j >= 0; j--) {
        if (this.mapNo == this.fishdata2[j][0]) {
          int k = getRandom((this.fishdata2[j].length - 1) / 2) * 2 + 1;
          this.fishA[1] = (short)((this.fishdata2[j][k] << 4) - 5 + getRandom(10));
          this.fishA[2] = (short)((this.fishdata2[j][k + 1] << 4) - 5 + getRandom(10));
          this.fishA[3] = (short)getRandom(2);
          this.fishA[4] = (short)getRandom(3);
          this.fishA[0] = 0;
          break;
        } 
      }  
    if (this.fishA[0] >= 0) {
      getFishImage();
      j = (byte)Math.abs(this.fishA[0] % 20 / 2);
      if (this.fishA[3] == 0) {
        g.drawImage(this.imageFish[j], this.fishA[1] + this.fishdata[j][0] + this.map_x, this.fishA[2] + this.fishdata[j][1] + this.map_y, 20);
      } else {
        g;
        g;
        dg;
        dg.drawImage(this.imageFish[j], this.fishA[1] - this.fishdata[j][0] + this.map_x, this.fishA[2] + this.fishdata[j][1] + this.map_y, 0x10 | 0x8, 4);
      } 
      this.fishA[0] = (short)(this.fishA[0] + 1);
      if (this.fishA[4] == 0) {
        if (this.fishA[0] >= 6)
          this.fishA[0] = -1; 
      } else if (this.fishA[0] >= 20) {
        this.fishA[0] = -1;
      } 
    } 
    if (null != this.rabbitA) {
      this.rabbitA[5] = (short)(this.rabbitA[3] - this.my_x + 8);
      this.rabbitA[6] = (short)(this.rabbitA[4] - this.my_y + 8);
      if (this.rabbitA[11] == 1) {
        if (Math.abs(this.rabbitA[5]) < 20 && Math.abs(this.rabbitA[6]) < 20) {
          if (Math.abs(this.rabbitA[5]) < Math.abs(this.rabbitA[6])) {
            if (this.rabbitA[5] > 0) {
              this.rabbitA[0] = 4;
            } else {
              this.rabbitA[0] = 3;
            } 
          } else if (this.rabbitA[6] > 0) {
            this.rabbitA[0] = 2;
          } else {
            this.rabbitA[0] = 1;
          } 
          this.rabbitA[11] = 5;
        } else if (this.rabbitA[1] == 1 && getRandom(10) == 0) {
          this.rabbitA[0] = (short)(getRandom(4) + 1);
        } 
        if (this.rabbitA[3] < this.rabbitA[7]) {
          this.rabbitA[0] = 4;
        } else if (this.rabbitA[4] < this.rabbitA[8]) {
          this.rabbitA[0] = 2;
        } else if (this.rabbitA[3] > this.rabbitA[9]) {
          this.rabbitA[0] = 3;
        } else if (this.rabbitA[4] > this.rabbitA[10]) {
          this.rabbitA[0] = 1;
        } 
      } else if (this.rabbitA[11] > 1) {
        this.rabbitA[11] = (short)(this.rabbitA[11] - 1);
      } 
      if (this.rabbitA[11] > 1) {
        this.rabbitA[1] = (short)(this.rabbitA[1] + 1);
      } else if (this.rabbitA[1] == 1 && getRandom(2) == 0) {
        this.rabbitA[1] = (short)(this.rabbitA[1] + 1);
      } else if (this.rabbitA[1] == 0 && getRandom(5) == 0) {
        this.rabbitA[1] = (short)(this.rabbitA[1] + 1);
      } 
      if (this.rabbitA[1] >= 2)
        this.rabbitA[1] = 0; 
      if (this.rabbitA[1] == 1) {
        this.rabbitA[5] = (short)(this.rabbitA[3] + this.rabbitOffset[0][this.rabbitA[0]]);
        this.rabbitA[6] = (short)(this.rabbitA[4] + this.rabbitOffset[1][this.rabbitA[0]]);
        this.rabbitA[3] = this.rabbitA[5];
        this.rabbitA[4] = this.rabbitA[6];
      } 
      this.rabbitA[2] = (short)(this.rabbitFrame[this.rabbitA[0]] + this.rabbitA[1]);
      if (this.rabbitA[0] != 4) {
        g;
        g;
        g.drawImage(this.imageRabbit[this.rabbitA[2]], this.map_x + this.rabbitA[3], this.map_y + this.rabbitA[4] + 5, true | 0x20);
      } else {
        g;
        g;
        dg;
        dg.drawImage(this.imageRabbit[this.rabbitA[2]], this.map_x + this.rabbitA[3], this.map_y + this.rabbitA[4] + 5, true | 0x20, 4);
      } 
    } 
  }
  
  private void initRabbit() {
    this.fishA[0] = -1;
    this.rabbitA = null;
    for (int i = this.rabbitPos.length - 1; i >= 0; i--) {
      if (this.rabbitPos[i][0] == this.mapNo) {
        this.rabbitA = new short[] { 
            1, 0, 0, (short)(this.rabbitPos[i][1] + 1 << 4), (short)(this.rabbitPos[i][2] + 1 << 4), 0, 0, (short)(this.rabbitPos[i][1] << 4), (short)(this.rabbitPos[i][2] << 4), (short)(this.rabbitPos[i][3] << 4), 
            (short)(this.rabbitPos[i][4] << 4), 1 };
        break;
      } 
    } 
    if (null != this.rabbitA)
      getRabbitImage(); 
  }
  
  void getFire(byte[][] paramArrayOfByte) {
    for (int i = paramArrayOfByte.length - 1; i >= 0; i--) {
      for (int j = paramArrayOfByte[i].length - 1; j >= 0; j--) {
        if (paramArrayOfByte[i][j] != -1 && this.gameRun.firesave[paramArrayOfByte[i][j]][0] != -1) {
          byte[] arrayOfByte = new byte[4];
          arrayOfByte[0] = this.gameRun.firesave[paramArrayOfByte[i][j]][0];
          arrayOfByte[1] = (byte)i;
          arrayOfByte[2] = (byte)j;
          arrayOfByte[3] = this.gameRun.firesave[paramArrayOfByte[i][j]][1];
          this.vfire.addElement(arrayOfByte);
        } 
      } 
    } 
  }
  
  void fireToArray() {
    this.fire = new byte[this.vfire.size()][];
    for (int i = this.vfire.size() - 1; i >= 0; i--)
      this.fire[i] = (byte[])this.vfire.elementAt(i); 
    this.vfire = null;
    if (this.fire.length > 0)
      getFireImage(); 
  }
  
  static int getRandom(int paramInt) { return MainCanvas.getRandom(paramInt); }
  
  private void flash() {
    if (this.flashTimes >= 0) {
      if (this.flashTimes % 2 < 1) {
        g.setColor(15658734);
        g.fillRect(0, 0, 176, 208);
      } 
      this.gameRun.sleep(100);
      this.flashTimes = (byte)(this.flashTimes - 1);
    } 
  }
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/Map.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */