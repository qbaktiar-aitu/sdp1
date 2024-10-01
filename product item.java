// Task 4: Prototype Pattern

interface ICloneableProduct extends Cloneable {
    ICloneableProduct makeCopy();
}

class ProductItem implements ICloneableProduct {
    private String itemName;
    private double itemPrice;

    public ProductItem(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    @Override
    public ICloneableProduct makeCopy() {
        return new ProductItem(itemName, itemPrice);
    }

    @Override
    public String toString() {
        return "ProductItem{name='" + itemName + "', price=" + itemPrice + '}';
    }
}

