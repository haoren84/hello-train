public class Employee {
	String name; // 定义字符串变量name
	int age;  // 定义一个整型变量age
	String job;
	double salary; // 定义一个双精度浮点型变量salary
	
	// 构造方法
	public Employee(String name) {
		this.name=name;
	}
	public void setAge( int empAge) {
		age=empAge;
	}
	public void setJob( String empJob) {
		job=empJob;
	}
	public void setSalary( double empSal) {
		salary=empSal;
	}
	public void printEmp() {
		System.out.println("姓名："+name);
		System.out.println("年龄："+age);
		System.out.println("工作："+job);
		System.out.println("薪水："+salary);
	}
}
