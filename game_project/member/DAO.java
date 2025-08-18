package game_project.member;

import java.sql.*;
import java.util.Vector;
import game_project.util.DBConnect;

public class DAO implements DAOinterface {

    // 회원가입: DTO에서 ID, 비밀번호 가져와 MEMBER 테이블에 INSERT
    @Override
    public boolean registerMember(DTO dto) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DBConnect.getConnection();           // DB 연결
            String sql = "INSERT INTO MEMBER VALUES(?, ?)";
            pstmt = con.prepareStatement(sql);         // SQL 실행 준비
            pstmt.setString(1, dto.getUserId());      // DTO에서 ID 가져오기
            pstmt.setString(2, dto.getUserPwd());     // DTO에서 PWD 가져오기
            return pstmt.executeUpdate() > 0;         // 성공 여부 반환
        } finally {
            DBConnect.close(con, pstmt);              // 자원 반납
        }
    }

    // 회원 목록 조회: MEMBER 테이블에서 모든 USERID 가져와 Vector에 담아 반환
    @Override
    public Vector<DTO> getAllMembers() throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Vector<DTO> list = new Vector<>();
        try {
            con = DBConnect.getConnection();           // DB 연결
            String sql = "SELECT USERID FROM MEMBER";
            pstmt = con.prepareStatement(sql);         // SQL 실행 준비
            rs = pstmt.executeQuery();                 // 결과 가져오기
            while (rs.next()) {                        // ResultSet 순회
                list.add(new DTO(rs.getString(1)));    // USERID를 DTO로 저장
            }
            return list;                               // Vector 반환
        } finally {
            DBConnect.close(con, pstmt, rs);          // 자원 반납
        }
    }

    // 로그인: 입력받은 ID, PWD로 MEMBER 테이블 조회, 일치하면 DTO 반환
    @Override
    public DTO login(String id, String pwd) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            con = DBConnect.getConnection();           // DB 연결
            String sql = "SELECT USERID FROM MEMBER WHERE USERID=? AND USERPWD=?";
            pstmt = con.prepareStatement(sql);         // SQL 실행 준비
            pstmt.setString(1, id);                   // 입력 ID 세팅
            pstmt.setString(2, pwd);                  // 입력 PWD 세팅
            rs = pstmt.executeQuery();                 // 결과 가져오기
            if (rs.next()) {                           // 조회 성공 시
                return new DTO(rs.getString("USERID"));// DTO 반환
            }
            return null;                               // 조회 실패 시 null
        } finally {
            DBConnect.close(con, pstmt, rs);          // 자원 반납
        }
    }

    // 회원 정보 수정: DTO에서 ID, PWD 가져와 MEMBER 테이블 UPDATE
    @Override
    public boolean updateMember(DTO dto) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DBConnect.getConnection();           // DB 연결
            String sql = "UPDATE MEMBER SET USERPWD=? WHERE USERID=?";
            pstmt = con.prepareStatement(sql);         // SQL 실행 준비
            pstmt.setString(1, dto.getUserPwd());     // 변경할 비밀번호 세팅
            pstmt.setString(2, dto.getUserId());      // 대상 ID 세팅
            return pstmt.executeUpdate() > 0;         // 성공 여부 반환
        } finally {
            DBConnect.close(con, pstmt);              // 자원 반납
        }
    }

    // 회원 탈퇴: ID와 PWD 확인 후 MEMBER 테이블에서 삭제
    @Override
    public boolean deleteMember(String id, String pwd) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DBConnect.getConnection();           // DB 연결
            String sql = "DELETE FROM MEMBER WHERE USERID=? AND USERPWD=?";
            pstmt = con.prepareStatement(sql);         // SQL 실행 준비
            pstmt.setString(1, id);                   // 대상 ID 세팅
            pstmt.setString(2, pwd);                  // 입력 PWD 확인용
            return pstmt.executeUpdate() > 0;         // 성공 여부 반환
        } finally {
            DBConnect.close(con, pstmt);              // 자원 반납
        }
    }
}
