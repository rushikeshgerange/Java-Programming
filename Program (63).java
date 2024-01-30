class Employee implements Cloneable
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

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

}

class FinalizeDemo4
{
    public static void main(String args[])
    {
        try
        {
            Employee eobj1 = new Employee("Amit", 78000, 28, "Karve Road Pune");
            Employee eobj2 = (Employee)eobj1.clone();
            eobj1.Display();
            eobj2.Display();

            System.out.println(eobj1.hashCode());
            System.out.println(eobj2.hashCode());
            System.out.println(eobj2.getClass());
        }

        catch(CloneNotSupportedException obj)
        {
            System.out.println("Inside catch block..."+obj);
        }
    }
}