
public class Test {

	public static void main(String[] args) {
		Person taro= new Person();
		taro.name="山田太郎";
		taro.age =20;
		taro.phoneNumber="03-1234-5678";
		taro.address="東京";


		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();

		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="090-1234-5678";
		jiro.address="宮城";

		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		jiro.talk();
		jiro.walk();
		jiro.run();


		Person hanako = new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="080-5432-8765";
		hanako.address="神奈川";

		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();

		Person kenta = new Person();
		kenta.name="平原健太";
		kenta.age=21;
		kenta.phoneNumber="090-3678-7465";
		kenta.address="千葉";

		System.out.println(kenta.name);
		System.out.println(kenta.age);
		System.out.println(kenta.phoneNumber);
		System.out.println(kenta.address);
		kenta.talk();
		kenta.walk();
		kenta.run();

		Robut aibo = new Robut();
		aibo.name="aibo";

		aibo.talk();
		aibo.walk();
		aibo.run();

		Robut asimo = new Robut();
		asimo.name="asimo";

		asimo.talk();
		asimo.walk();
		asimo.run();

		Robut pepper = new Robut();
		pepper.name = "pepper(";

		pepper.talk();
		pepper.walk();
		pepper.run();


	}

}
