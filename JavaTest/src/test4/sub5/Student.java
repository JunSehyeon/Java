package test4.sub5;

public class Student {
	
	private String name;
	private String studentId;
	private Subject[] subjects;
	private int[] scores;
	private int subjectCount;
	
	public Student(String name,String studentId,Subject[] subjects,int[] scores,int subjectCount) {
		this.name = name;
		this.studentId = studentId;
		this.subjects = subjects;		
		this.scores = scores;		
		this.subjectCount = subjectCount;		
	}
	
	public void enrollSubject(Subject subject) {
		//과목을 수강신청
		if(subjectCount<subjects.length) {
			subjects[subjectCount] = subject;
			scores[subjectCount] = -1;
			subjectCount++;
			System.out.println(subject.getName());
		}else {
			System.out.println("수강 가능한 최대 과목 수를 초과했습니다");
		}
	}
	
	public void setScore(Subject subject, int score) {
		//특정과목의 성적 입력
		for(int i = 0; i<subjectCount; i++) {
			if(subjects[i].equals(subject)) {
				scores[i]=score;
				System.out.println(subject.getName()+"과목의 점수가 입력되었습니다.");
				return;
			}
		}
		 System.out.println("수강 가능한 최대 과목 수를 초과했습니다.");
	}
	
	public void printStudentInfo() {
		//학생의 이름,ID,수강과목 및 성적 출력
		System.out.println("학생 이름: " + name);
        System.out.println("학생 ID: " + studentId);
        System.out.println("수강 과목 및 성적:");
        
        for (int i = 0; i < subjectCount; i++) {
            String subjectName = subjects[i].getName();
            int score = scores[i];
            System.out.println(" - " + subjectName + ": " + (score >= 0 ? score : "점수 없음"));
        }
	}
	
	public String getName() {
		return name;
	}
}
