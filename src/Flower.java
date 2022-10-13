public class Flower {

    private String flowerColour;
    private String country;
    private double cost;
    public int lifeSpan;

    public Flower(String flowerColour, String country, double cost, int lifeSpan) {
        if(flowerColour==null) {
            this.flowerColour = "Белый";
        } else {
            this.flowerColour = flowerColour;
        }
        if(country==null) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if(cost<=0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if(lifeSpan<=0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;

        }
    }

    public Flower(String flowerColour, String country, double cost) {
        this(flowerColour, country, cost, 3);
    }

    public String getFlowerColour() {
        return flowerColour;
    }

    public void setFlowerColour(String flowerColour) {
        if(flowerColour==null) {
            this.flowerColour = "Белый";
        } else {
            this.flowerColour = flowerColour;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(country==null) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if(cost<=0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }
}
