/*    */ import java.io.IOException;
/*    */ import java.io.InterruptedIOException;
/*    */ import javax.wireless.messaging.Message;
/*    */ import javax.wireless.messaging.MessageConnection;
/*    */ import javax.wireless.messaging.MessageListener;
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
/*    */ public class XConnection
/*    */   implements MessageConnection
/*    */ {
/*    */   public void close() {}
/*    */   
/* 25 */   public Message newMessage(String s) { return null; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 30 */   public Message newMessage(String s, String s1) { return null; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 35 */   public int numberOfSegments(Message message) { return 0; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 41 */   public Message receive() throws IOException, InterruptedIOException { return null; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void send(Message message1) throws IOException, InterruptedIOException {}
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setMessageListener(MessageListener messagelistener1) throws IOException {}
/*    */ 
/*    */ 
/*    */   
/* 55 */   public String toString() { return "javax.wireless.messaging.MessageConnection"; }
/*    */ }


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/XConnection.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */