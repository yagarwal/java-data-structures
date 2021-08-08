import java.lang.reflect.Array;

public class ArrayList <T> {

    T[] items;
    int count;
    Class<T> c;

    ArrayList (Class<T> c, int l) {
        this.c = c;
        items = getNew(c, l);
    }

    T[] getNew(Class<T> c, int l) {
        return  (T[]) Array.newInstance(c, l);
    }

    void add(T item) {
        if (items.length == count) {
            T[] temp = getNew(this.c, count * 2);
            for (int i = 0; i < count; i++) {
                temp[i] = items[i];
            }
            items = temp;
        }
        items[count++] = item;
    }

    void removeAt(int index) {
        try {
            if (index < 0 || index >= count) {
                throw new IllegalArgumentException();
            }
            for (int i = index; i < count; i++) {
                items[i] = items[i + 1];
            }
            count--;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    int indexOf(T item) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                index = i;
            }
        }
        return index;
    }

    boolean contains(T item) {
        return indexOf(item) != -1;
    }

}
