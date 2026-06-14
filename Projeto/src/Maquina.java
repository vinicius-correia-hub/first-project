public class Maquina {

    private int id;
    private String modelo;
    private String cliente;
    private String logo;

    private int quantidadeImpressoes;

    private boolean status;


    public Maquina (int id, String modelo, String cliente, String logo, int quantidadeImpressoes, boolean status){
        this.id = id;
        this.modelo = modelo;
        this.cliente = cliente;
        this.logo = logo;
        this.quantidadeImpressoes = quantidadeImpressoes;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getQuantidadeImpressoes() {
        return quantidadeImpressoes;
    }

    public void setQuantidadeImpressoes(int quantidadeImpressoes) {
        this.quantidadeImpressoes = quantidadeImpressoes;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }





}


