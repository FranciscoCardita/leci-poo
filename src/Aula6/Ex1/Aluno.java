package Aula6.Ex1;

import java.time.LocalDate;

import Aula5.Date;

public class Aluno extends Pessoa {

    private static int nMecCnt = 100;
    private final int nMec;
    private Date iDataInsc;

    public Aluno(String iNome, int iBI, Date iDataNasc, Date iDataInsc) {
        super(iNome, iBI, iDataNasc);
        this.nMec = nMecCnt++;
        this.iDataInsc = iDataInsc;
    }
    
    public Aluno(String iNome, int iBI, Date iDataNasc) {
        super(iNome, iBI, iDataNasc);
        this.nMec = nMecCnt++;
        this.iDataInsc = getLocalDate();
    }

    public int getNMec() { return nMec; }

    public Date getDataInsc() { return iDataInsc; }

    public void setDataInsc(Date iDataInsc) { this.iDataInsc = iDataInsc; }

    @Override public String toString() { return "nMec: " + nMec + "; Data de Inscricao: " + iDataInsc; }

    private Date getLocalDate() {
        LocalDate localDate = LocalDate.now();
        return new Date(localDate.getDayOfMonth(), localDate.getMonthValue(), localDate.getYear());
    }
}
