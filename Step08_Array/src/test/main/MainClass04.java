package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Enemy;
import test.mypac.Missile;

public class MainClass04 {

	// 다중for문 모든 객체를 한번씩 만나게 해주는것.
	public static void main(String[] args) {
		// 미사일 객체를 담을 가변 배열 객체 생성
		List<Missile> mList = new ArrayList<>();
		// 적기 객체를 담을 가변 배열 객체 생성
		List<Enemy> eList = new ArrayList<>();

		// 미사일 객체 3개 담기
		mList.add(new Missile(100, 100));
		mList.add(new Missile(200, 200));
		mList.add(new Missile(300, 300));

		// 적기 기체 3개 담기
		eList.add(new Enemy(110, 110));
		eList.add(new Enemy(10, 20));
		eList.add(new Enemy(10, 40));

		for (int i = 0; i < mList.size(); i++) {
			// i번째 미사일 객체의 참조값 얻어오기
			Missile m = mList.get(i);

			for (int j = 0; j < eList.size(); j++) {
				// j번째 적기 객체의 참조값 얻어오기
				Enemy e = eList.get(j);
				// m객체와 e객체 비교하기
				boolean isShooted = m.x > e.x - 50 && m.x < e.x + 50 && m.y > e.y - 50 && m.y < e.y + 50; // 모두
																											// true일떄
																											// true

				if (isShooted) {
					System.out.println(i + "번째 미사일은" + j + "번째 적기를 격추했습니다.");
				}
			}

		}

	}

}
