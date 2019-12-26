package facade;

class MP3Player implements Player {
    private String fileName;


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        System.out.println("it is Mp3 player");
        System.out.println("Now it is playing:");
        System.out.println(fileName);
    }
}
