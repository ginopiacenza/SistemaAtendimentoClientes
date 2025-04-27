public class Pilha {
    private Node topo;

    public Pilha() {
        this.topo = null;
    }

    public boolean estaVazia() {
        return topo == null;
    }

    public void empilhar(Elemento elemento) {
        Node novoNode = new Node(elemento);
        novoNode.proximo = topo;
        topo = novoNode;
    }

    public Elemento desempilhar() throws Exception {
        if (estaVazia()) {
            throw new Exception("A pilha está vazia!");
        }
        Elemento elemento = topo.elemento;
        topo = topo.proximo;
        return elemento;
    }

    public void exibirPilha() {
        Node atual = topo;
        while (atual != null) {
            System.out.println("ID: " + atual.elemento.id + " | Descrição: " + atual.elemento.descricao + " | DataHora: " + atual.elemento.dataHora);
            atual = atual.proximo;
        }
    }
}
