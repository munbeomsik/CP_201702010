
public class graduate extends student {
	public graduate(String name, int stunum, String major, int stuyear, int credit, String assistant,
			double scholarship) {
	}

	public graduate() {
	}

	public String assistant;
	public double schoolship;

	public String getassistant() {
		return assistant;
	}

	public double getschoolship() {
		return schoolship;
	}

	public void setassistant(String assistant) {
		this.assistant = assistant;

	}

	public void setschoolship(double schoolship) {
		if (0 <= schoolship && schoolship <= 1) {
			this.schoolship = schoolship;
		}
	}

}
