package test4.sub5;

public class Subject {
	private String subName;
	private Student[] students;
	private int studentCount;
	
	public Subject(String subName, Student[] students, int studentCount) {
		this.subName = subName;
		this.students = students;
		this.studentCount = studentCount;
	}
	
	public void addStudent(Student student) {
		//학생을 과목에 추가
		if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
            System.out.println(student.getName() + " 학생이 " + subName + " 과목에 추가되었습니다.");
        } else {
            System.out.println("더 이상 학생을 추가할 수 없습니다.");
        }
	}
	
	public void printSubjectInfo() {
		//과목 이름과 수강하는 학생들의 이름 출력
		 System.out.println("과목 이름: " + subName);
	        System.out.println("수강 학생 목록:");
	        if (studentCount == 0) {
	            System.out.println("수강 중인 학생이 없습니다.");
	        } else {
	            for (int i = 0; i < studentCount; i++) {
	                System.out.println(" - " + students[i].getName());
	            }
	        }
	}
	
	public String getName() {
		//속성 name의 getter
	    return subName;
	}
}
