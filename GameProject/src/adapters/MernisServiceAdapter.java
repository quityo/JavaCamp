package adapters;

import java.rmi.RemoteException;

import Entities.User;
import abstracts.UserCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {
	public boolean checkIfRealPerson(User user) {

		

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

		try {
			return client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityIdentity()), user.getFirstName().toUpperCase(),
					user.getLastName().toUpperCase(), user.getDateOfBirth().getYear());

		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return false;
	}

	
}
