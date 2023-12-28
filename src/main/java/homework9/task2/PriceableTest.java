package homework9.task2;

public class PriceableTest {
    public static void main(String[] args) {
        Priceable product = new Product(200.0);
        Priceable service = new Service(150.0);
        Priceable artwork = new Artwork(5000.0);

        System.out.println("Цена продукта: " + product.getPrice());
        System.out.println("Цена услуги: " + service.getPrice());
        System.out.println("Ценность произведения искусства: " + artwork.getPrice());
    }
}
