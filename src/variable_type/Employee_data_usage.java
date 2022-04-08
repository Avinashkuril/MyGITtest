package variable_type;

public class Employee_data_usage {

	public static void main(String[] args) {
		Employee_info Player= new Employee_info();
		Player.Player_name="Avinash";
		Player.Player_no=17;
		Player.Player_grade='A';
		Player.Player_position="Defensive Midfilder";
		Player.Player_salary=120000.00f;
		Player.Player_info();
		
		Employee_info Player2= new Employee_info();
		Player2.Player_name="Komal";
		Player2.Player_no=23;
		Player2.Player_grade='A';
		Player2.Player_position="Attakcer";
				Player2.Player_info();
	}

}
