import Interfaces.PlaceHandlerTemplate;
import Interfaces.TransitionTemplate;

public class Supervizor_Transition_t_2 implements TransitionTemplate {
    Integer timeUnitControl = 500;
    Integer eet;
    Integer let;
    String Name;
    PlaceHandlerTemplate PH;
    PlaceHandlerTemplate ControllerPH;

    public Supervizor_Transition_t_2( String name, PlaceHandlerTemplate PH,Integer delay) {
        this.Init(name, PH);
        this.SetDelay(delay);
    }

    public Supervizor_Transition_t_2( String name, PlaceHandlerTemplate PH,Integer eet, Integer let) {
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
        Integer r = null;
        RELList tempList = (RELList) this.PH.GetPlaceByName("ps_1").Get();
        if (tempList.RELs.size() > 0) {
            r = tempList.RELs.get(tempList.RELs.size() - 1).R;
        } else {
            return false;
        }

        if (PH.GetPlaceByName("ps_1").IsNull() == false && PH.GetPlaceByName("ps_2").IsNull() == false && r != (Integer) (PH.GetPlaceByName("ps_2").Get())) {
            toPrint = toPrint.concat(Print() + "\n");
            this.SetDelay(tempList.RELs.get(tempList.RELs.size() - 1).E);
            PH.GetPlaceByName("ps_3").Set(tempList.RELs.get(tempList.RELs.size() - 1).E);
            tempList.RELs.remove(tempList.RELs.get(tempList.RELs.size() - 1));
            PH.GetPlaceByName("ps_1").Set(tempList);
            ControllerPH.GetPlaceByName("p_i1").Set(r);

            toPrint = toPrint.concat(Print() + "\n");
            toPrint = toPrint.concat("--------------------------------------\n");

            System.out.println(toPrint);
            return true;
        }

        return false;

    }

    @Override
    public String Print() {
        return this.Name + "\n" + this.PH.PrintAllPlaces();
    }
}
