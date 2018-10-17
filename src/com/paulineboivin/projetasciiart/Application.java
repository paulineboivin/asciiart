package com.paulineboivin.projetasciiart;

import com.paulineboivin.projetasciiart.alphabet.CodingameAlphabet;
import com.paulineboivin.projetasciiart.manager.AsciiManager;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        AsciiManager ascii = new AsciiManager(new CodingameAlphabet());
        System.out.println(ascii.getAsciiTranslation("type something"));
	}
}