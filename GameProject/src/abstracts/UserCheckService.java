package abstracts;

import Entities.User;

public interface UserCheckService {
	boolean checkIfRealPerson(User user);
}
