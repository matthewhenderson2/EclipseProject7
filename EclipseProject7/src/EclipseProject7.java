/*
 * Matt Henderson
 * COP 3330 01Z
 * Eclipse Project 7
*/

class Class1 {
	public static void printClass1() {
		System.out.println("This line is from Class1");
	}
}

public class EclipseProject7 {
	String language;
	int projectNum;
	
	public EclipseProject7(String language, int projectNum) {
		this.language = language;
		this.projectNum = projectNum;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public int getProjectNum() {
		return projectNum;
	}
	
	@Override
    public String toString() 
    { 
        return("This Eclipse Project is written in "+ this.getLanguage()+ " and is project number "+ this.getProjectNum());
    } 
	
	public static void main(String[] args) {
		EclipseProject7 gitProject = new EclipseProject7("Java", 7);
		System.out.println(gitProject.toString());
		Class1.printClass1();
	}
}