package step09_exception;

public class ExceptionEx {

	public static void main(String[] args) {
		MemberVo member = new MemberVo ("홍길동 " , " 011-234-5678", "강남구");
		MemberDAO dao = new MemberDAO();
		try {
			dao.insert(member);
		}catch ( DuplicateKeyException e) {
			e.printStackTrace();
		}
	}

}

class MemberDAO {
	public void insert(MemberVo member ) throws DuplicateKeyException {
		System.out.println("고객정보를 저장합니다.");
		System.out.println(member.name+ "님의 정보");
		
		if("홍길동".equals(member.name)&&
				" 011-234-5678".equals(member.phone)) {
			throw new DuplicateKeyException(member.name + "의 데이터가 중복됩니다.");
		}else {
			System.out.println("데이터베이스 저장되었습니다.");
		}
			
	}
}


//사용자 정의 예외
class DuplicateKeyException extends Exception {
	DuplicateKeyException(String message) {
		super(message);
	}
}

class MemberVo {
	String name;
	String phone;
	String address;
	MemberVo(String name, String phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
}