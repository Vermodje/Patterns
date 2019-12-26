package facade;

class MPEG4Player implements Player {
    private String fileName;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public void play() {
        System.out.println("It is MPEG4 player");
        System.out.println("Now it is playing:");
        System.out.println(fileName);
    }
}
