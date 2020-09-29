import java.util.Date;

public class Exercise_2 {


public static void main(String[] args) {
	question1();
	question2();
	
}
//	Question 1:
//		Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi
//		tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
//		 Email: "Email 1"
//		 Username: "User name 1"
//		 FullName: "Full name 1"
//		 CreateDate: now
	public static void question1() {
		
	
	Account [] accounts = new Account [5];
	for (int i = 0; i < accounts.length; i++) {
		accounts[i] = new Account();
		accounts[i].fullName = "Full name " + i;
		accounts[i].userName = "User name " + i;
		accounts[i].email = "Email " +  i;
		accounts[i].createDate = new Date();
		
		System.out.println(accounts[i].fullName);
		System.out.println(accounts[i].userName);
		System.out.println(accounts[i].email);
		System.out.println(accounts[i].createDate);
		System.out.println("\n");
	}	
	
}

	public static void question2() {
		
		
		
	}

}
