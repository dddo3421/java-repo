package game_project.member;

public class DTO {
    private String userId;
    private String userPwd;

    public DTO() { // 디폴트 생성자 필요, 매개변수가 없는 경우 사용 
    	
    }
    
    public DTO(String userId) { //회원목록 확인용 
        this.userId = userId;
    }
    
    public DTO(String userId, String userPwd) {
        this.userId = userId;
        this.userPwd = userPwd;
    }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getUserPwd() { return userPwd; }
    public void setUserPwd(String userPwd) { this.userPwd = userPwd; }

    @Override
    public String toString() {
        return "ID: " + userId + "\tPWD: " + userPwd;
    }
}
