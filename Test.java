class Person{
 Person() {
    autoId++;
    id = autoId;
  }

  void set(String name, String address, int age) {
    this.name = name;
    this.address = address;
    this.age = age;
  }

  void get() {
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("age: " + age);
    System.out.println("address: " + address);
  }
}

class Condidate extends Person{}

class Voters extends Person{}

class Test{
	public static void main(String[] args) {
		
	}
}
