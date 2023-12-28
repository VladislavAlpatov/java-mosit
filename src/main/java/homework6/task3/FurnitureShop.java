package homework6.task3;

import java.util.ArrayList;
import java.util.List;

class FurnitureShop {
    private List<Furniture> furnitureList = new ArrayList<>();

    public void addFurniture(Furniture furniture) {
        furnitureList.add(furniture);
    }

    public void displayAvailableFurniture() {
        for (Furniture furniture : furnitureList) {
            furniture.displayInfo();
        }
    }
}
