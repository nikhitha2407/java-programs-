class Employee
{
   int id;
   String name;
   int salary;
  
   void setId(int i)
   {
     id=i;
   }
   void setName(String n)
   {
      name=n;
   }
   void setSalary(int s)
   {
      salary=s;
   }
   void getEmployeeDetails()
   {
     System.out.println(name + "'s salary is "+salary+" per annum");
   }
   public static void main(String args[])
   {
    Employee obj= new Employee();
    obj.setId(2000080053);
    obj.setName("Kora Durga Nikhitha");
    obj.setSalary(1200000);
    obj.getEmployeeDetails();
   }
