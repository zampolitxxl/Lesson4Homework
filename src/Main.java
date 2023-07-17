import java.util.Collections;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
// класть фпукты определенного типа. желаем Т экстендс. Повторяем. Провеяем добавляение разных типов

        Fruit fruit1 = new Fruit(1, 35);
        Fruit fruit2 = new Fruit(2, 22);
        Fruit fruit3 = new Fruit(3, 10);

        Apple aplle1 = new Apple(4, 47);
        Apple aplle2 = new Apple(5, 5);
        Apple aplle3 = new Apple(6, 8);
        Apple aplle4 = new Apple(7, 12);

        GoldenApple goldenApple1 = new GoldenApple(8, 19);
        GoldenApple goldenApple2 = new GoldenApple(9, 75);



        Orange orange1 = new Orange(10, 21);
        Orange orange2 = new Orange(11, 25);
        Orange orange3 = new Orange(12, 87);
        Orange orange4 = new Orange(13, 13);


        FruitBox firstContainer = new FruitBox();

        firstContainer.addFruit(fruit1);
        firstContainer.addFruit(fruit2);
        firstContainer.addFruit(fruit3);

        System.out.println("Первый контейнер  тип FRUIT  "+ firstContainer);



        FruitBox <Apple > secondContainer = new FruitBox();

        secondContainer.addFruit(aplle1);
        secondContainer.addFruit(aplle3);
        secondContainer.addFruit(aplle2);
        secondContainer.addFruit(aplle4);


        System.out.println("Второй контейнер тип APPLE  "+ secondContainer);

        FruitBox <GoldenApple > thirdContainer = new FruitBox();

        thirdContainer.addFruit(goldenApple1);
        thirdContainer.addFruit(goldenApple2);



        System.out.println("Третий контейнер тип GOLDENAPPLE  "+ thirdContainer);



        FruitBox <Orange > fourthContainer = new FruitBox();

        fourthContainer.addFruit(orange1);
        fourthContainer.addFruit(orange2);
        fourthContainer.addFruit(orange3);
        fourthContainer.addFruit(orange4);



        System.out.println("Четвертый контейнер тип ORANGE  "+ fourthContainer);

        ///проверка веса на премере первой коробки

        int boxWeightOne = firstContainer.fruitBoxWeight();
        System.out.println("Суммарный вес первой коробки  составляет  "+ boxWeightOne);
        //Collections.copy(secondContainer, thirdContainer);

        //(secondContainer, thirdContainer);

        //thirdContainer.fruitsMoveTo(secondContainer);


        //проверка чтобы apple в голден эпл не пошел


        //System.out.println(" Второй  контейнер после перемещения  "+ secondContainer);

        thirdContainer.fruitsMoveTo(secondContainer);

        System.out.println(" Второй  контейнер после перемещения   "+ secondContainer);
        System.out.println(" третий  контейнер после перемещения   "+ thirdContainer);
        System.out.println(" Второй  контейнер после перемещения   "+ secondContainer);








        // метод пересыпания.
        // 1.Береем коробку и аргументом втсавлем вторую
        // 2. смотрим как копировать один массив в другой и прописываем это в методе
        // 3. смотрим как  1 коробку оставить пустой





    }
}