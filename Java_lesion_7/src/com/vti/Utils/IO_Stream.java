package com.vti.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.vti.Utils.IO_Stream.isContinuing;

public class IO_Stream {
//	Question 1: Tạo method        //READ FILE
	//	Tạo 1 method có đầu vào là String filePath và return ra nội dung trong file.
	//	Chú ý:
	//	Nếu file không tồn tại thì sẽ throw ra Exception "Error! File
	//	Not Exist." (sử dụng FileManager ở trên đẻ check)
	//	 Gợi ý: Tạo method String readFile(String pathFile)

	public class isContinuing {

	}

	public static void readFile(String filePath) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\MyNguyen\\Desktop\\test.txt");

		byte[] b = new byte[1024];
		int length = file.read(b);
		System.out.println(length);

		while (length > -1) {
			String content = new String(b, 0, length);
			System.out.println(content);
			System.out.println("------------------------------------");
			length = file.read(b);
		}
		file.close();
	}

//	Question 2: Tạo method write content to File
//	Tạo 1 method để write file
//	Chú ý:
//	Nếu file không tồn tại thì sẽ throw ra Exception "Error! File
//	Not Exist." (sử dụng FileManager ở exercise trên để check)
//	Gợi ý: Tạo method void writeFile(String pathFile, isContinuing
//	String content)
//	Nếu isContinuing = false thì sẽ xóa hết nội dung trong file đi và write content mới vào
//	Nếu isContinuing = true thì sẽ ghi content vào cuối file


	
	
	

	
}