import java.io.Serializable;
import java.util.ArrayList;

public class RELList implements Cloneable, Serializable {

    public ArrayList<REL> RELs = new ArrayList<REL>();
    public Integer Size = 5;



    public RELList clone() throws CloneNotSupportedException {
        return (RELList) super.clone();
    }

    public RELList() {

    }

    public boolean AddREL(REL rel) {
        RELs.add(rel);
        return true;
    }

    public boolean CanAddREL() {
        if (RELs.size() < Size) {
            return true;
        }
        return false;
    }

    public REL PopREL() {
        if (this.RELs.size() > 0) {
            REL temp = this.RELs.get(this.RELs.size() - 1);
            this.RELs.remove(this.RELs.get(this.RELs.size() - 1));
            return temp;
        }
        return null;
    }
    public REL GetFirstREL() {
        Integer index = -1;
        for (int i = 0; i < RELs.size(); i++) {
            if (RELs.get(i) != null && RELs.get(i) != null) {
                index = i;
                break;
            }
        }

        if (index == -1)
            return null;
        if (RELs.get(index) != null) {
            try {
                REL temp = (REL) RELs.get(index).clone();
                return temp;

            } catch (CloneNotSupportedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return null;
    }

    public String toString() {
        ArrayList<String> temp1 = new ArrayList<String>();
        for (REL rel : RELs) {
            if (rel == null)
                temp1.add("NULL");
            else
                temp1.add(rel.toString());
        }

        return "(" + String.join(",", temp1) + ")";
    }

}
