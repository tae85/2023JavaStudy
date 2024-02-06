package ex21jdbc.callable;

import java.sql.SQLException;
import java.sql.Types;

import ex21jdbc.crud.MyConnection;

public class DeleteProcCall extends MyConnection {
	
	public DeleteProcCall() {
		super("study", "1234");
	}
	
	@Override
	public void dbExecute() {
		try {
			csmt = con.prepareCall("{call MyMemberDelete(?,?)}");
			
			//인파라미터는 삭제할 아이디를 입력받는다.
			csmt.setString(1, inputValue("삭제할 아이디"));
			
			//아웃파라미터는 삭제 결과를 문자형으로 반환받는다.
			csmt.registerOutParameter(2, Types.VARCHAR);
			csmt.execute();
			System.out.println("삭제프로시저 실행결과:");
			System.out.println(csmt.getString(2));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			dbClose();
		}
	}

	public static void main(String[] args) {
		new DeleteProcCall().dbExecute();

	}

}
