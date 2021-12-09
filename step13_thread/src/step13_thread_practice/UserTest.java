package step13_thread_practice;

class Post {
	private int liketotal = 0;
	private String lastlikedperson;
	synchronized void deposit(String name) {
		if(liketotal < 100) {
			liketotal++;
			lastlikedperson = name;
			System.out.println(name+"님의 좋아요! 현재 좋아요:"+liketotal);
			
		}
	}
	int getlikeTotal() {
		return liketotal;
	}
	String getlastlikedperson() {
		return lastlikedperson;
	}
}

class User extends Thread {
	private Post post;

	public User(Post post, String name) {
		super(name);
		this.post = post;
		setName(name);
	}
	@Override
	public void run() {
		while(true) {
			if(post.getlikeTotal()>=100) {
				break;
			}else {
				post.deposit(getName());
			}
		}
		
		
	}
}
	

public class UserTest {

	public static void main(String[] args) {
		
		Post post = new Post();
		
		User[] users = new User[3];
		users[0] = new User(post,"철수");
		users[1] = new User(post,"영자");
		users[2] = new User(post,"준용");
		
		
		for(User user : users) {
			user.start();
		}
		
		
		try {
			for(User user: users) {
				user.join();
			}
		}catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("마지막으로 좋아요를 누른 사람은 : "+post.getlastlikedperson());
	}

}
