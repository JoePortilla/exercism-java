package Triangle;

public class Triangle {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) throws TriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new TriangleException();
        }

        if (side1 + side2 < side3 || side2 + side3 < side1 || side1 + side3 < side2) {
            throw new TriangleException();
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public boolean isEquilateral() {
        return side1 == side2 && side2 == side3;
    }

    public boolean isIsosceles() {
        return side1 == side2 || side2 == side3 || side1 == side3;
    }

    public boolean isScalene() {
        return side1 != side2 && side2 != side3 && side1 != side3;
    }

    // Propagar la excepción hacia arriba en la cadena de llamadas:
    public static void main(String[] args) throws TriangleException {
        Triangle tri = new Triangle(4, 4, 4);

        System.out.println(tri.isEquilateral());
        System.out.println(tri.isIsosceles());
        System.out.println(tri.isScalene());

    }

}
