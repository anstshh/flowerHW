public class Main {
    public static void main(String[] args) {

        Flower rose = new Flower(null, "Голландия", 35.59);
        Flower chrysanthemum = new Flower(null, null, 15);
        chrysanthemum.lifeSpan = 5;
        Flower peony = new Flower(null, "Англия", 69.9);
        peony.lifeSpan = 1;
        Flower gypsophila = new Flower(null, "Турция", 19.5);
        gypsophila.lifeSpan = 10;

        printInfo(rose);
        printInfo(chrysanthemum);
        printInfo(peony);
        printInfo(gypsophila);

        printCostOfBouquet(rose, rose, rose,
                chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,
                gypsophila);


    }


        private static void printInfo(Flower flower){
            System.out.println(
                    "Цвет: " + flower.getFlowerColour() + ", страна: " + flower.getCountry() + ", стоимость: " + flower.getCost() + ", срок стояния цветка: " + flower.lifeSpan
            );







    }

    private static void printCostOfBouquet(Flower...flowers){
        double totalCost = 0;
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower:flowers) {
            if(flower.lifeSpan<minLifeSpan){
                minLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            printInfo(flower);
        }
        totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета: "+totalCost);
        System.out.println("Срок стояния букета: "+minLifeSpan);


    }
}