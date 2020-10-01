import java.util.Date;

public class Object_Method {
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

		Department[] departments = { department1, department2, department3 };

//		question1(department1);
//		question2(departments);
//		question3(department1);
//		question4(department1);
		question5(department1,department2);
	}

	// Question 1: In ra thông tin của phòng ban thứ 1 (sử dụng toString())
	public static void question1(Department department) {
		System.out.println(department);
	}

//	Question 2:
//		In ra thông tin của tất cả phòng ban (sử dụng toString())
	public static void question2(Department[] departments) {
		for (Department department : departments) {
			System.out.println(department);
		}
	}

//	Question 3: In ra địa chỉ của phòng ban thứ 1
	public static void question3(Department department) {
		System.out.println(department.hashCode());
	}

	// Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?
	
	public static void question4(Department nameDepartment) {
		if (nameDepartment.name.equals("Phong A")) {
			System.out.println("Phong ban thu 1 la Phong A");
		}
		else {
			System.out.println("phong ban thu 1 khong phai phong A");
		}
	}
//	Question 5: So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau
//	không (bằng nhau khi tên của 2 phòng ban đó bằng nhau)
	
	public static void question5(Department name1, Department name2) {
		System.out.println(name1.name.equals(name2.name));
	}
}