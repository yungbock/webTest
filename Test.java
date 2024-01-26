package com.app.test;

import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.app.dao.DBConnecter;
import com.app.dao.UserDAO;
import com.app.domain.UserDTO;

public class Test {
	public static void main(String[] args) {
		//연결 테스트
//		try {
//			Connection conn = DBConnecter.getConnection();
//			System.out.println("연결성공");
//			conn.close();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		UserDAO userDAO = new UserDAO();
		UserDTO userDTO = new UserDTO();
		
		userDTO.setUserNumber(2);
		userDTO.setUserId("bbb");
		userDTO.setUserPassword("1234");
		userDTO.setUserName("최영복");
		userDTO.setUserAge(29);
		userDTO.setUserGender("M");
		userDTO.setUserBirth("19960228");
		System.out.println("입력완료");
		
		System.out.println(userDTO);
		
		System.out.println(userDAO.checkId(userDTO.getUserId()));
		
//		userDAO.join(userDTO);
		System.out.println("회원가입");
		
		System.out.println(userDAO.login("aaa", "1234"));
		System.out.println(userDAO.login("bbb", "1234"));
		
		// 아이디 찾기
//		List<String> userIds = userDAO.findId("짱구", "20190505");
		List<String> userIds = userDAO.findId("최영복", "19960228");
		System.out.println(userIds);
		
		// 반복문 (for-each)
		for(String id : userIds) {
			System.out.println(id);
		}
		
		// java 8 함수형 프로그래밍 스타일 코드
		userIds.forEach(System.out::println);
		// userIds List를 순회하면서 각 요소를 System.out.println(); 출력		
		
		
		
		// 회원정보 전체 수정
		userDTO.setUserId("updateTest");
		userDTO.setUserPassword("1111");
		userDTO.setUserName("수정");
		userDTO.setUserAge(10);
		userDTO.setUserGender("M");
		userDTO.setUserBirth("19990104");
		userDTO.setUserNumber(21);

//		userDTO.update(userDTO);
		System.out.println("회원정보 수정");
		
		// 회원탈퇴
		
		System.out.println(userDAO.delete(4));
		
		if(userDAO.delete(5)) {
			System.out.println("탈퇴 완료");
		}else {
			System.out.println("탈퇴 실패");
		}
		
		// 회원정보로 회원 1명 정보 조회
		UserDTO user = userDAO.findUser(1);
		System.out.println(user);
		
		
		// 유저의 생이르 자바의 date타입으로 변환
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
			Date date = sdf.parse(user.getUserBirth());
			System.out.println(sdf.format(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Date타입을 Calendar로 변환할 때는 setTime()을 사용
		Calender cal = Calendar.getInstance();
		cal.setTime(date);
	}
}
