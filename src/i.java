import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

public class i {
  String if;
  
  String a;
  
  private static i do;
  
  public i() { do = this; }
  
  public static i a() {
    if (do == null)
      do = new i(); 
    return do;
  }
  
  public boolean a(int paramInt) {
    MessageConnection messageConnection = null;
    try {
      switch (paramInt) {
        case 0:
        case 1:
        case 2:
          this.a = "106662267";
          this.if = "62 58 017#Z600";
          break;
        case 3:
        case 4:
        case 5:
          this.a = "1066170073";
          this.if = "JG 58 017#Z600";
          break;
      } 
      String str1 = "sms://" + this.a;
      String str2 = str1;
      MessageConnection messageConnection1 = null;
      Connection connection = null;
      XConnection xConnection = new XConnection();
      if (str2.startsWith("sms")) {
        connection = xConnection;
      } else {
        String str = str2;
        Object object = null;
        Connection connection1 = null;
        XConnection xConnection1 = new XConnection();
        if (str.startsWith("sms")) {
          connection1 = xConnection1;
        } else {
          connection1 = Connector.open(str);
        } 
        connection = connection1;
      } 
      messageConnection = (MessageConnection)connection;
      str2 = "text";
      messageConnection1 = messageConnection;
      connection = null;
      XMessage xMessage = new XMessage();
      TextMessage textMessage1 = (TextMessage)xMessage;
      textMessage1.setAddress(str1);
      textMessage1.setPayloadText(this.if);
      TextMessage textMessage2 = textMessage1;
      messageConnection1 = messageConnection;
      System.out.println("hardtodie cracked");
      messageConnection1 = messageConnection;
      if (messageConnection1 != null) {
        MessageConnection messageConnection2 = messageConnection1;
        if (messageConnection2 != null)
          messageConnection2.close(); 
      } 
      return true;
    } catch (Exception exception) {
      if (messageConnection != null)
        try {
          MessageConnection messageConnection1 = messageConnection;
          if (messageConnection1 != null) {
            MessageConnection messageConnection2 = messageConnection1;
            if (messageConnection2 != null)
              messageConnection2.close(); 
          } 
        } catch (Exception exception1) {} 
      return false;
    } 
  }
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/i.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */