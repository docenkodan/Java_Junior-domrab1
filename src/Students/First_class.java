package Students;

import java.util.Scanner;

public class First_class {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Введите имя студента: ");	
		String name = scan.nextLine();
		System.out.print("Введите фамилию студента: ");	
		String surname = scan.nextLine();
		System.out.print("Введите оценку по математике: ");
		int mat = scan.nextInt();
		System.out.print("Введите оценку по физике: ");
		int fiz = scan.nextInt();
		System.out.print("Введите оценку по программированию: ");
		int prog = scan.nextInt();
		
		Student student = new Student (name, surname);
		student.PassMat(mat);
		student.PassFiz(fiz);
		student.PassProg(prog);
		
		if (student.BadStud())
		{
			System.out.println("Студент учится плохо");
		}
		else
		{
			System.out.println("Студент учится хорошо");
		}
		
		System.out.println(student);
	}
}
