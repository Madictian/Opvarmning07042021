package businessLogic;

import java.util.Date;

public class Nyhedsindslag {
    private String overskrift = "";
    private String teaserText = "";
    private String linkVideo = "";
    private String linkBillede = "";
    private Date udgivelseDato;
    private String dato;
    private boolean udgivet;
    private boolean slettet;




    public Nyhedsindslag(String overskrift, String teaserText, String linkVideo, String linkBillede, boolean udgivet, boolean slettet) {
        this.overskrift = overskrift;
        this.teaserText = teaserText;
        this.linkVideo = linkVideo;
        this.linkBillede = linkBillede;
        this.dato = new Date().toString();
        this.udgivet = udgivet;
        this.slettet = slettet;
    }

    public Date getUdgivelseDato() {
        return udgivelseDato;
    }
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }
    public boolean isUdgivet() {
        return udgivet;
    }

    public void setUdgivet(boolean udgivet) {
        this.udgivet = udgivet;
    }

    public String getOverskrift() {
        return overskrift;
    }

    public void setOverskrift(String overskrift) {
        this.overskrift = overskrift;
    }

    public String getTeaserText() {
        return teaserText;
    }

    public void setTeaserText(String teaserText) {
        this.teaserText = teaserText;
    }

    public String getLinkVideo() {
        return linkVideo;
    }

    public void setLinkVideo(String linkVideo) {
        this.linkVideo = linkVideo;
    }

    public String getLinkBillede() {
        return linkBillede;
    }

    public void setLinkBillede(String linkBillede) {
        this.linkBillede = linkBillede;
    }

    public boolean isSlettet() {
        return slettet;
    }

    public void setSlettet(boolean slettet) {
        this.slettet = slettet;
    }

}
