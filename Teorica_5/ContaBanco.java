package Teorica_5;

public class ContaBanco {
// atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
// metodos
    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "CC") {
            this.setSaldo(50);
        } else if (tipo == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinherio! " + "R$" + this.getSaldo());
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito! " + "R$" + this.getSaldo());
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float valor) {
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado com sucesso!");
        } else {
            System.out.println("Impossivel depositar!");
        }
    }
    
    public void sacar(float valor) {
        if (this.getStatus() == true) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo Insuficiente!");
            }
        } else {
            System.out.println("Impossivel sacar!");
        }
    }
    
    public void pagarMensal() {
        int num = 0;
        if (this.getTipo() == "CC") {
            num = 12;
        } else if (this.getTipo() == "CP") {
            num = 20;
        }
        
        if (this.getStatus() == true) {
            if (this.getSaldo() > num) {
                this.setSaldo(this.getSaldo() - num);
                System.out.println("Mensalidade paga com sucesso!");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossivel pagar!");
        }
        
    }

// metodos especiais
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    public int getNumConta() {
        return this.numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        if (tipo == "CC") {
            this.tipo = "Conta Corrente";
        } else if (tipo == "CP") {
            this.tipo = "Conta Poupança";
        }
    }

    public String getDono() {
        return this.dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Boolean getStatus() {
        return this.status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }

// mostrar resultados
    public void estadoAtual() {
        System.out.println("------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
}
