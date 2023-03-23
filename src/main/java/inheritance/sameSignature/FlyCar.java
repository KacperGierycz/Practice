package inheritance.sameSignature;

public interface FlyCar {
    // ...
    default public <EncryptedKey> int startEngine(EncryptedKey key) {
        // Implementation
        return 0;
    }
}
