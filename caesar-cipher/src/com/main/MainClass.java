package com.main;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Please enter text to encrypt: ");
			String textToEncrypt = scanner.next();
			System.out.print("Please enter shift: ");
			int shift = scanner.nextInt();
			CaesarCipher caesarCipher = new CaesarCipher();
			String encryptedText = caesarCipher.encrypt(textToEncrypt, shift);
			System.out.println("Encrypted text: " + encryptedText);
			System.out.println("Decrypted text: " + caesarCipher.decrypt(encryptedText, shift));
		} catch (Exception e) {
			System.out.print("Something went wrong");
			e.printStackTrace();
		}

	}
}
