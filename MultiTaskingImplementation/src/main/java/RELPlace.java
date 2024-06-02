import Interfaces.PlaceTemplate;

public class RELPlace implements PlaceTemplate {
    REL value;
    String Name;

    public RELPlace(String name, Object value) {
        this.Init(name, value);
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
        return this.Get() == null;
    }

    @Override
    public void Set(Object value) {
        this.value = (REL) value;
    }

    @Override
    public String Print() {
        return "[" + this.Name + "=" + this.value + "]";
    }

    @Override
    public void Init(String name, Object value) {
        this.Name = name;
        this.value = (REL) value;
    }
}
