package homework6.task3;

public class FurnitureShopTest {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();

        shop.addFurniture(new Chair("дерево", "коричневый", "классический"));
        shop.addFurniture(new Table("металл", "черный", 120));
        shop.addFurniture(new Sofa("текстиль", "серый", 3));

        shop.displayAvailableFurniture();
    }
}
