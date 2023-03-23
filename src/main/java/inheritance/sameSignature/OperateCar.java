package inheritance.sameSignature;

public interface OperateCar {
    // ...
    default public <EncryptedKey> int startEngine(EncryptedKey key) {
        // Implementation
        return 0;
    }
}
