import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;

public final class CwaSound {
  byte play_music;
  
  byte musicID = 0;
  
  byte loop_s;
  
  boolean sound_play = true;
  
  Player snd_music;
  
  VolumeControl vc_snd;
  
  String[] midName = { "wild1", "wild2", "city1", "", "city3", "village", "battle1", "battle2", "battle3" };
  
  byte[] loop = { 
      0, 2, 3, -1, 2, -1, -1, -1, -1, -1, 
      -1 };
  
  Player createMusic(String paramString, int paramInt) {
    String[] arrayOfString = { "audio/midi", "audio/x-wav" };
    try {
      if (paramInt >= 0) {
        if (this.snd_music != null)
          this.snd_music.close(); 
        this.snd_music = null;
        InputStream inputStream = getClass().getResourceAsStream("/sound/" + paramString + ".mid");
        this.snd_music = Manager.createPlayer(inputStream, arrayOfString[paramInt]);
        this.snd_music.prefetch();
        this.vc_snd = (VolumeControl)this.snd_music.getControl("VolumeControl");
        this.vc_snd.setLevel(50);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return this.snd_music;
  }
  
  boolean setMusic(int paramInt, boolean paramBoolean) {
    byte b = this.loop[paramInt];
    this.loop_s = (byte)b;
    try {
      if (this.musicID != (byte)paramInt || paramBoolean) {
        this.play_music = (byte)paramInt;
        this.musicID = this.play_music;
        if (this.snd_music != null)
          this.snd_music.close(); 
        this.snd_music = null;
        createMusic(this.midName[this.play_music - 1], 0);
      } else {
        this.play_music = (byte)paramInt;
      } 
      return true;
    } catch (Exception exception) {
      return false;
    } 
  }
  
  void soundStart() {
    try {
      this.snd_music.prefetch();
      this.snd_music.start();
    } catch (Exception exception) {}
  }
  
  public void soundPlay(boolean paramBoolean) {
    this.sound_play = paramBoolean;
    if (this.play_music > 0)
      if (paramBoolean) {
        if (this.loop_s == -1) {
          soundStop();
          this.snd_music.setLoopCount(-1);
          soundStart();
          this.play_music = 0;
        } else if (this.loop_s > 0 && this.snd_music != null && this.snd_music.getState() != 400) {
          this.snd_music.setLoopCount(1);
          soundStart();
          this.loop_s = (byte)(this.loop_s - 1);
        } else if (this.loop_s == 0) {
          this.play_music = 0;
          this.musicID = 0;
        } 
      } else {
        this.play_music = 0;
      }  
  }
  
  boolean soundStop() {
    try {
      this.snd_music.stop();
      return false;
    } catch (Exception exception) {
      return false;
    } 
  }
}


/* Location:              /Users/catalina/Code/Game/pet_kindom/宠物王国紫.jar!/CwaSound.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.0.7
 */