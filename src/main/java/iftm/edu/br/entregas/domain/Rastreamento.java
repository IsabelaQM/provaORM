package iftm.edu.br.entregas.domain;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Rastreamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;
    private Date dataHora;
    private String localizacao;

    @ManyToOne
    @JoinColumn(name = "pacote_id")
    private Pacote pacote;

    public String getResumo() {
        return status + " - " + dataHora + " - " + localizacao;
    }

    public Rastreamento(String novoStatus, Date dataHora, String localizacao) {
        this.status = novoStatus;
        this.dataHora = dataHora;
        this.localizacao = localizacao;
    }

}
