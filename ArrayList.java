class List {
    Object[] arr;
    int n;

    public List() {
        arr = new Object[10];
        n = 0;
    }

    public void set(int i, Object x) {
        arr[i] = x;
    }

    public Object get(int i) {
        return arr[i];
    }

    public int size() {
        return n;
    }

    public void add(int i, Object x) {
        if (n == arr.length) {
            expand();
        }

        for (int j = n; j > i; j--) {
            arr[j] = arr[j - 1];
        }
        arr[i] = x;
        n++;
    }

    public void expand() {
        Object[] arr2 = new Object[arr.length * 2];
        for (int i = 0; i < n; i++) {
            arr2[i] = arr[i];
        }
        arr = arr2;
    }

    public Object remove(int i) {
        Object x = arr[i];
        for (int j = i; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }
        n--;
        if (n < arr.length / 3) {
            expand();
        }
        return x;
    }
    public void push(Object x) {
        add(n, x);
    }

    public Object pop() {
        return remove(n - 1);
    }
}
