public class Main {
    public static void main(String[] args) {
        var remoteControl = new AdvancedRemoteControl(new SamsungTv());
        remoteControl.turnOn();
    }
}