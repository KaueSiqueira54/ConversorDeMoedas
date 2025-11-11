public class ConversorMoedas {

    private final MoedasConversao.ConversionRates rates;

    public ConversorMoedas(MoedasConversao.ConversionRates rates) {
        this.rates = rates;
    }

    public double Converter(String origem, String destino, double valor) {
        double taxaOrigem = getTaxa(origem);
        double taxaDestino = getTaxa(destino);

        if(taxaOrigem == 0 ||taxaDestino == 0 || valor <= 0) {
            throw new IllegalArgumentException("Erro: O valor digitado não foi aceito!");
        }

        return (valor / taxaOrigem) * taxaDestino;
    }

    private double getTaxa(String codigo) {
        switch (codigo.toUpperCase()) {
            case "USD": return rates.getUSD();
            case "ARS": return rates.getARS();
            case "COP": return rates.getCOP();
            case "BRL": return rates.getBRL();
            default: return 0;
        }
    }
}
