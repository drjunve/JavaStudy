package ex21Jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteQuery  {

	//멤버변수
	Connection con;
	Statement stmt;
	//생성자 : DB연결실행
	public DeleteQuery() {
		try {
			//드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			//연결정보 기술
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "education";
			String pass = "1234";
			//DB연결
			con = DriverManager.getConnection(url,id,pass);		
			System.out.println("오라클 DB 연결성공");
		}
		catch (Exception e) {
			System.out.println("연결실패");
			// ^오류가 생길 땐 이와 같은 명령어로 확인한다 ->^ e.printStackTrace();
		}
	}//end of DeleteQuery
	
	//DB 자원해제
	private void close() {
		try {
			if(stmt!=null) stmt.close();
			if(con!=null) con.close();
			System.out.println("DB자원반납완료");
		}
		catch(SQLException e) {
			System.out.println("자원반납시 오류가 발생하였습니다");
		}
	}//end of close
	
	//쿼리작성 및 전송, 실행을 위한 멤버메서드
	private void execute() {
		try {
			//Statement 객체 생성을 위한 메서드 호출
			stmt = con.createStatement();
			//정적 insert 쿼리문작성(인파라미터가 없는 쿼리문)
			String query = "DELETE FROM member WHERE id='test3'";
			/* insert, delete, update와 같이 행의 변화가 발생되는 쿼리문을
			 * 실행할 때는 execduteUpdate()메서드를 사용한다. 해당 쿼리를
			 * 실행한 후 영향을 받은 레코드의 갯수가 int타입으로 반환된다. */
			int affected = stmt.executeUpdate(query);
			//insert문 실행에 대한 결과 출력
			System.out.println(affected + "행이 삭제됨.");
			//자원반납
			close();
		}
		
		catch(SQLException e) {
			System.out.println("쿼리실행에 문제가 발생하였습니다.");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new DeleteQuery().execute();
	}//end of main
}
