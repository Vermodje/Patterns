package decorator;

abstract class MessengerDecorator implements Messenger{
    private Messenger messenger;

    public MessengerDecorator(Messenger messenger) {
        this.messenger = messenger;
    }

    @Override
    public void sendMessage() {
        messenger.sendMessage();
    }
}
