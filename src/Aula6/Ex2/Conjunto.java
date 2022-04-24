package Aula6.Ex2;

public class Conjunto {
    private int[] num = new int[0];

    public void insert(int n) {
        if (!contains(n)) {
            int[] aux = new int[num.length + 1];
            for(int i = 0; i < num.length; i++) { aux[i] = num[i]; }
            aux[aux.length - 1] = n;
            num = aux;
        }
    }

    public void remove(int n) {
        if(contains(n)) {
            int j = 0;
            int[] aux = new int[num.length - 1];
            for(int i = 0; i < num.length; i++) {
                if(num[i] != n) {
                    aux[j] = num[i];
                    j++;
                }
            }
            num = aux;
        }
    }

    public void empty() { num = new int[0]; }

    public String toString() { 
        String str = "";
        for(int n : num) str += n + " ";
        return str;
    }

    public int size() { return num.length; }

    public Conjunto combine(Conjunto add) {
        Conjunto res = new Conjunto();
        int j = 0;
        for(int i = 0; i < num.length; i++) {
            res.insert(num[i]);
            if(!add.contains(num[i])) {
                res.insert(add.num[j]);
                j++;
            }
        }
        return res;
    }

    public Conjunto subtract(Conjunto dif) {
        Conjunto res = new Conjunto();
        for(int i = 0; i < num.length; i++) if(!dif.contains(num[i])) res.insert(num[i]);
        return res;
    }

    public Conjunto intersect(Conjunto inter) {
        Conjunto res = new Conjunto();
        for(int i = 0; i < num.length; i++) if(inter.contains(num[i])) res.insert(num[i]);
        return res;
    }

    public boolean contains(int n) {
        for(int i = 0; i < num.length; i++) if(n == num[i]) return true;
        return false;
    }
}
