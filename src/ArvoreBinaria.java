public class ArvoreBinaria {
    private Node raiz;
    public ArvoreBinaria() {
        raiz = null;
    }

    public Node getRaiz() {
        return raiz;
    }

    public void inserir(int informacao) {
        if (raiz != null) {
            raiz.inserir(informacao);
        } else {
            raiz = new Node(informacao);
        }
    }

    public void imprimir(int altura, String pos) {
        System.out.println("----- ARVORE -----");
        raiz.imprimir(0, null);
    }

    public void percorrerPreordem() {
        if (!vazia()) {
            raiz.percorrerPreordem();
        }
    }

    public void percorrerInordem() {
        if (!vazia()) {
            raiz.percorrerInordem();
        }
    }

    public void percorrerPosordem() {
        if (!vazia()) {
            raiz.percorrerPosordem();
        }
    }

    public void removerMaior() {
        if (!vazia()) {
            if (raiz.getFilhoDireito() == null) {
                raiz = raiz.getFilhoEsquerdo();
            } else {
                raiz.removerMaior();
            }
            if (!vazia()) {
                imprimir(0, null);
            }
        }
    }

    public void removerMenor() {
        if (!vazia()) {
            if (raiz.getFilhoEsquerdo() == null) {
                raiz = raiz.getFilhoDireito();
            } else {
                raiz.removerMenor();
            }
        }
        if (!vazia()) {
            imprimir(0, null);
        }
    }

    public boolean vazia() {
        if (raiz == null){
            System.out.println("Arvore vazia!!");
            return true;
        } else {
            return false;
        }
    }
}
