class Pila {
    private Nodo cima;

    public Pila() {
        this.cima = null;
    }

    public void push(char c) {
        Nodo nuevo = new Nodo(c);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public char pop() {
        if (cima == null) {
            throw new RuntimeException("Pila vacía");
        }
        char valor = cima.dato;
        cima = cima.siguiente;
        return valor;
    }

    public boolean isEmpty() {
        return cima == null;
    }
}