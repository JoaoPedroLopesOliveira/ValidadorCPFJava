public class ValidadorCPF {
    public boolean validarCPF(String cpf){
        if (cpf == null || cpf.length()!=11 ||cpf.matches("(\\d)\\1{10}")){
            return false;
        }

        int [] numerosCpf = new int[11];

        for (int i = 0; i < cpf.length(); i++) {
            numerosCpf[i] = Character.getNumericValue(cpf.charAt(i));
        }

        int soma1= 0;
        for (int i = 0; i < 9; i++) {
            soma1+= numerosCpf[i] * ( 10 - i);
        }

        int resto1= soma1 % 11;
        int digito1 = (resto1 < 2) ? 0 : 11-resto1;

        int soma2= 0;
        for (int i = 0; i < 10; i++) {
            soma2+= numerosCpf[i] * ( 11 - i);
        }
        int resto2 = soma2%11;
        int digito2 = (resto2 < 2) ? 0 : 11-resto2;

        return numerosCpf[9] == digito1 && numerosCpf[10] == digito2;
    }
}
