package sec2;

import java.util.Map;

public class Multi1<K, V> implements Map.Entry<K,V> {     //맵 구조를 가져옴(맵이 아닌 구조다)
    private K key;
    private V value;


    //Key 기본적으로 Set이 없다.
    @Override
    public K getKey()  {       return this.key;    }

    @Override
    public V getValue() {        return this.value;    }

    @Override
    public V setValue(V value) {
        this.value = value;
    return value;    }
}
