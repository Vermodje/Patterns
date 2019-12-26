package facade;

class Main {
    public static void main(String[] args) {
        PlayerFacade playerFacade = new PlayerFacade();
        playerFacade.mp3PlayerPlay("Алла Пугачева");
        System.out.println();
        playerFacade.mpeg4PlayerPlay("South Park");
        System.out.println();
        playerFacade.blueRayPlayerPlay("Joker");
    }
}
