
public class student {
	public String name;
	public int stunum;
	public String major;
	public int stuyear;
	public int credit;

	public String getname() {
		return name;
	}

	public int getstunm() {
		return stunum;
	}

	public String getnmajor() {
		return major;
	}

	public int getstuyear() {
		return stuyear;
	}

	public int getcredit() {
		return credit;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setstunum(int stunum) {
		this.stunum = stunum;
	}

	public void setmajor(String major) {
		this.major = major;
	}

	public void setstuyear(int stuyear) {
		this.stuyear = stuyear;
	}

	public void setcredit(int credit) {
		this.credit = credit;
	}

	public student() {
	}

	public student(String name, int stunum, String major, int Stunum, int stuyear, int credit) {
		System.out.println("이름 :" + name + " 학번:" + stunum + " 학과:" + major + " 학년:" + stuyear + " 이수학점:" + credit);
	}

}
