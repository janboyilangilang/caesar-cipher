package com.main;

public class CaesarCipher {
	public String encrypt(String textToEncrypt, int shift) {
		char[] textToEncryptCharArray = textToEncrypt.toCharArray();
		for (int i = 0; i < textToEncryptCharArray.length; i++) {
			char currentChar = textToEncryptCharArray[i];
			if(Character.isUpperCase(currentChar)) {
				currentChar += (shift % 26);
				if(currentChar > 90) {
					currentChar -= 26;
				}
			} else if (Character.isLowerCase(currentChar)) {
				currentChar += (shift % 26);
				if(currentChar > 122) {
					currentChar -= 26;
				}
			}
			textToEncryptCharArray[i] = currentChar;
		}
		return String.valueOf(textToEncryptCharArray);
	}
	
	public String decrypt(String textToDecrypt, int shift) {
		char[] textToDecryptCharArray = textToDecrypt.toCharArray();
		for (int i = 0; i < textToDecryptCharArray.length; i++) {
			char currentChar = textToDecryptCharArray[i];
			if(Character.isUpperCase(currentChar)) {
				currentChar -= (shift % 26);
				if(currentChar < 65) {
					currentChar += 26;
				}
			} else if (Character.isLowerCase(currentChar)) {
				currentChar -= (shift % 26);
				if(currentChar < 97) {
					currentChar += 26;
				}
			}
			textToDecryptCharArray[i] = currentChar;
		}
		return String.valueOf(textToDecryptCharArray);
	}
}
