package test.fruit;

public class FruitBox<T> {
	//generic class type을 멤버필드의 type으로 설정한다.
	private T fruit;
	//generic class type을 생성자로 전달되는 type으로 설정한다.
	public FruitBox(T fruit){
		this.fruit=fruit;
	}
	//리턴 type을 generic class type으로 설정한다.
	public T getFruit(){
		return fruit;
	}

}
