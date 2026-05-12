package es.uniovi.reflection.bloch_4_13_2.compliant;

class EnumContainer {
    // Enum protegida (debe ser interna)
    enum ProtectedEnum {
        START, STOP;
        String label = "a";
        int code = 0;
    }
}
