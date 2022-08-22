class OT {
    public void marry() {
        System.out.println("SUBU");
    }

    public void property() {
        System.out.println("120 Acres");
    }
}

class OT2 extends OT {
    public void marry() {
        System.out.println("Katrina");
    }
}

public class OverrideTest {
    public static void main(String... args) {
        OT ot = new OT();
        ot.marry();

        OT2 ot2 = new OT2();
        ot2.marry();

        OT oo = new OT2();
        oo.marry();
    }
}
