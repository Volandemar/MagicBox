import java.util.Random;

public class MagicBox<T> {
    private T[] items;

    public MagicBox(int maxLenght) {
        this.items = (T[]) new Object[maxLenght];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {

        for (int i = 0; i < items.length; i++) {

            if (items[i] == null) {
                throw new RuntimeException("Коробка не полна. Осталось не заполнено: " + (items.length - i));
            }

        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length - 1);

        T selectRandom = items[randomInt];
        return selectRandom;
    }
}
