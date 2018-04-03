package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Enemy;
import test.mypac.Missile;

public class MainClass04 {

	// ����for�� ��� ��ü�� �ѹ��� ������ ���ִ°�.
	public static void main(String[] args) {
		// �̻��� ��ü�� ���� ���� �迭 ��ü ����
		List<Missile> mList = new ArrayList<>();
		// ���� ��ü�� ���� ���� �迭 ��ü ����
		List<Enemy> eList = new ArrayList<>();

		// �̻��� ��ü 3�� ���
		mList.add(new Missile(100, 100));
		mList.add(new Missile(200, 200));
		mList.add(new Missile(300, 300));

		// ���� ��ü 3�� ���
		eList.add(new Enemy(110, 110));
		eList.add(new Enemy(10, 20));
		eList.add(new Enemy(10, 40));

		for (int i = 0; i < mList.size(); i++) {
			// i��° �̻��� ��ü�� ������ ������
			Missile m = mList.get(i);

			for (int j = 0; j < eList.size(); j++) {
				// j��° ���� ��ü�� ������ ������
				Enemy e = eList.get(j);
				// m��ü�� e��ü ���ϱ�
				boolean isShooted = m.x > e.x - 50 && m.x < e.x + 50 && m.y > e.y - 50 && m.y < e.y + 50; // ���
																											// true�ϋ�
																											// true

				if (isShooted) {
					System.out.println(i + "��° �̻�����" + j + "��° ���⸦ �����߽��ϴ�.");
				}
			}

		}

	}

}
