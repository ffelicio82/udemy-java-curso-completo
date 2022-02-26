public class Media {
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcular() {
        return (x + y) / 2.0;
    }

    @Override
    public String toString() {
        return "{Media: {'x' : " + this.x + ", 'y' : " + this.y + "}}";
    }
}
