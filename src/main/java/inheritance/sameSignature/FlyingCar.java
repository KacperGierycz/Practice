package inheritance.sameSignature;

public class FlyingCar implements OperateCar, FlyCar {
    @Override
    public <EncryptedKey> int startEngine(EncryptedKey encryptedKey) {
         FlyCar.super.startEngine(encryptedKey);
         OperateCar.super.startEngine(encryptedKey);
         return 0;
    }
    // ...
//    public <EncryptedKey> int startEngine(EncryptedKey key) {
//        FlyCar.super.startEngine(key);
//        OperateCar.super.startEngine(key);
//        return 0;
//    }
}
