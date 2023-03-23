package inheritance.sameSignature;

public interface Mythical {
    default public String identifyMyself() {
        return "I am a mythical creature.";
    }
}
