package bean;
public class PeBean {
       public PeBean() {
              super();
              // TODO Auto-generated constructor stub
       }
       public PeBean(int id, String name, String email, String salary) {
              super();
              Id = id;
              Name = name;
              Email = email;
              Salary = salary;
       }
       @Override
       public String toString() {
              return "PeBean [Id=" + Id + ", Name=" + Name + ", Email=" + Email + ", Salary=" + Salary + "]";
       }
       public int getId() {
              return Id;
       }
       public void setId(int id) {
              Id = id;
       }
       public String getName() {
              return Name;
       }
       public void setName(String name) {
              Name = name;
       }
       public String getEmail() {
              return Email;
       }
       public void setEmail(String email) {
              Email = email;
       }
       public String getSalary() {
              return Salary;
       }
       public void setSalary(String salary) {
              Salary = salary;
       }
       int Id;
       String Name;
       String Email;
       String Salary;

}