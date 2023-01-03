class emp{
    int id;
    String name;
    long mobile;
    String email;
    String address;
    int salary;
    final static String company = "ABC";
    final static int bonus = 5000;

    public int sal(){
        return salary*12+bonus;
        
    }


    public void show(){
        System.out.println(id + " " + name + " " + mobile + " " + email + " " + salary + " " + company);
    }



}

public class javaassgn2{
    public static void main(String[] args){
        emp emp1 = new emp();
        emp1.id = 1;
        emp1.name = "max";
        emp1.mobile = 9999999999l;
        emp1.email = "max123@gmail.com";
        emp1.address = "223 preston rd";
        emp1.salary = 7000;

        emp emp2 = new emp();
        emp2.id = 2;
        emp2.name = "charles";
        emp2.mobile = 9999999889l;
        emp2.email = "charles123@gmail.com";
        emp2.address = "224 preston rd";
        emp2.salary = 7500;

        emp emp3 = new emp();
        emp3.id = 3;
        emp3.name = "sainz";
        emp3.mobile = 9988999999l;
        emp3.email = "sainz123@gmail.com";
        emp3.address = "225 preston rd";
        emp3.salary = 8000;

        emp emp4 = new emp();
        emp4.id = 4;
        emp4.name = "seb";
        emp4.mobile = 9999889999l;
        emp4.email = "seb123@gmail.com";
        emp4.address = "226 preston rd";
        emp4.salary = 6000;

        emp emp5 = new emp();
        emp5.id = 5;
        emp5.name = "checo";
        emp5.mobile = 9888999999l;
        emp5.email = "checo123@gmail.com";
        emp5.address = "227 preston rd";
        emp5.salary = 7600;



        System.out.println(emp1.sal());
        emp1.show();

        System.out.println(emp2.sal());
        emp2.show();

        System.out.println(emp3.sal());
        emp3.show();

        System.out.println(emp4.sal());
        emp4.show();

        System.out.println(emp5.sal());
        emp5.show();

    }
} 