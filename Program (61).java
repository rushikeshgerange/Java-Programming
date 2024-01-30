class Employee
{
    public String Name;
    public int Salary;
    public int Age;
    public String Address;

    public Employee(String str,int amount, int A, String addr)
    {
        this.Name = str;
        this.Salary = amount;
        this.Age = A;
        this.Address = addr;
    }

    protected void finalize()
    {
        System.out.println("Inside finalize method...");
    }

    public void Display()
    {
        System.out.println("Employee Name : " +this.Name);
        System.out.println("Employee Salary : " +this.Salary);
        System.out.println("Employee Age : " +this.Age);
        System.out.println("Employee Address : " +this.Address);

    }

}

class FinalizeDemo1
{
    public static void main(String args[])
    {
        Employee eobj = new Employee("Amit", 78000, 28, "Karve Road Pune");
        Employee eobj3 = new Employee("Sumit", 88000, 38, "FC Road Pune");

        Employee eobj2 = eobj;

        eobj.Display();


        System.out.println("Hash code of eobj is : " +eobj.hashCode());
        System.out.println("Hash code of eobj2 is : " +eobj2.hashCode());
        System.out.println("Hash code of eob3 is : " +eobj3.hashCode());


        eobj = null;
        eobj2 = null;
        eobj3 = null;
        System.gc();
    }
}