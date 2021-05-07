package concretes;

import Entities.User;
import abstracts.UserCheckService;
import abstracts.UserService;

public class UserManager implements UserService{

	private UserCheckService userCheckService;
	
	public UserManager ( UserCheckService userCheckService) {
		
		this.userCheckService = userCheckService;
	}
	@Override
	
	public void add(User user) {
		boolean result = userCheckService.checkIfRealPerson(user);
		if (!result) {
			System.out.println("Mernis Dogrulama Basarisiz!");
			return;
		}
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Isimli Kullanci Sisteme Eklendi.");
	}
	

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Isimli Kullanci Bilgileri Guncellendi.");
		
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Isimli Kullanci Bilgileri Sistemden Silindi.");
		
		
	}

}
