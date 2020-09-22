import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Flow_Control {
public static void main(String[] args) {
	
	// create department

			Department department1 = new Department();
			department1.id = 1;
			department1.name = "Sale";

			Department department2 = new Department();
			department2.id = 2;
			department2.name = "Marketing";

			Department department3 = new Department();
			department3.id = 3;
			department3.name = "Director";

			// create group
			Group group1 = new Group();
			group1.id = 1;
			group1.groupName = "Nhom Java Fresher";

			Group group2 = new Group();
			group2.id = 2;
			group2.groupName = "Nhom C# Fresher";

			Group group3 = new Group();
			group3.id = 3;
			group3.groupName = "Nhom PHP Fresher";

			// Possition

			Position Position1 = new Position();
			Position1.id = 1;
			Position1.positionName = PositionName.DEV;

			Position Position2 = new Position();
			Position2.id = 2;
			Position2.positionName = PositionName.TEST;

			Position Position3 = new Position();
			Position3.id = 3;
			Position3.positionName = PositionName.PM;

			// create account

			Account account1 = new Account();
			account1.id = 1;
			account1.email = "duynguyen1@gmail.com";
			account1.userName = "duy.nguyenngoc";
			account1.fullName = "Nguyen Ngoc Duy";
			account1.department = department1;
			account1.position = Position1;
			account1.createDate = new Date(95, 11, 20);
			account1.gender = Gender.MALE;

			Account account2 = new Account();
			account2.id = 2;
			account2.email = "mynt2407@gmail.com";
			account2.userName = "mynguyen";
			account2.fullName = "Nguyen Thi My";
			account2.department = department1;
			account2.position = Position2;
			account2.createDate = new Date(93, 10, 01);
			account2.gender = Gender.UNKNOW;

			Account account3 = new Account();
			account3.id = 3;
			account3.email = "tongnhung@gmail.com";
			account3.userName = "nhung.tong";
			account3.fullName = "Tong Thi Nhung";
			account3.department = department3;
			account3.position = Position1;
			account3.createDate = new Date(91, 0, 12);
			account3.gender = Gender.FEMALE;
			
			// xet xem account1 thuoc group nao

			GroupAccount groupaccount1 = new GroupAccount();
			groupaccount1.groups = group2;
			groupaccount1.accounts = account1;
			groupaccount1.joinDate = new Date(90, 11, 20);

			GroupAccount groupaccount2 = new GroupAccount();
			groupaccount2.groups = group1;
			groupaccount2.accounts = account1;
			groupaccount2.joinDate = new Date(89, 01, 22);

			GroupAccount[] groupOfAccount1 = { groupaccount2, groupaccount1 };
			account1.groups = groupOfAccount1;
			
			// xet xem account2 thuoc group nao

			GroupAccount groupaccount1b = new GroupAccount();
			groupaccount1b.groups = group2;
			groupaccount1b.accounts = account2;
			groupaccount1b.joinDate = new Date(80, 01, 12);

			GroupAccount groupaccount2b = new GroupAccount();
			groupaccount2b.groups = group1;
			groupaccount2b.accounts = account2;
			groupaccount2b.joinDate = new Date(95, 04, 02);
			
			GroupAccount groupaccount3b = new GroupAccount();
			groupaccount3b.groups = group3;
			groupaccount3b.accounts = account2;
			groupaccount3b.joinDate = new Date(120, 05, 01);
			
			GroupAccount[] groupOfAccount2 = {groupaccount1b, groupaccount2b, groupaccount3b};
			account2.groups = groupOfAccount2;
	
			// Question 1
			
	if (account2.department == null) {
		System.out.println("Nhân viên này chưa có phòng ban");
	}
	else {
		System.out.println("Phòng ban của nhân viên này là: " + account2.department.name);
	}
	System.out.println("\n");
	
	// Question 2
	if (account2.groups == null) {
		System.out.println("Nhân viên này chưa có group");
	}
	else if (account2.groups.length == 1 || account2.groups.length == 2) {
		System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
		}
	else if (account2.groups.length == 3) { 
		System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
	}
	else {
		System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
	}
	System.out.println("\n");
	
	// Question 3: Sử dụng toán tử ternary để làm Question 1
	
	System.out.println(account2.department == null ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là: " + account2.department.name);
	System.out.println("\n");
	
//	Question 4: Sử dụng toán tử ternary để làm yêu cầu sau:
//		Kiểm tra Position của account thứ 1
//		Nếu Position = Dev thì in ra text "Đây là Developer"
//		Nếu không phải thì in ra text "Người này không phải là Developer"

	System.out.println(account1.position.positionName == PositionName.DEV ? "Đây là Developer" : "Người này không phải là Developer");
	System.out.println("\n");
	
	// lay ra CreateDate cua account 1: cach 1, Datatype là Date 
	System.out.println(account1.createDate);
	Locale locale = new Locale ("vi", "VN");
	DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT,locale);
	
	String date = dateformat.format(account1.createDate);
	System.out.println(date);
	System.out.println("\n");
	
	// lay ra CreateDate cua account 1: cach 2 (pattern)
	System.out.println(account2.createDate);
	String pattern = "dd-MM-yyyy";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	String date1 = simpleDateFormat.format(account2.createDate);
	System.out.println(date1);
	System.out.println("\n");
	
	System.out.println("Hello World"); // có chữ ln để xuống dòng 
	System.out.println("Hello World");
	System.out.println("\n");
	
	System.out.printf("%15s %15d %nABC", "Nam", 16); // Format dữ liệu: %s %d là biến để
	                                          //insert "Nam" và 16 vào
	                                         // số 15 để dãn cách 
	
	
	
}
}
