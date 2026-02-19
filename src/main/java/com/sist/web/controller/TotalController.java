package com.sist.web.controller;
/*
 *  => 추천 => 면접 
 *  => 비교 / 사용처 / 실제 구현
 *  => 이력서 => 기술 면접 / 코딩 테스트 / 인성 면접 
 *                     1               2
 *                     => 테스트지
 *                     => 결론 도출 => 부연 설명(프로젝트)
 *                     => 명확하게 한다
 *       | 설명 준비
 * 	1. 자바
 * 		= JVM / JDK / JRE 
 *                     | JVM + 라이브러리
 *               | 개발 도구 + JRE 
 * 		   | 자바 바이트 코드 관리 + 실행 엔진
 *                 | .class
 *      = Stack vs Heap
 *                  | 객체 저장 => 메모리 주소
 *         | 지역변수 / 메소드(Call Stack)   
 *      = 객체지향 4대 특성 => 객체지향 프로그램의 객체란?
 *      	= 캡슐화 / 상속 / 다형성 / 추상화
 *      = 오버라이딩 / 오버로딩
 *                     | new
 *          | modify
 *      = 인터페이스 vs 추상 클래스
 *         => 다중 구현 / 단일 구현
 *         => 구현 강제 / 공통 로직 처리 포함
 *      = Collection : 데이터 관리
 *          | ArrayList / LinkedList / Map / Set
 *      = 예외처리 
 *      	= Checked / UnChecked
 *      = 특히 ***
 *      	= 쓰레드 : 비동기 기본 / synchronized (동기)
 *      = Lamda
 *      = ***
 *      	Entity / DTO / VO => Spring AI : Spring
 *                          | record와 비슷 
 *                          | 값만 저장하는 클래스 => 식별자 없다 / 불변(getter)
 *                    | 데이터를 전송하는 목적       
 *            | 테이블과 1:1 매핑 => 테이블과 구조 동일 => 데이터베이스와 직접 연결 (객체=테이블) => JPA
 *                               --------------    	           
 *  2. 데이터베이스 ==> CLOB / BFILE / BLOB
 *                         ------------- 폴더에 저장 : S3
 *      = Oracle / MySQL(MariaDB)
 *      	------------------------------
 *      	   Oracle                 MySQL
 *          대기업/금융             중소기업 (startUp)
 *          상용화 중심	         오픈 소스 중심
 *          SpringBoot 기본 연동   많이 사용
 *          -------------------------------------
 *           데이터형 / 함수
 *           oracle          mysql
 *           varchar2      varchar
 *           clob          char
 *           number        int
 *           number(20, 2) double, decomal(10,2)
 *           date          date
 *           timestamp     datetime
 *           => sysdate    now()
 *          --------------------------------------
 *           Oracle
 *             SELECT ''||'' ===> SELECT CONCAT('','')
 *             WHERE name LIKE '%'||#{}||'%' ===> WHERE name LIKE CONCAT('%',#{},'%')
 *             NVL(a, 0) ===> IFNULL(a,0)
 *             WHERE num BETWEEN 1 AND 10 ===> LIMIT 0, 10
 *             CREATE SEQUENCE a_seq ===> AUTO_INCREAMENT
 *             
 *           1) 데이터베이스 설계 => 데이터형
 *           2) 함수 처리 
 *           3) SQL 문장은 동일  
 *  3. JSP / ThymeLeaf => UI
 *      = 차이점 
 *      = JSP : 자바 중심 / ThymeLeaf : HTML 중심
 *      = Cookie / Session : RestFul (GET / POST)
 *  -----------------------------------------------    
 *  4. MyBatis / JPA
 *  5. Spring-Boot
 *  6. CI/CD
 *  7. React / Vue
 */
public class TotalController {

}
