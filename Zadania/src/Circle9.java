public class Circlezad9 {

    private Circlezad9 centre;
    private Circlezad9 point;

    public Circlezad9(Circlezad9 centre, Circlezad9 point) {
        this.centre = centre;
        this.point = point;
    }

    public double getRadius() {
        return Math.sqrt(Math.pow((point.getX() - centre.getX()), 2) + Math.pow((point.getY() - centre.getY()), 2));
    }

    public double getPerimiter() {
        return 2.0 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}