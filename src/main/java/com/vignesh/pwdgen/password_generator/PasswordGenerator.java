package com.vignesh.pwdgen.password_generator;

import java.util.Random;

public class PasswordGenerator {
    String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lowerCase = "abcdefghijklmnopqrstuvwxyz";
    String number = "1234567890";
    String symbol = "!@#$%^&*()_+-=";
    String content = "";

    int length;
    boolean u, l, n, s;

    public PasswordGenerator(int length, boolean u, boolean l, boolean n, boolean s) {
        this.length = length;
        this.u = u;
        this.l = l;
        this.n = n;
        this.s = s;
    }

    public String generatePassword() {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();

        if (u) content += upperCase;
        if (l) content += lowerCase;
        if (n) content += number;
        if (s) content += symbol;

        for (int i = 0; i < length; i++) {
            sb.append(content.charAt(r.nextInt(content.length())));

        }
        return sb.toString();

    }
}
