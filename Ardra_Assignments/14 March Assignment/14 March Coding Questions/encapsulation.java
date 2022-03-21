class Test {

        private int id;
        private String name;
        private int salary;
        public int getId() {
                return id;
        }
        public void setId(int id) {
                this.id = id;
        }
        public String getName() {
                return name;
        }
        public void setName(String name) {
                this.name = name;
        }
        public int getSalary() {
                return salary;
        }
        public void setSalary(int salary) {
                this.salary = salary;
        }
}


public class encapsulation {
        public static void main(String[] args) {
                Test e = new Test();

                e.setId(10);
                e.setName("abc");
                e.setSalary(20000);


                System.out.println(e.getId());
                System.out.println(e.getName());
                System.out.println(e.getSalary());
        }
}