public class Monster {
  byte[] monster;
  
  int exp;
  
  short max_hp;
  
  short hp;
  
  short dex;
  
  byte[][] effect;
  
  public Monster(GameRun paramGameRun, int paramInt1, int paramInt2) {
    this.monster = new byte[31];
    this.monster[16] = (byte)paramInt1;
    this.monster[11] = (byte)paramInt2;
    System.arraycopy(paramGameRun.createMonster(paramInt1), 0, this.monster, 18, 12);
    this.max_hp = (short)this.monster[18];
    this.hp = (short)this.monster[17];
    this.dex = (short)this.monster[19];
    int i = 0;
    short s = 0;
    if (this.monster[11] <= 20) {
      i = 2;
      s = 0;
    } else if (this.monster[11] > 20 && this.monster[11] <= 40) {
      i = 3;
      s = -20;
    } else {
      i = 4;
      s = -60;
    } 
    this.max_hp = (short)(this.max_hp - 120 + paramInt2 * i + s + MainCanvas.getRandom(8));
    this.dex = (short)(this.dex + (paramInt2 >> 1) - 2 + MainCanvas.getRandom(4));
    this.hp = this.max_hp;
    this.monster[13] = -1;
    this.monster[14] = -100;
    this.monster[30] = 100;
    this.exp = 0;
    paramGameRun.getMagic(this, 0);
    this.effect = new byte[6][3];
  }
  
  public void catchMonFealty() { this.monster[30] = (byte)(60 + MainCanvas.getRandom(10)); }
  
  public void getMonFealty() { this.monster[30] = 100; }
  
  public void fealtyReduce() { this.monster[30] = (byte)Math.max(1, this.monster[30] - 2); }
  
  public void fealtydead() { this.monster[30] = (byte)Math.max(1, this.monster[30] - 20); }
  
  public void addMaxHP(int paramInt) { this.max_hp = (short)(this.max_hp + paramInt); }
  
  public void addDex(int paramInt) { this.dex = (short)(this.dex + paramInt); }
  
  public Monster() {}
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/Monster.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */