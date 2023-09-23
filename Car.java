package JavaOopsProject;
/**Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice()
 * which should be returning a price of the car.Create 2 sub classes: Sedan and Truck. The Truck class
 * has a field as weight and has its own implementation of calculateSalePrice() method in which returned
 * price is calculated as following: if weight>2000 then returned price car should include 10% discount,
 * otherwise 20% discount.The Sedan class hasfield as length and also does it is own implementation of
 * calculateSalePrice(): if length of sedan is >20 feetthen returned car price should include 5% discount,
 * otherwise 10% discount*/
public class Car {
    private double carPrice;
   private String carColor;
   public Car(double carPrice,String carColor){
       this.carPrice=carPrice;
       this.carColor=carColor;
   }
   double calculateSalePrice(){
       return carPrice;
   }
}
  class Truck extends Car {
      private double weight;

      public Truck(double carPrice, String carColor, double weight) {
          super(carPrice, carColor);
          this.weight = weight;
      }

      @Override
      double calculateSalePrice() {
          if (weight > 2000) {
              return super.calculateSalePrice()-super.calculateSalePrice() * 0.10;
          }else{
              return super.calculateSalePrice()-super.calculateSalePrice() * 0.20;
          }
      }
  }
  class Sedan extends Car {
      private double length;

      public Sedan(double carPrice, String carColor, double length) {
          super(carPrice, carColor);
          this.length = length;
      }

      @Override
      double calculateSalePrice() {
          if (length > 20) {
              return super.calculateSalePrice()-super.calculateSalePrice() * 0.05;
          } else {
              return super.calculateSalePrice()-super.calculateSalePrice() * 0.10;
          }
      }
  }
class tester {
    public static void main(String[] args) {
        Truck t = new Truck(50000,"White",2500);
        System.out.println("The price of truck is $"+ t.calculateSalePrice());

        Sedan s=new Sedan(40000,"Black",15);
        System.out.println("The price of Sedan is $"+  s.calculateSalePrice());
    }
}
