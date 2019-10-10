import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;

public class GameRun extends GameRun_Father {
  byte immueEnemy = 0;
  
  byte MON_MAX_LV = 60;
  
  RecordStore rms;
  
  byte[] canBuy;
  
  short[] sellPrice;
  
  MainCanvas maincanvas;
  
  Map mapP;
  
  byte battleWin = 0;
  
  byte run_state = 1;
  
  byte mini_state = 0;
  
  byte last_state;
  
  byte view_state = 0;
  
  byte select_monster;
  
  byte newRound = 0;
  
  byte select_stateX;
  
  byte state_change;
  
  byte select_stateY;
  
  byte select_stateT;
  
  byte select_stateS;
  
  byte temp_stateS;
  
  byte temp_stateY;
  
  byte temp_stateT;
  
  byte battle_type;
  
  int x;
  
  int y;
  
  int x_offset;
  
  int y_offset;
  
  byte x_speed;
  
  byte y_speed;
  
  byte z_speed = 2;
  
  byte battle_c;
  
  byte frame_c;
  
  short HP_c;
  
  byte createOver;
  
  int money = 0;
  
  public Monster[] myMonster;
  
  public byte monster_takens;
  
  public Monster[] eMonsters;
  
  public byte enemy_takens;
  
  byte[][] enemyList;
  
  public Monster[] monsters;
  
  byte cmon_count;
  
  byte l_count;
  
  Monster A_Monster;
  
  Monster D_Monster;
  
  Monster enemy;
  
  Image[] imgBattle;
  
  Image[] imgMonster = null;
  
  String[] action_str;
  
  String info_string;
  
  byte[][][] items;
  
  byte[] items_count;
  
  byte[] mon_in_battle;
  
  byte LINE_MAX;
  
  short LINE_WIDTH = 144;
  
  byte popMenustate = -1;
  
  byte b = 0;
  
  byte magicNum = 0;
  
  byte skill_no;
  
  byte be_hit;
  
  byte[] skillImage;
  
  byte damage_c;
  
  int damage;
  
  byte[][] 属性相克;
  
  int damage2;
  
  byte doEffectNum = 0;
  
  byte bebbb = -1;
  
  Image[] effectImage;
  
  int cruEffect = 0;
  
  byte ccc = -1;
  
  byte draw_c;
  
  final int[][] selectColor = { { 14070014, 7219375, 10049499, 16447990, 14070014 }, { 11831021, 7219375, 10448383, 15195135, 13744638 } };
  
  short[] price;
  
  byte time_count;
  
  byte LIST_ROWS = 8;
  
  byte[][] fealty = { { 0, 20, 40, 60, 80, 90, 100 }, { 0, 20, 40, 60, 80, 100, 110 }, { 0, 20, 40, 60, 80, 110, 120 } };
  
  byte tempSelect = 0;
  
  byte montalkf;
  
  byte montalkid;
  
  Monster monster;
  
  public int key;
  
  Image tempImage = null;
  
  byte learnSkillID = -1;
  
  byte[][] dataHP;
  
  int[] dataHPColor = { 
      10443007, 10443007, 10443007, 10443007, 10443007, 10443007, 10443007, 7668145, 7668145, 16776960, 
      16776960, 15515137, 15515137 };
  
  int levelADD = 0;
  
  int EXPXISHU = 8;
  
  Image[] boatGif;
  
  Image[] magicGif;
  
  byte lastSkill;
  
  byte lastSkillS;
  
  Image[] uiImage;
  
  Image[] battleImage = null;
  
  Image battleTalkImage = null;
  
  Image[] magicImg;
  
  byte newkindmon;
  
  byte item_type;
  
  byte item_no;
  
  byte[][] skillAI;
  
  byte enemy_skill;
  
  byte say_c;
  
  String word;
  
  final byte[][] firedata = { { 2, 33, 3 }, { 2, 38, 0 }, { 2, 23, 15 }, { 2, 24, 6 }, { 2, 25, 18 }, { 2, 47, 12 }, { 2, 48, 9 } };
  
  byte[][] firesave;
  
  String str_show;
  
  byte say_show_time = 25;
  
  byte mapNsay_c;
  
  byte[] getSkill;
  
  byte[][] jinhua = { { 35, 20, 36 }, { 49, 20, 63 }, { 11, 20, 12 }, { 25, 20, 26 }, { 78, 20, 79 }, { 36, 40, 43 }, { 63, 40, 54 }, { 12, 40, 9 }, { 26, 40, 25 }, { 79, 40, 72 } };
  
  byte[][][] monster_appear = (byte[][][])null;
  
  byte[][] A;
  
  String[] skill_help;
  
  byte[][] monborn;
  
  String[] skillT;
  
  String[] item_help;
  
  String[] item_name;
  
  String[] city_name;
  
  String[] text;
  
  String[] win;
  
  final int[] uiColor = { 0, 5308790, 6479320, 11476991, 16777215 };
  
  final int[] buttonColor = { 7158528, 8519882, 16777215, 7419587, 5308790, 5842596 };
  
  final int battleColor = 16773328;
  
  byte maxpage;
  
  byte[] catchedMon = new byte[101];
  
  byte[][] maggie;
  
  byte[][][][] magicOrder;
  
  byte[][] monster_pro;
  
  byte[][] monster_skill;
  
  String[] NAME;
  
  byte[][] skill;
  
  String[] skill_name;
  
  byte[][] skill_up;
  
  byte[][][] uiData;
  
  String[][] monSay;
  
  short[][] mapdataMap;
  
  byte[][] mapdataArea;
  
  short[][][] mapdataDoor;
  
  String[][] mapinfos;
  
  byte[][] mapinfo;
  
  byte catchKind = 0;
  
  byte showArea = -1;
  
  byte showmapc;
  
  Image[] imageTemp;
  
  Image[] imageJingying;
  
  byte bankTime = 0;
  
  int bankMoney;
  
  byte bankjiantou = 0;
  
  byte[] tempMoney = new byte[7];
  
  String[] textBank;
  
  public byte bankItem;
  
  Image imageNum = null;
  
  byte[] guess;
  
  byte[] guessJiang = { 
      0, 0, 4, 1, 3, 8, 2, 9, 6, 7, 
      33, 34, -100 };
  
  byte cheat = 0;
  
  byte mapid;
  
  byte levelid;
  
  byte God = 0;
  
  byte cheatSkill = -1;
  
  String[] cheatShow = { "调试模式 *返回", "0不遇敌", "1地图跳转", "上 改npc", "左 得道具", "右 战斗逃跑", "3 win", "7进入战斗", "9得到道具", "#得到怪兽" };
  
  static final byte GAME_SMS = 88;
  
  static final byte BUY_BAG = -14;
  
  int COLOR_CHAR = 16777215;
  
  byte sendSms = 0;
  
  byte buyState = 0;
  
  boolean deathType = false;
  
  String[] smsTitle = { "购买金币", "多倍经验", "道具包", "扩充电脑", "开启关卡", "战斗复活" };
  
  String[] smsStr;
  
  boolean heroLeveUp = false;
  
  byte itemShow;
  
  byte multiExp = 1;
  
  byte MAX_MONSTERS = 5;
  
  byte dazhe;
  
  byte dazheNum = 70;
  
  String noMoney = "金钱不足！可按左软键购买，还有超值礼包。";
  
  String[] deathStr = { "您要使用还魂瓶原地复活并且恢复您的所有怪物吗？" };
  
  public GameRun(MainCanvas paramMainCanvas) {
    this.maincanvas = paramMainCanvas;
    createText();
    this.imgBattle = new Image[5];
    this.imgMonster = new Image[2];
  }
  
  void createText() { this.text = loadText("text"); }
  
  void goMAIN_MENU() { this.maincanvas.game_state = 61; }
  
  void goMAIN_MENU2() {
    String[] arrayOfString = { this.text[102], this.text[103], this.text[104], this.text[105], this.text[106], this.text[107], "qq游戏中心" };
    this.action_str = arrayOfString;
    setNull();
    this.mapP = null;
    this.myMonster = null;
    this.monsters = null;
    this.enemy = null;
    this.select_stateY = 0;
    this.select_stateX = 6;
    this.maincanvas.imageMenu = new Image[2][];
    this.maincanvas.imageMenu[0] = this.maincanvas.createImageArray(7, "menu");
    this.maincanvas.imageMenu[1] = this.maincanvas.createImageArray(9, "menu2");
  }
  
  void setNull() {
    if (null != this.mapP)
      this.mapP.setNull(); 
    this.imgBattle[4] = null;
    this.imgMonster[0] = null;
    this.imgMonster[1] = null;
    data_null();
  }
  
  void start() {
    rmsOptions(0, null, 3);
    continue_game();
  }
  
  void doPaint(int paramInt) {
    this.maincanvas.game_state = 21;
    this.maincanvas.battle_c = (short)(byte)paramInt;
    this.maincanvas.paint();
  }
  
  void continue_game() {
    doPaint(0);
    doPaint(1);
    this.mapP = new Map(this);
    doPaint(2);
    init();
    doPaint(3);
    goRUN_IN_MAP(-1);
    doPaint(4);
    this.LINE_MAX = 2;
    doPaint(5);
    this.mapP.beginMusic();
    doPaint(6);
    data_init();
    doPaint(7);
    this.mapNsay_c = 3;
    doPaint(8);
    System.gc();
    doPaint(9);
    doPaint(10);
    doPaint(11);
    this.mapP.initScreenTemp();
    for (byte b1 = 12; b1 <= 27; b1 = (byte)(b1 + 1))
      doPaint(b1); 
    this.maincanvas.game_state = 30;
    this.run_state = -10;
    this.maincanvas.dialog = null;
    this.uiImage[16] = null;
    this.uiImage[17] = null;
    rmsOptions(0, null, 4);
  }
  
  void saveGame() {
    this.mapP.save();
    saveMon(0);
    saveMon(1);
    saveItem();
    rmsOptions(0, null, 4);
  }
  
  public void gameRun_run() {
    switch (this.run_state) {
      case -87:
        if (this.battle_c == 0)
          hit_rate(); 
        break;
      case -11:
        if (this.battle_c >= 4)
          goRUN_IN_MAP(this.maincanvas.musicId); 
        break;
      case -10:
        this.mapP.map_run();
        break;
      case -30:
        if (this.createOver == 1) {
          this.createOver = 2;
          new CreateThread(this, 1);
        } 
        break;
      case 100:
        if (this.battle_c == 1) {
          saveGame();
          this.battle_c = 0;
          goRUN_IN_MAP(this.maincanvas.musicId);
        } 
        break;
      case -50:
        this.createOver = 3;
        break;
      case -70:
        if (this.createOver == 1) {
          this.createOver = 2;
          new CreateThread(this, this.mini_state);
        } 
        if (this.mini_state != 0) {
          getAttackTurn();
          return;
        } 
        break;
      case -15:
        if (this.battle_c == 100) {
          battle_over();
          goGO_RUNINMAP();
        } 
        break;
      case -60:
        if (this.createOver == 1) {
          this.createOver = 2;
          new CreateThread(this, 16);
        } 
        break;
      case 55:
        if (this.createOver == 1) {
          getCoMonImage();
          this.createOver = 3;
        } 
        break;
      case 45:
        if (this.createOver == 1 && this.l_count > 0) {
          this.imgMonster[0] = null;
          getCoMonImage();
          data_init();
          this.createOver = 3;
        } 
        break;
      case 35:
        if (this.createOver == 1 && this.monster_takens > 0) {
          this.createOver = 2;
          this.imgBattle[0] = null;
          getMyMonImage();
          this.createOver = 3;
        } 
        break;
      case 88:
        runSms();
        break;
    } 
  }
  
  void paintPAUSE(int paramInt1, int paramInt2) {
    if (this.select_stateX == 1) {
      this.g.translate(0, -20);
      showString(this.maincanvas.strTemp, 8, 170);
      this.g.translate(0, 20);
      queding();
      quxiao();
      return;
    } 
    for (byte b1 = 0; b1 < this.action_str.length; b1++) {
      drawButton(paramInt1 + 32, paramInt2 + 22 * b1, (b1 == this.select_stateY), 62);
      if (b1 == this.select_stateY) {
        this.g.setColor(this.buttonColor[0]);
      } else {
        this.g.setColor(this.buttonColor[1]);
      } 
      this.g;
      this.g;
      this.g.drawString(this.action_str[b1], paramInt1 + 32, paramInt2 + 22 * b1 + 2, 0x10 | true);
      if (this.action_str[b1].equals(this.text[104]))
        if (this.maincanvas.sound_play) {
          this.g.drawString(this.text[110], paramInt1 + 57 - 15, paramInt2 + 22 * b1 + 2, 20);
        } else {
          this.g.drawString(this.text[111], paramInt1 + 57 - 15, paramInt2 + 22 * b1 + 2, 20);
        }  
    } 
    drawButton(146, 186, true, 62);
    this.g.setColor(3473558);
    this.g.drawImage(this.uiImage[19], 121, 193, 20);
    this.g;
    this.g;
    this.g.drawString(String.valueOf(this.money), 171, 204, 0x8 | 0x20);
  }
  
  public void gameRun_paint(Graphics paramGraphics) {
    byte b3;
    byte b2;
    byte b1;
    this.g = paramGraphics;
    this.dg = DirectUtils.getDirectGraphics(paramGraphics);
    switch (this.run_state) {
      case -10:
        this.mapP.map_paint(paramGraphics);
        if (this.showArea != -1)
          drawMap(); 
        this.battle_c = (byte)(this.battle_c + 1);
        break;
      case 41:
        blueBg();
        paramGraphics.setClip(0, 0, 176, 41);
        drawUI(2, paramGraphics, this.popMenustate, 20, null);
        paramGraphics.setClip(0, 0, 176, 208);
        paramGraphics.setColor(16777215);
        paramGraphics;
        paramGraphics;
        paramGraphics.drawString("原地复活", 88, 16, true | 0x10);
        b1 = 40;
        drawRichText2(0, b1, 176, this.maincanvas.dialog.length * 18 + 8, 15452159, 10448383, 3473558);
        for (b2 = 0; b2 < this.maincanvas.dialog.length; b2++) {
          paramGraphics;
          paramGraphics;
          paramGraphics.drawString(this.maincanvas.dialog[b2].toString(), 88, b1 + 18 * b2 + 4, true | 0x10);
        } 
        queding();
        quxiao();
        break;
      case 40:
        this.maincanvas.drawRectBG();
        showString(this.text[125], 8, 170);
        break;
      case 98:
        this.maincanvas.drawRectBG();
        drawPopMenu(88, 208 - 16 * this.action_str.length - 4 >> 1, 16, 24);
        showString("任意键返回", 8, 170);
        break;
      case -15:
        paintBATTLE_OVER();
        break;
      case -93:
        paintMY_EFFECT();
        break;
      case -85:
        paintMY_ATTACK();
        break;
      case -87:
        paintENEMY_BE_HIT();
        break;
      case -91:
        paintADD_EFFECT();
        break;
      case -70:
        drawBattleArea();
        if (this.frame_c < 6) {
          this.frame_c = (byte)(this.frame_c + 1);
        } else {
          this.frame_c = 0;
        } 
        drawActionMenu();
        paramGraphics.setColor(16773328);
        paramGraphics.drawString(getMonName((this.myMonster[0]).monster[16]), 13, 163, 20);
        paramGraphics.drawString(this.text[0] + this.text[88], 26, 181, 20);
        break;
      case -80:
        drawBattleArea();
        drawSkillSelectMenu();
        break;
      case -11:
        if (this.battle_c < 4) {
          this.dg.setARGBColor(1345532723);
          paramGraphics.fillRect(0, 0, 176, 208);
          this.battle_c = (byte)(this.battle_c + 1);
        } 
        break;
      case -30:
        drawDarkScreen();
        this.battle_c = (byte)(this.battle_c + 1);
        if (this.createOver == 3 && this.battle_c >= 8) {
          drawBattleBG();
          if (this.battle_type == 1) {
            this.run_state = -50;
          } else {
            goENEMY_THROW();
          } 
          this.createOver = 1;
          this.battle_c = 0;
        } 
        break;
      case 100:
        this.battle_c = 1;
        showString(this.text[86] + this.text[87] + this.text[90] + this.text[16], 8, 170);
        break;
      case 51:
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 0, 176, 208);
        if (this.mapP.dialog_no >= 0)
          this.mapP.dialog(0, 0, 8, 6, 176, 214); 
        queding();
        break;
      case 50:
        if (this.action_str == null) {
          byte[] arrayOfByte = new byte[101];
          byte b4;
          for (b4 = 0; b4 < this.monster_takens; b4++)
            arrayOfByte[(this.myMonster[b4]).monster[16]] = 1; 
          for (b4 = 0; b4 < this.cmon_count; b4++)
            arrayOfByte[(this.monsters[b4]).monster[16]] = 1; 
          b4 = 0;
          for (byte b5 = 0; b5 < arrayOfByte.length; b5++) {
            if (arrayOfByte[b5] == 1)
              b4++; 
          } 
          this.skip = 0;
          this.action_str = loadText("win");
          this.action_str[0] = this.action_str[0] + b4;
          this.action_str[0] = this.action_str[0] + this.action_str[6];
        } 
        drawRichText(0, 0, 176, 207, 15452159, 10448383, 3473558);
        paramGraphics.setColor(4802889);
        b2 = 8;
        for (b3 = 0; b3 < 6; b3++)
          paramGraphics.drawString(this.action_str[b3], b2, 20 + 18 * b3, 20); 
        paramGraphics.setColor(16777215);
        paramGraphics;
        paramGraphics;
        paramGraphics.drawString(this.text[140], 99, 129, true | 0x10);
        paramGraphics.setColor(9437439);
        paramGraphics;
        paramGraphics;
        paramGraphics.drawString(this.text[140], 98, 129, true | 0x10);
        queding();
        break;
      case -22:
        this.battle_c = (byte)(this.battle_c + 1);
        drawBattleBG();
        if (this.battle_c < 5) {
          this.battle_c = (byte)(this.battle_c + 1);
          throwBall(this.battle_c, 6);
          break;
        } 
        if (this.battle_c < 12) {
          drawEnemy();
          goTalkBattle();
        } 
        break;
      case -50:
        drawBattleBG();
        paramGraphics.setColor(1075637);
        paramGraphics.fillArc((this.battle_c << 3) - 18, 62, 36, 7, 0, 360);
        paramGraphics;
        paramGraphics;
        paramGraphics.drawImage(this.imgMonster[1], this.battle_c << 3, 67, true | 0x20);
        if (this.battle_c < 17) {
          this.battle_c = (byte)(this.battle_c + 1);
          break;
        } 
        if (this.createOver == 3)
          goTalkBattle(); 
        break;
      case -60:
        drawAll();
        if (this.battle_c < 15) {
          this.battle_c = (byte)(this.battle_c + 1);
          throwBall(this.battle_c, 1);
          break;
        } 
        if (this.createOver == 3)
          goSELECT_ACTION(); 
        break;
      case 25:
        drawMY_BAG();
        break;
      case 18:
      case 19:
        drawBUY_ITEM();
        break;
      case 35:
        this.l_count = this.monster_takens;
        drawMONSTER_LIST(this.myMonster);
        break;
      case 65:
        blueBg();
        drawUI(2, paramGraphics, this.popMenustate, 20, null);
        paramGraphics.setColor(16777215);
        paramGraphics;
        paramGraphics;
        paramGraphics.drawString("操作怪兽", 88, 10, true | 0x10);
        for (b3 = 0; b3 < this.action_str.length; b3++) {
          drawButton(88, 60 + b3 * 23, (b3 == this.popMenustate), 66);
          if (b3 == this.popMenustate) {
            paramGraphics.setColor(this.buttonColor[0]);
          } else {
            paramGraphics.setColor(this.buttonColor[1]);
          } 
          paramGraphics;
          paramGraphics;
          paramGraphics.drawString(this.action_str[b3], 88, 62 + b3 * 23, true | 0x10);
        } 
        queding();
        quxiao();
        break;
      case 45:
        this.l_count = this.cmon_count;
        drawMONSTER_LIST(this.monsters);
        break;
      case 55:
        drawSEE_MONSTER();
        break;
      case -19:
        drawBattleArea();
        if (this.battle_c < 16) {
          throwBall(this.battle_c, 2);
          showString(this.text[1] + getItemName(this.catchKind), 8, 162);
          break;
        } 
        if (this.battle_c < 17) {
          this.be_hit = -2;
          paramGraphics.drawImage(this.imgBattle[2], this.x, this.y - 5, 20);
          break;
        } 
        if (this.battle_c == 17) {
          b3 = 40 - 2 * this.enemy.monster[11] + (this.enemy.max_hp - this.enemy.hp) * 100 / (this.enemy.max_hp + 120);
          if (this.catchKind == 5) {
            b3 += 20;
          } else if (this.catchKind == 6) {
            b3 += 60;
          } else if (this.catchKind == 7) {
            b3 = 100;
          } 
          if (b3 < 0)
            b3 = 0; 
          if (this.catchKind == 5 || this.catchKind == 6)
            b3 = b3 * (100 - this.monster_pro[this.enemy.monster[16]][12] / 3) / 100; 
          if (this.enemy.monster[11] <= 3)
            b3 = 100; 
          if (this.cmon_count == this.MAX_MONSTERS && this.monster_takens == 5) {
            showString("电脑" + this.text[42] + this.text[44] + this.text[91] + "请扩充空间！", 8, 162);
            deleteItems(this.catchKind, 1);
            sleep(800);
            break;
          } 
          if (getRandom(100) < b3) {
            paramGraphics.drawImage(this.imgBattle[2], this.x, this.y, 20);
            showString(getMonName(this.enemy.monster[16]) + this.text[3], 8, 162);
            this.enemy.catchMonFealty();
            boolean bool = false;
            if (this.catchedMon[this.enemy.monster[16]] == 0)
              bool = true; 
            getMonster();
            byte b4 = 0;
            byte b5 = 0;
            if (bool) {
              b5 = getmonNum();
              byte b6;
              for (b6 = 0; b6 < this.mapP.catchNum.length; b6 = (byte)(b6 + 1)) {
                if (b5 == this.mapP.catchNum[b6]) {
                  b4 = b6;
                  break;
                } 
              } 
            } 
            deleteItems(this.catchKind, 1);
            sleep(500);
            arangeMonster();
            battle_over();
            goGO_RUNINMAP();
            if (b4 != 0) {
              this.mapP.npcName = null;
              this.mapP.getDialogs(this.text[165] + b5 + this.text[166]);
              this.mapP.dialog_no = 0;
              this.mapP.my_state = 1;
            } 
            break;
          } 
          this.be_hit = 0;
          drawEnemy();
          deleteItems(this.catchKind, 1);
          showString(getMonName(this.enemy.monster[16]) + this.text[4], 8, 162);
          sleep(500);
          break;
        } 
        this.mini_state = 16;
        goSELECT_ACTION();
        break;
      case 99:
        this.mapP.map_paint(paramGraphics);
        this.x += 20;
        if (this.x > 5)
          this.x = 5; 
        paintPAUSE(this.x, 1);
        break;
      case 21:
        drawtujian();
        break;
      case 22:
        drawBank();
        break;
      case 23:
        drawGuess();
        break;
      case 88:
        paintSms();
        break;
    } 
    if (null != this.mapP && this.mapP.my_state != -77) {
      if (this.say_c != 0)
        flashString(); 
      mapNameSay();
    } 
    if (this.cheat != 0)
      cheatPaint(); 
  }
  
  void sleep(int paramInt) { this.maincanvas.sleep_time = paramInt; }
  
  void myAttack() {
    switch (this.skill_no) {
      case 0:
      case 17:
      case 18:
      case 29:
      case 30:
        if (this.battle_c == 1) {
          this.x_offset = 6;
          this.y_offset = this.be_hit * 5;
        } else {
          this.x_offset = 0;
          this.y_offset = 0;
        } 
        if (this.battle_c == 4) {
          this.battle_c = 100;
          this.be_hit = (byte)-this.be_hit;
        } 
        return;
    } 
    if (this.battle_c <= 4) {
      this.x_offset = 0;
      this.y_offset = -this.battle_c;
    } else {
      this.x_offset = 0;
      this.y_offset = 0;
    } 
    if (this.battle_c == 4) {
      this.battle_c = 100;
      this.be_hit = (byte)-this.be_hit;
    } 
  }
  
  void doSkillAttack() {
    short s = 0;
    byte b1 = 0;
    byte b2 = 0;
    if (this.be_hit != -1) {
      s = 136;
      b1 = 67;
    } else {
      s = 38;
      b1 = 125;
    } 
    if (this.skill_no == 41) {
      b2 = this.magicNum;
    } else {
      b2 = this.magicNum / 2;
    } 
    if (this.maggie[this.skill_no].length > 0) {
      if (this.magicOrder[this.maggie[this.skill_no][0]][b2].length == 0) {
        this.x_offset = 3 * (this.battle_c & true);
        this.y_offset = 0;
      } else {
        for (byte b3 = 0; b3 < this.magicOrder[this.maggie[this.skill_no][0]][b2].length; b3++) {
          if (this.magicOrder[this.maggie[this.skill_no][0]][b2][b3][3] == 100) {
            this.g.drawImage(this.magicImg[this.magicOrder[this.maggie[this.skill_no][0]][b2][b3][0]], s + this.magicOrder[this.maggie[this.skill_no][0]][b2][b3][1], b1 + this.magicOrder[this.maggie[this.skill_no][0]][b2][b3][2], 20);
          } else {
            this.g;
            this.g;
            this.g.drawImage(this.magicImg[this.magicOrder[this.maggie[this.skill_no][0]][b2][b3][0]], s + this.magicOrder[this.maggie[this.skill_no][0]][b2][b3][1], b1 + this.magicOrder[this.maggie[this.skill_no][0]][b2][b3][2], true | 0x20);
          } 
        } 
      } 
      this.magicNum = (byte)(this.magicNum + 1);
      if (b2 >= this.magicOrder[this.maggie[this.skill_no][0]].length - 1) {
        this.battle_c = 49;
        this.magicNum = 0;
        b2 = 0;
      } 
    } else if (this.battle_c <= 2) {
      this.x_offset = -3;
      this.y_offset = 0;
    } else if (this.battle_c == 3) {
      this.battle_c = 49;
    } 
  }
  
  void drawEffect() {
    switch (this.skill_no) {
      case 15:
      case 17:
      case 18:
      case 27:
      case 39:
      case 47:
        if (this.battle_c == 1)
          this.be_hit = (byte)-this.be_hit; 
        showString(this.text[119] + this.text[19], 8, 162);
        drawAddHP(this.skill[this.skill_no][3]);
        if (this.battle_c == 4) {
          AddHp(this.skill[this.skill_no][3], this.A_Monster);
          attackOver();
        } 
        return;
      case 13:
      case 25:
      case 37:
      case 46:
        if (this.D_Monster.effect[2][0] <= 0 && getRandom(100) <= this.skill[this.skill_no][3]) {
          showString(this.text[133] + this.text[19], 8, 162);
          this.D_Monster.effect[2][0] = -12;
          this.D_Monster.effect[2][1] = 2;
          this.D_Monster.effect[2][2] = 1;
          sleep(300);
        } 
        attackOver();
        return;
      case 7:
      case 19:
      case 31:
      case 43:
        if (this.D_Monster.effect[4][0] <= 0 && getRandom(100) <= this.skill[this.skill_no][3])
          if (this.D_Monster.monster[13] == 11) {
            showString(this.text[36] + getItemName(11) + this.text[90] + this.text[18] + this.text[24] + this.text[91], 8, 162);
          } else {
            showString(this.text[18] + this.text[19], 8, 162);
            this.D_Monster.effect[4][0] = -14;
            this.D_Monster.effect[4][1] = 2;
            this.D_Monster.effect[4][2] = 1;
            sleep(300);
          }  
        attackOver();
        return;
      case 11:
      case 23:
      case 35:
      case 45:
        if (this.D_Monster.effect[1][0] <= 0 && getRandom(100) <= this.skill[this.skill_no][3])
          if (this.D_Monster.monster[13] == 13) {
            showString(this.text[36] + getItemName(13) + this.text[90] + this.text[18] + this.text[121] + this.text[91], 8, 162);
          } else {
            showString(this.text[121] + this.text[19], 8, 162);
            this.D_Monster.effect[1][0] = -11;
            this.D_Monster.effect[1][1] = 2;
            this.D_Monster.effect[1][2] = 1;
            sleep(300);
          }  
        attackOver();
        return;
      case 41:
      case 42:
        if (this.D_Monster.effect[3][0] <= 0) {
          if (getRandom(100) <= this.skill[this.skill_no][3]) {
            if (this.D_Monster.monster[13] == 14) {
              showString(this.text[36] + getItemName(14) + this.text[90] + this.text[18] + this.text[134] + this.text[91], 8, 162);
            } else {
              showString(this.text[134] + this.text[19], 8, 162);
              this.D_Monster.effect[3][0] = -13;
              this.D_Monster.effect[3][1] = 3;
              this.D_Monster.effect[3][2] = 1;
            } 
            sleep(300);
          } 
          attackOver();
        } 
        return;
      case 9:
      case 21:
      case 33:
      case 44:
        if (this.D_Monster.effect[0][0] <= 0 && getRandom(100) <= this.skill[this.skill_no][3]) {
          if (this.D_Monster.monster[13] == 12) {
            showString(this.text[36] + getItemName(12) + this.text[90] + this.text[18] + this.text[135] + this.text[91], 8, 162);
          } else {
            showString(this.text[135] + this.text[19], 8, 162);
            this.D_Monster.effect[0][0] = -10;
            this.D_Monster.effect[0][1] = 4;
          } 
          sleep(300);
        } 
        attackOver();
        return;
    } 
    attackOver();
  }
  
  void damageGO() {
    if (this.damage_c >= 10) {
      magicDamage();
    } else if (this.damage_c >= 2) {
      this.x_offset = 0;
      this.damage_c = (byte)(this.damage_c + 1);
      if (this.damage_c == 5)
        this.damage_c = 100; 
    } 
    if (this.damage_c == 100)
      this.battle_c = 100; 
  }
  
  void paintADD_EFFECT() {
    drawBattleArea();
    drawEffect();
  }
  
  void fieldBattle() { this.battle_type = 1; }
  
  void matchBattle() { this.battle_type = -1; }
  
  byte[] setSkillImage() {
    int i = 0;
    byte[] arrayOfByte1 = new byte[1000];
    int j = 0;
    byte b1;
    for (b1 = 0; b1 < this.enemy_takens; b1++) {
      if ((this.eMonsters[b1]).monster[0] > 1)
        for (byte b2 = 0; b2 < (this.eMonsters[b1]).monster[0]; b2++) {
          j = this.maggie[(this.eMonsters[b1]).monster[1 + b2 * 2]].length - 1;
          if (j >= 1) {
            System.arraycopy(this.maggie[(this.eMonsters[b1]).monster[1 + b2 * 2]], 1, arrayOfByte1, i, j);
            i += j;
            j = 0;
          } 
          j = 0;
        }  
    } 
    for (b1 = 0; b1 < this.monster_takens; b1++) {
      if ((this.myMonster[b1]).monster[0] > 1)
        for (byte b2 = 0; b2 < (this.myMonster[b1]).monster[0]; b2++) {
          j = this.maggie[(this.myMonster[b1]).monster[1 + b2 * 2]].length - 1;
          if (j >= 1) {
            System.arraycopy(this.maggie[(this.myMonster[b1]).monster[1 + b2 * 2]], 1, arrayOfByte1, i, j);
            i += j;
          } 
          j = 0;
        }  
    } 
    byte[] arrayOfByte2 = new byte[i];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, i);
    i = 0;
    return arrayOfByte2;
  }
  
  void enemy_init() {
    this.enemy_takens = (byte)this.enemyList.length;
    this.eMonsters = new Monster[this.enemyList.length];
    for (byte b1 = 0; b1 < this.enemyList.length; b1++) {
      this.eMonsters[b1] = new Monster(this, this.enemyList[b1][0], this.enemyList[b1][1]);
      (this.eMonsters[b1]).monster[12] = (byte)b1;
    } 
    this.enemy = this.eMonsters[0];
  }
  
  void goBattle() {
    this.mapP.imageGuochang = null;
    this.mon_in_battle = new byte[6];
    this.mini_state = 0;
    this.be_hit = 0;
    enemy_init();
    this.lastSkill = -1;
    this.newRound = 0;
    resetParam();
    createBattleImage();
    for (byte b1 = 0; b1 < this.monster_takens; b1++) {
      (this.myMonster[b1]).effect = new byte[6][3];
      (this.myMonster[b1]).monster[12] = (byte)b1;
    } 
    this.damage_c = 0;
    if (this.effectImage == null)
      this.effectImage = this.maincanvas.createImageArray(5, "image"); 
  }
  
  void reduceDamage(int paramInt) {
    this.HP_c = (short)(paramInt >> 2);
    if (this.damage != 0)
      this.HP_c = (short)(this.HP_c + 1); 
  }
  
  void damage() {
    this.damage2 = 0;
    this.damage = (this.skill[this.skill_no][0] + this.A_Monster.monster[11]) * (115 - this.A_Monster.monster[11]) / ('È' - this.skill[this.skill_no][0]);
    if (this.D_Monster.monster[11] - this.A_Monster.monster[11] >= 14) {
      this.damage = this.damage * 16 / 100;
    } else if (this.A_Monster.monster[11] - this.D_Monster.monster[11] >= 14) {
      this.damage = this.damage * 184 / 100;
    } else {
      this.damage = this.damage * (100 + (this.A_Monster.monster[11] - this.D_Monster.monster[11]) * 6) / 100;
    } 
    this.damage2 = 3 * this.A_Monster.monster[22 + this.skill[this.skill_no][2]];
    byte[] arrayOfByte = { 24, 25, 22, 23, 26 };
    int i;
    for (i = 0; i < 5; i++) {
      if (this.skill[this.skill_no][2] == i && findItem(arrayOfByte[i])) {
        if (this.mini_state == 32) {
          this.damage2 -= 10;
          break;
        } 
        this.damage2 += 10;
        break;
      } 
    } 
    for (i = 0; i < this.skillT.length - 1; i++) {
      if (this.skill[this.skill_no][2] == this.属性相克[i][0] && this.D_Monster.monster[21] == this.属性相克[i][1]) {
        this.damage2 += 50;
        break;
      } 
      if (i < 5 && this.skill[this.skill_no][2] == this.属性相克[i + 7][0] && this.D_Monster.monster[21] == this.属性相克[i + 7][1]) {
        this.damage2 -= 35;
        break;
      } 
    } 
    if (this.skill[this.skill_no][2] == this.D_Monster.monster[21])
      this.damage2 -= 10; 
    i = this.A_Monster.dex - this.D_Monster.dex;
    if (i > 5) {
      i = 5;
    } else if (i < -5) {
      i = -5;
    } 
    this.damage2 += i;
    this.damage = this.damage * (this.damage2 + 100) / 100;
    if (this.mini_state != 32) {
      short[][] arrayOfShort = { { 80, 80 }, { 90, 100 }, { 100, 120 }, { 110, 140 } };
      short s = (short)this.A_Monster.monster[30];
      for (int j = arrayOfShort.length - 1; j >= 0; j--) {
        if (this.A_Monster.monster[30] >= arrayOfShort[j][0]) {
          s = arrayOfShort[j][1];
          break;
        } 
      } 
      this.damage = this.damage * s / 100;
    } else {
      this.damage = this.damage * 80 / 100;
    } 
    if (this.God == 1)
      this.damage = 0; 
  }
  
  void effectR(Monster paramMonster, int paramInt1, int paramInt2) {
    if (paramMonster.effect[paramInt1][1] > 0 && paramInt2 == 0)
      paramMonster.effect[paramInt1][1] = (byte)(paramMonster.effect[paramInt1][1] - 1); 
    if (paramInt2 == 1 && paramMonster.effect[paramInt1][1] == 0) {
      paramMonster.effect[paramInt1][0] = 0;
      paramMonster.effect[paramInt1][2] = 0;
    } 
  }
  
  void hit_rate() {
    short s = 0;
    if (this.skill_no >= 31 || (this.skill_no < 31 && this.skill_no >= 19 && this.skill_no % 2 == 1)) {
      s = 100;
    } else {
      s = this.A_Monster.dex - this.D_Monster.dex;
      if (s > 0) {
        s = 95 + s * 27 / 100;
      } else {
        s = 90 + s * 270 / 100;
      } 
    } 
    if (this.skill_no > 19 && this.skill_no < 31 && s % 3 == 1)
      s += 15; 
    for (byte b1 = 0; b1 < this.skillT.length - 1; b1++) {
      if (this.skill[this.skill_no][2] == this.属性相克[b1][0] && this.D_Monster.monster[21] == this.属性相克[b1][1]) {
        s = 100;
        break;
      } 
    } 
    this.HP_c = 0;
    if (getRandom(100) < s) {
      this.damage_c = 10;
      damage();
      reduceDamage(this.damage);
    } else {
      this.damage_c = 2;
    } 
  }
  
  void goME_DIE() {
    showString(getMonName((this.myMonster[0]).monster[16]) + this.text[6] + this.text[91], 8, 162);
    sleep(500);
    this.mini_state = 10;
    resetParam();
    goSELECT_ACTION();
  }
  
  void goENEMY_DIE() {
    this.damage = 0;
    this.damage_c = -100;
    showString(getMonName(this.enemy.monster[16]) + this.text[6] + this.text[91], 8, 162);
    sleep(500);
    this.be_hit = -2;
    this.battle_c = 0;
    byte b1 = this.enemy.monster[12];
    changeEnemy();
    if (b1 != this.enemy.monster[12]) {
      this.mini_state = 32;
      this.newRound = 1;
      this.createOver = 1;
      goSELECT_ACTION();
    } else {
      this.run_state = -15;
      this.mini_state = 0;
      this.battle_c = 0;
    } 
  }
  
  void magicDamage() {
    if (this.damage_c < 50)
      this.damage_c = (byte)(this.damage_c + 1); 
    if (this.D_Monster.hp <= -120) {
      if (this.mini_state == 32) {
        goME_DIE();
        return;
      } 
      goENEMY_DIE();
      return;
    } 
    if (this.damage == 0) {
      this.damage_c = 100;
      return;
    } 
    if (this.damage_c >= 10)
      if (this.damage - this.HP_c >= 0) {
        this.damage -= this.HP_c;
        removeHp(-this.HP_c, this.D_Monster);
      } else {
        removeHp(-this.damage, this.D_Monster);
        this.damage = 0;
      }  
  }
  
  void doEffect() {
    if (this.battle_c == 100) {
      this.doEffectNum = (byte)(this.doEffectNum + 1);
      if (this.doEffectNum > 5) {
        resetParam();
        this.doEffectNum = 0;
        this.run_state = -85;
      } else {
        this.battle_c = 0;
      } 
      return;
    } 
    switch (this.A_Monster.effect[this.doEffectNum][0]) {
      case 19:
        showString(getMonName(this.A_Monster.monster[16]) + this.text[17] + this.text[19], 8, 162);
        if (this.battle_c < 5) {
          drawAddHP(5);
          showString(getMonName(this.A_Monster.monster[16]) + this.text[17] + this.text[19], 8, 162);
          sleep(300);
          break;
        } 
        AddHp(5, this.A_Monster);
        this.battle_c = 100;
        break;
      case -14:
        if (this.battle_c < 5) {
          showString(getMonName(this.A_Monster.monster[16]) + this.text[122] + this.text[18] + this.text[136], 8, 162);
          if (this.mini_state == 32) {
            attackOver();
          } else {
            this.bebbb = 0;
          } 
          sleep(300);
          break;
        } 
        this.battle_c = 100;
        break;
      case -12:
        doEffect(5, "在" + this.text[133], false);
        break;
      case -10:
        doEffect(5, this.text[135] + this.text[136], false);
        break;
      case -11:
        doEffect(3, this.text[122] + this.text[121] + this.text[136], true);
        if (this.mini_state == 32) {
          attackOver();
          break;
        } 
        this.bebbb = 0;
        break;
      case -13:
        if (this.battle_c < 5) {
          showString(getMonName(this.A_Monster.monster[16]) + this.text[122] + this.text[134] + this.text[136], 8, 162);
          if (this.mini_state == 32) {
            attackOver();
          } else {
            this.bebbb = 0;
          } 
          sleep(300);
        } else {
          this.battle_c = 100;
        } 
      default:
        this.battle_c = 100;
        break;
    } 
    if (this.doEffectNum == 5) {
      if (this.A_Monster.effect[1][0] < 0 && this.A_Monster.effect[2][0] < 0) {
        attackOver();
        this.doEffectNum = 0;
        return;
      } 
      if (this.A_Monster.effect[4][0] < 0 && this.A_Monster.effect[2][0] < 0) {
        attackOver();
        this.doEffectNum = 0;
        return;
      } 
      if (this.bebbb == 0) {
        this.bebbb = -1;
        this.doEffectNum = 0;
        attackOver();
        return;
      } 
    } 
  }
  
  void doEffect(int paramInt, String paramString, boolean paramBoolean) {
    if (this.battle_c < 5) {
      drawAddHP(-paramInt);
      showString(getMonName(this.A_Monster.monster[16]) + paramString, 8, 162);
      sleep(300);
    } else {
      removeHp(-paramInt, this.A_Monster);
      this.battle_c = 100;
      if (this.mini_state == 32 && paramBoolean)
        attackOver(); 
      if ((this.myMonster[0]).hp <= -120) {
        drawMyMonsterState();
        this.doEffectNum = 4;
        goME_DIE();
      } else if (this.enemy.hp <= -120) {
        drawEnemyState();
        this.doEffectNum = 4;
        goENEMY_DIE();
      } 
    } 
  }
  
  void drawAddHP(int paramInt) {
    String str = null;
    if (paramInt > 0) {
      this.g.setColor(65280);
      str = this.text[92] + paramInt;
    } else {
      this.g.setColor(16711680);
      str = "" + paramInt;
    } 
    this.g;
    this.g;
    this.g.drawString(str, 90 + 49 * this.be_hit, 61 - 25 * this.be_hit - this.battle_c, true | 0x10);
  }
  
  void drawEnemy() {
    if ((this.mini_state & 0x20) == 32 && this.createOver != 3)
      return; 
    if (this.be_hit == -2)
      return; 
    if (this.be_hit == 1) {
      this.g;
      this.g;
      this.g.drawImage(this.imgMonster[1], 136 - this.x_offset * this.be_hit, 67 + this.y_offset, true | 0x20);
    } else {
      this.g;
      this.g;
      this.g.drawImage(this.imgMonster[1], 136, 67, true | 0x20);
    } 
  }
  
  void AddHp(int paramInt, Monster paramMonster) {
    paramInt += paramMonster.hp;
    if (paramInt > paramMonster.max_hp) {
      paramMonster.hp = paramMonster.max_hp;
    } else {
      paramMonster.hp = (short)(byte)paramInt;
    } 
  }
  
  void addfealty(int paramInt, Monster paramMonster) {
    paramInt += paramMonster.monster[30];
    if (paramInt > paramMonster.monster[29]) {
      paramMonster.monster[30] = paramMonster.monster[29];
    } else {
      paramMonster.monster[30] = (byte)paramInt;
    } 
  }
  
  void removeHp(int paramInt, Monster paramMonster) {
    paramInt += paramMonster.hp;
    if (paramInt > -120) {
      paramMonster.hp = (short)(byte)paramInt;
    } else {
      paramMonster.hp = -120;
    } 
  }
  
  public void drawMyMon() {
    if ((this.mini_state & 0x10) == 16 && this.createOver != 3)
      return; 
    if (this.be_hit != 2)
      if (this.be_hit == -1) {
        this.g;
        this.g;
        this.dg;
        drawImage(this.imgMonster[0], 38 - this.x_offset * this.be_hit, 125 + this.y_offset, true | 0x20, 4);
      } else if (this.frame_c < 3) {
        this.g;
        this.g;
        this.dg;
        drawImage(this.imgMonster[0], 38, 125, true | 0x20, 4);
      } else {
        this.g;
        this.g;
        this.dg;
        drawImage(this.imgMonster[0], 38, 126, true | 0x20, 4);
      }  
  }
  
  void drawEffectImage(Monster paramMonster, int paramInt1, int paramInt2) {
    this.ccc = (byte)(this.ccc + 1);
    if (this.ccc >= 49)
      this.ccc = 0; 
    if (this.ccc % 10 == 0) {
      int i = (this.cruEffect + 1) % 5;
      do {
        if (paramMonster.effect[i][0] < 0 && this.cruEffect != i) {
          this.g.drawImage(this.effectImage[-paramMonster.effect[i][0] - 10], paramInt1, paramInt2, 20);
          this.cruEffect = i;
          return;
        } 
        if (++i != paramMonster.effect.length)
          continue; 
        i = 0;
      } while (i != this.cruEffect);
    } 
    if (this.cruEffect > -1 && paramMonster.effect[this.cruEffect][0] < 0)
      this.g.drawImage(this.effectImage[-paramMonster.effect[this.cruEffect][0] - 10], paramInt1, paramInt2, 20); 
  }
  
  public void drawAll() {
    if (this.draw_c > 0)
      drawBattleBG(); 
    if (this.draw_c > 1)
      drawEnemy(); 
    if (this.draw_c > 2)
      drawEnemyState(); 
    if (this.draw_c > 3)
      drawMyMon(); 
    if (this.draw_c > 4)
      drawMyMonsterState(); 
  }
  
  void drawButton(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this.g.setColor(paramInt4);
    if (paramInt5 == 0) {
      this.g;
      this.g;
      this.g.drawString(paramString, paramInt1 + 2, paramInt2 + 16, 0x4 | 0x40);
    } else {
      this.g;
      this.g;
      this.g.drawString(paramString, paramInt1 + (paramInt3 >> 1), paramInt2 + 16, true | 0x40);
    } 
  }
  
  void drawSelect(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    int i = paramInt2 + paramInt4;
    int j = paramInt1 + paramInt3;
    int[] arrayOfInt = paramBoolean ? this.selectColor[0] : this.selectColor[1];
    this.g.setColor(arrayOfInt[4]);
    this.g.fillRect(paramInt1 + 1, paramInt2 + 1, paramInt3 - 3, paramInt4 - 3);
    this.g.setColor(arrayOfInt[0]);
    this.g.fillRect(paramInt1 + 3, paramInt2 + 3, paramInt3 - 5, paramInt4 - 5);
    int[][] arrayOfInt1 = { 
        { paramInt1 + 2, paramInt2, j - 2, paramInt2, 1 }, { paramInt1, paramInt2 + 2, paramInt1, i - 2, 1 }, { paramInt1 + 2, i, j - 2, i, 1 }, { j, paramInt2 + 2, j, i - 2, 1 }, { paramInt1 + 1, paramInt2 + 1, paramInt1 + 1, paramInt2 + 1, 1 }, { j - 1, i - 1, j - 1, i - 1, 1 }, { paramInt1 + 1, i - 1, paramInt1 + 1, i - 1, 1 }, { j - 1, paramInt2 + 1, j - 1, paramInt2 + 1, 1 }, { paramInt1 + 3, paramInt2 + 2, j - 3, paramInt2 + 2, 2 }, { j - 3, paramInt2 + 3, j - 3, paramInt2 + 3, 2 }, 
        { paramInt1 + 2, paramInt2 + 3, paramInt1 + 2, i - 3, 2 }, { paramInt1 + 3, i - 3, paramInt1 + 3, i - 3, 2 }, { paramInt1 + 2, i - 1, j - 2, i - 1, 2 }, { j - 1, paramInt2 + 2, j - 1, i - 2, 2 }, { j - 2, i - 2, j - 2, i - 2, 2 }, { paramInt1 + 1, i - 2, paramInt1 + 1, i - 2, 2 }, { paramInt1 + 2, i - 2, j - 2, i - 2, 3 }, { j - 2, paramInt2 + 1, j - 2, i - 3, 3 } };
    int k = arrayOfInt1.length;
    for (byte b1 = 0; b1 < k; b1++) {
      this.g.setColor(arrayOfInt[arrayOfInt1[b1][4]]);
      this.g.drawLine(arrayOfInt1[b1][0], arrayOfInt1[b1][1], arrayOfInt1[b1][2], arrayOfInt1[b1][3]);
    } 
    arrayOfInt1 = (int[][])null;
  }
  
  byte getItemCount(int paramInt) {
    byte b1 = 0;
    if (paramInt < 10 || (paramInt >= 33 && paramInt <= 36)) {
      b1 = 0;
    } else if (paramInt >= 10 && paramInt < 22) {
      b1 = 1;
    } else {
      b1 = 2;
    } 
    if (paramInt == 40 || paramInt == 41 || paramInt == 39 || paramInt == 15) {
      b1 = 2;
    } else if (paramInt == 38) {
      b1 = 0;
    } 
    for (byte b2 = 0; b2 < this.items_count[b1]; b2++) {
      if (this.items[b1][b2][0] == paramInt)
        return this.items[b1][b2][1]; 
    } 
    return 0;
  }
  
  void drawItem(int paramInt1, int paramInt2, int paramInt3) {
    paramInt2 -= 2;
    this.g.setClip(paramInt2, paramInt3, 19, 16);
    if (this.imgBattle[4] == null)
      createItemImage(); 
    this.g.drawImage(this.imgBattle[4], paramInt2, paramInt3 - (paramInt1 << 4), 20);
    this.g.setClip(0, 0, 176, 208);
  }
  
  void goBUY_ITEM() {
    this.run_state = 18;
    this.select_stateY = 0;
    this.select_stateS = 0;
    this.LIST_ROWS = 4;
    setPrice();
  }
  
  void goSELL_ITEM() {
    this.run_state = 19;
    this.select_stateY = 0;
    this.select_stateS = 0;
    this.LIST_ROWS = 4;
    setPrice();
  }
  
  void drawBUY_ITEM() {
    blueBg();
    byte b1 = 70;
    byte b2 = 23;
    byte b3 = 6;
    if (this.run_state == 18) {
      String[] arrayOfString = { "买 入", this.text[30], this.text[33], this.text[31] };
      this.l_count = (byte)this.canBuy.length;
      drawUI(0, this.g, this.select_stateY, 0, arrayOfString);
    } else {
      String[] arrayOfString = { "卖 出", this.text[30], this.text[33], this.text[31] };
      this.l_count = this.items_count[0];
      drawUI(1, this.g, this.select_stateY, 0, arrayOfString);
    } 
    for (byte b4 = this.select_stateS; this.l_count != 0 && b4 < ((this.select_stateS + this.LIST_ROWS < this.l_count) ? (this.select_stateS + this.LIST_ROWS) : this.l_count); b4++) {
      byte b5;
      if (b4 == this.select_stateY) {
        drawSelect(23, 72 + 23 * (this.select_stateY - this.select_stateS), 128, 22, true);
        this.g.setColor(this.buttonColor[4]);
      } else {
        this.g.setColor(this.buttonColor[5]);
      } 
      if (this.run_state == 18) {
        b5 = this.canBuy[b4];
      } else {
        b5 = this.items[0][b4][0];
      } 
      drawItem(b5, 27, b1 + b3 + (b4 - this.select_stateS) * b2);
      this.g.drawString(getItemName(b5), 44, b1 - 1 + b3 + (b4 - this.select_stateS) * b2, 20);
      this.g.drawString(String.valueOf((this.run_state == 18) ? this.price[b5] : (this.price[b5] / 2)), 109, b1 + b3 + (b4 - this.select_stateS) * b2, 20);
      this.g;
      this.g;
      this.g.drawString(String.valueOf(getItemCount(b5)), 150, b1 + b3 + (b4 - this.select_stateS) * b2, 0x8 | 0x10);
    } 
    if (this.l_count > this.LIST_ROWS)
      drawZhuaZI(79, 55, 162); 
    if (this.popMenustate >= 0) {
      drawPopMenu(88, 96, 16, 24);
      if (this.run_state == 18) {
        gogoWord(this.text[147]);
      } else {
        gogoWord(this.text[151]);
      } 
    } else if (this.popMenustate < 0) {
      byte b5;
      if (this.run_state == 18) {
        b5 = this.canBuy[this.select_stateY];
      } else {
        b5 = this.items[0][this.select_stateY][0];
      } 
      if (this.l_count != 0)
        gogoWord(this.item_help[b5]); 
    } 
    this.g.setColor(3473558);
    this.g;
    this.g;
    this.g.drawString(String.valueOf(this.money), 145, 31, 0x8 | 0x20);
    queding();
    quxiao();
  }
  
  void drawZhuaZI(int paramInt1, int paramInt2, int paramInt3) {
    if (this.select_stateY == 0) {
      this.dg;
      this.dg.drawImage(this.uiImage[28], paramInt1, paramInt3, 20, 3);
    } else if (this.select_stateY == this.l_count - 1) {
      this.dg;
      this.dg.drawImage(this.uiImage[28], paramInt1, paramInt2, 20, 1);
    } else {
      this.dg;
      this.dg.drawImage(this.uiImage[28], paramInt1, paramInt2, 20, 1);
      this.dg;
      this.dg.drawImage(this.uiImage[28], paramInt1, paramInt3, 20, 3);
    } 
  }
  
  void blueBg() {
    if (null != this.uiImage)
      for (byte b1 = 0; b1 <= '°'; b1 += 44) {
        for (byte b2 = 0; b2 <= 'Ð'; b2 += 44)
          this.g.drawImage(this.uiImage[15], b1, b2, 20); 
      }  
  }
  
  void showMyItem(int paramInt1, int paramInt2, int paramInt3) {
    this.g.setColor(paramInt1);
    paramInt3 = paramInt3 + 2 + (paramInt2 - this.select_stateS) * 23;
    this.g.drawString(getItemName(this.items[this.select_stateX][paramInt2][0]), 60, paramInt3 - 1, 20);
    this.g;
    this.g;
    this.g.drawString("" + this.items[this.select_stateX][paramInt2][1], 144, paramInt3, 0x8 | 0x10);
    drawItem(this.items[this.select_stateX][paramInt2][0], 28, paramInt3);
  }
  
  void drawMY_BAG() {
    blueBg();
    drawUI(6 + this.select_stateX, this.g, this.select_stateY, 0, null);
    queding();
    quxiao();
    byte b1 = 51;
    this.l_count = this.items_count[this.select_stateX];
    if (this.l_count > this.LIST_ROWS)
      drawZhuaZI(79, 41, 162); 
    for (byte b2 = this.select_stateS; b2 < ((this.select_stateS + this.LIST_ROWS < this.l_count) ? (this.select_stateS + this.LIST_ROWS) : this.l_count); b2++) {
      if (b2 == this.select_stateY) {
        drawSelect(23, 50 + 23 * (this.select_stateY - this.select_stateS), 128, 22, true);
        showMyItem(this.buttonColor[4], b2, b1);
      } else {
        showMyItem(this.buttonColor[5], b2, b1);
      } 
    } 
    if (this.items_count[this.select_stateX] > 0)
      gogoWord(this.item_help[this.items[this.select_stateX][this.select_stateY][0]]); 
    if (this.popMenustate != -1)
      drawPopMenu(88, 208 - 16 * this.action_str.length - 4 >> 1, 16, 24); 
  }
  
  void popBagMenu() {
    if (this.mini_state != 6 && (this.select_stateX == 0 || this.select_stateX == 2) && this.items_count[this.select_stateX] > 0) {
      if (this.items[this.select_stateX][this.select_stateY][0] == 27 || this.items[this.select_stateX][this.select_stateY][0] == 28 || this.items[this.select_stateX][this.select_stateY][0] <= 9 || (this.items[this.select_stateX][this.select_stateY][0] >= 33 && this.items[this.select_stateX][this.select_stateY][0] <= 38) || this.items[this.select_stateX][this.select_stateY][0] == 40) {
        String[] arrayOfString = { this.text[1], this.text[49] };
        this.action_str = arrayOfString;
      } else if (this.items[this.select_stateX][this.select_stateY][0] == 30) {
        String[] arrayOfString = { this.text[50], this.text[49] };
        this.action_str = arrayOfString;
      } else if (this.items[this.select_stateX][this.select_stateY][0] == 32) {
        String[] arrayOfString = { this.text[142], this.text[49] };
        this.action_str = arrayOfString;
      } else {
        String[] arrayOfString = { this.text[49] };
        this.action_str = arrayOfString;
      } 
    } else if ((this.view_state != 1 && this.select_stateX == 1 && this.items_count[this.select_stateX] > 0) || (this.mini_state == 6 && this.select_stateX == 1 && this.items_count[this.select_stateX] > 0)) {
      String[] arrayOfString = { this.text[53], this.text[49] };
      this.action_str = arrayOfString;
    } else {
      String[] arrayOfString = { this.text[49] };
      this.action_str = arrayOfString;
    } 
    this.popMenustate = 0;
  }
  
  void popBagState() {
    if (this.key == -2 && this.popMenustate < this.action_str.length - 1) {
      this.popMenustate = (byte)(this.popMenustate + 1);
    } else if (this.key == -1 && this.popMenustate > 0) {
      this.popMenustate = (byte)(this.popMenustate - 1);
    } 
    if (pressQueDing()) {
      if (this.action_str[this.popMenustate] == this.text[true]) {
        if (this.items[this.select_stateX][this.select_stateY][0] == 5 || this.items[this.select_stateX][this.select_stateY][0] == 6 || this.items[this.select_stateX][this.select_stateY][0] == 7) {
          if (this.view_state == 1) {
            if (this.battle_type == 1) {
              this.run_state = -19;
              this.catchKind = this.items[this.select_stateX][this.select_stateY][0];
              this.select_stateS = 0;
              this.select_stateX = 0;
              this.select_stateY = 0;
              this.popMenustate = -1;
              this.action_str = null;
              this.y_speed = -16;
              this.x_speed = 7;
              this.battle_c = 0;
              this.x = 10;
              this.y = 83;
            } else {
              say(this.text[8] + this.text[34] + this.text[40] + this.text[42], 1);
              sleep(300);
            } 
          } else {
            say(this.text[123] + this.text[1], 1);
          } 
        } else if (this.items[this.select_stateX][this.select_stateY][0] == 27 || this.items[this.select_stateX][this.select_stateY][0] == 28) {
          if (this.view_state == 1) {
            say(this.text[35] + this.text[8] + this.text[1], 1);
          } else {
            this.popMenustate = -1;
            this.action_str = null;
            if (this.mapP.notMeet == 0) {
              this.mapP.notMeet(1, this.items[this.select_stateX][this.select_stateY][0]);
              say(this.text[141] + this.text[154] + getItemName(this.items[this.select_stateX][this.select_stateY][0]) + this.text[90] + this.text[155], 1);
              deleteItems(this.items[this.select_stateX][this.select_stateY][0], 1);
            } else if (this.mapP.notMeet == 1) {
              say(this.text[156], 1);
            } 
          } 
        } else if (this.items[this.select_stateX][this.select_stateY][0] == 37) {
          this.MON_MAX_LV = (byte)(this.MON_MAX_LV + 1);
          this.popMenustate = -1;
          this.action_str = null;
          say(this.text[141] + this.text[154] + getItemName(this.items[this.select_stateX][this.select_stateY][0]) + this.text[90] + this.text[157], 1);
          deleteItems(this.items[this.select_stateX][this.select_stateY][0], 1);
        } else if (this.items[this.select_stateX][this.select_stateY][0] == 40) {
          if (this.view_state == 1) {
            say("战斗中无法使用", 1);
          } else {
            this.popMenustate = -1;
            this.action_str = null;
            healMonster();
            deleteItems(this.items[this.select_stateX][this.select_stateY][0], 1);
            this.select_stateS = 0;
            this.select_stateY = 0;
          } 
        } else {
          this.mini_state = 9;
          this.item_type = this.select_stateX;
          this.item_no = this.select_stateY;
          this.select_stateT = 0;
          this.temp_stateS = this.select_stateS;
          this.select_stateS = 0;
          this.select_stateY = 0;
          goVIEW_MONSTER();
        } 
      } else if (this.action_str[this.popMenustate] == this.text[53]) {
        if (this.mini_state == 6) {
          this.item_type = this.select_stateX;
          this.item_no = this.select_stateY;
          getItems(this.items[this.item_type][this.item_no][0]);
          this.select_stateY = this.select_stateT;
          if (this.items_count[this.select_stateX] > 0 && this.select_stateY == this.items_count[this.select_stateX])
            this.select_stateY = (byte)(this.select_stateY - 1); 
        } else {
          this.mini_state = 7;
          this.item_type = this.select_stateX;
          this.item_no = this.select_stateY;
          this.temp_stateS = this.select_stateS;
          this.select_stateS = 0;
          this.select_stateY = 0;
        } 
        goVIEW_MONSTER();
      } else if (this.action_str[this.popMenustate] == this.text[50]) {
        if (this.items[this.select_stateX][this.select_stateY][0] == 30) {
          this.popMenustate = -1;
          this.action_str = null;
          gotujian();
        } 
      } else if (this.action_str[this.popMenustate] == this.text['']) {
        if (findItem(31)) {
          byte[] arrayOfByte1 = { 42, 0, 1, 2, 3, 4, 5, 6, 7 };
          byte[] arrayOfByte2 = { 15, 30, 45, 60, 70, 80, 90, 96, 100 };
          byte b1 = 0;
          int i = getRandom(100);
          while (b1 < arrayOfByte1.length && arrayOfByte2[b1] <= i)
            b1++; 
          if (getItem(arrayOfByte1[b1], 1) != -1) {
            deleteItems(31, 1);
            deleteItems(32, 1);
            if (this.select_stateY >= this.items_count[this.select_stateX] && this.items_count[this.select_stateX] > 0) {
              this.select_stateY = 0;
              this.select_stateS = 0;
            } 
          } 
        } else {
          say(this.text[153], 1);
        } 
        this.popMenustate = -1;
      } else {
        this.popMenustate = -1;
      } 
    } else if (this.key == -7) {
      this.popMenustate = -1;
    } 
  }
  
  void key_MY_BAG() {
    if (this.popMenustate == -1) {
      if (pressQueDing()) {
        this.temp_stateS = this.select_stateS;
        popBagMenu();
      } else if (this.key == -3 || this.key == -4) {
        select_state(this.items.length, 0, 17, 0, 0);
        this.select_stateS = 0;
      } else if (this.key == -7) {
        if (this.mini_state == 6) {
          this.mini_state = 2;
          this.select_stateY = this.select_stateT;
          this.select_stateS = this.temp_stateS;
          this.temp_stateS = 0;
          this.select_stateY = 0;
          goVIEW_MONSTER();
        } else if (this.view_state == 1) {
          goSELECT_ACTION();
        } else {
          goGO_RUNINMAP();
        } 
      } else {
        this.LIST_ROWS = 5;
        if (this.items_count[this.select_stateX] > 0)
          listSelectState(this.items_count[this.select_stateX], this.LIST_ROWS); 
        this.x = 88;
      } 
    } else {
      popBagState();
    } 
  }
  
  void drawTitleOFView(String paramString) {
    char c = '¤';
    drawRichText2(0, c, 176, 24, 15452159, 10448383, 3473558);
    this.g.setColor(3355443);
    if (paramString != "") {
      this.g;
      this.g;
      this.g.drawString(paramString, 10, c + '\001' + '\020', 0x4 | 0x40);
    } 
  }
  
  void drawPanel(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.g.setColor(16768193);
    this.g.fillRoundRect(paramInt1, paramInt2, paramInt3 + 1, paramInt4 + 1, 6, 6);
    this.g.setColor(5066061);
    this.g.drawRoundRect(paramInt1, paramInt2, paramInt3, paramInt4, 6, 6);
    this.g.setColor(16617574);
    this.g.drawLine(paramInt1 + 1, paramInt2 + paramInt4 - 15, paramInt1 + paramInt3 - 1, paramInt2 + paramInt4 - 15);
    this.g.drawRoundRect(paramInt1 + 1, paramInt2 + 1, paramInt3 - 2, paramInt4 - 15 - 1, 5, 5);
    this.g.drawRoundRect(paramInt1 + 1, paramInt2 + paramInt4 - 15, paramInt3 - 2, 14, 5, 5);
  }
  
  void newMonsterView() {
    this.imgMonster[0] = null;
    this.createOver = 1;
  }
  
  void listSelectState(int paramInt1, int paramInt2) {
    if (this.key == -1) {
      if (this.select_stateS > 0) {
        if (this.select_stateY > this.select_stateS) {
          this.select_stateY = (byte)(this.select_stateY - 1);
        } else {
          this.select_stateS = (byte)(this.select_stateS - 1);
          this.select_stateY = (byte)(this.select_stateY - 1);
        } 
      } else if (this.select_stateY > 0) {
        this.select_stateY = (byte)(this.select_stateY - 1);
      } 
    } else if (this.key == -2) {
      if (this.select_stateS + paramInt2 < paramInt1) {
        if (this.select_stateY < this.select_stateS + paramInt2 - 1) {
          this.select_stateY = (byte)(this.select_stateY + 1);
        } else {
          this.select_stateS = (byte)(this.select_stateS + 1);
          this.select_stateY = (byte)(this.select_stateY + 1);
        } 
      } else if (this.select_stateY < paramInt1 - 1) {
        this.select_stateY = (byte)(this.select_stateY + 1);
      } 
      if (this.select_stateY >= paramInt1) {
        this.select_stateY = (byte)paramInt1;
        this.select_stateS = (byte)(paramInt1 - paramInt2);
      } 
    } 
  }
  
  void drawMONSTER_LIST(Monster[] paramArrayOfMonster) {
    blueBg();
    drawUI(5, this.g, this.select_stateY, 20, null);
    if (this.popMenustate == -1)
      drawUI(10, this.g, this.select_stateY, 20, null); 
    queding();
    quxiao();
    if (this.l_count == 0) {
      drawTitleOFView(this.text[39] + this.text[42]);
      return;
    } 
    this.g.setColor(16187136);
    this.g;
    this.g;
    this.g.drawString(this.text[38] + " " + (paramArrayOfMonster[this.select_stateY]).monster[11], 20, 70, 0x10 | 0x4);
    if (this.mini_state == 3) {
      if (this.frame_c == 0) {
        changeMonster(paramArrayOfMonster[this.select_stateT], paramArrayOfMonster[this.select_stateY]);
        this.select_stateY = this.select_stateT;
        if (this.run_state == 45) {
          this.monster = paramArrayOfMonster[this.select_stateY];
        } else {
          this.monster = this.myMonster[this.select_stateY];
        } 
      } else if (this.frame_c > 6) {
        this.mini_state = 0;
      } 
      this.frame_c = (byte)(this.frame_c + 1);
    } 
    byte b1 = 90;
    byte b2 = 71;
    byte b3 = 22;
    byte b4;
    for (b4 = this.select_stateS; b4 < ((this.select_stateS + this.LIST_ROWS < this.l_count) ? (this.select_stateS + this.LIST_ROWS) : this.l_count); b4++) {
      byte b5 = 35 + 25 * (b4 - this.select_stateS);
      if (this.mini_state == 3) {
        if (b4 == this.select_stateT || b4 == this.select_stateY) {
          drawSelect(b1, b5, b2, b3, true);
          this.g;
          this.g;
          drawButton(getMonName((paramArrayOfMonster[b4]).monster[16]), b1, b5, b2, this.buttonColor[4], true | 0x10);
        } else {
          drawSelect(b1, b5, b2, b3, false);
          this.g;
          this.g;
          drawButton(getMonName((paramArrayOfMonster[b4]).monster[16]), b1, b5, 72, this.buttonColor[5], true | 0x10);
        } 
      } else if (b4 == this.select_stateY) {
        drawSelect(b1, b5, b2, b3, true);
        this.g;
        this.g;
        drawButton(getMonName((paramArrayOfMonster[b4]).monster[16]), b1, b5, b2, this.buttonColor[4], true | 0x10);
      } else {
        drawSelect(b1, b5, b2, b3, false);
        this.g;
        this.g;
        drawButton(getMonName((paramArrayOfMonster[b4]).monster[16]), b1, b5, b2, this.buttonColor[5], true | 0x10);
      } 
    } 
    this.g.setClip(0, 0, 176, 208);
    if (this.mini_state == 1 && this.select_stateT < this.select_stateS + 5 && this.select_stateT >= this.select_stateS) {
      drawTitleOFView(this.text[60] + this.text[42]);
    } else if (this.mini_state != 7 && this.mini_state != 9) {
      this.g.setColor(4802889);
      this.g.drawString("" + (this.select_stateY + 1) + this.text[93] + this.l_count, 133, 21, 20);
      if (this.l_count > this.LIST_ROWS)
        drawZhuaZI(114, 23, 161); 
    } 
    if (this.popMenustate == -1) {
      drawMonsterHP(5, 127, (paramArrayOfMonster[this.select_stateY]).hp + 120, (paramArrayOfMonster[this.select_stateY]).max_hp + 120, 47);
      this.g.setColor(16187136);
      this.g;
      this.g;
      this.g.drawString("生命", 43, 122, 0x20 | true);
      this.g;
      this.g;
      this.g.drawString(this.text[143], 43, 153, 0x20 | true);
      drawFealty(paramArrayOfMonster);
    } 
    if (this.popMenustate == 2 && this.action_str[2].equals(this.text[138])) {
      int i;
      b4 = 0;
      if (this.run_state == 35) {
        i = getMonPrice(this.myMonster[this.select_stateY]);
      } else {
        i = getMonPrice(paramArrayOfMonster[this.select_stateY]);
      } 
      this.g.setColor(29116);
      this.g;
      this.g;
      this.g.drawString("贩卖价格:" + i, 88, 200, 0x20 | true);
    } 
    if (this.popMenustate >= 0)
      drawPopMenu(43, 106, 16, 24); 
  }
  
  private void drawFealty(Monster[] paramArrayOfMonster) {
    byte b1 = ((paramArrayOfMonster[this.select_stateY]).monster[29] - 100) / 10;
    byte b2;
    for (b2 = 1; b2 < this.fealty[b1].length && (paramArrayOfMonster[this.select_stateY]).monster[30] > this.fealty[b1][b2]; b2++);
    byte b3 = b2 / 2;
    byte b4;
    for (b4 = 0; b4 < b3; b4++)
      this.g.drawImage(this.uiImage[35], 24 + b4 * 15, 159, 20); 
    if (b2 % 2 != 0)
      this.g.drawImage(this.uiImage[34], 24 + b4 * 15, 159, 20); 
  }
  
  void key_MONSTER_LIST() {
    if (this.popMenustate == -1) {
      if (pressQueDing()) {
        if (this.mini_state == 0 && this.l_count != 0) {
          this.popMenustate = 0;
        } else if (this.mini_state == 7) {
          this.last_state = 25;
          this.select_stateT = this.select_stateY;
          getItems(this.items[this.item_type][this.item_no][0]);
          this.select_stateS = this.temp_stateS;
          this.run_state = 16;
        } else if (this.mini_state == 9) {
          this.select_stateT = this.select_stateY;
          useItem();
        } else if (this.mini_state == 1) {
          if (this.select_stateY != this.select_stateT) {
            this.mini_state = 3;
            this.frame_c = 0;
          } else {
            this.mini_state = 0;
            this.frame_c = 0;
          } 
        } 
      } else if (this.key == -7) {
        if (this.mini_state == 9 || this.mini_state == 7) {
          this.select_stateS = this.temp_stateS;
          this.temp_stateS = this.select_stateS;
          goMY_BAG();
        } else if (this.run_state == 35 && this.view_state == 1) {
          if ((this.myMonster[0]).hp > -120) {
            this.select_stateY = 0;
            this.mini_state = 0;
            this.createOver = 3;
            getMyMonImage();
            goSELECT_ACTION();
          } else {
            say(this.text[124] + this.text[52] + this.text[10] + this.text[42], 1);
          } 
        } else if (this.run_state == 35 && this.view_state == 0) {
          goGO_RUNINMAP();
        } else if (this.run_state == 35 && this.view_state == 2) {
          this.select_stateY = 0;
          goVIEW_COMPUTER();
        } else if (this.run_state == 45) {
          this.select_stateY = 1;
          goVIEW_COMPUTER();
        } 
      } else if (this.l_count > 0) {
        byte b1 = this.select_stateY;
        this.LIST_ROWS = 5;
        listSelectState(this.l_count, this.LIST_ROWS);
        if (b1 != this.select_stateY) {
          boolean bool = true;
          if (this.run_state == 45) {
            if (this.monster != null && this.monster.monster[16] == (this.monsters[this.select_stateY]).monster[16])
              bool = false; 
            this.monster = this.monsters[this.select_stateY];
          } else {
            if (this.monster != null && this.monster.monster[16] == (this.myMonster[this.select_stateY]).monster[16])
              bool = false; 
            this.monster = this.myMonster[this.select_stateY];
          } 
          if (bool)
            newMonsterView(); 
        } 
      } 
    } else {
      popState();
    } 
  }
  
  void loop_battleC() {
    if (this.battle_c > 3) {
      this.battle_c = 0;
    } else {
      this.battle_c = (byte)(this.battle_c + 1);
    } 
  }
  
  void sellMonster(Monster paramMonster) {
    int i = getMonPrice(paramMonster);
    this.money += i;
    say(this.text[25] + this.text[98] + i, 0);
  }
  
  int getMonPrice(Monster paramMonster) {
    null = 'ú' + 6 * paramMonster.monster[11];
    return null * (100 + 2 * this.monster_pro[paramMonster.monster[16]][12]) / 'd';
  }
  
  void deleteMonster() {
    if (this.run_state == 35) {
      if (monsterRemove(this.select_stateY) == null)
        say(this.text[96] + this.text[54] + this.text[42], 1); 
      this.l_count = this.monster_takens;
    } else {
      this.monsters[this.select_stateY] = null;
      for (byte b1 = this.select_stateY; b1 < this.cmon_count - 1; b1++)
        this.monsters[b1] = this.monsters[b1 + 1]; 
      this.cmon_count = (byte)(this.cmon_count - 1);
      this.l_count = this.cmon_count;
    } 
    resetMonSellselectY();
  }
  
  private void resetMonSellselectY() {
    if (this.select_stateY == this.l_count) {
      this.select_stateY = (byte)(this.select_stateY - 1);
      if (this.select_stateY < this.select_stateS)
        this.select_stateS = this.select_stateY; 
    } 
    if (this.l_count == 0) {
      this.select_stateY = 0;
      this.select_stateS = 0;
      newMonsterView();
      return;
    } 
    newMonsterView();
  }
  
  void putMonster() {
    if (this.cmon_count >= this.MAX_MONSTERS) {
      say("电脑" + this.text[42] + this.text[44] + this.text[91] + "请扩充空间！", 0);
      goSms(3);
      return;
    } 
    boolean bool = false;
    byte b1;
    for (b1 = 0; b1 < this.monster_takens; b1++) {
      if (b1 != this.select_stateY && (this.myMonster[b1]).hp > -120) {
        bool = true;
        break;
      } 
    } 
    if (bool == true) {
      if ((this.myMonster[this.select_stateY]).monster[13] != -1) {
        addItem((this.myMonster[this.select_stateY]).monster[13], 1);
        (this.myMonster[this.select_stateY]).monster[13] = -1;
      } 
      healMonster(this.myMonster[this.select_stateY]);
      this.monsters[this.cmon_count] = this.myMonster[this.select_stateY];
      this.cmon_count = (byte)(this.cmon_count + 1);
      for (b1 = this.select_stateY; b1 < this.monster_takens - 1; b1++)
        this.myMonster[b1] = this.myMonster[b1 + 1]; 
      this.monster_takens = (byte)(this.monster_takens - 1);
      this.l_count = this.monster_takens;
      if (this.select_stateY == this.monster_takens)
        this.select_stateY = (byte)(this.select_stateY - 1); 
      newMonsterView();
    } else {
      say(this.text[96] + this.text[54] + this.text[42], 0);
    } 
  }
  
  void changeMonster(Monster paramMonster1, Monster paramMonster2) {
    Monster monster1 = new Monster();
    monster1.monster = paramMonster1.monster;
    monster1.effect = paramMonster1.effect;
    monster1.exp = paramMonster1.exp;
    monster1.max_hp = paramMonster1.max_hp;
    monster1.hp = paramMonster1.hp;
    monster1.dex = paramMonster1.dex;
    paramMonster1.monster = paramMonster2.monster;
    paramMonster1.effect = paramMonster2.effect;
    paramMonster1.exp = paramMonster2.exp;
    paramMonster1.max_hp = paramMonster2.max_hp;
    paramMonster1.hp = paramMonster2.hp;
    paramMonster1.dex = paramMonster2.dex;
    paramMonster2.monster = monster1.monster;
    paramMonster2.effect = monster1.effect;
    paramMonster2.exp = monster1.exp;
    paramMonster2.max_hp = monster1.max_hp;
    paramMonster2.hp = monster1.hp;
    paramMonster2.dex = monster1.dex;
  }
  
  void takenMonster() {
    if (this.monster_takens < 5) {
      this.myMonster[this.monster_takens] = this.monsters[this.select_stateY];
      this.monster_takens = (byte)(this.monster_takens + 1);
      for (byte b1 = this.select_stateY; b1 < this.cmon_count - 1; b1++)
        this.monsters[b1] = this.monsters[b1 + 1]; 
      this.cmon_count = (byte)(this.cmon_count - 1);
      this.l_count = this.cmon_count;
      if (this.select_stateY == this.cmon_count)
        this.select_stateY = (byte)(this.select_stateY - 1); 
      if (this.cmon_count == 0) {
        this.select_stateY = 0;
        newMonsterView();
        return;
      } 
      this.monster = this.monsters[this.select_stateY];
      newMonsterView();
    } else {
      say(this.text[8] + this.text[20] + this.text[42], 1);
    } 
  }
  
  void resetParam() {
    this.x_offset = 0;
    this.y_offset = 0;
    this.battle_c = 0;
    this.damage_c = 0;
  }
  
  void goSELECT_ACTION() {
    if (this.run_state == 25) {
      this.select_stateX = 1;
      this.select_stateY = 0;
      this.imgMonster[0] = this.tempImage;
      this.tempImage = null;
    } else if (this.run_state == 35) {
      this.select_stateX = 0;
      this.select_stateY = 1;
    } else {
      this.select_stateX = 0;
      this.select_stateY = 0;
    } 
    this.select_stateS = 0;
    this.be_hit = 0;
    this.draw_c = 5;
    this.run_state = -70;
    this.frame_c = 0;
    String[] arrayOfString = { this.text[54], this.text[55], this.text[42], this.text[56] };
    this.action_str = arrayOfString;
  }
  
  void getAttackTurn() {
    if (this.mini_state == 10) {
      for (byte b1 = 1; b1 < this.monster_takens; b1++) {
        if ((this.myMonster[b1]).hp > -120) {
          b1 = 50;
          this.mini_state = 0;
          this.newRound = 1;
          this.monster = this.myMonster[this.select_stateY];
          goVIEW_MONSTER();
          return;
        } 
      } 
      this.maincanvas.soundStop();
      this.run_state = 40;
    } else if (this.mini_state == 16 && this.createOver == 1) {
      goMY_ATTACK(0);
    } else if (this.mini_state == 16 && this.createOver == 3) {
      attackOver();
    } else if (this.mini_state == 32 && this.createOver == 3) {
      showString(this.text[40] + this.text[41] + this.text[42], 8, 162);
      sleep(800);
      attackOver();
    } else if (this.mini_state == 48 && this.createOver == 3) {
      showString(this.text[40] + this.text[41] + this.text[42], 8, 162);
      sleep(800);
      this.newRound = 1;
      attackOver();
    } 
  }
  
  void goVIEW_MONSTER() {
    if (this.mini_state != 9 && this.mini_state != 7)
      this.mini_state = 0; 
    if (this.run_state == -70) {
      this.view_state = 1;
      this.select_stateS = 0;
      this.select_stateY = 0;
    } else if (this.run_state == 65) {
      this.view_state = 2;
      this.select_stateS = 0;
      this.select_stateY = 0;
    } else if (this.run_state != 25) {
      if (this.run_state == 55) {
        this.select_stateY = this.select_stateT;
      } else {
        this.select_stateS = 0;
        this.view_state = 0;
        this.select_stateY = 0;
      } 
    } 
    this.LIST_ROWS = 5;
    this.run_state = 35;
    this.monster = this.myMonster[this.select_stateY];
    if (this.monster_takens > 0) {
      goView();
    } else {
      this.createOver = 3;
    } 
    this.createOver = 1;
    goPopMenu();
    this.popMenustate = -1;
  }
  
  void goCOMPUTER_MONSTER() {
    this.select_stateY = 0;
    if (this.run_state == 55)
      this.select_stateY = this.select_stateT; 
    this.LIST_ROWS = 5;
    this.view_state = 3;
    this.run_state = 45;
    if (this.run_state == 45)
      this.monster = this.monsters[this.select_stateY]; 
    goPopMenu();
    if (this.cmon_count == 0)
      this.createOver = 3; 
    this.popMenustate = -1;
  }
  
  void goVIEW_COMPUTER() {
    this.run_state = 65;
    goView();
    goPopMenu();
    this.popMenustate = 0;
  }
  
  void goSEE_MONSTER() {
    if (this.run_state == 45) {
      if (this.monster != null && this.monster.monster[16] != (this.monsters[this.select_stateY]).monster[16])
        this.createOver = 1; 
      this.monster = this.monsters[this.select_stateY];
    } else {
      if (this.monster != null && this.monster.monster[16] != (this.myMonster[this.select_stateY]).monster[16])
        this.createOver = 1; 
      this.monster = this.myMonster[this.select_stateY];
    } 
    this.select_stateT = this.select_stateY;
    this.run_state = 55;
    this.mini_state = 0;
    this.select_stateX = 0;
    this.select_stateY = 0;
    this.popMenustate = -1;
    this.montalkf = (byte)Math.min(this.monster.monster[30] / 24, 4);
    this.montalkid = (byte)getRandom(this.monSay[this.montalkf].length);
    this.x = 88;
  }
  
  void exitSEE_MONSTER() {
    newMonsterView();
    if (this.view_state == 3) {
      goCOMPUTER_MONSTER();
    } else {
      goVIEW_MONSTER();
    } 
  }
  
  void goView() { newMonsterView(); }
  
  void goGO_RUNINMAP() {
    this.battle_c = 0;
    resetParam();
    this.popMenustate = -1;
    this.magicImg = null;
    this.mapP.my_state = 0;
    System.gc();
    this.run_state = -11;
  }
  
  void goMY_BAG() {
    if (this.run_state == 35 || this.run_state == 21) {
      if (this.mini_state != 6)
        this.mini_state = 0; 
    } else if (this.run_state == -70) {
      this.view_state = 1;
      this.mini_state = 0;
      this.item_type = 0;
      this.item_no = 0;
      this.select_stateS = 0;
    } else if (this.run_state == 99) {
      this.select_stateS = 0;
      this.item_type = 0;
      this.item_no = 0;
    } else {
      this.mini_state = 0;
    } 
    this.select_stateX = this.item_type;
    this.select_stateY = this.item_no;
    if (this.select_stateY >= this.items_count[this.select_stateX] && this.items_count[this.select_stateX] > 0)
      this.select_stateY = (byte)(this.items_count[this.select_stateX] - 1); 
    this.info_string = null;
    this.run_state = 25;
    this.LIST_ROWS = 5;
    this.popMenustate = -1;
  }
  
  void goPopMenu() {
    if (this.run_state == 45) {
      String[] arrayOfString = { this.text[50], this.text[57], this.text[138] };
      this.action_str = arrayOfString;
    } else if (this.run_state == 35) {
      if (this.view_state == 1) {
        String[] arrayOfString = { this.text[10], this.text[50], this.text[49] };
        this.action_str = arrayOfString;
      } else if (this.view_state == 2) {
        String[] arrayOfString = { this.text[50], this.text[59], this.text[138] };
        this.action_str = arrayOfString;
      } else if (this.monster_takens > 1) {
        String[] arrayOfString = { this.text[50], this.text[60], this.text[36] };
        this.action_str = arrayOfString;
      } else {
        String[] arrayOfString = { this.text[50], this.text[36], this.text[49] };
        this.action_str = arrayOfString;
      } 
    } else if (this.run_state == 25) {
      String[] arrayOfString = { this.text[59], this.text[61], this.text[49] };
      this.action_str = arrayOfString;
    } else if (this.run_state == 65) {
      String[] arrayOfString = { this.text[59], this.text[61], "扩充电脑" };
      this.action_str = arrayOfString;
    } 
  }
  
  void popState() {
    keyRelease();
    if (this.key == -2 && this.popMenustate < this.action_str.length - 1) {
      this.popMenustate = (byte)(this.popMenustate + 1);
    } else if (this.key == -1 && this.popMenustate > 0) {
      this.popMenustate = (byte)(this.popMenustate - 1);
    } 
    if (pressQueDing()) {
      if (this.mapP.my_state == 16)
        if (this.popMenustate == 0) {
          this.mapP.my_state = 11;
          healMonster();
          this.popMenustate = -1;
          this.money -= 30;
          this.mapP.inShop = 1;
        } else {
          this.mapP.my_state = 11;
          this.popMenustate = -1;
          this.mapP.inShop = 2;
        }  
      if (this.run_state == 35) {
        if (this.action_str[this.popMenustate].equals(this.text[50])) {
          goSEE_MONSTER();
        } else if (this.action_str[this.popMenustate].equals(this.text[60])) {
          this.mini_state = 1;
          this.select_stateT = this.select_stateY;
          this.popMenustate = -1;
        } else if (this.action_str[this.popMenustate].equals(this.text[36])) {
          this.mini_state = 2;
          String[] arrayOfString = { this.text[62], this.text[63], this.text[49] };
          this.select_stateT = this.select_stateY;
          this.popMenustate = 0;
          this.action_str = arrayOfString;
        } else if (this.action_str[this.popMenustate].equals(this.text[59])) {
          putMonster();
          this.popMenustate = -1;
        } else if (this.action_str[this.popMenustate].equals(this.text[62])) {
          this.mini_state = 6;
          this.item_type = 1;
          this.item_no = 0;
          this.select_stateT = this.select_stateY;
          this.temp_stateS = this.select_stateS;
          this.popMenustate = -1;
          goMY_BAG();
        } else if (this.action_str[this.popMenustate].equals(this.text[63])) {
          if ((this.myMonster[this.select_stateY]).monster[13] != -1) {
            addItem((this.myMonster[this.select_stateY]).monster[13], 1);
            say(getMonName((this.myMonster[this.select_stateY]).monster[16]) + this.text[63] + getItemName((this.myMonster[this.select_stateY]).monster[13]), 1);
            (this.myMonster[this.select_stateY]).monster[13] = -1;
          } else {
            say(getMonName((this.myMonster[this.select_stateY]).monster[16]) + this.text[39] + this.text[36], 1);
          } 
        } else if (this.action_str[this.popMenustate].equals(this.text[138])) {
          Monster monster1 = monsterRemove(this.select_stateY);
          this.l_count = this.monster_takens;
          resetMonSellselectY();
          if (null != monster1) {
            sellMonster(monster1);
          } else {
            say(this.text[96] + this.text[54] + this.text[42], 0);
          } 
          this.popMenustate = -1;
        } else if (this.action_str[this.popMenustate].equals(this.text[10])) {
          if ((this.myMonster[this.select_stateY]).hp <= -120) {
            say(getMonName((this.myMonster[this.select_stateY]).monster[16]) + this.text[8] + this.text[10], 1);
            this.popMenustate = -1;
          } else if (this.select_stateY == 0) {
            say(getMonName((this.myMonster[this.select_stateY]).monster[16]) + this.text[9] + this.text[10], 1);
            this.popMenustate = -1;
          } else {
            changeMonster(this.myMonster[0], this.myMonster[this.select_stateY]);
            this.popMenustate = -1;
            newMonsterView();
            for (byte b1 = 1; b1 <= this.mon_in_battle[0] && this.mon_in_battle[b1] != (this.myMonster[0]).monster[12]; b1++) {
              if (b1 == this.mon_in_battle[0]) {
                this.mon_in_battle[0] = (byte)(this.mon_in_battle[0] + 1);
                this.mon_in_battle[this.mon_in_battle[0]] = (this.myMonster[0]).monster[12];
                break;
              } 
            } 
            this.mini_state = 16;
            this.lastSkill = -1;
            goSELECT_ACTION();
          } 
        } else if (this.action_str[this.popMenustate].equals(this.text[49])) {
          if (this.mini_state == 2) {
            this.mini_state = 0;
            goPopMenu();
            this.popMenustate = 0;
          } else {
            this.popMenustate = -1;
          } 
        } 
      } else if (this.run_state == 45) {
        if (this.action_str[this.popMenustate].equals(this.text[50])) {
          goSEE_MONSTER();
        } else if (this.action_str[this.popMenustate].equals(this.text[57])) {
          takenMonster();
          this.popMenustate = -1;
        } else if (this.action_str[this.popMenustate].equals(this.text[138])) {
          sellMonster(this.monsters[this.select_stateY]);
          deleteMonster();
          this.popMenustate = -1;
          this.monster = this.monsters[this.select_stateY];
        } else if (this.action_str[this.popMenustate].equals(this.text[49])) {
          this.popMenustate = -1;
        } 
      } else if (this.run_state == 65) {
        if (this.action_str[this.popMenustate].equals(this.text[59])) {
          goVIEW_MONSTER();
        } else if (this.action_str[this.popMenustate].equals(this.text[61])) {
          goCOMPUTER_MONSTER();
          this.select_stateS = 0;
          this.select_stateY = 0;
        } else {
          goSms(3);
        } 
      } else if (this.run_state == -15) {
        if (this.action_str[this.popMenustate].equals(this.text[113])) {
          learnSkill(this.myMonster[this.select_monster], this.getSkill[this.learnSkillID]);
          this.popMenustate = -1;
          this.learnSkillID = -1;
          this.mini_state = 3;
        } else {
          this.action_str = new String[this.getSkill.length];
          for (byte b1 = 0; b1 < this.action_str.length; b1++)
            this.action_str[b1] = getSkillName(this.getSkill[b1]); 
          this.popMenustate = 0;
          this.learnSkillID = -1;
        } 
      } 
    } else if (this.key == -7) {
      if (this.run_state == 35 || this.run_state == 45) {
        this.popMenustate = -1;
      } else if (this.run_state == 65) {
        goGO_RUNINMAP();
      } 
      if (this.mini_state == 2) {
        this.mini_state = 0;
        goPopMenu();
        this.popMenustate = 0;
      } 
      if (this.run_state == -15) {
        this.action_str = new String[this.getSkill.length];
        for (byte b1 = 0; b1 < this.action_str.length; b1++)
          this.action_str[b1] = getSkillName(this.getSkill[b1]); 
        this.popMenustate = 0;
        this.learnSkillID = -1;
      } 
    } 
  }
  
  void drawSEE_MONSTER() {
    if (this.createOver != 3 && this.createOver != 4) {
      this.maincanvas.drawScreen(0);
      return;
    } 
    blueBg();
    drawUI(3 + this.select_stateY, this.g, this.select_stateY, 0, null);
    quxiao();
    drawMonsterHP(6, 65, this.monster.hp + 120, this.monster.max_hp + 120, 43);
    if (this.select_stateX == 0) {
      String str = getMonName(this.monster.monster[16]);
      this.g.setColor(16187136);
      this.g;
      this.g;
      this.g.drawString(str, 42, 88, true | 0x20);
    } 
    if (this.mini_state == 0) {
      this.g.setColor(14464767);
      this.g.drawString(this.text[2] + this.text[75], 20, 153, 20);
      this.g.drawString(this.text[72] + this.text[75], 20, 120, 20);
    } 
    if (this.select_stateY == 0) {
      firstPage();
    } else if (this.select_stateY == 1) {
      secondPage();
    } 
    gogoWord(this.monSay[this.montalkf][this.montalkid]);
    if (this.select_stateY == 2 && this.mini_state == 0) {
      this.g;
      this.g;
      this.g.drawString(this.text[51], 4, 206, 0x4 | 0x20);
    } 
  }
  
  void key_SEE_MONSTER() {
    if (this.mini_state == 0) {
      if (select_state(0, 2, 1, 1, 0) != 0)
        if (pressQueDing()) {
          if (this.select_stateX == 1 && this.mini_state == 0) {
            this.mini_state = 4;
            this.x = 88;
            this.select_stateY = 0;
            this.info_string = null;
          } 
        } else if (this.key == -7) {
          this.mini_state = 0;
          this.x = 88;
          this.info_string = null;
          exitSEE_MONSTER();
        }  
    } else if (this.mini_state == 4) {
      byte b1 = this.select_stateY;
      if (select_state(0, this.monster.monster[0], 1, 1, 0) != 0 && (pressQueDing() || this.key == -7)) {
        this.mini_state = 0;
        this.select_stateY = 0;
      } 
      if (this.select_stateY != b1) {
        this.x = 88;
        this.info_string = null;
      } 
    } 
  }
  
  void firstPage() {
    byte b1 = 90;
    byte b2 = 3;
    byte b3 = 20;
    String[] arrayOfString1 = { this.text[145], this.text[66], this.text[67], this.text[68], this.text[69], this.text[144], this.text[70] };
    String[] arrayOfString2 = { "" + this.monster.monster[11], "" + (this.monster.hp + 120), "" + this.monster.dex, "" + this.skillT[this.monster.monster[21]], "" + this.monster.exp, "" + this.monster.monster[30], "" };
    for (byte b4 = 0; b4 < arrayOfString1.length; b4++) {
      drawButton(arrayOfString1[b4], b1 - 1, b3 + (18 + b2) * b4, 73, 16777215, 0);
      this.g;
      this.g;
      this.g.drawString(arrayOfString2[b4], b1 + 73, b3 + (18 + b2) * b4 + 16, 0x40 | 0x8);
    } 
    if (this.monster.monster[13] != -1) {
      drawItem(this.monster.monster[13], 73 + b1 - 2 - 16, b3 + (18 + b2) * 6 + 2);
    } else {
      this.g;
      this.g;
      this.g.drawString(this.text[71], 71 + b1, b3 + (18 + b2) * 6 + 16, 0x40 | 0x8);
    } 
    if (this.mini_state == 0) {
      this.g.setColor(16777215);
      this.g.drawString(this.text[72] + this.text[75], 20, 120, 20);
    } 
  }
  
  void secondPage() {
    byte b1 = 88;
    byte b2 = 12;
    byte b3 = 25;
    byte b4 = 0;
    b4 = this.monster.monster[0];
    for (byte b5 = 0; b5 < b4; b5++) {
      if (this.mini_state != 0 && b5 == this.select_stateY) {
        showSkill(b5, b1, b3 + (18 + b2) * b5, 1);
      } else {
        showSkill(b5, b1, b3 + (18 + b2) * b5, 0);
      } 
    } 
    if (this.mini_state == 4) {
      if (this.info_string == null) {
        this.skill_no = this.monster.monster[1 + this.select_stateY * 2];
        this.info_string = this.skill_help[this.skill_no] + this.text[97] + this.text[73] + this.text[97] + this.skill[this.skill_no][0] + this.text[97] + this.text[1] + this.text[74] + this.text[97] + this.monster.monster[2 + this.select_stateY * 2] + this.text[93] + this.skill[this.skill_no][1];
      } 
      gogoWord(this.info_string);
    } 
    if (this.mini_state == 0) {
      this.g.setColor(16777215);
      this.g.drawString(this.text[2] + this.text[75], 20, 153, 20);
    } 
  }
  
  void showSkill(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.skill_no = this.monster.monster[1 + paramInt1 * 2];
    if (paramInt4 == 1) {
      drawButton(getSkillName(this.skill_no), paramInt2, paramInt3, 73, 16777215, 0);
    } else {
      drawButton(getSkillName(this.skill_no), paramInt2, paramInt3, 73, 16777215, 0);
    } 
  }
  
  void setShow(int paramInt) {
    this.time_count = 0;
    if (this.select_stateS > 0)
      this.time_count = (byte)(this.time_count | 0x10); 
    if (this.select_stateS + paramInt < this.l_count)
      this.time_count = (byte)(this.time_count | true); 
  }
  
  void drawTriIcon(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.g.setColor(paramInt6);
    if (paramInt1 == 1) {
      for (int i = 0; i < 5; i++) {
        if ((paramInt5 & 0x10) != 0)
          this.g.drawLine(paramInt2 + i, paramInt4 - i, paramInt2 + i, paramInt4 + i); 
        if ((paramInt5 & true) != 0)
          this.g.drawLine(paramInt3 - i, paramInt4 - i, paramInt3 - i, paramInt4 + i); 
      } 
    } else {
      for (int i = 0; i < 5; i++) {
        if ((paramInt5 & 0x10) != 0)
          this.g.drawLine(paramInt4 - i, paramInt2 + i, paramInt4 + i, paramInt2 + i); 
        if ((paramInt5 & true) != 0)
          this.g.drawLine(paramInt4 - i, paramInt3 - i, paramInt4 + i, paramInt3 - i); 
      } 
    } 
  }
  
  void resetSelectY(int paramInt) {
    if (paramInt == 0)
      this.select_stateY = 0; 
  }
  
  byte select_state(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (this.key == -4 && (paramInt3 & 0x10) > 0) {
      if (this.select_stateX < paramInt1 - 1) {
        this.select_stateX = (byte)(this.select_stateX + 1);
        resetSelectY(paramInt5);
      } else if (paramInt4 == 1) {
        this.select_stateX = 0;
        resetSelectY(paramInt5);
      } 
    } else if (this.key == -3 && (paramInt3 & 0x10) > 0) {
      if (this.select_stateX > 0) {
        this.select_stateX = (byte)(this.select_stateX - 1);
        resetSelectY(paramInt5);
      } else if (paramInt4 == 1) {
        this.select_stateX = (byte)(paramInt1 - 1);
        resetSelectY(paramInt5);
      } 
    } else if (this.key == -1 && (paramInt3 & true) > 0) {
      if (this.select_stateY > 0)
        this.select_stateY = (byte)(this.select_stateY - 1); 
    } else if (this.key == -2 && (paramInt3 & true) > 0) {
      if (this.select_stateY < paramInt2 - 1)
        this.select_stateY = (byte)(this.select_stateY + 1); 
    } else {
      return -1;
    } 
    return 0;
  }
  
  void keyRelease() {
    this.maincanvas;
    MainCanvas.keyRepeat = false;
  }
  
  public void key(int paramInt) {
    this.b = 1;
    this.key = paramInt;
    if (this.run_state == 98) {
      this.action_str = this.maincanvas.tempAction_str;
      this.run_state = this.maincanvas.temp_state;
      if (this.maincanvas.sound_on)
        this.maincanvas.setMusic(this.maincanvas.cwaSound.musicID, false); 
      keyRelease();
      return;
    } 
    if (this.say_c > 0) {
      if (this.run_state == -10 && this.mapP.my_state == 0)
        this.say_c = 0; 
      keyRelease();
      return;
    } 
    if (paramInt == 42 && this.maincanvas.zuobi) {
      if (this.cheat == 0) {
        this.cheat = 1;
      } else {
        this.cheat = 0;
      } 
      keyRelease();
    } 
    if (this.cheat != 0) {
      cheatKey();
      return;
    } 
    switch (this.run_state) {
      case 41:
        keyGameOver1(paramInt);
        break;
      case 40:
        keyRelease();
        this.deathType = findItem(39);
        if (this.deathType) {
          this.run_state = 41;
          this.maincanvas.getDialogs(this.deathStr, 144);
          break;
        } 
        goSms(5);
        break;
      case -10:
        this.mapP.map_Key(paramInt);
        break;
      case 99:
        if (pressQueDing()) {
          keyRelease();
          if (this.select_stateY == 0) {
            goRUN_IN_MAP(this.maincanvas.musicId);
            this.action_str = null;
          } else if (this.select_stateY == 3) {
            this.mini_state = 9;
            goMY_BAG();
          } else if (this.select_stateY == 2) {
            if (this.select_stateX == 0) {
              this.select_stateX = 1;
              this.maincanvas.strTemp = this.text[168];
            } else {
              this.mapP.map_paint(this.g);
              this.select_stateX = 0;
              this.run_state = 100;
              this.battle_c = 0;
            } 
          } else if (this.select_stateY == 4) {
            if (this.select_stateX == 0) {
              this.maincanvas.strTemp = this.text[167];
              this.select_stateX = 1;
            } else {
              this.select_stateX = 0;
              this.maincanvas.goLoading();
              this.mapP = null;
              continue_game();
            } 
          } else if (this.select_stateY == 1) {
            this.select_stateY = 0;
            goVIEW_MONSTER();
          } else if (this.select_stateY == 5) {
            this.maincanvas.keyOption();
          } else if (this.select_stateY == 6) {
            this.run_state = 0;
            this.action_str = null;
            goMAIN_MENU();
          } 
        } else if (paramInt == -7) {
          if (this.select_stateX == 1) {
            this.select_stateX = 0;
          } else {
            this.action_str = null;
            goRUN_IN_MAP(this.maincanvas.musicId);
          } 
        } else if (paramInt == -1) {
          this.select_stateY = (byte)(this.select_stateY - 1);
          if (this.select_stateY < 0)
            this.select_stateY = (byte)(this.action_str.length - 1); 
        } else if (paramInt == -2) {
          this.select_stateY = (byte)(this.select_stateY + 1);
          if (this.select_stateY > this.action_str.length - 1)
            this.select_stateY = 0; 
        } 
        keyRelease();
        break;
      case 21:
        keytujian();
        break;
      case 51:
        if (pressQueDing()) {
          saveGame();
          setNull();
          System.gc();
          this.mapP.my_state = 0;
          keyRelease();
          this.maincanvas.logo_c = 0;
          this.run_state = 50;
        } 
        break;
      case 50:
        if (pressQueDing()) {
          this.run_state = 0;
          this.action_str = null;
          goMAIN_MENU();
          keyRelease();
        } 
        break;
      case -70:
        if (this.mini_state != 0)
          return; 
        if (pressQueDing()) {
          if (this.select_stateX == 0 && this.select_stateY == 0) {
            goSelect_skill();
            break;
          } 
          if (this.select_stateX == 1 && this.select_stateY == 0) {
            if ((this.myMonster[0]).effect[2][2] == 0) {
              this.view_state = 1;
              this.tempImage = this.imgMonster[0];
              goMY_BAG();
              break;
            } 
            this.say_c = 3;
            say(this.text[122] + this.text[133] + this.text[8] + this.text[1] + this.text[30] + this.text[91], 0);
            break;
          } 
          if (this.select_stateX == 0 && this.select_stateY == 1) {
            if ((this.myMonster[0]).effect[1][2] != 0 || (this.myMonster[0]).effect[4][2] != 0) {
              this.say_c = 3;
              if ((this.myMonster[0]).effect[1][2] != 0 && (this.myMonster[0]).effect[4][2] != 0) {
                say(this.text[122] + this.text[18] + this.text[137] + this.text[121] + this.text[136] + this.text[90] + this.text[8] + this.text[50] + this.text[42], 0);
                break;
              } 
              if ((this.myMonster[0]).effect[1][2] != 0) {
                say(this.text[122] + this.text[121] + this.text[136] + this.text[90] + this.text[8] + this.text[50] + this.text[42], 0);
                break;
              } 
              if ((this.myMonster[0]).effect[4][2] != 0)
                say(this.text[122] + this.text[18] + this.text[136] + this.text[90] + this.text[8] + this.text[50] + this.text[42], 0); 
              break;
            } 
            this.view_state = 0;
            this.select_stateY = 0;
            this.select_stateS = 0;
            this.tempImage = this.imgMonster[0];
            goVIEW_MONSTER();
            break;
          } 
          if (this.select_stateX == 1 && this.select_stateY == 1) {
            if (this.battle_type == 1) {
              int i = getRandom(10);
              if (i > 7) {
                this.say_c = 3;
                say(this.text[56] + this.text[126], 0);
                this.mini_state = 16;
                break;
              } 
              arangeMonster();
              battle_over();
              goGO_RUNINMAP();
              break;
            } 
            this.say_c = 3;
            say(this.text[8] + this.text[56], 0);
            goSELECT_ACTION();
          } 
          break;
        } 
        select_state(2, 2, 17, 1, 1);
        break;
      case -40:
        if (pressQueDing()) {
          createMagicImg();
          goThrowBall();
          keyRelease();
        } 
        break;
      case -80:
        if (pressQueDing()) {
          if ((this.myMonster[0]).monster[2 + 2 * this.select_stateY] > 0) {
            (this.myMonster[0]).monster[2 + 2 * this.select_stateY] = (byte)((this.myMonster[0]).monster[2 + 2 * this.select_stateY] - 1);
            drawBattleArea();
            goMY_ATTACK(0);
            this.lastSkill = this.select_stateY;
            this.lastSkillS = this.select_stateS;
            break;
          } 
          say(this.text[171], 0);
          break;
        } 
        if (paramInt == -7) {
          goSELECT_ACTION();
          break;
        } 
        listSelectState((this.myMonster[0]).monster[0], 2);
        this.x = 88;
        break;
      case 35:
      case 45:
        key_MONSTER_LIST();
        break;
      case 65:
        popState();
        break;
      case 25:
        key_MY_BAG();
        break;
      case 18:
        keyRelease();
        if (this.mini_state == 0) {
          if (pressQueDing()) {
            if (getItemCount(this.canBuy[this.select_stateY]) == 99) {
              say(this.text[8] + this.text[20] + this.text[30], 0);
              break;
            } 
            if (this.money >= this.price[this.canBuy[this.select_stateY]]) {
              this.mini_state = 11;
              this.select_stateT = 1;
              this.popMenustate = 0;
              this.action_str = new String[1];
              this.action_str[0] = this.text[76] + this.text[97] + this.select_stateT;
              break;
            } 
            say(this.noMoney, 0);
            break;
          } 
          if (paramInt == -7) {
            this.imgBattle[4] = null;
            goRUN_IN_MAP(this.maincanvas.musicId);
            break;
          } 
          if (paramInt == -3 || paramInt == -4) {
            goSELL_ITEM();
          } else {
            listSelectState(this.canBuy.length, this.LIST_ROWS);
          } 
          this.x = 88;
          break;
        } 
        if (paramInt == -1) {
          if (this.select_stateT + getItemCount(this.canBuy[this.select_stateY]) < 99 && (this.select_stateT + 1) * this.price[this.canBuy[this.select_stateY]] <= this.money) {
            this.select_stateT = (byte)(this.select_stateT + 1);
            this.action_str[0] = this.text[76] + this.text[97] + this.select_stateT;
          } 
          break;
        } 
        if (paramInt == -2) {
          if (this.select_stateT > 1) {
            this.select_stateT = (byte)(this.select_stateT - 1);
            this.action_str[0] = this.text[76] + this.text[97] + this.select_stateT;
          } 
          break;
        } 
        if (pressQueDing()) {
          this.money -= this.select_stateT * this.price[this.canBuy[this.select_stateY]];
          if (addItem(this.canBuy[this.select_stateY], this.select_stateT) == -1) {
            say(this.text[30] + this.text[32] + this.text[44], 1);
          } else {
            say(this.text[85] + this.select_stateT + this.text[101] + getItemName(this.canBuy[this.select_stateY]), 1);
          } 
          this.select_stateT = 0;
          this.mini_state = 0;
          this.popMenustate = -1;
          break;
        } 
        if (paramInt == -7) {
          this.select_stateT = 0;
          this.mini_state = 0;
          this.popMenustate = -1;
        } 
        break;
      case 19:
        if (this.mini_state == 0) {
          if (pressQueDing() && this.items_count[0] > 0) {
            this.mini_state = 12;
            this.select_stateT = 1;
            this.popMenustate = 0;
            this.action_str = new String[1];
            this.action_str[0] = this.text[76] + this.text[97] + this.select_stateT;
            break;
          } 
          if (paramInt == -7) {
            this.imgBattle[4] = null;
            goRUN_IN_MAP(this.maincanvas.musicId);
            break;
          } 
          if (paramInt == -3 || paramInt == -4) {
            goBUY_ITEM();
          } else {
            listSelectState(this.items_count[0], this.LIST_ROWS);
          } 
          this.x = 88;
          break;
        } 
        if (paramInt == -1) {
          if (this.select_stateT < this.items[0][this.select_stateY][1]) {
            this.select_stateT = (byte)(this.select_stateT + 1);
            this.action_str[0] = this.text[76] + this.text[97] + this.select_stateT;
          } 
          break;
        } 
        if (paramInt == -2) {
          if (this.select_stateT > 1) {
            this.select_stateT = (byte)(this.select_stateT - 1);
            this.action_str[0] = this.text[76] + this.text[97] + this.select_stateT;
          } 
          break;
        } 
        if (pressQueDing()) {
          this.money += this.select_stateT * this.price[this.items[0][this.select_stateY][0]] / 2;
          deleteItems(this.items[0][this.select_stateY][0], this.select_stateT);
          say(this.text[150] + this.select_stateT + this.text[101] + getItemName(this.items[0][this.select_stateY][0]), 1);
          this.select_stateT = 0;
          this.mini_state = 0;
          this.popMenustate = -1;
          break;
        } 
        if (paramInt == -7) {
          this.select_stateT = 0;
          this.mini_state = 0;
          this.popMenustate = -1;
        } 
        break;
      case 55:
        key_SEE_MONSTER();
        break;
      case -15:
        if (this.popMenustate >= 0) {
          if (pressQueDing() && this.learnSkillID == -1) {
            String[] arrayOfString = { this.text[112], this.text[113] };
            this.action_str = arrayOfString;
            this.learnSkillID = this.popMenustate;
            this.popMenustate = 0;
            break;
          } 
          if (paramInt == -7) {
            if (this.learnSkillID != -1)
              this.learnSkillID = -1; 
            break;
          } 
          popState();
        } 
        break;
      case 22:
        keyBank();
        break;
      case 23:
        keyGuess();
        break;
      case 88:
        keySms();
        break;
    } 
    if (this.run_state != -10 || (this.run_state == -10 && pressQueDing()))
      keyRelease(); 
  }
  
  void learnSkill(Monster paramMonster, int paramInt) {
    paramMonster.monster[1 + paramMonster.monster[0] * 2] = (byte)paramInt;
    paramMonster.monster[2 + paramMonster.monster[0] * 2] = this.skill[paramInt][1];
    paramMonster.monster[0] = (byte)(paramMonster.monster[0] + 1);
    say(getMonName(paramMonster.monster[16]) + this.text[127] + getSkillName((byte)paramInt), 0);
  }
  
  byte[] rmsOptions(int paramInt1, byte[] paramArrayOfByte, int paramInt2) {
    try {
      if (paramInt2 == 4) {
        if (this.rms != null) {
          this.rms.closeRecordStore();
          this.rms = null;
        } 
        return null;
      } 
      if (this.rms == null)
        this.rms = RecordStore.openRecordStore("s", true); 
      if (this.rms.getNumRecords() == 0) {
        byte[] arrayOfByte1 = new byte[148];
        byte[] arrayOfByte2 = new byte[20];
        arrayOfByte1[0] = -1;
        for (byte b1 = 0; b1 < 84; b1++) {
          if (b1 < 9) {
            this.rms.addRecord(arrayOfByte1, 0, arrayOfByte1.length);
          } else {
            this.rms.addRecord(arrayOfByte2, 0, arrayOfByte2.length);
          } 
        } 
      } 
      if (paramInt2 != 0) {
        if (paramInt2 == 1)
          return this.rms.getRecord(paramInt1); 
        if (paramInt2 == 2) {
          this.rms.setRecord(paramInt1, paramArrayOfByte, 0, paramArrayOfByte.length);
        } else if (paramInt2 == 3) {
          if (this.rms != null) {
            this.rms.closeRecordStore();
            this.rms = null;
          } 
          RecordStore.deleteRecordStore("s");
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return null;
  }
  
  public void saveMon(int paramInt) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    try {
      if (paramInt == 0) {
        byteArrayOutputStream.write(this.cmon_count);
        for (byte b1 = 0; b1 < this.cmon_count; b1++)
          saveMon(byteArrayOutputStream, this.monsters[b1]); 
        rmsOptions(5, byteArrayOutputStream.toByteArray(), 2);
      } else {
        byteArrayOutputStream.write(this.monster_takens);
        for (byte b1 = 0; b1 < this.monster_takens; b1++)
          saveMon(byteArrayOutputStream, this.myMonster[b1]); 
        rmsOptions(6, byteArrayOutputStream.toByteArray(), 2);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  void loadMon(int paramInt) {
    byte[] arrayOfByte = rmsOptions(5 + paramInt, null, 1);
    if (paramInt == 0) {
      this.monsters = new Monster[this.MAX_MONSTERS];
      if (arrayOfByte[0] == -1) {
        this.cmon_count = 0;
        return;
      } 
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
      this.cmon_count = (byte)byteArrayInputStream.read();
      for (byte b1 = 0; b1 < this.cmon_count; b1++) {
        this.monsters[b1] = new Monster();
        loadMon(byteArrayInputStream, this.monsters[b1]);
      } 
    } else {
      this.myMonster = new Monster[5];
      if (arrayOfByte[0] == -1) {
        this.monster_takens = 0;
        return;
      } 
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
      this.monster_takens = (byte)byteArrayInputStream.read();
      for (byte b1 = 0; b1 < this.monster_takens; b1++) {
        this.myMonster[b1] = new Monster();
        loadMon(byteArrayInputStream, this.myMonster[b1]);
      } 
    } 
  }
  
  public void saveItem() {
    byte b1 = this.items_count[0] + this.items_count[1] + this.items_count[2];
    byte[] arrayOfByte = new byte[3 + b1 * 2];
    b1 = 0;
    arrayOfByte[0] = this.items_count[0];
    arrayOfByte[1] = this.items_count[1];
    arrayOfByte[2] = this.items_count[2];
    for (byte b2 = 0; b2 < 3; b2++) {
      byte b3 = 0;
      while (b3 < this.items_count[b2]) {
        arrayOfByte[b1 * 2 + 3] = this.items[b2][b3][0];
        arrayOfByte[b1 * 2 + 4] = this.items[b2][b3][1];
        b3++;
        b1++;
      } 
    } 
    rmsOptions(4, arrayOfByte, 2);
    rmsOptions(7, this.catchedMon, 2);
  }
  
  void loadItem() {
    byte[] arrayOfByte = rmsOptions(4, null, 1);
    this.items_count = new byte[3];
    if (arrayOfByte[0] == -1) {
      this.items_count[0] = 0;
    } else {
      this.items_count[0] = arrayOfByte[0];
      this.items_count[1] = arrayOfByte[1];
      this.items_count[2] = arrayOfByte[2];
    } 
    this.items = new byte[3][30][2];
    byte b1 = 0;
    for (byte b2 = 0; b2 < 3; b2++) {
      byte b3 = 0;
      while (b3 < this.items_count[b2]) {
        this.items[b2][b3][0] = arrayOfByte[b1 * 2 + 3];
        this.items[b2][b3][1] = arrayOfByte[b1 * 2 + 4];
        if (this.items[b2][b3][0] == 41)
          this.dazhe = this.items[b2][b3][1]; 
        b3++;
        b1++;
      } 
    } 
    this.catchedMon = rmsOptions(7, null, 1);
    if (this.catchedMon[0] == -1)
      this.catchedMon = new byte[101]; 
  }
  
  void drawBattleBG() {
    this.g.drawImage(this.battleImage[0], 0, 0, 20);
    if (null == this.battleTalkImage)
      this.battleTalkImage = this.maincanvas.createImage("/battle/6.png"); 
    if (null != this.battleTalkImage) {
      this.g;
      this.g;
      this.g.drawImage(this.battleTalkImage, 0, 208, 0x4 | 0x20);
    } 
  }
  
  void drawDarkScreen() { drawColorLine(0, 0, 176, 208, 1 + this.battle_c, 6, 1, 2, 16777215, 4802889); }
  
  public void drawColorLine(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10) {
    if ((paramInt9 & 0xFF000000) != 0) {
      this.g.setColor(paramInt9);
      this.g.fillRect(paramInt1, paramInt2, paramInt3, paramInt4);
    } 
    this.g.setColor(paramInt10);
    int i = 0;
    int j = 1;
    if (paramInt8 == 1) {
      i = paramInt2 + paramInt4;
      while (paramInt2 < i) {
        this.g.fillRect(paramInt1, paramInt2, paramInt3, paramInt5);
        paramInt2 += paramInt5;
        paramInt2 += j;
        paramInt5 -= paramInt7;
        if (paramInt5 <= 0) {
          if (j < --paramInt6)
            j++; 
          paramInt5 = 1;
        } 
      } 
    } else if (paramInt8 == 2) {
      i = paramInt2;
      paramInt2 += paramInt4;
      while (paramInt2 > i) {
        this.g.fillRect(paramInt1, paramInt2 - paramInt5, paramInt3, paramInt5);
        paramInt2 -= paramInt5;
        paramInt2 -= j;
        paramInt5 -= paramInt7;
        if (paramInt5 <= 0) {
          if (j < --paramInt6)
            j++; 
          paramInt5 = 1;
        } 
      } 
    } 
  }
  
  void drawTEXT() { drawRichText(0, 168, 178, 40, 15452159, 10448383, 3473558); }
  
  public void drawRichText(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    this.g.setColor(paramInt5);
    this.g.fillRect(paramInt1 + 1, paramInt2 + 1, paramInt3 - 3, paramInt4 - 2);
    this.g.setColor(paramInt6);
    this.g.drawRoundRect(paramInt1, paramInt2, paramInt3 - 3, paramInt4 - 1, 3, 3);
    this.g.setColor(paramInt7);
    this.g.drawRect(paramInt1 + 1, paramInt2 + 1, paramInt3 - 5, paramInt4 - 3);
    this.g.setColor(paramInt6);
    this.g.fillRect(paramInt1 + paramInt3 - 3, paramInt2 + 1, 2, paramInt4 - 1);
    this.g.fillRect(paramInt1 + paramInt3 - 1, paramInt2 + 3, 2, paramInt4 - 3);
    this.g.drawLine(paramInt1 + 3, paramInt2 + paramInt4, paramInt1 + paramInt3, paramInt2 + paramInt4);
  }
  
  public void drawRichText2(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    this.g.setColor(paramInt5);
    this.g.fillRect(paramInt1 + 1, paramInt2 + 1, paramInt3 - 1, paramInt4 - 2);
    this.g.setColor(paramInt6);
    this.g.drawRoundRect(paramInt1, paramInt2, paramInt3 - 1, paramInt4 - 1, 3, 3);
    this.g.setColor(paramInt7);
    this.g.drawRect(paramInt1 + 1, paramInt2 + 1, paramInt3 - 3, paramInt4 - 3);
  }
  
  void drawEnemyState() {
    if (this.be_hit == -2)
      return; 
    int[] arrayOfInt = { 2234536, 16777215, 10443007, 14597631 };
    drawRoundRect(-10, 0, 111, 36, 8, 8, arrayOfInt);
    this.g.setColor(arrayOfInt[0]);
    this.g.drawString(getMonName(this.enemy.monster[16]), 2, 2, 20);
    this.g;
    this.g;
    this.g.drawString("生命", 41, 17, 0x8 | 0x10);
    this.g;
    this.g;
    this.g.drawString("" + this.enemy.monster[11] + this.text[77], 96, 2, 0x8 | 0x10);
    drawMonsterHP(32, 24, this.enemy.hp + 120, this.enemy.max_hp + 120, 49);
    this.g;
    this.g;
    this.g.drawImage(this.battleImage[3], 10, 32, 0x8 | 0x20);
  }
  
  void drawRoundRect(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int[] paramArrayOfInt) {
    this.g.setColor(paramArrayOfInt[3]);
    this.g.fillRoundRect(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    this.g.setColor(paramArrayOfInt[0]);
    this.g.drawRoundRect(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
    this.g.setColor(paramArrayOfInt[1]);
    this.g.drawRoundRect(paramInt1 + 1, paramInt2, paramInt3 - 2, paramInt4 - 1, paramInt5, paramInt6);
    this.g.setColor(paramArrayOfInt[2]);
    this.g.drawRoundRect(paramInt1 + 2, paramInt2 + 1, paramInt3 - 4, paramInt4 - 3, paramInt5, paramInt6);
  }
  
  void drawMyMonsterState() {
    if (this.be_hit == 2)
      return; 
    int[] arrayOfInt = { 2234536, 16777215, 10443007, 14597631 };
    drawRoundRect(74, 94, 126, 36, 8, 8, arrayOfInt);
    drawRoundRect(92, 128, 126, 20, 8, 8, arrayOfInt);
    this.g.setColor(arrayOfInt[0]);
    this.g.drawString(getMonName((this.myMonster[this.select_monster]).monster[16]), 80, 96, 20);
    this.g.drawString("经验", 96, 130, 20);
    this.g;
    this.g;
    this.g.drawString("" + (this.myMonster[this.select_monster]).monster[11] + this.text[77], 174, 96, 0x8 | 0x10);
    this.g.drawString("生命", 90, 111, 20);
    drawMonsterHP(110, 118, (this.myMonster[this.select_monster]).hp + 120, (this.myMonster[this.select_monster]).max_hp + 120, 48);
    this.g.setColor(15536986);
    this.g;
    this.g;
    drawString(0, 15124224, "" + ((this.myMonster[this.select_monster]).hp + 120) + this.text[93] + ((this.myMonster[this.select_monster]).max_hp + 120), 148, 129, true | 0x20);
    byte b1 = 0;
    b1 = (this.myMonster[this.select_monster]).monster[11] * 75 / 10 - 2;
    drawMonsterEXP(114, 136, (this.myMonster[this.select_monster]).exp, b1, 44);
    this.g;
    this.g;
    this.g.drawImage(this.battleImage[3], 90, 125, 0x8 | 0x20);
  }
  
  void drawString(int paramInt1, int paramInt2, String paramString, int paramInt3, int paramInt4, int paramInt5) {
    this.g.setColor(paramInt1);
    this.g.drawString(paramString, paramInt3 - 1, paramInt4, paramInt5);
    this.g.drawString(paramString, paramInt3, paramInt4 - 1, paramInt5);
    this.g.drawString(paramString, paramInt3 + 1, paramInt4, paramInt5);
    this.g.drawString(paramString, paramInt3, paramInt4 + 1, paramInt5);
    this.g.setColor(paramInt2);
    this.g.drawString(paramString, paramInt3, paramInt4, paramInt5);
  }
  
  void drawLoad(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    this.g.setColor(12959999);
    this.g.drawRoundRect(paramInt1 - 1, paramInt2 - 1, paramInt7 + 3, 8, 2, 2);
    this.g.setColor(14736895);
    this.g.fillRoundRect(paramInt1, paramInt2, paramInt7 + 1, 6, 2, 2);
    this.g.setColor(paramInt5);
    this.g.drawRoundRect(paramInt1, paramInt2, paramInt7 + 1, 6, 2, 2);
    if (paramInt3 > 0) {
      this.g.setColor(paramInt6);
      this.g.fillRoundRect(paramInt1 + 1, paramInt2 + 1, paramInt3 * paramInt7 / paramInt4, 5, 2, 2);
    } 
  }
  
  void drawMonsterHP(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    paramInt1 += 14;
    paramInt5--;
    int i;
    for (i = 0; i < this.dataHPColor.length; i++) {
      this.g.setColor(this.dataHPColor[i]);
      this.g.drawLine(paramInt1 + this.dataHP[i][0], paramInt2 + this.dataHP[i][1], paramInt1 + paramInt5 + this.dataHP[i][2], paramInt2 + this.dataHP[i][1]);
    } 
    i = paramInt3 * paramInt5 / paramInt4;
    if (paramInt3 > 0) {
      this.g.setColor(16762967);
      this.g.drawLine(paramInt1 + 2, paramInt2 + 1, paramInt1 + i + 0, paramInt2 + 1);
      this.g.drawLine(paramInt1 + 1, paramInt2 + 2, paramInt1 + i + 1, paramInt2 + 2);
      this.g.setColor(16736512);
      this.g.drawLine(paramInt1 + 1, paramInt2 + 3, paramInt1 + i + 1, paramInt2 + 3);
      this.g.drawLine(paramInt1 + 2, paramInt2 + 4, paramInt1 + i + 0, paramInt2 + 4);
    } 
  }
  
  void drawMonsterEXP(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    paramInt1 += 14;
    paramInt5--;
    int i;
    for (i = 0; i < this.dataHPColor.length; i++) {
      this.g.setColor(this.dataHPColor[i]);
      this.g.drawLine(paramInt1 + this.dataHP[i][0], paramInt2 + this.dataHP[i][1], paramInt1 + paramInt5 + this.dataHP[i][2], paramInt2 + this.dataHP[i][1]);
    } 
    i = paramInt3 * paramInt5 / paramInt4;
    if (paramInt3 > 0) {
      this.g.setColor(65529);
      this.g.drawLine(paramInt1 + 2, paramInt2 + 1, paramInt1 + i + 0, paramInt2 + 1);
      this.g.drawLine(paramInt1 + 1, paramInt2 + 2, paramInt1 + i + 1, paramInt2 + 2);
      this.g.setColor(8104447);
      this.g.drawLine(paramInt1 + 1, paramInt2 + 3, paramInt1 + i + 1, paramInt2 + 3);
      this.g.drawLine(paramInt1 + 2, paramInt2 + 4, paramInt1 + i + 0, paramInt2 + 4);
    } 
  }
  
  void getHELP_dialog() { this.maincanvas.getDialogs(loadText("help"), this.LINE_WIDTH); }
  
  void getAbout_dialog() { this.maincanvas.getDialogs(loadText("about"), this.LINE_WIDTH + 16); }
  
  void drawBattleArea() {
    drawBattleBG();
    drawEnemy();
    drawEnemyState();
    battle_c();
    drawMyMon();
    drawEffectImage(this.myMonster[0], 84, 134);
    drawMyMonsterState();
  }
  
  void paintMY_ATTACK() {
    drawBattleArea();
    showString(getMonName(this.A_Monster.monster[16]) + this.text[1] + this.text[2] + getSkillName(this.skill_no), 8, 162);
    sleep(100);
    myAttack();
    if (this.battle_c == 100) {
      resetParam();
      this.run_state = -87;
    } 
  }
  
  void paintMY_EFFECT() {
    drawBattleArea();
    doEffect();
  }
  
  void level_up(int paramInt) {
    if (this.mini_state == 0) {
      int i = this.skip;
      if ((this.myMonster[paramInt]).monster[11] - this.levelADD > 10) {
        i = 0;
      } else {
        i -= (this.myMonster[paramInt]).monster[11] / 3;
      } 
      if ((this.myMonster[paramInt]).monster[11] < this.MON_MAX_LV && i != 0) {
        sleep(1000);
        this.mini_state = 1;
        this.HP_c = (short)((i > 0) ? i : 0);
        if (this.battle_type == -1)
          this.HP_c = (short)(this.HP_c * 3 / 2); 
        this.HP_c = (short)(this.HP_c * this.multiExp);
        if (i != 0)
          showString(getMonName((this.myMonster[paramInt]).monster[16]) + this.text[25] + this.HP_c + this.text[26], 8, 162); 
        this.myMonster[paramInt].fealtyReduce();
      } else {
        this.damage_c = (byte)(this.damage_c + 1);
      } 
    } else if (this.mini_state == 1) {
      if ((this.myMonster[paramInt]).monster[11] < this.MON_MAX_LV) {
        int i = 0;
        int j = (this.myMonster[paramInt]).exp + this.HP_c;
        i = (this.myMonster[paramInt]).monster[11] * 75 / 10 - 2;
        if (j >= i) {
          this.HP_c = (short)(j - i);
          (this.myMonster[paramInt]).exp = 0;
          (this.myMonster[paramInt]).monster[11] = (byte)((this.myMonster[paramInt]).monster[11] + 1);
          short s = 0;
          if ((this.myMonster[paramInt]).monster[11] <= 20) {
            s = 2;
          } else if ((this.myMonster[paramInt]).monster[11] > 20 && (this.myMonster[paramInt]).monster[11] <= 40) {
            s = 3;
          } else {
            s = 4;
          } 
          (this.myMonster[paramInt]).max_hp = (short)((this.myMonster[paramInt]).max_hp + s);
          healMonster2(this.myMonster[paramInt]);
          StringBuffer stringBuffer = new StringBuffer();
          stringBuffer.append(getMonName((this.myMonster[paramInt]).monster[16]) + this.text[27] + (this.myMonster[paramInt]).monster[11] + this.text[77] + this.text[28] + "+" + s);
          if (((this.myMonster[paramInt]).monster[11] & true) == 0) {
            (this.myMonster[paramInt]).dex = (short)((this.myMonster[paramInt]).dex + 1);
            stringBuffer.append(this.text[97] + this.text[29] + this.text[100]);
          } 
          if ((this.myMonster[paramInt]).monster[11] == this.MON_MAX_LV)
            stringBuffer.append(this.text[97] + this.text[38] + this.text[44]); 
          showString(stringBuffer.toString(), 8, 162);
          sleep(1000);
          this.mini_state = 2;
        } else {
          (this.myMonster[paramInt]).exp += this.HP_c;
          this.damage_c = (byte)(this.damage_c + 1);
          this.mini_state = 0;
        } 
      } else {
        (this.myMonster[paramInt]).exp = 0;
        this.damage_c = (byte)(this.damage_c + 1);
        this.mini_state = 0;
      } 
    } else if (this.mini_state == 2) {
      if (this.popMenustate == -1) {
        this.getSkill = null;
        byte b1 = (this.myMonster[paramInt]).monster[16];
        getMagic(this.myMonster[paramInt], 1);
        if (this.view_state == 0 && this.getSkill != null) {
          this.popMenustate = 0;
          this.action_str = new String[this.getSkill.length];
          for (byte b2 = 0; b2 < this.action_str.length; b2++)
            this.action_str[b2] = getSkillName(this.getSkill[b2]); 
        } else if (this.view_state == 2) {
          showString(getMonName(b1) + this.text[128] + getMonName((this.myMonster[paramInt]).monster[16]), 8, 162);
          this.select_stateY = (byte)paramInt;
          this.select_monster = this.select_stateY;
          getMyMonImage();
          this.mini_state = 1;
          this.view_state = 0;
          sleep(1000);
        } else {
          this.mini_state = 1;
          this.view_state = 0;
        } 
      } else {
        if (this.learnSkillID == -1) {
          showString(this.text[129] + this.text[2] + ":" + this.skill_help[this.getSkill[this.popMenustate]], 8, 162);
        } else {
          showString(this.text[169], 8, 162);
        } 
        drawPopMenu(88, 90 - 14 * this.action_str.length - 4 >> 1, 14, 24);
      } 
    } else if (this.mini_state == 3 && this.say_c == 0) {
      this.mini_state = 1;
    } 
  }
  
  void monster_EXP() {
    if (this.damage_c < this.mon_in_battle[0]) {
      if (this.mini_state == 0) {
        this.select_monster = this.mon_in_battle[1 + this.damage_c];
        this.select_stateY = this.mon_in_battle[1 + this.damage_c];
        if ((this.myMonster[this.select_monster]).monster[13] == 10)
          AddHp(20, this.myMonster[this.select_monster]); 
        getMyMonImage();
        drawBattleArea();
        this.battle_c = (byte)(this.battle_c - 1);
      } 
      level_up(this.mon_in_battle[1 + this.damage_c]);
    } else {
      if (this.battle_type == 1 && getRandom(100) <= this.levelADD / 3) {
        addItem(31, 1);
        showString(this.text[25] + "宝箱1个", 8, 170);
        sleep(1000);
      } 
      this.battle_c = 100;
    } 
  }
  
  void arangeMonster() {
    if (this.monster_takens > 1)
      for (byte b1 = 0; b1 < this.monster_takens - 1; b1++) {
        for (byte b2 = b1 + true; b2 < this.monster_takens; b2++) {
          if ((this.myMonster[b1]).monster[12] > (this.myMonster[b2]).monster[12])
            changeMonster(this.myMonster[b1], this.myMonster[b2]); 
        } 
      }  
  }
  
  void drawPopMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt4;
    for (int j = 0; j < this.action_str.length; j++) {
      drawButton(paramInt1, paramInt2 + i * j, (j == this.popMenustate), 66);
      if (j == this.popMenustate) {
        this.g.setColor(this.buttonColor[0]);
      } else {
        this.g.setColor(this.buttonColor[1]);
      } 
      this.g;
      this.g;
      this.g.drawString(this.action_str[j], paramInt1, paramInt2 + 2 + i * j, true | 0x10);
    } 
  }
  
  private void drawButton(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3) {
    paramInt3 += 4;
    int i = 39 - paramInt3 / 2;
    if (paramBoolean) {
      if (this.b > 0) {
        this.b = (byte)(this.b - 1);
        i -= 2;
      } 
      this.g;
      this.g;
      this.g.drawImage(this.uiImage[20], paramInt1 + i, paramInt2, 0x8 | 0x10);
      this.g;
      this.g;
      this.dg;
      this.dg.drawImage(this.uiImage[20], paramInt1 - i, paramInt2, 0x4 | 0x10, 4);
    } else {
      this.g;
      this.g;
      this.g.drawImage(this.uiImage[5], paramInt1 + i, paramInt2, 0x8 | 0x10);
      this.g;
      this.g;
      this.dg;
      this.dg.drawImage(this.uiImage[5], paramInt1 - i, paramInt2, 0x4 | 0x10, 4);
    } 
  }
  
  void paintBATTLE_OVER() {
    drawBattleArea();
    if (this.battle_c == 1) {
      arangeMonster();
      byte b1;
      for (b1 = 1; b1 <= this.mon_in_battle[0]; b1++) {
        if ((this.myMonster[this.mon_in_battle[b1]]).hp <= -120) {
          this.myMonster[this.mon_in_battle[b1]].fealtydead();
          System.arraycopy(this.mon_in_battle, b1 + true, this.mon_in_battle, b1, this.mon_in_battle[0] - b1);
          this.mon_in_battle[0] = (byte)(this.mon_in_battle[0] - 1);
          continue;
        } 
      } 
      this.skip = 0;
      this.levelADD = (this.eMonsters[0]).monster[11];
      for (b1 = 0; b1 < this.enemy_takens; b1++) {
        this.skip += (this.eMonsters[b1]).monster[20] + (this.eMonsters[b1]).monster[11] - 5;
        if ((this.eMonsters[b1]).monster[11] > this.levelADD)
          this.levelADD = (this.eMonsters[b1]).monster[11]; 
      } 
      this.skip = this.skip * (5 * (this.EXPXISHU + 1) - this.mon_in_battle[0] * 6 + 1) / this.EXPXISHU * 5;
      this.battle_c = 2;
      this.damage_c = 0;
      bankTime();
    } 
    if (this.battle_c >= 2) {
      this.battle_c = 1;
      monster_EXP();
    } 
  }
  
  void paintENEMY_BE_HIT() {
    drawBattleArea();
    if (this.battle_c < 49)
      doSkillAttack(); 
    if (this.battle_c == 49) {
      if (this.damage_c >= 10) {
        if (this.skill_no <= 6)
          drawBomb(); 
        String[] arrayOfString1 = { this.text[158], this.text[159], this.text[160], this.text[161] };
        String[] arrayOfString2 = { this.text[162], this.text[163], this.text[164] };
        boolean bool = true;
        if (this.A_Monster.monster[30] < 30) {
          showString(arrayOfString2[0], 8, 162);
        } else if (this.A_Monster.monster[30] < 50) {
          showString(arrayOfString2[1], 8, 162);
        } else if (this.A_Monster.monster[30] < 70) {
          showString(arrayOfString2[2], 8, 162);
        } else {
          int i = getRandom(2);
          if (this.damage2 <= -25) {
            showString(arrayOfString1[i], 8, 162);
          } else if (this.damage2 >= 30) {
            showString(arrayOfString1[2 + i], 8, 162);
          } else {
            bool = false;
          } 
        } 
        if (bool)
          sleep(400); 
      } else {
        this.x_offset = -3;
        showString(getMonName(this.D_Monster.monster[16]) + this.text[11], 8, 162);
        sleep(200);
      } 
    } else if (this.battle_c > 49) {
      if (this.damage_c >= 10) {
        magicDamage();
      } else if (this.damage_c >= 2) {
        this.x_offset = 0;
        this.damage_c = (byte)(this.damage_c + 1);
        if (this.damage_c == 5) {
          this.damage_c = 100;
          attackOver();
          return;
        } 
      } 
      if (this.damage_c == 100)
        this.battle_c = 100; 
    } 
    if (this.battle_c == 100) {
      resetParam();
      this.run_state = -91;
    } 
  }
  
  void attackOver() {
    resetParam();
    this.magicNum = 0;
    if (this.newRound == 0) {
      goMY_ATTACK(1);
      this.newRound = 1;
    } else if (this.enemy.monster[16] == 100) {
      battle_over();
      goGO_RUNINMAP();
    } else {
      this.newRound = 0;
      this.mini_state = 0;
      for (byte b1 = 0; b1 < 6; b1++) {
        effectR(this.A_Monster, b1, 1);
        effectR(this.D_Monster, b1, 1);
      } 
      goSELECT_ACTION();
    } 
  }
  
  void getMyMonImage() {
    this.imgMonster[0] = null;
    this.imgMonster[0] = Image((this.myMonster[this.select_stateY]).monster[16]);
  }
  
  void getCoMonImage() { this.imgMonster[0] = Image(this.monster.monster[16]); }
  
  void getEnemyImage() { this.imgMonster[1] = Image(this.enemy.monster[16]); }
  
  Image Image(int paramInt) { return createImageOneOfArray("mon", paramInt); }
  
  void getMonImage(int paramInt) {
    this.imgMonster[0] = null;
    this.imgMonster[0] = this.maincanvas.createImage("/mon/" + paramInt + ".png");
  }
  
  public void getBallImage() {
    if (this.imgBattle[2] == null) {
      Image image = createImage(8);
      this.imgBattle[2] = GameRun_Father.createImage(image, 0, 80, 16, 16, 0);
      image = null;
    } 
  }
  
  public void getDriverGif() { this.boatGif = this.maincanvas.createImageArray(8, "sail"); }
  
  public void getMagicDoorGif() { this.magicGif = this.maincanvas.createImageArray(7, "magicdoor"); }
  
  public void setDriverGifNull() {
    this.boatGif = null;
    this.magicGif = null;
  }
  
  public void throwBall(byte paramByte, int paramInt) {
    this.x += this.x_speed;
    this.y += this.y_speed - this.z_speed;
    if (null != this.imgBattle[2])
      if ((paramByte & true) == 0) {
        this.g.drawImage(this.imgBattle[2], this.x, this.y, 20);
      } else {
        this.dg;
        this.dg.drawImage(this.imgBattle[2], this.x, this.y, 20, 1);
      }  
    this.y_speed = (byte)(this.y_speed + paramInt);
  }
  
  public void drawActionMenu() {
    byte b1 = 0;
    for (byte b2 = 0; b2 < this.action_str.length; b2++) {
      if ((this.select_stateY << 1 | this.select_stateX) == b2) {
        this.g.setColor(this.buttonColor[2]);
        b1 = 1;
      } else {
        b1 = 2;
        this.g.setColor(this.buttonColor[3]);
      } 
      this.g.drawImage(this.battleImage[b1], 83 + b2 % 2 * 44 - 4, 'ª' + b2 / 2 * 22 - '\004' - '\b', 20);
      this.g.drawString(this.action_str[b2], 83 + b2 % 2 * 44, 'ª' + b2 / 2 * 22 - '\b' - '\003', 20);
    } 
  }
  
  void goSelect_skill() {
    this.run_state = -80;
    this.x = 88;
    this.select_stateX = 0;
    this.select_stateY = 0;
    this.select_stateS = 0;
    if (this.lastSkill != -1) {
      this.select_stateY = this.lastSkill;
      this.select_stateS = this.lastSkillS;
    } 
    this.battle_c = 0;
    this.LIST_ROWS = 5;
    this.action_str = new String[(this.myMonster[0]).monster[0]];
    for (byte b1 = 0; b1 < this.action_str.length; b1++)
      this.action_str[b1] = getSkillName((this.myMonster[0]).monster[b1 * 2 + 1]); 
  }
  
  private void drawSkill_help(String paramString, int paramInt) {
    int[] arrayOfInt = { 2234536, 16777215, 10443007, 14597631 };
    drawRoundRect(-10, 0, 196, 20, 8, 8, arrayOfInt);
    this.g.setColor(arrayOfInt[0]);
    if (paramString.length() > 9) {
      this.x -= 4;
      if (this.x < -16 * (paramString.length() - 4))
        this.x = 88; 
      this.g;
      this.g;
      this.g.drawString(paramString, this.x, paramInt + 2 >> 1, 0x4 | 0x10);
    } else {
      this.g;
      this.g;
      this.g.drawString(paramString, 88, paramInt + 2 >> 1, true | 0x10);
    } 
  }
  
  public void drawSkillSelectMenu() {
    drawSkill_help(this.skill_help[(this.myMonster[0]).monster[1 + this.select_stateY * 2]], 0);
    char c = '¤';
    c -= '\005';
    c += '\020';
    this.l_count = (this.myMonster[0]).monster[0];
    for (byte b1 = this.select_stateS; b1 < ((this.select_stateS + 2 < (this.myMonster[0]).monster[0]) ? (this.select_stateS + 2) : (this.myMonster[0]).monster[0]); b1++) {
      if (b1 == this.select_stateY) {
        int[] arrayOfInt = { 2234536, 16777215, 10443007, 14597631 };
        drawRoundRect(12, c - '\004' - '\020' + '\002', 138, 20, 2, 2, arrayOfInt);
        this.g.setColor(16777215);
      } else {
        int[] arrayOfInt = { 2234536, 16777215, 10443007, 7419587 };
        drawRoundRect(12, c - '\004' - '\020' + '\002', 138, 20, 2, 2, arrayOfInt);
        this.g.setColor(14597631);
      } 
      c -= '\002';
      this.g;
      this.g;
      this.g.drawString(this.action_str[b1], 16, c, 0x4 | 0x40);
      this.skill_no = (this.myMonster[0]).monster[1 + b1 * 2];
      this.g;
      this.g;
      this.g.drawString(this.text[94] + this.skillT[this.skill[this.skill_no][2]] + this.text[95], 80, c, 0x4 | 0x40);
      this.g;
      this.g;
      this.g.drawString("" + (this.myMonster[0]).monster[b1 * 2 + 2] + this.text[93] + this.skill[this.skill_no][1], 145, c, 0x8 | 0x40);
      setShow(2);
      if ((this.time_count & 0x10) != 0) {
        this.dg;
        this.dg.drawImage(this.uiImage[28], 148, 161, 20, 1);
      } 
      if ((this.time_count & true) != 0) {
        this.dg;
        this.dg.drawImage(this.uiImage[28], 148, 187, 20, 3);
      } 
      c += '\026';
    } 
  }
  
  void battle_over() {
    this.select_monster = 0;
    this.eMonsters = new Monster[5];
    this.enemy = null;
    this.imgMonster[1] = null;
    this.imgMonster[0] = null;
    this.be_hit = 0;
    this.battleTalkImage = null;
    this.battleImage = null;
    this.effectImage = null;
    this.tempImage = null;
    this.magicImg = null;
  }
  
  void createMagicImg() {
    this.skillImage = setSkillImage();
    this.magicImg = new Image[75];
    for (byte b1 = 0; b1 < this.skillImage.length; b1++) {
      if (this.magicImg[this.skillImage[b1]] == null)
        this.magicImg[this.skillImage[b1]] = this.maincanvas.createImage("/magic/" + this.skillImage[b1] + ".png"); 
    } 
  }
  
  void createBattleImage() {
    if (this.battleImage == null)
      this.battleImage = this.maincanvas.createImageArray(4, "battle"); 
  }
  
  public void init() {
    loadItem();
    getBallImage();
    loadMon(0);
    loadMon(1);
  }
  
  byte delMonster(int paramInt) {
    byte b1 = (this.myMonster[paramInt]).monster[16];
    if (monsterRemove(paramInt) != null) {
      say(this.text[23] + this.text[42] + getMonName(b1), 0);
      return 1;
    } 
    say(this.text[96] + this.text[54] + this.text[42], 0);
    return -1;
  }
  
  Monster monsterRemove(int paramInt) {
    Monster monster1 = null;
    if (this.monster_takens > 1) {
      if ((this.myMonster[paramInt]).monster[13] != -1)
        addItem((this.myMonster[paramInt]).monster[13], 1); 
      monster1 = this.myMonster[paramInt];
      this.myMonster[paramInt] = null;
      for (int i = paramInt; i < this.monster_takens - 1; i++)
        this.myMonster[i] = this.myMonster[i + 1]; 
      this.monster_takens = (byte)(this.monster_takens - 1);
      return monster1;
    } 
    return null;
  }
  
  void healMonster(Monster paramMonster) {
    paramMonster.hp = paramMonster.max_hp;
    paramMonster.effect = new byte[6][3];
    for (byte b1 = 0; b1 < paramMonster.monster[0]; b1++)
      paramMonster.monster[2 + 2 * b1] = this.skill[paramMonster.monster[1 + 2 * b1]][1]; 
  }
  
  void healMonster2(Monster paramMonster) {
    paramMonster.hp = paramMonster.max_hp;
    paramMonster.effect = new byte[6][3];
  }
  
  void healMonster() {
    for (byte b1 = 0; b1 < this.monster_takens; b1++) {
      (this.myMonster[b1]).hp = (this.myMonster[b1]).max_hp;
      healMonster(this.myMonster[b1]);
    } 
    this.mapP.inShop = 1;
    say(this.text[15] + this.text[42] + this.text[90] + this.text[16], 0);
  }
  
  byte findMonster(int paramInt1, int paramInt2, int paramInt3) {
    byte b1 = -1;
    for (byte b2 = 0; b2 < this.monster_takens; b2++) {
      if ((this.myMonster[b2]).monster[16] == paramInt1 && (this.myMonster[b2]).monster[11] >= paramInt2 && (this.myMonster[b2]).monster[30] >= paramInt3)
        return (byte)b2; 
    } 
    return b1;
  }
  
  byte getMonster(int paramInt1, int paramInt2) {
    this.enemy = new Monster(this, paramInt1, paramInt2);
    if (this.cmon_count == this.MAX_MONSTERS && this.monster_takens == 5) {
      say(this.text[43] + this.text[42] + this.text[44], 0);
      return -1;
    } 
    this.enemy.getMonFealty();
    getMonster();
    say(this.text[25] + this.text[42] + getMonName((byte)paramInt1), 0);
    return 1;
  }
  
  void getMonster() {
    if (this.monster_takens < 5) {
      this.myMonster[this.monster_takens] = this.enemy;
      (this.myMonster[this.monster_takens]).monster[12] = this.monster_takens;
      this.monster_takens = (byte)(this.monster_takens + 1);
      this.catchedMon[this.enemy.monster[16]] = 1;
    } else if (this.cmon_count < this.MAX_MONSTERS) {
      healMonster(this.enemy);
      showString(this.text[57] + this.text[44] + getMonName(this.enemy.monster[16]) + this.text[130] + this.text[82], 8, 162);
      this.monsters[this.cmon_count] = this.enemy;
      this.cmon_count = (byte)(this.cmon_count + 1);
      this.catchedMon[this.enemy.monster[16]] = 1;
    } 
  }
  
  boolean findItem(int paramInt) {
    if (paramInt >= 10 && paramInt < 22) {
      this.item_type = 1;
    } else if (paramInt < 10 || (paramInt >= 33 && paramInt <= 36)) {
      this.item_type = 0;
    } else {
      this.item_type = 2;
    } 
    if (paramInt == 40 || paramInt == 41 || paramInt == 39 || paramInt == 15) {
      this.item_type = 2;
    } else if (paramInt == 38) {
      this.item_type = 0;
    } 
    for (byte b1 = 0; b1 < this.items_count[this.item_type]; b1 = (byte)(b1 + true)) {
      if (this.items[this.item_type][b1][0] == paramInt) {
        this.item_no = b1;
        return true;
      } 
    } 
    this.item_no = -1;
    return false;
  }
  
  byte checkMonItem(int paramInt) {
    for (byte b1 = 0; b1 < this.monster_takens; b1 = (byte)(b1 + 1)) {
      if ((this.myMonster[b1]).monster[13] == paramInt)
        return b1; 
    } 
    return -1;
  }
  
  byte getMoney(int paramInt) {
    if (paramInt >= 0) {
      this.money += paramInt * 100;
      say(this.text[25] + this.text[98] + (paramInt * 100), 0);
    } else {
      this.money += paramInt * 10;
      say(this.text[23] + this.text[98] + (-paramInt * 10), 0);
    } 
    return 1;
  }
  
  boolean hasMoney(int paramInt) { return (this.money >= paramInt * 10); }
  
  byte getItem(int paramInt1, int paramInt2) {
    if (paramInt1 == 42) {
      this.money += paramInt2 * 100;
      say(this.text[25] + this.text[98] + (paramInt2 * 100), 0);
      return 1;
    } 
    if (addItem(paramInt1, paramInt2) == 1) {
      say(this.text[25] + getItemName((byte)paramInt1) + paramInt2 + this.text[101], 0);
      return 1;
    } 
    say(this.text[30] + this.text[32] + this.text[44], 0);
    return -1;
  }
  
  byte addItem(int paramInt1, int paramInt2) {
    findItem(paramInt1);
    if (this.item_no != -1) {
      this.items[this.item_type][this.item_no][1] = (byte)(this.items[this.item_type][this.item_no][1] + paramInt2);
      if (this.items[this.item_type][this.item_no][1] > 99) {
        this.items[this.item_type][this.item_no][1] = 99;
        say(this.text[30] + this.text[44], 1);
        return -1;
      } 
    } else {
      this.items[this.item_type][this.items_count[this.item_type]][0] = (byte)paramInt1;
      this.items[this.item_type][this.items_count[this.item_type]][1] = (byte)paramInt2;
      this.items_count[this.item_type] = (byte)(this.items_count[this.item_type] + 1);
    } 
    return 1;
  }
  
  void deleteItems(int paramInt1, int paramInt2) {
    findItem(paramInt1);
    if (this.item_no != -1) {
      if (this.items[this.item_type][this.item_no][1] >= paramInt2)
        this.items[this.item_type][this.item_no][1] = (byte)(this.items[this.item_type][this.item_no][1] - paramInt2); 
      if (this.items[this.item_type][this.item_no][1] == 0)
        deleteItem(); 
    } 
  }
  
  void getItems(int paramInt) {
    if ((this.myMonster[this.select_stateT]).monster[13] != -1) {
      say(getMonName((this.myMonster[this.select_stateT]).monster[16]) + this.text[63] + getItemName((this.myMonster[this.select_stateT]).monster[13]) + this.text[97] + this.text[36] + getItemName(this.items[this.item_type][this.item_no][0]), 1);
      addItem((this.myMonster[this.select_stateT]).monster[13], 1);
      equipItem((this.myMonster[this.select_stateT]).monster[13], -1);
    } else {
      say(getMonName((this.myMonster[this.select_stateT]).monster[16]) + this.text[36] + getItemName(this.items[this.item_type][this.item_no][0]), 1);
    } 
    (this.myMonster[this.select_stateT]).monster[13] = (byte)paramInt;
    deleteItems(paramInt, 1);
    equipItem(paramInt, 1);
  }
  
  void equipItem(int paramInt1, int paramInt2) {
    if (paramInt1 >= 16 && paramInt1 <= 21)
      this.myMonster[this.select_stateT].addDex((paramInt1 - 16 + 1) * paramInt2); 
  }
  
  void deleteItem() {
    for (byte b1 = this.item_no; b1 < this.items_count[this.item_type] - 1; b1++)
      this.items[this.item_type][b1] = this.items[this.item_type][b1 + 1]; 
    this.items[this.item_type][this.items_count[this.item_type] - 1] = new byte[2];
    this.items_count[this.item_type] = (byte)(this.items_count[this.item_type] - 1);
  }
  
  void sayNo(String paramString) {
    this.last_state = 35;
    this.run_state = 16;
    this.say_c = 3;
    say(paramString, 1);
    this.select_stateT = 0;
  }
  
  void sayUse() {
    if (this.view_state == 1) {
      this.last_state = -70;
      this.mini_state = 16;
    } else {
      this.last_state = 25;
      this.select_stateS = this.temp_stateS;
    } 
    this.run_state = 16;
    say("对" + getMonName((this.myMonster[this.select_stateT]).monster[16]) + this.text[1] + getItemName(this.items[this.item_type][this.item_no][0]), 1);
    deleteItems(this.items[this.item_type][this.item_no][0], 1);
    this.select_stateT = 0;
  }
  
  void hpAdd(int paramInt) {
    if ((this.myMonster[this.select_stateT]).hp < (this.myMonster[this.select_stateT]).max_hp && (this.myMonster[this.select_stateT]).hp > -120) {
      AddHp(paramInt, this.myMonster[this.select_stateT]);
      drawMonsterHP(5, 127, (this.myMonster[this.select_stateT]).hp + 120, (this.myMonster[this.select_stateT]).max_hp + 120, 47);
      sayUse();
    } else if ((this.myMonster[this.select_stateT]).hp == -120) {
      sayNo(getMonName((this.myMonster[this.select_stateT]).monster[16]) + this.text[7] + this.text[90] + this.text[1] + this.text[24]);
    } else {
      sayNo(getMonName((this.myMonster[this.select_stateT]).monster[16]) + this.text[1] + this.text[24]);
    } 
  }
  
  void fealtyAdd(int paramInt) {
    if ((this.myMonster[this.select_stateT]).hp == -120) {
      sayNo(getMonName((this.myMonster[this.select_stateT]).monster[16]) + this.text[7] + this.text[90] + this.text[1] + this.text[24]);
    } else if ((this.myMonster[this.select_stateT]).monster[30] < (this.myMonster[this.select_stateT]).monster[29]) {
      addfealty(paramInt, this.myMonster[this.select_stateT]);
      drawFealty(this.myMonster);
      sayUse();
    } else {
      sayNo(getMonName((this.myMonster[this.select_stateT]).monster[16]) + this.text[1] + this.text[24]);
    } 
  }
  
  void useItem() {
    byte b1;
    switch (this.items[this.item_type][this.item_no][0]) {
      case 2:
        hpAdd(100);
        break;
      case 0:
        hpAdd(20);
        break;
      case 1:
        hpAdd(60);
        break;
      case 8:
        sayUse();
        for (b1 = 0; b1 < (this.myMonster[this.select_stateY]).monster[0]; b1++)
          (this.myMonster[this.select_stateY]).monster[b1 * 2 + 2] = this.skill[(this.myMonster[this.select_stateY]).monster[1 + 2 * b1]][1]; 
        break;
      case 4:
        if ((this.myMonster[this.select_stateT]).effect == null) {
          (this.myMonster[this.select_stateT]).effect = new byte[6][3];
          for (b1 = 0; b1 < 6; b1++)
            (this.myMonster[this.select_stateT]).effect[b1][0] = 0; 
        } 
        for (b1 = 0; b1 < 5; b1++) {
          if ((this.myMonster[this.select_stateT]).effect[b1][0] < 0) {
            (this.myMonster[this.select_stateT]).effect[b1][0] = 0;
            (this.myMonster[this.select_stateT]).effect[b1][1] = 0;
            (this.myMonster[this.select_stateT]).effect[b1][2] = 0;
            sayUse();
          } else {
            sayNo(getMonName((this.myMonster[this.select_stateT]).monster[16]) + this.text[1] + this.text[24]);
          } 
        } 
        break;
      case 3:
        fealtyAdd(20);
        break;
      case 33:
        sayUse();
        this.myMonster[this.select_stateT].addDex(1);
        break;
      case 35:
        sayUse();
        this.myMonster[this.select_stateT].addDex(3);
        break;
      case 34:
        sayUse();
        this.myMonster[this.select_stateT].addMaxHP(5);
        break;
      case 36:
        sayUse();
        this.myMonster[this.select_stateT].addMaxHP(10);
        break;
      case 9:
        hpAdd(9999);
        break;
      case 37:
        this.MON_MAX_LV = (byte)(this.MON_MAX_LV + 1);
        break;
      case 38:
        if ((this.myMonster[this.select_stateT]).hp == -120) {
          healMonster(this.myMonster[this.select_stateT]);
          sayUse();
          break;
        } 
        sayNo(getMonName((this.myMonster[this.select_stateT]).monster[16]) + this.text[1] + this.text[24]);
        break;
    } 
  }
  
  void goGO_BATTLE() {
    this.select_stateY = 0;
    this.select_stateX = 0;
    this.select_stateS = 0;
    this.mini_state = 0;
    this.view_state = 0;
    this.mapP.yudaoJingying = 0;
    this.mapP.my_state = 15;
    this.createOver = 0;
    System.gc();
    this.run_state = -30;
    newMonsterView();
  }
  
  void goENEMY_THROW() {
    this.run_state = -22;
    this.draw_c = 3;
    this.createOver = 1;
    this.y_speed = -3;
    this.x = 136 - this.imgBattle[2].getWidth() / 2;
    this.y = 10;
    this.x_speed = 0;
    this.y_speed = 5;
    this.battle_c = 0;
  }
  
  void goThrowBall() {
    this.run_state = -60;
    for (byte b1 = 0; b1 < this.monster_takens; b1 = (byte)(b1 + true)) {
      if ((this.myMonster[b1]).hp > -120) {
        changeMonster(this.myMonster[0], this.myMonster[b1]);
        this.select_monster = 0;
        this.mon_in_battle[0] = 1;
        this.mon_in_battle[1] = b1;
        break;
      } 
    } 
    showString(this.text[5] + this.text[91] + getMonName((this.myMonster[0]).monster[16]), 8, 162);
    this.draw_c = 3;
    this.createOver = 1;
    this.x_speed = 2;
    this.y_speed = -6;
    this.x = -10;
    this.y = 80;
    this.battle_c = 0;
  }
  
  void goTalkBattle() {
    this.battle_c = 0;
    drawEnemyState();
    this.run_state = -40;
    if (this.battle_type == 1) {
      showString(this.text[12] + this.text[91] + this.text[13] + getMonName(this.enemy.monster[16]) + this.text[14], 8, 162);
    } else {
      showString(this.text[40] + this.text[1] + getMonName(this.enemy.monster[16]), 8, 162);
    } 
    this.g;
    this.g;
    this.g.drawImage(this.maincanvas.imgYesNo[0], 0, 208, 0x4 | 0x20);
  }
  
  void goMY_ATTACK(int paramInt) {
    if (paramInt == 0) {
      enemy_AI();
      if (this.mini_state == 0) {
        if ((this.myMonster[0]).dex >= this.enemy.dex) {
          this.mini_state = 16;
        } else {
          this.mini_state = 32;
        } 
      } else {
        if ((this.mini_state & 0x20) == 32) {
          this.imgMonster[1] = null;
          this.createOver = 1;
          goSELECT_ACTION();
        } 
        return;
      } 
    } else if (this.mini_state == 16) {
      enemy_AI();
      this.mini_state = 32;
    } else {
      this.mini_state = 16;
    } 
    if (this.mini_state == 16) {
      this.skill_no = (this.myMonster[0]).monster[this.select_stateY * 2 + 1];
      this.A_Monster = this.myMonster[0];
      this.D_Monster = this.enemy;
      this.be_hit = -1;
    } else {
      this.A_Monster = this.enemy;
      this.D_Monster = this.myMonster[0];
      this.skill_no = this.enemy_skill;
      this.be_hit = 1;
    } 
    byte b1;
    for (b1 = 0; b1 < this.A_Monster.effect.length; b1++) {
      if (this.A_Monster.effect[b1][0] < 0) {
        this.run_state = -93;
        break;
      } 
      this.run_state = -85;
    } 
    if (this.A_Monster.effect[5][0] > 0)
      this.run_state = -93; 
    for (b1 = 0; b1 < 6; b1++)
      effectR(this.A_Monster, b1, 0); 
    this.battle_c = 0;
  }
  
  void drawBomb() {
    this.g.setColor(15949568);
    if (this.be_hit == 1) {
      this.g.fillArc(136, 60, 16, 6, 0, 360);
      this.g.fillArc(141, 55, 6, 16, 0, 360);
    } else {
      this.g.fillArc(38, 118, 16, 6, 0, 360);
      this.g.fillArc(43, 113, 6, 16, 0, 360);
    } 
  }
  
  void enemy_AI() {
    byte b1 = this.enemy.monster[0];
    int i = getRandom(100);
    byte b2 = -1;
    byte b3;
    for (b3 = 0; b3 < this.skillAI[b1 + b2].length; b3 = (byte)(b3 + true)) {
      i -= this.skillAI[b1 + b2][b3];
      if (i <= 0)
        this.enemy_skill = b3; 
    } 
    this.enemy_skill = this.enemy.monster[this.enemy_skill * 2 + 1];
  }
  
  void changeEnemy() {
    for (byte b1 = 0; b1 < this.enemy_takens; b1++) {
      if (this.enemy.monster[12] != (this.eMonsters[b1]).monster[12] && (this.eMonsters[b1]).hp > -120) {
        this.enemy = this.eMonsters[b1];
        return;
      } 
    } 
  }
  
  void battle_c() {
    if (this.battle_c < 50)
      this.battle_c = (byte)(this.battle_c + 1); 
  }
  
  void showString(String paramString, int paramInt1, int paramInt2) {
    paramInt1 += 8;
    if (null == this.mapP || (this.run_state > -15 && this.mapP.my_state != 15 && this.mapP.my_state != 8) || this.run_state == -80 || this.run_state == 40 || this.run_state == 88) {
      drawTEXT();
      this.g.setColor(4802889);
    } else {
      if (null == this.battleTalkImage)
        this.battleTalkImage = this.maincanvas.createImage("/battle/6.png"); 
      if (null != this.battleTalkImage) {
        this.g;
        this.g;
        this.g.drawImage(this.battleTalkImage, 0, 208, 0x4 | 0x20);
      } 
      this.g.setColor(16773328);
      paramInt2 -= 2;
    } 
    if (paramString.length() > 9) {
      this.g;
      this.g;
      this.g.drawString(paramString.substring(0, 9), paramInt1, paramInt2 + 16, 0x4 | 0x40);
      this.g;
      this.g;
      this.g.drawString(paramString.substring(9, paramString.length()), paramInt1, paramInt2 + 32, 0x4 | 0x40);
    } else {
      this.g;
      this.g;
      this.g.drawString(paramString, paramInt1, paramInt2 + 16, 0x4 | 0x40);
    } 
  }
  
  void gogoWord(String paramString) {
    this.x -= 4;
    this.y = 184;
    this.g.setColor(29116);
    if (this.x + this.maincanvas.font.stringWidth(paramString) < 20)
      this.x = 88; 
    this.g.setClip(20, this.y, 136, 24);
    this.g.drawString(paramString, this.x, this.y, 20);
    this.g.setClip(0, 0, 176, 208);
  }
  
  void flashString() {
    if (this.word != null) {
      if (this.say_c > 0) {
        this.g.setColor(4802889);
        if (this.word.length() <= 10) {
          drawTitleOFView(this.word);
        } else if (this.say_c < 9) {
          drawTitleOFView(this.word.substring(0, 10));
        } else {
          drawTitleOFView(this.word.substring(10, this.word.length()));
        } 
        this.say_c = (byte)(this.say_c + 1);
      } 
      if (this.say_c >= 15) {
        this.say_c = 0;
        if (this.last_state != 0) {
          if (this.last_state == 25) {
            this.select_stateS = this.temp_stateS;
            this.temp_stateS = 0;
            goMY_BAG();
          } else if (this.last_state == -70) {
            this.mini_state = 16;
            newMonsterView();
            goSELECT_ACTION();
          } else {
            this.run_state = this.last_state;
          } 
          this.last_state = 0;
        } 
      } 
    } else if (this.str_show != null) {
      map_flashString();
    } 
  }
  
  void goPAUSE() {
    this.say_c = 0;
    String[] arrayOfString = { this.text[79], this.text[81] + this.text[42], this.text[80], this.text[1] + this.text[30], this.text[139], this.text[104], this.text[84] };
    this.maincanvas.soundStop();
    this.view_state = 0;
    this.mini_state = 0;
    this.action_str = arrayOfString;
    this.run_state = 99;
    this.x = -40;
  }
  
  void goRUN_IN_MAP(int paramInt) {
    this.imageTemp = null;
    this.textBank = null;
    this.select_stateY = 0;
    this.select_stateX = 0;
    this.select_stateS = 0;
    this.mini_state = 0;
    this.view_state = 0;
    this.imgBattle[4] = null;
    this.imgMonster[0] = null;
    this.imgMonster[1] = null;
    this.maincanvas.game_state = 30;
    if (paramInt != -1)
      this.maincanvas.setMusic(paramInt, false); 
    this.run_state = -10;
    this.price = null;
    this.createOver = 0;
    bankBank();
  }
  
  String getItemName(int paramInt) { return this.item_name[paramInt]; }
  
  String getMonName(byte paramByte) { return this.NAME[paramByte]; }
  
  String getSkillName(byte paramByte) { return this.skill_name[paramByte]; }
  
  int getSkillID(String paramString) {
    byte b1 = -1;
    for (int i = 0; i < this.skill_name.length; i++) {
      if (this.skill_name[i] == paramString) {
        b1 = i;
        i = this.skill_name.length;
      } 
    } 
    return b1;
  }
  
  void saveMon(ByteArrayOutputStream paramByteArrayOutputStream, Monster paramMonster) {
    try {
      paramByteArrayOutputStream.write(paramMonster.monster);
      paramByteArrayOutputStream.write((byte)(paramMonster.exp & 0xFF));
      paramByteArrayOutputStream.write((byte)(paramMonster.exp >> 8 & 0xFF));
      paramByteArrayOutputStream.write((byte)(paramMonster.exp >> 16 & 0xFF));
      paramByteArrayOutputStream.write(paramMonster.exp >> 24 & 0xFF);
      paramByteArrayOutputStream.write((byte)(paramMonster.hp & 0xFF));
      paramByteArrayOutputStream.write((byte)(paramMonster.hp >> 8 & 0xFF));
      paramByteArrayOutputStream.write((byte)(paramMonster.max_hp & 0xFF));
      paramByteArrayOutputStream.write((byte)(paramMonster.max_hp >> 8 & 0xFF));
      paramByteArrayOutputStream.write((byte)(paramMonster.dex & 0xFF));
      paramByteArrayOutputStream.write((byte)(paramMonster.dex >> 8 & 0xFF));
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  void loadMon(ByteArrayInputStream paramByteArrayInputStream, Monster paramMonster) {
    paramMonster.monster = new byte[31];
    try {
      paramByteArrayInputStream.read(paramMonster.monster);
      byte[] arrayOfByte = new byte[10];
      paramByteArrayInputStream.read(arrayOfByte);
      paramMonster.exp = (arrayOfByte[3] & 0xFF) << 24 | (arrayOfByte[2] & 0xFF) << 16 | (arrayOfByte[1] & 0xFF) << 8 | arrayOfByte[0] & 0xFF;
      paramMonster.hp = (short)((arrayOfByte[5] & 0xFF) << 8 | arrayOfByte[4] & 0xFF);
      paramMonster.max_hp = (short)((arrayOfByte[7] & 0xFF) << 8 | arrayOfByte[6] & 0xFF);
      paramMonster.dex = (short)((arrayOfByte[9] & 0xFF) << 8 | arrayOfByte[8] & 0xFF);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  void say(String paramString, int paramInt) {
    this.say_c = 3;
    if (paramInt == 0) {
      this.str_show = paramString;
      this.word = null;
    } else {
      this.str_show = null;
      this.word = paramString;
    } 
  }
  
  byte[] getStream(String paramString, int paramInt) {
    byte[] arrayOfByte = null;
    try {
      DataInputStream dataInputStream = new DataInputStream(getClass().getResourceAsStream("/" + paramString));
      dataInputStream.readByte();
      byte b1;
      for (b1 = 0; b1 < paramInt; b1 = (byte)(b1 + true))
        dataInputStream.skip(dataInputStream.readShort()); 
      arrayOfByte = new byte[dataInputStream.readShort()];
      dataInputStream.read(arrayOfByte);
      dataInputStream.close();
      dataInputStream = null;
    } catch (Exception exception) {}
    return arrayOfByte;
  }
  
  Image createImageOneOfArray(String paramString, int paramInt) {
    byte[] arrayOfByte = getStream(paramString + ".dat", paramInt);
    return Image.createImage(arrayOfByte, 0, arrayOfByte.length);
  }
  
  byte[] createData(int paramInt) { return getStream("2.dat", paramInt); }
  
  Image createImage(int paramInt) {
    byte[] arrayOfByte = getStream("pic.dat", paramInt);
    null = null;
    return Image.createImage(arrayOfByte, 0, arrayOfByte.length);
  }
  
  Image[] createCellImage(byte[] paramArrayOfByte, int paramInt1, int paramInt2) {
    Image image = null;
    Image[] arrayOfImage = new Image[paramInt1];
    this.firesave = new byte[paramInt1][2];
    byte b1;
    for (b1 = 0; b1 < paramInt1; b1++)
      this.firesave[b1][0] = -1; 
    b1 = -1;
    byte[] arrayOfByte = new byte[3];
    for (int i = 0; i < paramInt1; i++) {
      arrayOfByte[0] = paramArrayOfByte[paramInt2 + paramInt1 + i];
      arrayOfByte[1] = paramArrayOfByte[paramInt2 + paramInt1 * 2 + i];
      arrayOfByte[2] = paramArrayOfByte[paramInt2 + paramInt1 * 3 + i];
      if (arrayOfByte[0] != b1) {
        image = null;
        image = createImage(arrayOfByte[0]);
        b1 = arrayOfByte[0];
      } 
      arrayOfImage[i] = createCellImage(image, arrayOfByte[1], 16, 16, arrayOfByte[2]);
      for (int j = this.firedata.length - 1; j >= 0; j--) {
        if (arrayOfByte[0] == this.firedata[j][0] && arrayOfByte[1] == this.firedata[j][1]) {
          this.firesave[i][0] = this.firedata[j][2];
          this.firesave[i][1] = arrayOfByte[2];
        } 
      } 
    } 
    image = null;
    return arrayOfImage;
  }
  
  Image createCellImage(Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    null = null;
    int i = paramInt1 % paramImage.getWidth() / paramInt2 * paramInt2;
    int j = paramInt1 / paramImage.getWidth() / paramInt2 * paramInt3;
    return GameRun_Father.createImage(paramImage, i, j, paramInt2, paramInt3, paramInt4);
  }
  
  void map_flashString() {
    if (this.say_c > 0) {
      showString(this.str_show, 8, 170);
      this.say_c = (byte)(this.say_c + 1);
    } 
    if (this.say_c >= this.say_show_time)
      this.say_c = 0; 
  }
  
  void mapNameSay() {
    if (this.mapNsay_c > 0 && this.run_state == -10 && this.showArea == -1 && this.city_name != null) {
      this.g.setColor(10448383);
      this.g.fillRoundRect(0, 0, 80, 22, 6, 6);
      this.g.setColor(15452159);
      this.g.drawRoundRect(1, 1, 79, 20, 6, 6);
      this.g;
      this.g;
      drawString(6371758, 16776091, this.city_name[this.mapP.mapNo], 40, 3, true | 0x10);
      this.mapNsay_c = (byte)(this.mapNsay_c + 1);
    } 
    if (this.mapNsay_c >= 25)
      this.mapNsay_c = 0; 
  }
  
  void createItemImage() { this.imgBattle[4] = createImage(8); }
  
  void data_init() {
    createText();
    byte[] arrayOfByte = createData(1);
    this.skip = 0;
    this.A = create2Array(arrayOfByte);
    this.uiData = create3Array(arrayOfByte);
    this.skill_name = createStringArray(arrayOfByte);
    this.skill_up = create2Array(arrayOfByte);
    this.monster_pro = create2Array(arrayOfByte);
    this.NAME = createStringArray(arrayOfByte);
    this.skill = create2Array(arrayOfByte);
    this.monster_skill = create2Array(arrayOfByte);
    this.maggie = create2Array(arrayOfByte);
    this.item_help = createStringArray(arrayOfByte);
    this.item_name = createStringArray(arrayOfByte);
    this.skillT = createStringArray(arrayOfByte);
    this.city_name = createStringArray(arrayOfByte);
    this.monSay = create2StringArray(arrayOfByte);
    this.mapdataMap = create2ShortArray(arrayOfByte);
    this.mapdataArea = create2Array(arrayOfByte);
    this.mapdataDoor = create3ShortArray(arrayOfByte);
    this.mapinfo = create2Array(arrayOfByte);
    this.mapinfos = create2StringArray(arrayOfByte);
    this.skill_help = createStringArray(arrayOfByte);
    this.magicOrder = create4Array(arrayOfByte);
    this.monster_appear = create3Array(arrayOfByte);
    this.monborn = create2Array(arrayOfByte);
    this.属性相克 = create2Array(arrayOfByte);
    this.canBuy = createArray(arrayOfByte);
    this.sellPrice = createShortArray(arrayOfByte);
    this.dataHP = create2Array(arrayOfByte);
    this.skillAI = create2Array(arrayOfByte);
    arrayOfByte = null;
  }
  
  void data_null() {
    this.A = (byte[][])null;
    this.skill_name = null;
    this.skill_up = (byte[][])null;
    this.monster_pro = (byte[][])null;
    this.NAME = null;
    this.skill = (byte[][])null;
    this.monster_skill = (byte[][])null;
    this.maggie = (byte[][])null;
    this.item_help = null;
    this.item_name = null;
    this.skillT = null;
    this.city_name = null;
    this.monSay = (String[][])null;
    this.mapdataMap = (short[][])null;
    this.mapdataArea = (byte[][])null;
    this.mapdataDoor = (short[][][])null;
    this.mapinfos = (String[][])null;
    this.skill_help = null;
    this.magicOrder = (byte[][][][])null;
    this.monster_appear = (byte[][][])null;
    this.monborn = (byte[][])null;
    this.属性相克 = (byte[][])null;
    this.canBuy = null;
    this.sellPrice = null;
    this.dataHP = (byte[][])null;
    this.skillAI = (byte[][])null;
  }
  
  void getMonster(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3) {
    int i = getRandom(100);
    byte b1 = 0;
    if (this.monster_appear[paramInt1].length > 4)
      if (findItem(29)) {
        if (getRandom(100) < 85) {
          b1 = 0;
        } else {
          b1 = 1;
        } 
      } else if (getRandom(100) < 90) {
        b1 = 0;
      } else {
        b1 = 1;
      }  
    byte b2 = 0;
    b2 = b1 * 3 + 1;
    if (b1 == 1)
      this.mapP.yudaoJingying = 1; 
    for (b1 = 0; i > this.monster_appear[paramInt1][b2][b1]; b1++);
    paramArrayOfByte[0] = this.monster_appear[paramInt1][b2 + 1][b1];
    paramArrayOfByte[1] = (byte)(this.monster_appear[paramInt1][b2 + 2][b1] + getRandom(3) - 1);
    if (paramArrayOfByte[1] > this.MON_MAX_LV)
      paramArrayOfByte[1] = this.MON_MAX_LV; 
  }
  
  void getSkill(int paramInt1, int paramInt2) {
    byte[] arrayOfByte = new byte[10];
    byte b1 = 0;
    for (int i = paramInt2 * 3; i < (paramInt2 + 1) * 3; i++) {
      boolean bool = false;
      int j;
      for (j = paramInt2 * 3; j < i; j++) {
        if (this.monster_skill[paramInt1][i] == this.monster_skill[paramInt1][j]) {
          bool = true;
          break;
        } 
      } 
      if (!bool)
        for (j = 0; j < this.skill.length; j++) {
          if (this.monster_skill[paramInt1][i] == this.skill[j][2] && paramInt2 + 1 == this.skill[j][4]) {
            arrayOfByte[b1] = (byte)j;
            b1++;
          } 
        }  
    } 
    this.getSkill = new byte[b1];
    System.arraycopy(arrayOfByte, 0, this.getSkill, 0, b1);
  }
  
  public void getMagic(Monster paramMonster, int paramInt) {
    byte[] arrayOfByte = { 0, 8, 19, 34, 50 };
    if (paramInt == 0) {
      for (byte b1 = 0; b1 < arrayOfByte.length && paramMonster.monster[11] >= arrayOfByte[b1]; b1++) {
        getSkill(paramMonster.monster[16], b1);
        paramMonster.monster[1 + b1 * 2] = this.getSkill[getRandom(this.getSkill.length)];
        paramMonster.monster[2 + b1 * 2] = this.skill[paramMonster.monster[1 + b1 * 2]][1];
        paramMonster.monster[0] = (byte)(paramMonster.monster[0] + 1);
      } 
    } else {
      byte b1;
      for (b1 = 0; b1 < 5; b1++) {
        if (paramMonster.monster[11] == arrayOfByte[b1]) {
          getSkill(paramMonster.monster[16], b1);
          this.view_state = 0;
          return;
        } 
      } 
      for (b1 = 0; b1 < this.jinhua.length; b1++) {
        if (paramMonster.monster[16] == this.jinhua[b1][0] && paramMonster.monster[11] == this.jinhua[b1][1]) {
          this.view_state = 2;
          Monster monster1 = new Monster(this, this.jinhua[b1][2], this.jinhua[b1][1]);
          System.arraycopy(monster1.monster, 16, paramMonster.monster, 16, 14);
          this.catchedMon[this.jinhua[b1][2]] = 1;
          break;
        } 
      } 
    } 
  }
  
  public byte[] createMonster(int paramInt) { return this.monster_pro[paramInt]; }
  
  public void getUiImage() {
    byte[] arrayOfByte = createData(3);
    this.skip = 0;
    byte[][] arrayOfByte1 = create2Array(arrayOfByte);
    arrayOfByte = null;
    Image image = this.maincanvas.createImage("/jiemian.png");
    this.uiImage = createImage(image, arrayOfByte1);
    image = null;
    arrayOfByte1 = (byte[][])null;
    System.gc();
  }
  
  public void queding() {
    this.g;
    this.g;
    this.g.drawImage(this.maincanvas.imgYesNo[0], 0, 191, 0x4 | 0x10);
  }
  
  public void quxiao() {
    this.g;
    this.g;
    this.g.drawImage(this.maincanvas.imgYesNo[1], 176, 191, 0x8 | 0x10);
  }
  
  public void drawUI(int paramInt1, Graphics paramGraphics, byte paramByte, int paramInt2, String[] paramArrayOfString) {
    this.dg = DirectUtils.getDirectGraphics(paramGraphics);
    if (this.uiData[paramInt1] == null)
      return; 
    byte b1 = -1;
    byte b2;
    for (b2 = 0; b2 < this.uiData[paramInt1].length; b2 = (byte)(b2 + 1)) {
      if (this.uiData[paramInt1][b2][0] >= 0 && this.uiData[paramInt1][b2][0] != 18) {
        if (this.uiData[paramInt1][b2][3] == 0) {
          paramGraphics.drawImage(this.uiImage[this.uiData[paramInt1][b2][0]], this.uiData[paramInt1][b2][1] + 100, this.uiData[paramInt1][b2][2] + 100, 20);
        } else {
          this.dg.drawImage2(this.uiImage[this.uiData[paramInt1][b2][0]], this.uiData[paramInt1][b2][1] + 100, this.uiData[paramInt1][b2][2] + 100, this.F_flag2[this.uiData[paramInt1][b2][3]], this.F_flag[this.uiData[paramInt1][b2][3]]);
        } 
      } else if (this.uiData[paramInt1][b2][0] == -1) {
        if (b1 == -1)
          b1 = b2; 
        byte b3 = b2 - b1;
        if (b2 - b1 == paramByte) {
          paramGraphics.drawImage(this.uiImage[paramInt2], this.uiData[paramInt1][b3][1] + 100, this.uiData[paramInt1][b3][2] + 100, 20);
          this.dg;
          this.dg.drawImage(this.uiImage[paramInt2], this.uiData[paramInt1][b3][1] + 100 + 28, this.uiData[paramInt1][b3][2] + 100, 20, 4);
        } 
        paramGraphics.setColor(this.uiColor[this.uiData[paramInt1][b2][5]]);
        paramGraphics.drawString(this.action_str[b3], this.uiData[paramInt1][b3][1] + 100 + 33, this.uiData[paramInt1][b3][2] + 100 + 2, this.uiData[paramInt1][b2][3]);
      } else if (this.uiData[paramInt1][b2][0] == -2) {
        if (this.imgMonster[false] != null) {
          paramGraphics.drawImage(this.imgMonster[0], this.uiData[paramInt1][b2][1] + 100, this.uiData[paramInt1][b2][2] + 100, this.uiData[paramInt1][b2][3]);
          if (this.monster_pro[(this.run_state == 21) ? this.select_stateT : this.monster.monster[16]][12] >= 50) {
            if (null == this.imageJingying)
              this.imageJingying = this.maincanvas.createImageArray(5, "shan"); 
            paramGraphics.drawImage(this.imageJingying[(this.battle_c > 10) ? 0 : (Math.abs(this.battle_c) % 10 / 2)], this.uiData[paramInt1][b2][1] + 100 - 20, this.uiData[paramInt1][b2][2] + 100 - 48 + 15, this.uiData[paramInt1][b2][3]);
            this.battle_c = (byte)(this.battle_c + 1);
            if (this.battle_c > 20)
              this.battle_c = 0; 
          } 
        } 
      } else if (this.uiData[paramInt1][b2][0] == -3) {
        b1 = (byte)(b1 + 1);
        paramGraphics.setColor(this.uiColor[this.uiData[paramInt1][b2][4]]);
        paramGraphics.drawString(paramArrayOfString[b1], this.uiData[paramInt1][b2][1] + 100, this.uiData[paramInt1][b2][2] + 100 + 4, this.uiData[paramInt1][b2][3]);
      } 
    } 
  }
  
  void jumpjump(int paramInt1, int paramInt2, int paramInt3) {
    paramInt1 %= 12;
    byte[][] arrayOfByte = { { 
          31, 31, 32, 32, 31, 31, 33, 33, 33, 33, 
          33, 33 }, { 
          0, 0, 0, 0, 0, 0, 8, 8, 18, 18, 
          8, 8 } };
    this.g;
    this.g;
    this.g.drawImage(this.uiImage[arrayOfByte[0][paramInt1]], paramInt2, paramInt3 - arrayOfByte[1][paramInt1], 0x20 | true);
  }
  
  void drawtujian() {
    blueBg();
    if (this.popMenustate == -1) {
      drawUI(11, this.g, (byte)2, 2, null);
      byte b1 = 40;
      byte b2 = 23;
      for (byte b3 = 0; b3 < 6; b3++) {
        byte b4 = this.select_stateX * 6 + b3;
        if (b4 >= 101)
          break; 
        if (b3 == this.select_stateY) {
          drawSelect(25, b1 + b2 * b3 - 4, 126, 22, true);
          this.g.setColor(this.buttonColor[4]);
        } else {
          this.g.setColor(this.buttonColor[5]);
        } 
        this.g.drawString("NO." + (b4 + 1), 36, b1 + b3 * b2, 20);
        if (this.catchedMon[b4] == 1) {
          this.g.drawString(this.NAME[b4], 85, b1 + b3 * b2, 20);
        } else {
          this.g.drawString("?????", 85, b1 + b3 * b2, 20);
        } 
      } 
      drawKuang(28, 185, 121, 17);
      drawJiantou(20, 9);
      this.g.setColor(9066984);
      this.g;
      this.g;
      this.g.drawString((this.select_stateX + 1) + "/" + this.maxpage, 88, 202, 0x20 | true);
      queding();
      quxiao();
    } else {
      drawUI(12, this.g, (byte)2, 2, null);
      byte b1 = 91;
      byte b2 = 48;
      byte b3 = 22;
      this.g.setColor(16777215);
      this.g;
      this.g;
      this.g.drawString(this.NAME[this.select_stateT], 42, 113, 0x20 | true);
      this.g.drawString("编号：" + (this.select_stateT + 1), b1, b2, 20);
      this.g.drawString("属性：" + this.skillT[this.monster_pro[this.select_stateT][3]], b1, b2 + b3, 20);
      this.g.drawString("发现地点：", b1, b2 + 2 * b3, 20);
      if (this.monborn[this.select_stateT][0] == -1) {
        this.g.drawString("进化获得", b1 + 8, b2 + 3 * b3, 20);
      } else if (this.monborn[this.select_stateT][0] == -2) {
        this.g.drawString("任务获得", b1 + 8, b2 + 3 * b3, 20);
      } else {
        for (byte b4 = 0; b4 < this.monborn[this.select_stateT].length; b4++)
          this.g.drawString(this.city_name[this.monborn[this.select_stateT][b4]], b1 + 8, b2 + (3 + b4) * b3, 20); 
      } 
      quxiao();
    } 
    this.g.setColor(16777215);
    this.g;
    this.g;
    this.g.drawString("怪物图鉴", 88, 10, 0x10 | true);
  }
  
  private void drawJiantou(int paramInt1, int paramInt2) {
    if (this.select_stateS != -1) {
      this.g;
      this.g;
      this.g.drawImage(this.uiImage[29], 88 - paramInt1, 208 - paramInt2, 0x20 | 0x8);
    } 
    if (this.select_stateS != 1) {
      this.g;
      this.g;
      this.dg;
      this.dg.drawImage(this.uiImage[29], 88 + paramInt1, 208 - paramInt2, 0x20 | 0x4, 4);
    } 
    if (this.select_stateS == -1) {
      this.g;
      this.g;
      this.g.drawImage(this.uiImage[30], 88 - paramInt1 - 2, 208 - paramInt2, 0x20 | 0x8);
    } else if (this.select_stateS == 1) {
      this.g;
      this.g;
      this.dg;
      this.dg.drawImage(this.uiImage[30], 88 + paramInt1 + 2, 208 - paramInt2, 0x20 | 0x4, 4);
    } 
    this.select_stateS = 0;
  }
  
  private void drawjiantou2(int paramInt1, int paramInt2, int paramInt3) {
    if (this.bankjiantou < 0) {
      this.g;
      this.g;
      this.dg;
      this.dg;
      this.dg.drawImage(this.uiImage[30], paramInt1, paramInt2 + paramInt3 + 1, 0x10 | true, true | 0x4);
    } else {
      this.g;
      this.g;
      this.dg;
      this.dg;
      this.dg.drawImage(this.uiImage[29], paramInt1, paramInt2 + paramInt3, 0x10 | true, true | 0x4);
    } 
    if (this.bankjiantou > 0) {
      this.g;
      this.g;
      this.dg;
      this.dg.drawImage(this.uiImage[30], paramInt1, paramInt2 - paramInt3 - 1, 0x20 | true, 3);
    } else {
      this.g;
      this.g;
      this.dg;
      this.dg.drawImage(this.uiImage[29], paramInt1, paramInt2 - paramInt3, 0x20 | true, 3);
    } 
    this.bankjiantou = 0;
  }
  
  void keytujian() {
    if (this.popMenustate == -1) {
      select_state(this.maxpage, 6, 17, 1, 0);
      if (this.select_stateX * 6 + this.select_stateY >= 101)
        this.select_stateY = 4; 
      if (this.key == -3) {
        this.select_stateS = -1;
      } else if (this.key == -4) {
        this.select_stateS = 1;
      } 
      if (pressQueDing()) {
        this.select_stateT = (byte)(this.select_stateX * 6 + this.select_stateY);
        this.imgMonster[0] = Image(this.select_stateT);
        if (this.catchedMon[this.select_stateT] == 1)
          this.popMenustate = 1; 
      } else if (this.key == -7) {
        this.imageTemp = null;
        goMY_BAG();
      } 
    } else if (this.key == -7) {
      this.popMenustate = -1;
    } 
  }
  
  void gotujian() {
    this.maxpage = 17;
    this.popMenustate = -1;
    this.run_state = 21;
    this.select_stateY = 0;
    this.select_stateX = 0;
    this.select_stateS = 0;
    this.select_stateT = 0;
  }
  
  void drawKuang(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.g.setColor(13683967);
    this.g.fillRect(paramInt1, paramInt2, paramInt3, paramInt4);
    this.g.setColor(12561151);
    this.g.drawRect(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  void drawMap() {
    this.showmapc = (byte)(this.showmapc + 1);
    if (this.showmapc > 80)
      this.showmapc = 0; 
    byte[] arrayOfByte1 = this.mapdataArea[this.showArea];
    blueBg();
    byte b1 = 23;
    byte[] arrayOfByte2 = { 0, 25, 10, 10, 0 };
    b1 += arrayOfByte2[this.showArea];
    this.g.translate(0, b1);
    this.g.setColor(16777215);
    int i;
    for (i = 0; i < arrayOfByte1.length; i++) {
      if (this.mapdataMap[arrayOfByte1[i]].length > 0) {
        this.g.setColor(10448383);
        this.g.fillRect(this.mapdataMap[arrayOfByte1[i]][0] - 1, this.mapdataMap[arrayOfByte1[i]][1] - 1, this.mapdataMap[arrayOfByte1[i]][2] - 1 + 3, this.mapdataMap[arrayOfByte1[i]][3] - 1 + 3);
        this.g.setColor(16777215);
        this.g.drawRect(this.mapdataMap[arrayOfByte1[i]][0], this.mapdataMap[arrayOfByte1[i]][1], this.mapdataMap[arrayOfByte1[i]][2] - 1, this.mapdataMap[arrayOfByte1[i]][3] - 1);
      } 
    } 
    this.g.setColor(10448383);
    for (i = 0; i < this.mapdataDoor[this.showArea].length; i++) {
      switch (this.mapdataDoor[this.showArea][i][0]) {
        case 0:
        case 1:
          this.g.setColor(10448383);
          this.g.fillRect(this.mapdataDoor[this.showArea][i][1] - 3, this.mapdataDoor[this.showArea][i][2] - 3, 6, 6);
          break;
      } 
    } 
    for (i = 0; i < this.mapdataDoor[this.showArea].length; i++) {
      switch (this.mapdataDoor[this.showArea][i][0]) {
        case 0:
          this.g.setColor(16777215);
          this.g.drawLine(this.mapdataDoor[this.showArea][i][1] - 3, this.mapdataDoor[this.showArea][i][2] - 1, this.mapdataDoor[this.showArea][i][1] - 3, this.mapdataDoor[this.showArea][i][2] + 1);
          this.g.drawLine(this.mapdataDoor[this.showArea][i][1] + 3, this.mapdataDoor[this.showArea][i][2] - 1, this.mapdataDoor[this.showArea][i][1] + 3, this.mapdataDoor[this.showArea][i][2] + 1);
          break;
        case 1:
          this.g.setColor(16777215);
          this.g.drawLine(this.mapdataDoor[this.showArea][i][1] - 1, this.mapdataDoor[this.showArea][i][2] - 3, this.mapdataDoor[this.showArea][i][1] + 1, this.mapdataDoor[this.showArea][i][2] - 3);
          this.g.drawLine(this.mapdataDoor[this.showArea][i][1] - 1, this.mapdataDoor[this.showArea][i][2] + 3, this.mapdataDoor[this.showArea][i][1] + 1, this.mapdataDoor[this.showArea][i][2] + 3);
          break;
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
          this.g;
          this.g;
          this.g.drawImage(this.imageTemp[this.mapdataDoor[this.showArea][i][0] - 2], this.mapdataDoor[this.showArea][i][1], this.mapdataDoor[this.showArea][i][2], 0x20 | true);
          break;
      } 
    } 
    this.g.translate(0, -b1);
    this.g.setColor(14868479);
    this.g.fillRect(0, 2, 176, 22);
    this.g.setColor(10448383);
    this.g.drawRect(-1, 2, 178, 22);
    this.g.setColor(9066984);
    this.x -= 4;
    i = this.x;
    for (byte b2 = 0; b2 < this.mapinfo[this.showArea].length; b2++) {
      this.g;
      this.g;
      this.g.drawImage(this.imageTemp[this.mapinfo[this.showArea][b2]], i, 14, 0x4 | 0x2);
      i += 22;
      this.g;
      this.g;
      this.g.drawString(this.mapinfos[this.showArea][b2], i, 22, 0x4 | 0x20);
      i += this.maincanvas.font.stringWidth(this.mapinfos[this.showArea][b2]) + 8;
    } 
    if (i < 0)
      this.x = 176; 
    if (this.showArea == this.select_stateT) {
      this.g.translate(0, b1);
      if (this.temp_stateS != -1 && this.showmapc % 8 < 4 && this.mapdataMap[this.temp_stateS].length > 0) {
        this.g;
        this.g;
        this.g.drawImage(this.imageTemp[5], this.mapdataMap[this.temp_stateS][0] - 6 + this.select_stateX, this.mapdataMap[this.temp_stateS][1] + 3 + this.select_stateY, 0x20 | 0x4);
      } 
      this.g.translate(0, -b1);
    } 
    drawKuang(28, 185, 121, 17);
    drawJiantou(30, 9);
    this.g.setColor(9066984);
    this.g;
    this.g;
    this.g.drawString(this.mapinfos[5][this.showArea], 88, 200, 0x20 | true);
    quxiao();
  }
  
  public void keyDrawmap(int paramInt) {
    if (paramInt == -7 || paramInt == 51) {
      this.showArea = -1;
      this.select_stateS = 0;
      this.select_stateX = 0;
      this.select_stateY = 0;
      this.select_stateT = 0;
      this.imageTemp = null;
    } else if (paramInt == -3) {
      this.x = 176;
      this.select_stateS = -1;
      this.showArea = (byte)(this.showArea - 1);
      if (this.showArea < 0)
        this.showArea = (byte)(this.mapdataArea.length - 1); 
    } else if (paramInt == -4) {
      this.x = 176;
      this.select_stateS = 1;
      this.showArea = (byte)(this.showArea + 1);
      if (this.showArea > this.mapdataArea.length - 1)
        this.showArea = 0; 
    } 
  }
  
  void getShowMap() {
    this.select_stateT = -1;
    this.showArea = -1;
    this.imageTemp = this.maincanvas.createImageArray(6, "map");
    byte b1;
    for (b1 = 0; b1 < this.mapdataArea.length; b1 = (byte)(b1 + true)) {
      for (byte b2 = 0; b2 < this.mapdataArea[b1].length; b2 = (byte)(b2 + true)) {
        if (this.mapP.mapNo == this.mapdataArea[b1][b2]) {
          this.showArea = b1;
          this.temp_stateS = this.mapP.mapNo;
          this.select_stateX = (byte)(this.mapP.my_x / 16 * this.mapdataMap[this.temp_stateS][2] / this.mapP.cols);
          this.select_stateY = (byte)(this.mapP.my_y / 16 * this.mapdataMap[this.temp_stateS][3] / this.mapP.rows);
          break;
        } 
      } 
    } 
    if (this.showArea == -1)
      for (b1 = 0; b1 < this.mapdataArea.length; b1 = (byte)(b1 + 1)) {
        for (byte b2 = 0; b2 < this.mapdataArea[b1].length; b2 = (byte)(b2 + true)) {
          if (this.mapP.my_lastMap == this.mapdataArea[b1][b2]) {
            this.showArea = b1;
            this.temp_stateS = this.mapP.my_lastMap;
            this.select_stateX = this.mapP.my_lastX;
            this.select_stateY = this.mapP.my_lastY;
            break;
          } 
        } 
      }  
    if (this.showArea == -1)
      this.showArea = 0; 
    this.select_stateT = this.showArea;
  }
  
  byte getmonNum() {
    byte b1 = 0;
    for (int i = this.catchedMon.length - 1; i >= 0; i--) {
      if (this.catchedMon[i] == 1)
        b1 = (byte)(b1 + true); 
    } 
    return b1;
  }
  
  static int getRandom(int paramInt) { return MainCanvas.getRandom(paramInt); }
  
  void drawBank() {
    blueBg();
    if (this.select_stateS == 0) {
      drawUI(14, this.g, (byte)0, 0, null);
      drawPopMenu(88, (208 - 26 * this.action_str.length - 4 >> 1) - 4, 16, 30);
      drawTitleOFView(this.textBank[0]);
    } else {
      drawUI(15, this.g, (byte)0, 0, null);
      byte b1 = 30;
      int i = 155;
      byte b2 = 68;
      byte b3 = 106;
      char c = '';
      this.g.setColor(16777215);
      this.g;
      this.g;
      this.g.drawString(this.textBank[1], b1, b2, 0x4 | 0x20);
      this.g;
      this.g;
      this.g.drawString(this.textBank[2], b1, c, 0x4 | 0x20);
      if (this.popMenustate == 0) {
        this.g;
        this.g;
        this.g.drawString(this.textBank[3], b1, b3, 0x4 | 0x20);
      } else {
        this.g;
        this.g;
        this.g.drawString(this.textBank[4], b1, b3, 0x4 | 0x20);
      } 
      this.g.setColor(16777215);
      this.g;
      this.g;
      this.g.drawString(Integer.toString(this.bankMoney), i, b2, 0x8 | 0x20);
      this.g;
      this.g;
      this.g.drawString(Integer.toString(this.money), i, c, 0x8 | 0x20);
      i -= '\n';
      this.g.fillRoundRect('' - this.select_stateX * 10 - '\002', b3 - 16, 11, 16, 6, 6);
      this.g.fillRoundRect(i - (this.tempMoney.length - 1) * 10 - 3, b3 - 16, this.tempMoney.length * 10 + 4, 16, 6, 6);
      for (byte b4 = 0; b4 < this.tempMoney.length; b4++) {
        if (b4 == this.select_stateX) {
          this.g.setColor(16711680);
        } else {
          this.g.setColor(0);
        } 
        this.g;
        this.g;
        this.g.drawString(Integer.toString(this.tempMoney[b4]), i - b4 * 10, b3, 0x4 | 0x20);
        if (b4 == this.select_stateX)
          drawjiantou2(i - b4 * 10 + 3, b3 - 8, 8); 
      } 
      if (this.popMenustate == 0) {
        drawTitleOFView(this.textBank[5]);
      } else {
        drawTitleOFView(this.textBank[6]);
      } 
    } 
    this.g.setColor(16777215);
    this.g;
    this.g;
    this.g.drawString(this.textBank[7], 88, 8, 0x10 | true);
    queding();
    quxiao();
  }
  
  void initBankMoney() {
    for (byte b1 = 0; b1 < this.tempMoney.length; b1++)
      this.tempMoney[b1] = 0; 
  }
  
  void bankTime() { this.bankTime = (byte)(this.bankTime + 1); }
  
  void keyBank() {
    if (this.select_stateS == 0) {
      if (pressQueDing()) {
        this.select_stateS = 1;
        this.select_stateX = 2;
        int i = bankMoney(this.bankTime);
        if (i > 0) {
          this.money += i;
          say(this.textBank[8] + i, 0);
          this.bankTime = 0;
        } 
        this.bankTime = 0;
        initBankMoney();
      } else if (this.key == -7) {
        this.imageTemp = null;
        this.popMenustate = -1;
        goRUN_IN_MAP(this.maincanvas.musicId);
      } else if (this.key == -1 || this.key == -2) {
        this.popMenustate = (byte)(this.popMenustate ^ true);
      } 
    } else if (this.select_stateS == 1) {
      if (pressQueDing()) {
        int i = 0;
        for (byte b1 = 0; b1 < this.tempMoney.length; b1++)
          i += sum2(10, b1) * this.tempMoney[b1]; 
        if (this.popMenustate == 0) {
          if (i > this.money) {
            say(this.textBank[9], 1);
          } else {
            this.money -= i;
            this.bankMoney += i;
            initBankMoney();
          } 
          if (this.bankMoney >= 20000 && this.bankItem == 0) {
            this.bankItem = 1;
            getItem(37, 1);
            say(this.textBank[13], 0);
            sleep(1000);
          } 
        } else if (i > this.bankMoney) {
          say(this.textBank[10], 1);
        } else {
          this.money += i;
          this.bankMoney -= i;
          initBankMoney();
        } 
      } else if (this.key == -7) {
        this.select_stateS = 0;
      } else if (this.key == -1) {
        this.bankjiantou = 1;
        this.tempMoney[this.select_stateX] = (byte)(this.tempMoney[this.select_stateX] + 1);
        if (this.tempMoney[this.select_stateX] > 9)
          this.tempMoney[this.select_stateX] = 0; 
      } else if (this.key == -2) {
        this.bankjiantou = -1;
        this.tempMoney[this.select_stateX] = (byte)(this.tempMoney[this.select_stateX] - 1);
        if (this.tempMoney[this.select_stateX] < 0)
          this.tempMoney[this.select_stateX] = 9; 
      } else if (this.key == -3) {
        if (this.select_stateX < this.tempMoney.length - 1)
          this.select_stateX = (byte)(this.select_stateX + 1); 
      } else if (this.key == -4 && this.select_stateX > 2) {
        this.select_stateX = (byte)(this.select_stateX - 1);
      } 
    } 
  }
  
  void goBank() {
    this.run_state = 22;
    this.popMenustate = 0;
    this.select_stateS = 0;
    initBankMoney();
    this.textBank = loadText("bank");
    this.action_str = new String[] { this.textBank[11], this.textBank[12] };
  }
  
  private void bankBank() {
    if (this.bankTime >= 10 && this.bankMoney > 0) {
      this.bankTime = 0;
      say(this.text[146] + bankMoney(10), 0);
      sleep(500);
    } 
  }
  
  private int bankMoney(int paramInt) { return this.bankMoney * paramInt / 200; }
  
  public static int sum2(int paramInt1, int paramInt2) {
    int i = 1;
    for (byte b1 = 1; b1 <= paramInt2; b1++)
      i *= paramInt1; 
    return i;
  }
  
  private void drawGuessNum(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    drawSelect(paramInt1, paramInt2, paramInt3, paramInt4, true);
    int i = paramInt1 + paramInt3 / 2 - 5;
    this.g.setClip(i, 0, 10, 208);
    this.g;
    this.g;
    this.g.drawImage(this.imageNum, i - paramInt5 * 10, paramInt2 + paramInt4 / 2 + 8, 0x4 | 0x20);
    this.g.setClip(0, 0, 176, 208);
  }
  
  private void alert(String paramString) {
    this.g.translate(0, -17);
    showString(paramString, 8, 170);
    this.g.translate(0, 17);
  }
  
  private void drawGuess() {
    this.maincanvas.battle_c = (short)(this.maincanvas.battle_c + 1);
    if (this.maincanvas.battle_c > 10000)
      this.maincanvas.battle_c = 0; 
    byte b1 = 55;
    byte b2 = 88 - b1;
    byte b3 = 88 + b1;
    byte b4 = 96;
    byte b5 = 15;
    byte b6 = 15;
    byte b7 = 86;
    blueBg();
    drawUI(16, this.g, (byte)0, 0, null);
    if (this.mini_state != 7) {
      drawGuessNum(b2 - b5, b4 - b5, b5 * 2, b6 * 2, this.guess[0]);
      drawGuessNum(b3 - b5, b4 - b5, b5 * 2, b6 * 2, this.guess[1]);
      if (this.popMenustate != -1)
        for (byte b9 = 0; b9 < 2; b9++) {
          byte b10 = 0;
          if (this.mini_state == 1) {
            b10 = (this.popMenustate == b9 && this.maincanvas.battle_c % 6 < 3) ? b9 : (b9 + 2);
          } else if (this.mini_state == 0) {
            b10 = b9 + 2;
          } else {
            b10 = (this.popMenustate == b9) ? b9 : (b9 + 2);
          } 
          this.g;
          this.g;
          this.g.drawImage(this.imageTemp[b10], 88, b7 + b9 * 25, 0x2 | true);
        }  
    } 
    this.g.setColor(16777215);
    this.g;
    this.g;
    this.g.drawString(this.textBank[14], 88, 4, 0x10 | true);
    byte b8 = 52;
    this.g.setColor(16777215);
    this.g;
    this.g;
    this.g.drawString(this.textBank[15], 98, b8, 0x4 | 0x20);
    this.g;
    this.g;
    this.g.drawString(this.textBank[16], 14, b8, 0x4 | 0x20);
    this.g.setColor(16776960);
    this.g;
    this.g;
    drawString(6371758, 16776091, this.money + "", 60, b8, true | 0x20);
    this.g;
    this.g;
    drawString(6371758, 16776091, this.guess[3] + "", 142, b8, 0x8 | 0x20);
    if (this.mini_state == 0) {
      if (this.battle_c > 10) {
        this.guess[1] = (byte)(getRandom(9) + 1);
        if ((this.guess[0] == 1 || this.guess[0] == 9) && getRandom(100) < 50)
          this.guess[0] = (byte)(getRandom(7) + 2); 
      } else {
        drawGuessNum(b3 - b5, b4 - b5, b5 * 2, b6 * 2, 10);
      } 
      drawGuessNum(b2 - b5, b4 - b5, b5 * 2, b6 * 2, 10);
      if (this.battle_c >= 14) {
        this.mini_state = 1;
        this.battle_c = 0;
        this.popMenustate = 0;
      } 
      alert(this.textBank[17]);
    } else if (this.mini_state == 1) {
      drawGuessNum(b2 - b5, b4 - b5, b5 * 2, b6 * 2, 10);
      alert(this.textBank[18]);
      queding();
    } else if (this.mini_state == 2) {
      this.guess[0] = (byte)(getRandom(9) + 1);
      if (this.battle_c >= 6) {
        if (getRandom(100) < 10)
          if (this.popMenustate == 0) {
            this.guess[0] = (byte)(getRandom(this.guess[1]) + 1);
          } else if (this.guess[1] != 9) {
            this.guess[0] = (byte)(this.guess[1] + getRandom(9 - this.guess[1]) + 1);
          }  
        this.mini_state = 3;
        this.battle_c = 0;
      } 
      queding();
    } else if (this.mini_state == 3) {
      byte b9 = this.guess[0] - this.guess[1];
      if (b9 > 0) {
        this.guess[2] = 0;
      } else if (b9 < 0) {
        this.guess[2] = 1;
      } else {
        this.guess[2] = 2;
      } 
      if (this.guess[2] == 2 || this.guess[2] == this.popMenustate) {
        alert(this.textBank[19]);
      } else {
        alert(this.textBank[20] + this.text[98] + '2' + "。");
        this.money += 50;
      } 
      if (this.guess[2] == 2 || this.guess[2] == this.popMenustate) {
        this.guess[3] = (byte)(this.guess[3] + 1);
        if (this.guess[3] >= 12) {
          this.mini_state = 7;
          this.action_str = null;
          this.popMenustate = -1;
          this.imageTemp = null;
          this.imageTemp = new Image[1];
          this.imageTemp[0] = this.maincanvas.createImage("/guochang/8.png");
        } else {
          this.mini_state = 4;
        } 
      } else if (this.money >= 200) {
        this.mini_state = 5;
      } else {
        this.mini_state = 6;
      } 
      this.battle_c = 0;
      sleep(2000);
    } else if (this.mini_state == 4) {
      if (this.guess[3] == 1) {
        alert(this.textBank[22]);
      } else {
        alert(this.textBank[26] + "“" + getItemName(this.guessJiang[this.guess[3]]) + "”" + this.textBank[27]);
      } 
      queding();
      quxiao();
    } else if (this.mini_state == 5) {
      alert(this.textBank[28]);
      queding();
      quxiao();
    } else if (this.mini_state == 6) {
      alert(this.textBank[29]);
      queding();
    } else if (this.mini_state == 7) {
      this.g;
      this.g;
      this.g.drawImage(this.imageTemp[0], 88, 104, true | 0x2);
      alert(this.textBank[30]);
      queding();
    } 
    this.battle_c = (byte)(this.battle_c + 1);
  }
  
  private void keyGuess() {
    keyRelease();
    if (this.mini_state == 1) {
      if (this.key == -2 && this.popMenustate < this.action_str.length - 1) {
        this.popMenustate = (byte)(this.popMenustate + 1);
      } else if (this.key == -1 && this.popMenustate > 0) {
        this.popMenustate = (byte)(this.popMenustate - 1);
      } else if (pressQueDing()) {
        this.battle_c = 0;
        this.mini_state = 2;
      } 
    } else if (this.mini_state == 2) {
      if (pressQueDing())
        this.battle_c = 0; 
    } else if (this.mini_state == 4) {
      this.battle_c = 0;
      if (pressQueDing()) {
        guessBegin();
      } else if (this.key == -7) {
        if (this.guess[3] >= 2)
          getItem(this.guessJiang[this.guess[3]], 1); 
        guessQuit();
      } 
    } else if (this.mini_state == 5) {
      this.battle_c = 0;
      if (pressQueDing()) {
        goGuess();
      } else if (this.key == -7) {
        guessQuit();
      } 
    } else if (this.mini_state == 6 && pressQueDing()) {
      guessQuit();
    } else if (this.mini_state == 7 && pressQueDing()) {
      getMonster(86, 1);
      guessQuit();
    } 
  }
  
  public void goGuess() {
    this.guess = new byte[5];
    this.guess[3] = 0;
    this.run_state = 23;
    this.textBank = loadText("bank");
    this.imageNum = this.maincanvas.createImage("/num.png");
    this.imageTemp = this.maincanvas.createImageArray(4, "bank");
    guessBegin();
    if (this.money < 200) {
      this.mini_state = 6;
      this.action_str = new String[] { this.textBank[25] };
    } else {
      this.money -= 200;
    } 
  }
  
  private void guessQuit() {
    this.popMenustate = -1;
    this.guess = null;
    goRUN_IN_MAP(this.maincanvas.musicId);
    this.mapP.map_paint(this.g);
    this.imageNum = null;
    this.run_state = 100;
  }
  
  public void guessBegin() {
    this.mini_state = 0;
    this.popMenustate = 0;
    this.battle_c = 0;
  }
  
  public boolean pressQueDing() { return (this.key == -6 || this.key == 53 || this.key == -5); }
  
  private void cheatKey() {
    if (this.cheat == 1) {
      switch (this.key) {
        case 48:
          this.immueEnemy = (byte)(this.immueEnemy ^ true);
          if (this.immueEnemy == 0) {
            say("遇敌模式", 0);
          } else {
            say("不遇敌模式", 0);
          } 
          this.cheat = 0;
          break;
        case 49:
          this.cheat = 2;
          break;
        case -1:
          this.cheat = 7;
          this.mapid = 1;
          this.levelid = 1;
          break;
        case 51:
          this.mapP.goGameWin();
          this.cheat = 0;
          break;
        case -3:
          this.cheat = 5;
          this.mapid = 0;
          this.levelid = 1;
          break;
        case 55:
          this.mapid = 1;
          this.levelid = 1;
          this.cheat = 4;
          break;
        case 57:
          getItem(24, 1);
          getItem(25, 1);
          getItem(26, 1);
          getItem(22, 1);
          getItem(23, 1);
          getItem(15, 1);
          getItem(30, 1);
          getItem(3, 1);
          getItem(31, 50);
          getItem(32, 50);
          getMonster(10, 61);
          this.cheat = 0;
          break;
        case -4:
          arangeMonster();
          battle_over();
          goGO_RUNINMAP();
          this.mapP.my_state = 0;
          this.cheat = 0;
          break;
        case -2:
          this.cheat = 0;
          break;
        case 35:
          this.cheat = 3;
          this.mapid = 1;
          this.levelid = 1;
          break;
        case 53:
          this.mapid = this.mapP.mapNo;
          this.levelid = 0;
          this.cheat = 6;
          break;
      } 
    } else if (this.cheat == 2) {
      this.mapid = cheatChange(this.mapid, 0, this.city_name.length - 1);
      if (pressQueDing()) {
        this.mapP.gotoMap(this.mapid, this.levelid);
        this.cheat = 0;
      } 
    } else if (this.cheat == 3) {
      this.mapid = cheatChange(this.mapid, 0, this.NAME.length - 1);
      this.levelid = cheatChange2(this.levelid, 1, 65);
      if (pressQueDing()) {
        getMonster(this.mapid, this.levelid);
        this.mapP.my_state = 0;
        this.cheat = 0;
      } 
    } else if (this.cheat == 4) {
      this.mapid = cheatChange(this.mapid, 0, this.NAME.length - 1);
      this.levelid = cheatChange2(this.levelid, 1, 60);
      if (pressQueDing()) {
        this.enemyList = new byte[1][2];
        this.enemyList[0][0] = this.mapid;
        this.enemyList[0][1] = this.levelid;
        goGO_BATTLE();
        fieldBattle();
        this.cheat = 0;
      } 
    } else if (this.cheat == 5) {
      this.mapid = cheatChange(this.mapid, -1, this.item_name.length - 1);
      this.levelid = cheatChange2(this.levelid, 1, 60);
      if (pressQueDing()) {
        if (this.mapid == -1)
          this.mapid = 42; 
        getItem(this.mapid, this.levelid);
        this.cheat = 0;
      } 
    } else if (this.cheat == 6) {
      this.mapid = cheatChange(this.mapid, 0, this.NAME.length - 1);
      this.levelid = cheatChange2(this.levelid, 0, 7);
      if (pressQueDing()) {
        this.mapP.mapInfo[this.mapid * 2 + 1] = (byte)(this.mapP.mapInfo[this.mapid * 2 + 1] | 1 << this.levelid);
        if (this.mapP.event_now_list[this.mapid] != null && this.mapP.event_now_list[this.mapid].length > this.levelid)
          this.mapP.event_now_list[this.mapid][this.levelid] = 24224; 
      } 
    } else if (this.cheat == 7) {
      this.mapid = cheatChange(this.mapid, 0, this.mapP.door.length - 1);
      this.mapP.door[this.mapid][2] = cheatChange2(this.mapP.door[this.mapid][2], 0, 4);
      if (pressQueDing())
        this.cheat = 0; 
    } 
    keyRelease();
  }
  
  private byte cheatChange(int paramInt1, int paramInt2, int paramInt3) {
    if (this.key == -3) {
      if (--paramInt1 < paramInt2)
        paramInt1 = paramInt3; 
    } else if (this.key == -4 && ++paramInt1 > paramInt3) {
      paramInt1 = paramInt2;
    } 
    return (byte)paramInt1;
  }
  
  private byte cheatChange2(int paramInt1, int paramInt2, int paramInt3) {
    if (this.key == 55) {
      if (--paramInt1 < paramInt2)
        paramInt1 = paramInt3; 
    } else if (this.key == 57 && ++paramInt1 > paramInt3) {
      paramInt1 = paramInt2;
    } 
    return (byte)paramInt1;
  }
  
  private void cheatPaint() {
    this.g.setColor(16711680);
    if (this.cheat == 1) {
      for (byte b1 = 0; b1 < this.cheatShow.length; b1++)
        drawBeautiString(this.cheatShow[b1], 10, 18 + b1 * 18, 20); 
      System.gc();
      drawBeautiString("run_state" + this.run_state + "M: " + ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024L) + " / " + (Runtime.getRuntime().totalMemory() / 1024L) + "k", 1, 1, 20);
    } else if (this.cheat == 2) {
      String str = "目标地图<" + this.mapid + ">" + this.city_name[this.mapid];
      this.g;
      this.g;
      drawBeautiString(str, 88, 16, 0x10 | true);
    } else if (this.cheat == 3) {
      String str = "生成<" + this.mapid + ">" + this.NAME[this.mapid] + "<" + this.levelid + "级>";
      this.g;
      this.g;
      drawBeautiString(str, 88, 16, 0x10 | true);
      this.g;
      this.g;
      drawBeautiString("46选怪79改级", 88, 32, 0x10 | true);
    } else if (this.cheat == 4) {
      String str = "战斗怪物<" + this.mapid + ">" + this.NAME[this.mapid] + "<" + this.levelid + "级>";
      this.g;
      this.g;
      drawBeautiString(str, 88, 16, 0x10 | true);
    } else if (this.cheat == 5) {
      String str;
      if (this.mapid == -1) {
        str = "moeny  " + this.levelid + "00";
      } else {
        str = "道具<" + this.mapid + ">" + this.item_name[this.mapid] + "<" + this.levelid + "个>";
      } 
      this.g;
      this.g;
      drawBeautiString(str, 88, 16, 0x10 | true);
    } else if (this.cheat == 6) {
      String str = "地图<" + this.mapid + ">" + this.city_name[this.mapid];
      this.g;
      this.g;
      drawBeautiString(str, 88, 16, 0x10 | true);
      for (byte b1 = 0; b1 < 8; b1++) {
        byte b2 = ((this.mapP.mapInfo[this.mapid * 2 + 1] & true << b1) == 0) ? 0 : 1;
        short s = 0;
        if (this.mapP.event_now_list[this.mapid] != null && this.mapP.event_now_list[this.mapid].length > b1)
          s = this.mapP.event_now_list[this.mapid][b1]; 
        if (this.levelid == b1) {
          drawBeautiString(b1 + ":" + b2 + "  " + s, 20, 30 + b1 * 16, 20);
        } else {
          drawBeautiString(b1 + ":" + b2 + "  " + s, 10, 30 + b1 * 16, 20);
        } 
      } 
    } else if (this.cheat == 7) {
      String str = "door id<" + this.mapid + ">方向无上下左右<" + this.mapP.door[this.mapid][2] + ">";
      this.g;
      this.g;
      drawBeautiString(str, 88, 16, 0x10 | true);
    } 
  }
  
  private void drawBeautiString(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    this.g.setColor(6819840);
    this.g.drawString(paramString, paramInt1 - 1, paramInt2 - 1, paramInt3);
    this.g.drawString(paramString, paramInt1 - 1, paramInt2 + 1, paramInt3);
    this.g.drawString(paramString, paramInt1 + 1, paramInt2 - 1, paramInt3);
    this.g.drawString(paramString, paramInt1 + 1, paramInt2 + 1, paramInt3);
    this.g.drawString(paramString, paramInt1 - 1, paramInt2, paramInt3);
    this.g.drawString(paramString, paramInt1, paramInt2 + 1, paramInt3);
    this.g.drawString(paramString, paramInt1 + 1, paramInt2, paramInt3);
    this.g.drawString(paramString, paramInt1, paramInt2 - 1, paramInt3);
    this.g.setColor(14352223);
    this.g.drawString(paramString, paramInt1, paramInt2, paramInt3);
  }
  
  Image createMonImage(int paramInt) {
    byte[][] arrayOfByte = (byte[][])null;
    byte b1 = 0;
    if (paramInt <= 15) {
      b1 = 0;
    } else if (paramInt <= 31) {
      b1 = 1;
    } else if (paramInt <= 48) {
      b1 = 2;
    } else if (paramInt <= 64) {
      b1 = 3;
    } else if (paramInt <= 80) {
      b1 = 4;
    } else if (paramInt <= 90) {
      b1 = 5;
    } else if (paramInt <= 100) {
      b1 = 6;
    } 
    Image image = this.maincanvas.createImage("/mon/" + b1 + ".png");
    return GameRun_Father.createImage(image, arrayOfByte[paramInt][0] + 100, arrayOfByte[paramInt][1] + 100, arrayOfByte[paramInt][2] + 100, arrayOfByte[paramInt][3] + 100, 0);
  }
  
  private void paintSmsSelect() {
    drawUI(2, this.g, this.popMenustate, 20, null);
    this.g.setColor(this.COLOR_CHAR);
    this.g;
    this.g;
    this.g.drawString("短信购买", 88, 12, true | 0x10);
    for (byte b1 = 0; b1 < 3; b1++) {
      drawButton(88, 60 + b1 * 23, (b1 == this.select_stateY), 70);
      if (b1 == this.select_stateY) {
        this.g.setColor(this.buttonColor[0]);
      } else {
        this.g.setColor(this.buttonColor[1]);
      } 
      this.g;
      this.g;
      this.g.drawString(this.smsTitle[b1], 88, 63 + b1 * 23, true | 0x10);
    } 
    gogoWord("进入查看详情");
    queding();
    quxiao();
  }
  
  private void paintSms() {
    blueBg();
    this.g.setClip(0, 0, 176, 41);
    drawUI(2, this.g, this.popMenustate, 20, null);
    this.g.setClip(0, 0, 176, 208);
    this.g.setColor(this.COLOR_CHAR);
    if (this.buyState == -1) {
      paintSmsSelect();
      return;
    } 
    this.g;
    this.g;
    this.g.drawString(this.smsTitle[this.buyState], 88, 12, true | 0x10);
    byte b1 = 40;
    drawRichText2(0, b1, 176, this.maincanvas.dialog.length * 18 + 8, 15452159, 10448383, 3473558);
    for (byte b2 = 0; b2 < this.maincanvas.dialog.length; b2++) {
      this.g;
      this.g;
      this.g.drawString(this.maincanvas.dialog[b2].toString(), 88, b1 + 18 * b2 + 4, true | 0x10);
    } 
    switch (this.sendSms) {
      case 0:
        queding();
        quxiao();
        break;
      case 1:
        alert("短信发送中....");
        break;
      case 2:
        alert("购买失败！");
        queding();
        quxiao();
        break;
      case 3:
        alert("购买成功！");
        sleep(1000);
        this.sendSms = 4;
        break;
      case 4:
        alert("储存完毕！");
        quxiao();
        break;
    } 
  }
  
  private void business() {
    if (this.buyState == 0) {
      this.money += 5000;
      getItem(1, 5);
      getItem(38, 1);
      getItem(39, 1);
    } else if (this.buyState == 1) {
      this.multiExp = (byte)(this.multiExp + 1);
    } else if (this.buyState == 2) {
      addItem(1, 10);
      addItem(2, 5);
      addItem(3, 5);
      addItem(8, 5);
    } else if (this.buyState == 4) {
      this.mapP.npc[4][4] = 3;
      this.money += 1000;
    } else if (this.buyState == 3) {
      this.MAX_MONSTERS = (byte)(this.MAX_MONSTERS + 5);
      Monster[] arrayOfMonster = new Monster[this.MAX_MONSTERS];
      for (byte b1 = 0; b1 < this.MAX_MONSTERS - 5; b1++)
        arrayOfMonster[b1] = this.monsters[b1]; 
      this.monsters = arrayOfMonster;
      addItem(3, 5);
    } else if (this.buyState == 5) {
      healMonster();
      this.money += 2000;
    } 
    this.say_c = 0;
  }
  
  private void runSms() {
    if (this.buyState != -1 && this.sendSms == 1) {
      this.sendSms = SMSSender.getInstance().send(getRandom(6)) ? 3 : 2;
      if (this.sendSms == 3) {
        business();
        reFreshSms();
        saveGame();
      } 
    } 
  }
  
  private void keySms() {
    keyRelease();
    if (this.buyState == -1) {
      if (this.key == -1) {
        this.select_stateY = (byte)Math.max(this.select_stateY = (byte)(this.select_stateY - 1), 0);
      } else if (this.key == -2) {
        this.select_stateY = (byte)Math.min(this.select_stateY = (byte)(this.select_stateY + 1), 2);
      } else if (this.key == -6) {
        goSms(this.select_stateY);
      } else if (this.key == -7) {
        goRUN_IN_MAP(this.maincanvas.musicId);
        this.action_str = null;
      } 
    } else if (this.key == -6 && (this.sendSms == 0 || this.sendSms == 2)) {
      switch (this.buyState) {
        case 0:
        case 2:
        case 4:
        case 5:
          this.sendSms = 1;
          break;
        case 1:
          if (this.multiExp >= 4) {
            say("已经达到上限！", 0);
            break;
          } 
          this.sendSms = 1;
          break;
        case 3:
          if (this.MAX_MONSTERS >= 60) {
            say("已经达到上限！", 0);
            break;
          } 
          this.sendSms = 1;
          break;
      } 
    } else if (this.sendSms == 4 && this.key == -7) {
      this.sendSms = 0;
      switch (this.buyState) {
        case 0:
        case 1:
        case 2:
          this.buyState = -1;
          break;
        case 3:
          goVIEW_COMPUTER();
          break;
        case 4:
        case 5:
          goRUN_IN_MAP(this.maincanvas.musicId);
          this.mapP.my_state = 0;
          break;
      } 
    } else if (this.key == -7) {
      this.sendSms = 0;
      switch (this.buyState) {
        case 0:
        case 1:
        case 2:
          this.buyState = -1;
          break;
        case 3:
          goVIEW_COMPUTER();
          break;
        case 4:
          goRUN_IN_MAP(this.maincanvas.musicId);
          break;
        case 5:
          goMAIN_MENU();
          break;
      } 
    } 
  }
  
  void reFreshSms() {
    String[] arrayOfString = { "您只需发送短信（0元/条，不含通讯费）就能立刻获得5000金，还能获得价值1000金的超值道具噢！立刻购买吧！zhangxuhui提醒：该游戏已破解，可以放心购买，不会发送收费短信，祝您玩得愉快！", "您只需发送短信（0元/条，不含通讯费）就能立刻让你战斗获得的经验增加一倍（最高4倍），练级时间大大缩短，永久有效！zhangxuhui提醒：该游戏已破解，可以放心购买，不会发送收费短信，祝您玩得愉快！您当前是" + this.multiExp + "倍经验。", "您只需发送短信（0元/条，不含通讯费）就能获得价值5000金的道具大礼包（包括精灵之实，精灵祝福，紫晶石，玛娜果），让您立刻摆脱野外无药可用的尴尬处境。zhangxuhui提醒：该游戏已破解，可以放心购买，不会发送收费短信，祝您玩得愉快！", "您只需发送短信（0元/条，不含通讯费）就能使电脑中的宠物存放位置增加5个（上限为60），另外还赠送价值1500金的宠物最爱的紫晶石！当前的宠物存放位置为zhangxuhui提醒：该游戏已破解，可以放心购买，不会发送收费短信，祝您玩得愉快！" + this.MAX_MONSTERS + "个。", "您已经通过了主线剧情的4%，您只需发送短信（0元/条，不含通讯费）就能一次性的将之后的地图以及迷宫完全打开，充分享受宠物王国2的乐趣。此外，还能免费获得1000金游戏币，要继续游戏么？zhangxuhui提醒：该游戏已破解，可以放心购买，不会发送收费短信，祝您玩得愉快！", "您只需要发送短信（0元/条，不含通讯费）就能原地复活，并且恢复您的所有怪物，另外还赠送2000金。接受复活吗？zhangxuhui提醒：该游戏已破解，可以放心购买，不会发送收费短信，祝您玩得愉快！" };
    this.smsStr = arrayOfString;
    if (this.buyState >= 0)
      this.maincanvas.getDialogs(new String[] { this.smsStr[this.buyState] }, 144); 
  }
  
  public void goSms(int paramInt) {
    this.run_state = 88;
    this.sendSms = 0;
    this.buyState = (byte)paramInt;
    reFreshSms();
  }
  
  void setPrice() {
    short[] arrayOfShort = { 
        60, 120, 200, 130, 100, 200, 600, 2000, 150, 400, 
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
        0, 0, 0, 0, 0, 0, 0, 150, 300, 0, 
        0, 0, 88, 800, 800, 1600, 1600, 1600, 800, 500, 
        500, 5000 };
    this.price = new short[arrayOfShort.length];
    for (byte b1 = 0; b1 < arrayOfShort.length; b1++) {
      this.price[b1] = arrayOfShort[b1];
      if (b1 != 41)
        for (byte b2 = 0; b2 < this.dazhe; b2++)
          this.price[b1] = (short)(this.price[b1] * this.dazheNum / 100);  
    } 
  }
  
  public void keyGameOver1(int paramInt) {
    if (pressQueDing()) {
      deleteItems(39, 1);
      healMonster();
      goRUN_IN_MAP(this.maincanvas.musicId);
      this.action_str = null;
      this.mapP.my_state = 0;
    } else if (paramInt == -7) {
      goMAIN_MENU();
    } 
  }
  
  public void sayNoMoney() {
    if (this.money < 500 && this.mapP.mapNo == 33)
      say(this.noMoney, 0); 
  }
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/GameRun.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */