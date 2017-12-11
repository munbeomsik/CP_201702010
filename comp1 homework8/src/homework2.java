
public class homework2 {
	public static void main(String[] args) {
		student mystu = new student();
		mystu.setname("문범식");
		mystu.setmajor("컴퓨터공학과");
		mystu.setstunum(17);
		mystu.setcredit(18);
		mystu.setstuyear(1);
		System.out.print(" 이름: " + mystu.getname());
		System.out.print(" 전공: " + mystu.getnmajor());
		System.out.print(" 학번: " + mystu.getstunm());
		System.out.print(" 학점: " + mystu.getcredit());
		System.out.print(" 학년: " + mystu.getstuyear());
		System.out.println();

		undergraduate mystu2 = new undergraduate();
		mystu2.setname("문범식");
		mystu2.setmajor("컴퓨터공학과");
		mystu2.setstunum(17);
		mystu2.setcredit(18);
		mystu2.setstuyear(1);
		mystu2.setclubname("ProBrain");
		System.out.print(" 이름: " + mystu2.getname());
		System.out.print(" 전공: " + mystu2.getnmajor());
		System.out.print(" 학번: " + mystu2.getstunm());
		System.out.print(" 학점: " + mystu2.getcredit());
		System.out.print(" 학년: " + mystu2.getstuyear());
		System.out.print(" 동아리 : " + mystu2.getclubname());
		System.out.println();

		graduate mystu3 = new graduate();
		mystu3.setname("문범식");
		mystu3.setmajor("컴퓨터공학과");
		mystu3.setstunum(17);
		mystu3.setcredit(18);
		mystu3.setstuyear(1);
		mystu3.setassistant("연구");
		mystu3.setschoolship(0.5);
		System.out.print(" 이름: " + mystu3.getname());
		System.out.print(" 전공: " + mystu3.getnmajor());
		System.out.print(" 학번: " + mystu3.getstunm());
		System.out.print(" 학점: " + mystu3.getcredit());
		System.out.print(" 학년: " + mystu3.getstuyear());
		System.out.print(" 조교 : " + mystu3.getassistant());
		System.out.print(" 장학금: " + mystu3.getschoolship());
	}

}
