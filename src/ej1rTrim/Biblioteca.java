package ej1rTrim;

public class Biblioteca {
    private String mes;
    private int cp;
    private String tit;
    private byte nc;
    private int tot;

    private int tasa;
    public Biblioteca(String mes, int cp, String tit, byte nc, int tot) {
        this.mes = mes;
        this.cp = cp;
        this.tit = tit;
        this.nc = nc;
        this.tot = tot;
    }

    public String getMes() {
        return mes;
    }

    public int getCp() {
        return cp;
    }

    public String getTit() {
        return tit;
    }

    public byte getNc() {
        return nc;
    }

    public int getTot() {
        return tot;
    }

    public int getTasa() {
        return tasa;
    }

    public void setTasa(int tasa) {
        this.tasa = (nc * 100)/tot;
    }
}
