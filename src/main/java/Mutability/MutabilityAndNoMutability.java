package Mutability;

public class MutabilityAndNoMutability {

    int mx = 0;

    Integer my = 0;

    int mx2 = mx;
    Integer my2 = my;

    public void change(){
        int x = 0;
        Integer y =0;

        int xx = x;
        Integer yy = y;

        x = 1;
        y = 1;
        System.out.println("From Change " + xx+" "+ yy);
        x = rI(x);
        System.out.println("after rI: "+x);

        System.out.println("From Change 2 " + xx+" "+ yy);

    }

    public Integer rI(Integer i){
        System.out.println("from rI before i = 2 "+i);
        i = 2;
        System.out.println("from rI after i = 2 "+i);
        return i;
    }

    MutableObject mo = new MutableObject();

    public Integer getMy(){
        return my;
    }

    public Integer changeMyAndthisMy(Integer my){
        System.out.println("my argument" + my);
        System.out.println("my this.my" + this.my);

        System.out.println("my +1 argument" + (my+1));
        System.out.println("my +2 this.my" + " " +(this.my+2));


        return my;

    }

    public void newMutableObject(){
        mo = new MutableObject();
    }






}
