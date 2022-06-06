class Department {
    String dptName;
    int dptId;
    String dptHod;

    public Department(String dptName, int dptId, String dptHod) {
        this.dptName = dptName;
        this.dptId = dptId;
        this.dptHod = dptHod;
    }
}

    public class Emp {
        int id;
        String empName;
        String empAddress;
        Department dept;


        public Emp(int id, String empName, String empAddress, Department dept) {
            this.id = id;
            this.empName = empName;
            this.empAddress = empAddress;
            this.dept = dept;

        }
        void display(){
            System.out.println(id+" "+empName+" "+empAddress);
            System.out.println(dept.dptName+" "+ dept.dptId+" "+dept.dptHod);
        }

        public static void main(String[] args) {
            Department d = new Department("Mechanical", 101, "Joshi sir");
            Department d1 = new Department("Automobile", 202, "Pabale sir");
            Emp e = new Emp(37, "Aditya", "Solapur", d);
            Emp e1 = new Emp(62, "Koustub", "Nashik", d1);

             e.display();
             e1.display();
        }
    }
