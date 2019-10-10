public class CreateThread {
  GameRun gameRun;
  
  int type;
  
  public CreateThread(GameRun paramGameRun, int paramInt) {
    this.gameRun = paramGameRun;
    this.type = paramInt;
    run();
  }
  
  public void run() { // Byte code:
    //   0: aload_0
    //   1: getfield type : I
    //   4: bipush #16
    //   6: iand
    //   7: bipush #16
    //   9: if_icmpne -> 30
    //   12: aload_0
    //   13: getfield gameRun : LGameRun;
    //   16: iconst_0
    //   17: putfield select_stateY : B
    //   20: aload_0
    //   21: getfield gameRun : LGameRun;
    //   24: invokevirtual getMyMonImage : ()V
    //   27: goto -> 95
    //   30: aload_0
    //   31: getfield type : I
    //   34: iconst_1
    //   35: if_icmpne -> 62
    //   38: aload_0
    //   39: getfield gameRun : LGameRun;
    //   42: invokevirtual goBattle : ()V
    //   45: aload_0
    //   46: getfield gameRun : LGameRun;
    //   49: invokevirtual getEnemyImage : ()V
    //   52: aload_0
    //   53: getfield gameRun : LGameRun;
    //   56: invokevirtual getBallImage : ()V
    //   59: goto -> 95
    //   62: aload_0
    //   63: getfield type : I
    //   66: iconst_3
    //   67: if_icmpne -> 80
    //   70: aload_0
    //   71: getfield gameRun : LGameRun;
    //   74: invokevirtual getMyMonImage : ()V
    //   77: goto -> 95
    //   80: aload_0
    //   81: getfield type : I
    //   84: iconst_4
    //   85: if_icmpne -> 95
    //   88: aload_0
    //   89: getfield gameRun : LGameRun;
    //   92: invokevirtual getCoMonImage : ()V
    //   95: aload_0
    //   96: getfield type : I
    //   99: bipush #32
    //   101: iand
    //   102: bipush #32
    //   104: if_icmpne -> 114
    //   107: aload_0
    //   108: getfield gameRun : LGameRun;
    //   111: invokevirtual getEnemyImage : ()V
    //   114: aload_0
    //   115: getfield type : I
    //   118: bipush #29
    //   120: if_icmpne -> 123
    //   123: aload_0
    //   124: getfield type : I
    //   127: bipush #50
    //   129: if_icmpne -> 139
    //   132: aload_0
    //   133: getfield gameRun : LGameRun;
    //   136: invokevirtual createBattleImage : ()V
    //   139: aload_0
    //   140: getfield gameRun : LGameRun;
    //   143: iconst_3
    //   144: putfield createOver : B
    //   147: goto -> 155
    //   150: astore_1
    //   151: aload_1
    //   152: invokevirtual printStackTrace : ()V
    //   155: return
    // Exception table:
    //   from	to	target	type
    //   0	147	150	java/lang/Exception }
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/CreateThread.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */