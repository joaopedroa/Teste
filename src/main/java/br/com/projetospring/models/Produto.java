package br.com.projetospring.models;

import java.util.Calendar;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
		
		@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		
		private String titulo;
		private String descricao;
		private int paginas;
		
		@ElementCollection
		private List<Precos> precos;
		
		private Calendar dataLancamento;
		
		public Calendar getDataLancamento() {
			return dataLancamento;
		}
		public void setDataLancamento(Calendar dataLancamento) {
			this.dataLancamento = dataLancamento;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public List<Precos> getPrecos() {
			return precos;
		}
		public void setPrecos(List<Precos> precos) {
			this.precos = precos;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public int getPaginas() {
			return paginas;
		}
		public void setPaginas(int paginas) {
			this.paginas = paginas;
		}
		
		@Override
		public String toString() {
			return "Produto [titulo=" + titulo + ", descricao=" + descricao + ", paginas=" + paginas + "]";
		}
		
		
		
		
		
}
