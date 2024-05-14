package aula06;

public class RemoteController{    
   
    private int volume;
    private boolean on;
    private boolean playing;


    public RemoteController(){
        this.volume = 50;
        this.on = false;
        this.playing = false;
    }

    private int getVolume(){
        return this.volume;
    }

    private boolean getOn(){
        return this.on;
    }

    private boolean getPlaying(){
        return this.playing;
    }

    private void setVolume(int volume){
        this.volume = volume;
    }

    private void setOn(boolean on){
        this.on = on;
    }

    private void setPlaying(boolean playing){
        this.playing = playing;
    }
}
