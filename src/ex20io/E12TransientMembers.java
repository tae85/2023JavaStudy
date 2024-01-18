package ex20io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Friend implements Serializable{
	String name;
	String phone;
	String addr;

	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}

	public void showAllData() {
		System.out.println("이름:" + name);
		System.out.println("전화번호:" + phone);
		System.out.println("주소:" + addr);
	}

	public void showBasicInfo() {}
}

class HighFriend extends Friend {
	String nickname;

	public HighFriend(String name, String phone, String addr, String nickname) {
		super(name, phone, addr);
		this.nickname = nickname;
	}

	@Override
	public void showAllData() {
		System.out.println("==고딩친구(전체정보)==");
		super.showAllData();
		System.out.println("별명:" + nickname);
	}

	@Override
	public void showBasicInfo() {
		System.out.println("==고딩친구==");
		System.out.println("별명:" + nickname);
		System.out.println("전번:" + phone);
	}
}

class UnivFriend extends Friend {
	String major;

	public UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	}

	@Override
	public void showAllData() {
		System.out.println("==대딩친구(전체정보)==");
		super.showAllData();
		System.out.println("전공:" + major);
	}

	@Override
	public void showBasicInfo() {
		System.out.println("==대딩친구==");
		System.out.println("이름:" + name);
		System.out.println("전화번호:" + phone);

	}
}

public class E12TransientMembers {

	public static void menuShow() {
		System.out.println("######## 메뉴를 입력하세요 ########");
		System.out.print("1.고딩친구입력 ");
		System.out.println("2.대딩친구입력");
		System.out.print("3.전체정보출력 ");
		System.out.println("4.간략정보출력");
		System.out.print("5.검색 ");
		System.out.print("6.삭제 ");
		System.out.println("7.프로그램종료");
		System.out.print("메뉴선택>>>");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* 컬렉션은 최초 생성시 크기를 지정하지 않는다. 입력 혹은 삭제되는 인스턴스에 따라 크기가
		자동으로 설정된다. */
		FriendInfoHandler handler = new FriendInfoHandler();
		
		/* 프로그램 시작시 직렬화된 파일이 있다면 즉시 복원하여 List 컬렉션에 저장한다.*/
		handler.readFriendInfo();

		while (true) {
			menuShow();

			int choice = scan.nextInt();
			
			switch (choice) {
			case 1: case 2:
				handler.addFriend(choice);
				break;
			case 3:
				handler.showAllData();
				break;
			case 4:
				handler.showSimpleData();
				break;
			case 5:
				handler.searchInfo();
				break;
			case 6:
				handler.deleteInfo();
				break;
			case 7:
				/* 
				퀴즈] 프로그램을 종료할 때 List컬렉션에 저장되었던 전체 정보를 '직렬화'해서 파일에 저장한다.
				파일명 : friend_info.obj */
				handler.saveFriendInfo();
				System.out.println("프로그램 종료");
				return;
			}
		}
	}
}

class FriendInfoHandler {
	// 멤버변수 : [기존]인스턴스배열 => [변경]List 컬렉션
//	private Friend[] myFriends;
//	private int numOfFriends;
	ArrayList<Friend> lists;
	
	/*
	멤버변수가 변경되었으므로 생성자에서도 아래와 같이 수정해야 한다. 컬렉션을 초기화 한다. 카운트가
	필요없으므로 매개변수 num도 삭제한다.
	 */
	public FriendInfoHandler() {
//		myFriends = new Friend[num];
//		numOfFriends = 0;
		
		/*
		기존에는 카운트를 위한 별도의 변수가 필요했지만, 컬렉션은 자동인덱싱을 지원하므로 필요하지 않다.
		즉, 컬렉션 인스턴스만 있으면 된다.
		 */
		lists = new ArrayList<Friend>();
	}

	public void addFriend(int choice) {
		Scanner scan = new Scanner(System.in);
		String iName, iPhone, iAddr, iNickname, iMajor;
		System.out.print("이름:"); iName = scan.nextLine();
		System.out.print("전화번호:"); iPhone = scan.nextLine();
		System.out.print("주소:"); iAddr = scan.nextLine();
		
		if(choice == 1) {
			System.out.print("별명:"); iNickname = scan.nextLine();
			HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
//			myFriends[numOfFriends++] = high;
			
			/* 기존 인스턴스배열에서는 인덱스를 위한 카운트가 필요했지만 컬렉션에서는 필요하지 않다.
			자동인덱싱이 지원되므로 add()를 통해 추가하기만 하면 된다. */
			lists.add(high);
		} else if(choice == 2) {
			System.out.print("전공:"); iMajor = scan.nextLine();
//			myFriends[numOfFriends++] = new UnivFriend(iName, iPhone, iAddr, iMajor);
			lists.add(new UnivFriend(iName, iPhone, iAddr, iMajor));
		}
		System.out.println("친구정보 입력이 완료되었습니다.");
	}
	
	public void showAllData() {
//		for(int i = 0; i < numOfFriends; i++) {
//			myFriends[i].showAllData();
//		}
		
		for(int i = 0; i < lists.size(); i++) {
			lists.get(i).showAllData();
		}
		System.out.println("==전체정보가 출력되었습니다.==");
	}
	
	public void showSimpleData() {
		
//		for(int i = 0; i < numOfFriends; i++) {
//				myFriends[i].showBasicInfo();
//		}
		
		for(Friend fr : lists) {
			fr.showBasicInfo();
		}
		System.out.println("==간략정보가 출력되었습니다.==");
	}
	
//	public void searchInfo() {
//		boolean isFind = false;
//		Scanner scan = new Scanner(System.in);
//		System.out.print("검색할 이름을 입력하세요:");
//		String searchName = scan.nextLine();
//		
//		// 이터레이터를 통해 검색 기능 구현
//		Iterator<Friend> itr = lists.iterator();
//		
//		// List컬렉션 전체를 대상으로 반복
//		while(itr.hasNext()) {
//			Friend fr = itr.next();
//			if(searchName.compareTo(fr.name) == 0) {
//				fr.showAllData();
//				System.out.println("**귀하가 요청하는 정보를 찾았습니다.**");
//				isFind = true;
//			}
//		}
//		
//		// 초기값을 유지하고 있다면 정보는 없는 경우이다.
//		if(isFind == false)
//			System.out.println("***찾는 정보가 없습니다.***");
//	}
	
	
	
//	public void deleteInfo() {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("삭제할 이름을 입력하세요:");
//		String deleteName = scan.nextLine();
//		
//		// 인덱스는 음수가 없으므로 초기값은 -1로 지정한다.
//		int deleteIndex = -1;
//		for(Friend fr : lists) {
//			if(deleteName.compareTo(fr.name) == 0) {
//				lists.remove(fr);
//				
//				// 삭제가 완료되면 1로 변경
//				deleteIndex = 1;
//				// 삭제한 후 즉시 반복문 탈출
//				break;
//			}
//		}
//	
//		if(deleteIndex == -1) {
//			System.out.println("==삭제된 데이터가 업습니다.==");
//		} else {
//			System.out.println("==데이터가 삭제되었습니다.==");
//		}
//	}
	
	
	/*
	퀴즈1] 검색 기능의 메서드 searchInfo()를 일반 for문을 통해 기능을 구현하시오.
	퀴즈2] 삭제 기능의 메서드 deleteInfo()를 이터레이터를 통해 기능을 구현하시오.
	 */
	public void searchInfo() {
		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요:");
		String searchName = scan.nextLine();
		
		// 일반 for문
		for(int i = 0; i < lists.size(); i++) {
			/* equals()는 Object에서 제공 따라서 문자열, Object 모두 비교 가능.
			compareTo()는 String에서 제공 따라서 문자열만 비교 가능. Object비교 안됨. */
			if(searchName.compareTo(lists.get(i).name) == 0) {
				System.out.println("**귀하가 요청하는 정보를 찾았습니다.**");				
				lists.get(i).showAllData();
				isFind = true;
				break;
			}
		}
		
		// 확장 for문
//		for(Friend fr : lists) {
//			if(searchName.equals(fr.name)) {
//				System.out.println("**귀하가 요청하는 정보를 찾았습니다.**");				
//				fr.showAllData();
//				isFind = true;
//				break;
//			}
//		}
		
		if(isFind == false)
			System.out.println("***찾는 정보가 없습니다.***");
	}
	
	public void deleteInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요:");
		String deleteName = scan.nextLine();
		
		// 인덱스는 음수가 없으므로 초기값은 -1로 지정한다.
		int deleteIndex = -1;
		
		/*
		List컬렉션에 저장된 인스턴스를 기반으로 Iterator인스턴스를 생성한다. 이때 타입매개변수는
		List와 동일하게 정의하면 된다.
		 */
		Iterator<Friend> itr = lists.iterator();
		// 저장된 인스턴스의 개수(컬렉션의 크기)만큼 반복한다.
		while(itr.hasNext()) {
			// 컬렉션에 저장된 참조값을 순서대로 인출한다.
			Friend fr = itr.next();
			if(deleteName.compareTo(fr.name) == 0) {
				lists.remove(fr);
				deleteIndex = 1;
				break;
			}
		}
		
		// 일반 for문
//		for(int i = 0; i < lists.size(); i++) {
//			if(deleteName.compareTo(lists.get(i).name) == 0) {
//				lists.remove(i);
//				deleteIndex = 1;
//				break;
//			}
//		}
		
		if(deleteIndex == -1) {
			System.out.println("==삭제된 데이터가 업습니다.==");
		} else {
			System.out.println("==데이터가 삭제되었습니다.==");
		}
	}
	
	public void saveFriendInfo() {
		try {
			// 직렬화(파일 저장)를 위한 출력스트림을 생성한다.
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream("src/ex20io/friend_info.obj"));
			
			// List 컬렉션에 저장된 친구의 정보의 개수만큼 반복한다.
			for(Friend fr : lists) {
				// 파일에 인스턴스를 하나씩 저장한다.
				out.writeObject(fr);
			}
			
			// 스트림 소멸
			out.close();
			
		}
		catch(FileNotFoundException e) {
			System.out.println("파일 없음");
		}
		catch(IOException e) {
			System.out.println("뭔가 없음");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void readFriendInfo() {
		ObjectInputStream in = null;
		try {
			// 파일을 복원(역직렬화)하기 위해 스트림을 생성한다.
			in = new ObjectInputStream(
					new FileInputStream("src/ex20io/friend_info.obj"));
			
			/*
			파일에 몇개의 정보가 저장되었는지 알 수 없으므로 무한루프로 구성한다.
			 */
			while(true) {
				/*
				직렬화될 때 Object 타입으로 업캐스팅되어 저장되므로 역직렬화할 때는 반드시 다운캐스팅해야 한다.
				 */
				Friend fr = (Friend)in.readObject();
				// List 컬렉션에 정보를 추가한다.
				lists.add(fr);
				/* 더 이상 복원한 정보가 없다면 EOF(End Of File) 예외가 발생하며 while문을 탈출한 후 
				catch절로 이동한다. */
			}
			
		}
		catch(FileNotFoundException e) {
			System.out.println("[예외]Obj파일이 없습니다.");
		}
		catch(EOFException e) {
			System.out.println("[예외]파일의 끝까지 모두 복원했습니다.");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("복원 중 알 수 없는 예외발생");
		}
		finally {
			/* try절에서 예외가 발생하더라도 finally절은 무조건 실행되므로 정상적으로 닫을 수 있다. */
			try {
				in.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
				System.out.println("클로즈 예외 발생");
			}
		}
	}
}
/*
기본이자 + 신용등급별 추가 이자
set으로 중복계좌 제거

프로젝트만들고 깃헙에 바로 올리기

크게 틀을 잡고 하나씩 집어넣으면서 완성시키기

println만 쓰지 말고 가로로도 좀 나오게 만들기
(오른쪽 빈공간이 너무 많아서 보기 안 좋고, 새로로 길게 있으면 가독성 떨어짐)



 */
























