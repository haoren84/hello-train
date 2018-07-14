public class EmployeeTest {
	public static void main(String[] args) {
		Employee empOne = new Employee("Tom");
		Employee empTwo = new Employee("Timmy");
		empOne.setAge(10);
		empOne.setJob("程序猿");
		empOne.setSalary(500);
		empOne.printEmp();
		empTwo.setAge(10);
		empTwo.setJob("程序猿");
		empTwo.setSalary(500);
		empTwo.printEmp();
		
	}
}
