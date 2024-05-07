public class Moeda {
    private String nomeMoedaAConverter;
    private double valorAconverter;
    private String nomeMoedaConvertida;
    private double valorCovertido;

    public Moeda(String nomeMoedaAConverter, double valorAconverter, String nomeMoedaConvertida, double valorCovertido) {
        this.nomeMoedaAConverter = nomeMoedaAConverter;
        this.valorAconverter = valorAconverter;
        this.nomeMoedaConvertida = nomeMoedaConvertida;
        this.valorCovertido = valorCovertido;
    }

    public Moeda(MoedasRecord moedasRecord) {
        this.nomeMoedaAConverter = moedasRecord.base_code();
        this.nomeMoedaConvertida = moedasRecord.target_code();
        this.valorCovertido = moedasRecord.conversion_result();}

    public void setValorAconverter(double valorAconverter) {
        this.valorAconverter = valorAconverter;
    }

    @Override
    public String toString() {
        return "Valor "+ valorAconverter + "[" + nomeMoedaAConverter + "] corresponde ao valor de " + valorCovertido + "["+ nomeMoedaConvertida + "]";
    }
}
