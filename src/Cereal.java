public class Cereal{
    private String name;
    private char type;
    private int calories;
    private int protein;
    private int fat;
    private int sodium;
    private int fiber;
    private int carbohydrates;
    private int sugar;
    private int potassium;
    private int vitamins;
    private int shelf;
    private int weight;
    private double cups;
    private double rating;
    public Cereal(String name, char type, int calories, int protein, int fat, int sodium, int fiber, int carbohydrates, 
    int sugar, int potassium, int vitamins, int shelf, int weight, double cups, double rating){
        this.name = name;
        this.type = type;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.sodium = sodium;
        this.fiber = fiber;
        this.carbohydrates = carbohydrates;
        this.sugar = sugar;
        this.potassium = potassium;
        this.vitamins = vitamins;
        this.shelf = shelf;
        this.weight = weight;
        this.cups = cups;
        this.rating = rating; 
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setType(char type){
        this.type = type;
    }
    public char getType(){
        return this.type;
    }

    public void setCalories(int calories){
        this.calories = calories;
    }
    public int getCalories(){
        return this.calories;
    }

    public void setProtein(int protein){
        this.protein = protein;
    }
    public int getProtein(){
        return this.protein;
    }

    public void setFat(int fat){
        this.fat = fat;
    }
    public int getFat(){
        return this.fat;
    }

    public void setSodium(int sodium){
        this.sodium = sodium;
    }
    public int getSodium(){
        return this.sodium;
    }

    public void setFiber(int fiber){
        this.fiber = fiber;
    }
    public int getFiber(){
        return this.fiber;
    }

    public void setCarbs(int carbohydrates){
        this.carbohydrates = carbohydrates;
    }
    public int getCarbs(){
        return this.carbohydrates;
    }

    public void setSugar(int sugar){
        this.sugar = sugar;
    }
    public int getSugar(){
        return this.sugar;
    }

    public void setPotassium(int potassium){
        this.potassium = potassium;
    }
    public int getPotassium(){
        return this.potassium;
    }

    public void setVitamins(int vitamins){
        this.vitamins = vitamins;
    }
    public int getVitamins(){
        return this.vitamins;
    }

    public void setShelf(int shelf){
        this.shelf = shelf;
    }
    public int getShelf(){
        return this.shelf;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getWeight(){
        return this.weight;
    }

    public void setCups(double cups){
        this.cups = cups;
    }
    public double getCups(){
        return this.cups;
    }

    public void setRating(double rating){
        this.rating = rating;
    }
    public double getRating(){
        return this.rating;
    }
}