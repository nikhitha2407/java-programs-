class Employee     //once verify you are getting an error.
{
  int id;
  String name;
  int salary; 
}
Employee()
{
  id=-1;
  name="NA";
  salary=0;
}
Employee(int no)
{
  id=no;
  name="NA";
  salary=0;
}
Employee(int no,String sname)
{
  id=no;
  name=sname;
  salary=0;
}
Employee(int no,String sname,int amount)
{
  id=no;
  name=sname;
  salary=amount;
}
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
   salary = s;
}
void getEmployeeDetails()
{
   System.out.println(id+","+name + ","+salary);
}
class Main2
{
  public static void main(String args[])
   {
      Employee emp=new Employee();
      Employee emp1=new Employee(10);
      Employee emp2=new Employee(12,"Suchitra");
      Employee emp3=new Employee(13,"Nikhitha",1234567);
      emp.getEmployeeDetails();
      emp1.getEmployeeDetails();
      emp2.getEmployeeDetails();
      emp3.getEmployeeDetails();
   }
}