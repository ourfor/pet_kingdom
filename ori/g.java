public class g {
  h a;
  
  int if;
  
  public g(h paramh, int paramInt) {
    this.a = paramh;
    this.if = paramInt;
    a();
  }
  
  public void a() { // Byte code:
    //   0: aload_0
    //   1: getfield if : I
    //   4: bipush #16
    //   6: iand
    //   7: bipush #16
    //   9: if_icmpne -> 30
    //   12: aload_0
    //   13: getfield a : Lh;
    //   16: iconst_0
    //   17: putfield bL : B
    //   20: aload_0
    //   21: getfield a : Lh;
    //   24: invokevirtual at : ()V
    //   27: goto -> 95
    //   30: aload_0
    //   31: getfield if : I
    //   34: iconst_1
    //   35: if_icmpne -> 62
    //   38: aload_0
    //   39: getfield a : Lh;
    //   42: invokevirtual T : ()V
    //   45: aload_0
    //   46: getfield a : Lh;
    //   49: invokevirtual char : ()V
    //   52: aload_0
    //   53: getfield a : Lh;
    //   56: invokevirtual N : ()V
    //   59: goto -> 95
    //   62: aload_0
    //   63: getfield if : I
    //   66: iconst_3
    //   67: if_icmpne -> 80
    //   70: aload_0
    //   71: getfield a : Lh;
    //   74: invokevirtual at : ()V
    //   77: goto -> 95
    //   80: aload_0
    //   81: getfield if : I
    //   84: iconst_4
    //   85: if_icmpne -> 95
    //   88: aload_0
    //   89: getfield a : Lh;
    //   92: invokevirtual ap : ()V
    //   95: aload_0
    //   96: getfield if : I
    //   99: bipush #32
    //   101: iand
    //   102: bipush #32
    //   104: if_icmpne -> 114
    //   107: aload_0
    //   108: getfield a : Lh;
    //   111: invokevirtual char : ()V
    //   114: aload_0
    //   115: getfield if : I
    //   118: bipush #29
    //   120: if_icmpne -> 123
    //   123: aload_0
    //   124: getfield if : I
    //   127: bipush #50
    //   129: if_icmpne -> 139
    //   132: aload_0
    //   133: getfield a : Lh;
    //   136: invokevirtual ao : ()V
    //   139: aload_0
    //   140: getfield a : Lh;
    //   143: iconst_3
    //   144: putfield A : B
    //   147: goto -> 155
    //   150: astore_1
    //   151: aload_1
    //   152: invokevirtual printStackTrace : ()V
    //   155: return
    // Exception table:
    //   from	to	target	type
    //   0	147	150	java/lang/Exception }
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/g.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */