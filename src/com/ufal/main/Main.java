package com.ufal.main;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class Main {
	
	public void createPDF() {
		String fileName = JOptionPane.showInputDialog("Nome do arquivo");
		String pathFile = "/home/alunos/Documentos/francisco/aula/es-aula-1103/" + fileName;
		
		Document document = new Document();
		
		try {
			PdfWriter.getInstance(document,
					new FileOutputStream(pathFile + ".pdf"));
			document.open();
			document.add(new Paragraph("Exemplo simples!"));
			document.close();
			JOptionPane.showMessageDialog(null, "Arquivo salvo");
		} catch (DocumentException de) {
			System.err.println(de.getMessage());
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.createPDF();
	}
}
