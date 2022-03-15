public class inheritance {
        public static void main(String [] args) {
                teachers t1 = new teachers();
                t1.name = "abc";
                t1.phone = 78333;
                t1.showaddress();


                staffs s1 = new staffs();
                s1.name = "xyz";
                s1.phone = 239021;
                s1.showaddress();


                students st1 = new students();
                st1.name = "lmn";
                st1.phone = 65287997;
                st1.showaddress();
        }
}


class Person {
        String name;
        int phone;


        public void showaddress() {
                System.out.println("Name : "+name);
                System.out.println("Phone : "+phone);
        }
}


class teachers extends Person{
}
class students extends Person{
}
class staffs extends Person{
}


