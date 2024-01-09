package ex08class;

class ChildProperty {
	int beads;

	// 생성자는 외부에서 호출해야 하므로 반드시 public으로 지정한다.
	public ChildProperty(int a) {
		beads = a;
	}

	void showProperty() {
		System.out.println("보유 구슬의 개수 " + beads);
	}

	void obtainBead(ChildProperty child, int a) {
		this.beads += a;
		child.beads -= a;
	}
}

public class QuMarbles {

	public static void main(String[] args) {
		ChildProperty child1 = new ChildProperty(20);
		ChildProperty child2 = new ChildProperty(15);

		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty();
		System.out.print("어린이2 : ");
		child2.showProperty();

		/* 1차게임 : 어린이1은 어린이2의 구슬 5개 획득 */
		child1.obtainBead(child2, 5);

		/* 2차게임 : 어린이2가 어린이1의 구슬 9개 획득 */
		child2.obtainBead(child1, 9);

		System.out.println("\n게임 후 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty();
		System.out.print("어린이2 : ");
		child2.showProperty();
	}
}
