package es.uniovi.reflection.bloch_4_13_2.noncompliant;

public class PublicClass_N {

    // --- CAMPOS PÚBLICOS ---
    public String[] tags = {"A", "B", "B"};                                 // Array, no final
    public System s = null;                                     // No array, no final, no static
    public static PublicClass_N pc = new PublicClass_N();                        // No array, no final, static
    public final int[] idCodes = {101, 102};              // Final, array
    public static final String[] VALID_TYPES = {"A", "B"}; // Constant (static final), array

    // --- CAMPOS NO PÚBLICOS ---
    // Paquete (default), no usado fuera de esta clase
    int internalCounter = 5;

    public class InternalClass1{
        public int id = 3;
        public int[] numbers = {};
    }

    // Metodo no usado en otra clase
    void packagePrivateMethod(){
        System.out.println("print");
    }

    public void auxMethodToUseFieldsAndMethods(){
        if(internalCounter > 4){
            System.out.println(tags[2] + s + VALID_TYPES[0]);
            System.out.println(pc.toString());
            InternalClass1 c1 = new InternalClass1();
            c1.numbers[0] = c1.id;
            c1.id = idCodes[0];
            idCodes[2] = c1.numbers[0];
        }else{
            this.packagePrivateMethod();
        }
    }

    public void auxMethodToUseExternalFieldsAndMethods(Priority_N p, PackagePrivateClass_N pa){
        String strVarPriority = p.levelName + p.levelWeight;

        int intVarPackagePrivateClass = pa.publicValue - pa.protectedValue;
        pa.protectedMethod();
        pa.publicMethod();
        pa.equals(null);
        pa.toString();

        ClassContainer_N.ProtectedClass c = new ClassContainer_N.ProtectedClass();
        System.out.println(c.publicInfo + c.protectedInfo);
        c.protectedMethod();
        c.publicMethod();

        EnumContainer_N.ProtectedEnum e = EnumContainer_N.ProtectedEnum.START;
        String strVarEnum = e.label + "5";
    }
}