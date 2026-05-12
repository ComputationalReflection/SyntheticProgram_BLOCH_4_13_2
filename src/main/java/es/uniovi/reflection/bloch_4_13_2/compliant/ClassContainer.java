package es.uniovi.reflection.bloch_4_13_2.compliant;

public class ClassContainer {

    // Clase con nivel de acceso Protegido (como clase interna)
    protected static class ProtectedClass {
        String publicInfo = "a";
        String protectedInfo = "a";

        void publicMethod(){
            System.out.println("print");
        }

        void protectedMethod(){
            System.out.println("print");
        }
    }
}
