package Business;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManager implements GamerCheckService {
    @Override
    public boolean checkIfRealPerson(Gamer gamer) {
    	final KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstName(),
					gamer.getLastName(), gamer.getYearOfBith());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
    }
}
