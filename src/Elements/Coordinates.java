package Elements;

/**
 * Класс координат MusicBand
 */
public class Coordinates {
    private Float x; //Максимальное значение поля: 765, Поле не может быть null
    private double y; //Максимальное значение поля: 540

    /**
     * Метод который установливает значение переменной x
     *
     * @param x - значение координаты x
     */
    public void setX(String x){
        try {
            if (x == null) {
                System.err.println("coordinates.x не может быть null");
                System.exit(0);
            } else if (Float.parseFloat(x) > 765) {
                System.err.println("coordinates.x не может быть больше 765");
                System.exit(0);
            } else this.x = Float.parseFloat(x);
        } catch (NumberFormatException e) {
            System.err.println("coordinates.x неверный формат строки!");
            System.exit(0);
        }
    }

    /**
     * Метод который установливает значение переменной y
     *
     * @param y - значение координаты y
     */
    public void setY(String y){
        try {
            if (y == null) {
                System.err.println("coordinates.y не может быть null");
                System.exit(0);
            } else if (Double.parseDouble(y) > 540) {
                System.err.println("coordinates.y не может быть больше 540");
                System.exit(0);
            } else this.y = Double.parseDouble(y);
        } catch (NumberFormatException e) {
            System.err.println("coordinates.y неверный формат строки!");
            System.exit(0);
        }
    }

    @Override
    public String toString(){
        String result;
        result = x + ","+ y;
        return (result);
    }
}
