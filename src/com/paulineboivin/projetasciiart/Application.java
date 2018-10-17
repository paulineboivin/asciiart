package com.paulineboivin.projetasciiart;

import com.paulineboivin.projetasciiart.alphabet.Alphabet2;
import com.paulineboivin.projetasciiart.alphabet.CodingameAlphabet;
import com.paulineboivin.projetasciiart.manager.AsciiManager;
import com.paulineboivin.projetasciiart.utils.ScannerProvider;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        AsciiManager ascii = new AsciiManager(new Alphabet2());
        System.out.println(ascii.getAsciiTranslation(ScannerProvider.getInstance().getScanner().nextLine()));
	}
}