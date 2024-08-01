package iftm.edu.br.entregas.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Pacote {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String idPacote;
    private String destinatario;
    
    @ManyToOne
    private Endereco endereco;

    private String status;


    @OneToMany(mappedBy = "pacote",cascade = CascadeType.ALL)
    private List<Rastreamento> rastreamentos = new ArrayList<>();

    public void atualizarStatus(String novoStatus, Date dataHora, String localizacao) {
        this.status = novoStatus;
        this.rastreamentos.add(new Rastreamento(novoStatus, dataHora, localizacao));
    }

    public String consultarInformacoes(){
        StringBuilder info = new StringBuilder();
        info.append("Destinatário: ").append(destinatario).append("\n")
            .append("Endereço: ").append(endereco.getEnderecoCompleto()).append("\n")
            .append("Status: ").append(status).append("\n")
            .append("Rastreamento: \n");
        rastreamentos.forEach(r -> info.append(r.getResumo()).append("\n"));
        return info.toString();
    }

}
