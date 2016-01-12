
public class Driver{
		public static void main(String[] args) {	
	Student mystudent = new Student(args[0], args[1], args[2] );
			for (int i = 0; i < 10 ;  i++){
				Display.showStudentInfo(mystudent);
				//mystudent[] = new Student();
			}
	  }
}