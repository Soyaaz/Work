
public class App {
	public static void main (String args[]) {
		
		TreeStudent run = new TreeStudent();
		
		run.insert(01, "Ace", "Ge001", "B");
		run.insert(02, "Bee", "Ge002", "C");
		
		run.Display(run.getRoot());
		System.out.println("__________________");
		
		run.UpdateGrade(01, "B+");
		System.out.println("If you upgrade");
		run.Display(run.getRoot());
		System.out.println("__________________");
		run.delete(02);
		System.out.println("If you  Delete");
		run.Display(run.getRoot());
	}

}