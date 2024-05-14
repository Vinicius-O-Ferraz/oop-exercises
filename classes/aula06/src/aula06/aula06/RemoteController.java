package aula06;

public class RemoteController implements Contoller{    
   
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

    @Override
    public void turnOn() {
        this.setOn(true);
    }

    @Override
    public void turnOff() {
        this.setOn(false);

    }

    @Override
    public void openMenu() {
        System.out.println("I'ts turned on? " + this.getOn());
        System.out.println("I't playing? " + this.getPlaying());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }

    }

    @Override
    public void closeMenu() {
        System.out.println("Closing Menu...");
    }

    @Override
    public void increaseVolume() {
        if (this.getOn()){
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void decreaseVolume() {
        if (this.getOn()){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void mute() {
        if (this.getOn() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void unmute() {
        if (this.getOn() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getOn() && !this.getPlaying()){
            this.setPlaying(true);
        }
    }

    @Override
    public void pause() {
        if (this.getOn() && this.getPlaying()){
            this.setPlaying(false);
        }
    }
}