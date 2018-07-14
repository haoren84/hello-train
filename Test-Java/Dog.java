
public class Dog {
	int dogAge;// 定义变量
	// 构造方法
	public Dog(String name) {
		System.out.println("Dog的名字是："+name); // 打印信息
	}
	
	public void setAge(int age) {
		dogAge = age;
	}
	
	public int getAge() {  // 需要有返回类型为int的数据
		System.out.println("Dog的年龄是："+dogAge+"岁");
		return dogAge;  // 返回
	}
	
	public static void main(String[] args) {
		// 创建对象
		Dog myDog = new Dog("timmy");
		myDog.setAge(6);// 调用方法设置myDog的年龄
		myDog.getAge();
		System.out.println("变量值："+myDog.dogAge);
	}
}
