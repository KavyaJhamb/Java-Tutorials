interface VoiceAssistant {
    void respond();
}

interface ChatAssistant {
    void respond();
}

// SmartAssistant implements both interfaces
class SmartAssistant implements VoiceAssistant, ChatAssistant {

    public void respond() {
        System.out.println("SmartAssistant responding in both voice and chat mode.");
    }

    public static void main(String[] args) {
        SmartAssistant assistant = new SmartAssistant();
        assistant.respond(); // Calls the overridden method
    }
}
