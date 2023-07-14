import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class FruitBox<T extends  Fruit> implements Iterable<T> {
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

    //public void fruitsMoveTo(List <? extends T> secondbox) {

        //List<? extends T> source = this.fruits;
        //System.out.println("this.fruits  "+ source );

        //List<? extends T> dest = secondbox;
        //Collections.copy(dest, source);
        //}


    static <T> void copy(FruitBox<? extends Fruit> source, FruitBox<? extends Fruit> target) {

        target.addAll(source);
    }

    private void addAll(FruitBox<? extends Fruit> source) {
        fruits.addAll((Collection<? extends T>) source);
    }

    @Override
    public Iterator<T> iterator() {

        return fruits.iterator();
    }






    @Override
    public String toString() {
        return fruits.toString();
    }
}