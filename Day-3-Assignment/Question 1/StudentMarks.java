
public class StudentMarks {
	public static void main (String args[]) {
		//You can change the subject marks in the code to say changes in the Table displayed
		int subject1Marks = 90;
		int subject2Marks = 80;
		int subject3Marks = 70;
		int subject4Marks = 35;
		int subject5Marks = 54;
		
		System.out.printf("%s\t%s\n", "Percentage", "Grade");
		System.out.printf("%-9d\t%s\n", subject1Marks, getStudentGrade(subject1Marks));
		System.out.printf("%-9d\t%s\n", subject2Marks, getStudentGrade(subject2Marks));
		System.out.printf("%-9d\t%s\n", subject3Marks, getStudentGrade(subject3Marks));
		System.out.printf("%-9d\t%s\n", subject4Marks, getStudentGrade(subject4Marks));
		System.out.printf("%-9d\t%s\n", subject5Marks, getStudentGrade(subject5Marks));
	}
	public static String getStudentGrade(int mark) {
		String grade = " ";
		if(mark>=90)
			grade = "A";
		else if (mark>=80)
			grade = "B";
		else if (mark >=70)
			grade = "C";
		else if (mark >=60)
			grade = "D";
		else if (mark >=50)
			grade = "Pass";
		else 
			grade = "Fail";
		return grade;
	}
}

