package decorator;

class VoiceMessenger extends MessengerDecorator {
    public VoiceMessenger(Messenger messenger) {
        super(messenger);
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("Your Voice messages is here");
    }
}
