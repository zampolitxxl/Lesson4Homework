import java.util.*;

public class FruitBox<T extends  Fruit> implements Iterable<T>, List<T> {
    private List<T> fruits = new ArrayList<>();

    public void addFruit(T fruitToAdd) {

        fruits.add(fruitToAdd);
    }

    public int fruitBoxWeight() {
        int sum = 0;
        Iterator var2 = this.iterator();

        while (var2.hasNext()) {
            T next = (T) var2.next();
            int weight = next.getWeight();
            sum = sum + weight;
        }
        return sum;
    }
    public int shelfsSum() {
        int sum2 = 0;
        Iterator var3 = this.iterator();

        while (var3.hasNext()) {
            T next = (T) var3.next();
            sum2 = sum2 + 1;
        }
        return sum2;
    }

    // }

    //метод пересыпания фруктов из коробки в коробку

    public void fruitsMoveTo(FruitBox anotherbox) {

        //List  source = this.fruits;
        //System.out.println("this.fruits  "+ source );

        //List  dest = secondbox;
        Collections.copy(this.fruits, anotherbox);
        }


    //static <T> void copy(FruitBox<? extends Fruit> source, FruitBox<? extends Fruit> target) {



    private void addAll(FruitBox<? extends Fruit> source) {
        fruits.addAll((Collection<? extends T>) source);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {

        return fruits.iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }


    @Override
    public String toString() {
        return fruits.toString();
    }
}