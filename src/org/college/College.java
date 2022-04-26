package org.college;

public class College {
	public void collegeName() {
		System.out.println("The name of the college is Greens");
		}
		public void collegeCode() {
		System.out.println("The college code is 1122");
		}
		public void collegeRank() {
		System.out.println("The rank of college is 12");
		}
		public static void main(String[] args) {
			College c = new College();
			c.collegeName();
			c.collegeCode();
			c.collegeRank();
		}
}
