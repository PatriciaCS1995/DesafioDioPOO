package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("mentoria java");
		mentoria1.setDescricao("descrição mentoria java");
		mentoria1.setData(LocalDate.now());
		
		/*
		 * System.out.println("curso: " + curso1);
		 * System.out.println("curso: " + curso2);
		 * System.out.println("curso: " + mentoria1);
	     */
		
		BootCamp bootCamp = new BootCamp();
		bootCamp.setNome("Bootcamp Java Developer");
		bootCamp.setDescricao("Descrição Bootcamp Java Developer");
		bootCamp.getConteudos().add(curso1);
		bootCamp.getConteudos().add(curso2);
		bootCamp.getConteudos().add(mentoria1);
		
		Dev devPati = new Dev();
		devPati.setNome("Patricia");
		devPati.inscreverBootcampo(bootCamp);
		System.out.println("Contéudos Inscritos Patricia: " + devPati.getConteudosInscritos());
		devPati.progredir();
		devPati.progredir();
		System.out.println("--------------------------");
		System.out.println("Contéudos Inscritos Patricia: " + devPati.getConteudosInscritos());
		System.out.println("Contéudos Concluidos Patricia: " + devPati.getConteudosConcluidos());
		System.out.println("XP: " + devPati.calcularTotalXp());
		
		System.out.println("--------------------------");
		
		Dev devLeo = new Dev();
		devLeo.setNome("Leonardo");
		devLeo.inscreverBootcampo(bootCamp);
		System.out.println("Contéudos Inscritos Leonardo: " + devLeo.getConteudosInscritos());
		devLeo.progredir();
		devLeo.progredir();
		devLeo.progredir();
		System.out.println("--------------------------");
		System.out.println("Contéudos Inscritos Leonardo: " + devLeo.getConteudosInscritos());
		System.out.println("Contéudos Inscritos Lenardo: " + devLeo.getConteudosConcluidos());
		System.out.println("XP: " + devLeo.calcularTotalXp());
		
	}

}
