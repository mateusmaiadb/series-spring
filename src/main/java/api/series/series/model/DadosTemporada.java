package api.series.series.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosTemporada(@JsonAlias("Season") String numeroTemporada,
                             @JsonAlias("Episodes") List<DadosEpisodio> episodios) {


}
