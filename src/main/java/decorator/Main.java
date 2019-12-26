package decorator;

class Main {
    public static void main(String[] args) {
        Messenger messenger1 = new VoiceMessenger(new WebMessenger("Hello World"));
        messenger1.sendMessage();
        System.out.println();
        Messenger messenger2 = new ImageMessenger(new WebMessenger("Hello Java"));
        messenger2.sendMessage();
        System.out.println();
        Messenger messenger3 = new WebMessenger("Bye Bye");
        messenger3.sendMessage();
    }

}

