
public class polymorphism {
        public static void main(String args[]) {

                Child c = new Child();
                c.display();
                c.visible();
                c.focus();
        }
}

class Parent {
        public void display() {
                System.out.println("parent class displaymethod");
        }
        public void visible() {
                System.out.println("parent class visible method");
        }
}


class Child extends Parent{
        public void display() {
                System.out.println("child class display method");
        }
        public void focus() {
                System.out.println("child class focus method");
        }

}