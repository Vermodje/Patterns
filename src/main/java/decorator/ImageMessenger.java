package decorator;

class ImageMessenger extends MessengerDecorator {
    public ImageMessenger(Messenger messenger) {
        super(messenger);
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("Your images is here");
    }
}
