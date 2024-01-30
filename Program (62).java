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

    public void Display()
    {
        System.out.println("Employee Name : " +this.Name);
        System.out.println("Employee Salary : " +this.Salary);
        System.out.println("Employee Age : " +this.Age);
        System.out.println("Employee Address : " +this.Address);

    }

}

class FinalizeDemo2
{
    public static void main(String args[])
    {
        Employee eobj = new Employee("Amit", 78000, 28, "Karve Road Pune");


        eobj.Display();


        System.out.println("Hash code of eobj is : " +eobj.hashCode());
        System.out.println(eobj.getClass());
        //System.out.println(str.getClass());

    }
}