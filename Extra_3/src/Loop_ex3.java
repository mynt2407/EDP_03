import java.util.Scanner;

public class Loop_ex3 {
	public static void main(String[] args) {
//		question1();
//		question2();
		question3();
//		question4();

	}

//	Question 1:
//		Nhập vào dãy n số thực. Tính tổng dãy, trung bình dãy, tổng các số âm,
//		dương và tổng các số ở vị trí chẵn, vị trí lẻ trong dãy

	public static void question1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ban muon nhap vao bao nhieu so thuc? ");
		int input_n = scanner.nextInt();

		float[] input = new float[input_n];
		float t = 0;
		float tb = 0;
		float tb2 = 0;
		float tb3 = 0;
		float tc = 0;
		float tl = 0;

		for (int i = 0; i < input.length; i++) {
			System.out.println("moi ban nhap so thuc thu " + (i + 1) + " : ");
			float input_so = scanner.nextFloat();

			t += input_so;
			tb = t / input_n;
			if (input_so < 0) {
				tb2 += input_so;
			}
			if (input_so > 0) {
				tb3 += input_so;
			}
			if (i % 2 != 0) {
				tc += input_so;
			}
			if (i % 2 == 0) {
				tl += input_so;
			}
		}
		System.out.println("Tong la: " + t);
		System.out.println("Trung binh day la: " + tb);
		System.out.println("Tong cac so am la: " + tb2);
		System.out.println("Tong cac so duong la: " + tb3);
		System.out.println("Tong cac so o vi tri chan la: " + tc);
		System.out.println("Tong cac so o vi tri le la: " + tl);

	}

//	Question 2: Tìm và chỉ ra vị trí xuất hiện đầu tiên của phần tử x trong dãy
	public static void question2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ban muon nhap vao bao nhieu so? ");
		int input_number = scanner.nextInt();

		int[] arrays_number = new int[input_number];
		for (int i = 0; i < arrays_number.length; i++) {
			System.out.print("So thu " + (i + 1) + " la: ");
			arrays_number[i] = scanner.nextInt();
		}

		System.out.print("Moi ban nhap vao phan tu x: ");
		int number1 = scanner.nextInt();

		for (int j = 0; j < arrays_number.length; j++) {

			if (arrays_number[j] == number1) {
				System.out.println("So x ban vua nhap vao o vi tri thu: " + (j + 1));
				break;
			}

		}
	}

//	Question 3: Hãy nhập vào 16 số nguyên. In ra thành 4 dòng, 4 cột.
	public static void question3() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap vao 16 so nguyen! ");

		int[] inputs = new int[16];
		for (int i = 0; i < 16; i++) {
			System.out.print("So thu " + (i + 1) + " la: ");
			inputs[i] = scanner.nextInt();
		}
		// In theo hang

		for (int i = 0; i < 2; i++) {
			System.out.print("Hang thu " + (i + 1) + " la: ");
			for (int j = 0; j < 8; j++) {

				System.out.print((inputs[j + i * 8] + " "));
			}
			System.out.print("\n");
		}
	}

//	Question 4: Nhập vào dãy số. In ra dãy đã được sắp xếp tăng dần, giảm dần
	public static void question4() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Ban muon nhap bao nhieu so? ");
		int input_so = scanner.nextInt();

		int[] numbers = new int[input_so];
		int min = numbers[0];
		int count = 0;

		for (int j = 0; j < numbers.length; j++) {
			System.out.println("So thu " + (j + 1) + " la: ");
			numbers[j] = scanner.nextInt();

			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[j] < min) {
					min = numbers[j];
				}
			}

		}
		System.out.println(min);
	}
//	Question 5:
//		Cho một dãy các số sau: 10, 20, 90, 50, 100, 60, 30, 80, 70, 40.
//		Hãy sắp xếp các dãy này theo chiều tăng dần, giảm dần
//		Yêu cầu:
//		Thiết kế giao diện console nhập từng phần tử và hiển thị kết
//		quả ra màn hình.
//		Sau khi nhập đủ 10 phần tử theo đúng thứ tự như đề bài thì
//		thực hiện sắp xếp theo chiều tăng dần, giảm dần
	
	

}
