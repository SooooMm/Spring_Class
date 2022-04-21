package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class TestBean1 {
	
	@Autowired
	private DataBean1 data1;
	
	@Autowired //자동으로 setter 생성
	private DataBean2 data2;
	
	//bean의 이름을 obj3으로 지정해서 data1,data2,data3
	
	@Autowired
	@Qualifier("obj3") //이름이 obj3인 객체를 가지고 와서 주입해라
	private DataBean3 data3;
	
	public DataBean1 getData1() {
		return data1;
	}
	
	public DataBean2 getData2() {
		return data2;
	}

	public DataBean3 getData3() {
		return data3;
	}

	
	
	
	
	
}
