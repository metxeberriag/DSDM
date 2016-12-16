package politicianBiDsl.generator;

import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import politicianBiDsl.pBiDsl.City;
import politicianBiDsl.pBiDsl.Party;
import politicianBiDsl.pBiDsl.Politician;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class PBiDslGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    CharSequence _compile = this.compile(resource);
    fsa.generateFile("politicians.txt", _compile);
  }
  
  public City getCity(final Resource r) {
    TreeIterator<EObject> _allContents = r.getAllContents();
    List<EObject> _list = IteratorExtensions.<EObject>toList(_allContents);
    Iterable<City> _filter = Iterables.<City>filter(_list, City.class);
    return IterableExtensions.<City>head(_filter);
  }
  
  public Iterable<Party> getParties(final Resource r) {
    TreeIterator<EObject> _allContents = r.getAllContents();
    List<EObject> _list = IteratorExtensions.<EObject>toList(_allContents);
    return Iterables.<Party>filter(_list, Party.class);
  }
  
  public CharSequence compile(final Resource resource) {
    StringConcatenation _builder = new StringConcatenation();
    City _city = this.getCity(resource);
    String _name = _city.getName();
    _builder.append(_name, "");
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("Independents ->");
    {
      City _city_1 = this.getCity(resource);
      EList<Politician> _indeps = _city_1.getIndeps();
      boolean _hasElements = false;
      for(final Politician i : _indeps) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "\t");
        }
        _builder.append(" ");
        String _name_1 = i.getName();
        _builder.append(_name_1, "\t");
        _builder.append(" (");
        int _age = i.getAge();
        _builder.append(_age, "\t");
        _builder.append(") ");
      }
    }
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    {
      Iterable<Party> _parties = this.getParties(resource);
      for(final Party p : _parties) {
        _builder.append("\t");
        String _acronym = p.getAcronym();
        _builder.append(_acronym, "\t");
        _builder.append(" (");
        String _name_2 = p.getName();
        _builder.append(_name_2, "\t");
        _builder.append(") ->");
        {
          EList<Politician> _pols = p.getPols();
          boolean _hasElements_1 = false;
          for(final Politician pol : _pols) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "\t");
            }
            _builder.append(" ");
            String _name_3 = pol.getName();
            _builder.append(_name_3, "\t");
            _builder.append(" (");
            int _age_1 = pol.getAge();
            _builder.append(_age_1, "\t");
            _builder.append(") ");
          }
        }
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
