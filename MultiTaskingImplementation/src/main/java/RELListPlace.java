import Interfaces.PlaceTemplate;

import javax.xml.soap.Name;

public class RELListPlace implements PlaceTemplate {
    String Name;
    RELList value;

    public RELListPlace(String name, RELList value) {
        this.Name = name;
        this.value = value;
    }
    @Override
    public String GetPlaceName() {
        return this.Name;
    }

    @Override
    public void SetPlaceName(String name) {
        this.Name = name;
    }

    @Override
    public Object Get() {
        return this.value;
    }

    @Override
    public Boolean IsNull() {
        return this.value == null;
    }

    @Override
    public void Set(Object value) {
        this.value = (RELList) value;
    }

    @Override
    public String Print() {
        return "[" + this.Name + "=" + this.value + "]";
    }

    @Override
    public void Init(String name, Object value) {
        this.SetPlaceName(name);
        this.Set(value);
    }
}
