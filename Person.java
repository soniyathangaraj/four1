package foueone;

public class Person  extends Account{

		float age;
		String name;
		public float getAge() {
			return age;
		}
		public void setAge(float age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Person [age=" + age + ", name=" + name + "]";
		}
		
		

	}


