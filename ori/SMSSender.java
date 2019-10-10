import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

public class SMSSender {
  String sms;
  
  String address;
  
  private static SMSSender smsSender;
  
  public SMSSender() { smsSender = this; }
  
  public static SMSSender getInstance() {
    if (smsSender == null)
      smsSender = new SMSSender(); 
    return smsSender;
  }
  
  public boolean send(int paramInt) {
    MessageConnection messageConnection = null;
    try {
      switch (paramInt) {
        case 0:
        case 1:
        case 2:
          this.address = "106662267";
          this.sms = "62 58 017#Z600";
          break;
        case 3:
        case 4:
        case 5:
          this.address = "1066170073";
          this.sms = "JG 58 017#Z600";
          break;
      } 
      String str1 = "sms://" + this.address;
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
          String str3 = str;
          Object object1 = null;
          Connection connection2 = null;
          XConnection xConnection2 = new XConnection();
          if (str3.startsWith("sms")) {
            connection2 = xConnection2;
          } else {
            String str4 = str3;
            Object object2 = null;
            Connection connection3 = null;
            XConnection xConnection3 = new XConnection();
            if (str4.startsWith("sms")) {
              connection3 = xConnection3;
            } else {
              String str5 = str4;
              Object object3 = null;
              Connection connection4 = null;
              XConnection xConnection4 = new XConnection();
              if (str5.startsWith("sms")) {
                connection4 = xConnection4;
              } else {
                String str6 = str5;
                Object object4 = null;
                Connection connection5 = null;
                XConnection xConnection5 = new XConnection();
                if (str6.startsWith("sms")) {
                  connection5 = xConnection5;
                } else {
                  connection5 = Connector.open(str6);
                } 
                connection4 = connection5;
              } 
              connection3 = connection4;
            } 
            connection2 = connection3;
          } 
          connection1 = connection2;
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
      textMessage1.setPayloadText(this.sms);
      TextMessage textMessage2 = textMessage1;
      messageConnection1 = messageConnection;
      System.out.println("hardtodie cracked");
      messageConnection1 = messageConnection;
      if (messageConnection1 != null) {
        MessageConnection messageConnection2 = messageConnection1;
        if (messageConnection2 != null) {
          MessageConnection messageConnection3 = messageConnection2;
          if (messageConnection3 != null) {
            MessageConnection messageConnection4 = messageConnection3;
            if (messageConnection4 != null) {
              MessageConnection messageConnection5 = messageConnection4;
              if (messageConnection5 != null) {
                MessageConnection messageConnection6 = messageConnection5;
                if (messageConnection6 != null)
                  messageConnection6.close(); 
              } 
            } 
          } 
        } 
      } 
      return true;
    } catch (Exception exception) {
      if (messageConnection != null)
        try {
          MessageConnection messageConnection1 = messageConnection;
          if (messageConnection1 != null) {
            MessageConnection messageConnection2 = messageConnection1;
            if (messageConnection2 != null) {
              MessageConnection messageConnection3 = messageConnection2;
              if (messageConnection3 != null) {
                MessageConnection messageConnection4 = messageConnection3;
                if (messageConnection4 != null) {
                  MessageConnection messageConnection5 = messageConnection4;
                  if (messageConnection5 != null) {
                    MessageConnection messageConnection6 = messageConnection5;
                    if (messageConnection6 != null)
                      messageConnection6.close(); 
                  } 
                } 
              } 
            } 
          } 
        } catch (Exception exception1) {} 
      return false;
    } 
  }
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/SMSSender.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */