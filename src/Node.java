public class Node {
    private int informacao;
    private Node filhoEsquerdo;
    private Node filhoDireito;
    public Node(int informacao) {
        this.informacao = informacao;
        this.filhoEsquerdo = null;
        this.filhoDireito = null;
    }

    public int getInformacao() {
        return informacao;
    }
    public void setInformacao(int informacao) {
        this.informacao = informacao;
    }

    public Node getFilhoEsquerdo() {
        return filhoEsquerdo;
    }
    public void setFilhoEsquerdo(Node filhoEsquerdo) {
        this.filhoEsquerdo = filhoEsquerdo;
    }

    public Node getFilhoDireito() {
        return filhoDireito;
    }
    public void setFilhoDireito(Node filhoDireito) {
        this.filhoDireito = filhoDireito;
    }


    public void inserir(int informacao) {
        if (informacao < this.informacao) {
            if (filhoEsquerdo != null) {
                filhoEsquerdo.inserir(informacao);
            } else {
                filhoEsquerdo = new Node(informacao);
            }
        } else {
            if (filhoDireito != null) {
                filhoDireito.inserir(informacao);
            } else {
                filhoDireito = new Node(informacao);
            }
        }
    }

    public void imprimir(int altura, String pos) {
        for (int i = 0; i < altura; i++) {
            System.out.print("-");
        }
        if (pos == null) {
            System.out.print("R ");
        } else {
            System.out.print(pos);
        }

        System.out.println(informacao);
        if (filhoEsquerdo != null) {
            filhoEsquerdo.imprimir(altura+1, "E ");
        }
        if (filhoDireito != null) {
            filhoDireito.imprimir(altura+1, "D ");
        }
    }


    public void percorrerPreordem() {
        // print raiz
        // ir para esquerda
        // ir para direita
        System.out.println(informacao);
        if (filhoEsquerdo != null) {
            filhoEsquerdo.percorrerPreordem();
        }
        if (filhoDireito != null) {
            filhoDireito.percorrerPreordem();
        }
    }

    public void percorrerInordem() {
        // ir para esquerda
        // print raiz
        // ir para direita
        if (filhoEsquerdo != null) {
            filhoEsquerdo.percorrerInordem();
        }
        System.out.println(informacao);
        if (filhoDireito != null) {
            filhoDireito.percorrerInordem();
        }
    }

    public void percorrerPosordem() {
        // ir para esquerda
        // ir para direita
        // print raiz
        if (filhoEsquerdo != null) {
            filhoEsquerdo.percorrerPosordem();
        }
        if (filhoDireito != null) {
            filhoDireito.percorrerPosordem();
        }
        System.out.println(informacao);
    }


    public Node removerMaior() {
        if (filhoDireito == null) {
            return filhoEsquerdo;
        } else {
            filhoDireito = filhoDireito.removerMaior();
            return this;
        }
    }


    public int removerMenor() {
        if (filhoEsquerdo == null) {
            return 1;
        } else {
            if (filhoEsquerdo.removerMenor() == 1) {
                filhoEsquerdo = filhoEsquerdo.filhoDireito;
            }
            return 0;
        }
    }
}