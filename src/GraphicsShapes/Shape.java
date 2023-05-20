// Базовий абстрактний клас для фігури Shape
package GraphicsShapes;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    // Метод для отримання назви фігури
    public String getName() {
        return name;
    }

    // Метод, що буде реалізовуватися для похідних класів
    public void draw() {

    }

}


