public class Fruit {

    private int  number;//номер ящика

    private int  weight;//вес


    public Fruit(int number, int weight) {
        this.number = number;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Номер:  " + number + "  Вес:  " + weight;
    }
    public  int getWeight(){
        int weight=this.weight;
        return weight;
    }




}
