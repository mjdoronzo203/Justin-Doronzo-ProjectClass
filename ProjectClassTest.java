public class ProjectClassTest {
	
	public static void main(String[] args) {

		ProjectClass project1 = new ProjectClass();
		ProjectClass project2 = new ProjectClass();
		ProjectClass project3 = new ProjectClass();

		project1.project();
		project2.project("New House");
		project3.project("New Restaurant", "Best seafood in town!");

		String name2 = project2.getName();
		System.out.println(name2);

		project1.setName("New Arena");
		String name1 = project1.getName();
		project1.setDescription("Coliseum of gladiators!");
		String desc1 = project1.getDescription();
		System.out.println(name1 + " " + desc1);

		String pitch3 = project3.elevatorPitch();
		System.out.println(pitch3);
	}
}