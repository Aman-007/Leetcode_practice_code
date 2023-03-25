abstract class Parent {
    int x=11, y=22;


    void show() {
        System.out.println(x + " " + y);
    }

    abstract void display();

}
class MyRegister{

void register(Parent P1){
    P1.display();
}
}
public class Child extends Parent {



    void display(){
        System.out.println("This message is printing from Child class and beauty is that Child class is not running it.");
        System.out.printf("Beauty of Abstraction");
    }

    public static void main(String[] args) {
        Child C1=new Child();
        C1.show();

        MyRegister RC=new MyRegister();
        RC.register(C1);

    }


}
