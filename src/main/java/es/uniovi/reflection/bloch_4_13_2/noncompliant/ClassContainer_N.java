package es.uniovi.reflection.bloch_4_13_2.noncompliant;

public class ClassContainer_N {

    // Clase con nivel de acceso Protegido (como clase interna)
    protected static class ProtectedClass {
        public String publicInfo = "a";
        protected String protectedInfo = "a";

        public void publicMethod(){
            System.out.println("print");
        }

        protected void protectedMethod(){
            System.out.println("print");
        }
    }
}
