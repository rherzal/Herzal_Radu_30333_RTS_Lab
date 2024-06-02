import java.util.Scanner;

public class Supervizor extends Thread{
    boolean stop = false;
    public Controller controller;
    PlaceHandler PH = new PlaceHandler();

    Supervizor_Transition_t_1 t_1;
    Supervizor_Transition_t_2 t_2;
    Supervizor_Transition_t_3 t_3;

    Scanner in = new Scanner(System.in);

    public void run() {
        RELList relList = new RELList();
        relList.RELs.add(new REL(1, 2, 3));
        relList.RELs.add(new REL(4, 3, 6));
        relList.RELs.add(new REL(1, 1, 2));

        PH.AddPlace(new RELPlace("ps_i1", new REL(1, 4, 6)));
        PH.AddPlace(new RELListPlace("ps_1", relList));
        PH.AddPlace(new IntPlace("ps_2", 0));
        PH.AddPlace(new IntPlace("ps_2", 0));
        PH.AddPlace(new IntPlace("ps_3", 0));
        PH.AddPlace(new IntPlace("ps_o2", null));
        PH.AddPlace(new IntPlace("ps_i2", null));
        t_1 = new Supervizor_Transition_t_1("ts_1",PH,0);
        t_2 = new Supervizor_Transition_t_2("ts_3", PH, 0);
        t_3 = new Supervizor_Transition_t_3("ts_2", PH, 0);
        t_2.ControllerPH = controller.PH;
        while (!stop) {

            t_1.TransitionGuardsMappings();
            t_2.TransitionGuardsMappings();
            t_3.TransitionGuardsMappings();

            // For slower printing on the console
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }




    }
    public void StopThread() {
        this.stop = true;
    }


}
