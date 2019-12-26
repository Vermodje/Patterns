package decorator;

class WebMessenger implements Messenger {
    private String message;

    public WebMessenger(String message) {
        this.message = message;
    }

    @Override
    public void sendMessage() {
        System.out.println(message);
    }
}
