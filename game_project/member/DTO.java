package game_project.member;

//회원 정보, 게임 통계 데이터를 전달
public class DTO {
    private String id;
    private String password;
    private String name;
    private int guessGameWinCount = 0; // 숫자 알아맞추기 통계횟수 초기화

    // 회원가입에서 id password name 저장 
    public DTO(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public String getId() { return id; }
    public String getPassword() { return password; }
    public String getName() { return name; }

    public void setPassword(String password) {
    	this.password = password; 
    	}
    public void setName(String name) { 
    	this.name = name; 
    	}
    // 게임 통계 관련 - 숫자 알아맞히기 맞춘 횟수 통계 
    public int getGuessGameWinCount() { return guessGameWinCount; }
    public void setGuessGameWinCount(int count) { 
    	this.guessGameWinCount = count; 
    	}
    
   
    // id와 name이 같으면 동일인으로 취급 회원가입 불가능
    public boolean isSameMember(DTO other) {
        return this.id.equals(other.id) && this.name.equals(other.name);
    }

    @Override 
    public String toString() { // 회원목록 보여줄 때 사용
        return "[ID: " + id + ", Name: " + name + "]";
    }
}
