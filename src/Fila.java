public class Fila {
    private Node frente;
    private Node tras;

    public Fila() {
        this.frente = null;
        this.tras = null;
    }

    public boolean estaVazia() {
        return frente == null;
    }

    public void enfileirar(Elemento elemento) {
        Node novoNode = new Node(elemento);
        if (estaVazia()) {
            frente = novoNode;
            tras = novoNode;
        } else {
            tras.proximo = novoNode;
            tras = novoNode;
        }
    }

    public Elemento desenfileirar() throws Exception {
        if (estaVazia()) {
            throw new Exception("A fila está vazia!");
        }
        Elemento elemento = frente.elemento;
        frente = frente.proximo;
        if (frente == null) {
            tras = null;
        }
        return elemento;
    }

    public void exibirFila() {
        Node atual = frente;
        while (atual != null) {
            System.out.println("ID Cliente: " + atual.elemento.id + " | Nome: " + atual.elemento.nomeCliente + " | Motivo: " + atual.elemento.descricao);
            atual = atual.proximo;
        }
    }
}
