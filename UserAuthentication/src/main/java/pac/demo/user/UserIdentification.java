package pac.demo.user;

public class UserIdentification {
	public boolean verify(User ref) {

		Connectivity connectRef = new DatabaseConnectivity();
		return connectRef.isValid(ref);
	}
}
