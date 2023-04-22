package homework02.metods;

public interface ICollection<T> {
        void add(T element);
        boolean remove(T element);
        T get(int index);
        T remove(int index);
        void infoAll();
}
