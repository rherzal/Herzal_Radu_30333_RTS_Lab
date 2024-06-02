import Interfaces.PlaceHandlerTemplate;
import Interfaces.TransitionTemplate;

public class Supervizor_Transition_t_1 implements TransitionTemplate {
    Integer timeUnitControl = 500;
    Integer eet;
    Integer let;
    String Name;
    PlaceHandlerTemplate PH;
    public Supervizor_Transition_t_1(String name, PlaceHandlerTemplate PH,Integer delay) {
        this.Init(name, PH);
        this.SetDelay(delay);
    }

    public Supervizor_Transition_t_1(String name, PlaceHandlerTemplate PH, Integer eet, Integer let) {
        this.Init(name, PH);
        this.SetDelayInRange(eet, let);
    }

    @Override
    public void Init(String Name, PlaceHandlerTemplate PH) {
        this.PH = PH;
        this.Name = Name;
    }

    @Override
    public void SetDelay(int value) {
        this.eet = value;
    }

    @Override
    public void SetDelayInRange(int eet, int let) {
        this.eet = eet;
        this.let = let;
    }

    @Override
    public void TransitionDelay() {
        try {
            if (this.let == null) {
                Thread.sleep(this.eet * timeUnitControl);
            } else {
                Thread.sleep(Math.round(Math.random() * (this.let - this.eet) + this.eet) * timeUnitControl);
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public Boolean TransitionGuardsMappings() {
        TransitionDelay();
        String toPrint = "--------------Supervizor--------------\n";
        if (PH.GetPlaceByName("ps_i1").IsNull() == false && PH.GetPlaceByName("ps_1").IsNull() == false) {
            if (PH.GetPlaceByName("ps_i1").IsNull() == false) {
                RELList temp = (RELList) PH.GetPlaceByName("ps_1").Get();
                temp.RELs.add((REL) PH.GetPlaceByName("ps_i1").Get());
                PH.GetPlaceByName("ps_1").Set(temp);
                PH.GetPlaceByName("ps_i1").Set(null);
            }
        }
        toPrint = toPrint.concat(Print() + "\n");
        toPrint = toPrint.concat("--------------------------------------\n");
        System.out.println(toPrint);
        return true;
    }

    @Override
    public String Print() {
        return this.Name + "\n" + this.PH.PrintAllPlaces();
    }
}
