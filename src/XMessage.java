/*    */ import java.util.Date;
/*    */ import javax.wireless.messaging.BinaryMessage;
/*    */ import javax.wireless.messaging.TextMessage;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class XMessage
/*    */   implements TextMessage, BinaryMessage
/*    */ {
/*    */   String payloadText;
/*    */   String address;
/*    */   byte[] payloadData;
/*    */   
/* 25 */   public String getPayloadText() { return this.payloadText; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 30 */   public void setPayloadText(String arg0) { this.payloadText = arg0; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 35 */   public String getAddress() { return this.address; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 40 */   public void setAddress(String arg0) { this.address = arg0; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 45 */   public Date getTimestamp() { return new Date(); }
/*    */ 
/*    */ 
/*    */   
/* 49 */   public byte[] getPayloadData() { return this.payloadData; }
/*    */ 
/*    */ 
/*    */   
/* 53 */   public void setPayloadData(byte[] arg0) { this.payloadData = arg0; }
/*    */ 
/*    */ 
/*    */   
/* 57 */   public String toString() { return "javax.wireless.messaging.TextMessage"; }
/*    */ }


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/XMessage.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */