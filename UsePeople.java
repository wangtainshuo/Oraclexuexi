package cn.ocl.user;


import cn.ocl.bean.*;


public class UsePeople {

	public static void main(String[] args) {
//		Feeding(new Officials());
//		amuse(new Officials());
		
		pPlay(new Student());
		pPlay(new Officials());
		pPlay(new Boss());
		
		
	}
//	public static void Feeding(People a) {
//		a.eat();
//	}
//	public static void amuse(People b) {
//		b.play();
//	}
//	INSTANCEOF
	//学生边学边养
	//挣钱养宠物
	//
	public static void pPlay(People p) {
		p.play();
		if (p instanceof Student) {
			Student stu = (Student) p;
			stu.feedingMethod();
		} else if(p instanceof Boss){
			Boss B = (Boss) p;
			B.feedingMethod();
		}else if(p instanceof Officials){
			Officials of = (Officials) p;
			of.feedingMethod();
		}

	}

}
