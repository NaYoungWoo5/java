import java.util.Scanner;

class add {
	int a, b;

	public void rkqt(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int tlr() {
		return a + b;
	}
}

class Qorl {
	int a, b;

	public void rkqt(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int tlr() {
		return a - b;

	}
}

class rhqgkrl {
	int a, b;

	public void rkqt(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int tlr() {
		return a * b;
	}
}

class sksnrl {
	int a, b;

	public void rkqt(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int tlr() {
		return a % b;
	}
}

class skajwl {
	int a, b;

	public void rkqt(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int tlr() {
		return a / b;
	}
}
public class RPtksrl {

	public static void main(String[] args) {


		Scanner sca = new Scanner(System.in);
		System.out.println("�Է� >> ");

		int a = sca.nextInt();
		char key = sca.next().charAt(0);
		int b = sca.nextInt();

		

		switch (key) {
		case '+':

			add add = new add();
			add.rkqt(a, b);
			System.out.println("��� : " + add.tlr());

			break;

		case '-':

			Qorl qorl = new Qorl();
			qorl.rkqt(a, b);

			System.out.println("��� : " + qorl.tlr());

			break;

		case '*':

			rhqgkrl rhqgkrl = new rhqgkrl();
			rhqgkrl.rkqt(a, b);

			System.out.println("��� : " + rhqgkrl.tlr());

			break;

		case '%':
			sksnrl sksnrl = new sksnrl();
			sksnrl.rkqt(a, b);
			System.out.println("��� : " + sksnrl.tlr());

			break;

		case '/':
			skajwl skajwl = new skajwl();
			skajwl.rkqt(a, b);
			System.out.println("���:" + skajwl.tlr());

			break;

		default:

			System.out.println("����");

			break;
		}
		sca.close();

	}

}