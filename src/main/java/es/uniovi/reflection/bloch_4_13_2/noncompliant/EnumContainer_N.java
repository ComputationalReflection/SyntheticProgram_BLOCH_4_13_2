package es.uniovi.reflection.bloch_4_13_2.noncompliant;

class EnumContainer_N {
    // Enum protegida (debe ser interna)
    enum ProtectedEnum {
        START, STOP;
        public String label = "a";
        int code = 0;

        protected int getCode(){
            return code;
        }
    }
}
