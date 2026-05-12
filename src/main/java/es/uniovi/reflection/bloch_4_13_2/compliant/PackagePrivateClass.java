package es.uniovi.reflection.bloch_4_13_2.compliant;

class PackagePrivateClass {
    int publicValue = 99;
    int protectedValue = -1;

    int sharedValue;

    void printPublicClassField(PublicClass pc){
        System.out.println("Info: " + pc.sharedMessage);
        pc.packagePrivateMethod();
    }

    void publicMethod(){
        System.out.println("print");
    }

    void protectedMethod(){
        System.out.println("print");
    }

    public String toString(){
        return "my class";
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        return false;
    }
}