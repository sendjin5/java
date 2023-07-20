package sec2;

public class Multi2<T, M> {
    private T name;
    private M age;

    public Multi2() {}          //no agument

    public Multi2(T name, M age) {      //all agument
        this.name = name;
        this.age = age;
    }

    public T getName() {     return name;    }

    public void setName(T name) {        this.name = name;    }

    public M getAge() {     return age;    }

    public void setAge(M age) {        this.age = age;    }


    //Generic Method
    public static<T,V> boolean compare(Multi2<T, V> m1, Multi2<T,V> m2){
        boolean nameCompare = m1.getName().equals(m2.getName());
        boolean ageCompare = m1.getAge().equals(m2.getAge());
        /*boolean pass = nameCompare && ageCompare;
        return pass;          도 가능*/
        return nameCompare && ageCompare;


    }



}
