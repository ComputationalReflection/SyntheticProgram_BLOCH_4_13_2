package es.uniovi.reflection.bloch_4_13_2.compliant;

public class PublicClass {

    // --- CAMPOS PÚBLICOS ---
    public final double version = 1.0;                    // Final, no array
    public static final int MAX_LIMIT = 100;              // Constant (static final), no array
    private int a = new PackagePrivateClass().sharedValue;

    // --- CAMPOS NO PÚBLICOS ---
    protected String[] internalHistory = {};                   // Array, no final, protegido

    // Paquete (default), usado en otra clase
    String sharedMessage = "5";

    private static boolean isInitialized = true;                 // No array, no final, static, privado

    // Corregidos del non-compliant
    private String[] tags = {"A", "B", "B"};
    protected System s = null;
    private static PublicClass pc = new PublicClass();
    protected final int[] idCodes = {101, 102};
    private static final String[] VALID_TYPES = {"A", "B"};

    private int internalCounter = 5;

    public class InternalClass1{
        protected int id = 3;
        private int[] numbers = {};
    }

    // Metodo usado en otra clase
    void packagePrivateMethod(){
        System.out.println("print");
    }

    private void privateMethod(){
        System.out.println("print");
    }

    public void auxMethodToUseProperFieldsAndMethods(){
        if(internalCounter > 4){
            System.out.println(tags[2] + s + VALID_TYPES[0]);
            System.out.println(pc.toString());
            InternalClass1 c1 = new InternalClass1();
            c1.numbers[0] = c1.id;
            c1.id = idCodes[0];
            idCodes[2] = c1.numbers[0];
        }else{
            this.packagePrivateMethod();
            this.privateMethod();
        }
        // Only for compliant fields
        if (isInitialized) {
            internalHistory = new String[MAX_LIMIT];
            System.out.println(version);
            internalHistory[0] = String.valueOf(a);
        }
    }

    public void auxMethodToUseExternalFieldsAndMethods(Priority p, PackagePrivateClass pa){
        String strVarPriority = p.levelName + p.levelWeight;

        int intVarPackagePrivateClass = pa.publicValue - pa.protectedValue;
        pa.protectedMethod();
        pa.publicMethod();
        pa.equals(null);
        pa.toString();

        ClassContainer.ProtectedClass c = new ClassContainer.ProtectedClass();
        System.out.println(c.publicInfo + c.protectedInfo);
        c.protectedMethod();
        c.publicMethod();

        EnumContainer.ProtectedEnum e = EnumContainer.ProtectedEnum.START;
        String strVarEnum = e.label + e.code + "5";
    }
}