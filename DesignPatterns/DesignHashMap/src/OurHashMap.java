public class OurHashMap<K,V> {

    private static final Integer INITIAL_SIZE = 1<<4;

    private static  final Integer MAX_SIZE = 1<<30;

    Entry[] table;


    class Entry<K,V> {
        K key;
        V value;
        Entry nextEntry;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Entry getNextEntry() {
            return nextEntry;
        }

        public void setNextEntry(Entry nextEntry) {
            this.nextEntry = nextEntry;
        }
    }

    public OurHashMap() {
        this.table = new Entry[INITIAL_SIZE];
    }

    public OurHashMap(int cap) {
        int nearestTwoSize = getNearestCapacity(cap);
        System.out.println("Max cap is "+nearestTwoSize);
        this.table = new Entry[nearestTwoSize];
    }

    private int getNearestCapacity(int n) {
        n = n-1;
        n |= n>>1;
        n |= n>>2;
        n |= n>>4;
        n |= n>>8;
        n |= n>>16;
        return n<0 ? 1: (n==MAX_SIZE? MAX_SIZE: n+1);
    }

    public void put(K key, V value){
        int hash = key.hashCode() % table.length;
        Entry<K,V> node = table[hash];

        Entry<K,V> newNode = new Entry<>(key, value);

        if (node==null) {
            table[hash] = newNode;
        } else {
            Entry<K,V> currNode = node;
            Entry<K,V> previousNode = null;

            while (currNode!=null){
                if (currNode.getKey()==key){
                    currNode.setValue(value);
                    return;
                }
                previousNode = currNode;
                currNode = currNode.getNextEntry();
            }
            previousNode.setNextEntry(newNode);
        }
    }

    public V get(K key){
        int hash = key.hashCode() % table.length;
        Entry<K,V> node = table[hash];

        if (node==null) {
            return null;
        } else {
            Entry<K,V> currNode = node;

            while (currNode!=null){
                if (currNode.getKey()==key){
                    return currNode.getValue();
                }
                currNode = currNode.getNextEntry();
            }
        }
        return null;
    }


    public static void main(String[] args) {
        OurHashMap<Integer, String> map = new OurHashMap<>(1023);

        map.put(1, "hi");
        map.put(2, "my");
        map.put(3, "name");
        map.put(4, "is");
        map.put(5, "chetan");
        map.put(6, "how");
        map.put(7, "are");
        map.put(8, "you");
        map.put(9, "friends");
        map.put(10, "?");

        String value = map.get(8);
        System.out.println(value);


    }




}
