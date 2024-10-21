package Inheritance.Exercise1;

public class Tire extends Part {
    private int size;
    private int width;

    public Tire(int idNumber, String nameProduct, String model, String serial, int size, int width) {
        setIdNumber(idNumber);
        setNameProduct(nameProduct);
        setModel(model);
        setSerial(serial);
        this.size = size;
        this.width = width;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void printInfo() {
        System.out.println(getIdNumber() + ", "
                + getNameProduct() + ", "
                + getModel() + ", "
                + getSerial() + ", "
                + size + ", "
                + width
        );
    }
}
