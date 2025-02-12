package chapter02;

public class IntroduceMyself {

	public static void main(String[] args) {
		//변수 *****
		//자기 소개 및 좋아하는 것 5개를 다양한 변수 선언을 통해 콘솔에 출력하세요
		//목적: 변수를 선언하고 사용
		//boolean, int, double, String
		
		//자기 소개
		String name="최낙원";
		double tall=173.5; //* 정수, 소수점 가능
		int footSize=260;  //* 소수점은 안됨
		
		System.out.print("저의 이름은 ");
		System.out.print("최낙원 ");
		System.out.print("입니다");
		System.out.println("");
		System.out.print("저의 키는 ");
		System.out.print("173.5 "); //* 정수, 소수점 가능
		System.out.print("입니다");
		System.out.println("");
		System.out.print("사는 곳은 ");
		System.out.print("부산 ");
		System.out.print("입니다");
		
		
		//System.out.println 개행(enter)
		//System.out.print 개행이 없음
		
		System.out.println("");
		System.out.print("저의 이름은 + 최낙원 + 입니다");
		System.out.println("");
		//좋아하는 것 5개
		//취미
		
		
		String hobby1 = "축구";
		int fan = 2015;
		double playerScore = 7.5;
		Boolean sakaNumber11 = false;
		Boolean sakaNumber7 = true;
		System.out.println(hobby1 + "팀 중에서 " + "아스날을 좋아하며, " + fan + "년도 부터 " + "팬입니다");
		System.out.println(hobby1 + "선수 중에서" + " 사카를 좋아합니다");
		System.out.println("사카의 " + "등번호는 " + "11번 " + "입니다 = " + sakaNumber11);
		System.out.println("사카의 " + "등번호는 " + "7번 " + "입니다 = " + sakaNumber7);
		System.out.println("3월 13일 " + "포르투전 " + "사카 평점은 " + playerScore + "입니다" );
		
		String hobby2 = "영화";
		String movieMainActor = "최민식, 김고은, 유해진, 이도현 ";
		int mainActorNumber = 4;
		String movieGenre = "미스터리, 공포";
		int movieTime = 134;
		double movieRatings = 8.22;
		System.out.println("최근에 본 "+ hobby2+ "는 파묘입니다");
		System.out.println("파묘의 주연은 " + movieMainActor + mainActorNumber + "명 입니다" );
		System.out.println("파묘의 장르는 " + movieGenre + "이며 " + "영화시간은 " + movieTime+ "분 입니다" );
		System.out.println("파묘의" + " 평점은 " + movieRatings + "입니다" );
		
		String hobby3 = "여행";
		int hotelGrade = 3;
		String travelingSchedule = "2박 3일";
		String buketlist = "유럽 여행";
		String schedule = "14박 15일";
		System.out.println("마지막 여행은" + " 올해 1월" + " 일본-마쓰야마 " + hobby3 + "입니다");
		System.out.println("숙소는 " + hotelGrade + "성급 호텔이었으며 " + "친구와 " + travelingSchedule + " 다녀왔습니다"  );
		System.out.println("저의 버킷리스트는 " + buketlist + "이며 " + schedule + "동안 " + hobby3 + "가는 것이 목표입니다");
		
		String hobby4 = "음식";
		String like1 = "한식, 일식, 양식";
		String like2 = "한식";
		String like3 = "일식";
		String like4 = "양식";
		System.out.println("제가 좋아하는 " + hobby4 + "종류는 " + like1+ "입니다");
		System.out.println(like2 + "에서 " + "좋아하는 " + hobby4 + "은 " + "비빔밥" + "입니다");
		System.out.println(like3 + "종류인 " + "초밥은 " +"어제 " + "먹었습니다");
		System.out.println("주말에 " + like1 + "중에서 " + like4 + "을 " + "먹을 예정이며, " + hobby4 + "은 " + "피자와 파스타 입니다");
		
		String hobby5 = "책";
		String bookName = "노리즈키 린타로의 모험";
		String bookGenre = "추리, 미스터리";
		int contents = 8;
		int bookPage = 468;
		System.out.println("최근에 " + "읽었던 " + hobby5 +"은 " + bookName + "입니다");
		System.out.println(hobby5 + "의 " + "장르는 " + bookGenre + "입니다");
		System.out.println(hobby5 + "의 " + "목차는 " + contents + "개 " + "이며, " + "페이지는 " + bookPage + "p 입니다");
		
		
	}

}
