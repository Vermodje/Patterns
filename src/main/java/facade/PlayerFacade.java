package facade;

class PlayerFacade {
    private Player mp3;
    private Player mpeg4;
    private Player blueRay;

    public PlayerFacade() {
        mp3 = new MP3Player();
        mpeg4 = new MPEG4Player();
        blueRay = new BlueRayPlayer();
    }
    public void mp3PlayerPlay(String filename){
        mp3.setFileName(filename);
        mp3.play();
    }
    public void mpeg4PlayerPlay(String filename){
        mpeg4.setFileName(filename);
        mpeg4.play();
    }
    public void  blueRayPlayerPlay(String filename){
        blueRay.setFileName(filename);
        blueRay.play();
    }
}
