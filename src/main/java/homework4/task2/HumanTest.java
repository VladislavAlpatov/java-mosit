package homework4.task2;

class Head {
    private String hairColor;
    private String eyeColor;

    public Head(String hairColor, String eyeColor) {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public void displayFeatures() {
        System.out.println("Цвет волос: " + hairColor + ", Цвет глаз: " + eyeColor);
    }
}

class Leg {
    private int length;

    public Leg(int length) {
        this.length = length;
    }

    public void walk() {
        System.out.println("Иду...");
    }
}

class Hand {
    private int strength;

    public Hand(int strength) {
        this.strength = strength;
    }

    public void liftSomething() {
        System.out.println("Поднимаю предмет силой " + strength);
    }
}

class Human {
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human(Head head, Leg leftLeg, Leg rightLeg, Hand leftHand, Hand rightHand) {
        this.head = head;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    public void displayCharacteristics() {
        head.displayFeatures();
        leftLeg.walk();
        rightLeg.walk();
        leftHand.liftSomething();
        rightHand.liftSomething();
    }
}

public class HumanTest {
    public static void main(String[] args) {
        Head head = new Head("черный", "зеленые");
        Leg leftLeg = new Leg(90);
        Leg rightLeg = new Leg(90);
        Hand leftHand = new Hand(50);
        Hand rightHand = new Hand(55);

        Human human = new Human(head, leftLeg, rightLeg, leftHand, rightHand);
        human.displayCharacteristics();
    }
}
