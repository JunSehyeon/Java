package test4.sub3;

public class MovieTicket {
	private String movieTitle;
	private String screenTime;
	private String seatNumber;
	private boolean isBooked;
	
	public MovieTicket(String movieTitle,String screenTime,String seatNumber,boolean isBooked) {
		this.isBooked = false; 
		this.movieTitle = movieTitle; 
		this.screenTime = screenTime;
		this.seatNumber = seatNumber; 
	}
	
	public void bookTicket() {
		//티켓이 예약가능한 경우 예약처리
		//isBooked을true로 설정
		//티켓이 이미 예약된 경우 적절한 메세지 출력
		if(!isBooked) {
			isBooked=true;
			System.out.println("티켓이 성공적으로 예약되었습니다.");
		}else {
			System.out.println("이미 예약된 티켓입니다.");
		}
	}
	
	public void cancelBooking() {
		//티켓이 예약된 경우 예약  취소
				//isBooked을false로 설정
				//티켓이 예약되지 않은 경우 적절한 메세지 출력
		 if (isBooked) {
	            isBooked = false;
	            System.out.println("예약이 취소되었습니다.");
	        } else {
	            System.out.println("예약되지 않은 티켓입니다.");
	        }
	}
	
	public void printTicketInfo() {
		System.out.println("영화제목:"+ movieTitle);
		System.out.println("상영시간:"+ screenTime);
		System.out.println("좌석번호:"+ seatNumber);
		System.out.println("예약여부:"+ isBooked);
	}
}
