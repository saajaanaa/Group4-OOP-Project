package JavaOopsProject;
/**We have to calculate the average of marks obtained in three subjects by student A and by student B.
        Create class 'Marks' with an abstract method 'getPercentage' that will be returning the
        average percentage of marks. Provide implementation of abstract method in classes 'A'
        and 'B'. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its
        parameters for student B. Test your code*/

abstract class Marks {
    abstract double getPercentage();
}
class A extends Marks {
    private double sub1;
    private double sub2;
    private double sub3;
    public A(double sub1, double sub2, double sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }
    @Override
    double getPercentage() {
        return (sub1 + sub2 + sub3) / 3;
    }
}
class B extends Marks {
    private double sub1;
    private double sub2;
    private double sub3;
    private double sub4;
    public B(double sub1, double sub2, double sub3, double sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }
    @Override
    double getPercentage() {

        return (sub1 + sub2 + sub3 + sub4) / 4;
    }
    public static void main(String[] args) {
        A studentA = new A(95,98,96);
        B studentB = new B(70, 88, 95, 80);

        System.out.println("Student A Average Percentage: " + studentA.getPercentage() + "%");
        System.out.println("Student B Average Percentage: " + studentB.getPercentage() + "%");
    }
}


