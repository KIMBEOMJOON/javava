package test.fruit;

public class FruitBox<T> {
	//generic class type�� ����ʵ��� type���� �����Ѵ�.
	private T fruit;
	//generic class type�� �����ڷ� ���޵Ǵ� type���� �����Ѵ�.
	public FruitBox(T fruit){
		this.fruit=fruit;
	}
	//���� type�� generic class type���� �����Ѵ�.
	public T getFruit(){
		return fruit;
	}

}
