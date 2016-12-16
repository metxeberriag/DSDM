package politicianBiDsl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import politicianBiDsl.pBiDsl.City;
import politicianBiDsl.pBiDsl.PBiDslFactory;
import politicianBiDsl.pBiDsl.Party;

@SuppressWarnings("all")
public class PBiDslModelUtil {
  public static Party addPartyOnACity(final City city, final String nameOfPartyToAdd) {
    Party _xblockexpression = null;
    {
      EObject _eContainer = city.eContainer();
      final City model = ((City) _eContainer);
      Party _createParty = PBiDslFactory.eINSTANCE.createParty();
      final Procedure1<Party> _function = new Procedure1<Party>() {
        public void apply(final Party it) {
          it.setName(nameOfPartyToAdd);
          EList<Party> _parties = model.getParties();
          EList<Party> _parties_1 = model.getParties();
          int _indexOf = _parties_1.indexOf(city);
          int _plus = (_indexOf + 1);
          _parties.add(_plus, it);
        }
      };
      _xblockexpression = ObjectExtensions.<Party>operator_doubleArrow(_createParty, _function);
    }
    return _xblockexpression;
  }
}
