package homework6.task1;

public class DishTest {
    public static void main(String[] args) {
        Plate plate = new Plate("фарфор", 24);
        Cup cup = new Cup("стекло", 350);
        Bowl bowl = new Bowl("пластик", 12);

        System.out.println(plate);
        plate.use();
        System.out.println(plate);
        plate.wash();
        System.out.println(plate);

        System.out.println(cup);
        cup.use();
        System.out.println(cup);
        cup.wash();
        System.out.println(cup);

        System.out.println(bowl);
        bowl.use();
        System.out.println(bowl);
        bowl.wash();
        System.out.println(bowl);
    }
}
