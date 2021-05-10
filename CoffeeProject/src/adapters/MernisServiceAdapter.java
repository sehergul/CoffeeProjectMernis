package adapters;


import java.rmi.RemoteException;

import business.abstracts.CustomerCheckService;
import entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
        KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result=true;
		try {        
			result = client.TCKimlikNoDogrula(customer.getNationalityId(), 
				customer.getFirstName().toUpperCase(),
  				customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
		}catch (RemoteException e) {
          e.printStackTrace();
		}
		System.out.println(result);
		return result;
	
	}
}
