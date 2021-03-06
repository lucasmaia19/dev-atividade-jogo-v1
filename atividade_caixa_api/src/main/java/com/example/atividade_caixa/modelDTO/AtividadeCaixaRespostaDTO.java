package com.example.atividade_caixa.modelDTO;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AtividadeCaixaRespostaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String respostaATxt;
	
	private String respostaAUrl;

	public String getRespostaATxt() {
		return respostaATxt;
	}

	public void setRespostaATxt(String respostaATxt) {
		this.respostaATxt = respostaATxt;
	}

	public String getRespostaAUrl() {
		return respostaAUrl;
	}

	public void setRespostaAUrl(String respostaAUrl) {
		this.respostaAUrl = respostaAUrl;
	}


	/*
	@Lob
	private byte[] resposta_a_img;

	private Boolean resposta_correta;

	@OneToMany(mappedBy = "atividadeCaixaRespostaA")
	private List<AtividadeCaixa> atividadeCaixa = new ArrayList<>();
	*/

}
