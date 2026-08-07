class Solution {
    public String maskPII(String s) {
        if (s.indexOf('@') != -1) {
            s = s.toLowerCase();
            int atIndex = s.indexOf('@');
            return s.charAt(0) + "*****" + s.charAt(atIndex - 1) + s.substring(atIndex);
        } else {
            String digits = s.replaceAll("\\D", "");
            String local = "***-***-" + digits.substring(digits.length() - 4);
            int countryDigits = digits.length() - 10;
            if (countryDigits == 0) return local;
            if (countryDigits == 1) return "+*-" + local;
            if (countryDigits == 2) return "+**-" + local;
            return "+***-" + local;
        }
    }
}