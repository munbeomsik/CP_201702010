
public class homework2 {
	public static void main(String[] args) {
		student mystu = new student();
		mystu.setname("������");
		mystu.setmajor("��ǻ�Ͱ��а�");
		mystu.setstunum(17);
		mystu.setcredit(18);
		mystu.setstuyear(1);
		System.out.print(" �̸�: " + mystu.getname());
		System.out.print(" ����: " + mystu.getnmajor());
		System.out.print(" �й�: " + mystu.getstunm());
		System.out.print(" ����: " + mystu.getcredit());
		System.out.print(" �г�: " + mystu.getstuyear());
		System.out.println();

		undergraduate mystu2 = new undergraduate();
		mystu2.setname("������");
		mystu2.setmajor("��ǻ�Ͱ��а�");
		mystu2.setstunum(17);
		mystu2.setcredit(18);
		mystu2.setstuyear(1);
		mystu2.setclubname("ProBrain");
		System.out.print(" �̸�: " + mystu2.getname());
		System.out.print(" ����: " + mystu2.getnmajor());
		System.out.print(" �й�: " + mystu2.getstunm());
		System.out.print(" ����: " + mystu2.getcredit());
		System.out.print(" �г�: " + mystu2.getstuyear());
		System.out.print(" ���Ƹ� : " + mystu2.getclubname());
		System.out.println();

		graduate mystu3 = new graduate();
		mystu3.setname("������");
		mystu3.setmajor("��ǻ�Ͱ��а�");
		mystu3.setstunum(17);
		mystu3.setcredit(18);
		mystu3.setstuyear(1);
		mystu3.setassistant("����");
		mystu3.setschoolship(0.5);
		System.out.print(" �̸�: " + mystu3.getname());
		System.out.print(" ����: " + mystu3.getnmajor());
		System.out.print(" �й�: " + mystu3.getstunm());
		System.out.print(" ����: " + mystu3.getcredit());
		System.out.print(" �г�: " + mystu3.getstuyear());
		System.out.print(" ���� : " + mystu3.getassistant());
		System.out.print(" ���б�: " + mystu3.getschoolship());
	}

}
